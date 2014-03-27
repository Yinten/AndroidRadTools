/*
Copyright 2011 Ryan Mattison

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/ 


package fastandroiddeclarations.popup.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLManager {

	private ArrayList<XMLLayoutNode> retVal = new ArrayList<XMLLayoutNode>();

	public String getSource() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("/**********DECLARES*************/\n");
		/* Declares */
		for (XMLLayoutNode ln : retVal) {
			sb.append("private " + ln.getType() + " " + ln.getId() + ";\n");
		}

		sb.append("/**********INITIALIZES*************/\n");
		/* Initializes */
		for (XMLLayoutNode ln : retVal) {
			sb.append(ln.getId() + " = (" + ln.getType() + ") findViewById(R.id." + ln.getId() + ");\n");
		}
		
		sb.append("/* Please visit http://www.ryangmattison.com for updates */");
		
		return sb.toString(); 

	}

	public void parseFileXML(IFile file) throws ParserConfigurationException, SAXException, IOException, CoreException {

			parseInputStream(file.getContents()); 


	}

	public void parseFileXML(String filePath) throws ParserConfigurationException, SAXException, IOException {

			FileInputStream fis = new FileInputStream(filePath);
			parseInputStream(fis);
	}
	
	public void parseInputStream(InputStream is) throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		// Using factory get an instance of document builder
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document dom = db.parse(is);
		Element el = dom.getDocumentElement();
		System.out.println(el.getTagName() + " : " + el.getAttribute("android:id"));
		recursivePrint(el, 1);	
	}

	private void recursivePrint(Element docEle, int indent) {

		String indentSize = "";
		String spacerIndentSize = "  ";
		for (int ii = 0; ii < indent; ii++) {
			indentSize += spacerIndentSize;
		}

		if (docEle.hasChildNodes()) {
			NodeList nl = docEle.getChildNodes();

			if (nl != null && nl.getLength() > 0) {
				for (int i = 0; i < nl.getLength(); i++) {

					// get the employee element
					if (nl.item(i) instanceof Element) {
						Element el = (Element) nl.item(i);
						if (el.hasAttribute("android:id")) {
							String id = el.getAttribute("android:id");
							String type = el.getTagName();
							if (type != null && !type.equalsIgnoreCase("") && id != null && !id.equalsIgnoreCase("")) {
								if (id.contains("@+id/")) {
									id = id.replace("@+id/", "");
									XMLLayoutNode xmlLayoutNode = new XMLLayoutNode(type, id);
									retVal.add(xmlLayoutNode);

									System.out.println(indentSize + type + " : " + id);
								}
							}
						}
						recursivePrint(el, indent++);
					}
				}
			}
		}
	}

}

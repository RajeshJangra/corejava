package com.xebia.training;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.xebia.training.Contact.*;





public class ContactInput implements Callable<List<Contact>>{
	int id;
	Contact contact=null;
	List <Contact> employeecontactList=new ArrayList<Contact>();
	public static final String  in="C:/Users/adarshgupta/GIT/corejava/employeeApp/src/main/java/com/xebia/xmlfiles/employeeContact.xml";
	
	
	public ContactInput(int id) {
		super();
		this.id = id;
	}

	public List<Contact> call() throws Exception {
		File file=new File(in);
		int id1,pincode,phone;
		String houseno,street,area,city,state,landmark,email;
		AddressType addresstype;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc =   dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		NodeList nList = doc.getElementsByTagName("contact");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				id1 = Integer.parseInt(eElement.getAttribute("id"));
				houseno=eElement.getElementsByTagName("houseno").item(0).getTextContent();
				street=eElement.getElementsByTagName("street").item(0).getTextContent();
				area=eElement.getElementsByTagName("area").item(0).getTextContent();
				city=eElement.getElementsByTagName("city").item(0).getTextContent();
				pincode=Integer.parseInt(eElement.getElementsByTagName("pincode").item(0).getTextContent());
				state=eElement.getElementsByTagName("state").item(0).getTextContent();
				landmark=eElement.getElementsByTagName("landmark").item(0).getTextContent();
				phone=Integer.parseInt(eElement.getElementsByTagName("phone").item(0).getTextContent());
				email=eElement.getElementsByTagName("email").item(0).getTextContent();
				addresstype=AddressType.valueOf(eElement.getElementsByTagName("AddressType").item(0).getTextContent());
				contact=new Contact(id1,houseno,street,area,city,pincode,state,landmark,phone,email,addresstype);
				employeecontactList.add(contact);
				
				
			} else {
				break;
			}
		}
		return employeecontactList;
	}

}

/*
FileReader in=new FileReader("e:/contact.txt");
		BufferedReader br=new BufferedReader(in);
		String line=null;
		int id1;
		while((line=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(line,",");
			while(st.hasMoreTokens())
			{
				id1=Integer.parseInt(st.nextToken(","));
				contact=new Contact(id1,st.nextToken(","),st.nextToken(","),st.nextToken(","),st.nextToken(","),
						Integer.parseInt(st.nextToken(",")),st.nextToken(","),st.nextToken(","),Integer.parseInt(st.nextToken(",")),st.nextToken(","),
						AddressType.valueOf(st.nextToken()));
				if(id==id1){
					employeecontactList.add(contact);
				}else{
					continue;
				}
			}
		}
		for(Contact contactinput:employeecontactList){
			System.out.println(contactinput);
		}
		br.close();

*/
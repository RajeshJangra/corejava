package com.xebia.training.Classes;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import com.xebia.training.DataFiles.EmployeeData;

public class EmployeeApplication {
	public static void main(String args[]) throws ParseException,
			NumberFormatException, IOException, InterruptedException, ExecutionException, ParserConfigurationException, SAXException, DOMException, TransformerException {

		EmployeeData employee = new EmployeeData();
		employee.setValues();
		



		
	}

}

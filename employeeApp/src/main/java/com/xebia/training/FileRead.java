package com.xebia.training;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileRead {

	public List<String> getData(String address) {
			List<String> list=new ArrayList<String>();
		BufferedReader br = null;
	
		try {

			String line;

			br = new BufferedReader(new FileReader(address));

			while ((line = br.readLine()) != null) {
				 StringTokenizer st = new StringTokenizer(line,",");  
			     while (st.hasMoreTokens()) {  
			         list.add(st.nextToken());  
			       
			}
			

		}
		}catch (IOException e) {
			e.printStackTrace();
		} 
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
}
		
	}

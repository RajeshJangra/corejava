package com.xebia.training.EndDateInfo;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import com.xebia.training.EmployeeEntities.Employee;
import com.xebia.training.EmployeeEntities.Project;
import com.xebia.training.EmployeeXMLReader.ProjectData;

public class EndDateSetup {
	public int id;
	public int projectId;

	public EndDateSetup(int id, int projectId) {
		super();
		this.id = id;
		this.projectId = projectId;
	}

	public void setDate(Employee employee) throws InterruptedException,
			ExecutionException, DOMException, ParserConfigurationException, SAXException, IOException, ParseException, TransformerException {
		
		
		
		

		ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors
				.newFixedThreadPool(100);

		ProjectData projectData = new ProjectData(id);
		
		Future<List<Project>> futureTask = executor1.submit(projectData);
		List<Project> project = futureTask.get();

		for (Project p : project) {
			int pId = (int) p.getProjectId();
			if (pId == projectId) {

				if (p.getEndDate() == null) {
					
					p.setEndDate(new Date());
					ProjectAbstractData abc = new ProjectAbstractData(id, projectId);
					abc.projectData();
					

				} else {
					System.out.println("u r not a part of this project..:)");
				}
			}
		}
		
		

		employee.setProject(project);
		System.out.println(employee);

	}

}

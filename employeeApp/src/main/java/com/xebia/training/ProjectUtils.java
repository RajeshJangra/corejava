package com.xebia.training;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings({ "restriction", "rawtypes" })
public class ProjectUtils implements Callable{
	private int id;
	
	public ProjectUtils(int id) {
			this.id = id;
	}

	public List<Project> call() throws JAXBException {
		 File file = new File("projects.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Projects.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Projects projects = (Projects) jaxbUnmarshaller.unmarshal(file);
			List<Project> projectList=projects.getProjects();
			List<Project> pList=new ArrayList<Project>();
			for(Project project:projectList){
				if(project.getId()==id)
					pList.add(project);
			}
			return pList;
	}

}

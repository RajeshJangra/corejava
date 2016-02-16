package com.xebia.training;

import java.util.List;

import javax.xml.bind.annotation.*;
@SuppressWarnings("restriction")
@XmlRootElement
public class Projects {
 private List<Project> projects;

 public Projects() {
	
}
 
 public Projects(List<Project> projects) {
	super();
	this.projects = projects;
}

@XmlElement(name = "Project")
public List<Project> getProjects() {
	return projects;
}

public void setProjects(List<Project> projects) {
	this.projects = projects;
}

@Override
public String toString() {
	return "Projects [projects=" + projects + "]";
}
 
}

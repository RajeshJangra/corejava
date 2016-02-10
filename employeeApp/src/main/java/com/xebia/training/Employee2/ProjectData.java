package com.xebia.training.Employee2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.xebia.training.Employee1.Project;

public class ProjectData implements Callable<List<Project>> {
	private static final String input = "/home/raggarwal/Project.txt";
	int EmployeeID;
	double projectId;
	String name;
	Date endDate;
	Date startDate;
	private int id;

	public ProjectData(int id) {
		super();
		this.id = id;
	}


	@Override
	public List<Project> call() throws Exception {
	
		List<Project> list = new ArrayList<Project>();

		File file = new File(input);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			StringTokenizer stringTokenizer = new StringTokenizer(line, ",");

			while (stringTokenizer.hasMoreElements()) {
				String temp = stringTokenizer.nextToken(",");

				EmployeeID = Integer.parseInt(temp);
				if (EmployeeID == id) {
					projectId = Double.parseDouble(stringTokenizer
							.nextToken(","));
					name = stringTokenizer.nextToken(",");
					startDate = new SimpleDateFormat("dd-MM-yyyy")
							.parse(stringTokenizer.nextToken(","));
					endDate = null;
					Project project1 = new Project(id, projectId, name,
							startDate, endDate);

					list.add(project1);

				} else {
					break;
				}

			}

		}
		return list;

	}
}

package Employeefile;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class ProjectInput implements Callable {
	private static final String infile = "E:/project.txt";
	int EmployeeID,id;
	double projectId;
	String name;
	Date endDate;
	Date startDate;

	


	public ProjectInput(int id) {
		super();
		this.id = id;
	}




	@SuppressWarnings("resource")
	public List<Project> call() throws IOException, ParseException {
		List<Project> list = new ArrayList<Project>();

		File file = new File(infile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
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

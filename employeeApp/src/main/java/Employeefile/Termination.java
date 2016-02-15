package Employeefile;

import java.util.List;
import java.util.Map;

public class Termination {

	Map<Integer, Employee> terminate(Map<Integer, Employee> map,int id1)
	{
		Employee employee=map.get(110);
		List<Project> projects=employee.getProjectData();
		for(Project project: projects)
		{
			if(project.projectId==id1)
			{
					if(project.getEndDate()==null)
					{
						project.setEndDate();
					}
			}
			
		}
	return map;
	}
	
	
}

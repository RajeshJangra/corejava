package Employeefile;

import java.util.List;
import java.util.Map;

public class Termination {

	public Map<Integer, Employee> terminate(Map<Integer, Employee> map,int id1,int id)
	{
		Employee employee=map.get(id);
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
			else
			{
				System.out.println("No project of entered ID is assigned");
			}	
			
		}
		return map;
		
	}
	
	
}

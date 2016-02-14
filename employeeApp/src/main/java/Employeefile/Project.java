package Employeefile;

import java.util.Date;

public class Project {
		int id;
		private double projectId;
		private String name;
		private Date endDate;
		private Date startDate; 
		
		public Project()
		{
			
		}
		
		public Project(int id,double projectId, String name, Date startDate,
				Date endDate) {
			super();
			this.id = id;
			this.projectId = projectId;
			this.name = name;
			this.startDate = startDate;
			this.endDate = endDate;
		}
		

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Project other = (Project) obj;
			if (endDate == null) {
				if (other.endDate != null)
					return false;
			} else if (!endDate.equals(other.endDate))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(projectId) != Double
					.doubleToLongBits(other.projectId))
				return false;
			if (startDate == null) {
				if (other.startDate != null)
					return false;
			} else if (!startDate.equals(other.startDate))
				return false;
			return true;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getProjectId() {
			return projectId;
		}

		public void setProjectId(double projectId) {
			this.projectId = projectId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate() {
			this.endDate =new Date();
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public String toString() {
			return " [ProjectId=" + projectId + ", Name=" + name
					+ ", StartDate=" + startDate + ", EndDate=" + endDate + "]";
		}

	}




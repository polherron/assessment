package com.assessment.paul;

public class Department {
	int departmentID;
	String departmentName;
	int numberOfEmployees;

	/**
		 * 
		 */
		public Department() {
			super();
		}

	/**
		 * @param departmentID
		 * @param departmentName
		 * @param numberOfEmployees
		 */
		public Department(int departmentID, String departmentName, int numberOfEmployees) {
			super();
			this.departmentID = departmentID;
			this.departmentName = departmentName;
			this.numberOfEmployees = numberOfEmployees;
		}

	/**
	 * @return the departmentID
	 */
	int getDepartmentID() {
		return departmentID;
	}

	/**
	 * @param departmentID the departmentID to set
	 */
	void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	/**
	 * @return the departmentName
	 */
	String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the numberOfEmployees
	 */
	int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	/**
	 * @param numberOfEmployees the numberOfEmployees to set
	 */
	void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return "Departmeent [departmentID=" + departmentID + ", departmentName=" + departmentName
				+ ", numberOfEmployees=" + numberOfEmployees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentID;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + numberOfEmployees;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentID != other.departmentID)
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (numberOfEmployees != other.numberOfEmployees)
			return false;
		return true;
	}
}

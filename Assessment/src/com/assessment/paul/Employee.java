/**
 * 
 */
package com.assessment.paul;

import java.time.LocalDate;

/**
 * @author Paul
 *
 */
public abstract class Employee {

	protected int uniqueID;
	protected Name name;
	protected Department department;
	protected LocalDate dateStarted;
	protected String phoneNumber;
	protected double monthlyPay;
	/**
	 * @param uniqueID
	 * @param name
	 * @param department
	 * @param dateStarted
	 * @param phoneNumber
	 * @param monthlyPay
	 */
	public Employee(int uniqueID, Name name, Department department, LocalDate dateStarted, String phoneNumber,
			double monthlyPay) {
		super();
		this.uniqueID = uniqueID;
		this.name = name;
		this.department = department;
		this.dateStarted = dateStarted;
		this.phoneNumber = phoneNumber;
		this.monthlyPay = monthlyPay;
	}
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [uniqueID=" + uniqueID + ", name=" + name + ", department=" + department + ", dateStarted="
				+ dateStarted + ", phoneNumber=" + phoneNumber + ", monthlyPay=" + monthlyPay + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateStarted == null) ? 0 : dateStarted.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		long temp;
		temp = Double.doubleToLongBits(monthlyPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + uniqueID;
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
		Employee other = (Employee) obj;
		if (dateStarted == null) {
			if (other.dateStarted != null)
				return false;
		} else if (!dateStarted.equals(other.dateStarted))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (Double.doubleToLongBits(monthlyPay) != Double.doubleToLongBits(other.monthlyPay))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (uniqueID != other.uniqueID)
			return false;
		return true;
	}
	
}

package com.assessment.paul;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class DepartmentTests {

	Department myDepartment = new Department(1,"Finance",3);
	
	@Test
	public void testConstructorAndGetters() {
		assertEquals(1, myDepartment.getDepartmentID());
		assertEquals("Finance", myDepartment.getDepartmentName());
		assertEquals(3, myDepartment.getNumberOfEmployees());
	}
	
	@Test
	public void testSetters() {
		myDepartment.setDepartmentID(2);
		myDepartment.setDepartmentName("Marketing");
		myDepartment.setNumberOfEmployees(4);
		
		assertEquals(2, myDepartment.getDepartmentID());
		assertEquals("Marketing", myDepartment.getDepartmentName());
		assertEquals(4, myDepartment.getNumberOfEmployees());
	}
	
	

}

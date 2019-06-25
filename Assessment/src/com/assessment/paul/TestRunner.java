package com.assessment.paul;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {
		 org.junit.runner.Result result = JUnitCore.runClasses(DepartmentTests.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }

	}

}

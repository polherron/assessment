package com.assessment.paul;

public class Name {
	private String title;
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public Name() {

	}
	
	/**
	 * @param title
	 * @param firstName
	 * @param lastName
	 */
	public Name(String title, String firstName, String lastName) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the title
	 */
	String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the firstName
	 */
	String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}

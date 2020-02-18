/**
 * 
 */
package io.arun.learning.springbootjsonresponsefilter.model;

/**
 * @author Arun Kumar
 *
 */
public class User {

	private String firstName;
	private String lastName;
	private String gender;
	private String occupation;
	private Integer salary;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstName, String lastName, String gender, String occupation, Integer salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.occupation = occupation;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", occupation="
				+ occupation + ", salary=" + salary + "]";
	}
	
}

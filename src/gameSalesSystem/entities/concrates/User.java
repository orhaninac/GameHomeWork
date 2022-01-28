package gameSalesSystem.entities.concrates;

import java.util.Date;

import gameSalesSystem.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private Date yearOfBirth;
	private String identityNumber;
	
	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, Date yearOfBirth, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	


}

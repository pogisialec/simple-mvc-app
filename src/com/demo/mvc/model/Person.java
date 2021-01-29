/**
 * 
 */
package com.demo.mvc.model;

import java.time.LocalDateTime;

/**
 * @author Alec
 *
 */
public class Person {
	
	private static Person person = null;
	
	private String name;
	private LocalDateTime birthdate;
	private char gender;
	private String address;

	private Person() { }
	
	public static Person getInstance() {
		if(person == null)
			person = new Person();
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDateTime birthdate) {
		this.birthdate = birthdate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthdate=" + birthdate + ", gender=" + gender + ", address=" + address
				+ "]";
	}

}

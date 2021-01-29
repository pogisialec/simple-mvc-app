/**
 * 
 */
package com.demo.mvc.service;

import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public interface PersonService {
	
	public Person getPerson();
	public Person savePerson(Person person);

}

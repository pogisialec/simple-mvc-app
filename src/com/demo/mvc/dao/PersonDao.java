/**
 * 
 */
package com.demo.mvc.dao;

import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public interface PersonDao {

	public Person getPerson();
	public Person savePerson(Person person);
	
}

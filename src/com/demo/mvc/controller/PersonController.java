/**
 * 
 */
package com.demo.mvc.controller;

import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public interface PersonController {
	
	public Person getPerson();
	public Person savePerson(Person person);
	
}

/**
 * 
 */
package com.demo.mvc.controller;

import java.util.logging.Logger;

import com.demo.mvc.model.Person;
import com.demo.mvc.service.PersonService;
import com.demo.mvc.service.PersonServiceImpl;

/**
 * @author Alec
 *
 */
public class PersonControllerImpl implements PersonController {

	private PersonService personService = PersonServiceImpl.getInstance();
	private static PersonController personController = null;
	
	public static PersonController getInstance() {
		if(personController == null)
			personController = new PersonControllerImpl();
		return personController;
	}
	
	@Override
	public Person getPerson() {
		return personService.getPerson();
	}

	@Override
	public Person savePerson(Person person) {
		return personService.savePerson(person);
	}

}

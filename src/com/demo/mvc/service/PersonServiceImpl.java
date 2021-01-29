/**
 * 
 */
package com.demo.mvc.service;

import java.util.logging.Logger;

import com.demo.mvc.dao.PersonDao;
import com.demo.mvc.dao.PersonDaoImpl;
import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public class PersonServiceImpl implements PersonService {
	
	private static PersonDao personDao = PersonDaoImpl.getInstance();
	private static PersonService personService = null;

	private PersonServiceImpl() {}

	public static PersonService getInstance() {
		if(personService == null)
			personService = new PersonServiceImpl();
		return personService;
	}

	@Override
	public Person getPerson() {
		return personDao.getPerson();
	}

	@Override
	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}
	
}

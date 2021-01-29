/**
 * 
 */
package com.demo.mvc.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public class PersonDaoImpl implements PersonDao {
	
	private static Logger log = Logger.getLogger(PersonDao.class.toString());
	private static PersonDao personDao = null;
	
	private PersonDaoImpl() {}
	
	public static PersonDao getInstance() {
		if(personDao == null)
			personDao = new PersonDaoImpl();
		return personDao;
	}

	@Override
	public Person getPerson() {
		log.log(Level.INFO, "Person was successfully retrieved.");
		return Person.getInstance();
	}

	@Override
	public Person savePerson(Person person) {
		log.log(Level.INFO, "Person was successfully saved.");
		Person.getInstance().setPerson(person);
		return Person.getInstance();
	}

}

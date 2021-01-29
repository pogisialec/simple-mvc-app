/**
 * 
 */
package com.demo.mvc;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.demo.mvc.controller.PersonController;
import com.demo.mvc.controller.PersonControllerImpl;
import com.demo.mvc.model.Person;

/**
 * @author Alec
 *
 */
public class MvcDemoApplication {

	private static Logger log = Logger.getLogger(MvcDemoApplication.class.toString());
	
	public static void main(String[] args) {
		
		PersonController personController = PersonControllerImpl.getInstance();

		Person p1 = Person.getInstance();
		p1.setName("Person 1");
		p1.setAddress("Address 1");
		p1.setBirthdate(LocalDateTime.now());
		p1.setGender('M');
		
		// Saving the person via controller
		personController.savePerson(p1);
		
		// Retrieving the person via controller
		Person p2 = personController.getPerson();
		p2.setBirthdate(LocalDateTime.now());
		p2.setGender('F');
		
		Person p3 = Person.getInstance();
		p3.setName("Person 3");
		p3.setAddress("Address 3");
		
		log.log(Level.INFO, "Checking if the 3 instance has the same values: " + p1.toString());
		log.log(Level.INFO, "Checking if the 3 instance has the same values: " + p2.toString());
		log.log(Level.INFO, "Checking if the 3 instance has the same values: " + p3.toString());
		

	}

}

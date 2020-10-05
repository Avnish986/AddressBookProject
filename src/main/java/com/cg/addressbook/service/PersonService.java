package com.cg.addressbook.service;
import com.cg.addressbook.exception.*;
import com.cg.addressbook.dto.PersonContact;
public interface PersonService {
	
	public PersonContact createPerson() throws ContactException;
	
	public void displayPerson(PersonContact personContact);
	
	public void updatePerson(PersonContact personContact);
}

package com.cg.addressbook.service;

import com.cg.addressbook.dto.PersonContact;
public interface PersonService {
	
	public PersonContact createPerson();
	
	public void displayPerson(PersonContact personContact);
}

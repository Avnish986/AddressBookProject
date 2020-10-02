package com.cg.addressbook.dto;
import java.util.*;

public class AddressBook {
	private List<PersonContact> personContacts = new ArrayList<PersonContact>();
	
	
	public List<PersonContact> getAddressBook(){
		 return this.personContacts;
	 }
	public void addContact(PersonContact contactObj) {
		personContacts.add(contactObj);
	 }
	public PersonContact isPerson(String firstName) {
		for(int i=0 ; i<personContacts.size();i++) {
			 if(personContacts.get(i).getFname().equalsIgnoreCase(firstName)) {
				 return personContacts.get(i);
				 
			 }
		}
		return null;
	}
	public void  deletePerson(String firstName) {
		for(int i=0 ; i<personContacts.size();i++) {
			 if(personContacts.get(i).getFname().equalsIgnoreCase(firstName)) {
				 	personContacts.remove(i);
				 	return;
			 }
		}
	}
}

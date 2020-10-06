package com.cg.addressbook.dto;
import java.util.*;
import java.util.function.Predicate;

public class AddressBook {
	static List<PersonContact> personContacts = new ArrayList<PersonContact>();
	String name;
	
	public List<PersonContact> getAddressBook(){
		 return this.personContacts;
	 }
	public AddressBook() {

	}
	
	public AddressBook(String name) {
		this.name = name;
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
	public String getName() {
		return name;
	}
	

//	Predicate<String> checkNameStream = n -> {
//		for(PersonContact x:personContacts) {
//			if(x.getFname().equalsIgnoreCase(n)) 
//				 return true;
//		}
//		return false;
//	};
	public boolean checkName(String name) {
//		for(PersonContact x:personContacts) {
//			if(x.getFname().equalsIgnoreCase(name)) 
//				 return true;
//		}
//		return false;
		return personContacts.stream().anyMatch(x -> x.getFname().equalsIgnoreCase(name));
		
		
	}

	public void setName(String name) {
		this.name = name;
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

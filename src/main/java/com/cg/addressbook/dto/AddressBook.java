package com.cg.addressbook.dto;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AddressBook {
	static List<PersonContact> personContacts = new ArrayList<PersonContact>();
	String name;
	public HashMap<String,List> cityDictionary = new HashMap<String,List>();
	HashMap<String,List> stateDictionary = new HashMap<>();
	
	public List<PersonContact> getAddressBook(){
		 return this.personContacts;
	 }
	public AddressBook() {

	}
	public List<PersonContact> showContact(){
		return personContacts.stream().sorted((n1, n2) -> n1.getFname().compareTo(n2.getFname())).collect(Collectors.toList());
	}
	public List<PersonContact> sortCity(){
		return personContacts.stream().sorted((n1,n2) -> n1.getCity().compareTo(n2.getCity())).collect(Collectors.toList());
	}
	
	public List<PersonContact> sortState(){
		return personContacts.stream().sorted((n1,n2) -> n1.getState().compareTo(n2.getState())).collect(Collectors.toList());
	}
	
	public List<PersonContact> sortZip(){
		return personContacts.stream().sorted((n1,n2) -> n1.getZip().compareTo(n2.getZip())).collect(Collectors.toList());
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

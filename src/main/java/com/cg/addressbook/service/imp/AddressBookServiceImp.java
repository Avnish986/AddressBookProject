package com.cg.addressbook.service.imp;

import com.cg.addressbook.dto.AddressBook;
import com.cg.addressbook.dto.PersonContact;
import com.cg.addressbook.service.AddressBookService;
import com.cg.addressbook.service.PersonService;

import java.util.*;
public class AddressBookServiceImp implements AddressBookService {
	private AddressBook addressBook = new AddressBook();
	private PersonService personService;
	private Scanner sc;
	
	public AddressBookServiceImp(Scanner sc) {
		this.sc = sc;
	}
	public void showOptions(AddressBook addressBook){
		this.addressBook = addressBook;
		personService = new PersonServiceImp(this.sc);
		while(true) {
		System.out.println("Option For Address Book");

		System.out.println("1.) Find A Person");
		System.out.println("2.) Create A Persion");
		System.out.println("3.) Exit");
		
		int option = sc.nextInt();
		switch(option) {	
		
		case 1:
			findAPerson();
			//display();
			break;
		case 2:
			PersonContact person = new  PersonContact();
			createAPerson();		
			display();
			break;
		case 3:
			return;
		default:
			System.out.println("Invalid Input");
			break;
		
		
		}
	}
	}
	@Override
	public void findAPerson() {
		System.out.println("Enter Person Name");
		Scanner d = new Scanner(System.in);
		String name = d.nextLine(); 
		personService.displayPerson(addressBook.isPerson(name));
		
	}
	public void createAPerson(){
		addressBook.addContact(personService.createPerson());
	}
	public void display() {
		addressBook.getAddressBook();
	}




}

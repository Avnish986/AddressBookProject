package com.cg.addressbook.service.imp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.cg.addressbook.dto.PersonContact;
import com.cg.addressbook.service.PersonService;

public class PersonServiceImp implements PersonService {
private Scanner sc;
	

	
	public PersonServiceImp(Scanner sc ) {
		this.sc= sc;
	}
	
	public PersonContact createPerson(){
		PersonContact personContact = new PersonContact();
		
		System.out.print("Enter First Name");
		Scanner n = new Scanner(System.in);	
		personContact.setFname(n.nextLine());
		System.out.print("Enter Last Name");
		personContact.setLname(n.nextLine());
		System.out.print("Enter Address ");
		personContact.setAddress(n.nextLine());
		System.out.print("Enter City ");
		personContact.setCity(n.nextLine());
		System.out.print("Enter State");
		personContact.setState(n.nextLine());
		System.out.print("Enter Zip");
		personContact.setZip(n.nextLine());
		System.out.print("Enter Phone");
		personContact.setPhone(n.nextLine());
		System.out.print("Enter Email");
		personContact.setEmail(n.nextLine());
		return personContact;
	}
	public void displayPerson(PersonContact personContact) {
		
		if(personContact == null) {
			System.out.println("Person Not Found");
			return;
		}
		
		System.out.println(String.format("Persion FirstName,%s LastName,%s"
				+ "Address,%s City,%s "
				+ "State,%s Zip,%s "
				+ "Phone %s Email %s",personContact.getFname(),personContact.getFname(),
				personContact.getAddress(),personContact.getCity(),personContact.getState(),
				personContact.getZip(),personContact.getPhone(),personContact.getEmail()));
		
		
	}

}


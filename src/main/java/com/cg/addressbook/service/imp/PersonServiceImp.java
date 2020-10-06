package com.cg.addressbook.service.imp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.addressbook.dto.AddressBook;
import com.cg.addressbook.dto.PersonContact;
import com.cg.addressbook.service.PersonService;
import com.cg.addressbook.exception.*;
import com.cg.addressbook.validate.*;
public class PersonServiceImp implements PersonService {
private Scanner sc;
ContactValidate valid = new ContactValidate();	

	AddressBook addressbook = new AddressBook();
	public PersonServiceImp(Scanner sc ) {
		this.sc= sc;
	}
	
	public PersonContact createPerson() throws ContactException{
		PersonContact personContact = new PersonContact();
		try {
		System.out.print("Enter First Name");
		
		Scanner n = new Scanner(System.in);	
		String fname= n.nextLine();
		if(!addressbook.checkName(fname)) {
		boolean isvalid = valid.validateFirstName(fname);
		while(!isvalid) {
			System.out.println("Invalid First Name, Enter the value again ");
			fname = n.nextLine();
			isvalid = valid.validateFirstName(fname);
		}
		personContact.setFname(fname);
		System.out.print("Enter Last Name");
		String lname= n.nextLine();
		isvalid = valid.validateLastName(lname);
		while(!isvalid) {
			System.out.println("Invalid Last Name, Enter the value again ");
			lname = n.nextLine();
			isvalid = valid.validateLastName(lname);
		}
		personContact.setLname(lname);
		System.out.print("Enter Address ");
		personContact.setAddress(n.nextLine());
		System.out.print("Enter City ");
		personContact.setCity(n.nextLine());
		System.out.print("Enter State");
		personContact.setState(n.nextLine());
		System.out.print("Enter Zip");
		String zip= n.nextLine();
		isvalid = valid.validateZip(zip);
		while(!isvalid) {
			System.out.println("Invalid ZipCode  Enter the value again ");
			zip = n.nextLine();
			isvalid = valid.validateZip(zip);
		}
		personContact.setZip(zip);
		System.out.print("Enter Phone");
		String phno= n.nextLine();
		isvalid = valid.validatePhoneNumber(phno);
		while(!isvalid) {
			System.out.println("Invalid phNo  Enter the value again ");
			phno = n.nextLine();
			isvalid = valid.validatePhoneNumber(phno);
		}
		personContact.setPhone(phno);
		System.out.print("Enter Email");
		String email= n.nextLine();
		isvalid = valid.validateEmail(email);
		while(!isvalid) {
			System.out.println("Invalid email  Enter the value again ");
			email = n.nextLine();
			isvalid = valid.validateEmail(email);
		}
		personContact.setEmail(email);
		}
		else
		{
			System.out.println("Already exist");
		}
		return personContact;
		}
		catch(Exception e)
		{
			throw new ContactException("Invalid inputs");
		}
	}
public void updatePerson(PersonContact personContact) {
		
		while(true) {
			System.out.println("1.) FirstName Update");
			System.out.println("2.) LastName Update");
			System.out.println("3.) Address Update");
			System.out.println("4.) City Update");
			System.out.println("5.) State Update");
			System.out.println("6.) Zip Update");
			System.out.println("7.) Phone Update");
			System.out.println("8.) Email Update");
			System.out.println("9.) Exit");
			int options = sc.nextInt();
			Scanner c = new Scanner(System.in);
			switch (options) {
			
			case 1:
				System.out.println("Enter New FirstName");
				String newName = c.nextLine();
					personContact.setFname(newName);
				break;
			case 2:
				System.out.println("Enter New LastName");
				String newLastName= c.nextLine();
				personContact.setLname(newLastName);

				break;
			case 3:
				System.out.println("Enter New Address");
				String newAddre = c.nextLine();
				personContact.setAddress(newAddre);

				break;
			case 4:
				System.out.println("Enter New City");
				String newCity = c.nextLine();
				personContact.setCity(newCity);
				
				break;
			case 5:
				System.out.println("Enter State");
				String newState = c.nextLine();
				personContact.setState(newState);

				break;
			case 6:
				System.out.println("Enter New Zip");
				String newZip= c.nextLine();
				personContact.setZip(newZip);

				break;
			case 7:
				System.out.println("Enter New Phone");
				String newPhone = c.nextLine();
				personContact.setPhone(newPhone);

				break;	
			case 8:
				System.out.println("Enter New Email");
				String newEmail = c.nextLine();
				personContact.setEmail(newEmail);

				break;
			case 9:
				System.out.println("Exit");
				return;
			default:
				System.out.println("INVALID Input");
				break;
			}
		}
		
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


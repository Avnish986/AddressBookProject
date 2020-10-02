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


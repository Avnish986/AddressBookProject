package com.cg.addressbook;
import com.cg.addressbook.dto.PersonContact;
import com.cg.addressbook.dto.AddressBook;
import com.cg.addressbook.dto.AddressBooks;
import com.cg.addressbook.service.AddressBookService;
import com.cg.addressbook.service.imp.AddressBookServiceImp;
import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to address book project");
		PersonContact person = new PersonContact();
		Scanner sc = new Scanner(System.in);
		AddressBooks addressBooks = new AddressBooks();
		AddressBookService addressBookService = new AddressBookServiceImp(sc);
		while (true) {
			System.out.println("1.) Open an existing book");
			System.out.println("2.) Create new Address Book");
			System.out.println("3.) Search by city");
			System.out.println("4.) Search by state");
			System.out.println("5.) Exit");
			int options = sc.nextInt();

			switch (options) {
			case 1:
			openExistingAddressBook(addressBookService, addressBooks,sc);
				break;
			case 2:
				createNewAddressBook(addressBookService, addressBooks, sc);
				break;
			case 3:
				System.out.println("Enter city name");
				String city = sc.next();
				System.out.println(addressBooks.searchByCity(city));
				break;
			case 4:
				System.out.println("Enter state name");
				String state = sc.next();
				System.out.println(addressBooks.searchByState(state));
				break;
			case 5:
				System.out.println("Bye\n\n");
				return;
			default:
				break;
			}
		}

	}
	public static void openExistingAddressBook(AddressBookService addressBookService,AddressBooks addressBooks,Scanner sc) {
		System.out.print("Enter Name");
		String name = sc.next();
		AddressBook addressBook = addressBooks.containdAddressBook(name);
		if(Objects.nonNull(addressBook)) {
			addressBookService.showOptions(addressBook);
			return;
	}
		System.out.println("Not Address Book Found");
	}
	
	public static void createNewAddressBook(AddressBookService addressBookService,AddressBooks addressBooks ,Scanner sc) {
		System.out.print("Enter Name");
		String name = sc.next();
		AddressBook addressBook = addressBookService.createAddressBook(name);
		addressBooks.addAddressBook(addressBook);
		System.out.print("Created\n\n");
	}
}

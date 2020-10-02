package com.cg.addressbook;
import com.cg.addressbook.dto.PersonContact;
import com.cg.addressbook.dto.AddressBook;
import com.cg.addressbook.service.AddressBookService;
import com.cg.addressbook.service.imp.AddressBookServiceImp;
import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to address book project");
		PersonContact person = new PersonContact();
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		AddressBookService addressBookService = new AddressBookServiceImp(sc);
		while (true) {
			System.out.println("1.) Create new Person Book");
			System.out.println("3.) Exit");
			int options = sc.nextInt();

			switch (options) {
			case 1:
				createNewAddressBook(addressBookService, addressBook, sc);
				break;
			case 3:
				System.out.println("Bye\n\n");
				return;
			default:
				break;
			}
		}
	}
	public static void createNewAddressBook(AddressBookService addressBookService,AddressBook addressBook ,Scanner sc) {
		addressBookService.showOptions(addressBook);
		System.out.print("Created\n\n");
	}

}

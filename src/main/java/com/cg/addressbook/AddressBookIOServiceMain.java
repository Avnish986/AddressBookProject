package com.cg.addressbook;

import java.util.ArrayList;
import java.util.List;

import com.cg.addressbook.dto.PersonContact;

public class AddressBookIOServiceMain {

	public static void main(String[] args) {
		AddressBookIOService addressBookFileIOService = new AddressBookIOService();
		List<PersonContact> contactList = new ArrayList<>();
		PersonContact contact1 = new PersonContact("Avnish", "Gupta", "btd", "btd", "btd", "331313", "91 9999999999", "abc@google.com");
		PersonContact contact2 = new PersonContact("Test1", "Test", "test", "test", "test", "987345", "91 8888888888", "abc@gmail.com");
		PersonContact contact3 = new PersonContact("Test2", "Test", "test", "test", "test", "987345", "91 8888888880", "abc@gmail.com");
		contactList.add(contact1);
		contactList.add(contact2);
		contactList.add(contact3);
//		addressBookFileIOService.writeData(contactList);
//		addressBookFileIOService.readData();
		addressBookFileIOService.writeCSVData(contactList);
		addressBookFileIOService.readCSVData();
	}

}

package com.cg.addressbook;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import com.cg.addressbook.*;
import com.cg.addressbook.dto.*;
import com.cg.addressbook.exception.*;
import com.cg.addressbook.service.*;
import com.cg.addressbook.service.imp.*;
import com.cg.addressbook.validate.*;
public class AddressBookIOTest {
	@Test
	public void writeContactsToFile() {
		AddressBookIOService addressBookFileIOService = new AddressBookIOService();
		List<PersonContact> list = new ArrayList<>();
		PersonContact contact1 = new PersonContact("Avnish", "Gupta", "btd", "btd", "btd", "331313", "91 9999999999", "abc@google.com");
		PersonContact contact2 = new PersonContact("Test", "Test", "test", "test", "test", "987345", "91 8888888888", "abc@gmail.com");
		PersonContact contact3 = new PersonContact("Test1", "Test", "test", "test", "test", "987345", "91 8888888888", "abc@gmail.com");
		list.add(contact1);
		list.add(contact2);
		list.add(contact3);
		addressBookFileIOService.writeData(list);
		addressBookFileIOService.readData();
		Assert.assertEquals(3, addressBookFileIOService.countEntries());
	}
}

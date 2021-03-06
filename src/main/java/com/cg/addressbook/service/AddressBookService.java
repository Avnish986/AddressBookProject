package com.cg.addressbook.service;

import com.cg.addressbook.dto.AddressBook;
public interface AddressBookService {
	public void findAPerson();
	public void showOptions(AddressBook addressBook);
	public void updateAPerson();
	public void deleteAPerson();
	public AddressBook createAddressBook(String name);
}

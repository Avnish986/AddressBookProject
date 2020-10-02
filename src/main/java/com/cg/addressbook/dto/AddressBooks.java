package com.cg.addressbook.dto;
import java.util.*;
public class AddressBooks {
private List<AddressBook> addressBooks;
	
	public AddressBooks() {
		addressBooks = new ArrayList<>();
	}
	
	public void  addAddressBook(AddressBook addressBook) {
		addressBooks.add(addressBook);
	}
	
	public AddressBook containdAddressBook(String name)
	{
		for(int i =0 ;i<addressBooks.size();i++) {
			if(addressBooks.get(i).getName().equals(name)) {
				return addressBooks.get(i);
			}
			
		}
		return null;
	}
}

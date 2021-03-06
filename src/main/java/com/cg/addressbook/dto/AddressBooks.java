package com.cg.addressbook.dto;
import java.util.*;
import java.util.stream.Collectors;
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
//	public List<PersonContact> searchByCity(String city) {
//		 List<PersonContact> cityLocals = new ArrayList<PersonContact>();
//		  //addressBooks.stream().forEach(x -> cityLocals.addAll(x.cityDictionary.get(city)));
//		 addressBooks.stream().forEach(x -> System.out.print(x));
//		 return cityLocals;
//	}
	public List<PersonContact> searchByCity(String city) {
		 List<PersonContact> cityLocals = new ArrayList<PersonContact>();
		  addressBooks.stream().forEach(x -> cityLocals.addAll(x.personContacts.stream().filter(a -> a.getCity().equalsIgnoreCase(city)).collect(Collectors.toList())));
		 return cityLocals;
	}
	public List<PersonContact> searchByState(String state) {
		 List<PersonContact> stateLocals = new ArrayList<PersonContact>();
		  addressBooks.stream().forEach(x -> stateLocals.addAll(x.personContacts.stream().filter(a -> a.getState().equalsIgnoreCase(state)).collect(Collectors.toList())));
		 return stateLocals;
	}
	public int cityCount(String city) {
		 int city1[]= {0};
		  addressBooks.stream().forEach(x ->city1[0]+=(x.personContacts.stream().filter(a -> a.getCity().equalsIgnoreCase(city)).count()));
		 return city1[0];
	}
	public int stateCount(String state) {
		 int state1[]= {0};
		  addressBooks.stream().forEach(x ->state1[0]+=(x.personContacts.stream().filter(a -> a.getState().equalsIgnoreCase(state)).count()));
		 return state1[0];
	}
	
}

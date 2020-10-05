package com.cg.addressbook.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactValidate {
	private final String fname="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String lname="^[A-Z]{1}[a-z A-Z]{2,}$";
	private final String email="^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$";
	private final String phno="^[0-9]{2}[ ]{1}[0-9]{10}$";
	private final String pass="^(?=.{8,})([a-z]*)(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$";
	private final String zip="^[0-9]{3}\\s{0,1}[0-9]{3}$";
	
	private boolean validate(String string, String field) {
		boolean matched = false;
		Pattern pattern =Pattern.compile(field);
	    Matcher matcher = pattern.matcher(string);
	    matched = matcher.find();
	    return matched;
	}
	
	public boolean validateFirstName(String firstName) {
		return validate(firstName, fname);
	}
	
	public boolean validateLastName(String lastName) {
		return validate(lastName, lname);
	}
	
	public boolean validateEmail(String email) {
		return validate(email, this.email);
	}
	
	public boolean validatePhoneNumber(String phone) {
		return validate(phone, phno);
	}
	
	public boolean validateZip(String zip) {
		return validate(zip, this.zip);
	}

}

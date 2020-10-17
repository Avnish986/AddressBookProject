package com.cg.addressbook.dto;

public class PersonContact {
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private String zip_code;
	private String ph_no;
	private String email;
	
	public PersonContact() {
        
    }
	
	public PersonContact(String f_name, String l_name,	String address,	String city, String state,
	String zip_code, String ph_no,	String email)
	{
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.ph_no = ph_no;
		this.email = email;
	}
	
	public String getFname() {
        return f_name;
    }
    public void setFname(String fname) {
        this.f_name = fname;
    }
    
    public String getLname() {
        return l_name;
    }
    public void setLname(String lname) {
        this.l_name = lname;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip_code;
    }
    public void setZip(String zip) {
        this.zip_code = zip;
    }
    public String getPhone() {
        return ph_no;
    }
    public void setPhone(String phone) {
        this.ph_no = phone;
    }
    
    public String getEmail() {
        return ph_no;
    }
    public void setEmail(String email) {
        this.email = email;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//
//        if (obj.getClass() != this.getClass()) {
//            return false;
//        }
//
//        final PersonContact other = (PersonContact) obj;
//        if ((this.f_name == null) ? (other.f_name != null) : !this.f_name.equals(other.f_name)) {
//            return false;
//        }
//
//        return true;
//    }
	@Override
	public String toString()
	{
		return " First name "+f_name+" Last name "+l_name+" Address "+address+" city "
	    +city+" state "+state+" Zip Code "+zip_code+" Phone No. "+ph_no+" email "+email;
	}
}

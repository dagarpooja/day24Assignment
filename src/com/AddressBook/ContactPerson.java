package com.AddressBook;

public class ContactPerson {

	String fName;
	String address;
	String phoneNumber;
	String lName;
	String zipCode;
	String city;
	String state;
	String emailId;

	// Constructor
	public ContactPerson(String firstName, String add, String phone, String lastName, String zip, String cityName,
			String stateName, String email) {

		fName = firstName;
		address = add;
		phoneNumber = phone;
		lName = lastName;
		zipCode = zip;
		city = cityName;
		state = stateName;
		emailId = email;
	}
	public String getFirstName() {
		return this.fName;
	}

	public String toString() {
		return "contact -> " + getFirstName();
	}

	public void print() {

		System.out.println("firstName :" + fName + "address :" + address + "phone :" + phoneNumber + "lastName :"
				+ lName + "zipCode :" + zipCode + "City :" + city + "State :" + state + "email :" + emailId);
	}

}
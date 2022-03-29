package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<ContactPerson> persons;
	Scanner sc = new Scanner(System.in);

	// constructor
	public AddressBook() {
		persons = new ArrayList<ContactPerson>();

	}

	// add new person record to arraylist after taking input
	public void addPerson() {
		System.out.println("Enter First name");
		String fName = sc.nextLine();
		System.out.println("Enter address");
		String address = sc.nextLine();
		System.out.println("Enter phone no");
		String phoneNumber = sc.nextLine();
		System.out.println("Enter Last Name");
		String lName = sc.nextLine();
		System.out.println("Enter Zip code");
		String zipCode = sc.nextLine();
		System.out.println("Enter City Name");
		String city = sc.nextLine();
		System.out.println("Enter State Name");
		String state = sc.nextLine();
		System.out.println("Enter Email Id");
		String emailId = sc.nextLine();
		// construct new person object
		ContactPerson p = new ContactPerson(fName, address, phoneNumber, lName, zipCode, city, state, emailId);
		// add the above contactPerson object to Arraylist
		persons.add(p);
	}

	public void search(String name) {
		for (int i = 0; i < persons.size(); i++) {
			ContactPerson p = (ContactPerson) persons.get(i);
			if (name.equals(p.fName)) {
				p.print();
			} else {
				System.out.println("no search record found");
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < persons.size(); i++) {
			ContactPerson p = (ContactPerson) persons.get(i);
			if (name.equals(p.fName)) {
				persons.remove(i);
			}
		}
	}

}

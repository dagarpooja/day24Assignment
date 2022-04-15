package com.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBook {

	
	Scanner sc = new Scanner(System.in);
	
	
	LinkedList<ContactPerson> linkedList = new LinkedList<ContactPerson>();
	HashMap<String, LinkedList> hashMap = new HashMap<String, LinkedList>();
	String addressBookName;

	// constructor
	public AddressBook() {
		linkedList = new LinkedList<ContactPerson>();

	}

	// add new person record to arraylist after taking input
	public void addPerson(String addressBookName1) {
		if(hashMap.containsKey(addressBookName1)) {
			
		
		System.out.println("Enter First Name");
		String fName = sc.next();
		
		System.out.println("Enter Last Name");
		String lName = sc.next();
		
		System.out.println("Enter address");
		String address = sc.next();
		
		System.out.println("Enter phone no");
		String phoneNumber = sc.next();
		
		System.out.println("Enter Zip code");
		String zipCode = sc.next();
		
		System.out.println("Enter City Name");
		String city = sc.next();
		
		System.out.println("Enter State Name");
		String state = sc.next();
		
		System.out.println("Enter Email Id");
		String emailId = sc.next();
		
		
		
		// construct new person object
		ContactPerson p = new ContactPerson(fName, address, phoneNumber, lName, zipCode, city, state, emailId);
		// add the above contactPerson object to Arraylist
		linkedList.add(p);
		
		System.out.println("entry Details Key:" + linkedList);
		hashMap.put(addressBookName1, new LinkedList<ContactPerson>(linkedList));
		
		System.out.println("My Hash Map:" +hashMap);
		
			
		}
	}
	public void display() {
		for (int i = 0; i < linkedList.size(); i++) {
			ContactPerson p =  linkedList.get(i);
			p.print();
		}
	}
	
	public void searchPerson(String name) {
		for (int i = 0; i < linkedList.size(); i++) {
			ContactPerson p =  linkedList.get(i);
			if (name.equals(p.fName)) {
				p.print();
				break;
			} else {
				System.out.println("no search record found");
			}
		}
	}

	public void deletePerson(String name) {
		for (int i = 0; i < linkedList.size(); i++) {
			ContactPerson p =  linkedList.get(i);
			if (name.equals(p.fName)) {
				linkedList.remove(i);
				break;
			}
		}
	}
	// add new person record to arraylist after taking input
	public void callAddPersonIfNotAlreadyPresent(String name) {
		for (int i = 0; i < linkedList.size(); i++) {
			ContactPerson contact = linkedList.get(i);
			
			if (contact.fName.equals(name)) {
				System.out.println("Sorry this contact already exists.");
				return; // the id exists, so we exit the method.
			}
		}
		addPerson(name);
	}
	
	
	public void searchByCityOrState(String cityName) {
		int count=0;
		for (int i = 0; i < linkedList.size(); i++) {
			ContactPerson p =  linkedList.get(i);
			if (cityName.equals(p.city) || cityName.equals(p.state)) {
				p.print();
				count++;
			}
			else {
				System.out.println("no search record found");
			}
		}System.out.println("number of matches records:" +count);
	}
	

	public void createAddressBook() {
		System.out.println("\nCreate address book ");
		String addressBookName = sc.next();
		System.out.println("Addres book name is :" + addressBookName);
		if (hashMap.containsKey(addressBookName)) {
			System.out.println("\n address book is already exist with same name ,do u want to create another?(yes/no)");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("yes")) {
				createAddressBook();
			}
		} else {
			hashMap.put(addressBookName, new LinkedList<ContactPerson>());
		}
		
	}

	
	}


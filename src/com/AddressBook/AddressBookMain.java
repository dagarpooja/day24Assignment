package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");

		AddressBook add = new AddressBook();
		String name;

		Scanner sc = new Scanner(System.in);
		add.addPerson();
		System.out.println("Enter the Name to search");
		name = sc.nextLine();
		add.search(name);
		System.out.println("Enter the Name to remove");
		name = sc.nextLine();
		add.remove(name);
		System.out.println("Enter the Name to search");
		name = sc.nextLine();
		add.search(name);

	}
}

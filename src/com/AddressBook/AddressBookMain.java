package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");

		AddressBook add = new AddressBook();

		Scanner sc = new Scanner(System.in);
		String name;
		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter First name");
			name = sc.nextLine();
			add.callAddPersonIfNotAlreadyPresent(name);
		}
		System.out.println("Enter the Name to search");
		name = sc.nextLine();
		add.search(name);
		System.out.println("Enter the Name to remove");
		name = sc.nextLine();
		add.remove(name);
		System.out.println("Enter the Name to search");
		name = sc.nextLine();
		add.search(name);
		System.out.println("Enter the search name by city or state");
		String city = sc.nextLine();
		add.searchByCityOrState(city);
	}

}
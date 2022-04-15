package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book");

		AddressBook add = new AddressBook();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the desire option");
		int option = sc.nextInt();

		System.out.print(" 1. AddPerson ");
		System.out.print(" 2. Delete Person ");
		System.out.print(" 3. Search Person ");
		System.out.print(" 4. Unique Contact ");
		System.out.print(" 5. Search By City ");

		String name;
		System.out.println("\n \n Enter the Contact Name");
		name = sc.nextLine();
		switch (option) {
		case 1:

			for (int i = 0; i <= 2; i++) {
				add.createAddressBook();

				System.out.println("\nGive the name of Address book ");
				String addressBook = sc.next();

				for (int j = 0; j <= 2; j++) {
					add.addPerson(addressBook);
					add.display();

				}

			}
			break;

		case 2:

			add.deletePerson(name);
			break;
			
		case 3:
			add.searchPerson(name);
			break;
			
		case 4:

			add.callAddPersonIfNotAlreadyPresent(name);
			break;
			
			
		case 5:
			add.searchByCityOrState(name);
			break;

		}

	}
}
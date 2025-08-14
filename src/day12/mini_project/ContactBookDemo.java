package day12.mini_project;

/*  PhoneBook
    1. Add new contacts(Name, Phone number).
    2. List all saved contacts.
    3. Search for a contact by name.

    ArrayList or HashSet
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactBookDemo {
    private static Set<Contact> contacts = new HashSet<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println(":::Contact Book Menu:::");
            System.out.println("1. Add Contact");
            System.out.println("2. List All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit Program");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    listContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 4);
    }

    private static void addContact() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully....");
    }

    private static void listContacts() {
        if(contacts.isEmpty()) {
            System.out.println("Nothing to list");
            return;
        }
        System.out.println("\n--- All Contacts ---");
        for(Contact c : contacts) {
            System.out.println(c);
        }
    }

    private static void searchContact() {
        System.out.println("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for(Contact c: contacts) {
            if(c.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Contact found: " + c);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Contact not found");
        }
    }
}

import java.util.*;

class AbDriver
{
	public static void main(String[] args) {
		
		// create Address Book
		AddressBook ab = new AddressBook("Rajat's PhoneBook");
		
		// create Contact
		Phone ph1 = new Phone(91, 252, 4783455);
		Address ad1 = new Address("H.no 875",110045,"Lucknow", "India");
		Contact c1 = new Contact("John Oliver", "john.oliver@usanetwork.com", ad1, ph1);
		
		// add Contact to the Address Book
		ab.addContact(c1);


		// create another Contact
		Phone ph2 = new Phone(01, 876, 7854342);
		Address ad2 = new Address("Street 67",534534,"New York", "USA");
		Contact c2 = new Contact("Taylor Swift", "taylor.swift@records.com", ad2, ph2);
		
		// also add this Contact to the Address Book 
		ab.addContact(c2);
		
		// fetch all Contacts
		List<Contact> ret_c = ab.getAllContacts();

		// decorate the output
		System.out.println("======================");
		System.out.println("Showing all contacts: ");
		System.out.println("======================");

		// print the output
		for(Contact rc : ret_c)
		{
			System.out.println(rc.getName() + " - " + rc.getEmail());
		}
	}
}
import java.util.*;

class AbDriver
{
	public static void main(String[] args) {
		AddressBook ab = new AddressBook("Rajat's PhoneBook");
		
		Phone ph = new Phone(91, 252, 4783455);
		Address ad = new Address("H.no 875",110045,"Lucknow", "India");

		Contact c = new Contact("John Oliver", "john.oliver@usanetwork.com", ad, ph);

		ab.addContact(c);
		
		List<Contact> ret_c = ab.getAllContacts();

		for(Contact rc : ret_c)
		{
			System.out.println(rc.getName());
		}
	}
}
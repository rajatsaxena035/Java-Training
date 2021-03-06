import java.util.*;

class AddressBook
{
	private String introduction;
	
	// LinkedList is used for storing Contacts
	LinkedList<Contact> contacts = new LinkedList<Contact>();

	AddressBook(String intro)
	{
		introduction = intro;
	}

	public String getIntroduction()
	{
		return introduction;
	}

	public void setIntroduction()
	{
		this.introduction = introduction;
	}

	public void addContact(Contact c)
	{
		contacts.add(c);
	}

	public void deleteContact(Contact c)
	{
		contacts.remove(c);
	}

	public List<Contact> getAllContacts()
	{
		return contacts;
	}

	public void searchContact(Contact c)
	{
		/*Contact con;
		return con;*/
	}
}
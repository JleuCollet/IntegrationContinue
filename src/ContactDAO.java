import java.util.ArrayList;

public class ContactDAO {
	
	private ArrayList <Contact> contacts;
	
	public ContactDAO () {
		this.contacts = new ArrayList <Contact> ();
	}
	
	public void creerContact (Contact contact) {
		if (contact != null) {
			if (!isContactExist(contact.getNom())) {
				this.contacts.add(contact);
			} else {
				throw new IllegalArgumentException("Sorry, contact already exists");
			}
		}
	}
	
	public Contact recupererContact (String nom) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getNom().equals(nom)) {
				return this.contacts.get(i);
			}
		}
		return null;
	}
	
	public boolean isContactExist(String nom) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getNom().equals(nom)) {
				return true;
			}
		}
		return false;	
	}

}

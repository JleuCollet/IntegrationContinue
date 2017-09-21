
public class ContactService {
	
	private ContactDAO dao;
	
	public ContactService () {
		this.dao = new ContactDAO ();
	}
	
	public void creerContact (String nom, String tel) {
		Contact newContact = new Contact (nom, tel);
		this.dao.creerContact(newContact);
	}
	
}

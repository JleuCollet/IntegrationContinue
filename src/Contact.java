
public class Contact {
	
	private String nom;
	private String tel;
	
	public Contact (String name, String number) {
		if (name.length() > 0 && name != null && name.length() <= 40) {
			this.nom = name;
		} else {
			throw new IllegalArgumentException("Sorry, name field is invalid;");
		}
		
		if (number.length() > 0 && number != null) {
			this.tel = number;
		} else {
			throw new IllegalArgumentException("Sorry, number field is invalid;");
		}
	}
	
	public String getNom () {
		return this.nom;
	}
	
	public String gettel () {
		return this.tel;
	}
}

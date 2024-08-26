package Entities;

public class User {
	
	//GETTER AND SETTERS FOR UID
	private int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}

	private String name;
	private String email;
	private Long contact;
	private String password;
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// CONSTRUCTORS
	public User(String name, String email, Long contact, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	public User() {
		super();
	}
	
	//TO STRING 
	@Override
	public String toString() {
		return "User : name=" + name + ", email=" + email + ", contact=" + contact + ", password=" + password;
	}
	
}

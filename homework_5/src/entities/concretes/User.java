package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private String userName;
	private String lastName;
	private String eMail;
	private String password;
	public User(String userName, String lastName, String eMail, String password) {
		super();
		this.userName = userName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

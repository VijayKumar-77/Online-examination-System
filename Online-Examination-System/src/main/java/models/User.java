package models;

public class User {
	private int    id;
	private String username;
	private String password;
	private String email;
	private long   PhoneNum;
	private UserRole role;
	
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		id = id;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}
}

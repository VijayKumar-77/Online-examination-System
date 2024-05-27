package models;

public class Admin {
	private int userid;
	private String username;
	private String password;
	private long Phonenum;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhonenum() {
		return Phonenum;
	}
	public void setPhonenum(long phonenum) {
		Phonenum = phonenum;
	}
}

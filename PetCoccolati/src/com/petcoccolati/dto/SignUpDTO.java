package com.petcoccolati.dto;

public class SignUpDTO {

	int id;	
	String first;
	String last;
	String phone;
	String email;
	String password;
	
	public SignUpDTO(){
		
	}
	
	public SignUpDTO(int id, String first, String last, String phone, String email, String password){
		this.id = id;
		this.first = first;
		this.last = last;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

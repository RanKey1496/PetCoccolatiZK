package com.petcoccolati.dto;

public class PersonaDTO {

	int id;	
	String first;
	String last;
	int phone;
	String email;
	String password;
	
	public PersonaDTO(){
		
	}
	
	public PersonaDTO(int id, String first, String last, int phone, String email, String password){
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
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

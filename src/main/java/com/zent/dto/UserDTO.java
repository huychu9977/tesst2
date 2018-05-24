package com.zent.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserDTO {
	private Integer id;

	private String name;

	private String birthday;

	private String address;

	private Integer gender;
	
	private String email;

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Integer id, String name, String birthday, String address, Integer gender, String email) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.gender = gender;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
}

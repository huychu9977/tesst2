package com.zent.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="code")
	private String code;
	
	@OneToMany(mappedBy="role")
	private List<UserRole> userRole;
	
	
	public Role(Integer id, String name, String code, List<UserRole> userRole) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.userRole = userRole;
	}
	public List<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}
	public Role() {
		// TODO Auto-generated constructor stub
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}

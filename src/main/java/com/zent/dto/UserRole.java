package com.zent.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_role")
public class UserRole {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public UserRole() {
		// TODO Auto-generated constructor stub
	}


	public UserRole(Integer id, User user, Role role) {
		super();
		this.id = id;
		this.user = user;
		this.role = role;
	}


	@Override
	public String toString() {
		return "UserRole [id=" + id + ", user=" + user.getUsername() + ", role=" + role.getName() + "]";
	}
	
	
}

package com.zent.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
@Table(name="User")
public class User implements UserDetails{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String pasword;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	
	@OneToMany(mappedBy="user")
	private List<UserRole> userRole;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}

	public User(Integer id, String username, String pasword, String name, String address, List<UserRole> userRole) {
		super();
		this.id = id;
		this.username = username;
		this.pasword = pasword;
		this.name = name;
		this.address = address;
		this.userRole = userRole;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pasword=" + pasword + ", name=" + name + ", address="
				+ address + ", userRole=" + userRole.size() + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (UserRole g : userRole) {
			authorities.add(new SimpleGrantedAuthority(g.getRole().getName()));
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}

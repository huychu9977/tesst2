package com.zent.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.zent.bo.UserBO;

public interface IUserService {
	public List<UserBO> findAll();

	public UserBO findById(Integer id);

	public void insert(UserBO u);

	public void update(UserBO u);

	public void delete(UserBO u);

	public UserDetails loadUserByUsername(String username);
}

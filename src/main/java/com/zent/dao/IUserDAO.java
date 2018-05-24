package com.zent.dao;

import org.springframework.security.core.userdetails.UserDetails;

import com.zent.bo.UserBO;
import com.zent.dto.User;

public interface IUserDAO extends IBaseDAO<UserBO>{
	public User loadUserByUsername(String username);
}

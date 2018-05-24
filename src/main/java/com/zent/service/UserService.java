package com.zent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zent.bo.UserBO;
import com.zent.dao.IUserDAO;
import com.zent.dto.User;

@Service("userService")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService implements IUserService {

	@Autowired
	IUserDAO userDAO;

	@Override
	public List<UserBO> findAll() {
		// TODO Auto-generated method stub
		return userDAO.fillAll(UserBO.class);
	}

	@Override
	public UserBO findById(Integer id) {
		// TODO Auto-generated method stub
		return userDAO.findById(UserBO.class, id);
	}

	@Override
	public void insert(UserBO u) {
		// TODO Auto-generated method stub
		userDAO.insert(u);
	}

	@Override
	public void update(UserBO u) {
		// TODO Auto-generated method stub
		userDAO.update(u);
	}

	@Override
	public void delete(UserBO u) {
		// TODO Auto-generated method stub
		userDAO.delete(u);
	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDAO.loadUserByUsername(username);
		
	}

}

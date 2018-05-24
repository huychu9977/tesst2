package com.zent.dao;

import org.hibernate.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.zent.bo.UserBO;
import com.zent.dto.User;
@Repository("userDAO")
public class UserDAO extends BaseDAO<UserBO> implements IUserDAO{

	@Override
	public User loadUserByUsername(String username) {
		return  (User) getSession().createQuery("SELECT o FROM user o WHERE o.username= :username").setParameter("username", username).uniqueResult();

	}

}

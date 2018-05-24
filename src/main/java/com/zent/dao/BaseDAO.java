package com.zent.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDAO<T> implements IBaseDAO<T> {

	@Autowired
	SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<T> fillAll(Class<T> t) {
		return getSession().createQuery("SELECT o FROM "+t.getSimpleName()+" o ").list();
	}

	@Override
	public void insert(T t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		getSession().update(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		getSession().delete(t);
	}

	@Override
	public T findById(Class<T> t, Integer id) {
		// TODO Auto-generated method stub
		return (T) getSession().get(t, id);
	}

}

package com.zent.dao;

import java.util.List;

public interface IBaseDAO<T> {
	public List<T> fillAll(Class<T> t);

	public void insert(T t);

	public void update(T t);

	public void delete(T t);

	public T findById(Class<T> t, Integer id);
}

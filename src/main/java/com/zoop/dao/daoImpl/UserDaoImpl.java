package com.zoop.dao.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zoop.dao.UserDao;
import com.zoop.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getUserList() {
		String hql = "select * from User";
		Query query = getSession().createQuery(hql);
		return query.list();
	}

	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}

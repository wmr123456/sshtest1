package com.wmr.ssh.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.wmr.ssh.entity.User;

public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate HibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		HibernateTemplate = hibernateTemplate;
	}

	@Override
	public void add() {
		User user = new User();
		user.setAddress("a1");
		user.setUsername("aaa");
		HibernateTemplate.save(user);
	}
	
}

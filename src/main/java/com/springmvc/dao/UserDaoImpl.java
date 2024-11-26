package com.springmvc.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int saveUser(User user) {
		int id = (int) hibernateTemplate.save(user);
		return id;
	}

	@Override
	public User loginUser(String email, String password) {

		// HQL query
		String query = "from User where email =:em and password=:pwd";
		User user = (User) hibernateTemplate.execute(s -> {
			Query q = s.createQuery(query);
			q.setString("em", email);
			q.setString("pwd", password);
			return q.uniqueResult();
		});

		return user;
	}

}

package com.woniu.dao.impl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;

/*<<<<<<< HEAD=======>>>>>>> branch 'master' of https://github.com/birdprogrammer/mangerSys.git
*/
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	SessionFactory sessionFactory;

	
	public void save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findOneByName(User obj) {
		String sql = "from User where uname='"+obj.getUname()+"' and upwd='"+obj.getUpwd()+"'";
		return  sessionFactory.getCurrentSession().createQuery(sql).list();
	}

	public Integer getUid(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

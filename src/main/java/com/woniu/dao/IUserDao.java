package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserDao {
	void save(User user);
	Integer getUid(User user);//����ҳ���¼��Ϣ��ѯ����Ӧ���û�ID
	List<User> findOneByName(User obj);
}

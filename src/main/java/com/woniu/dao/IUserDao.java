package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserDao {
	void save(User user);
	List<User> findOneByName(User obj);
	Integer getUid(User user);//����ҳ���¼��Ϣ��ѯ����Ӧ���û�ID

}

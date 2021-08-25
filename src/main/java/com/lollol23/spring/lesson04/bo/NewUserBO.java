package com.lollol23.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.spring.lesson04.DAO.NewUserDAO;
import com.lollol23.spring.lesson04.model.NewUser;

@Service
public class NewUserBO {
	@Autowired
	private NewUserDAO newUserDAO;
	public int addUser(String name, String yyyymmdd, String introduce, String email) {
		return newUserDAO.insertUser(name, yyyymmdd, introduce, email);
	}
	
	public NewUser getLastUser() {
		return newUserDAO.selectLastUser();
	}
}

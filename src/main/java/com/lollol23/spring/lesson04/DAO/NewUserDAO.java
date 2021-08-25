package com.lollol23.spring.lesson04.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lollol23.spring.lesson04.model.NewUser;

@Repository
public interface NewUserDAO {
	
	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("introduce") String introduce
			, @Param("email") String email
			);
	
	public NewUser selectLastUser();
}

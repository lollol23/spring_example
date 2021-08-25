package com.lollol23.spring.lesson04.DAO;

import org.springframework.stereotype.Repository;

import com.lollol23.spring.lesson04.model.NewStudent;

@Repository
public interface NewStudentDAO {
	public int insertStudent(NewStudent newstudent);
}

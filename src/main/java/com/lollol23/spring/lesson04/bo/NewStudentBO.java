package com.lollol23.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lollol23.spring.lesson04.DAO.NewStudentDAO;
import com.lollol23.spring.lesson04.model.NewStudent;

@Service
public class NewStudentBO {
	@Autowired
	private NewStudentDAO newStudentDAO;
	public int addStudent(NewStudent student) {
		return newStudentDAO.insertStudent(student);
	}
}

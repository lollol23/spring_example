package com.lollol23.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lollol23.spring.lesson04.bo.NewStudentBO;
import com.lollol23.spring.lesson04.model.NewStudent;

@Controller
@RequestMapping("/lesson04")
public class NewStudentController {
	
	@Autowired
	private NewStudentBO newStudentBO;
	@GetMapping("/ex02/1")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	@GetMapping("ex02/add_student")
	public String addStudent(
			@ModelAttribute NewStudent newstudent, Model model) {
		int count = newStudentBO.addStudent(newstudent);		
		model.addAttribute("result", newstudent);
		return "lesson04/studentInfo";
	}
	
}

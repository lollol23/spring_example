package com.lollol23.spring.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05COntroller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "/lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		//과일이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("사과");
		fruits.add("딸기");
		fruits.add("포도");
		
		model.addAttribute("fruits", fruits);
		
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "ㄹㄹ");
		map.put("age", "23");
		map.put("hobby", "잠자기");
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "ㄷㄷ");
		map.put("age", "33");
		map.put("hobby", "영화보기");
		users.add(map);
		
		model.addAttribute("users" ,users);
		
		return "/lesson05/ex02";
	}
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		return "/lesson05/ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04() {
		return "/lesson05/ex04";
	}
}

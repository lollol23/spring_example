package com.lollol23.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01")
public class Ex01Controller {
	
	//String 출력하기
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		String htmlString = "예제 1번 <br> 문자열을 responsebody로 전달합니다.";
		
		return htmlString;
	}
	
	//Map출력하기
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> printMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		map.put("grape", 3000);
		
		return map;
	}
}

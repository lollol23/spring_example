package com.lollol23.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController  //@controller + @responsebody
public class Ex01RestController {
	//요청url : /3
	@RequestMapping("/3")
	public String printString() {
		return "@RestController를 통한 리턴";
	}
	
	@RequestMapping("/4")
	public Map<String, String> printMap() {
		Map<String, String> map = new HashMap<>();
		map.put("ㄹㄹㄹ", "강사");
		map.put("유재석", "개그맨");
		map.put("아이유", "가수");
		
		return map;
	}
	
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data();
		data.setId(1);
		data.setName("ㄹㄹㄹ");
		
		return data;
	}
	
}

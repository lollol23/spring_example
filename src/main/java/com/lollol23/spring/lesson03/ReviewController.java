package com.lollol23.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lollol23.spring.lesson03.bo.ReviewBO;
import com.lollol23.spring.lesson03.model.Review;

@Controller
public class ReviewController {
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	@ResponseBody
	public Review ex01(
			@RequestParam("id") int id
			//@RequestParam(value="id", required=true) int id) { //필수파라미터id
			//@RequestParam(value="id", required=false) Integer id
			//@RequestParam(value="id", defaultValue="1") int id
			) {
		return reviewBO.getReview(id);

	}
	
	@RequestMapping("/lesson03/ex02")
	@ResponseBody
	public String ex02() {
		
		//stroeId,menu,userName,point,review
		
		Review review = new Review();
		review.setStoreId(4);
		review.setMenu("콤비네이션피자");
		review.setUserName("김바다");
		review.setPoint(4.5);
		review.setReview("good");
		
		int count = reviewBO.addReviewAsObject(review);
		return "입력 결과 : " + count;
	}
	
	@RequestMapping("/lesson03/ex03")
	@ResponseBody
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review
			) {
		int count = reviewBO.updateReviewByid(id, review);
		return "업데이트 개수 : " + count;
	}
	
	@RequestMapping("/lesson03/ex04")
	@ResponseBody
	public String ex04(@RequestParam("id") int id) {
		int count = reviewBO.deleteReview(id);
		return "삭제개수 : " + count;
	}
}

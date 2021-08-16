package com.lollol23.spring.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lollol23.spring.lesson02.bo.UsedGoodsBO;
import com.lollol23.spring.lesson02.model.UsedGoods;

@RestController
public class UsedGoodsRestController {
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	//SELECT * FROM `used_goods`
	
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() {
		return usedGoodsBO.getUsedGoodsList();
	}
}

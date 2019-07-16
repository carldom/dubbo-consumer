package com.gmall.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/initOrder")
	@ResponseBody
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
	   return orderService.initOrder(userId);
		
	}
}

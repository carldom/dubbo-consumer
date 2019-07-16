package com.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;


@Service
public class OrderServiceImpl implements OrderService{

	//@Autowired
	
	@Reference//从注册中心，远程引用
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println(userId);
		
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		
		for(UserAddress a: addressList) {
			System.out.println(a);
		}
		return addressList;
		
	}

}

package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.entity.Orders;
import com.springboot.mapper.OrdersDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest1ApplicationTests {
	@Autowired
	OrdersDao ordersDao;
	
	@Test
	public void contextLoads() {
	
		Orders o1=ordersDao.findid(1);
		Orders o2=ordersDao.findid(1);
		System.out.println(o1);
		System.out.println(o2);
		o1.setStatus(2);
		int s1=ordersDao.updateGoodsUseCAS(o1);
		System.out.println(s1);
		
		o1.setStatus(2);
		int s2=ordersDao.updateGoodsUseCAS(o1);
		System.out.println(s2);
		
	}

}


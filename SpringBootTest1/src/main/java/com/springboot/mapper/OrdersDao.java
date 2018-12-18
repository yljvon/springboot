package com.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.entity.Dept;
import com.springboot.entity.Orders;




@Mapper
public interface OrdersDao
{
	int updateGoodsUseCAS(Orders orders);

	Orders findid(int i);  
}

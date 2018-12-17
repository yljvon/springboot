package com.springboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Dept;
import com.springboot.mapper.DeptDao;
import com.springboot.service.DeptService;

/**
* @author 作者 yaolijian
* @version 创建时间：2018年12月17日 上午10:07:26
* 类说明
*/
@Service
public class DeptServiceImpl implements DeptService{
   
	@Autowired
	DeptDao deptDao;
	@Override
	public Dept get(Long id) {
		
		return deptDao.findById(id);
	}

}

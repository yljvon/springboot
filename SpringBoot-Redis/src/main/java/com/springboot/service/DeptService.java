package com.springboot.service;

import java.util.List;

import com.springboot.entity.Dept;

/**
* @author 作者 :yaolijian
* @version 创建时间：2018年12月17日 上午10:06:57
* 类说明
*/
public interface DeptService {

	Dept get(Long id);

	List<Dept> findAll();

}

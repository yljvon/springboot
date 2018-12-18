package com.springboot.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.springboot.entity.Dept;
import com.springboot.mapper.DeptDao;
import com.springboot.service.DeptService;

/**
 * @author 作者 yaolijian
 * @version 创建时间：2018年12月17日 上午10:07:26 类说明
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	/*
	 * redisTemplate.opsForValue();//操作字符串 redisTemplate.opsForHash();//操作hash
	 * redisTemplate.opsForList();//操作list redisTemplate.opsForSet();//操作set
	 * redisTemplate.opsForZSet();//操作有序set
	 */

	@Override
	public Dept get(Long id) {
		String ids = String.valueOf(id);
		
		if (redisTemplate.opsForValue().get(ids) != null) {
			log.info("从缓存获取信息");
			return (Dept) redisTemplate.opsForValue().get(ids);
		}
		else {
			log.info("从数据库获取信息");
			Dept dept = deptDao.findById(id);
			redisTemplate.opsForValue().set(ids, dept);
			return dept;
		}
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> deptList = deptDao.findAll();
		return deptList;
	}

}

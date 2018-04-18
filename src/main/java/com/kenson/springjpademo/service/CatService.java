/**  
 * Project Name:spring-boot-demo  
 * File Name:CatService.java  
 * Package Name:com.kenson.springjpademo.service  
 * Date:Apr 16, 201811:08:02 AM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/

package com.kenson.springjpademo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kenson.springjpademo.bean.Cat;
import com.kenson.springjpademo.dao.CatDao;
import com.kenson.springjpademo.repository.Cat2Repository;
import com.kenson.springjpademo.repository.CatRepository;

/**
 * ClassName:CatService Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: Apr 16, 2018 11:08:02 AM
 * 
 * @author CHUNWU
 * @version
 * @since JDK 1.8
 * @see
 */
@Service
public class CatService {

	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	
	@Resource
	private CatDao catDao;

	/**
	 * 
	 * save delete 方法需要绑定事物 使用@Transactional进行事物的锁定
	 * 
	 * @author CHUNWU
	 * @param cat
	 * @since JDK 1.8
	 */

	// 保存数据
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	// 删除数据
	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}

	// 查询数据
	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	//根据catName查询
	public Cat findByCatName(String catName) {
		return cat2Repository.findByCatName(catName);
	}
	
	public Cat findByCatName2(String catName) {
		return cat2Repository.findMyCatName(catName);
	}
	
	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	}


}

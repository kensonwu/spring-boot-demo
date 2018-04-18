/**  
 * Project Name:spring-boot-demo  
 * File Name:Cat2Repository.java  
 * Package Name:com.kenson.springjpademo.repository  
 * Date:Apr 16, 20181:52:51 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.springjpademo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.kenson.springjpademo.bean.Cat;

/**  
 * ClassName:Cat2Repository   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 16, 2018 1:52:51 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public interface Cat2Repository extends Repository<Cat, Integer> {
	
	/**
	 * 1、查询方法以 get| find | read 开头
	 * 2、 涉及查询条件时， 条件的属性用条件关键字连接， 要注意的是条件属性以首字母大写
	 */
	
	//根据catName进行查询
	public Cat findByCatName(String catName);
	
	/**
	 * 如何编写JPQL语句
	 * Hibernate --- HQL语句
	 * 
	 * JPQL语句和HQL语句是类似的
	 * 
	 */
	
	@Query("from Cat where catName=:paramAlias ")
	public Cat findMyCatName(@Param("paramAlias") String catName);

}
  

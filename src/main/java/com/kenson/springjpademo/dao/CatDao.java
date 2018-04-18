/**  
 * Project Name:spring-boot-demo  
 * File Name:DemoDao.java  
 * Package Name:com.kenson.springjpademo.dao  
 * Date:Apr 16, 20182:40:48 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.springjpademo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kenson.springjpademo.bean.Cat;

/**  
 * ClassName:DemoDao   
 * 使用@Repository注解， 标注这是一个持久化操作对象
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 16, 2018 2:40:48 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

@Repository
public class CatDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	public Cat selectByCatName(String catName) {
		/**
		 * 1、 定义一个SQL语句；
		 * 2、 定义一个RowMapper;
		 * 3、 执行查询方法
		 */
		String sql = "select * from cat where cat_name=?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
		return jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
	}
}
  

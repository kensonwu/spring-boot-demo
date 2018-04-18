/**  
 * Project Name:spring-boot-demo  
 * File Name:CatRepository.java  
 * Package Name:com.kenson.springjpademo.repository  
 * Date:Apr 16, 201811:06:26 AM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.springjpademo.repository;

import org.springframework.data.repository.CrudRepository;

import com.kenson.springjpademo.bean.Cat;

/**  
 * 这是一个接口 不是一个class
 * ClassName:CatRepository   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 16, 2018 11:06:26 AM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public interface CatRepository extends CrudRepository<Cat, Integer>{

}
  

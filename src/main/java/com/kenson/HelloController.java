/**  
 * Project Name:springboot-hello  
 * File Name:HelloController.java  
 * Package Name:com.kenson.controller  
 * Date:Apr 13, 201810:36:18 AM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenson.vo.User;

/**  
 * ClassName:HelloController   
 * Function: TODO 测试第一个springboot hello world的测试类   
 * 这里使用@RestController 等价于 @Controller 和@ReponseBody
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 13, 2018 10:36:18 AM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

@RestController
public class HelloController {
	
	/**
	 * 
	 * hello:测试第一个springboot 的hello 请求方法.   
	 * 这里我们使用@RequestMapping 建立请求映射：
	 * http://localhost:8080/hello
	 *  
	 * @author CHUNWU  
	 * @return  
	 * @since JDK 1.8
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello SpringBoot!";
	}
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "Hello SpringBoot-2018-11!";
	}
	
	@RequestMapping("/hello3")
	public String hello3() {
		return "Hello SpringBoot-2018-333!";
	}
	
	/**
	 * 
	 * getUser:该方法用于测试springboot返回json数据
	 * SpringBoot使用的json解析框架是Jackson， 可以在maven的依赖包里找到Jackson的依赖包
	 * @author CHUNWU  
	 * @return  
	 * @since JDK 1.8
	 */
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setId(1);
		user.setName("Jackson");
		user.setCreateDate(new Date());
		user.setRemark("用户注册备注信息");
		return user;
	}

}
  

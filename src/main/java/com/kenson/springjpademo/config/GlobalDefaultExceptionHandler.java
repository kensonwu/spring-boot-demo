/**  
 * Project Name:spring-boot-demo  
 * File Name:GlobalDefaultExceptionHandler.java  
 * Package Name:com.kenson.springjpademo.config  
 * Date:Apr 16, 20183:11:46 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.springjpademo.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**  
 * 1、 新建一个Class， 这里取名GlobalDefaultExceptionHandler
 * 2、 在Class上添加注解， @ControllerAdvice
 * 3、 在Class中添加一个方法
 * 4、 在方法上添加@ExceptionHandler拦截响应的异常信息
 * 5、 如果返回的是View --- 方法的返回值是ModelAndView
 * 6、 如果返回的是String或者Json数据，那么需要在方法上添加@@ResponseBody注解
 * 
 * 
 * ClassName:GlobalDefaultExceptionHandler   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 16, 2018 3:11:46 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest request , Exception e) {
		// 返回的是String
		return 	"sorry, the server is busy, please try again later!";
		
		// 返回ModelAndView
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("404.html");
	}

}
  

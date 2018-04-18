/**  
 * Project Name:spring-boot-demo  
 * File Name:TemplatesController.java  
 * Package Name:com.kenson  
 * Date:Apr 17, 20181:47:37 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**  
 * ClassName:TemplatesController   
 * 注意：
 * 1. 在Thymeleaf 模板文件中， 标签是需要闭合的，在3.0之前是需要闭合的， 
 * 2. Thymeleaf 3.0之后不强制要求闭合
 * 3. 支持同时使用多个模板引擎, 比如： thymeleaf和freemarker 可以并存
 * 
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 17, 2018 1:47:37 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

@Controller
@RequestMapping("/templates")
public class TemplatesController {
	
	/**
	 * 
	 * 映射地址是： /templates/leaf.   
	 *  
	 * @author CHUNWU  
	 * @return  
	 * @since JDK 1.8
	 */
	@RequestMapping("/leaf")
	public String hello(Map<String, Object> map) {
		// 正常情况返回的是ModelAndView
		map.put("name", "Hello Thymeleaf");
		return "hello";
	}
	
	@RequestMapping("/leafmv")
	public ModelAndView leafModelAndView() {
		// 正常情况返回的是ModelAndView
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}
	
	@RequestMapping("/fremarker")
	public String testFreeMarker(Map<String, Object> map) {
		map.put("name", "<hr/><b>Welcome to freemarker world! I am from sever side!</b>");
		return "hellofreemarker";
	}

}
  

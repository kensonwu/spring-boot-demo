/**  
 * Project Name:springboot-hello  
 * File Name:Hello2Controller.java  
 * Package Name:com.kenson.controller  
 * Date:Apr 13, 20183:02:33 PM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson;  
/**  
 * ClassName:Hello2Controller   
 * Function: 测试springboot devtools
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 13, 2018 3:02:33 PM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
	
	@RequestMapping("/testhello")
	public String testHello2() {
		return "test Hello 33!";
	}

}
  

/**  
 * Project Name:spring-boot-demo  
 * File Name:CatController.java  
 * Package Name:com.kenson.springjpademo.controller  
 * Date:Apr 16, 201811:19:55 AM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.springjpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenson.springjpademo.bean.Cat;
import com.kenson.springjpademo.service.CatService;

/**  
 * ClassName:CatController   
 * Function: TODO ADD FUNCTION.   
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 16, 2018 11:19:55 AM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@RestController
@RequestMapping("/cat")
public class CatController {

	@Autowired
	private CatService catService;
	
	
	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setCatName("xiaohua");
		cat.setCatAge(3);
		catService.save(cat);
		return "save successfully!";
	}
	
	@RequestMapping("/delete")
	public void delete() {
		catService.delete(1);
	}
	
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll(){
		return catService.getAll();
	}
	
	@RequestMapping("/findByCatName")
	public Cat findByCatName(String catName){
		return catService.findByCatName(catName);
	}
	
	@RequestMapping("/findByCatName2")
	public Cat findByCatName2(String catName){
		return catService.findByCatName2(catName);
	}
	
	@RequestMapping("/findByCatName3")
	public Cat findByCatName3(String catName){
		return catService.selectByCatName(catName);
	}
	
}
  

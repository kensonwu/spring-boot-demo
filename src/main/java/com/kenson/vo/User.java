/**  
 * Project Name:springboot-hello  
 * File Name:User.java  
 * Package Name:com.kenson.vo  
 * Date:Apr 13, 201810:50:22 AM  
 * Copyright (c) 2018, wc-08-03@hotmail.com All Rights Reserved.  
 *  
*/  
  
package com.kenson.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**  
 * ClassName:User   
 * Function: 这是一个测试实体类
 * Reason:   TODO ADD REASON.   
 * Date:     Apr 13, 2018 10:50:22 AM   
 * @author   CHUNWU  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public class User {
	
	private int id;
	
	private String name;
	
	// com.alibaba.fastjson.annotation.JSONField;
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createDate;
	
	/**
	 * 如果不想返回remark信息
	 * serialize设置成false就不会返回这个field 的值
	 */
	@JSONField(serialize=false)
	private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
  

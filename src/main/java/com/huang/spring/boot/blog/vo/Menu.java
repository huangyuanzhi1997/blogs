package com.huang.spring.boot.blog.vo;

import java.io.Serializable;

/**
 * 菜单 值对象.
 *@author	黄远志
 *@date		2019年7月27日
 *@Blog		https://www.huangyuanzhi.top
 *@GitHub	https://github.com/huangyuanzhi1997
 */
public class Menu implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String url;
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}

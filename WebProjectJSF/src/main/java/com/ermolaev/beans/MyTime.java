package com.ermolaev.beans;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="myBean")
//none scope
public class MyTime implements Serializable {

	private String now;
	
	@PostConstruct
	public void init()
	{
		now = new Date().toGMTString();
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

}

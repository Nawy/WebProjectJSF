package com.ermolaev.beans;

import java.io.Serializable;

import javax.annotation.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="city")
@ViewScoped
public class City implements Serializable {

	private String name;
	
	@PostConstruct
	public void init()
	{
		System.out.println("City init");
		name = "Stavropol";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}






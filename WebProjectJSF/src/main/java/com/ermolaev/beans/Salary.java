package com.ermolaev.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="salary")
@RequestScoped
public class Salary implements Serializable {

	private Float value;
	
	@PostConstruct
	public void init()
	{
		this.value = 500.0f;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}

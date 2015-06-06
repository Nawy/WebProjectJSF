package com.ermolaev.beans;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.annotation.*;

@ManagedBean(name="zipCode", eager=true)
@ApplicationScoped
public class ZipCode implements Serializable {

	private Integer code;
	
	@PostConstruct
	public void init()
	{
		System.out.println("ZipCode init");
		code = 355047;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}

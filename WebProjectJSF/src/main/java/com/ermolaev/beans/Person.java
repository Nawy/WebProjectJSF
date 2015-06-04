package com.ermolaev.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="person")
@SessionScoped
public class Person implements Serializable {
	private String firstName;
	private String lastName;
	
	@PostConstruct
	public void init()
	{
		firstName = "Ivan";
		lastName = "Ermolaev";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

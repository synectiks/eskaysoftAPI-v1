package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class BankInformationDto implements Serializable{

	private static final long serialVersionUID = 655159852262403024L;

	private Long id;
	private String name;
	private String address;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

}
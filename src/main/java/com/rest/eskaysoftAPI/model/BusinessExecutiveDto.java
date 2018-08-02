package com.rest.eskaysoftAPI.model;


import java.io.Serializable;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

  

public class BusinessExecutiveDto implements Serializable,Comparable<BusinessExecutiveDto> {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String town;
	private Long mobile;
	
	
	public Long getId() {
		return id;
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
	public String getTown() {
		return this.town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Long getMobile() {
		return this.mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public int compareTo(BusinessExecutiveDto businessexecutive) {
		
		return this.name.compareTo(businessexecutive.getName());
	}


}
package com.rest.eskaysoftAPI.model;

import java.io.Serializable;

public class CompanyDto implements Serializable, Comparable<CompanyDto> {

	private static final long serialVersionUID = 655159852262403024L;
	private Long id;
	private String companyCode;
	private String companyName;
	private Long companyGroupId;
	private String companyStatus;
	private String invGenType;
	private String companyType;
	private String invPrefix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getCompanyGroupId() {
		return this.companyGroupId;
	}

	public void setCompanyGroupId(Long companyGroupId) {
		this.companyGroupId = companyGroupId;
	}

	public String getCompanyStatus() {
		return this.companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getInvGenType() {
		return this.invGenType;
	}

	public void setInvGenType(String invGenType) {
		this.invGenType = invGenType;
	}

	public String getInvPrefix() {
		return this.invPrefix;
	}

	public void setInvPrefix(String invPrefix) {
		this.invPrefix = invPrefix;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Override
	public int compareTo(CompanyDto arg0) {
		return this.companyName.compareTo(arg0.getCompanyName());
	}

}

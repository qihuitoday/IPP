package com.qihui.ssh.dao.entities;

import java.sql.Timestamp;

@SuppressWarnings("serial")
public class IpEmployee extends BasePOJO {

	// Fields

	private Integer id;
	private String employeeName;
	private String englishName;
	private String gender;
	private String mail;
	private String address;
	private String mobileNumber;
	private Timestamp createTime;
	private String createBy;
	private Timestamp modifyTime;
	private String modifyBy;

	// Constructors

	/** default constructor */
	public IpEmployee() {
	}

	/** minimal constructor */
	public IpEmployee(String employeeName, Timestamp createTime) {
		this.employeeName = employeeName;
		this.createTime = createTime;
	}

	/** full constructor */
	public IpEmployee(String employeeName, String englishName, String gender,
			String mail, String address, String mobileNumber,
			Timestamp createTime, String createBy, Timestamp modifyTime,
			String modifyBy) {
		this.employeeName = employeeName;
		this.englishName = englishName;
		this.gender = gender;
		this.mail = mail;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.createTime = createTime;
		this.createBy = createBy;
		this.modifyTime = modifyTime;
		this.modifyBy = modifyBy;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

}
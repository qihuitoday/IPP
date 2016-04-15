package com.qihui.ssh.web.user;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.service.user.UserService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class RegisterAction extends BaseAction {

	private String employeeName;
	private String englishName;
	private String password;
	private String gender;
	private String mobileNumber;
	private String mail;
	private String address;

	private UserService userService;

	public String execute() throws Exception {
		IpEmployee ipEmployee = new IpEmployee();
		ipEmployee.setMail(mail);
		ipEmployee.setEmployeeName(englishName);
		ipEmployee.setEnglishName(employeeName);
		ipEmployee.setPassword(password);
		ipEmployee.setGender(gender);
		ipEmployee.setAddress(address);
		ipEmployee.setMobileNumber(mobileNumber);
		Boolean flag = userService.addEmployee(ipEmployee);
		if (flag) {
			super.setSessionData("loginUser", ipEmployee);
			super.addCookie("mail", mail);
			System.out.println("Add IpEmployee successfully.");
		} else {
			System.out.println("Add IpEmployee fail.");
		}
		return "success";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

package com.qihui.ssh.web.maintenance;

import com.qihui.ssh.dao.entities.IpEmployee;
import com.qihui.ssh.service.user.UserService;
import com.qihui.ssh.web.BaseAction;

@SuppressWarnings("serial")
public class ProfileAction extends BaseAction {

	private String uiFlag;
	private String password;
	private String employeeName;
	private String englishName;
	private String gender;
	private String address;
	private String mobileNumber;

	private IpEmployee ipEmployee;

	UserService userService;

	public String execute() throws Exception {
		ipEmployee = (IpEmployee) super.getSessionData("loginUser");
		if (uiFlag == null) {
			ipEmployee.setPassword(password);
			ipEmployee.setEmployeeName(employeeName);
			ipEmployee.setEnglishName(englishName);
			ipEmployee.setGender(gender);
			ipEmployee.setAddress(address);
			ipEmployee.setMobileNumber(mobileNumber);
			userService.updateEmployee(ipEmployee);
			super.setSessionData("loginUser", ipEmployee);
			return "updateSuccess";
		}
		return "success";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUiFlag() {
		return uiFlag;
	}

	public void setUiFlag(String uiFlag) {
		this.uiFlag = uiFlag;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public IpEmployee getIpEmployee() {
		return ipEmployee;
	}

	public void setIpEmployee(IpEmployee ipEmployee) {
		this.ipEmployee = ipEmployee;
	}
}

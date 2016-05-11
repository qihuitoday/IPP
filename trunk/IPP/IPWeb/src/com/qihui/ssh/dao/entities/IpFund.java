package com.qihui.ssh.dao.entities;

@SuppressWarnings("serial")
public class IpFund extends BasePOJO {

	private Integer id;
	private String uwCode;
	private String productCode;
	private String fundCode;
	private String fundName;
	private String localName;
	private String currencyCode;
	private String riskLevel;
	private String status;
	private String makerID;
	private String makerTS;
	private String lastModifiedTS;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUwCode() {
		return uwCode;
	}

	public void setUwCode(String uwCode) {
		this.uwCode = uwCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMakerID() {
		return makerID;
	}

	public void setMakerID(String makerID) {
		this.makerID = makerID;
	}

	public String getMakerTS() {
		return makerTS;
	}

	public void setMakerTS(String makerTS) {
		this.makerTS = makerTS;
	}

	public String getLastModifiedTS() {
		return lastModifiedTS;
	}

	public void setLastModifiedTS(String lastModifiedTS) {
		this.lastModifiedTS = lastModifiedTS;
	}

}
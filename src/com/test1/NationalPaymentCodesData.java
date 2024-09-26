package com.test1;

public class NationalPaymentCodesData {
	private String nationPaymentCode;
	private String nationPaymentName;
	private String country;
	private String paymentType;
	private String shortDescription;
	private String routingSystem;
	private String typeCurrency;
	private Integer localLanguageCode;
	private String localLanguageDisplay;
	private String serviceName;
	private String status;

	public NationalPaymentCodesData() {

	}

	public NationalPaymentCodesData(String nationPaymentCode, String nationPaymentName, String country,
			String paymentType, String shortDescription, String routingSystem, String typeCurrency,
			Integer localLanguageCode, String localLanguageDisplay, String serviceName, String status) {
		super();
		this.nationPaymentCode = nationPaymentCode;
		this.nationPaymentName = nationPaymentName;
		this.country = country;
		this.paymentType = paymentType;
		this.shortDescription = shortDescription;
		this.routingSystem = routingSystem;
		this.typeCurrency = typeCurrency;
		this.localLanguageCode = localLanguageCode;
		this.localLanguageDisplay = localLanguageDisplay;
		this.serviceName = serviceName;
		this.status = status;
	}

	public String getNationPaymentCode() {
		return nationPaymentCode;
	}

	public void setNationPaymentCode(String nationPaymentCode) {
		this.nationPaymentCode = nationPaymentCode;
	}

	public String getNationPaymentName() {
		return nationPaymentName;
	}

	public void setNationPaymentName(String nationPaymentName) {
		this.nationPaymentName = nationPaymentName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getRoutingSystem() {
		return routingSystem;
	}

	public void setRoutingSystem(String routingSystem) {
		this.routingSystem = routingSystem;
	}

	public String getTypeCurrency() {
		return typeCurrency;
	}

	public void setTypeCurrency(String typeCurrency) {
		this.typeCurrency = typeCurrency;
	}

	public Integer getLocalLanguageCode() {
		return localLanguageCode;
	}

	public void setLocalLanguageCode(Integer localLanguageCode) {
		this.localLanguageCode = localLanguageCode;
	}

	public String getLocalLanguageDisplay() {
		return localLanguageDisplay;
	}

	public void setLocalLanguageDisplay(String localLanguageDisplay) {
		this.localLanguageDisplay = localLanguageDisplay;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

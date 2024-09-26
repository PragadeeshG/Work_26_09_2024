package com.test1;

public class NationalPaymentCodes {
	private String nationPaymentCode;
	private Integer maxLength;
	private String enquireyRequired;
	private String reversal;
	private String refundService;
	private String negativeAmount;
	private boolean prePayment;
	private String partPayment;
	private String advancePayment;
	private String overPayment;
	private String exactPayment;
	private String maxAdvance;
	private String minAdvance;
	private String paymnetModeAvailable;

	public NationalPaymentCodes() {
	}

	public NationalPaymentCodes(String nationPaymentCode, Integer maxLength, String enquireyRequired, String reversal,
			String refundService, String negativeAmount, boolean prePayment, String partPayment, String advancePayment,
			String overPayment, String exactPayment, String maxAdvance, String minAdvance,
			String paymnetModeAvailable) {
		super();
		this.nationPaymentCode = nationPaymentCode;
		this.maxLength = maxLength;
		this.enquireyRequired = enquireyRequired;
		this.reversal = reversal;
		this.refundService = refundService;
		this.negativeAmount = negativeAmount;
		this.prePayment = prePayment;
		this.partPayment = partPayment;
		this.advancePayment = advancePayment;
		this.overPayment = overPayment;
		this.exactPayment = exactPayment;
		this.maxAdvance = maxAdvance;
		this.minAdvance = minAdvance;
		this.paymnetModeAvailable = paymnetModeAvailable;
	}

	public String getNationPaymentCode() {
		return nationPaymentCode;
	}

	public void setNationPaymentCode(String nationPaymentCode) {
		this.nationPaymentCode = nationPaymentCode;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	public String getEnquireyRequired() {
		return enquireyRequired;
	}

	public void setEnquireyRequired(String enquireyRequired) {
		this.enquireyRequired = enquireyRequired;
	}

	public String getReversal() {
		return reversal;
	}

	public void setReversal(String reversal) {
		this.reversal = reversal;
	}

	public String getRefundService() {
		return refundService;
	}

	public void setRefundService(String refundService) {
		this.refundService = refundService;
	}

	public String getNegativeAmount() {
		return negativeAmount;
	}

	public void setNegativeAmount(String negativeAmount) {
		this.negativeAmount = negativeAmount;
	}

	public boolean isPrePayment() {
		return prePayment;
	}

	public void setPrePayment(boolean prePayment) {
		this.prePayment = prePayment;
	}

	public String getPartPayment() {
		return partPayment;
	}

	public void setPartPayment(String partPayment) {
		this.partPayment = partPayment;
	}

	public String getAdvancePayment() {
		return advancePayment;
	}

	public void setAdvancePayment(String advancePayment) {
		this.advancePayment = advancePayment;
	}

	public String getOverPayment() {
		return overPayment;
	}

	public void setOverPayment(String overPayment) {
		this.overPayment = overPayment;
	}

	public String getExactPayment() {
		return exactPayment;
	}

	public void setExactPayment(String exactPayment) {
		this.exactPayment = exactPayment;
	}

	public String getMaxAdvance() {
		return maxAdvance;
	}

	public void setMaxAdvance(String maxAdvance) {
		this.maxAdvance = maxAdvance;
	}

	public String getMinAdvance() {
		return minAdvance;
	}

	public void setMinAdvance(String minAdvance) {
		this.minAdvance = minAdvance;
	}

	public String getPaymnetModeAvailable() {
		return paymnetModeAvailable;
	}

	public void setPaymnetModeAvailable(String paymnetModeAvailable) {
		this.paymnetModeAvailable = paymnetModeAvailable;
	}

}
package com.test1;

public class NationalPaymentCodesConfiguration {
	private Integer nationalPaymentCodesId;
	private String nationalPaymentCodesOwner;
	private boolean parentCodeAvailable;
	private Integer nationalPaymentCodesTypeId;
	private String nationalPaymentCodesType;
	private String nationalPaymentCodesStatus;
	private Integer nationalPaymentCodesDescription;
	private Integer relativeDependencies;
	private String parentCode;
	private Integer codecachedMemoryIndex;
	private String requestParamsToRetrieveCode;
	private String status;
	private String consumerInput;

	public NationalPaymentCodesConfiguration() {

	}

	public NationalPaymentCodesConfiguration(Integer nationalPaymentCodesId, String nationalPaymentCodesOwner,
			boolean parentCodeAvailable, Integer nationalPaymentCodesTypeId, String nationalPaymentCodesType,
			String nationalPaymentCodesStatus, Integer nationalPaymentCodesDescription, Integer relativeDependencies,
			String parentCode, Integer codecachedMemoryIndex, String requestParamsToRetrieveCode, String status,
			String consumerInput) {
		super();
		this.nationalPaymentCodesId = nationalPaymentCodesId;
		this.nationalPaymentCodesOwner = nationalPaymentCodesOwner;
		this.parentCodeAvailable = parentCodeAvailable;
		this.nationalPaymentCodesTypeId = nationalPaymentCodesTypeId;
		this.nationalPaymentCodesType = nationalPaymentCodesType;
		this.nationalPaymentCodesStatus = nationalPaymentCodesStatus;
		this.nationalPaymentCodesDescription = nationalPaymentCodesDescription;
		this.relativeDependencies = relativeDependencies;
		this.parentCode = parentCode;
		this.codecachedMemoryIndex = codecachedMemoryIndex;
		this.requestParamsToRetrieveCode = requestParamsToRetrieveCode;
		this.status = status;
		this.consumerInput = consumerInput;
	}

	public Integer getNationalPaymentCodesId() {
		return nationalPaymentCodesId;
	}

	public void setNationalPaymentCodesId(Integer nationalPaymentCodesId) {
		this.nationalPaymentCodesId = nationalPaymentCodesId;
	}

	public String getNationalPaymentCodesOwner() {
		return nationalPaymentCodesOwner;
	}

	public void setNationalPaymentCodesOwner(String nationalPaymentCodesOwner) {
		this.nationalPaymentCodesOwner = nationalPaymentCodesOwner;
	}

	public boolean isParentCodeAvailable() {
		return parentCodeAvailable;
	}

	public void setParentCodeAvailable(boolean parentCodeAvailable) {
		this.parentCodeAvailable = parentCodeAvailable;
	}

	public Integer getNationalPaymentCodesTypeId() {
		return nationalPaymentCodesTypeId;
	}

	public void setNationalPaymentCodesTypeId(Integer nationalPaymentCodesTypeId) {
		this.nationalPaymentCodesTypeId = nationalPaymentCodesTypeId;
	}

	public String getNationalPaymentCodesType() {
		return nationalPaymentCodesType;
	}

	public void setNationalPaymentCodesType(String nationalPaymentCodesType) {
		this.nationalPaymentCodesType = nationalPaymentCodesType;
	}

	public String getNationalPaymentCodesStatus() {
		return nationalPaymentCodesStatus;
	}

	public void setNationalPaymentCodesStatus(String nationalPaymentCodesStatus) {
		this.nationalPaymentCodesStatus = nationalPaymentCodesStatus;
	}

	public Integer getNationalPaymentCodesDescription() {
		return nationalPaymentCodesDescription;
	}

	public void setNationalPaymentCodesDescription(Integer nationalPaymentCodesDescription) {
		this.nationalPaymentCodesDescription = nationalPaymentCodesDescription;
	}

	public Integer getRelativeDependencies() {
		return relativeDependencies;
	}

	public void setRelativeDependencies(Integer relativeDependencies) {
		this.relativeDependencies = relativeDependencies;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getCodecachedMemoryIndex() {
		return codecachedMemoryIndex;
	}

	public void setCodecachedMemoryIndex(Integer codecachedMemoryIndex) {
		this.codecachedMemoryIndex = codecachedMemoryIndex;
	}

	public String getRequestParamsToRetrieveCode() {
		return requestParamsToRetrieveCode;
	}

	public void setRequestParamsToRetrieveCode(String requestParamsToRetrieveCode) {
		this.requestParamsToRetrieveCode = requestParamsToRetrieveCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConsumerInput() {
		return consumerInput;
	}

	public void setConsumerInput(String consumerInput) {
		this.consumerInput = consumerInput;
	}

}

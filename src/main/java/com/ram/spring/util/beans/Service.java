package com.ram.spring.util.beans;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonRootName("service")
public class Service {
	
	private int serviceId;
	private String serviceName;
	private String serviceType;
	private String errorMessage;
	
	public Service() {
		super();
	}
	
	
	public Service(int serviceId, String serviceName, String serviceType, String errorMsg) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.errorMessage = errorMsg;
	}
	
	@JsonGetter
	public int getServiceId() {
		return serviceId;
	}
	@JsonSetter
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	@JsonGetter
	public String getServiceName() {
		return serviceName;
	}
	@JsonSetter
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@JsonGetter
	public String getServiceType() {
		return serviceType;
	}
	@JsonSetter
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	@JsonGetter
	public String getErrorMessage() {
		return errorMessage;
	}

	@JsonSetter
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceType=" + serviceType
				+ ", errorMessage=" + errorMessage + "]";
	}
	
}

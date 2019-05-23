package com.dhl.xmlpi.shipVal.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = {
    "customerBarcodes",
    "customerAdditionalInformation",
    "customerDescription",
})
public class AdditionalInformation {
	
	@XmlElement(name = "CustomerBarcodes")
	private List<CustomerBarcodes> customerBarcodes;
	@XmlElement(name = "CustomerAdditionalInformation")
	private List<CustomerAdditionalInformation> customerAdditionalInformation;
	@XmlElement(name = "CustomerDescription")
	private String customerDescription; 
	

	
	public List<CustomerBarcodes> getCustomerBarcodes() {
		return customerBarcodes;
	}

	public void setCustomerBarcodes(List<CustomerBarcodes> customerBarcodes) {
		this.customerBarcodes = customerBarcodes;
	}
	
	public List<CustomerAdditionalInformation> getCustomerAdditionalInformation() {
		return customerAdditionalInformation;
	}

	public void setCustomerAdditionalInformation(List<CustomerAdditionalInformation> customerAdditionalInformation) {
		this.customerAdditionalInformation = customerAdditionalInformation;
	}
	
	
	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	
}

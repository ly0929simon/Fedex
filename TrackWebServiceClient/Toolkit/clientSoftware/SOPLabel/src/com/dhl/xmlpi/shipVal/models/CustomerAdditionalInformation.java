package com.dhl.xmlpi.shipVal.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = {
    "caption",
    "description",
})
public class CustomerAdditionalInformation {
	
	@XmlElement(name = "Caption")
	private String caption;
	@XmlElement(name = "Description")
	private String description;
	
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

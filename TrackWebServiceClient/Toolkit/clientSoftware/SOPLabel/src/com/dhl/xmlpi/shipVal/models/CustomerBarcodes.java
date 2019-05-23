package com.dhl.xmlpi.shipVal.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = {
    "barcodeType",
    "barcodeContent",
    "textBelowBarcode",
})
public class CustomerBarcodes {
	
	@XmlElement(name = "BarcodeType")
	private String barcodeType;
	@XmlElement(name = "BarcodeContent")
	private String barcodeContent;
	@XmlElement(name = "TextBelowBarcode")
	private String textBelowBarcode;
	
	
	public String getBarcodeType() {
		return barcodeType;
	}
	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}
	
	public String getBarcodeContent() {
		return barcodeContent;
	}
	public void setBarcodeContent(String barcodeContent) {
		this.barcodeContent = barcodeContent;
	}
	
	public String getTextBelowBarcode() {
		return textBelowBarcode;
	}
	public void setTextBelowBarcode(String textBelowBarcode) {
		this.textBelowBarcode = textBelowBarcode;
	}
	

}

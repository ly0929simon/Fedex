//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 04:46:27 PM IST 
//


package com.dhl.xmlpi.labelservice.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Origin
 * 
 * <p>Java class for Origin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Origin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostCode" type="{http://www.dhl.com/LabelService_datatypes}PostCode" minOccurs="0"/>
 *         &lt;element name="Suburb" type="{http://www.dhl.com/LabelService_datatypes}Suburb" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.dhl.com/LabelService_datatypes}City" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.dhl.com/LabelService_datatypes}CountryCode"/>
 *         &lt;element name="CountryName" type="{http://www.dhl.com/LabelService_datatypes}CountryName" minOccurs="0"/>
 *         &lt;element name="SvcAreaCode" type="{http://www.dhl.com/LabelService_datatypes}SvcAreaCode"/>
 *         &lt;element name="FacilityCode" type="{http://www.dhl.com/LabelService_datatypes}FacilityCode" minOccurs="0"/>
 *         &lt;element name="AddrMap" type="{http://www.dhl.com/LabelService_datatypes}AddrMap" minOccurs="0"/>
 *         &lt;element name="AddrLine1" type="{http://www.dhl.com/LabelService_datatypes}AddrLine1" minOccurs="0"/>
 *         &lt;element name="AddrLine2" type="{http://www.dhl.com/LabelService_datatypes}AddrLine2" minOccurs="0"/>
 *         &lt;element name="AddrLine3" type="{http://www.dhl.com/LabelService_datatypes}AddrLine3" minOccurs="0"/>
 *         &lt;element name="AddrLine4" type="{http://www.dhl.com/LabelService_datatypes}AddrLine4" minOccurs="0"/>
 *         &lt;element name="AddrLine5" type="{http://www.dhl.com/LabelService_datatypes}AddrLine5" minOccurs="0"/>
 *         &lt;element name="AddrLine6" type="{http://www.dhl.com/LabelService_datatypes}AddrLine6" minOccurs="0"/>
 *         &lt;element name="AddrLine7" type="{http://www.dhl.com/LabelService_datatypes}AddrLine7" minOccurs="0"/>
 *         &lt;element name="PhoneNum" type="{http://www.dhl.com/LabelService_datatypes}PhoneNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Origin", propOrder = {
    "postCode",
    "suburb",
    "city",
    "countryCode",
    "countryName",
    "svcAreaCode",
    "facilityCode",
    "addrMap",
    "addrLine1",
    "addrLine2",
    "addrLine3",
    "addrLine4",
    "addrLine5",
    "addrLine6",
    "addrLine7",
    "phoneNum",
    "phoneExtension",
    "eori_No",
    "federalTaxId",
    "faxNumber"
})
public class Origin {
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Suburb")
    protected String suburb;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "SvcAreaCode", required = true)
    protected String svcAreaCode;
    @XmlElement(name = "FacilityCode")
    protected String facilityCode;
    @XmlElement(name = "AddrMap")
    protected AddrMap addrMap;
    @XmlElement(name = "AddrLine1")
    protected String addrLine1;
    @XmlElement(name = "AddrLine2")
    protected String addrLine2;
    @XmlElement(name = "AddrLine3")
    protected String addrLine3;
    @XmlElement(name = "AddrLine4")
    protected String addrLine4;
    @XmlElement(name = "AddrLine5")
    protected String addrLine5;
    @XmlElement(name = "AddrLine6")
    protected String addrLine6;
    @XmlElement(name = "AddrLine7")
    protected String addrLine7;
    @XmlElement(name = "PhoneNum")
    protected String phoneNum;
    @XmlElement(name = "PhoneExtension")
    protected String phoneExtension;
    @XmlElement(name = "EORI_No")
    protected String eori_No;
    @XmlElement(name = "FederalTaxId")
    protected String federalTaxId;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the svcAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcAreaCode() {
        return svcAreaCode;
    }

    /**
     * Sets the value of the svcAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcAreaCode(String value) {
        this.svcAreaCode = value;
    }

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the addrMap property.
     * 
     * @return
     *     possible object is
     *     {@link AddrMap }
     *     
     */
    public AddrMap getAddrMap() {
        return addrMap;
    }

    /**
     * Sets the value of the addrMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrMap }
     *     
     */
    public void setAddrMap(AddrMap value) {
        this.addrMap = value;
    }

    /**
     * Gets the value of the addrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Sets the value of the addrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine1(String value) {
        this.addrLine1 = value;
    }

    /**
     * Gets the value of the addrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Sets the value of the addrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine2(String value) {
        this.addrLine2 = value;
    }

    /**
     * Gets the value of the addrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Sets the value of the addrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine3(String value) {
        this.addrLine3 = value;
    }

    /**
     * Gets the value of the addrLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine4() {
        return addrLine4;
    }

    /**
     * Sets the value of the addrLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine4(String value) {
        this.addrLine4 = value;
    }

    /**
     * Gets the value of the addrLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine5() {
        return addrLine5;
    }

    /**
     * Sets the value of the addrLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine5(String value) {
        this.addrLine5 = value;
    }

    /**
     * Gets the value of the addrLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine6() {
        return addrLine6;
    }

    /**
     * Sets the value of the addrLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine6(String value) {
        this.addrLine6 = value;
    }

    /**
     * Gets the value of the addrLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLine7() {
        return addrLine7;
    }

    /**
     * Sets the value of the addrLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLine7(String value) {
        this.addrLine7 = value;
    }
    
	public String getPhoneExtension() {
		return phoneExtension;
	}

	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}

	public String getEori_No() {
		return eori_No;
	}

	public void setEori_No(String eori_No) {
		this.eori_No = eori_No;
	}

	public String getFederalTaxId() {
		return federalTaxId;
	}

	public void setFederalTaxId(String federalTaxId) {
		this.federalTaxId = federalTaxId;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
}
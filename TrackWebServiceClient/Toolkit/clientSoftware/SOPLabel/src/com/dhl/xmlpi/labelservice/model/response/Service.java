//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 10:21:23 AM IST 
//


package com.dhl.xmlpi.labelservice.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service
 * 
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalSvcCode" type="{http://www.dhl.com/LabelService_datatypes}LocalSvcCode" minOccurs="0"/>
 *         &lt;element name="GlobalSvcCode" type="{http://www.dhl.com/LabelService_datatypes}GlobalSvcCode" minOccurs="0"/>
 *         &lt;element name="GlobalSvcName" type="{http://www.dhl.com/LabelService_datatypes}GlobalSvcName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "localSvcCode",
    "globalSvcCode",
    "globalSvcName"
})
public class Service {

    @XmlElement(name = "LocalSvcCode")
    protected String localSvcCode;
    @XmlElement(name = "GlobalSvcCode")
    protected String globalSvcCode;
    @XmlElement(name = "GlobalSvcName")
    protected String globalSvcName;

    /**
     * Gets the value of the localSvcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSvcCode() {
        return localSvcCode;
    }

    /**
     * Sets the value of the localSvcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSvcCode(String value) {
        this.localSvcCode = value;
    }

    /**
     * Gets the value of the globalSvcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalSvcCode() {
        return globalSvcCode;
    }

    /**
     * Sets the value of the globalSvcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalSvcCode(String value) {
        this.globalSvcCode = value;
    }

    /**
     * Gets the value of the globalSvcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalSvcName() {
        return globalSvcName;
    }

    /**
     * Sets the value of the globalSvcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalSvcName(String value) {
        this.globalSvcName = value;
    }

}

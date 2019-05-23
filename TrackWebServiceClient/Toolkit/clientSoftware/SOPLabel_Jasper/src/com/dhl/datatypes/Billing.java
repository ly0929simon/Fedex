//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.25 at 02:04:03 PM IST 
//


package com.dhl.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Billing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Billing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipperAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber"/>
 *         &lt;element name="ShippingPaymentType" type="{http://www.dhl.com/datatypes}PaymentType"/>
 *         &lt;element name="BillingAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber"/>
 *         &lt;element name="DutyPaymentType" type="{http://www.dhl.com/datatypes}DutyTaxPaymentType"/>
 *         &lt;element name="DutyAccountNumber" type="{http://www.dhl.com/datatypes}AccountNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Billing", propOrder = {
    "shipperAccountNumber",
    "shippingPaymentType",
    "billingAccountNumber",
    "dutyPaymentType",
    "dutyAccountNumber"
})
public class Billing {

    @XmlElement(name = "ShipperAccountNumber")
    protected long shipperAccountNumber;
    @XmlElement(name = "ShippingPaymentType", required = true)
    protected PaymentType shippingPaymentType;
    @XmlElement(name = "BillingAccountNumber")
    protected long billingAccountNumber;
    @XmlElement(name = "DutyPaymentType", required = true)
    protected DutyTaxPaymentType dutyPaymentType;
    @XmlElement(name = "DutyAccountNumber")
    protected Long dutyAccountNumber;

    /**
     * Gets the value of the shipperAccountNumber property.
     * 
     */
    public long getShipperAccountNumber() {
        return shipperAccountNumber;
    }

    /**
     * Sets the value of the shipperAccountNumber property.
     * 
     */
    public void setShipperAccountNumber(long value) {
        this.shipperAccountNumber = value;
    }

    /**
     * Gets the value of the shippingPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getShippingPaymentType() {
        return shippingPaymentType;
    }

    /**
     * Sets the value of the shippingPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setShippingPaymentType(PaymentType value) {
        this.shippingPaymentType = value;
    }

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     */
    public long getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     */
    public void setBillingAccountNumber(long value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the dutyPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxPaymentType }
     *     
     */
    public DutyTaxPaymentType getDutyPaymentType() {
        return dutyPaymentType;
    }

    /**
     * Sets the value of the dutyPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxPaymentType }
     *     
     */
    public void setDutyPaymentType(DutyTaxPaymentType value) {
        this.dutyPaymentType = value;
    }

    /**
     * Gets the value of the dutyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDutyAccountNumber() {
        return dutyAccountNumber;
    }

    /**
     * Sets the value of the dutyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDutyAccountNumber(Long value) {
        this.dutyAccountNumber = value;
    }

}

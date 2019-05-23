
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SpecialInstructionStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialInstructionStatusDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://fedex.com/ws/track/v10}SpecialInstructionsStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="StatusCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialInstructionStatusDetail", propOrder = {
    "status",
    "statusCreateTime"
})
public class SpecialInstructionStatusDetail {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected SpecialInstructionsStatusCode status;
    @XmlElement(name = "StatusCreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusCreateTime;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionsStatusCode }
     *     
     */
    public SpecialInstructionsStatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionsStatusCode }
     *     
     */
    public void setStatus(SpecialInstructionsStatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCreateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusCreateTime() {
        return statusCreateTime;
    }

    /**
     * Sets the value of the statusCreateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusCreateTime(XMLGregorianCalendar value) {
        this.statusCreateTime = value;
    }

}


package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaCommodityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaftaCommodityDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreferenceCriterion" type="{http://fedex.com/ws/track/v10}NaftaPreferenceCriterionCode" minOccurs="0"/&gt;
 *         &lt;element name="ProducerDetermination" type="{http://fedex.com/ws/track/v10}NaftaProducerDeterminationCode" minOccurs="0"/&gt;
 *         &lt;element name="ProducerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetCostMethod" type="{http://fedex.com/ws/track/v10}NaftaNetCostMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="NetCostDateRange" type="{http://fedex.com/ws/track/v10}DateRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaCommodityDetail", propOrder = {
    "preferenceCriterion",
    "producerDetermination",
    "producerId",
    "netCostMethod",
    "netCostDateRange"
})
public class NaftaCommodityDetail {

    @XmlElement(name = "PreferenceCriterion")
    @XmlSchemaType(name = "string")
    protected NaftaPreferenceCriterionCode preferenceCriterion;
    @XmlElement(name = "ProducerDetermination")
    @XmlSchemaType(name = "string")
    protected NaftaProducerDeterminationCode producerDetermination;
    @XmlElement(name = "ProducerId")
    protected String producerId;
    @XmlElement(name = "NetCostMethod")
    @XmlSchemaType(name = "string")
    protected NaftaNetCostMethodCode netCostMethod;
    @XmlElement(name = "NetCostDateRange")
    protected DateRange netCostDateRange;

    /**
     * Gets the value of the preferenceCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public NaftaPreferenceCriterionCode getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * Sets the value of the preferenceCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public void setPreferenceCriterion(NaftaPreferenceCriterionCode value) {
        this.preferenceCriterion = value;
    }

    /**
     * Gets the value of the producerDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public NaftaProducerDeterminationCode getProducerDetermination() {
        return producerDetermination;
    }

    /**
     * Sets the value of the producerDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public void setProducerDetermination(NaftaProducerDeterminationCode value) {
        this.producerDetermination = value;
    }

    /**
     * Gets the value of the producerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerId() {
        return producerId;
    }

    /**
     * Sets the value of the producerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerId(String value) {
        this.producerId = value;
    }

    /**
     * Gets the value of the netCostMethod property.
     * 
     * @return
     *     possible object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public NaftaNetCostMethodCode getNetCostMethod() {
        return netCostMethod;
    }

    /**
     * Sets the value of the netCostMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public void setNetCostMethod(NaftaNetCostMethodCode value) {
        this.netCostMethod = value;
    }

    /**
     * Gets the value of the netCostDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getNetCostDateRange() {
        return netCostDateRange;
    }

    /**
     * Sets the value of the netCostDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setNetCostDateRange(DateRange value) {
        this.netCostDateRange = value;
    }

}

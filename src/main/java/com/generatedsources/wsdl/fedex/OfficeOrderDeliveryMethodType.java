
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficeOrderDeliveryMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeOrderDeliveryMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COURIER"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PICKUP"/&gt;
 *     &lt;enumeration value="SHIPMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OfficeOrderDeliveryMethodType")
@XmlEnum
public enum OfficeOrderDeliveryMethodType {

    COURIER,
    OTHER,
    PICKUP,
    SHIPMENT;

    public String value() {
        return name();
    }

    public static OfficeOrderDeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}

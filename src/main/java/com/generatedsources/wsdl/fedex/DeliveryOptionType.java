
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDIRECT_SIGNATURE_RELEASE"/&gt;
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="REROUTE"/&gt;
 *     &lt;enumeration value="RESCHEDULE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryOptionType")
@XmlEnum
public enum DeliveryOptionType {

    INDIRECT_SIGNATURE_RELEASE,
    REDIRECT_TO_HOLD_AT_LOCATION,
    REROUTE,
    RESCHEDULE;

    public String value() {
        return name();
    }

    public static DeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}

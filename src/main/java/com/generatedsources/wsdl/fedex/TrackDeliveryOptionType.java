
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDeliveryOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDeliveryOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPOINTMENT"/&gt;
 *     &lt;enumeration value="DATE_CERTAIN"/&gt;
 *     &lt;enumeration value="ELECTRONIC_SIGNATURE_RELEASE"/&gt;
 *     &lt;enumeration value="EVENING"/&gt;
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="REROUTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackDeliveryOptionType")
@XmlEnum
public enum TrackDeliveryOptionType {

    APPOINTMENT,
    DATE_CERTAIN,
    ELECTRONIC_SIGNATURE_RELEASE,
    EVENING,
    REDIRECT_TO_HOLD_AT_LOCATION,
    REROUTE;

    public String value() {
        return name();
    }

    public static TrackDeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}

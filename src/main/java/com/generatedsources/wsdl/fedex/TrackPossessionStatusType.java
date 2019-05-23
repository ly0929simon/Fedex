
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackPossessionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackPossessionStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BROKER"/&gt;
 *     &lt;enumeration value="CARRIER"/&gt;
 *     &lt;enumeration value="CUSTOMS"/&gt;
 *     &lt;enumeration value="RECIPIENT"/&gt;
 *     &lt;enumeration value="SHIPPER"/&gt;
 *     &lt;enumeration value="SPLIT_STATUS"/&gt;
 *     &lt;enumeration value="TRANSFER_PARTNER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackPossessionStatusType")
@XmlEnum
public enum TrackPossessionStatusType {

    BROKER,
    CARRIER,
    CUSTOMS,
    RECIPIENT,
    SHIPPER,
    SPLIT_STATUS,
    TRANSFER_PARTNER;

    public String value() {
        return name();
    }

    public static TrackPossessionStatusType fromValue(String v) {
        return valueOf(v);
    }

}


package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackReturnMovementStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackReturnMovementStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOVEMENT_OCCURRED"/&gt;
 *     &lt;enumeration value="NO_MOVEMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackReturnMovementStatusType")
@XmlEnum
public enum TrackReturnMovementStatusType {

    MOVEMENT_OCCURRED,
    NO_MOVEMENT;

    public String value() {
        return name();
    }

    public static TrackReturnMovementStatusType fromValue(String v) {
        return valueOf(v);
    }

}

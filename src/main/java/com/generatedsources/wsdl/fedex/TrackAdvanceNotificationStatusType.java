
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackAdvanceNotificationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackAdvanceNotificationStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BACK_ON_TRACK"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackAdvanceNotificationStatusType")
@XmlEnum
public enum TrackAdvanceNotificationStatusType {

    BACK_ON_TRACK,
    FAIL;

    public String value() {
        return name();
    }

    public static TrackAdvanceNotificationStatusType fromValue(String v) {
        return valueOf(v);
    }

}

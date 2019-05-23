
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppointmentWindowType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppointmentWindowType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFTERNOON"/&gt;
 *     &lt;enumeration value="LATE_AFTERNOON"/&gt;
 *     &lt;enumeration value="MID_DAY"/&gt;
 *     &lt;enumeration value="MORNING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AppointmentWindowType")
@XmlEnum
public enum AppointmentWindowType {

    AFTERNOON,
    LATE_AFTERNOON,
    MID_DAY,
    MORNING;

    public String value() {
        return name();
    }

    public static AppointmentWindowType fromValue(String v) {
        return valueOf(v);
    }

}

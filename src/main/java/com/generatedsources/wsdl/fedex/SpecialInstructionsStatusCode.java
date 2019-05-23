
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialInstructionsStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialInstructionsStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="DENIED"/&gt;
 *     &lt;enumeration value="HELD"/&gt;
 *     &lt;enumeration value="MODIFIED"/&gt;
 *     &lt;enumeration value="RELINQUISHED"/&gt;
 *     &lt;enumeration value="REQUESTED"/&gt;
 *     &lt;enumeration value="SET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialInstructionsStatusCode")
@XmlEnum
public enum SpecialInstructionsStatusCode {

    ACCEPTED,
    CANCELLED,
    DENIED,
    HELD,
    MODIFIED,
    RELINQUISHED,
    REQUESTED,
    SET;

    public String value() {
        return name();
    }

    public static SpecialInstructionsStatusCode fromValue(String v) {
        return valueOf(v);
    }

}

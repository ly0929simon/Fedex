
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EligibilityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIGIBLE"/&gt;
 *     &lt;enumeration value="INELIGIBLE"/&gt;
 *     &lt;enumeration value="POSSIBLY_ELIGIBLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EligibilityType")
@XmlEnum
public enum EligibilityType {

    ELIGIBLE,
    INELIGIBLE,
    POSSIBLY_ELIGIBLE;

    public String value() {
        return name();
    }

    public static EligibilityType fromValue(String v) {
        return valueOf(v);
    }

}

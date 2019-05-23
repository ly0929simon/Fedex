
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaPreferenceCriterionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaPreferenceCriterionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NaftaPreferenceCriterionCode")
@XmlEnum
public enum NaftaPreferenceCriterionCode {

    A,
    B,
    C,
    D,
    E,
    F;

    public String value() {
        return name();
    }

    public static NaftaPreferenceCriterionCode fromValue(String v) {
        return valueOf(v);
    }

}

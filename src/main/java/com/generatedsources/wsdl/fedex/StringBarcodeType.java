
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringBarcodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringBarcodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDRESS"/&gt;
 *     &lt;enumeration value="ASTRA"/&gt;
 *     &lt;enumeration value="FEDEX_1D"/&gt;
 *     &lt;enumeration value="GROUND"/&gt;
 *     &lt;enumeration value="POSTAL"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StringBarcodeType")
@XmlEnum
public enum StringBarcodeType {

    ADDRESS("ADDRESS"),
    ASTRA("ASTRA"),
    @XmlEnumValue("FEDEX_1D")
    FEDEX_1_D("FEDEX_1D"),
    GROUND("GROUND"),
    POSTAL("POSTAL"),
    USPS("USPS");
    private final String value;

    StringBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringBarcodeType fromValue(String v) {
        for (StringBarcodeType c: StringBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

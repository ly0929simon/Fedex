
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailableImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="SIGNATURE_PROOF_OF_DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailableImageType")
@XmlEnum
public enum AvailableImageType {

    BILL_OF_LADING,
    SIGNATURE_PROOF_OF_DELIVERY;

    public String value() {
        return name();
    }

    public static AvailableImageType fromValue(String v) {
        return valueOf(v);
    }

}

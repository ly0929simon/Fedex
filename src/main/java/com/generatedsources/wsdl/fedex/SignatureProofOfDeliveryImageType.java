
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureProofOfDeliveryImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureProofOfDeliveryImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PDF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SignatureProofOfDeliveryImageType")
@XmlEnum
public enum SignatureProofOfDeliveryImageType {

    PDF,
    PNG;

    public String value() {
        return name();
    }

    public static SignatureProofOfDeliveryImageType fromValue(String v) {
        return valueOf(v);
    }

}

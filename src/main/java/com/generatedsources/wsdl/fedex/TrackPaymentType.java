
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackPaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH_OR_CHECK_AT_DESTINATION"/&gt;
 *     &lt;enumeration value="CASH_OR_CHECK_AT_ORIGIN"/&gt;
 *     &lt;enumeration value="CREDIT_CARD_AT_DESTINATION"/&gt;
 *     &lt;enumeration value="CREDIT_CARD_AT_ORIGIN"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="RECIPIENT_ACCOUNT"/&gt;
 *     &lt;enumeration value="SHIPPER_ACCOUNT"/&gt;
 *     &lt;enumeration value="THIRD_PARTY_ACCOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackPaymentType")
@XmlEnum
public enum TrackPaymentType {

    CASH_OR_CHECK_AT_DESTINATION,
    CASH_OR_CHECK_AT_ORIGIN,
    CREDIT_CARD_AT_DESTINATION,
    CREDIT_CARD_AT_ORIGIN,
    OTHER,
    RECIPIENT_ACCOUNT,
    SHIPPER_ACCOUNT,
    THIRD_PARTY_ACCOUNT;

    public String value() {
        return name();
    }

    public static TrackPaymentType fromValue(String v) {
        return valueOf(v);
    }

}

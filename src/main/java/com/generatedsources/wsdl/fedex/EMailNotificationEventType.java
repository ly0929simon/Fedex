
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ON_DELIVERY"/&gt;
 *     &lt;enumeration value="ON_EXCEPTION"/&gt;
 *     &lt;enumeration value="ON_SHIPMENT"/&gt;
 *     &lt;enumeration value="ON_TENDER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationEventType")
@XmlEnum
public enum EMailNotificationEventType {

    ON_DELIVERY,
    ON_EXCEPTION,
    ON_SHIPMENT,
    ON_TENDER;

    public String value() {
        return name();
    }

    public static EMailNotificationEventType fromValue(String v) {
        return valueOf(v);
    }

}

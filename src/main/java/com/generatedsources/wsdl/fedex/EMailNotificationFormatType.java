
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="WIRELESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationFormatType")
@XmlEnum
public enum EMailNotificationFormatType {

    HTML,
    TEXT,
    WIRELESS;

    public String value() {
        return name();
    }

    public static EMailNotificationFormatType fromValue(String v) {
        return valueOf(v);
    }

}

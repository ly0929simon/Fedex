
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomsOptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COURTESY_RETURN_LABEL"/&gt;
 *     &lt;enumeration value="EXHIBITION_TRADE_SHOW"/&gt;
 *     &lt;enumeration value="FAULTY_ITEM"/&gt;
 *     &lt;enumeration value="FOLLOWING_REPAIR"/&gt;
 *     &lt;enumeration value="FOR_REPAIR"/&gt;
 *     &lt;enumeration value="ITEM_FOR_LOAN"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="REJECTED"/&gt;
 *     &lt;enumeration value="REPLACEMENT"/&gt;
 *     &lt;enumeration value="TRIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomsOptionType")
@XmlEnum
public enum CustomsOptionType {

    COURTESY_RETURN_LABEL,
    EXHIBITION_TRADE_SHOW,
    FAULTY_ITEM,
    FOLLOWING_REPAIR,
    FOR_REPAIR,
    ITEM_FOR_LOAN,
    OTHER,
    REJECTED,
    REPLACEMENT,
    TRIAL;

    public String value() {
        return name();
    }

    public static CustomsOptionType fromValue(String v) {
        return valueOf(v);
    }

}


package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingCompanyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingCompanyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_CARGO"/&gt;
 *     &lt;enumeration value="FEDEX_CORPORATE_SERVICES"/&gt;
 *     &lt;enumeration value="FEDEX_CORPORATION"/&gt;
 *     &lt;enumeration value="FEDEX_CUSTOMER_INFORMATION_SYSTEMS"/&gt;
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL"/&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS"/&gt;
 *     &lt;enumeration value="FEDEX_FREIGHT"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND"/&gt;
 *     &lt;enumeration value="FEDEX_KINKOS"/&gt;
 *     &lt;enumeration value="FEDEX_OFFICE"/&gt;
 *     &lt;enumeration value="FEDEX_SERVICES"/&gt;
 *     &lt;enumeration value="FEDEX_TRADE_NETWORKS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatingCompanyType")
@XmlEnum
public enum OperatingCompanyType {

    FEDEX_CARGO,
    FEDEX_CORPORATE_SERVICES,
    FEDEX_CORPORATION,
    FEDEX_CUSTOMER_INFORMATION_SYSTEMS,
    FEDEX_CUSTOM_CRITICAL,
    FEDEX_EXPRESS,
    FEDEX_FREIGHT,
    FEDEX_GROUND,
    FEDEX_KINKOS,
    FEDEX_OFFICE,
    FEDEX_SERVICES,
    FEDEX_TRADE_NETWORKS;

    public String value() {
        return name();
    }

    public static OperatingCompanyType fromValue(String v) {
        return valueOf(v);
    }

}

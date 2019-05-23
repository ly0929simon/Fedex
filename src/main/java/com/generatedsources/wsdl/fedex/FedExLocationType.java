
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FedExLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FedExLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEDEX_AUTHORIZED_SHIP_CENTER"/&gt;
 *     &lt;enumeration value="FEDEX_EXPRESS_STATION"/&gt;
 *     &lt;enumeration value="FEDEX_FACILITY"/&gt;
 *     &lt;enumeration value="FEDEX_FREIGHT_SERVICE_CENTER"/&gt;
 *     &lt;enumeration value="FEDEX_GROUND_TERMINAL"/&gt;
 *     &lt;enumeration value="FEDEX_HOME_DELIVERY_STATION"/&gt;
 *     &lt;enumeration value="FEDEX_OFFICE"/&gt;
 *     &lt;enumeration value="FEDEX_SELF_SERVICE_LOCATION"/&gt;
 *     &lt;enumeration value="FEDEX_SHIPSITE"/&gt;
 *     &lt;enumeration value="FEDEX_SMART_POST_HUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FedExLocationType")
@XmlEnum
public enum FedExLocationType {

    FEDEX_AUTHORIZED_SHIP_CENTER,
    FEDEX_EXPRESS_STATION,
    FEDEX_FACILITY,
    FEDEX_FREIGHT_SERVICE_CENTER,
    FEDEX_GROUND_TERMINAL,
    FEDEX_HOME_DELIVERY_STATION,
    FEDEX_OFFICE,
    FEDEX_SELF_SERVICE_LOCATION,
    FEDEX_SHIPSITE,
    FEDEX_SMART_POST_HUB;

    public String value() {
        return name();
    }

    public static FedExLocationType fromValue(String v) {
        return valueOf(v);
    }

}

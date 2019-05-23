
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDeliveryLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDeliveryLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APARTMENT_OFFICE"/&gt;
 *     &lt;enumeration value="FEDEX_LOCATION"/&gt;
 *     &lt;enumeration value="GATE_HOUSE"/&gt;
 *     &lt;enumeration value="GUARD_OR_SECURITY_STATION"/&gt;
 *     &lt;enumeration value="IN_BOND_OR_CAGE"/&gt;
 *     &lt;enumeration value="LEASING_OFFICE"/&gt;
 *     &lt;enumeration value="MAILROOM"/&gt;
 *     &lt;enumeration value="MAIN_OFFICE"/&gt;
 *     &lt;enumeration value="MANAGER_OFFICE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="PHARMACY"/&gt;
 *     &lt;enumeration value="RECEPTIONIST_OR_FRONT_DESK"/&gt;
 *     &lt;enumeration value="RENTAL_OFFICE"/&gt;
 *     &lt;enumeration value="RESIDENCE"/&gt;
 *     &lt;enumeration value="SHIPPING_RECEIVING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackDeliveryLocationType")
@XmlEnum
public enum TrackDeliveryLocationType {

    APARTMENT_OFFICE,
    FEDEX_LOCATION,
    GATE_HOUSE,
    GUARD_OR_SECURITY_STATION,
    IN_BOND_OR_CAGE,
    LEASING_OFFICE,
    MAILROOM,
    MAIN_OFFICE,
    MANAGER_OFFICE,
    OTHER,
    PHARMACY,
    RECEPTIONIST_OR_FRONT_DESK,
    RENTAL_OFFICE,
    RESIDENCE,
    SHIPPING_RECEIVING;

    public String value() {
        return name();
    }

    public static TrackDeliveryLocationType fromValue(String v) {
        return valueOf(v);
    }

}

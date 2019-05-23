
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrivalLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrivalLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIRPORT"/&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="CUSTOMS_BROKER"/&gt;
 *     &lt;enumeration value="DELIVERY_LOCATION"/&gt;
 *     &lt;enumeration value="DESTINATION_AIRPORT"/&gt;
 *     &lt;enumeration value="DESTINATION_FEDEX_FACILITY"/&gt;
 *     &lt;enumeration value="DROP_BOX"/&gt;
 *     &lt;enumeration value="ENROUTE"/&gt;
 *     &lt;enumeration value="FEDEX_FACILITY"/&gt;
 *     &lt;enumeration value="FEDEX_OFFICE_LOCATION"/&gt;
 *     &lt;enumeration value="INTERLINE_CARRIER"/&gt;
 *     &lt;enumeration value="NON_FEDEX_FACILITY"/&gt;
 *     &lt;enumeration value="ORIGIN_AIRPORT"/&gt;
 *     &lt;enumeration value="ORIGIN_FEDEX_FACILITY"/&gt;
 *     &lt;enumeration value="PICKUP_LOCATION"/&gt;
 *     &lt;enumeration value="PLANE"/&gt;
 *     &lt;enumeration value="PORT_OF_ENTRY"/&gt;
 *     &lt;enumeration value="SHIP_AND_GET_LOCATION"/&gt;
 *     &lt;enumeration value="SORT_FACILITY"/&gt;
 *     &lt;enumeration value="TURNPOINT"/&gt;
 *     &lt;enumeration value="VEHICLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArrivalLocationType")
@XmlEnum
public enum ArrivalLocationType {

    AIRPORT,
    CUSTOMER,
    CUSTOMS_BROKER,
    DELIVERY_LOCATION,
    DESTINATION_AIRPORT,
    DESTINATION_FEDEX_FACILITY,
    DROP_BOX,
    ENROUTE,
    FEDEX_FACILITY,
    FEDEX_OFFICE_LOCATION,
    INTERLINE_CARRIER,
    NON_FEDEX_FACILITY,
    ORIGIN_AIRPORT,
    ORIGIN_FEDEX_FACILITY,
    PICKUP_LOCATION,
    PLANE,
    PORT_OF_ENTRY,
    SHIP_AND_GET_LOCATION,
    SORT_FACILITY,
    TURNPOINT,
    VEHICLE;

    public String value() {
        return name();
    }

    public static ArrivalLocationType fromValue(String v) {
        return valueOf(v);
    }

}

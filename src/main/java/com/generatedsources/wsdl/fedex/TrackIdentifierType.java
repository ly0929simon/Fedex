
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackIdentifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_OF_LADING"/&gt;
 *     &lt;enumeration value="COD_RETURN_TRACKING_NUMBER"/&gt;
 *     &lt;enumeration value="CUSTOMER_AUTHORIZATION_NUMBER"/&gt;
 *     &lt;enumeration value="CUSTOMER_REFERENCE"/&gt;
 *     &lt;enumeration value="DEPARTMENT"/&gt;
 *     &lt;enumeration value="DOCUMENT_AIRWAY_BILL"/&gt;
 *     &lt;enumeration value="FREE_FORM_REFERENCE"/&gt;
 *     &lt;enumeration value="GROUND_INTERNATIONAL"/&gt;
 *     &lt;enumeration value="GROUND_SHIPMENT_ID"/&gt;
 *     &lt;enumeration value="GROUP_MPS"/&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="JOB_GLOBAL_TRACKING_NUMBER"/&gt;
 *     &lt;enumeration value="ORDER_GLOBAL_TRACKING_NUMBER"/&gt;
 *     &lt;enumeration value="ORDER_TO_PAY_NUMBER"/&gt;
 *     &lt;enumeration value="OUTBOUND_LINK_TO_RETURN"/&gt;
 *     &lt;enumeration value="PARTNER_CARRIER_NUMBER"/&gt;
 *     &lt;enumeration value="PART_NUMBER"/&gt;
 *     &lt;enumeration value="PURCHASE_ORDER"/&gt;
 *     &lt;enumeration value="REROUTE_TRACKING_NUMBER"/&gt;
 *     &lt;enumeration value="RETURNED_TO_SHIPPER_TRACKING_NUMBER"/&gt;
 *     &lt;enumeration value="RETURN_MATERIALS_AUTHORIZATION"/&gt;
 *     &lt;enumeration value="SHIPPER_REFERENCE"/&gt;
 *     &lt;enumeration value="STANDARD_MPS"/&gt;
 *     &lt;enumeration value="TRACKING_NUMBER_OR_DOORTAG"/&gt;
 *     &lt;enumeration value="TRANSPORTATION_CONTROL_NUMBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackIdentifierType")
@XmlEnum
public enum TrackIdentifierType {

    BILL_OF_LADING,
    COD_RETURN_TRACKING_NUMBER,
    CUSTOMER_AUTHORIZATION_NUMBER,
    CUSTOMER_REFERENCE,
    DEPARTMENT,
    DOCUMENT_AIRWAY_BILL,
    FREE_FORM_REFERENCE,
    GROUND_INTERNATIONAL,
    GROUND_SHIPMENT_ID,
    GROUP_MPS,
    INVOICE,
    JOB_GLOBAL_TRACKING_NUMBER,
    ORDER_GLOBAL_TRACKING_NUMBER,
    ORDER_TO_PAY_NUMBER,
    OUTBOUND_LINK_TO_RETURN,
    PARTNER_CARRIER_NUMBER,
    PART_NUMBER,
    PURCHASE_ORDER,
    REROUTE_TRACKING_NUMBER,
    RETURNED_TO_SHIPPER_TRACKING_NUMBER,
    RETURN_MATERIALS_AUTHORIZATION,
    SHIPPER_REFERENCE,
    STANDARD_MPS,
    TRACKING_NUMBER_OR_DOORTAG,
    TRANSPORTATION_CONTROL_NUMBER;

    public String value() {
        return name();
    }

    public static TrackIdentifierType fromValue(String v) {
        return valueOf(v);
    }

}

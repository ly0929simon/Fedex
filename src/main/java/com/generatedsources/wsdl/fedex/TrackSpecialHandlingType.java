
package com.generatedsources.wsdl.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackSpecialHandlingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackSpecialHandlingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCESSIBLE_DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="ADULT_SIGNATURE_OPTION"/&gt;
 *     &lt;enumeration value="AIRBILL_AUTOMATION"/&gt;
 *     &lt;enumeration value="AIRBILL_DELIVERY"/&gt;
 *     &lt;enumeration value="ALCOHOL"/&gt;
 *     &lt;enumeration value="AM_DELIVERY_GUARANTEE"/&gt;
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/&gt;
 *     &lt;enumeration value="BILL_RECIPIENT"/&gt;
 *     &lt;enumeration value="BROKER_SELECT_OPTION"/&gt;
 *     &lt;enumeration value="CALL_BEFORE_DELIVERY"/&gt;
 *     &lt;enumeration value="CALL_TAG"/&gt;
 *     &lt;enumeration value="CALL_TAG_DAMAGE"/&gt;
 *     &lt;enumeration value="CHARGEABLE_CODE"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="COLLECT"/&gt;
 *     &lt;enumeration value="CONSOLIDATION"/&gt;
 *     &lt;enumeration value="CONSOLIDATION_SMALLS_BAG"/&gt;
 *     &lt;enumeration value="CURRENCY"/&gt;
 *     &lt;enumeration value="CUT_FLOWERS"/&gt;
 *     &lt;enumeration value="DATE_CERTAIN_DELIVERY"/&gt;
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE"/&gt;
 *     &lt;enumeration value="DELIVERY_REATTEMPT"/&gt;
 *     &lt;enumeration value="DELIVERY_RECEIPT"/&gt;
 *     &lt;enumeration value="DELIVER_WEEKDAY"/&gt;
 *     &lt;enumeration value="DIRECT_SIGNATURE_OPTION"/&gt;
 *     &lt;enumeration value="DOMESTIC"/&gt;
 *     &lt;enumeration value="DO_NOT_BREAK_DOWN_PALLETS"/&gt;
 *     &lt;enumeration value="DO_NOT_STACK_PALLETS"/&gt;
 *     &lt;enumeration value="DRY_ICE"/&gt;
 *     &lt;enumeration value="DRY_ICE_ADDED"/&gt;
 *     &lt;enumeration value="EAST_COAST_SPECIAL"/&gt;
 *     &lt;enumeration value="ELECTRONIC_COD"/&gt;
 *     &lt;enumeration value="ELECTRONIC_SIGNATURE_SERVICE"/&gt;
 *     &lt;enumeration value="EVENING_DELIVERY"/&gt;
 *     &lt;enumeration value="EXCLUSIVE_USE"/&gt;
 *     &lt;enumeration value="EXTENDED_DELIVERY"/&gt;
 *     &lt;enumeration value="EXTENDED_PICKUP"/&gt;
 *     &lt;enumeration value="EXTRA_LABOR"/&gt;
 *     &lt;enumeration value="EXTREME_LENGTH"/&gt;
 *     &lt;enumeration value="FOOD"/&gt;
 *     &lt;enumeration value="FREIGHT_ON_VALUE_CARRIER_RISK"/&gt;
 *     &lt;enumeration value="FREIGHT_ON_VALUE_OWN_RISK"/&gt;
 *     &lt;enumeration value="FREIGHT_TO_COLLECT"/&gt;
 *     &lt;enumeration value="FULLY_REGULATED_DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="GEL_PACKS_ADDED_OR_REPLACED"/&gt;
 *     &lt;enumeration value="GROUND_SUPPORT_FOR_SMARTPOST"/&gt;
 *     &lt;enumeration value="GUARANTEED_FUNDS"/&gt;
 *     &lt;enumeration value="HAZMAT"/&gt;
 *     &lt;enumeration value="HIGH_FLOOR"/&gt;
 *     &lt;enumeration value="HOLD_AT_LOCATION"/&gt;
 *     &lt;enumeration value="HOLIDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="INACCESSIBLE_DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="INDIRECT_SIGNATURE_OPTION"/&gt;
 *     &lt;enumeration value="INSIDE_DELIVERY"/&gt;
 *     &lt;enumeration value="INSIDE_PICKUP"/&gt;
 *     &lt;enumeration value="INTERNATIONAL"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_CONTROLLED_EXPORT"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_MAIL_SERVICE"/&gt;
 *     &lt;enumeration value="INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS"/&gt;
 *     &lt;enumeration value="LIFTGATE"/&gt;
 *     &lt;enumeration value="LIFTGATE_DELIVERY"/&gt;
 *     &lt;enumeration value="LIFTGATE_PICKUP"/&gt;
 *     &lt;enumeration value="LIMITED_ACCESS_DELIVERY"/&gt;
 *     &lt;enumeration value="LIMITED_ACCESS_PICKUP"/&gt;
 *     &lt;enumeration value="LIMITED_QUANTITIES_DANGEROUS_GOODS"/&gt;
 *     &lt;enumeration value="MARKING_OR_TAGGING"/&gt;
 *     &lt;enumeration value="NET_RETURN"/&gt;
 *     &lt;enumeration value="NON_BUSINESS_TIME"/&gt;
 *     &lt;enumeration value="NON_STANDARD_CONTAINER"/&gt;
 *     &lt;enumeration value="NO_SIGNATURE_REQUIRED_SIGNATURE_OPTION"/&gt;
 *     &lt;enumeration value="ORDER_NOTIFY"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="OTHER_REGULATED_MATERIAL_DOMESTIC"/&gt;
 *     &lt;enumeration value="PACKAGE_RETURN_PROGRAM"/&gt;
 *     &lt;enumeration value="PIECE_COUNT_VERIFICATION"/&gt;
 *     &lt;enumeration value="POISON"/&gt;
 *     &lt;enumeration value="PREPAID"/&gt;
 *     &lt;enumeration value="PRIORITY_ALERT"/&gt;
 *     &lt;enumeration value="PRIORITY_ALERT_PLUS"/&gt;
 *     &lt;enumeration value="PROTECTION_FROM_FREEZING"/&gt;
 *     &lt;enumeration value="RAIL_MODE"/&gt;
 *     &lt;enumeration value="RECONSIGNMENT_CHARGES"/&gt;
 *     &lt;enumeration value="REROUTE_CROSS_COUNTRY_DEFERRED"/&gt;
 *     &lt;enumeration value="REROUTE_CROSS_COUNTRY_EXPEDITED"/&gt;
 *     &lt;enumeration value="REROUTE_LOCAL"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_DELIVERY"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_PICKUP"/&gt;
 *     &lt;enumeration value="RETURNS_CLEARANCE"/&gt;
 *     &lt;enumeration value="RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED"/&gt;
 *     &lt;enumeration value="RETURN_MANAGER"/&gt;
 *     &lt;enumeration value="SATURDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="SHIPMENT_PLACED_IN_COLD_STORAGE"/&gt;
 *     &lt;enumeration value="SINGLE_SHIPMENT"/&gt;
 *     &lt;enumeration value="SMALL_QUANTITY_EXCEPTION"/&gt;
 *     &lt;enumeration value="SORT_AND_SEGREGATE"/&gt;
 *     &lt;enumeration value="SPECIAL_DELIVERY"/&gt;
 *     &lt;enumeration value="SPECIAL_EQUIPMENT"/&gt;
 *     &lt;enumeration value="STANDARD_GROUND_SERVICE"/&gt;
 *     &lt;enumeration value="STORAGE"/&gt;
 *     &lt;enumeration value="SUNDAY_DELIVERY"/&gt;
 *     &lt;enumeration value="THIRD_PARTY_BILLING"/&gt;
 *     &lt;enumeration value="THIRD_PARTY_CONSIGNEE"/&gt;
 *     &lt;enumeration value="TOP_LOAD"/&gt;
 *     &lt;enumeration value="WEEKEND_DELIVERY"/&gt;
 *     &lt;enumeration value="WEEKEND_PICKUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackSpecialHandlingType")
@XmlEnum
public enum TrackSpecialHandlingType {

    ACCESSIBLE_DANGEROUS_GOODS,
    ADULT_SIGNATURE_OPTION,
    AIRBILL_AUTOMATION,
    AIRBILL_DELIVERY,
    ALCOHOL,
    AM_DELIVERY_GUARANTEE,
    APPOINTMENT_DELIVERY,
    BILL_RECIPIENT,
    BROKER_SELECT_OPTION,
    CALL_BEFORE_DELIVERY,
    CALL_TAG,
    CALL_TAG_DAMAGE,
    CHARGEABLE_CODE,
    COD,
    COLLECT,
    CONSOLIDATION,
    CONSOLIDATION_SMALLS_BAG,
    CURRENCY,
    CUT_FLOWERS,
    DATE_CERTAIN_DELIVERY,
    DELIVERY_ON_INVOICE_ACCEPTANCE,
    DELIVERY_REATTEMPT,
    DELIVERY_RECEIPT,
    DELIVER_WEEKDAY,
    DIRECT_SIGNATURE_OPTION,
    DOMESTIC,
    DO_NOT_BREAK_DOWN_PALLETS,
    DO_NOT_STACK_PALLETS,
    DRY_ICE,
    DRY_ICE_ADDED,
    EAST_COAST_SPECIAL,
    ELECTRONIC_COD,
    ELECTRONIC_SIGNATURE_SERVICE,
    EVENING_DELIVERY,
    EXCLUSIVE_USE,
    EXTENDED_DELIVERY,
    EXTENDED_PICKUP,
    EXTRA_LABOR,
    EXTREME_LENGTH,
    FOOD,
    FREIGHT_ON_VALUE_CARRIER_RISK,
    FREIGHT_ON_VALUE_OWN_RISK,
    FREIGHT_TO_COLLECT,
    FULLY_REGULATED_DANGEROUS_GOODS,
    GEL_PACKS_ADDED_OR_REPLACED,
    GROUND_SUPPORT_FOR_SMARTPOST,
    GUARANTEED_FUNDS,
    HAZMAT,
    HIGH_FLOOR,
    HOLD_AT_LOCATION,
    HOLIDAY_DELIVERY,
    INACCESSIBLE_DANGEROUS_GOODS,
    INDIRECT_SIGNATURE_OPTION,
    INSIDE_DELIVERY,
    INSIDE_PICKUP,
    INTERNATIONAL,
    INTERNATIONAL_CONTROLLED_EXPORT,
    INTERNATIONAL_MAIL_SERVICE,
    INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS,
    LIFTGATE,
    LIFTGATE_DELIVERY,
    LIFTGATE_PICKUP,
    LIMITED_ACCESS_DELIVERY,
    LIMITED_ACCESS_PICKUP,
    LIMITED_QUANTITIES_DANGEROUS_GOODS,
    MARKING_OR_TAGGING,
    NET_RETURN,
    NON_BUSINESS_TIME,
    NON_STANDARD_CONTAINER,
    NO_SIGNATURE_REQUIRED_SIGNATURE_OPTION,
    ORDER_NOTIFY,
    OTHER,
    OTHER_REGULATED_MATERIAL_DOMESTIC,
    PACKAGE_RETURN_PROGRAM,
    PIECE_COUNT_VERIFICATION,
    POISON,
    PREPAID,
    PRIORITY_ALERT,
    PRIORITY_ALERT_PLUS,
    PROTECTION_FROM_FREEZING,
    RAIL_MODE,
    RECONSIGNMENT_CHARGES,
    REROUTE_CROSS_COUNTRY_DEFERRED,
    REROUTE_CROSS_COUNTRY_EXPEDITED,
    REROUTE_LOCAL,
    RESIDENTIAL_DELIVERY,
    RESIDENTIAL_PICKUP,
    RETURNS_CLEARANCE,
    RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED,
    RETURN_MANAGER,
    SATURDAY_DELIVERY,
    SHIPMENT_PLACED_IN_COLD_STORAGE,
    SINGLE_SHIPMENT,
    SMALL_QUANTITY_EXCEPTION,
    SORT_AND_SEGREGATE,
    SPECIAL_DELIVERY,
    SPECIAL_EQUIPMENT,
    STANDARD_GROUND_SERVICE,
    STORAGE,
    SUNDAY_DELIVERY,
    THIRD_PARTY_BILLING,
    THIRD_PARTY_CONSIGNEE,
    TOP_LOAD,
    WEEKEND_DELIVERY,
    WEEKEND_PICKUP;

    public String value() {
        return name();
    }

    public static TrackSpecialHandlingType fromValue(String v) {
        return valueOf(v);
    }

}

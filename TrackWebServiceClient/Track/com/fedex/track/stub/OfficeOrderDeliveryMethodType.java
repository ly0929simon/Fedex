/**
 * OfficeOrderDeliveryMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class OfficeOrderDeliveryMethodType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfficeOrderDeliveryMethodType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COURIER = "COURIER";
    public static final java.lang.String _OTHER = "OTHER";
    public static final java.lang.String _PICKUP = "PICKUP";
    public static final java.lang.String _SHIPMENT = "SHIPMENT";
    public static final OfficeOrderDeliveryMethodType COURIER = new OfficeOrderDeliveryMethodType(_COURIER);
    public static final OfficeOrderDeliveryMethodType OTHER = new OfficeOrderDeliveryMethodType(_OTHER);
    public static final OfficeOrderDeliveryMethodType PICKUP = new OfficeOrderDeliveryMethodType(_PICKUP);
    public static final OfficeOrderDeliveryMethodType SHIPMENT = new OfficeOrderDeliveryMethodType(_SHIPMENT);
    public java.lang.String getValue() { return _value_;}
    public static OfficeOrderDeliveryMethodType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfficeOrderDeliveryMethodType enumeration = (OfficeOrderDeliveryMethodType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfficeOrderDeliveryMethodType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfficeOrderDeliveryMethodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OfficeOrderDeliveryMethodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

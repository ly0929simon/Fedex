/**
 * TrackDeliveryOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackDeliveryOptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackDeliveryOptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _APPOINTMENT = "APPOINTMENT";
    public static final java.lang.String _DATE_CERTAIN = "DATE_CERTAIN";
    public static final java.lang.String _ELECTRONIC_SIGNATURE_RELEASE = "ELECTRONIC_SIGNATURE_RELEASE";
    public static final java.lang.String _EVENING = "EVENING";
    public static final java.lang.String _REDIRECT_TO_HOLD_AT_LOCATION = "REDIRECT_TO_HOLD_AT_LOCATION";
    public static final java.lang.String _REROUTE = "REROUTE";
    public static final TrackDeliveryOptionType APPOINTMENT = new TrackDeliveryOptionType(_APPOINTMENT);
    public static final TrackDeliveryOptionType DATE_CERTAIN = new TrackDeliveryOptionType(_DATE_CERTAIN);
    public static final TrackDeliveryOptionType ELECTRONIC_SIGNATURE_RELEASE = new TrackDeliveryOptionType(_ELECTRONIC_SIGNATURE_RELEASE);
    public static final TrackDeliveryOptionType EVENING = new TrackDeliveryOptionType(_EVENING);
    public static final TrackDeliveryOptionType REDIRECT_TO_HOLD_AT_LOCATION = new TrackDeliveryOptionType(_REDIRECT_TO_HOLD_AT_LOCATION);
    public static final TrackDeliveryOptionType REROUTE = new TrackDeliveryOptionType(_REROUTE);
    public java.lang.String getValue() { return _value_;}
    public static TrackDeliveryOptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrackDeliveryOptionType enumeration = (TrackDeliveryOptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrackDeliveryOptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrackDeliveryOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackDeliveryOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * TrackPossessionStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackPossessionStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackPossessionStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BROKER = "BROKER";
    public static final java.lang.String _CARRIER = "CARRIER";
    public static final java.lang.String _CUSTOMS = "CUSTOMS";
    public static final java.lang.String _RECIPIENT = "RECIPIENT";
    public static final java.lang.String _SHIPPER = "SHIPPER";
    public static final java.lang.String _SPLIT_STATUS = "SPLIT_STATUS";
    public static final java.lang.String _TRANSFER_PARTNER = "TRANSFER_PARTNER";
    public static final TrackPossessionStatusType BROKER = new TrackPossessionStatusType(_BROKER);
    public static final TrackPossessionStatusType CARRIER = new TrackPossessionStatusType(_CARRIER);
    public static final TrackPossessionStatusType CUSTOMS = new TrackPossessionStatusType(_CUSTOMS);
    public static final TrackPossessionStatusType RECIPIENT = new TrackPossessionStatusType(_RECIPIENT);
    public static final TrackPossessionStatusType SHIPPER = new TrackPossessionStatusType(_SHIPPER);
    public static final TrackPossessionStatusType SPLIT_STATUS = new TrackPossessionStatusType(_SPLIT_STATUS);
    public static final TrackPossessionStatusType TRANSFER_PARTNER = new TrackPossessionStatusType(_TRANSFER_PARTNER);
    public java.lang.String getValue() { return _value_;}
    public static TrackPossessionStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrackPossessionStatusType enumeration = (TrackPossessionStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrackPossessionStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrackPossessionStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackPossessionStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

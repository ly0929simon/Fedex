/**
 * SpecialInstructionsStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class SpecialInstructionsStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SpecialInstructionsStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCEPTED = "ACCEPTED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _DENIED = "DENIED";
    public static final java.lang.String _HELD = "HELD";
    public static final java.lang.String _MODIFIED = "MODIFIED";
    public static final java.lang.String _RELINQUISHED = "RELINQUISHED";
    public static final java.lang.String _REQUESTED = "REQUESTED";
    public static final java.lang.String _SET = "SET";
    public static final SpecialInstructionsStatusCode ACCEPTED = new SpecialInstructionsStatusCode(_ACCEPTED);
    public static final SpecialInstructionsStatusCode CANCELLED = new SpecialInstructionsStatusCode(_CANCELLED);
    public static final SpecialInstructionsStatusCode DENIED = new SpecialInstructionsStatusCode(_DENIED);
    public static final SpecialInstructionsStatusCode HELD = new SpecialInstructionsStatusCode(_HELD);
    public static final SpecialInstructionsStatusCode MODIFIED = new SpecialInstructionsStatusCode(_MODIFIED);
    public static final SpecialInstructionsStatusCode RELINQUISHED = new SpecialInstructionsStatusCode(_RELINQUISHED);
    public static final SpecialInstructionsStatusCode REQUESTED = new SpecialInstructionsStatusCode(_REQUESTED);
    public static final SpecialInstructionsStatusCode SET = new SpecialInstructionsStatusCode(_SET);
    public java.lang.String getValue() { return _value_;}
    public static SpecialInstructionsStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SpecialInstructionsStatusCode enumeration = (SpecialInstructionsStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SpecialInstructionsStatusCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SpecialInstructionsStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "SpecialInstructionsStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

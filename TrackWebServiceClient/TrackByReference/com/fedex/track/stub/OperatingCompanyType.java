/**
 * OperatingCompanyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class OperatingCompanyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperatingCompanyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FEDEX_CARGO = "FEDEX_CARGO";
    public static final java.lang.String _FEDEX_CORPORATE_SERVICES = "FEDEX_CORPORATE_SERVICES";
    public static final java.lang.String _FEDEX_CORPORATION = "FEDEX_CORPORATION";
    public static final java.lang.String _FEDEX_CUSTOMER_INFORMATION_SYSTEMS = "FEDEX_CUSTOMER_INFORMATION_SYSTEMS";
    public static final java.lang.String _FEDEX_CUSTOM_CRITICAL = "FEDEX_CUSTOM_CRITICAL";
    public static final java.lang.String _FEDEX_EXPRESS = "FEDEX_EXPRESS";
    public static final java.lang.String _FEDEX_FREIGHT = "FEDEX_FREIGHT";
    public static final java.lang.String _FEDEX_GROUND = "FEDEX_GROUND";
    public static final java.lang.String _FEDEX_KINKOS = "FEDEX_KINKOS";
    public static final java.lang.String _FEDEX_OFFICE = "FEDEX_OFFICE";
    public static final java.lang.String _FEDEX_SERVICES = "FEDEX_SERVICES";
    public static final java.lang.String _FEDEX_TRADE_NETWORKS = "FEDEX_TRADE_NETWORKS";
    public static final OperatingCompanyType FEDEX_CARGO = new OperatingCompanyType(_FEDEX_CARGO);
    public static final OperatingCompanyType FEDEX_CORPORATE_SERVICES = new OperatingCompanyType(_FEDEX_CORPORATE_SERVICES);
    public static final OperatingCompanyType FEDEX_CORPORATION = new OperatingCompanyType(_FEDEX_CORPORATION);
    public static final OperatingCompanyType FEDEX_CUSTOMER_INFORMATION_SYSTEMS = new OperatingCompanyType(_FEDEX_CUSTOMER_INFORMATION_SYSTEMS);
    public static final OperatingCompanyType FEDEX_CUSTOM_CRITICAL = new OperatingCompanyType(_FEDEX_CUSTOM_CRITICAL);
    public static final OperatingCompanyType FEDEX_EXPRESS = new OperatingCompanyType(_FEDEX_EXPRESS);
    public static final OperatingCompanyType FEDEX_FREIGHT = new OperatingCompanyType(_FEDEX_FREIGHT);
    public static final OperatingCompanyType FEDEX_GROUND = new OperatingCompanyType(_FEDEX_GROUND);
    public static final OperatingCompanyType FEDEX_KINKOS = new OperatingCompanyType(_FEDEX_KINKOS);
    public static final OperatingCompanyType FEDEX_OFFICE = new OperatingCompanyType(_FEDEX_OFFICE);
    public static final OperatingCompanyType FEDEX_SERVICES = new OperatingCompanyType(_FEDEX_SERVICES);
    public static final OperatingCompanyType FEDEX_TRADE_NETWORKS = new OperatingCompanyType(_FEDEX_TRADE_NETWORKS);
    public java.lang.String getValue() { return _value_;}
    public static OperatingCompanyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperatingCompanyType enumeration = (OperatingCompanyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperatingCompanyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OperatingCompanyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "OperatingCompanyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

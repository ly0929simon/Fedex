/**
 * TrackStatusAncillaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class TrackStatusAncillaryDetail  implements java.io.Serializable {
    private java.lang.String reason;

    private java.lang.String reasonDescription;

    private java.lang.String action;

    private java.lang.String actionDescription;

    public TrackStatusAncillaryDetail() {
    }

    public TrackStatusAncillaryDetail(
           java.lang.String reason,
           java.lang.String reasonDescription,
           java.lang.String action,
           java.lang.String actionDescription) {
           this.reason = reason;
           this.reasonDescription = reasonDescription;
           this.action = action;
           this.actionDescription = actionDescription;
    }


    /**
     * Gets the reason value for this TrackStatusAncillaryDetail.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this TrackStatusAncillaryDetail.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the reasonDescription value for this TrackStatusAncillaryDetail.
     * 
     * @return reasonDescription
     */
    public java.lang.String getReasonDescription() {
        return reasonDescription;
    }


    /**
     * Sets the reasonDescription value for this TrackStatusAncillaryDetail.
     * 
     * @param reasonDescription
     */
    public void setReasonDescription(java.lang.String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }


    /**
     * Gets the action value for this TrackStatusAncillaryDetail.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this TrackStatusAncillaryDetail.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the actionDescription value for this TrackStatusAncillaryDetail.
     * 
     * @return actionDescription
     */
    public java.lang.String getActionDescription() {
        return actionDescription;
    }


    /**
     * Sets the actionDescription value for this TrackStatusAncillaryDetail.
     * 
     * @param actionDescription
     */
    public void setActionDescription(java.lang.String actionDescription) {
        this.actionDescription = actionDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackStatusAncillaryDetail)) return false;
        TrackStatusAncillaryDetail other = (TrackStatusAncillaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.reasonDescription==null && other.getReasonDescription()==null) || 
             (this.reasonDescription!=null &&
              this.reasonDescription.equals(other.getReasonDescription()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.actionDescription==null && other.getActionDescription()==null) || 
             (this.actionDescription!=null &&
              this.actionDescription.equals(other.getActionDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getReasonDescription() != null) {
            _hashCode += getReasonDescription().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActionDescription() != null) {
            _hashCode += getActionDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackStatusAncillaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "TrackStatusAncillaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ReasonDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v9", "ActionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

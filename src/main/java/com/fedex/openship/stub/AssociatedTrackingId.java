/**
 * AssociatedTrackingId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Identifies a relationship from one tracked entity to another.
 */
public class AssociatedTrackingId  implements java.io.Serializable {
    /* Specifies the relationship/reason for the other tracking ID. */
    private com.fedex.openship.stub.AssociatedTrackingIdType type;

    /* Identifies the other entity. */
    private TrackingId trackingId;

    public AssociatedTrackingId() {
    }

    public AssociatedTrackingId(
           com.fedex.openship.stub.AssociatedTrackingIdType type,
           TrackingId trackingId) {
           this.type = type;
           this.trackingId = trackingId;
    }


    /**
     * Gets the type value for this AssociatedTrackingId.
     * 
     * @return type   * Specifies the relationship/reason for the other tracking ID.
     */
    public com.fedex.openship.stub.AssociatedTrackingIdType getType() {
        return type;
    }


    /**
     * Sets the type value for this AssociatedTrackingId.
     * 
     * @param type   * Specifies the relationship/reason for the other tracking ID.
     */
    public void setType(com.fedex.openship.stub.AssociatedTrackingIdType type) {
        this.type = type;
    }


    /**
     * Gets the trackingId value for this AssociatedTrackingId.
     * 
     * @return trackingId   * Identifies the other entity.
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this AssociatedTrackingId.
     * 
     * @param trackingId   * Identifies the other entity.
     */
    public void setTrackingId(TrackingId trackingId) {
        this.trackingId = trackingId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AssociatedTrackingId)) return false;
        AssociatedTrackingId other = (AssociatedTrackingId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociatedTrackingId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingId"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

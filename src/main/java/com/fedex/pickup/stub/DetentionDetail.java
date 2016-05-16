/**
 * DetentionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specifications for pup/set or vehicle delayed for loading or unloading.
 */
public class DetentionDetail  implements java.io.Serializable {
    /* Amount of time involved in the detention. */
    private org.apache.axis.types.Duration duration;

    public DetentionDetail() {
    }

    public DetentionDetail(
           org.apache.axis.types.Duration duration) {
           this.duration = duration;
    }


    /**
     * Gets the duration value for this DetentionDetail.
     * 
     * @return duration   * Amount of time involved in the detention.
     */
    public org.apache.axis.types.Duration getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DetentionDetail.
     * 
     * @param duration   * Amount of time involved in the detention.
     */
    public void setDuration(org.apache.axis.types.Duration duration) {
        this.duration = duration;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DetentionDetail)) return false;
        DetentionDetail other = (DetentionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration())));
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
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetentionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DetentionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
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

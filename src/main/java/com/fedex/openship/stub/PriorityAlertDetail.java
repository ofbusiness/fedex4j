/**
 * PriorityAlertDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class PriorityAlertDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.PriorityAlertEnhancementType[] enhancementTypes;

    private String[] content;

    public PriorityAlertDetail() {
    }

    public PriorityAlertDetail(
           com.fedex.openship.stub.PriorityAlertEnhancementType[] enhancementTypes,
           String[] content) {
           this.enhancementTypes = enhancementTypes;
           this.content = content;
    }


    /**
     * Gets the enhancementTypes value for this PriorityAlertDetail.
     * 
     * @return enhancementTypes
     */
    public com.fedex.openship.stub.PriorityAlertEnhancementType[] getEnhancementTypes() {
        return enhancementTypes;
    }


    /**
     * Sets the enhancementTypes value for this PriorityAlertDetail.
     * 
     * @param enhancementTypes
     */
    public void setEnhancementTypes(com.fedex.openship.stub.PriorityAlertEnhancementType[] enhancementTypes) {
        this.enhancementTypes = enhancementTypes;
    }

    public com.fedex.openship.stub.PriorityAlertEnhancementType getEnhancementTypes(int i) {
        return this.enhancementTypes[i];
    }

    public void setEnhancementTypes(int i, com.fedex.openship.stub.PriorityAlertEnhancementType _value) {
        this.enhancementTypes[i] = _value;
    }


    /**
     * Gets the content value for this PriorityAlertDetail.
     * 
     * @return content
     */
    public String[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this PriorityAlertDetail.
     * 
     * @param content
     */
    public void setContent(String[] content) {
        this.content = content;
    }

    public String getContent(int i) {
        return this.content[i];
    }

    public void setContent(int i, String _value) {
        this.content[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriorityAlertDetail)) return false;
        PriorityAlertDetail other = (PriorityAlertDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enhancementTypes==null && other.getEnhancementTypes()==null) || 
             (this.enhancementTypes!=null &&
              java.util.Arrays.equals(this.enhancementTypes, other.getEnhancementTypes()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent())));
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
        if (getEnhancementTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnhancementTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEnhancementTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriorityAlertDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancementTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EnhancementTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertEnhancementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

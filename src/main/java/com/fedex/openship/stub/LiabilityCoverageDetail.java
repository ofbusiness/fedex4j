/**
 * LiabilityCoverageDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class LiabilityCoverageDetail  implements java.io.Serializable {
    private LiabilityCoverageType coverageType;

    /* Identifies the Liability Coverage Amount. For Jan 2010 this
     * value represents coverage amount per pound */
    private Money coverageAmount;

    public LiabilityCoverageDetail() {
    }

    public LiabilityCoverageDetail(
           LiabilityCoverageType coverageType,
           Money coverageAmount) {
           this.coverageType = coverageType;
           this.coverageAmount = coverageAmount;
    }


    /**
     * Gets the coverageType value for this LiabilityCoverageDetail.
     * 
     * @return coverageType
     */
    public LiabilityCoverageType getCoverageType() {
        return coverageType;
    }


    /**
     * Sets the coverageType value for this LiabilityCoverageDetail.
     * 
     * @param coverageType
     */
    public void setCoverageType(LiabilityCoverageType coverageType) {
        this.coverageType = coverageType;
    }


    /**
     * Gets the coverageAmount value for this LiabilityCoverageDetail.
     * 
     * @return coverageAmount   * Identifies the Liability Coverage Amount. For Jan 2010 this
     * value represents coverage amount per pound
     */
    public Money getCoverageAmount() {
        return coverageAmount;
    }


    /**
     * Sets the coverageAmount value for this LiabilityCoverageDetail.
     * 
     * @param coverageAmount   * Identifies the Liability Coverage Amount. For Jan 2010 this
     * value represents coverage amount per pound
     */
    public void setCoverageAmount(Money coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LiabilityCoverageDetail)) return false;
        LiabilityCoverageDetail other = (LiabilityCoverageDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coverageType==null && other.getCoverageType()==null) || 
             (this.coverageType!=null &&
              this.coverageType.equals(other.getCoverageType()))) &&
            ((this.coverageAmount==null && other.getCoverageAmount()==null) || 
             (this.coverageAmount!=null &&
              this.coverageAmount.equals(other.getCoverageAmount())));
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
        if (getCoverageType() != null) {
            _hashCode += getCoverageType().hashCode();
        }
        if (getCoverageAmount() != null) {
            _hashCode += getCoverageAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiabilityCoverageDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LiabilityCoverageDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CoverageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LiabilityCoverageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CoverageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
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

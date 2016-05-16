/**
 * InternationalTrafficInArmsRegulationsDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class InternationalTrafficInArmsRegulationsDetail  implements java.io.Serializable {
    private String licenseOrExemptionNumber;

    public InternationalTrafficInArmsRegulationsDetail() {
    }

    public InternationalTrafficInArmsRegulationsDetail(
           String licenseOrExemptionNumber) {
           this.licenseOrExemptionNumber = licenseOrExemptionNumber;
    }


    /**
     * Gets the licenseOrExemptionNumber value for this InternationalTrafficInArmsRegulationsDetail.
     * 
     * @return licenseOrExemptionNumber
     */
    public String getLicenseOrExemptionNumber() {
        return licenseOrExemptionNumber;
    }


    /**
     * Sets the licenseOrExemptionNumber value for this InternationalTrafficInArmsRegulationsDetail.
     * 
     * @param licenseOrExemptionNumber
     */
    public void setLicenseOrExemptionNumber(String licenseOrExemptionNumber) {
        this.licenseOrExemptionNumber = licenseOrExemptionNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InternationalTrafficInArmsRegulationsDetail)) return false;
        InternationalTrafficInArmsRegulationsDetail other = (InternationalTrafficInArmsRegulationsDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseOrExemptionNumber==null && other.getLicenseOrExemptionNumber()==null) || 
             (this.licenseOrExemptionNumber!=null &&
              this.licenseOrExemptionNumber.equals(other.getLicenseOrExemptionNumber())));
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
        if (getLicenseOrExemptionNumber() != null) {
            _hashCode += getLicenseOrExemptionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalTrafficInArmsRegulationsDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalTrafficInArmsRegulationsDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseOrExemptionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LicenseOrExemptionNumber"));
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

/**
 * LicenseOrPermitDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class LicenseOrPermitDetail  implements java.io.Serializable {
    /* License or Permit Number. */
    private String number;

    /* Specifies the effective date of the license. */
    private java.util.Date effectiveDate;

    /* Specifies the expiration date of the license. */
    private java.util.Date expirationDate;

    public LicenseOrPermitDetail() {
    }

    public LicenseOrPermitDetail(
           String number,
           java.util.Date effectiveDate,
           java.util.Date expirationDate) {
           this.number = number;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the number value for this LicenseOrPermitDetail.
     * 
     * @return number   * License or Permit Number.
     */
    public String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this LicenseOrPermitDetail.
     * 
     * @param number   * License or Permit Number.
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * Gets the effectiveDate value for this LicenseOrPermitDetail.
     * 
     * @return effectiveDate   * Specifies the effective date of the license.
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this LicenseOrPermitDetail.
     * 
     * @param effectiveDate   * Specifies the effective date of the license.
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this LicenseOrPermitDetail.
     * 
     * @return expirationDate   * Specifies the expiration date of the license.
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this LicenseOrPermitDetail.
     * 
     * @param expirationDate   * Specifies the expiration date of the license.
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LicenseOrPermitDetail)) return false;
        LicenseOrPermitDetail other = (LicenseOrPermitDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseOrPermitDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LicenseOrPermitDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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

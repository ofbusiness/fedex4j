/**
 * TransborderDistributionLtlDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies details for origin-country LTL services performed by
 * FedEx.
 */
public class TransborderDistributionLtlDetail  implements java.io.Serializable {
    /* Payment for LTL transportation. */
    private Payment payment;

    /* Standard Carrier Alpha Code for origin-country LTL services. */
    private String ltlScacCode;

    public TransborderDistributionLtlDetail() {
    }

    public TransborderDistributionLtlDetail(
           Payment payment,
           String ltlScacCode) {
           this.payment = payment;
           this.ltlScacCode = ltlScacCode;
    }


    /**
     * Gets the payment value for this TransborderDistributionLtlDetail.
     * 
     * @return payment   * Payment for LTL transportation.
     */
    public Payment getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this TransborderDistributionLtlDetail.
     * 
     * @param payment   * Payment for LTL transportation.
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    /**
     * Gets the ltlScacCode value for this TransborderDistributionLtlDetail.
     * 
     * @return ltlScacCode   * Standard Carrier Alpha Code for origin-country LTL services.
     */
    public String getLtlScacCode() {
        return ltlScacCode;
    }


    /**
     * Sets the ltlScacCode value for this TransborderDistributionLtlDetail.
     * 
     * @param ltlScacCode   * Standard Carrier Alpha Code for origin-country LTL services.
     */
    public void setLtlScacCode(String ltlScacCode) {
        this.ltlScacCode = ltlScacCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransborderDistributionLtlDetail)) return false;
        TransborderDistributionLtlDetail other = (TransborderDistributionLtlDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.ltlScacCode==null && other.getLtlScacCode()==null) || 
             (this.ltlScacCode!=null &&
              this.ltlScacCode.equals(other.getLtlScacCode())));
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
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getLtlScacCode() != null) {
            _hashCode += getLtlScacCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransborderDistributionLtlDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionLtlDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltlScacCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LtlScacCode"));
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

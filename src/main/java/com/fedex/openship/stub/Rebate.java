/**
 * Rebate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class Rebate  implements java.io.Serializable {
    private com.fedex.openship.stub.RebateType rebateType;

    private String description;

    private Money amount;

    private java.math.BigDecimal percent;

    public Rebate() {
    }

    public Rebate(
           com.fedex.openship.stub.RebateType rebateType,
           String description,
           Money amount,
           java.math.BigDecimal percent) {
           this.rebateType = rebateType;
           this.description = description;
           this.amount = amount;
           this.percent = percent;
    }


    /**
     * Gets the rebateType value for this Rebate.
     * 
     * @return rebateType
     */
    public com.fedex.openship.stub.RebateType getRebateType() {
        return rebateType;
    }


    /**
     * Sets the rebateType value for this Rebate.
     * 
     * @param rebateType
     */
    public void setRebateType(com.fedex.openship.stub.RebateType rebateType) {
        this.rebateType = rebateType;
    }


    /**
     * Gets the description value for this Rebate.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Rebate.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this Rebate.
     * 
     * @return amount
     */
    public Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Rebate.
     * 
     * @param amount
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }


    /**
     * Gets the percent value for this Rebate.
     * 
     * @return percent
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this Rebate.
     * 
     * @param percent
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Rebate)) return false;
        Rebate other = (Rebate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rebateType==null && other.getRebateType()==null) || 
             (this.rebateType!=null &&
              this.rebateType.equals(other.getRebateType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent())));
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
        if (getRebateType() != null) {
            _hashCode += getRebateType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rebate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Rebate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RebateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RebateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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

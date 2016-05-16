/**
 * EdtTaxDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class EdtTaxDetail  implements java.io.Serializable {
    private EdtTaxType taxType;

    private java.util.Date effectiveDate;

    private String name;

    private Money taxableValue;

    private String description;

    private String formula;

    private Money amount;

    public EdtTaxDetail() {
    }

    public EdtTaxDetail(
           EdtTaxType taxType,
           java.util.Date effectiveDate,
           String name,
           Money taxableValue,
           String description,
           String formula,
           Money amount) {
           this.taxType = taxType;
           this.effectiveDate = effectiveDate;
           this.name = name;
           this.taxableValue = taxableValue;
           this.description = description;
           this.formula = formula;
           this.amount = amount;
    }


    /**
     * Gets the taxType value for this EdtTaxDetail.
     * 
     * @return taxType
     */
    public EdtTaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this EdtTaxDetail.
     * 
     * @param taxType
     */
    public void setTaxType(EdtTaxType taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the effectiveDate value for this EdtTaxDetail.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EdtTaxDetail.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the name value for this EdtTaxDetail.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this EdtTaxDetail.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the taxableValue value for this EdtTaxDetail.
     * 
     * @return taxableValue
     */
    public Money getTaxableValue() {
        return taxableValue;
    }


    /**
     * Sets the taxableValue value for this EdtTaxDetail.
     * 
     * @param taxableValue
     */
    public void setTaxableValue(Money taxableValue) {
        this.taxableValue = taxableValue;
    }


    /**
     * Gets the description value for this EdtTaxDetail.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EdtTaxDetail.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the formula value for this EdtTaxDetail.
     * 
     * @return formula
     */
    public String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this EdtTaxDetail.
     * 
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }


    /**
     * Gets the amount value for this EdtTaxDetail.
     * 
     * @return amount
     */
    public Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this EdtTaxDetail.
     * 
     * @param amount
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EdtTaxDetail)) return false;
        EdtTaxDetail other = (EdtTaxDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.taxableValue==null && other.getTaxableValue()==null) || 
             (this.taxableValue!=null &&
              this.taxableValue.equals(other.getTaxableValue()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTaxableValue() != null) {
            _hashCode += getTaxableValue().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EdtTaxDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtTaxDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtTaxType"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxableValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
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
        elemField.setFieldName("formula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Formula"));
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

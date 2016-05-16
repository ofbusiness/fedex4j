/**
 * FreightRateDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Rate data specific to FedEx Freight or FedEx National Freight services.
 */
public class FreightRateDetail  implements java.io.Serializable {
    /* A unique identifier for a specific rate quotation. */
    private String quoteNumber;

    /* Specifies whether the rate quote was automated or manual. */
    private com.fedex.openship.stub.FreightRateQuoteType quoteType;

    /* Specifies how total base charge is determined. */
    private com.fedex.openship.stub.FreightBaseChargeCalculationType baseChargeCalculation;

    /* Freight charges which accumulate to the total base charge for
     * the shipment. */
    private FreightBaseCharge[] baseCharges;

    /* Human-readable descriptions of additional information on this
     * shipment rating. */
    private com.fedex.openship.stub.FreightRateNotation[] notations;

    public FreightRateDetail() {
    }

    public FreightRateDetail(
           String quoteNumber,
           com.fedex.openship.stub.FreightRateQuoteType quoteType,
           com.fedex.openship.stub.FreightBaseChargeCalculationType baseChargeCalculation,
           FreightBaseCharge[] baseCharges,
           com.fedex.openship.stub.FreightRateNotation[] notations) {
           this.quoteNumber = quoteNumber;
           this.quoteType = quoteType;
           this.baseChargeCalculation = baseChargeCalculation;
           this.baseCharges = baseCharges;
           this.notations = notations;
    }


    /**
     * Gets the quoteNumber value for this FreightRateDetail.
     * 
     * @return quoteNumber   * A unique identifier for a specific rate quotation.
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }


    /**
     * Sets the quoteNumber value for this FreightRateDetail.
     * 
     * @param quoteNumber   * A unique identifier for a specific rate quotation.
     */
    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }


    /**
     * Gets the quoteType value for this FreightRateDetail.
     * 
     * @return quoteType   * Specifies whether the rate quote was automated or manual.
     */
    public com.fedex.openship.stub.FreightRateQuoteType getQuoteType() {
        return quoteType;
    }


    /**
     * Sets the quoteType value for this FreightRateDetail.
     * 
     * @param quoteType   * Specifies whether the rate quote was automated or manual.
     */
    public void setQuoteType(com.fedex.openship.stub.FreightRateQuoteType quoteType) {
        this.quoteType = quoteType;
    }


    /**
     * Gets the baseChargeCalculation value for this FreightRateDetail.
     * 
     * @return baseChargeCalculation   * Specifies how total base charge is determined.
     */
    public com.fedex.openship.stub.FreightBaseChargeCalculationType getBaseChargeCalculation() {
        return baseChargeCalculation;
    }


    /**
     * Sets the baseChargeCalculation value for this FreightRateDetail.
     * 
     * @param baseChargeCalculation   * Specifies how total base charge is determined.
     */
    public void setBaseChargeCalculation(com.fedex.openship.stub.FreightBaseChargeCalculationType baseChargeCalculation) {
        this.baseChargeCalculation = baseChargeCalculation;
    }


    /**
     * Gets the baseCharges value for this FreightRateDetail.
     * 
     * @return baseCharges   * Freight charges which accumulate to the total base charge for
     * the shipment.
     */
    public FreightBaseCharge[] getBaseCharges() {
        return baseCharges;
    }


    /**
     * Sets the baseCharges value for this FreightRateDetail.
     * 
     * @param baseCharges   * Freight charges which accumulate to the total base charge for
     * the shipment.
     */
    public void setBaseCharges(FreightBaseCharge[] baseCharges) {
        this.baseCharges = baseCharges;
    }

    public FreightBaseCharge getBaseCharges(int i) {
        return this.baseCharges[i];
    }

    public void setBaseCharges(int i, FreightBaseCharge _value) {
        this.baseCharges[i] = _value;
    }


    /**
     * Gets the notations value for this FreightRateDetail.
     * 
     * @return notations   * Human-readable descriptions of additional information on this
     * shipment rating.
     */
    public com.fedex.openship.stub.FreightRateNotation[] getNotations() {
        return notations;
    }


    /**
     * Sets the notations value for this FreightRateDetail.
     * 
     * @param notations   * Human-readable descriptions of additional information on this
     * shipment rating.
     */
    public void setNotations(com.fedex.openship.stub.FreightRateNotation[] notations) {
        this.notations = notations;
    }

    public com.fedex.openship.stub.FreightRateNotation getNotations(int i) {
        return this.notations[i];
    }

    public void setNotations(int i, com.fedex.openship.stub.FreightRateNotation _value) {
        this.notations[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreightRateDetail)) return false;
        FreightRateDetail other = (FreightRateDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quoteNumber==null && other.getQuoteNumber()==null) || 
             (this.quoteNumber!=null &&
              this.quoteNumber.equals(other.getQuoteNumber()))) &&
            ((this.quoteType==null && other.getQuoteType()==null) || 
             (this.quoteType!=null &&
              this.quoteType.equals(other.getQuoteType()))) &&
            ((this.baseChargeCalculation==null && other.getBaseChargeCalculation()==null) || 
             (this.baseChargeCalculation!=null &&
              this.baseChargeCalculation.equals(other.getBaseChargeCalculation()))) &&
            ((this.baseCharges==null && other.getBaseCharges()==null) || 
             (this.baseCharges!=null &&
              java.util.Arrays.equals(this.baseCharges, other.getBaseCharges()))) &&
            ((this.notations==null && other.getNotations()==null) || 
             (this.notations!=null &&
              java.util.Arrays.equals(this.notations, other.getNotations())));
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
        if (getQuoteNumber() != null) {
            _hashCode += getQuoteNumber().hashCode();
        }
        if (getQuoteType() != null) {
            _hashCode += getQuoteType().hashCode();
        }
        if (getBaseChargeCalculation() != null) {
            _hashCode += getBaseChargeCalculation().hashCode();
        }
        if (getBaseCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBaseCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotations(), i);
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
        new org.apache.axis.description.TypeDesc(FreightRateDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "QuoteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "QuoteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateQuoteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseChargeCalculation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BaseChargeCalculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightBaseChargeCalculationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BaseCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightBaseCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Notations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateNotation"));
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

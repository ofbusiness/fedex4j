/**
 * VariableHandlingCharges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * The variable handling charges calculated based on the type variable
 * handling charges requested.
 */
public class VariableHandlingCharges  implements java.io.Serializable {
    private Money variableHandlingCharge;

    private Money fixedVariableHandlingCharge;

    private Money percentVariableHandlingCharge;

    private Money totalCustomerCharge;

    public VariableHandlingCharges() {
    }

    public VariableHandlingCharges(
           Money variableHandlingCharge,
           Money fixedVariableHandlingCharge,
           Money percentVariableHandlingCharge,
           Money totalCustomerCharge) {
           this.variableHandlingCharge = variableHandlingCharge;
           this.fixedVariableHandlingCharge = fixedVariableHandlingCharge;
           this.percentVariableHandlingCharge = percentVariableHandlingCharge;
           this.totalCustomerCharge = totalCustomerCharge;
    }


    /**
     * Gets the variableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return variableHandlingCharge
     */
    public Money getVariableHandlingCharge() {
        return variableHandlingCharge;
    }


    /**
     * Sets the variableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param variableHandlingCharge
     */
    public void setVariableHandlingCharge(Money variableHandlingCharge) {
        this.variableHandlingCharge = variableHandlingCharge;
    }


    /**
     * Gets the fixedVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return fixedVariableHandlingCharge
     */
    public Money getFixedVariableHandlingCharge() {
        return fixedVariableHandlingCharge;
    }


    /**
     * Sets the fixedVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param fixedVariableHandlingCharge
     */
    public void setFixedVariableHandlingCharge(Money fixedVariableHandlingCharge) {
        this.fixedVariableHandlingCharge = fixedVariableHandlingCharge;
    }


    /**
     * Gets the percentVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return percentVariableHandlingCharge
     */
    public Money getPercentVariableHandlingCharge() {
        return percentVariableHandlingCharge;
    }


    /**
     * Sets the percentVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param percentVariableHandlingCharge
     */
    public void setPercentVariableHandlingCharge(Money percentVariableHandlingCharge) {
        this.percentVariableHandlingCharge = percentVariableHandlingCharge;
    }


    /**
     * Gets the totalCustomerCharge value for this VariableHandlingCharges.
     * 
     * @return totalCustomerCharge
     */
    public Money getTotalCustomerCharge() {
        return totalCustomerCharge;
    }


    /**
     * Sets the totalCustomerCharge value for this VariableHandlingCharges.
     * 
     * @param totalCustomerCharge
     */
    public void setTotalCustomerCharge(Money totalCustomerCharge) {
        this.totalCustomerCharge = totalCustomerCharge;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VariableHandlingCharges)) return false;
        VariableHandlingCharges other = (VariableHandlingCharges) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variableHandlingCharge==null && other.getVariableHandlingCharge()==null) || 
             (this.variableHandlingCharge!=null &&
              this.variableHandlingCharge.equals(other.getVariableHandlingCharge()))) &&
            ((this.fixedVariableHandlingCharge==null && other.getFixedVariableHandlingCharge()==null) || 
             (this.fixedVariableHandlingCharge!=null &&
              this.fixedVariableHandlingCharge.equals(other.getFixedVariableHandlingCharge()))) &&
            ((this.percentVariableHandlingCharge==null && other.getPercentVariableHandlingCharge()==null) || 
             (this.percentVariableHandlingCharge!=null &&
              this.percentVariableHandlingCharge.equals(other.getPercentVariableHandlingCharge()))) &&
            ((this.totalCustomerCharge==null && other.getTotalCustomerCharge()==null) || 
             (this.totalCustomerCharge!=null &&
              this.totalCustomerCharge.equals(other.getTotalCustomerCharge())));
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
        if (getVariableHandlingCharge() != null) {
            _hashCode += getVariableHandlingCharge().hashCode();
        }
        if (getFixedVariableHandlingCharge() != null) {
            _hashCode += getFixedVariableHandlingCharge().hashCode();
        }
        if (getPercentVariableHandlingCharge() != null) {
            _hashCode += getPercentVariableHandlingCharge().hashCode();
        }
        if (getTotalCustomerCharge() != null) {
            _hashCode += getTotalCustomerCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VariableHandlingCharges.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharges"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedVariableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FixedVariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentVariableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PercentVariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCustomerCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalCustomerCharge"));
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

/**
 * FreightSpecialServicePayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies which party will be responsible for payment of any surcharges
 * for Freight special services for which split billing is allowed.
 */
public class FreightSpecialServicePayment  implements java.io.Serializable {
    /* Identifies the special service. */
    private ShipmentSpecialServiceType specialService;

    /* Indicates who will pay for the special service. */
    private FreightShipmentRoleType paymentType;

    public FreightSpecialServicePayment() {
    }

    public FreightSpecialServicePayment(
           ShipmentSpecialServiceType specialService,
           FreightShipmentRoleType paymentType) {
           this.specialService = specialService;
           this.paymentType = paymentType;
    }


    /**
     * Gets the specialService value for this FreightSpecialServicePayment.
     * 
     * @return specialService   * Identifies the special service.
     */
    public ShipmentSpecialServiceType getSpecialService() {
        return specialService;
    }


    /**
     * Sets the specialService value for this FreightSpecialServicePayment.
     * 
     * @param specialService   * Identifies the special service.
     */
    public void setSpecialService(ShipmentSpecialServiceType specialService) {
        this.specialService = specialService;
    }


    /**
     * Gets the paymentType value for this FreightSpecialServicePayment.
     * 
     * @return paymentType   * Indicates who will pay for the special service.
     */
    public FreightShipmentRoleType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this FreightSpecialServicePayment.
     * 
     * @param paymentType   * Indicates who will pay for the special service.
     */
    public void setPaymentType(FreightShipmentRoleType paymentType) {
        this.paymentType = paymentType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreightSpecialServicePayment)) return false;
        FreightSpecialServicePayment other = (FreightSpecialServicePayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialService==null && other.getSpecialService()==null) || 
             (this.specialService!=null &&
              this.specialService.equals(other.getSpecialService()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType())));
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
        if (getSpecialService() != null) {
            _hashCode += getSpecialService().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreightSpecialServicePayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightSpecialServicePayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentRoleType"));
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

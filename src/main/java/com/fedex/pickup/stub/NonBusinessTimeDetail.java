/**
 * NonBusinessTimeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specification for services performed during non-business hours
 * and/or days.
 */
public class NonBusinessTimeDetail  implements java.io.Serializable {
    /* Total number of person days for full non-business days. */
    private org.apache.axis.types.NonNegativeInteger personDays;

    /* Total number of person hours (whole or partial hours) for non-business
     * hours. */
    private org.apache.axis.types.NonNegativeInteger personHours;

    public NonBusinessTimeDetail() {
    }

    public NonBusinessTimeDetail(
           org.apache.axis.types.NonNegativeInteger personDays,
           org.apache.axis.types.NonNegativeInteger personHours) {
           this.personDays = personDays;
           this.personHours = personHours;
    }


    /**
     * Gets the personDays value for this NonBusinessTimeDetail.
     * 
     * @return personDays   * Total number of person days for full non-business days.
     */
    public org.apache.axis.types.NonNegativeInteger getPersonDays() {
        return personDays;
    }


    /**
     * Sets the personDays value for this NonBusinessTimeDetail.
     * 
     * @param personDays   * Total number of person days for full non-business days.
     */
    public void setPersonDays(org.apache.axis.types.NonNegativeInteger personDays) {
        this.personDays = personDays;
    }


    /**
     * Gets the personHours value for this NonBusinessTimeDetail.
     * 
     * @return personHours   * Total number of person hours (whole or partial hours) for non-business
     * hours.
     */
    public org.apache.axis.types.NonNegativeInteger getPersonHours() {
        return personHours;
    }


    /**
     * Sets the personHours value for this NonBusinessTimeDetail.
     * 
     * @param personHours   * Total number of person hours (whole or partial hours) for non-business
     * hours.
     */
    public void setPersonHours(org.apache.axis.types.NonNegativeInteger personHours) {
        this.personHours = personHours;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NonBusinessTimeDetail)) return false;
        NonBusinessTimeDetail other = (NonBusinessTimeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.personDays==null && other.getPersonDays()==null) || 
             (this.personDays!=null &&
              this.personDays.equals(other.getPersonDays()))) &&
            ((this.personHours==null && other.getPersonHours()==null) || 
             (this.personHours!=null &&
              this.personHours.equals(other.getPersonHours())));
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
        if (getPersonDays() != null) {
            _hashCode += getPersonDays().hashCode();
        }
        if (getPersonHours() != null) {
            _hashCode += getPersonHours().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NonBusinessTimeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "NonBusinessTimeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PersonDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PersonHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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

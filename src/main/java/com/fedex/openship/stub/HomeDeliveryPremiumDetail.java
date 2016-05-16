/**
 * HomeDeliveryPremiumDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * The descriptive data required by FedEx for home delivery services.
 */
public class HomeDeliveryPremiumDetail  implements java.io.Serializable {
    /* The type of Home Delivery Premium service being requested. */
    private HomeDeliveryPremiumType homeDeliveryPremiumType;

    private java.util.Date date;

    private String phoneNumber;

    public HomeDeliveryPremiumDetail() {
    }

    public HomeDeliveryPremiumDetail(
           HomeDeliveryPremiumType homeDeliveryPremiumType,
           java.util.Date date,
           String phoneNumber) {
           this.homeDeliveryPremiumType = homeDeliveryPremiumType;
           this.date = date;
           this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the homeDeliveryPremiumType value for this HomeDeliveryPremiumDetail.
     * 
     * @return homeDeliveryPremiumType   * The type of Home Delivery Premium service being requested.
     */
    public HomeDeliveryPremiumType getHomeDeliveryPremiumType() {
        return homeDeliveryPremiumType;
    }


    /**
     * Sets the homeDeliveryPremiumType value for this HomeDeliveryPremiumDetail.
     * 
     * @param homeDeliveryPremiumType   * The type of Home Delivery Premium service being requested.
     */
    public void setHomeDeliveryPremiumType(HomeDeliveryPremiumType homeDeliveryPremiumType) {
        this.homeDeliveryPremiumType = homeDeliveryPremiumType;
    }


    /**
     * Gets the date value for this HomeDeliveryPremiumDetail.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this HomeDeliveryPremiumDetail.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the phoneNumber value for this HomeDeliveryPremiumDetail.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this HomeDeliveryPremiumDetail.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HomeDeliveryPremiumDetail)) return false;
        HomeDeliveryPremiumDetail other = (HomeDeliveryPremiumDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeDeliveryPremiumType==null && other.getHomeDeliveryPremiumType()==null) || 
             (this.homeDeliveryPremiumType!=null &&
              this.homeDeliveryPremiumType.equals(other.getHomeDeliveryPremiumType()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber())));
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
        if (getHomeDeliveryPremiumType() != null) {
            _hashCode += getHomeDeliveryPremiumType().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDeliveryPremiumDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HomeDeliveryPremiumDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryPremiumType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HomeDeliveryPremiumType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HomeDeliveryPremiumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PhoneNumber"));
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

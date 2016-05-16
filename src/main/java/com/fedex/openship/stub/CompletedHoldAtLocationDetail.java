/**
 * CompletedHoldAtLocationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CompletedHoldAtLocationDetail  implements java.io.Serializable {
    /* Identifies the branded location name, the hold at location
     * phone number and the address of the location. */
    private ContactAndAddress holdingLocation;

    /* Identifies the type of FedEx location. */
    private FedExLocationType holdingLocationType;

    public CompletedHoldAtLocationDetail() {
    }

    public CompletedHoldAtLocationDetail(
           ContactAndAddress holdingLocation,
           FedExLocationType holdingLocationType) {
           this.holdingLocation = holdingLocation;
           this.holdingLocationType = holdingLocationType;
    }


    /**
     * Gets the holdingLocation value for this CompletedHoldAtLocationDetail.
     * 
     * @return holdingLocation   * Identifies the branded location name, the hold at location
     * phone number and the address of the location.
     */
    public ContactAndAddress getHoldingLocation() {
        return holdingLocation;
    }


    /**
     * Sets the holdingLocation value for this CompletedHoldAtLocationDetail.
     * 
     * @param holdingLocation   * Identifies the branded location name, the hold at location
     * phone number and the address of the location.
     */
    public void setHoldingLocation(ContactAndAddress holdingLocation) {
        this.holdingLocation = holdingLocation;
    }


    /**
     * Gets the holdingLocationType value for this CompletedHoldAtLocationDetail.
     * 
     * @return holdingLocationType   * Identifies the type of FedEx location.
     */
    public FedExLocationType getHoldingLocationType() {
        return holdingLocationType;
    }


    /**
     * Sets the holdingLocationType value for this CompletedHoldAtLocationDetail.
     * 
     * @param holdingLocationType   * Identifies the type of FedEx location.
     */
    public void setHoldingLocationType(FedExLocationType holdingLocationType) {
        this.holdingLocationType = holdingLocationType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedHoldAtLocationDetail)) return false;
        CompletedHoldAtLocationDetail other = (CompletedHoldAtLocationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.holdingLocation==null && other.getHoldingLocation()==null) || 
             (this.holdingLocation!=null &&
              this.holdingLocation.equals(other.getHoldingLocation()))) &&
            ((this.holdingLocationType==null && other.getHoldingLocationType()==null) || 
             (this.holdingLocationType!=null &&
              this.holdingLocationType.equals(other.getHoldingLocationType())));
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
        if (getHoldingLocation() != null) {
            _hashCode += getHoldingLocation().hashCode();
        }
        if (getHoldingLocationType() != null) {
            _hashCode += getHoldingLocationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedHoldAtLocationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHoldAtLocationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HoldingLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdingLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HoldingLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FedExLocationType"));
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

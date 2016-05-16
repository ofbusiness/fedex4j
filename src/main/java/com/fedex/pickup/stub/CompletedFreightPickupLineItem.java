/**
 * CompletedFreightPickupLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Data resulting from the processing of an individual line item in
 * a LTL Freight pickup request.
 */
public class CompletedFreightPickupLineItem  implements java.io.Serializable {
    /* Identifies the line item, to match reply line with request
     * line. */
    private Integer sequenceNumber;

    /* Describes the destination service center handling the delivery
     * of this line item. */
    private FreightServiceCenterDetail destination;

    /* Total travel time for this line item. */
    private org.apache.axis.types.Duration totalTravelTime;

    /* Identifies estimated delivery date and time for each line item. */
    private java.util.Calendar etaDeliveryTimestamp;

    public CompletedFreightPickupLineItem() {
    }

    public CompletedFreightPickupLineItem(
           Integer sequenceNumber,
           FreightServiceCenterDetail destination,
           org.apache.axis.types.Duration totalTravelTime,
           java.util.Calendar etaDeliveryTimestamp) {
           this.sequenceNumber = sequenceNumber;
           this.destination = destination;
           this.totalTravelTime = totalTravelTime;
           this.etaDeliveryTimestamp = etaDeliveryTimestamp;
    }


    /**
     * Gets the sequenceNumber value for this CompletedFreightPickupLineItem.
     * 
     * @return sequenceNumber   * Identifies the line item, to match reply line with request
     * line.
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this CompletedFreightPickupLineItem.
     * 
     * @param sequenceNumber   * Identifies the line item, to match reply line with request
     * line.
     */
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the destination value for this CompletedFreightPickupLineItem.
     * 
     * @return destination   * Describes the destination service center handling the delivery
     * of this line item.
     */
    public FreightServiceCenterDetail getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this CompletedFreightPickupLineItem.
     * 
     * @param destination   * Describes the destination service center handling the delivery
     * of this line item.
     */
    public void setDestination(FreightServiceCenterDetail destination) {
        this.destination = destination;
    }


    /**
     * Gets the totalTravelTime value for this CompletedFreightPickupLineItem.
     * 
     * @return totalTravelTime   * Total travel time for this line item.
     */
    public org.apache.axis.types.Duration getTotalTravelTime() {
        return totalTravelTime;
    }


    /**
     * Sets the totalTravelTime value for this CompletedFreightPickupLineItem.
     * 
     * @param totalTravelTime   * Total travel time for this line item.
     */
    public void setTotalTravelTime(org.apache.axis.types.Duration totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }


    /**
     * Gets the etaDeliveryTimestamp value for this CompletedFreightPickupLineItem.
     * 
     * @return etaDeliveryTimestamp   * Identifies estimated delivery date and time for each line item.
     */
    public java.util.Calendar getEtaDeliveryTimestamp() {
        return etaDeliveryTimestamp;
    }


    /**
     * Sets the etaDeliveryTimestamp value for this CompletedFreightPickupLineItem.
     * 
     * @param etaDeliveryTimestamp   * Identifies estimated delivery date and time for each line item.
     */
    public void setEtaDeliveryTimestamp(java.util.Calendar etaDeliveryTimestamp) {
        this.etaDeliveryTimestamp = etaDeliveryTimestamp;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedFreightPickupLineItem)) return false;
        CompletedFreightPickupLineItem other = (CompletedFreightPickupLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.totalTravelTime==null && other.getTotalTravelTime()==null) || 
             (this.totalTravelTime!=null &&
              this.totalTravelTime.equals(other.getTotalTravelTime()))) &&
            ((this.etaDeliveryTimestamp==null && other.getEtaDeliveryTimestamp()==null) || 
             (this.etaDeliveryTimestamp!=null &&
              this.etaDeliveryTimestamp.equals(other.getEtaDeliveryTimestamp())));
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
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getTotalTravelTime() != null) {
            _hashCode += getTotalTravelTime().hashCode();
        }
        if (getEtaDeliveryTimestamp() != null) {
            _hashCode += getEtaDeliveryTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedFreightPickupLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompletedFreightPickupLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightServiceCenterDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTravelTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalTravelTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etaDeliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EtaDeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

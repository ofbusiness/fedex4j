/**
 * CompletedSmartPostDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Provides reply information specific to SmartPost shipments.
 */
public class CompletedSmartPostDetail  implements java.io.Serializable {
    /* Identifies the carrier that will pick up the SmartPost shipment. */
    private CarrierCodeType pickUpCarrier;

    /* Indicates whether the shipment is deemed to be machineable,
     * based on dimensions, weight, and packaging. */
    private Boolean machinable;

    public CompletedSmartPostDetail() {
    }

    public CompletedSmartPostDetail(
           CarrierCodeType pickUpCarrier,
           Boolean machinable) {
           this.pickUpCarrier = pickUpCarrier;
           this.machinable = machinable;
    }


    /**
     * Gets the pickUpCarrier value for this CompletedSmartPostDetail.
     * 
     * @return pickUpCarrier   * Identifies the carrier that will pick up the SmartPost shipment.
     */
    public CarrierCodeType getPickUpCarrier() {
        return pickUpCarrier;
    }


    /**
     * Sets the pickUpCarrier value for this CompletedSmartPostDetail.
     * 
     * @param pickUpCarrier   * Identifies the carrier that will pick up the SmartPost shipment.
     */
    public void setPickUpCarrier(CarrierCodeType pickUpCarrier) {
        this.pickUpCarrier = pickUpCarrier;
    }


    /**
     * Gets the machinable value for this CompletedSmartPostDetail.
     * 
     * @return machinable   * Indicates whether the shipment is deemed to be machineable,
     * based on dimensions, weight, and packaging.
     */
    public Boolean getMachinable() {
        return machinable;
    }


    /**
     * Sets the machinable value for this CompletedSmartPostDetail.
     * 
     * @param machinable   * Indicates whether the shipment is deemed to be machineable,
     * based on dimensions, weight, and packaging.
     */
    public void setMachinable(Boolean machinable) {
        this.machinable = machinable;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedSmartPostDetail)) return false;
        CompletedSmartPostDetail other = (CompletedSmartPostDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pickUpCarrier==null && other.getPickUpCarrier()==null) || 
             (this.pickUpCarrier!=null &&
              this.pickUpCarrier.equals(other.getPickUpCarrier()))) &&
            ((this.machinable==null && other.getMachinable()==null) || 
             (this.machinable!=null &&
              this.machinable.equals(other.getMachinable())));
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
        if (getPickUpCarrier() != null) {
            _hashCode += getPickUpCarrier().hashCode();
        }
        if (getMachinable() != null) {
            _hashCode += getMachinable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedSmartPostDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedSmartPostDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickUpCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickUpCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machinable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Machinable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

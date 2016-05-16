/**
 * ShipmentRating.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * This class groups together all shipment-level rate data (across
 * all rate types) as part of the response to a shipping request, which
 * groups shipment-level data together and groups package-level data
 * by package.
 */
public class ShipmentRating  implements java.io.Serializable {
    /* This rate type identifies which entry in the following array
     * is considered as presenting the "actual" rates for the shipment. */
    private com.fedex.openship.stub.ReturnedRateType actualRateType;

    /* The "list" total net charge minus "actual" total net charge. */
    private Money effectiveNetDiscount;

    /* Each element of this field provides shipment-level rate totals
     * for a specific rate type. */
    private com.fedex.openship.stub.ShipmentRateDetail[] shipmentRateDetails;

    public ShipmentRating() {
    }

    public ShipmentRating(
           com.fedex.openship.stub.ReturnedRateType actualRateType,
           Money effectiveNetDiscount,
           com.fedex.openship.stub.ShipmentRateDetail[] shipmentRateDetails) {
           this.actualRateType = actualRateType;
           this.effectiveNetDiscount = effectiveNetDiscount;
           this.shipmentRateDetails = shipmentRateDetails;
    }


    /**
     * Gets the actualRateType value for this ShipmentRating.
     * 
     * @return actualRateType   * This rate type identifies which entry in the following array
     * is considered as presenting the "actual" rates for the shipment.
     */
    public com.fedex.openship.stub.ReturnedRateType getActualRateType() {
        return actualRateType;
    }


    /**
     * Sets the actualRateType value for this ShipmentRating.
     * 
     * @param actualRateType   * This rate type identifies which entry in the following array
     * is considered as presenting the "actual" rates for the shipment.
     */
    public void setActualRateType(com.fedex.openship.stub.ReturnedRateType actualRateType) {
        this.actualRateType = actualRateType;
    }


    /**
     * Gets the effectiveNetDiscount value for this ShipmentRating.
     * 
     * @return effectiveNetDiscount   * The "list" total net charge minus "actual" total net charge.
     */
    public Money getEffectiveNetDiscount() {
        return effectiveNetDiscount;
    }


    /**
     * Sets the effectiveNetDiscount value for this ShipmentRating.
     * 
     * @param effectiveNetDiscount   * The "list" total net charge minus "actual" total net charge.
     */
    public void setEffectiveNetDiscount(Money effectiveNetDiscount) {
        this.effectiveNetDiscount = effectiveNetDiscount;
    }


    /**
     * Gets the shipmentRateDetails value for this ShipmentRating.
     * 
     * @return shipmentRateDetails   * Each element of this field provides shipment-level rate totals
     * for a specific rate type.
     */
    public com.fedex.openship.stub.ShipmentRateDetail[] getShipmentRateDetails() {
        return shipmentRateDetails;
    }


    /**
     * Sets the shipmentRateDetails value for this ShipmentRating.
     * 
     * @param shipmentRateDetails   * Each element of this field provides shipment-level rate totals
     * for a specific rate type.
     */
    public void setShipmentRateDetails(com.fedex.openship.stub.ShipmentRateDetail[] shipmentRateDetails) {
        this.shipmentRateDetails = shipmentRateDetails;
    }

    public com.fedex.openship.stub.ShipmentRateDetail getShipmentRateDetails(int i) {
        return this.shipmentRateDetails[i];
    }

    public void setShipmentRateDetails(int i, com.fedex.openship.stub.ShipmentRateDetail _value) {
        this.shipmentRateDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentRating)) return false;
        ShipmentRating other = (ShipmentRating) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualRateType==null && other.getActualRateType()==null) || 
             (this.actualRateType!=null &&
              this.actualRateType.equals(other.getActualRateType()))) &&
            ((this.effectiveNetDiscount==null && other.getEffectiveNetDiscount()==null) || 
             (this.effectiveNetDiscount!=null &&
              this.effectiveNetDiscount.equals(other.getEffectiveNetDiscount()))) &&
            ((this.shipmentRateDetails==null && other.getShipmentRateDetails()==null) || 
             (this.shipmentRateDetails!=null &&
              java.util.Arrays.equals(this.shipmentRateDetails, other.getShipmentRateDetails())));
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
        if (getActualRateType() != null) {
            _hashCode += getActualRateType().hashCode();
        }
        if (getEffectiveNetDiscount() != null) {
            _hashCode += getEffectiveNetDiscount().hashCode();
        }
        if (getShipmentRateDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentRateDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShipmentRateDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ShipmentRating.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRating"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ActualRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveNetDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EffectiveNetDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentRateDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRateDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRateDetail"));
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

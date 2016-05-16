/**
 * CompletedFreightPickupDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Data resulting from the processing of an LTL Freight pickup request.
 */
public class CompletedFreightPickupDetail  implements java.io.Serializable {
    /* Describes the origin service center handling the pickup. */
    private FreightServiceCenterDetail origin;

    /* Describes the results for each line item in the original request. */
    private com.fedex.pickup.stub.CompletedFreightPickupLineItem[] lineItems;

    /* Total number of pieces from all line items from request. */
    private org.apache.axis.types.NonNegativeInteger totalPieces;

    /* Total weight from all line items from request. */
    private Weight totalWeight;

    /* Total handling units from all line items from request. */
    private org.apache.axis.types.NonNegativeInteger totalHandlingUnits;

    /* Resulting status of pickup. */
    private PickupEventType status;

    public CompletedFreightPickupDetail() {
    }

    public CompletedFreightPickupDetail(
           FreightServiceCenterDetail origin,
           com.fedex.pickup.stub.CompletedFreightPickupLineItem[] lineItems,
           org.apache.axis.types.NonNegativeInteger totalPieces,
           Weight totalWeight,
           org.apache.axis.types.NonNegativeInteger totalHandlingUnits,
           PickupEventType status) {
           this.origin = origin;
           this.lineItems = lineItems;
           this.totalPieces = totalPieces;
           this.totalWeight = totalWeight;
           this.totalHandlingUnits = totalHandlingUnits;
           this.status = status;
    }


    /**
     * Gets the origin value for this CompletedFreightPickupDetail.
     * 
     * @return origin   * Describes the origin service center handling the pickup.
     */
    public FreightServiceCenterDetail getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this CompletedFreightPickupDetail.
     * 
     * @param origin   * Describes the origin service center handling the pickup.
     */
    public void setOrigin(FreightServiceCenterDetail origin) {
        this.origin = origin;
    }


    /**
     * Gets the lineItems value for this CompletedFreightPickupDetail.
     * 
     * @return lineItems   * Describes the results for each line item in the original request.
     */
    public com.fedex.pickup.stub.CompletedFreightPickupLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this CompletedFreightPickupDetail.
     * 
     * @param lineItems   * Describes the results for each line item in the original request.
     */
    public void setLineItems(com.fedex.pickup.stub.CompletedFreightPickupLineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.fedex.pickup.stub.CompletedFreightPickupLineItem getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.fedex.pickup.stub.CompletedFreightPickupLineItem _value) {
        this.lineItems[i] = _value;
    }


    /**
     * Gets the totalPieces value for this CompletedFreightPickupDetail.
     * 
     * @return totalPieces   * Total number of pieces from all line items from request.
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPieces() {
        return totalPieces;
    }


    /**
     * Sets the totalPieces value for this CompletedFreightPickupDetail.
     * 
     * @param totalPieces   * Total number of pieces from all line items from request.
     */
    public void setTotalPieces(org.apache.axis.types.NonNegativeInteger totalPieces) {
        this.totalPieces = totalPieces;
    }


    /**
     * Gets the totalWeight value for this CompletedFreightPickupDetail.
     * 
     * @return totalWeight   * Total weight from all line items from request.
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this CompletedFreightPickupDetail.
     * 
     * @param totalWeight   * Total weight from all line items from request.
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalHandlingUnits value for this CompletedFreightPickupDetail.
     * 
     * @return totalHandlingUnits   * Total handling units from all line items from request.
     */
    public org.apache.axis.types.NonNegativeInteger getTotalHandlingUnits() {
        return totalHandlingUnits;
    }


    /**
     * Sets the totalHandlingUnits value for this CompletedFreightPickupDetail.
     * 
     * @param totalHandlingUnits   * Total handling units from all line items from request.
     */
    public void setTotalHandlingUnits(org.apache.axis.types.NonNegativeInteger totalHandlingUnits) {
        this.totalHandlingUnits = totalHandlingUnits;
    }


    /**
     * Gets the status value for this CompletedFreightPickupDetail.
     * 
     * @return status   * Resulting status of pickup.
     */
    public PickupEventType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CompletedFreightPickupDetail.
     * 
     * @param status   * Resulting status of pickup.
     */
    public void setStatus(PickupEventType status) {
        this.status = status;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedFreightPickupDetail)) return false;
        CompletedFreightPickupDetail other = (CompletedFreightPickupDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems()))) &&
            ((this.totalPieces==null && other.getTotalPieces()==null) || 
             (this.totalPieces!=null &&
              this.totalPieces.equals(other.getTotalPieces()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalHandlingUnits==null && other.getTotalHandlingUnits()==null) || 
             (this.totalHandlingUnits!=null &&
              this.totalHandlingUnits.equals(other.getTotalHandlingUnits()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalPieces() != null) {
            _hashCode += getTotalPieces().hashCode();
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalHandlingUnits() != null) {
            _hashCode += getTotalHandlingUnits().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedFreightPickupDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompletedFreightPickupDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightServiceCenterDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompletedFreightPickupLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalPieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHandlingUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalHandlingUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupEventType"));
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

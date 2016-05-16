/**
 * FreightPickupLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class FreightPickupLineItem  implements java.io.Serializable {
    private ServiceType service;

    /* Identifies the line item, to match reply line with request
     * line. */
    private org.apache.axis.types.NonNegativeInteger sequenceNumber;

    private Address destination;

    private com.fedex.pickup.stub.PhysicalPackagingType packaging;

    private Integer pieces;

    private Weight weight;

    private Integer totalHandlingUnits;

    private String purchaseOrderNumber;

    private Boolean justOneMore;

    private com.fedex.pickup.stub.ShipmentSpecialServicesRequested specialServicesRequested;

    private String description;

    public FreightPickupLineItem() {
    }

    public FreightPickupLineItem(
           ServiceType service,
           org.apache.axis.types.NonNegativeInteger sequenceNumber,
           Address destination,
           com.fedex.pickup.stub.PhysicalPackagingType packaging,
           Integer pieces,
           Weight weight,
           Integer totalHandlingUnits,
           String purchaseOrderNumber,
           Boolean justOneMore,
           com.fedex.pickup.stub.ShipmentSpecialServicesRequested specialServicesRequested,
           String description) {
           this.service = service;
           this.sequenceNumber = sequenceNumber;
           this.destination = destination;
           this.packaging = packaging;
           this.pieces = pieces;
           this.weight = weight;
           this.totalHandlingUnits = totalHandlingUnits;
           this.purchaseOrderNumber = purchaseOrderNumber;
           this.justOneMore = justOneMore;
           this.specialServicesRequested = specialServicesRequested;
           this.description = description;
    }


    /**
     * Gets the service value for this FreightPickupLineItem.
     * 
     * @return service
     */
    public ServiceType getService() {
        return service;
    }


    /**
     * Sets the service value for this FreightPickupLineItem.
     * 
     * @param service
     */
    public void setService(ServiceType service) {
        this.service = service;
    }


    /**
     * Gets the sequenceNumber value for this FreightPickupLineItem.
     * 
     * @return sequenceNumber   * Identifies the line item, to match reply line with request
     * line.
     */
    public org.apache.axis.types.NonNegativeInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this FreightPickupLineItem.
     * 
     * @param sequenceNumber   * Identifies the line item, to match reply line with request
     * line.
     */
    public void setSequenceNumber(org.apache.axis.types.NonNegativeInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the destination value for this FreightPickupLineItem.
     * 
     * @return destination
     */
    public Address getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FreightPickupLineItem.
     * 
     * @param destination
     */
    public void setDestination(Address destination) {
        this.destination = destination;
    }


    /**
     * Gets the packaging value for this FreightPickupLineItem.
     * 
     * @return packaging
     */
    public com.fedex.pickup.stub.PhysicalPackagingType getPackaging() {
        return packaging;
    }


    /**
     * Sets the packaging value for this FreightPickupLineItem.
     * 
     * @param packaging
     */
    public void setPackaging(com.fedex.pickup.stub.PhysicalPackagingType packaging) {
        this.packaging = packaging;
    }


    /**
     * Gets the pieces value for this FreightPickupLineItem.
     * 
     * @return pieces
     */
    public Integer getPieces() {
        return pieces;
    }


    /**
     * Sets the pieces value for this FreightPickupLineItem.
     * 
     * @param pieces
     */
    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }


    /**
     * Gets the weight value for this FreightPickupLineItem.
     * 
     * @return weight
     */
    public Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this FreightPickupLineItem.
     * 
     * @param weight
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }


    /**
     * Gets the totalHandlingUnits value for this FreightPickupLineItem.
     * 
     * @return totalHandlingUnits
     */
    public Integer getTotalHandlingUnits() {
        return totalHandlingUnits;
    }


    /**
     * Sets the totalHandlingUnits value for this FreightPickupLineItem.
     * 
     * @param totalHandlingUnits
     */
    public void setTotalHandlingUnits(Integer totalHandlingUnits) {
        this.totalHandlingUnits = totalHandlingUnits;
    }


    /**
     * Gets the purchaseOrderNumber value for this FreightPickupLineItem.
     * 
     * @return purchaseOrderNumber
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }


    /**
     * Sets the purchaseOrderNumber value for this FreightPickupLineItem.
     * 
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }


    /**
     * Gets the justOneMore value for this FreightPickupLineItem.
     * 
     * @return justOneMore
     */
    public Boolean getJustOneMore() {
        return justOneMore;
    }


    /**
     * Sets the justOneMore value for this FreightPickupLineItem.
     * 
     * @param justOneMore
     */
    public void setJustOneMore(Boolean justOneMore) {
        this.justOneMore = justOneMore;
    }


    /**
     * Gets the specialServicesRequested value for this FreightPickupLineItem.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.pickup.stub.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this FreightPickupLineItem.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.pickup.stub.ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the description value for this FreightPickupLineItem.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FreightPickupLineItem.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreightPickupLineItem)) return false;
        FreightPickupLineItem other = (FreightPickupLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.packaging==null && other.getPackaging()==null) || 
             (this.packaging!=null &&
              this.packaging.equals(other.getPackaging()))) &&
            ((this.pieces==null && other.getPieces()==null) || 
             (this.pieces!=null &&
              this.pieces.equals(other.getPieces()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.totalHandlingUnits==null && other.getTotalHandlingUnits()==null) || 
             (this.totalHandlingUnits!=null &&
              this.totalHandlingUnits.equals(other.getTotalHandlingUnits()))) &&
            ((this.purchaseOrderNumber==null && other.getPurchaseOrderNumber()==null) || 
             (this.purchaseOrderNumber!=null &&
              this.purchaseOrderNumber.equals(other.getPurchaseOrderNumber()))) &&
            ((this.justOneMore==null && other.getJustOneMore()==null) || 
             (this.justOneMore!=null &&
              this.justOneMore.equals(other.getJustOneMore()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getPackaging() != null) {
            _hashCode += getPackaging().hashCode();
        }
        if (getPieces() != null) {
            _hashCode += getPieces().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getTotalHandlingUnits() != null) {
            _hashCode += getTotalHandlingUnits().hashCode();
        }
        if (getPurchaseOrderNumber() != null) {
            _hashCode += getPurchaseOrderNumber().hashCode();
        }
        if (getJustOneMore() != null) {
            _hashCode += getJustOneMore().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreightPickupLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightPickupLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PhysicalPackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Pieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHandlingUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalHandlingUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justOneMore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "JustOneMore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Description"));
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

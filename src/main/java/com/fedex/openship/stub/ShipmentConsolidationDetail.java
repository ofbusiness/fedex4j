/**
 * ShipmentConsolidationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the characteristics of the containing RequestedShipment
 * that define its participation in a consolidation.
 */
public class ShipmentConsolidationDetail  implements java.io.Serializable {
    /* The time at which this shipment was associated with the consolidation. */
    private String relationshipTimestamp;

    /* The type of consolidation that contains this shipment. */
    private ConsolidationType type;

    /* The role this shipment plays within the consolidation. */
    private com.fedex.openship.stub.ConsolidationShipmentRoleType role;

    /* Identifies other tracking IDs related to this shipment within
     * the same consolidation. */
    private AssociatedTrackingId[] associatedTrackingIds;

    /* Specifies the consolidation-level special services to be performed
     * for this shipment. */
    private com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested;

    /* Specifies attributes of a shipment within an international
     * distribution. */
    private com.fedex.openship.stub.ShipmentInternationalDistributionDetail internationalDistributionDetail;

    /* Specifies attributes of a shipment within a transborder distribution. */
    private com.fedex.openship.stub.ShipmentTransborderDistributionDetail transborderDistributionDetail;

    public ShipmentConsolidationDetail() {
    }

    public ShipmentConsolidationDetail(
           String relationshipTimestamp,
           ConsolidationType type,
           com.fedex.openship.stub.ConsolidationShipmentRoleType role,
           AssociatedTrackingId[] associatedTrackingIds,
           com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested,
           com.fedex.openship.stub.ShipmentInternationalDistributionDetail internationalDistributionDetail,
           com.fedex.openship.stub.ShipmentTransborderDistributionDetail transborderDistributionDetail) {
           this.relationshipTimestamp = relationshipTimestamp;
           this.type = type;
           this.role = role;
           this.associatedTrackingIds = associatedTrackingIds;
           this.specialServicesRequested = specialServicesRequested;
           this.internationalDistributionDetail = internationalDistributionDetail;
           this.transborderDistributionDetail = transborderDistributionDetail;
    }


    /**
     * Gets the relationshipTimestamp value for this ShipmentConsolidationDetail.
     * 
     * @return relationshipTimestamp   * The time at which this shipment was associated with the consolidation.
     */
    public String getRelationshipTimestamp() {
        return relationshipTimestamp;
    }


    /**
     * Sets the relationshipTimestamp value for this ShipmentConsolidationDetail.
     * 
     * @param relationshipTimestamp   * The time at which this shipment was associated with the consolidation.
     */
    public void setRelationshipTimestamp(String relationshipTimestamp) {
        this.relationshipTimestamp = relationshipTimestamp;
    }


    /**
     * Gets the type value for this ShipmentConsolidationDetail.
     * 
     * @return type   * The type of consolidation that contains this shipment.
     */
    public ConsolidationType getType() {
        return type;
    }


    /**
     * Sets the type value for this ShipmentConsolidationDetail.
     * 
     * @param type   * The type of consolidation that contains this shipment.
     */
    public void setType(ConsolidationType type) {
        this.type = type;
    }


    /**
     * Gets the role value for this ShipmentConsolidationDetail.
     * 
     * @return role   * The role this shipment plays within the consolidation.
     */
    public com.fedex.openship.stub.ConsolidationShipmentRoleType getRole() {
        return role;
    }


    /**
     * Sets the role value for this ShipmentConsolidationDetail.
     * 
     * @param role   * The role this shipment plays within the consolidation.
     */
    public void setRole(com.fedex.openship.stub.ConsolidationShipmentRoleType role) {
        this.role = role;
    }


    /**
     * Gets the associatedTrackingIds value for this ShipmentConsolidationDetail.
     * 
     * @return associatedTrackingIds   * Identifies other tracking IDs related to this shipment within
     * the same consolidation.
     */
    public AssociatedTrackingId[] getAssociatedTrackingIds() {
        return associatedTrackingIds;
    }


    /**
     * Sets the associatedTrackingIds value for this ShipmentConsolidationDetail.
     * 
     * @param associatedTrackingIds   * Identifies other tracking IDs related to this shipment within
     * the same consolidation.
     */
    public void setAssociatedTrackingIds(AssociatedTrackingId[] associatedTrackingIds) {
        this.associatedTrackingIds = associatedTrackingIds;
    }

    public AssociatedTrackingId getAssociatedTrackingIds(int i) {
        return this.associatedTrackingIds[i];
    }

    public void setAssociatedTrackingIds(int i, AssociatedTrackingId _value) {
        this.associatedTrackingIds[i] = _value;
    }


    /**
     * Gets the specialServicesRequested value for this ShipmentConsolidationDetail.
     * 
     * @return specialServicesRequested   * Specifies the consolidation-level special services to be performed
     * for this shipment.
     */
    public com.fedex.openship.stub.ConsolidationSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this ShipmentConsolidationDetail.
     * 
     * @param specialServicesRequested   * Specifies the consolidation-level special services to be performed
     * for this shipment.
     */
    public void setSpecialServicesRequested(com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the internationalDistributionDetail value for this ShipmentConsolidationDetail.
     * 
     * @return internationalDistributionDetail   * Specifies attributes of a shipment within an international
     * distribution.
     */
    public com.fedex.openship.stub.ShipmentInternationalDistributionDetail getInternationalDistributionDetail() {
        return internationalDistributionDetail;
    }


    /**
     * Sets the internationalDistributionDetail value for this ShipmentConsolidationDetail.
     * 
     * @param internationalDistributionDetail   * Specifies attributes of a shipment within an international
     * distribution.
     */
    public void setInternationalDistributionDetail(com.fedex.openship.stub.ShipmentInternationalDistributionDetail internationalDistributionDetail) {
        this.internationalDistributionDetail = internationalDistributionDetail;
    }


    /**
     * Gets the transborderDistributionDetail value for this ShipmentConsolidationDetail.
     * 
     * @return transborderDistributionDetail   * Specifies attributes of a shipment within a transborder distribution.
     */
    public com.fedex.openship.stub.ShipmentTransborderDistributionDetail getTransborderDistributionDetail() {
        return transborderDistributionDetail;
    }


    /**
     * Sets the transborderDistributionDetail value for this ShipmentConsolidationDetail.
     * 
     * @param transborderDistributionDetail   * Specifies attributes of a shipment within a transborder distribution.
     */
    public void setTransborderDistributionDetail(com.fedex.openship.stub.ShipmentTransborderDistributionDetail transborderDistributionDetail) {
        this.transborderDistributionDetail = transborderDistributionDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentConsolidationDetail)) return false;
        ShipmentConsolidationDetail other = (ShipmentConsolidationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationshipTimestamp==null && other.getRelationshipTimestamp()==null) || 
             (this.relationshipTimestamp!=null &&
              this.relationshipTimestamp.equals(other.getRelationshipTimestamp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.associatedTrackingIds==null && other.getAssociatedTrackingIds()==null) || 
             (this.associatedTrackingIds!=null &&
              java.util.Arrays.equals(this.associatedTrackingIds, other.getAssociatedTrackingIds()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.internationalDistributionDetail==null && other.getInternationalDistributionDetail()==null) || 
             (this.internationalDistributionDetail!=null &&
              this.internationalDistributionDetail.equals(other.getInternationalDistributionDetail()))) &&
            ((this.transborderDistributionDetail==null && other.getTransborderDistributionDetail()==null) || 
             (this.transborderDistributionDetail!=null &&
              this.transborderDistributionDetail.equals(other.getTransborderDistributionDetail())));
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
        if (getRelationshipTimestamp() != null) {
            _hashCode += getRelationshipTimestamp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getAssociatedTrackingIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedTrackingIds());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAssociatedTrackingIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getInternationalDistributionDetail() != null) {
            _hashCode += getInternationalDistributionDetail().hashCode();
        }
        if (getTransborderDistributionDetail() != null) {
            _hashCode += getTransborderDistributionDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentConsolidationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentConsolidationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RelationshipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipmentRoleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedTrackingIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalDistributionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentInternationalDistributionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transborderDistributionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentTransborderDistributionDetail"));
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

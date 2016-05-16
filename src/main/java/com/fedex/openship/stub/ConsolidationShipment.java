/**
 * ConsolidationShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Contains role and completed shipment data for shipments produced
 * while confirming a consolidation.
 */
public class ConsolidationShipment  implements java.io.Serializable {
    /* Indicates the role of this shipment in the consolidation. */
    private com.fedex.openship.stub.ConsolidationShipmentRoleType shipmentRoleType;

    /* Contains requested shipment data for a single shipment role
     * in the consolidation. */
    private RequestedShipment requestedShipment;

    /* Contains completed shipment data for a single shipment role
     * in the consolidation. */
    private com.fedex.openship.stub.CompletedShipmentDetail completedShipmentDetail;

    public ConsolidationShipment() {
    }

    public ConsolidationShipment(
           com.fedex.openship.stub.ConsolidationShipmentRoleType shipmentRoleType,
           RequestedShipment requestedShipment,
           com.fedex.openship.stub.CompletedShipmentDetail completedShipmentDetail) {
           this.shipmentRoleType = shipmentRoleType;
           this.requestedShipment = requestedShipment;
           this.completedShipmentDetail = completedShipmentDetail;
    }


    /**
     * Gets the shipmentRoleType value for this ConsolidationShipment.
     * 
     * @return shipmentRoleType   * Indicates the role of this shipment in the consolidation.
     */
    public com.fedex.openship.stub.ConsolidationShipmentRoleType getShipmentRoleType() {
        return shipmentRoleType;
    }


    /**
     * Sets the shipmentRoleType value for this ConsolidationShipment.
     * 
     * @param shipmentRoleType   * Indicates the role of this shipment in the consolidation.
     */
    public void setShipmentRoleType(com.fedex.openship.stub.ConsolidationShipmentRoleType shipmentRoleType) {
        this.shipmentRoleType = shipmentRoleType;
    }


    /**
     * Gets the requestedShipment value for this ConsolidationShipment.
     * 
     * @return requestedShipment   * Contains requested shipment data for a single shipment role
     * in the consolidation.
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }


    /**
     * Sets the requestedShipment value for this ConsolidationShipment.
     * 
     * @param requestedShipment   * Contains requested shipment data for a single shipment role
     * in the consolidation.
     */
    public void setRequestedShipment(RequestedShipment requestedShipment) {
        this.requestedShipment = requestedShipment;
    }


    /**
     * Gets the completedShipmentDetail value for this ConsolidationShipment.
     * 
     * @return completedShipmentDetail   * Contains completed shipment data for a single shipment role
     * in the consolidation.
     */
    public com.fedex.openship.stub.CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }


    /**
     * Sets the completedShipmentDetail value for this ConsolidationShipment.
     * 
     * @param completedShipmentDetail   * Contains completed shipment data for a single shipment role
     * in the consolidation.
     */
    public void setCompletedShipmentDetail(com.fedex.openship.stub.CompletedShipmentDetail completedShipmentDetail) {
        this.completedShipmentDetail = completedShipmentDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationShipment)) return false;
        ConsolidationShipment other = (ConsolidationShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentRoleType==null && other.getShipmentRoleType()==null) || 
             (this.shipmentRoleType!=null &&
              this.shipmentRoleType.equals(other.getShipmentRoleType()))) &&
            ((this.requestedShipment==null && other.getRequestedShipment()==null) || 
             (this.requestedShipment!=null &&
              this.requestedShipment.equals(other.getRequestedShipment()))) &&
            ((this.completedShipmentDetail==null && other.getCompletedShipmentDetail()==null) || 
             (this.completedShipmentDetail!=null &&
              this.completedShipmentDetail.equals(other.getCompletedShipmentDetail())));
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
        if (getShipmentRoleType() != null) {
            _hashCode += getShipmentRoleType().hashCode();
        }
        if (getRequestedShipment() != null) {
            _hashCode += getRequestedShipment().hashCode();
        }
        if (getCompletedShipmentDetail() != null) {
            _hashCode += getCompletedShipmentDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentRoleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRoleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipmentRoleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentDetail"));
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

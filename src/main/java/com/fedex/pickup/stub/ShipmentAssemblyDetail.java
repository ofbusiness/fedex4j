/**
 * ShipmentAssemblyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specification for assembly performed on shipment.
 */
public class ShipmentAssemblyDetail  implements java.io.Serializable {
    /* Number of pieces or packages to be assembled */
    private org.apache.axis.types.NonNegativeInteger pieceCount;

    /* Total weight of pieces or packages to be assembled */
    private Weight weight;

    public ShipmentAssemblyDetail() {
    }

    public ShipmentAssemblyDetail(
           org.apache.axis.types.NonNegativeInteger pieceCount,
           Weight weight) {
           this.pieceCount = pieceCount;
           this.weight = weight;
    }


    /**
     * Gets the pieceCount value for this ShipmentAssemblyDetail.
     * 
     * @return pieceCount   * Number of pieces or packages to be assembled
     */
    public org.apache.axis.types.NonNegativeInteger getPieceCount() {
        return pieceCount;
    }


    /**
     * Sets the pieceCount value for this ShipmentAssemblyDetail.
     * 
     * @param pieceCount   * Number of pieces or packages to be assembled
     */
    public void setPieceCount(org.apache.axis.types.NonNegativeInteger pieceCount) {
        this.pieceCount = pieceCount;
    }


    /**
     * Gets the weight value for this ShipmentAssemblyDetail.
     * 
     * @return weight   * Total weight of pieces or packages to be assembled
     */
    public Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ShipmentAssemblyDetail.
     * 
     * @param weight   * Total weight of pieces or packages to be assembled
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentAssemblyDetail)) return false;
        ShipmentAssemblyDetail other = (ShipmentAssemblyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pieceCount==null && other.getPieceCount()==null) || 
             (this.pieceCount!=null &&
              this.pieceCount.equals(other.getPieceCount()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight())));
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
        if (getPieceCount() != null) {
            _hashCode += getPieceCount().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentAssemblyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentAssemblyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PieceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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

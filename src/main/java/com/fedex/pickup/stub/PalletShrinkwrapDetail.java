/**
 * PalletShrinkwrapDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specifications for pallets to be shrinkwrapped as part of a Freight
 * shipment.
 */
public class PalletShrinkwrapDetail  implements java.io.Serializable {
    /* Number of pallets to be shrinkwrapped. */
    private org.apache.axis.types.PositiveInteger palletCount;

    public PalletShrinkwrapDetail() {
    }

    public PalletShrinkwrapDetail(
           org.apache.axis.types.PositiveInteger palletCount) {
           this.palletCount = palletCount;
    }


    /**
     * Gets the palletCount value for this PalletShrinkwrapDetail.
     * 
     * @return palletCount   * Number of pallets to be shrinkwrapped.
     */
    public org.apache.axis.types.PositiveInteger getPalletCount() {
        return palletCount;
    }


    /**
     * Sets the palletCount value for this PalletShrinkwrapDetail.
     * 
     * @param palletCount   * Number of pallets to be shrinkwrapped.
     */
    public void setPalletCount(org.apache.axis.types.PositiveInteger palletCount) {
        this.palletCount = palletCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PalletShrinkwrapDetail)) return false;
        PalletShrinkwrapDetail other = (PalletShrinkwrapDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.palletCount==null && other.getPalletCount()==null) || 
             (this.palletCount!=null &&
              this.palletCount.equals(other.getPalletCount())));
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
        if (getPalletCount() != null) {
            _hashCode += getPalletCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PalletShrinkwrapDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletShrinkwrapDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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

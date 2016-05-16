/**
 * ShipmentManifestDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ShipmentManifestDetail  implements java.io.Serializable {
    /* This identifies which customer reference field contains the
     * manifest ID. */
    private CustomerReferenceType manifestReferenceType;

    public ShipmentManifestDetail() {
    }

    public ShipmentManifestDetail(
           CustomerReferenceType manifestReferenceType) {
           this.manifestReferenceType = manifestReferenceType;
    }


    /**
     * Gets the manifestReferenceType value for this ShipmentManifestDetail.
     * 
     * @return manifestReferenceType   * This identifies which customer reference field contains the
     * manifest ID.
     */
    public CustomerReferenceType getManifestReferenceType() {
        return manifestReferenceType;
    }


    /**
     * Sets the manifestReferenceType value for this ShipmentManifestDetail.
     * 
     * @param manifestReferenceType   * This identifies which customer reference field contains the
     * manifest ID.
     */
    public void setManifestReferenceType(CustomerReferenceType manifestReferenceType) {
        this.manifestReferenceType = manifestReferenceType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentManifestDetail)) return false;
        ShipmentManifestDetail other = (ShipmentManifestDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manifestReferenceType==null && other.getManifestReferenceType()==null) || 
             (this.manifestReferenceType!=null &&
              this.manifestReferenceType.equals(other.getManifestReferenceType())));
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
        if (getManifestReferenceType() != null) {
            _hashCode += getManifestReferenceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentManifestDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentManifestDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manifestReferenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ManifestReferenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReferenceType"));
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

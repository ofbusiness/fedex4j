/**
 * PickupShipmentAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupShipmentAttributes  implements java.io.Serializable {
    private ServiceType serviceType;

    private PackagingType packagingType;

    private Dimensions dimensions;

    private Weight weight;

    public PickupShipmentAttributes() {
    }

    public PickupShipmentAttributes(
           ServiceType serviceType,
           PackagingType packagingType,
           Dimensions dimensions,
           Weight weight) {
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.dimensions = dimensions;
           this.weight = weight;
    }


    /**
     * Gets the serviceType value for this PickupShipmentAttributes.
     * 
     * @return serviceType
     */
    public ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this PickupShipmentAttributes.
     * 
     * @param serviceType
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this PickupShipmentAttributes.
     * 
     * @return packagingType
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this PickupShipmentAttributes.
     * 
     * @param packagingType
     */
    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the dimensions value for this PickupShipmentAttributes.
     * 
     * @return dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this PickupShipmentAttributes.
     * 
     * @param dimensions
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the weight value for this PickupShipmentAttributes.
     * 
     * @return weight
     */
    public Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this PickupShipmentAttributes.
     * 
     * @param weight
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupShipmentAttributes)) return false;
        PickupShipmentAttributes other = (PickupShipmentAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
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
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupShipmentAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupShipmentAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Dimensions"));
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

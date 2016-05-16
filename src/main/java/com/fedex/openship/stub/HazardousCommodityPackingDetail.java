/**
 * HazardousCommodityPackingDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies documentation and limits for validation of an individual
 * packing group/category.
 */
public class HazardousCommodityPackingDetail  implements java.io.Serializable {
    private Boolean cargoAircraftOnly;

    /* Coded specification for how commodity is to be packed. */
    private String packingInstructions;

    public HazardousCommodityPackingDetail() {
    }

    public HazardousCommodityPackingDetail(
           Boolean cargoAircraftOnly,
           String packingInstructions) {
           this.cargoAircraftOnly = cargoAircraftOnly;
           this.packingInstructions = packingInstructions;
    }


    /**
     * Gets the cargoAircraftOnly value for this HazardousCommodityPackingDetail.
     * 
     * @return cargoAircraftOnly
     */
    public Boolean getCargoAircraftOnly() {
        return cargoAircraftOnly;
    }


    /**
     * Sets the cargoAircraftOnly value for this HazardousCommodityPackingDetail.
     * 
     * @param cargoAircraftOnly
     */
    public void setCargoAircraftOnly(Boolean cargoAircraftOnly) {
        this.cargoAircraftOnly = cargoAircraftOnly;
    }


    /**
     * Gets the packingInstructions value for this HazardousCommodityPackingDetail.
     * 
     * @return packingInstructions   * Coded specification for how commodity is to be packed.
     */
    public String getPackingInstructions() {
        return packingInstructions;
    }


    /**
     * Sets the packingInstructions value for this HazardousCommodityPackingDetail.
     * 
     * @param packingInstructions   * Coded specification for how commodity is to be packed.
     */
    public void setPackingInstructions(String packingInstructions) {
        this.packingInstructions = packingInstructions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HazardousCommodityPackingDetail)) return false;
        HazardousCommodityPackingDetail other = (HazardousCommodityPackingDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargoAircraftOnly==null && other.getCargoAircraftOnly()==null) || 
             (this.cargoAircraftOnly!=null &&
              this.cargoAircraftOnly.equals(other.getCargoAircraftOnly()))) &&
            ((this.packingInstructions==null && other.getPackingInstructions()==null) || 
             (this.packingInstructions!=null &&
              this.packingInstructions.equals(other.getPackingInstructions())));
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
        if (getCargoAircraftOnly() != null) {
            _hashCode += getCargoAircraftOnly().hashCode();
        }
        if (getPackingInstructions() != null) {
            _hashCode += getPackingInstructions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityPackingDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoAircraftOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CargoAircraftOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackingInstructions"));
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

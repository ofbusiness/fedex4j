/**
 * HazardousCommodityInnerReceptacleDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * This describes information about the inner receptacles for the
 * hazardous commodity in a particular dangerous goods container.
 */
public class HazardousCommodityInnerReceptacleDetail  implements java.io.Serializable {
    /* This specifies the quantity contained in the inner receptacle. */
    private HazardousCommodityQuantityDetail quantity;

    public HazardousCommodityInnerReceptacleDetail() {
    }

    public HazardousCommodityInnerReceptacleDetail(
           HazardousCommodityQuantityDetail quantity) {
           this.quantity = quantity;
    }


    /**
     * Gets the quantity value for this HazardousCommodityInnerReceptacleDetail.
     * 
     * @return quantity   * This specifies the quantity contained in the inner receptacle.
     */
    public HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this HazardousCommodityInnerReceptacleDetail.
     * 
     * @param quantity   * This specifies the quantity contained in the inner receptacle.
     */
    public void setQuantity(HazardousCommodityQuantityDetail quantity) {
        this.quantity = quantity;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HazardousCommodityInnerReceptacleDetail)) return false;
        HazardousCommodityInnerReceptacleDetail other = (HazardousCommodityInnerReceptacleDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity())));
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityInnerReceptacleDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityInnerReceptacleDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityQuantityDetail"));
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

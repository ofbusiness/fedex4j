/**
 * MarkingOrTaggingDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specification for marking or tagging of pieces in shipment.
 */
public class MarkingOrTaggingDetail  implements java.io.Serializable {
    /* Number of pieces to be marked or tagged by FedEx. */
    private org.apache.axis.types.PositiveInteger count;

    public MarkingOrTaggingDetail() {
    }

    public MarkingOrTaggingDetail(
           org.apache.axis.types.PositiveInteger count) {
           this.count = count;
    }


    /**
     * Gets the count value for this MarkingOrTaggingDetail.
     * 
     * @return count   * Number of pieces to be marked or tagged by FedEx.
     */
    public org.apache.axis.types.PositiveInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this MarkingOrTaggingDetail.
     * 
     * @param count   * Number of pieces to be marked or tagged by FedEx.
     */
    public void setCount(org.apache.axis.types.PositiveInteger count) {
        this.count = count;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MarkingOrTaggingDetail)) return false;
        MarkingOrTaggingDetail other = (MarkingOrTaggingDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarkingOrTaggingDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "MarkingOrTaggingDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Count"));
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

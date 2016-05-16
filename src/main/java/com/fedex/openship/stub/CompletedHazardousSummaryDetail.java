/**
 * CompletedHazardousSummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CompletedHazardousSummaryDetail  implements java.io.Serializable {
    /* Specifies the total number of packages containing hazardous
     * commodities in small exceptions. */
    private org.apache.axis.types.NonNegativeInteger smallQuantityExceptionPackageCount;

    public CompletedHazardousSummaryDetail() {
    }

    public CompletedHazardousSummaryDetail(
           org.apache.axis.types.NonNegativeInteger smallQuantityExceptionPackageCount) {
           this.smallQuantityExceptionPackageCount = smallQuantityExceptionPackageCount;
    }


    /**
     * Gets the smallQuantityExceptionPackageCount value for this CompletedHazardousSummaryDetail.
     * 
     * @return smallQuantityExceptionPackageCount   * Specifies the total number of packages containing hazardous
     * commodities in small exceptions.
     */
    public org.apache.axis.types.NonNegativeInteger getSmallQuantityExceptionPackageCount() {
        return smallQuantityExceptionPackageCount;
    }


    /**
     * Sets the smallQuantityExceptionPackageCount value for this CompletedHazardousSummaryDetail.
     * 
     * @param smallQuantityExceptionPackageCount   * Specifies the total number of packages containing hazardous
     * commodities in small exceptions.
     */
    public void setSmallQuantityExceptionPackageCount(org.apache.axis.types.NonNegativeInteger smallQuantityExceptionPackageCount) {
        this.smallQuantityExceptionPackageCount = smallQuantityExceptionPackageCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedHazardousSummaryDetail)) return false;
        CompletedHazardousSummaryDetail other = (CompletedHazardousSummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smallQuantityExceptionPackageCount==null && other.getSmallQuantityExceptionPackageCount()==null) || 
             (this.smallQuantityExceptionPackageCount!=null &&
              this.smallQuantityExceptionPackageCount.equals(other.getSmallQuantityExceptionPackageCount())));
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
        if (getSmallQuantityExceptionPackageCount() != null) {
            _hashCode += getSmallQuantityExceptionPackageCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedHazardousSummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHazardousSummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallQuantityExceptionPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmallQuantityExceptionPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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

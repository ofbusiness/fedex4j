/**
 * ShipmentTransborderDistributionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the attributes of a shipment related to its role in a
 * transborder distribution (consolidation).
 */
public class ShipmentTransborderDistributionDetail  implements java.io.Serializable {
    /* Specifies special services to be performed on this shipment
     * as part of a transborder distribution. */
    private com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested;

    /* Provides summary totals across all CRNs in a distribution. */
    private TransborderDistributionSummaryDetail summaryDetail;

    public ShipmentTransborderDistributionDetail() {
    }

    public ShipmentTransborderDistributionDetail(
           com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested,
           TransborderDistributionSummaryDetail summaryDetail) {
           this.specialServicesRequested = specialServicesRequested;
           this.summaryDetail = summaryDetail;
    }


    /**
     * Gets the specialServicesRequested value for this ShipmentTransborderDistributionDetail.
     * 
     * @return specialServicesRequested   * Specifies special services to be performed on this shipment
     * as part of a transborder distribution.
     */
    public com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this ShipmentTransborderDistributionDetail.
     * 
     * @param specialServicesRequested   * Specifies special services to be performed on this shipment
     * as part of a transborder distribution.
     */
    public void setSpecialServicesRequested(com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the summaryDetail value for this ShipmentTransborderDistributionDetail.
     * 
     * @return summaryDetail   * Provides summary totals across all CRNs in a distribution.
     */
    public TransborderDistributionSummaryDetail getSummaryDetail() {
        return summaryDetail;
    }


    /**
     * Sets the summaryDetail value for this ShipmentTransborderDistributionDetail.
     * 
     * @param summaryDetail   * Provides summary totals across all CRNs in a distribution.
     */
    public void setSummaryDetail(TransborderDistributionSummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentTransborderDistributionDetail)) return false;
        ShipmentTransborderDistributionDetail other = (ShipmentTransborderDistributionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.summaryDetail==null && other.getSummaryDetail()==null) || 
             (this.summaryDetail!=null &&
              this.summaryDetail.equals(other.getSummaryDetail())));
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
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getSummaryDetail() != null) {
            _hashCode += getSummaryDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentTransborderDistributionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentTransborderDistributionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SummaryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSummaryDetail"));
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

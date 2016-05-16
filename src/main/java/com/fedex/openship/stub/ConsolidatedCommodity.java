/**
 * ConsolidatedCommodity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidatedCommodity  implements java.io.Serializable {
    private com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail destinationDetail;

    private Commodity commodity;

    public ConsolidatedCommodity() {
    }

    public ConsolidatedCommodity(
           com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail destinationDetail,
           Commodity commodity) {
           this.destinationDetail = destinationDetail;
           this.commodity = commodity;
    }


    /**
     * Gets the destinationDetail value for this ConsolidatedCommodity.
     * 
     * @return destinationDetail
     */
    public com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail getDestinationDetail() {
        return destinationDetail;
    }


    /**
     * Sets the destinationDetail value for this ConsolidatedCommodity.
     * 
     * @param destinationDetail
     */
    public void setDestinationDetail(com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail destinationDetail) {
        this.destinationDetail = destinationDetail;
    }


    /**
     * Gets the commodity value for this ConsolidatedCommodity.
     * 
     * @return commodity
     */
    public Commodity getCommodity() {
        return commodity;
    }


    /**
     * Sets the commodity value for this ConsolidatedCommodity.
     * 
     * @param commodity
     */
    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedCommodity)) return false;
        ConsolidatedCommodity other = (ConsolidatedCommodity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationDetail==null && other.getDestinationDetail()==null) || 
             (this.destinationDetail!=null &&
              this.destinationDetail.equals(other.getDestinationDetail()))) &&
            ((this.commodity==null && other.getCommodity()==null) || 
             (this.commodity!=null &&
              this.commodity.equals(other.getCommodity())));
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
        if (getDestinationDetail() != null) {
            _hashCode += getDestinationDetail().hashCode();
        }
        if (getCommodity() != null) {
            _hashCode += getCommodity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedCommodity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DestinationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodityDestinationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Commodity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Commodity"));
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

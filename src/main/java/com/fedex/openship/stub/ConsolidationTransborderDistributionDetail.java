/**
 * ConsolidationTransborderDistributionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies consolidation data for a tranborder distribution shipment.
 * This is data that can be provided by the customer at the consolidation
 * creation time.
 */
public class ConsolidationTransborderDistributionDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested;

    /* Specifies how to route the transborder distribution CRNs to
     * different distribution locations. */
    private TransborderDistributionRoutingType routing;

    public ConsolidationTransborderDistributionDetail() {
    }

    public ConsolidationTransborderDistributionDetail(
           com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested,
           TransborderDistributionRoutingType routing) {
           this.specialServicesRequested = specialServicesRequested;
           this.routing = routing;
    }


    /**
     * Gets the specialServicesRequested value for this ConsolidationTransborderDistributionDetail.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this ConsolidationTransborderDistributionDetail.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the routing value for this ConsolidationTransborderDistributionDetail.
     * 
     * @return routing   * Specifies how to route the transborder distribution CRNs to
     * different distribution locations.
     */
    public TransborderDistributionRoutingType getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this ConsolidationTransborderDistributionDetail.
     * 
     * @param routing   * Specifies how to route the transborder distribution CRNs to
     * different distribution locations.
     */
    public void setRouting(TransborderDistributionRoutingType routing) {
        this.routing = routing;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationTransborderDistributionDetail)) return false;
        ConsolidationTransborderDistributionDetail other = (ConsolidationTransborderDistributionDetail) obj;
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
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              this.routing.equals(other.getRouting())));
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
        if (getRouting() != null) {
            _hashCode += getRouting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationTransborderDistributionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationTransborderDistributionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionRoutingType"));
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

/**
 * ConsolidatedCommoditiesSummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Provides data about the consolidated commodities.
 */
public class ConsolidatedCommoditiesSummaryDetail  implements java.io.Serializable {
    private Money totalCustomsValue;

    private ConsolidatedCommodityDetail[] consolidatedCommodities;

    public ConsolidatedCommoditiesSummaryDetail() {
    }

    public ConsolidatedCommoditiesSummaryDetail(
           Money totalCustomsValue,
           ConsolidatedCommodityDetail[] consolidatedCommodities) {
           this.totalCustomsValue = totalCustomsValue;
           this.consolidatedCommodities = consolidatedCommodities;
    }


    /**
     * Gets the totalCustomsValue value for this ConsolidatedCommoditiesSummaryDetail.
     * 
     * @return totalCustomsValue
     */
    public Money getTotalCustomsValue() {
        return totalCustomsValue;
    }


    /**
     * Sets the totalCustomsValue value for this ConsolidatedCommoditiesSummaryDetail.
     * 
     * @param totalCustomsValue
     */
    public void setTotalCustomsValue(Money totalCustomsValue) {
        this.totalCustomsValue = totalCustomsValue;
    }


    /**
     * Gets the consolidatedCommodities value for this ConsolidatedCommoditiesSummaryDetail.
     * 
     * @return consolidatedCommodities
     */
    public ConsolidatedCommodityDetail[] getConsolidatedCommodities() {
        return consolidatedCommodities;
    }


    /**
     * Sets the consolidatedCommodities value for this ConsolidatedCommoditiesSummaryDetail.
     * 
     * @param consolidatedCommodities
     */
    public void setConsolidatedCommodities(ConsolidatedCommodityDetail[] consolidatedCommodities) {
        this.consolidatedCommodities = consolidatedCommodities;
    }

    public ConsolidatedCommodityDetail getConsolidatedCommodities(int i) {
        return this.consolidatedCommodities[i];
    }

    public void setConsolidatedCommodities(int i, ConsolidatedCommodityDetail _value) {
        this.consolidatedCommodities[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedCommoditiesSummaryDetail)) return false;
        ConsolidatedCommoditiesSummaryDetail other = (ConsolidatedCommoditiesSummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalCustomsValue==null && other.getTotalCustomsValue()==null) || 
             (this.totalCustomsValue!=null &&
              this.totalCustomsValue.equals(other.getTotalCustomsValue()))) &&
            ((this.consolidatedCommodities==null && other.getConsolidatedCommodities()==null) || 
             (this.consolidatedCommodities!=null &&
              java.util.Arrays.equals(this.consolidatedCommodities, other.getConsolidatedCommodities())));
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
        if (getTotalCustomsValue() != null) {
            _hashCode += getTotalCustomsValue().hashCode();
        }
        if (getConsolidatedCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidatedCommodities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConsolidatedCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedCommoditiesSummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommoditiesSummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCustomsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalCustomsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedCommodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

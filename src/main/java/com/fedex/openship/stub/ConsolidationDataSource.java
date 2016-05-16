/**
 * ConsolidationDataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the way in which aggregated data in a consolidation are
 * to be determined.
 */
public class ConsolidationDataSource  implements java.io.Serializable {
    /* Identifies the field being specified. */
    private ConsolidationDataType field;

    /* Identifies how the content of the field should be determined. */
    private com.fedex.openship.stub.ConsolidationDataSourceType source;

    public ConsolidationDataSource() {
    }

    public ConsolidationDataSource(
           ConsolidationDataType field,
           com.fedex.openship.stub.ConsolidationDataSourceType source) {
           this.field = field;
           this.source = source;
    }


    /**
     * Gets the field value for this ConsolidationDataSource.
     * 
     * @return field   * Identifies the field being specified.
     */
    public ConsolidationDataType getField() {
        return field;
    }


    /**
     * Sets the field value for this ConsolidationDataSource.
     * 
     * @param field   * Identifies the field being specified.
     */
    public void setField(ConsolidationDataType field) {
        this.field = field;
    }


    /**
     * Gets the source value for this ConsolidationDataSource.
     * 
     * @return source   * Identifies how the content of the field should be determined.
     */
    public com.fedex.openship.stub.ConsolidationDataSourceType getSource() {
        return source;
    }


    /**
     * Sets the source value for this ConsolidationDataSource.
     * 
     * @param source   * Identifies how the content of the field should be determined.
     */
    public void setSource(com.fedex.openship.stub.ConsolidationDataSourceType source) {
        this.source = source;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationDataSource)) return false;
        ConsolidationDataSource other = (ConsolidationDataSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationDataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSourceType"));
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

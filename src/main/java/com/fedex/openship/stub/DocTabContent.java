/**
 * DocTabContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class DocTabContent  implements java.io.Serializable {
    /* The DocTabContentType options available. */
    private com.fedex.openship.stub.DocTabContentType docTabContentType;

    private com.fedex.openship.stub.DocTabContentZone001 zone001;

    private com.fedex.openship.stub.DocTabContentBarcoded barcoded;

    public DocTabContent() {
    }

    public DocTabContent(
           com.fedex.openship.stub.DocTabContentType docTabContentType,
           com.fedex.openship.stub.DocTabContentZone001 zone001,
           com.fedex.openship.stub.DocTabContentBarcoded barcoded) {
           this.docTabContentType = docTabContentType;
           this.zone001 = zone001;
           this.barcoded = barcoded;
    }


    /**
     * Gets the docTabContentType value for this DocTabContent.
     * 
     * @return docTabContentType   * The DocTabContentType options available.
     */
    public com.fedex.openship.stub.DocTabContentType getDocTabContentType() {
        return docTabContentType;
    }


    /**
     * Sets the docTabContentType value for this DocTabContent.
     * 
     * @param docTabContentType   * The DocTabContentType options available.
     */
    public void setDocTabContentType(com.fedex.openship.stub.DocTabContentType docTabContentType) {
        this.docTabContentType = docTabContentType;
    }


    /**
     * Gets the zone001 value for this DocTabContent.
     * 
     * @return zone001
     */
    public com.fedex.openship.stub.DocTabContentZone001 getZone001() {
        return zone001;
    }


    /**
     * Sets the zone001 value for this DocTabContent.
     * 
     * @param zone001
     */
    public void setZone001(com.fedex.openship.stub.DocTabContentZone001 zone001) {
        this.zone001 = zone001;
    }


    /**
     * Gets the barcoded value for this DocTabContent.
     * 
     * @return barcoded
     */
    public com.fedex.openship.stub.DocTabContentBarcoded getBarcoded() {
        return barcoded;
    }


    /**
     * Sets the barcoded value for this DocTabContent.
     * 
     * @param barcoded
     */
    public void setBarcoded(com.fedex.openship.stub.DocTabContentBarcoded barcoded) {
        this.barcoded = barcoded;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DocTabContent)) return false;
        DocTabContent other = (DocTabContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docTabContentType==null && other.getDocTabContentType()==null) || 
             (this.docTabContentType!=null &&
              this.docTabContentType.equals(other.getDocTabContentType()))) &&
            ((this.zone001==null && other.getZone001()==null) || 
             (this.zone001!=null &&
              this.zone001.equals(other.getZone001()))) &&
            ((this.barcoded==null && other.getBarcoded()==null) || 
             (this.barcoded!=null &&
              this.barcoded.equals(other.getBarcoded())));
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
        if (getDocTabContentType() != null) {
            _hashCode += getDocTabContentType().hashCode();
        }
        if (getZone001() != null) {
            _hashCode += getZone001().hashCode();
        }
        if (getBarcoded() != null) {
            _hashCode += getBarcoded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocTabContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabContentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone001");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Zone001"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentZone001"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcoded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Barcoded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentBarcoded"));
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

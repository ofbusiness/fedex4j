/**
 * CompletedConsolidationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CompletedConsolidationDetail  implements java.io.Serializable {
    /* The shipment-level artifacts constructed when confirming this
     * consolidation. */
    private ConsolidationShipment[] consolidationShipments;

    /* Contains all documents produced for this distribution consolidation. */
    private ConsolidationDocument[] documents;

    public CompletedConsolidationDetail() {
    }

    public CompletedConsolidationDetail(
           ConsolidationShipment[] consolidationShipments,
           ConsolidationDocument[] documents) {
           this.consolidationShipments = consolidationShipments;
           this.documents = documents;
    }


    /**
     * Gets the consolidationShipments value for this CompletedConsolidationDetail.
     * 
     * @return consolidationShipments   * The shipment-level artifacts constructed when confirming this
     * consolidation.
     */
    public ConsolidationShipment[] getConsolidationShipments() {
        return consolidationShipments;
    }


    /**
     * Sets the consolidationShipments value for this CompletedConsolidationDetail.
     * 
     * @param consolidationShipments   * The shipment-level artifacts constructed when confirming this
     * consolidation.
     */
    public void setConsolidationShipments(ConsolidationShipment[] consolidationShipments) {
        this.consolidationShipments = consolidationShipments;
    }

    public ConsolidationShipment getConsolidationShipments(int i) {
        return this.consolidationShipments[i];
    }

    public void setConsolidationShipments(int i, ConsolidationShipment _value) {
        this.consolidationShipments[i] = _value;
    }


    /**
     * Gets the documents value for this CompletedConsolidationDetail.
     * 
     * @return documents   * Contains all documents produced for this distribution consolidation.
     */
    public ConsolidationDocument[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this CompletedConsolidationDetail.
     * 
     * @param documents   * Contains all documents produced for this distribution consolidation.
     */
    public void setDocuments(ConsolidationDocument[] documents) {
        this.documents = documents;
    }

    public ConsolidationDocument getDocuments(int i) {
        return this.documents[i];
    }

    public void setDocuments(int i, ConsolidationDocument _value) {
        this.documents[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedConsolidationDetail)) return false;
        CompletedConsolidationDetail other = (CompletedConsolidationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consolidationShipments==null && other.getConsolidationShipments()==null) || 
             (this.consolidationShipments!=null &&
              java.util.Arrays.equals(this.consolidationShipments, other.getConsolidationShipments()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments())));
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
        if (getConsolidationShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidationShipments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConsolidationShipments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDocuments(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedConsolidationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedConsolidationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocument"));
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

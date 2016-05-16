/**
 * RecommendedDocumentSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Specifies the details about documents that are recommended to be
 * included with the shipment for ease of shipment processing and transportation.
 */
public class RecommendedDocumentSpecification  implements java.io.Serializable {
    private RecommendedDocumentType[] types;

    public RecommendedDocumentSpecification() {
    }

    public RecommendedDocumentSpecification(
           RecommendedDocumentType[] types) {
           this.types = types;
    }


    /**
     * Gets the types value for this RecommendedDocumentSpecification.
     * 
     * @return types
     */
    public RecommendedDocumentType[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this RecommendedDocumentSpecification.
     * 
     * @param types
     */
    public void setTypes(RecommendedDocumentType[] types) {
        this.types = types;
    }

    public RecommendedDocumentType getTypes(int i) {
        return this.types[i];
    }

    public void setTypes(int i, RecommendedDocumentType _value) {
        this.types[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RecommendedDocumentSpecification)) return false;
        RecommendedDocumentSpecification other = (RecommendedDocumentSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes())));
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
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTypes(), i);
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
        new org.apache.axis.description.TypeDesc(RecommendedDocumentSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RecommendedDocumentSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RecommendedDocumentType"));
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

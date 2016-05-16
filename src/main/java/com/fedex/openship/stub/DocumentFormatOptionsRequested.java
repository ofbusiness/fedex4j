/**
 * DocumentFormatOptionsRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class DocumentFormatOptionsRequested  implements java.io.Serializable {
    private DocumentFormatOptionType[] options;

    public DocumentFormatOptionsRequested() {
    }

    public DocumentFormatOptionsRequested(
           DocumentFormatOptionType[] options) {
           this.options = options;
    }


    /**
     * Gets the options value for this DocumentFormatOptionsRequested.
     * 
     * @return options
     */
    public DocumentFormatOptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DocumentFormatOptionsRequested.
     * 
     * @param options
     */
    public void setOptions(DocumentFormatOptionType[] options) {
        this.options = options;
    }

    public DocumentFormatOptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, DocumentFormatOptionType _value) {
        this.options[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DocumentFormatOptionsRequested)) return false;
        DocumentFormatOptionsRequested other = (DocumentFormatOptionsRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions())));
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
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOptions(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentFormatOptionsRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocumentFormatOptionsRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocumentFormatOptionType"));
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

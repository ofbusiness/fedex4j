/**
 * UploadDocumentProducerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class UploadDocumentProducerType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UploadDocumentProducerType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CUSTOMER = "CUSTOMER";
    public static final String _FEDEX_CLS = "FEDEX_CLS";
    public static final String _FEDEX_GSMW = "FEDEX_GSMW";
    public static final String _FEDEX_GTM = "FEDEX_GTM";
    public static final String _OTHER = "OTHER";
    public static final UploadDocumentProducerType CUSTOMER = new UploadDocumentProducerType(_CUSTOMER);
    public static final UploadDocumentProducerType FEDEX_CLS = new UploadDocumentProducerType(_FEDEX_CLS);
    public static final UploadDocumentProducerType FEDEX_GSMW = new UploadDocumentProducerType(_FEDEX_GSMW);
    public static final UploadDocumentProducerType FEDEX_GTM = new UploadDocumentProducerType(_FEDEX_GTM);
    public static final UploadDocumentProducerType OTHER = new UploadDocumentProducerType(_OTHER);
    public String getValue() { return _value_;}
    public static UploadDocumentProducerType fromValue(String value)
          throws IllegalArgumentException {
        UploadDocumentProducerType enumeration = (UploadDocumentProducerType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static UploadDocumentProducerType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadDocumentProducerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentProducerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

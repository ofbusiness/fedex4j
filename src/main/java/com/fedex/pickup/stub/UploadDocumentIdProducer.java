/**
 * UploadDocumentIdProducer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class UploadDocumentIdProducer implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UploadDocumentIdProducer(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CUSTOMER = "CUSTOMER";
    public static final String _FEDEX_CAFE = "FEDEX_CAFE";
    public static final String _FEDEX_CSHP = "FEDEX_CSHP";
    public static final String _FEDEX_FXRS = "FEDEX_FXRS";
    public static final String _FEDEX_GSMW = "FEDEX_GSMW";
    public static final String _FEDEX_GTM = "FEDEX_GTM";
    public static final String _FEDEX_INET = "FEDEX_INET";
    public static final UploadDocumentIdProducer CUSTOMER = new UploadDocumentIdProducer(_CUSTOMER);
    public static final UploadDocumentIdProducer FEDEX_CAFE = new UploadDocumentIdProducer(_FEDEX_CAFE);
    public static final UploadDocumentIdProducer FEDEX_CSHP = new UploadDocumentIdProducer(_FEDEX_CSHP);
    public static final UploadDocumentIdProducer FEDEX_FXRS = new UploadDocumentIdProducer(_FEDEX_FXRS);
    public static final UploadDocumentIdProducer FEDEX_GSMW = new UploadDocumentIdProducer(_FEDEX_GSMW);
    public static final UploadDocumentIdProducer FEDEX_GTM = new UploadDocumentIdProducer(_FEDEX_GTM);
    public static final UploadDocumentIdProducer FEDEX_INET = new UploadDocumentIdProducer(_FEDEX_INET);
    public String getValue() { return _value_;}
    public static UploadDocumentIdProducer fromValue(String value)
          throws IllegalArgumentException {
        UploadDocumentIdProducer enumeration = (UploadDocumentIdProducer)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static UploadDocumentIdProducer fromString(String value)
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
        new org.apache.axis.description.TypeDesc(UploadDocumentIdProducer.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentIdProducer"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

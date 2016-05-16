/**
 * UploadDocumentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class UploadDocumentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UploadDocumentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CERTIFICATE_OF_ORIGIN = "CERTIFICATE_OF_ORIGIN";
    public static final String _COMMERCIAL_INVOICE = "COMMERCIAL_INVOICE";
    public static final String _ETD_LABEL = "ETD_LABEL";
    public static final String _NAFTA_CERTIFICATE_OF_ORIGIN = "NAFTA_CERTIFICATE_OF_ORIGIN";
    public static final String _OTHER = "OTHER";
    public static final String _PRO_FORMA_INVOICE = "PRO_FORMA_INVOICE";
    public static final UploadDocumentType CERTIFICATE_OF_ORIGIN = new UploadDocumentType(_CERTIFICATE_OF_ORIGIN);
    public static final UploadDocumentType COMMERCIAL_INVOICE = new UploadDocumentType(_COMMERCIAL_INVOICE);
    public static final UploadDocumentType ETD_LABEL = new UploadDocumentType(_ETD_LABEL);
    public static final UploadDocumentType NAFTA_CERTIFICATE_OF_ORIGIN = new UploadDocumentType(_NAFTA_CERTIFICATE_OF_ORIGIN);
    public static final UploadDocumentType OTHER = new UploadDocumentType(_OTHER);
    public static final UploadDocumentType PRO_FORMA_INVOICE = new UploadDocumentType(_PRO_FORMA_INVOICE);
    public String getValue() { return _value_;}
    public static UploadDocumentType fromValue(String value)
          throws IllegalArgumentException {
        UploadDocumentType enumeration = (UploadDocumentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static UploadDocumentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(UploadDocumentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

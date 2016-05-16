/**
 * InternationalDocumentContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class InternationalDocumentContentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InternationalDocumentContentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _DERIVED = "DERIVED";
    public static final String _DOCUMENTS_ONLY = "DOCUMENTS_ONLY";
    public static final String _NON_DOCUMENTS = "NON_DOCUMENTS";
    public static final InternationalDocumentContentType DERIVED = new InternationalDocumentContentType(_DERIVED);
    public static final InternationalDocumentContentType DOCUMENTS_ONLY = new InternationalDocumentContentType(_DOCUMENTS_ONLY);
    public static final InternationalDocumentContentType NON_DOCUMENTS = new InternationalDocumentContentType(_NON_DOCUMENTS);
    public String getValue() { return _value_;}
    public static InternationalDocumentContentType fromValue(String value)
          throws IllegalArgumentException {
        InternationalDocumentContentType enumeration = (InternationalDocumentContentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static InternationalDocumentContentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(InternationalDocumentContentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDocumentContentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

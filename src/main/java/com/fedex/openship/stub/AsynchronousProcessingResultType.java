/**
 * AsynchronousProcessingResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class AsynchronousProcessingResultType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AsynchronousProcessingResultType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ASYNCHRONOUSLY_PROCESSED = "ASYNCHRONOUSLY_PROCESSED";
    public static final String _SYNCHRONOUSLY_PROCESSED = "SYNCHRONOUSLY_PROCESSED";
    public static final AsynchronousProcessingResultType ASYNCHRONOUSLY_PROCESSED = new AsynchronousProcessingResultType(_ASYNCHRONOUSLY_PROCESSED);
    public static final AsynchronousProcessingResultType SYNCHRONOUSLY_PROCESSED = new AsynchronousProcessingResultType(_SYNCHRONOUSLY_PROCESSED);
    public String getValue() { return _value_;}
    public static AsynchronousProcessingResultType fromValue(String value)
          throws IllegalArgumentException {
        AsynchronousProcessingResultType enumeration = (AsynchronousProcessingResultType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AsynchronousProcessingResultType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AsynchronousProcessingResultType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingResultType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

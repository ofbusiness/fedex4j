/**
 * NaftaProducerSpecificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class NaftaProducerSpecificationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NaftaProducerSpecificationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _AVAILABLE_UPON_REQUEST = "AVAILABLE_UPON_REQUEST";
    public static final String _MULTIPLE_SPECIFIED = "MULTIPLE_SPECIFIED";
    public static final String _SAME = "SAME";
    public static final String _SINGLE_SPECIFIED = "SINGLE_SPECIFIED";
    public static final String _UNKNOWN = "UNKNOWN";
    public static final NaftaProducerSpecificationType AVAILABLE_UPON_REQUEST = new NaftaProducerSpecificationType(_AVAILABLE_UPON_REQUEST);
    public static final NaftaProducerSpecificationType MULTIPLE_SPECIFIED = new NaftaProducerSpecificationType(_MULTIPLE_SPECIFIED);
    public static final NaftaProducerSpecificationType SAME = new NaftaProducerSpecificationType(_SAME);
    public static final NaftaProducerSpecificationType SINGLE_SPECIFIED = new NaftaProducerSpecificationType(_SINGLE_SPECIFIED);
    public static final NaftaProducerSpecificationType UNKNOWN = new NaftaProducerSpecificationType(_UNKNOWN);
    public String getValue() { return _value_;}
    public static NaftaProducerSpecificationType fromValue(String value)
          throws IllegalArgumentException {
        NaftaProducerSpecificationType enumeration = (NaftaProducerSpecificationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static NaftaProducerSpecificationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(NaftaProducerSpecificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaProducerSpecificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

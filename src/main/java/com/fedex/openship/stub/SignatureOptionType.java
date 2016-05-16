/**
 * SignatureOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class SignatureOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SignatureOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ADULT = "ADULT";
    public static final String _DIRECT = "DIRECT";
    public static final String _INDIRECT = "INDIRECT";
    public static final String _NO_SIGNATURE_REQUIRED = "NO_SIGNATURE_REQUIRED";
    public static final String _SERVICE_DEFAULT = "SERVICE_DEFAULT";
    public static final SignatureOptionType ADULT = new SignatureOptionType(_ADULT);
    public static final SignatureOptionType DIRECT = new SignatureOptionType(_DIRECT);
    public static final SignatureOptionType INDIRECT = new SignatureOptionType(_INDIRECT);
    public static final SignatureOptionType NO_SIGNATURE_REQUIRED = new SignatureOptionType(_NO_SIGNATURE_REQUIRED);
    public static final SignatureOptionType SERVICE_DEFAULT = new SignatureOptionType(_SERVICE_DEFAULT);
    public String getValue() { return _value_;}
    public static SignatureOptionType fromValue(String value)
          throws IllegalArgumentException {
        SignatureOptionType enumeration = (SignatureOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SignatureOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(SignatureOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

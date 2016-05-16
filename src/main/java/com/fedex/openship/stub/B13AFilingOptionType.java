/**
 * B13AFilingOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class B13AFilingOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected B13AFilingOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_TO_STAMP = "FEDEX_TO_STAMP";
    public static final String _FILED_ELECTRONICALLY = "FILED_ELECTRONICALLY";
    public static final String _MANUALLY_ATTACHED = "MANUALLY_ATTACHED";
    public static final String _NOT_REQUIRED = "NOT_REQUIRED";
    public static final String _SUMMARY_REPORTING = "SUMMARY_REPORTING";
    public static final B13AFilingOptionType FEDEX_TO_STAMP = new B13AFilingOptionType(_FEDEX_TO_STAMP);
    public static final B13AFilingOptionType FILED_ELECTRONICALLY = new B13AFilingOptionType(_FILED_ELECTRONICALLY);
    public static final B13AFilingOptionType MANUALLY_ATTACHED = new B13AFilingOptionType(_MANUALLY_ATTACHED);
    public static final B13AFilingOptionType NOT_REQUIRED = new B13AFilingOptionType(_NOT_REQUIRED);
    public static final B13AFilingOptionType SUMMARY_REPORTING = new B13AFilingOptionType(_SUMMARY_REPORTING);
    public String getValue() { return _value_;}
    public static B13AFilingOptionType fromValue(String value)
          throws IllegalArgumentException {
        B13AFilingOptionType enumeration = (B13AFilingOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static B13AFilingOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(B13AFilingOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "B13AFilingOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

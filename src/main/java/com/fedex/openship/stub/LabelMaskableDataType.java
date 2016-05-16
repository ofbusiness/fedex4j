/**
 * LabelMaskableDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class LabelMaskableDataType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelMaskableDataType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CUSTOMS_VALUE = "CUSTOMS_VALUE";
    public static final String _DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER = "DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER";
    public static final String _SECONDARY_BARCODE = "SECONDARY_BARCODE";
    public static final String _SHIPPER_ACCOUNT_NUMBER = "SHIPPER_ACCOUNT_NUMBER";
    public static final String _TERMS_AND_CONDITIONS = "TERMS_AND_CONDITIONS";
    public static final String _TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER = "TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER";
    public static final LabelMaskableDataType CUSTOMS_VALUE = new LabelMaskableDataType(_CUSTOMS_VALUE);
    public static final LabelMaskableDataType DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER = new LabelMaskableDataType(_DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER);
    public static final LabelMaskableDataType SECONDARY_BARCODE = new LabelMaskableDataType(_SECONDARY_BARCODE);
    public static final LabelMaskableDataType SHIPPER_ACCOUNT_NUMBER = new LabelMaskableDataType(_SHIPPER_ACCOUNT_NUMBER);
    public static final LabelMaskableDataType TERMS_AND_CONDITIONS = new LabelMaskableDataType(_TERMS_AND_CONDITIONS);
    public static final LabelMaskableDataType TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER = new LabelMaskableDataType(_TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER);
    public String getValue() { return _value_;}
    public static LabelMaskableDataType fromValue(String value)
          throws IllegalArgumentException {
        LabelMaskableDataType enumeration = (LabelMaskableDataType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static LabelMaskableDataType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(LabelMaskableDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelMaskableDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

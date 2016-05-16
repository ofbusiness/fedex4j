/**
 * PurposeOfShipmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class PurposeOfShipmentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PurposeOfShipmentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _GIFT = "GIFT";
    public static final String _NOT_SOLD = "NOT_SOLD";
    public static final String _PERSONAL_EFFECTS = "PERSONAL_EFFECTS";
    public static final String _REPAIR_AND_RETURN = "REPAIR_AND_RETURN";
    public static final String _SAMPLE = "SAMPLE";
    public static final String _SOLD = "SOLD";
    public static final PurposeOfShipmentType GIFT = new PurposeOfShipmentType(_GIFT);
    public static final PurposeOfShipmentType NOT_SOLD = new PurposeOfShipmentType(_NOT_SOLD);
    public static final PurposeOfShipmentType PERSONAL_EFFECTS = new PurposeOfShipmentType(_PERSONAL_EFFECTS);
    public static final PurposeOfShipmentType REPAIR_AND_RETURN = new PurposeOfShipmentType(_REPAIR_AND_RETURN);
    public static final PurposeOfShipmentType SAMPLE = new PurposeOfShipmentType(_SAMPLE);
    public static final PurposeOfShipmentType SOLD = new PurposeOfShipmentType(_SOLD);
    public String getValue() { return _value_;}
    public static PurposeOfShipmentType fromValue(String value)
          throws IllegalArgumentException {
        PurposeOfShipmentType enumeration = (PurposeOfShipmentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PurposeOfShipmentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PurposeOfShipmentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PurposeOfShipmentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

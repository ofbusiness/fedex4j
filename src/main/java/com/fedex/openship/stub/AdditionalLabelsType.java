/**
 * AdditionalLabelsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class AdditionalLabelsType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdditionalLabelsType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BROKER = "BROKER";
    public static final String _CONSIGNEE = "CONSIGNEE";
    public static final String _CUSTOMS = "CUSTOMS";
    public static final String _DESTINATION = "DESTINATION";
    public static final String _FREIGHT_REFERENCE = "FREIGHT_REFERENCE";
    public static final String _MANIFEST = "MANIFEST";
    public static final String _ORIGIN = "ORIGIN";
    public static final String _RECIPIENT = "RECIPIENT";
    public static final String _SHIPPER = "SHIPPER";
    public static final AdditionalLabelsType BROKER = new AdditionalLabelsType(_BROKER);
    public static final AdditionalLabelsType CONSIGNEE = new AdditionalLabelsType(_CONSIGNEE);
    public static final AdditionalLabelsType CUSTOMS = new AdditionalLabelsType(_CUSTOMS);
    public static final AdditionalLabelsType DESTINATION = new AdditionalLabelsType(_DESTINATION);
    public static final AdditionalLabelsType FREIGHT_REFERENCE = new AdditionalLabelsType(_FREIGHT_REFERENCE);
    public static final AdditionalLabelsType MANIFEST = new AdditionalLabelsType(_MANIFEST);
    public static final AdditionalLabelsType ORIGIN = new AdditionalLabelsType(_ORIGIN);
    public static final AdditionalLabelsType RECIPIENT = new AdditionalLabelsType(_RECIPIENT);
    public static final AdditionalLabelsType SHIPPER = new AdditionalLabelsType(_SHIPPER);
    public String getValue() { return _value_;}
    public static AdditionalLabelsType fromValue(String value)
          throws IllegalArgumentException {
        AdditionalLabelsType enumeration = (AdditionalLabelsType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AdditionalLabelsType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AdditionalLabelsType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdditionalLabelsType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

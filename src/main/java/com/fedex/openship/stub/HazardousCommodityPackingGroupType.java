/**
 * HazardousCommodityPackingGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class HazardousCommodityPackingGroupType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HazardousCommodityPackingGroupType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _DEFAULT = "DEFAULT";
    public static final String _I = "I";
    public static final String _II = "II";
    public static final String _III = "III";
    public static final HazardousCommodityPackingGroupType DEFAULT = new HazardousCommodityPackingGroupType(_DEFAULT);
    public static final HazardousCommodityPackingGroupType I = new HazardousCommodityPackingGroupType(_I);
    public static final HazardousCommodityPackingGroupType II = new HazardousCommodityPackingGroupType(_II);
    public static final HazardousCommodityPackingGroupType III = new HazardousCommodityPackingGroupType(_III);
    public String getValue() { return _value_;}
    public static HazardousCommodityPackingGroupType fromValue(String value)
          throws IllegalArgumentException {
        HazardousCommodityPackingGroupType enumeration = (HazardousCommodityPackingGroupType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static HazardousCommodityPackingGroupType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(HazardousCommodityPackingGroupType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingGroupType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

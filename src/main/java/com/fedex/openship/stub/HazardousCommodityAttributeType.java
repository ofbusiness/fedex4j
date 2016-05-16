/**
 * HazardousCommodityAttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class HazardousCommodityAttributeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HazardousCommodityAttributeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NOT_SUBJECT_TO_REGULATIONS = "NOT_SUBJECT_TO_REGULATIONS";
    public static final String _PLACARDED_VEHICLE_REQUIRED = "PLACARDED_VEHICLE_REQUIRED";
    public static final HazardousCommodityAttributeType NOT_SUBJECT_TO_REGULATIONS = new HazardousCommodityAttributeType(_NOT_SUBJECT_TO_REGULATIONS);
    public static final HazardousCommodityAttributeType PLACARDED_VEHICLE_REQUIRED = new HazardousCommodityAttributeType(_PLACARDED_VEHICLE_REQUIRED);
    public String getValue() { return _value_;}
    public static HazardousCommodityAttributeType fromValue(String value)
          throws IllegalArgumentException {
        HazardousCommodityAttributeType enumeration = (HazardousCommodityAttributeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static HazardousCommodityAttributeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(HazardousCommodityAttributeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityAttributeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

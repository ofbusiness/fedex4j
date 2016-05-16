/**
 * PickupServiceCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupServiceCategoryType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupServiceCategoryType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_DISTANCE_DEFERRED = "FEDEX_DISTANCE_DEFERRED";
    public static final String _FEDEX_NEXT_DAY_AFTERNOON = "FEDEX_NEXT_DAY_AFTERNOON";
    public static final String _FEDEX_NEXT_DAY_EARLY_MORNING = "FEDEX_NEXT_DAY_EARLY_MORNING";
    public static final String _FEDEX_NEXT_DAY_END_OF_DAY = "FEDEX_NEXT_DAY_END_OF_DAY";
    public static final String _FEDEX_NEXT_DAY_FREIGHT = "FEDEX_NEXT_DAY_FREIGHT";
    public static final String _FEDEX_NEXT_DAY_MID_MORNING = "FEDEX_NEXT_DAY_MID_MORNING";
    public static final String _SAME_DAY = "SAME_DAY";
    public static final String _SAME_DAY_CITY = "SAME_DAY_CITY";
    public static final PickupServiceCategoryType FEDEX_DISTANCE_DEFERRED = new PickupServiceCategoryType(_FEDEX_DISTANCE_DEFERRED);
    public static final PickupServiceCategoryType FEDEX_NEXT_DAY_AFTERNOON = new PickupServiceCategoryType(_FEDEX_NEXT_DAY_AFTERNOON);
    public static final PickupServiceCategoryType FEDEX_NEXT_DAY_EARLY_MORNING = new PickupServiceCategoryType(_FEDEX_NEXT_DAY_EARLY_MORNING);
    public static final PickupServiceCategoryType FEDEX_NEXT_DAY_END_OF_DAY = new PickupServiceCategoryType(_FEDEX_NEXT_DAY_END_OF_DAY);
    public static final PickupServiceCategoryType FEDEX_NEXT_DAY_FREIGHT = new PickupServiceCategoryType(_FEDEX_NEXT_DAY_FREIGHT);
    public static final PickupServiceCategoryType FEDEX_NEXT_DAY_MID_MORNING = new PickupServiceCategoryType(_FEDEX_NEXT_DAY_MID_MORNING);
    public static final PickupServiceCategoryType SAME_DAY = new PickupServiceCategoryType(_SAME_DAY);
    public static final PickupServiceCategoryType SAME_DAY_CITY = new PickupServiceCategoryType(_SAME_DAY_CITY);
    public String getValue() { return _value_;}
    public static PickupServiceCategoryType fromValue(String value)
          throws IllegalArgumentException {
        PickupServiceCategoryType enumeration = (PickupServiceCategoryType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PickupServiceCategoryType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PickupServiceCategoryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupServiceCategoryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

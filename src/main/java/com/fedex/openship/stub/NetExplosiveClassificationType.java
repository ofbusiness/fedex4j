/**
 * NetExplosiveClassificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class NetExplosiveClassificationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetExplosiveClassificationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NET_EXPLOSIVE_CONTENT = "NET_EXPLOSIVE_CONTENT";
    public static final String _NET_EXPLOSIVE_MASS = "NET_EXPLOSIVE_MASS";
    public static final String _NET_EXPLOSIVE_QUANTITY = "NET_EXPLOSIVE_QUANTITY";
    public static final String _NET_EXPLOSIVE_WEIGHT = "NET_EXPLOSIVE_WEIGHT";
    public static final NetExplosiveClassificationType NET_EXPLOSIVE_CONTENT = new NetExplosiveClassificationType(_NET_EXPLOSIVE_CONTENT);
    public static final NetExplosiveClassificationType NET_EXPLOSIVE_MASS = new NetExplosiveClassificationType(_NET_EXPLOSIVE_MASS);
    public static final NetExplosiveClassificationType NET_EXPLOSIVE_QUANTITY = new NetExplosiveClassificationType(_NET_EXPLOSIVE_QUANTITY);
    public static final NetExplosiveClassificationType NET_EXPLOSIVE_WEIGHT = new NetExplosiveClassificationType(_NET_EXPLOSIVE_WEIGHT);
    public String getValue() { return _value_;}
    public static NetExplosiveClassificationType fromValue(String value)
          throws IllegalArgumentException {
        NetExplosiveClassificationType enumeration = (NetExplosiveClassificationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static NetExplosiveClassificationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(NetExplosiveClassificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NetExplosiveClassificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

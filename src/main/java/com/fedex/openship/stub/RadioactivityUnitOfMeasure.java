/**
 * RadioactivityUnitOfMeasure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RadioactivityUnitOfMeasure implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RadioactivityUnitOfMeasure(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BQ = "BQ";
    public static final String _GBQ = "GBQ";
    public static final String _KBQ = "KBQ";
    public static final String _MBQ = "MBQ";
    public static final String _PBQ = "PBQ";
    public static final String _TBQ = "TBQ";
    public static final RadioactivityUnitOfMeasure BQ = new RadioactivityUnitOfMeasure(_BQ);
    public static final RadioactivityUnitOfMeasure GBQ = new RadioactivityUnitOfMeasure(_GBQ);
    public static final RadioactivityUnitOfMeasure KBQ = new RadioactivityUnitOfMeasure(_KBQ);
    public static final RadioactivityUnitOfMeasure MBQ = new RadioactivityUnitOfMeasure(_MBQ);
    public static final RadioactivityUnitOfMeasure PBQ = new RadioactivityUnitOfMeasure(_PBQ);
    public static final RadioactivityUnitOfMeasure TBQ = new RadioactivityUnitOfMeasure(_TBQ);
    public String getValue() { return _value_;}
    public static RadioactivityUnitOfMeasure fromValue(String value)
          throws IllegalArgumentException {
        RadioactivityUnitOfMeasure enumeration = (RadioactivityUnitOfMeasure)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RadioactivityUnitOfMeasure fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RadioactivityUnitOfMeasure.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactivityUnitOfMeasure"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * InternationalControlledExportType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class InternationalControlledExportType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InternationalControlledExportType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _DEA_036 = "DEA_036";
    public static final String _DEA_236 = "DEA_236";
    public static final String _DEA_486 = "DEA_486";
    public static final String _DSP_05 = "DSP_05";
    public static final String _DSP_61 = "DSP_61";
    public static final String _DSP_73 = "DSP_73";
    public static final String _DSP_85 = "DSP_85";
    public static final String _DSP_94 = "DSP_94";
    public static final String _DSP_LICENSE_AGREEMENT = "DSP_LICENSE_AGREEMENT";
    public static final String _FROM_FOREIGN_TRADE_ZONE = "FROM_FOREIGN_TRADE_ZONE";
    public static final String _WAREHOUSE_WITHDRAWAL = "WAREHOUSE_WITHDRAWAL";
    public static final InternationalControlledExportType DEA_036 = new InternationalControlledExportType(_DEA_036);
    public static final InternationalControlledExportType DEA_236 = new InternationalControlledExportType(_DEA_236);
    public static final InternationalControlledExportType DEA_486 = new InternationalControlledExportType(_DEA_486);
    public static final InternationalControlledExportType DSP_05 = new InternationalControlledExportType(_DSP_05);
    public static final InternationalControlledExportType DSP_61 = new InternationalControlledExportType(_DSP_61);
    public static final InternationalControlledExportType DSP_73 = new InternationalControlledExportType(_DSP_73);
    public static final InternationalControlledExportType DSP_85 = new InternationalControlledExportType(_DSP_85);
    public static final InternationalControlledExportType DSP_94 = new InternationalControlledExportType(_DSP_94);
    public static final InternationalControlledExportType DSP_LICENSE_AGREEMENT = new InternationalControlledExportType(_DSP_LICENSE_AGREEMENT);
    public static final InternationalControlledExportType FROM_FOREIGN_TRADE_ZONE = new InternationalControlledExportType(_FROM_FOREIGN_TRADE_ZONE);
    public static final InternationalControlledExportType WAREHOUSE_WITHDRAWAL = new InternationalControlledExportType(_WAREHOUSE_WITHDRAWAL);
    public String getValue() { return _value_;}
    public static InternationalControlledExportType fromValue(String value)
          throws IllegalArgumentException {
        InternationalControlledExportType enumeration = (InternationalControlledExportType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static InternationalControlledExportType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(InternationalControlledExportType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalControlledExportType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

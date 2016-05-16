/**
 * ShippingDocumentStockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ShippingDocumentStockType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingDocumentStockType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _value1 = "OP_900_LG_B";
    public static final String _value2 = "OP_900_LL_B";
    public static final String _value3 = "OP_950";
    public static final String _value4 = "PAPER_4X6";
    public static final String _value5 = "PAPER_4_PER_PAGE_PORTRAIT";
    public static final String _value6 = "PAPER_LETTER";
    public static final String _value7 = "STOCK_4X6";
    public static final String _value8 = "STOCK_4X6.75_LEADING_DOC_TAB";
    public static final String _value9 = "STOCK_4X6.75_TRAILING_DOC_TAB";
    public static final String _value10 = "STOCK_4X8";
    public static final String _value11 = "STOCK_4X9_LEADING_DOC_TAB";
    public static final String _value12 = "STOCK_4X9_TRAILING_DOC_TAB";
    public static final ShippingDocumentStockType value1 = new ShippingDocumentStockType(_value1);
    public static final ShippingDocumentStockType value2 = new ShippingDocumentStockType(_value2);
    public static final ShippingDocumentStockType value3 = new ShippingDocumentStockType(_value3);
    public static final ShippingDocumentStockType value4 = new ShippingDocumentStockType(_value4);
    public static final ShippingDocumentStockType value5 = new ShippingDocumentStockType(_value5);
    public static final ShippingDocumentStockType value6 = new ShippingDocumentStockType(_value6);
    public static final ShippingDocumentStockType value7 = new ShippingDocumentStockType(_value7);
    public static final ShippingDocumentStockType value8 = new ShippingDocumentStockType(_value8);
    public static final ShippingDocumentStockType value9 = new ShippingDocumentStockType(_value9);
    public static final ShippingDocumentStockType value10 = new ShippingDocumentStockType(_value10);
    public static final ShippingDocumentStockType value11 = new ShippingDocumentStockType(_value11);
    public static final ShippingDocumentStockType value12 = new ShippingDocumentStockType(_value12);
    public String getValue() { return _value_;}
    public static ShippingDocumentStockType fromValue(String value)
          throws IllegalArgumentException {
        ShippingDocumentStockType enumeration = (ShippingDocumentStockType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShippingDocumentStockType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ShippingDocumentStockType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentStockType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

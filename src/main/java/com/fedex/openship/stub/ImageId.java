/**
 * ImageId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ImageId implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ImageId(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _IMAGE_1 = "IMAGE_1";
    public static final String _IMAGE_2 = "IMAGE_2";
    public static final String _IMAGE_3 = "IMAGE_3";
    public static final String _IMAGE_4 = "IMAGE_4";
    public static final String _IMAGE_5 = "IMAGE_5";
    public static final ImageId IMAGE_1 = new ImageId(_IMAGE_1);
    public static final ImageId IMAGE_2 = new ImageId(_IMAGE_2);
    public static final ImageId IMAGE_3 = new ImageId(_IMAGE_3);
    public static final ImageId IMAGE_4 = new ImageId(_IMAGE_4);
    public static final ImageId IMAGE_5 = new ImageId(_IMAGE_5);
    public String getValue() { return _value_;}
    public static ImageId fromValue(String value)
          throws IllegalArgumentException {
        ImageId enumeration = (ImageId)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ImageId fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ImageId.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ImageId"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

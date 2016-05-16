/**
 * CreateOpenShipmentActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CreateOpenShipmentActionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreateOpenShipmentActionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CONFIRM = "CONFIRM";
    public static final String _CREATE_PACKAGE = "CREATE_PACKAGE";
    public static final String _STRONG_VALIDATION = "STRONG_VALIDATION";
    public static final String _TRANSFER = "TRANSFER";
    public static final String _WEAK_VALIDATION = "WEAK_VALIDATION";
    public static final CreateOpenShipmentActionType CONFIRM = new CreateOpenShipmentActionType(_CONFIRM);
    public static final CreateOpenShipmentActionType CREATE_PACKAGE = new CreateOpenShipmentActionType(_CREATE_PACKAGE);
    public static final CreateOpenShipmentActionType STRONG_VALIDATION = new CreateOpenShipmentActionType(_STRONG_VALIDATION);
    public static final CreateOpenShipmentActionType TRANSFER = new CreateOpenShipmentActionType(_TRANSFER);
    public static final CreateOpenShipmentActionType WEAK_VALIDATION = new CreateOpenShipmentActionType(_WEAK_VALIDATION);
    public String getValue() { return _value_;}
    public static CreateOpenShipmentActionType fromValue(String value)
          throws IllegalArgumentException {
        CreateOpenShipmentActionType enumeration = (CreateOpenShipmentActionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CreateOpenShipmentActionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CreateOpenShipmentActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

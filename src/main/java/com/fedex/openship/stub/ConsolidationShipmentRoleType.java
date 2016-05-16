/**
 * ConsolidationShipmentRoleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidationShipmentRoleType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConsolidationShipmentRoleType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CONSOLIDATION_DOCUMENTS_SHIPMENT = "CONSOLIDATION_DOCUMENTS_SHIPMENT";
    public static final String _CRN_SHIPMENT = "CRN_SHIPMENT";
    public static final String _MASTER_AIRWAYBILL_SHIPMENT = "MASTER_AIRWAYBILL_SHIPMENT";
    public static final ConsolidationShipmentRoleType CONSOLIDATION_DOCUMENTS_SHIPMENT = new ConsolidationShipmentRoleType(_CONSOLIDATION_DOCUMENTS_SHIPMENT);
    public static final ConsolidationShipmentRoleType CRN_SHIPMENT = new ConsolidationShipmentRoleType(_CRN_SHIPMENT);
    public static final ConsolidationShipmentRoleType MASTER_AIRWAYBILL_SHIPMENT = new ConsolidationShipmentRoleType(_MASTER_AIRWAYBILL_SHIPMENT);
    public String getValue() { return _value_;}
    public static ConsolidationShipmentRoleType fromValue(String value)
          throws IllegalArgumentException {
        ConsolidationShipmentRoleType enumeration = (ConsolidationShipmentRoleType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ConsolidationShipmentRoleType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ConsolidationShipmentRoleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipmentRoleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * CustomerReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CustomerReferenceType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerReferenceType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BILL_OF_LADING = "BILL_OF_LADING";
    public static final String _CUSTOMER_REFERENCE = "CUSTOMER_REFERENCE";
    public static final String _DEPARTMENT_NUMBER = "DEPARTMENT_NUMBER";
    public static final String _ELECTRONIC_PRODUCT_CODE = "ELECTRONIC_PRODUCT_CODE";
    public static final String _INTRACOUNTRY_REGULATORY_REFERENCE = "INTRACOUNTRY_REGULATORY_REFERENCE";
    public static final String _INVOICE_NUMBER = "INVOICE_NUMBER";
    public static final String _P_O_NUMBER = "P_O_NUMBER";
    public static final String _RMA_ASSOCIATION = "RMA_ASSOCIATION";
    public static final String _SHIPMENT_INTEGRITY = "SHIPMENT_INTEGRITY";
    public static final String _STORE_NUMBER = "STORE_NUMBER";
    public static final CustomerReferenceType BILL_OF_LADING = new CustomerReferenceType(_BILL_OF_LADING);
    public static final CustomerReferenceType CUSTOMER_REFERENCE = new CustomerReferenceType(_CUSTOMER_REFERENCE);
    public static final CustomerReferenceType DEPARTMENT_NUMBER = new CustomerReferenceType(_DEPARTMENT_NUMBER);
    public static final CustomerReferenceType ELECTRONIC_PRODUCT_CODE = new CustomerReferenceType(_ELECTRONIC_PRODUCT_CODE);
    public static final CustomerReferenceType INTRACOUNTRY_REGULATORY_REFERENCE = new CustomerReferenceType(_INTRACOUNTRY_REGULATORY_REFERENCE);
    public static final CustomerReferenceType INVOICE_NUMBER = new CustomerReferenceType(_INVOICE_NUMBER);
    public static final CustomerReferenceType P_O_NUMBER = new CustomerReferenceType(_P_O_NUMBER);
    public static final CustomerReferenceType RMA_ASSOCIATION = new CustomerReferenceType(_RMA_ASSOCIATION);
    public static final CustomerReferenceType SHIPMENT_INTEGRITY = new CustomerReferenceType(_SHIPMENT_INTEGRITY);
    public static final CustomerReferenceType STORE_NUMBER = new CustomerReferenceType(_STORE_NUMBER);
    public String getValue() { return _value_;}
    public static CustomerReferenceType fromValue(String value)
          throws IllegalArgumentException {
        CustomerReferenceType enumeration = (CustomerReferenceType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CustomerReferenceType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CustomerReferenceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReferenceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

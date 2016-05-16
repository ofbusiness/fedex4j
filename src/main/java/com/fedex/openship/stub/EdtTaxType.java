/**
 * EdtTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class EdtTaxType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EdtTaxType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ADDITIONAL_TAXES = "ADDITIONAL_TAXES";
    public static final String _CONSULAR_INVOICE_FEE = "CONSULAR_INVOICE_FEE";
    public static final String _CUSTOMS_SURCHARGES = "CUSTOMS_SURCHARGES";
    public static final String _DUTY = "DUTY";
    public static final String _EXCISE_TAX = "EXCISE_TAX";
    public static final String _FOREIGN_EXCHANGE_TAX = "FOREIGN_EXCHANGE_TAX";
    public static final String _GENERAL_SALES_TAX = "GENERAL_SALES_TAX";
    public static final String _IMPORT_LICENSE_FEE = "IMPORT_LICENSE_FEE";
    public static final String _INTERNAL_ADDITIONAL_TAXES = "INTERNAL_ADDITIONAL_TAXES";
    public static final String _INTERNAL_SENSITIVE_PRODUCTS_TAX = "INTERNAL_SENSITIVE_PRODUCTS_TAX";
    public static final String _OTHER = "OTHER";
    public static final String _SENSITIVE_PRODUCTS_TAX = "SENSITIVE_PRODUCTS_TAX";
    public static final String _STAMP_TAX = "STAMP_TAX";
    public static final String _STATISTICAL_TAX = "STATISTICAL_TAX";
    public static final String _TRANSPORT_FACILITIES_TAX = "TRANSPORT_FACILITIES_TAX";
    public static final EdtTaxType ADDITIONAL_TAXES = new EdtTaxType(_ADDITIONAL_TAXES);
    public static final EdtTaxType CONSULAR_INVOICE_FEE = new EdtTaxType(_CONSULAR_INVOICE_FEE);
    public static final EdtTaxType CUSTOMS_SURCHARGES = new EdtTaxType(_CUSTOMS_SURCHARGES);
    public static final EdtTaxType DUTY = new EdtTaxType(_DUTY);
    public static final EdtTaxType EXCISE_TAX = new EdtTaxType(_EXCISE_TAX);
    public static final EdtTaxType FOREIGN_EXCHANGE_TAX = new EdtTaxType(_FOREIGN_EXCHANGE_TAX);
    public static final EdtTaxType GENERAL_SALES_TAX = new EdtTaxType(_GENERAL_SALES_TAX);
    public static final EdtTaxType IMPORT_LICENSE_FEE = new EdtTaxType(_IMPORT_LICENSE_FEE);
    public static final EdtTaxType INTERNAL_ADDITIONAL_TAXES = new EdtTaxType(_INTERNAL_ADDITIONAL_TAXES);
    public static final EdtTaxType INTERNAL_SENSITIVE_PRODUCTS_TAX = new EdtTaxType(_INTERNAL_SENSITIVE_PRODUCTS_TAX);
    public static final EdtTaxType OTHER = new EdtTaxType(_OTHER);
    public static final EdtTaxType SENSITIVE_PRODUCTS_TAX = new EdtTaxType(_SENSITIVE_PRODUCTS_TAX);
    public static final EdtTaxType STAMP_TAX = new EdtTaxType(_STAMP_TAX);
    public static final EdtTaxType STATISTICAL_TAX = new EdtTaxType(_STATISTICAL_TAX);
    public static final EdtTaxType TRANSPORT_FACILITIES_TAX = new EdtTaxType(_TRANSPORT_FACILITIES_TAX);
    public String getValue() { return _value_;}
    public static EdtTaxType fromValue(String value)
          throws IllegalArgumentException {
        EdtTaxType enumeration = (EdtTaxType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static EdtTaxType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(EdtTaxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtTaxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

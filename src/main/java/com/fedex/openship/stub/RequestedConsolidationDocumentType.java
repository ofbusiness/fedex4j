/**
 * RequestedConsolidationDocumentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RequestedConsolidationDocumentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RequestedConsolidationDocumentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CONDENSED_CRN_REPORT = "CONDENSED_CRN_REPORT";
    public static final String _CONSOLIDATED_COMMERCIAL_INVOICE = "CONSOLIDATED_COMMERCIAL_INVOICE";
    public static final String _CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT = "CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT";
    public static final String _CONSOLIDATED_PARTY_REPORT = "CONSOLIDATED_PARTY_REPORT";
    public static final String _CONSOLIDATED_SOLD_TO_SUMMARY_REPORT = "CONSOLIDATED_SOLD_TO_SUMMARY_REPORT";
    public static final String _CRN_REPORT = "CRN_REPORT";
    public static final String _CUSTOMS_PACKING_LIST = "CUSTOMS_PACKING_LIST";
    public static final String _CUSTOM_CONSOLIDATION_DOCUMENT = "CUSTOM_CONSOLIDATION_DOCUMENT";
    public static final RequestedConsolidationDocumentType CONDENSED_CRN_REPORT = new RequestedConsolidationDocumentType(_CONDENSED_CRN_REPORT);
    public static final RequestedConsolidationDocumentType CONSOLIDATED_COMMERCIAL_INVOICE = new RequestedConsolidationDocumentType(_CONSOLIDATED_COMMERCIAL_INVOICE);
    public static final RequestedConsolidationDocumentType CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT = new RequestedConsolidationDocumentType(_CONSOLIDATED_CUSTOMS_LINEHAUL_REPORT);
    public static final RequestedConsolidationDocumentType CONSOLIDATED_PARTY_REPORT = new RequestedConsolidationDocumentType(_CONSOLIDATED_PARTY_REPORT);
    public static final RequestedConsolidationDocumentType CONSOLIDATED_SOLD_TO_SUMMARY_REPORT = new RequestedConsolidationDocumentType(_CONSOLIDATED_SOLD_TO_SUMMARY_REPORT);
    public static final RequestedConsolidationDocumentType CRN_REPORT = new RequestedConsolidationDocumentType(_CRN_REPORT);
    public static final RequestedConsolidationDocumentType CUSTOMS_PACKING_LIST = new RequestedConsolidationDocumentType(_CUSTOMS_PACKING_LIST);
    public static final RequestedConsolidationDocumentType CUSTOM_CONSOLIDATION_DOCUMENT = new RequestedConsolidationDocumentType(_CUSTOM_CONSOLIDATION_DOCUMENT);
    public String getValue() { return _value_;}
    public static RequestedConsolidationDocumentType fromValue(String value)
          throws IllegalArgumentException {
        RequestedConsolidationDocumentType enumeration = (RequestedConsolidationDocumentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RequestedConsolidationDocumentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RequestedConsolidationDocumentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidationDocumentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

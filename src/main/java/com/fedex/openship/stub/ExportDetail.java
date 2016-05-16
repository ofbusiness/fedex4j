/**
 * ExportDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Country specific details of an International shipment.
 */
public class ExportDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.B13AFilingOptionType b13AFilingOption;

    /* General field for exporting-country-specific export data (e.g.
     * B13A for CA, FTSR Exemption or AES Citation for US). */
    private String exportComplianceStatement;

    private String permitNumber;

    private com.fedex.openship.stub.DestinationControlDetail destinationControlDetail;

    public ExportDetail() {
    }

    public ExportDetail(
           com.fedex.openship.stub.B13AFilingOptionType b13AFilingOption,
           String exportComplianceStatement,
           String permitNumber,
           com.fedex.openship.stub.DestinationControlDetail destinationControlDetail) {
           this.b13AFilingOption = b13AFilingOption;
           this.exportComplianceStatement = exportComplianceStatement;
           this.permitNumber = permitNumber;
           this.destinationControlDetail = destinationControlDetail;
    }


    /**
     * Gets the b13AFilingOption value for this ExportDetail.
     * 
     * @return b13AFilingOption
     */
    public com.fedex.openship.stub.B13AFilingOptionType getB13AFilingOption() {
        return b13AFilingOption;
    }


    /**
     * Sets the b13AFilingOption value for this ExportDetail.
     * 
     * @param b13AFilingOption
     */
    public void setB13AFilingOption(com.fedex.openship.stub.B13AFilingOptionType b13AFilingOption) {
        this.b13AFilingOption = b13AFilingOption;
    }


    /**
     * Gets the exportComplianceStatement value for this ExportDetail.
     * 
     * @return exportComplianceStatement   * General field for exporting-country-specific export data (e.g.
     * B13A for CA, FTSR Exemption or AES Citation for US).
     */
    public String getExportComplianceStatement() {
        return exportComplianceStatement;
    }


    /**
     * Sets the exportComplianceStatement value for this ExportDetail.
     * 
     * @param exportComplianceStatement   * General field for exporting-country-specific export data (e.g.
     * B13A for CA, FTSR Exemption or AES Citation for US).
     */
    public void setExportComplianceStatement(String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }


    /**
     * Gets the permitNumber value for this ExportDetail.
     * 
     * @return permitNumber
     */
    public String getPermitNumber() {
        return permitNumber;
    }


    /**
     * Sets the permitNumber value for this ExportDetail.
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }


    /**
     * Gets the destinationControlDetail value for this ExportDetail.
     * 
     * @return destinationControlDetail
     */
    public com.fedex.openship.stub.DestinationControlDetail getDestinationControlDetail() {
        return destinationControlDetail;
    }


    /**
     * Sets the destinationControlDetail value for this ExportDetail.
     * 
     * @param destinationControlDetail
     */
    public void setDestinationControlDetail(com.fedex.openship.stub.DestinationControlDetail destinationControlDetail) {
        this.destinationControlDetail = destinationControlDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExportDetail)) return false;
        ExportDetail other = (ExportDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.b13AFilingOption==null && other.getB13AFilingOption()==null) || 
             (this.b13AFilingOption!=null &&
              this.b13AFilingOption.equals(other.getB13AFilingOption()))) &&
            ((this.exportComplianceStatement==null && other.getExportComplianceStatement()==null) || 
             (this.exportComplianceStatement!=null &&
              this.exportComplianceStatement.equals(other.getExportComplianceStatement()))) &&
            ((this.permitNumber==null && other.getPermitNumber()==null) || 
             (this.permitNumber!=null &&
              this.permitNumber.equals(other.getPermitNumber()))) &&
            ((this.destinationControlDetail==null && other.getDestinationControlDetail()==null) || 
             (this.destinationControlDetail!=null &&
              this.destinationControlDetail.equals(other.getDestinationControlDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getB13AFilingOption() != null) {
            _hashCode += getB13AFilingOption().hashCode();
        }
        if (getExportComplianceStatement() != null) {
            _hashCode += getExportComplianceStatement().hashCode();
        }
        if (getPermitNumber() != null) {
            _hashCode += getPermitNumber().hashCode();
        }
        if (getDestinationControlDetail() != null) {
            _hashCode += getDestinationControlDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExportDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b13AFilingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "B13AFilingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "B13AFilingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportComplianceStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportComplianceStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PermitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationControlDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DestinationControlDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DestinationControlDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * ConsolidatedCommercialInvoiceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * The instructions indicating how to print the consolidated commercial
 * invoice.
 */
public class ConsolidatedCommercialInvoiceDetail  implements java.io.Serializable {
    private ShippingDocumentFormat format;

    /* Specifies the usage and identification of a customer supplied
     * image to be used on this document. */
    private CustomerImageUsage[] customerImageUsages;

    /* Name of the person signing the document. */
    private String signatureName;

    public ConsolidatedCommercialInvoiceDetail() {
    }

    public ConsolidatedCommercialInvoiceDetail(
           ShippingDocumentFormat format,
           CustomerImageUsage[] customerImageUsages,
           String signatureName) {
           this.format = format;
           this.customerImageUsages = customerImageUsages;
           this.signatureName = signatureName;
    }


    /**
     * Gets the format value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @return format
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @param format
     */
    public void setFormat(ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the customerImageUsages value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @return customerImageUsages   * Specifies the usage and identification of a customer supplied
     * image to be used on this document.
     */
    public CustomerImageUsage[] getCustomerImageUsages() {
        return customerImageUsages;
    }


    /**
     * Sets the customerImageUsages value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @param customerImageUsages   * Specifies the usage and identification of a customer supplied
     * image to be used on this document.
     */
    public void setCustomerImageUsages(CustomerImageUsage[] customerImageUsages) {
        this.customerImageUsages = customerImageUsages;
    }

    public CustomerImageUsage getCustomerImageUsages(int i) {
        return this.customerImageUsages[i];
    }

    public void setCustomerImageUsages(int i, CustomerImageUsage _value) {
        this.customerImageUsages[i] = _value;
    }


    /**
     * Gets the signatureName value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @return signatureName   * Name of the person signing the document.
     */
    public String getSignatureName() {
        return signatureName;
    }


    /**
     * Sets the signatureName value for this ConsolidatedCommercialInvoiceDetail.
     * 
     * @param signatureName   * Name of the person signing the document.
     */
    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedCommercialInvoiceDetail)) return false;
        ConsolidatedCommercialInvoiceDetail other = (ConsolidatedCommercialInvoiceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.customerImageUsages==null && other.getCustomerImageUsages()==null) || 
             (this.customerImageUsages!=null &&
              java.util.Arrays.equals(this.customerImageUsages, other.getCustomerImageUsages()))) &&
            ((this.signatureName==null && other.getSignatureName()==null) || 
             (this.signatureName!=null &&
              this.signatureName.equals(other.getSignatureName())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getCustomerImageUsages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerImageUsages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerImageUsages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignatureName() != null) {
            _hashCode += getSignatureName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedCommercialInvoiceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommercialInvoiceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerImageUsages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerImageUsages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerImageUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * ShippingDocumentEMailDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies how to e-mail shipping documents.
 */
public class ShippingDocumentEMailDetail  implements java.io.Serializable {
    /* Provides the roles and email addresses for e-mail recipients. */
    private com.fedex.openship.stub.ShippingDocumentEMailRecipient[] EMailRecipients;

    /* Identifies the convention by which documents are to be grouped
     * as e-mail attachments. */
    private com.fedex.openship.stub.ShippingDocumentEMailGroupingType grouping;

    /* Specifies the language in which the email containing the document
     * is requested to be composed. */
    private Localization localization;

    public ShippingDocumentEMailDetail() {
    }

    public ShippingDocumentEMailDetail(
           com.fedex.openship.stub.ShippingDocumentEMailRecipient[] EMailRecipients,
           com.fedex.openship.stub.ShippingDocumentEMailGroupingType grouping,
           Localization localization) {
           this.EMailRecipients = EMailRecipients;
           this.grouping = grouping;
           this.localization = localization;
    }


    /**
     * Gets the EMailRecipients value for this ShippingDocumentEMailDetail.
     * 
     * @return EMailRecipients   * Provides the roles and email addresses for e-mail recipients.
     */
    public com.fedex.openship.stub.ShippingDocumentEMailRecipient[] getEMailRecipients() {
        return EMailRecipients;
    }


    /**
     * Sets the EMailRecipients value for this ShippingDocumentEMailDetail.
     * 
     * @param EMailRecipients   * Provides the roles and email addresses for e-mail recipients.
     */
    public void setEMailRecipients(com.fedex.openship.stub.ShippingDocumentEMailRecipient[] EMailRecipients) {
        this.EMailRecipients = EMailRecipients;
    }

    public com.fedex.openship.stub.ShippingDocumentEMailRecipient getEMailRecipients(int i) {
        return this.EMailRecipients[i];
    }

    public void setEMailRecipients(int i, com.fedex.openship.stub.ShippingDocumentEMailRecipient _value) {
        this.EMailRecipients[i] = _value;
    }


    /**
     * Gets the grouping value for this ShippingDocumentEMailDetail.
     * 
     * @return grouping   * Identifies the convention by which documents are to be grouped
     * as e-mail attachments.
     */
    public com.fedex.openship.stub.ShippingDocumentEMailGroupingType getGrouping() {
        return grouping;
    }


    /**
     * Sets the grouping value for this ShippingDocumentEMailDetail.
     * 
     * @param grouping   * Identifies the convention by which documents are to be grouped
     * as e-mail attachments.
     */
    public void setGrouping(com.fedex.openship.stub.ShippingDocumentEMailGroupingType grouping) {
        this.grouping = grouping;
    }


    /**
     * Gets the localization value for this ShippingDocumentEMailDetail.
     * 
     * @return localization   * Specifies the language in which the email containing the document
     * is requested to be composed.
     */
    public Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this ShippingDocumentEMailDetail.
     * 
     * @param localization   * Specifies the language in which the email containing the document
     * is requested to be composed.
     */
    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingDocumentEMailDetail)) return false;
        ShippingDocumentEMailDetail other = (ShippingDocumentEMailDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMailRecipients==null && other.getEMailRecipients()==null) || 
             (this.EMailRecipients!=null &&
              java.util.Arrays.equals(this.EMailRecipients, other.getEMailRecipients()))) &&
            ((this.grouping==null && other.getGrouping()==null) || 
             (this.grouping!=null &&
              this.grouping.equals(other.getGrouping()))) &&
            ((this.localization==null && other.getLocalization()==null) || 
             (this.localization!=null &&
              this.localization.equals(other.getLocalization())));
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
        if (getEMailRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMailRecipients());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEMailRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrouping() != null) {
            _hashCode += getGrouping().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDocumentEMailDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailRecipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grouping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Grouping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailGroupingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Localization"));
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

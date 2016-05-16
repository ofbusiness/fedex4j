/**
 * EMailLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class EMailLabelDetail  implements java.io.Serializable {
    /* Content of the email message. */
    private String message;

    private EMailRecipient[] recipients;

    public EMailLabelDetail() {
    }

    public EMailLabelDetail(
           String message,
           EMailRecipient[] recipients) {
           this.message = message;
           this.recipients = recipients;
    }


    /**
     * Gets the message value for this EMailLabelDetail.
     * 
     * @return message   * Content of the email message.
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this EMailLabelDetail.
     * 
     * @param message   * Content of the email message.
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * Gets the recipients value for this EMailLabelDetail.
     * 
     * @return recipients
     */
    public EMailRecipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this EMailLabelDetail.
     * 
     * @param recipients
     */
    public void setRecipients(EMailRecipient[] recipients) {
        this.recipients = recipients;
    }

    public EMailRecipient getRecipients(int i) {
        return this.recipients[i];
    }

    public void setRecipients(int i, EMailRecipient _value) {
        this.recipients[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EMailLabelDetail)) return false;
        EMailLabelDetail other = (EMailLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EMailLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EMailRecipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

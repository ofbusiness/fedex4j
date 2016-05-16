/**
 * EMailNotificationRecipient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class EMailNotificationRecipient  implements java.io.Serializable {
    /* Identifies the relationship this email recipient has to the
     * shipment. */
    private com.fedex.track.stub.EMailNotificationRecipientType EMailNotificationRecipientType;

    /* The email address to send the notification to */
    private String EMailAddress;

    /* The types of email notifications being requested for this recipient. */
    private EMailNotificationEventType[] notificationEventsRequested;

    /* The format of the email notification. */
    private EMailNotificationFormatType format;

    /* The language/locale to be used in this email notification. */
    private Localization localization;

    public EMailNotificationRecipient() {
    }

    public EMailNotificationRecipient(
           com.fedex.track.stub.EMailNotificationRecipientType EMailNotificationRecipientType,
           String EMailAddress,
           EMailNotificationEventType[] notificationEventsRequested,
           EMailNotificationFormatType format,
           Localization localization) {
           this.EMailNotificationRecipientType = EMailNotificationRecipientType;
           this.EMailAddress = EMailAddress;
           this.notificationEventsRequested = notificationEventsRequested;
           this.format = format;
           this.localization = localization;
    }


    /**
     * Gets the EMailNotificationRecipientType value for this EMailNotificationRecipient.
     * 
     * @return EMailNotificationRecipientType   * Identifies the relationship this email recipient has to the
     * shipment.
     */
    public com.fedex.track.stub.EMailNotificationRecipientType getEMailNotificationRecipientType() {
        return EMailNotificationRecipientType;
    }


    /**
     * Sets the EMailNotificationRecipientType value for this EMailNotificationRecipient.
     * 
     * @param EMailNotificationRecipientType   * Identifies the relationship this email recipient has to the
     * shipment.
     */
    public void setEMailNotificationRecipientType(com.fedex.track.stub.EMailNotificationRecipientType EMailNotificationRecipientType) {
        this.EMailNotificationRecipientType = EMailNotificationRecipientType;
    }


    /**
     * Gets the EMailAddress value for this EMailNotificationRecipient.
     * 
     * @return EMailAddress   * The email address to send the notification to
     */
    public String getEMailAddress() {
        return EMailAddress;
    }


    /**
     * Sets the EMailAddress value for this EMailNotificationRecipient.
     * 
     * @param EMailAddress   * The email address to send the notification to
     */
    public void setEMailAddress(String EMailAddress) {
        this.EMailAddress = EMailAddress;
    }


    /**
     * Gets the notificationEventsRequested value for this EMailNotificationRecipient.
     * 
     * @return notificationEventsRequested   * The types of email notifications being requested for this recipient.
     */
    public EMailNotificationEventType[] getNotificationEventsRequested() {
        return notificationEventsRequested;
    }


    /**
     * Sets the notificationEventsRequested value for this EMailNotificationRecipient.
     * 
     * @param notificationEventsRequested   * The types of email notifications being requested for this recipient.
     */
    public void setNotificationEventsRequested(EMailNotificationEventType[] notificationEventsRequested) {
        this.notificationEventsRequested = notificationEventsRequested;
    }

    public EMailNotificationEventType getNotificationEventsRequested(int i) {
        return this.notificationEventsRequested[i];
    }

    public void setNotificationEventsRequested(int i, EMailNotificationEventType _value) {
        this.notificationEventsRequested[i] = _value;
    }


    /**
     * Gets the format value for this EMailNotificationRecipient.
     * 
     * @return format   * The format of the email notification.
     */
    public EMailNotificationFormatType getFormat() {
        return format;
    }


    /**
     * Sets the format value for this EMailNotificationRecipient.
     * 
     * @param format   * The format of the email notification.
     */
    public void setFormat(EMailNotificationFormatType format) {
        this.format = format;
    }


    /**
     * Gets the localization value for this EMailNotificationRecipient.
     * 
     * @return localization   * The language/locale to be used in this email notification.
     */
    public Localization getLocalization() {
        return localization;
    }


    /**
     * Sets the localization value for this EMailNotificationRecipient.
     * 
     * @param localization   * The language/locale to be used in this email notification.
     */
    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EMailNotificationRecipient)) return false;
        EMailNotificationRecipient other = (EMailNotificationRecipient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMailNotificationRecipientType==null && other.getEMailNotificationRecipientType()==null) || 
             (this.EMailNotificationRecipientType!=null &&
              this.EMailNotificationRecipientType.equals(other.getEMailNotificationRecipientType()))) &&
            ((this.EMailAddress==null && other.getEMailAddress()==null) || 
             (this.EMailAddress!=null &&
              this.EMailAddress.equals(other.getEMailAddress()))) &&
            ((this.notificationEventsRequested==null && other.getNotificationEventsRequested()==null) || 
             (this.notificationEventsRequested!=null &&
              java.util.Arrays.equals(this.notificationEventsRequested, other.getNotificationEventsRequested()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
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
        if (getEMailNotificationRecipientType() != null) {
            _hashCode += getEMailNotificationRecipientType().hashCode();
        }
        if (getEMailAddress() != null) {
            _hashCode += getEMailAddress().hashCode();
        }
        if (getNotificationEventsRequested() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEventsRequested());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationEventsRequested(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLocalization() != null) {
            _hashCode += getLocalization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailNotificationRecipient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationRecipient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailNotificationRecipientType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationRecipientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationRecipientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEventsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationEventsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationFormatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Localization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Localization"));
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

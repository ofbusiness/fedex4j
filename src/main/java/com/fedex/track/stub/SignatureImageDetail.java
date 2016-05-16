/**
 * SignatureImageDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public class SignatureImageDetail  implements java.io.Serializable {
    private byte[] image;

    private Notification[] notifications;

    public SignatureImageDetail() {
    }

    public SignatureImageDetail(
           byte[] image,
           Notification[] notifications) {
           this.image = image;
           this.notifications = notifications;
    }


    /**
     * Gets the image value for this SignatureImageDetail.
     * 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this SignatureImageDetail.
     * 
     * @param image
     */
    public void setImage(byte[] image) {
        this.image = image;
    }


    /**
     * Gets the notifications value for this SignatureImageDetail.
     * 
     * @return notifications
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this SignatureImageDetail.
     * 
     * @param notifications
     */
    public void setNotifications(Notification[] notifications) {
        this.notifications = notifications;
    }

    public Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, Notification _value) {
        this.notifications[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SignatureImageDetail)) return false;
        SignatureImageDetail other = (SignatureImageDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications())));
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
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotifications(), i);
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
        new org.apache.axis.description.TypeDesc(SignatureImageDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureImageDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification"));
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

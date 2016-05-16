/**
 * SignatureProofOfDeliveryLetterReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * FedEx Signature Proof Of Delivery Letter reply.
 */
public class SignatureProofOfDeliveryLetterReply  implements java.io.Serializable {
    /* This contains the severity type of the most severe Notification
     * in the Notifications array. */
    private NotificationSeverityType highestSeverity;

    /* Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply. */
    private Notification[] notifications;

    /* Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data. */
    private TransactionDetail transactionDetail;

    /* Image of letter encoded in Base64 format. */
    private VersionId version;

    /* Image of letter encoded in Base64 format. */
    private byte[] letter;

    public SignatureProofOfDeliveryLetterReply() {
    }

    public SignatureProofOfDeliveryLetterReply(
           NotificationSeverityType highestSeverity,
           Notification[] notifications,
           TransactionDetail transactionDetail,
           VersionId version,
           byte[] letter) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.letter = letter;
    }


    /**
     * Gets the highestSeverity value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @return highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @param highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public void setHighestSeverity(NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @return notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @param notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
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


    /**
     * Gets the transactionDetail value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @return transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @param transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @return version   * Image of letter encoded in Base64 format.
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @param version   * Image of letter encoded in Base64 format.
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the letter value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @return letter   * Image of letter encoded in Base64 format.
     */
    public byte[] getLetter() {
        return letter;
    }


    /**
     * Sets the letter value for this SignatureProofOfDeliveryLetterReply.
     * 
     * @param letter   * Image of letter encoded in Base64 format.
     */
    public void setLetter(byte[] letter) {
        this.letter = letter;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SignatureProofOfDeliveryLetterReply)) return false;
        SignatureProofOfDeliveryLetterReply other = (SignatureProofOfDeliveryLetterReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.letter==null && other.getLetter()==null) || 
             (this.letter!=null &&
              java.util.Arrays.equals(this.letter, other.getLetter())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
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
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getLetter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLetter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLetter(), i);
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
        new org.apache.axis.description.TypeDesc(SignatureProofOfDeliveryLetterReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Letter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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

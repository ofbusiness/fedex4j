/**
 * TrackReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * The descriptive data returned from a FedEx package tracking request.
 */
public class TrackReply  implements java.io.Serializable {
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

    /* Contains the version of the reply being used. */
    private VersionId version;

    /* Contains detailed tracking entity information. */
    private CompletedTrackDetail[] completedTrackDetails;

    public TrackReply() {
    }

    public TrackReply(
           NotificationSeverityType highestSeverity,
           Notification[] notifications,
           TransactionDetail transactionDetail,
           VersionId version,
           CompletedTrackDetail[] completedTrackDetails) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.completedTrackDetails = completedTrackDetails;
    }


    /**
     * Gets the highestSeverity value for this TrackReply.
     * 
     * @return highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this TrackReply.
     * 
     * @param highestSeverity   * This contains the severity type of the most severe Notification
     * in the Notifications array.
     */
    public void setHighestSeverity(NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this TrackReply.
     * 
     * @return notifications   * Information about the request/reply such was the transaction
     * successful or not, and any additional information relevant to the
     * request and/or reply. There may be multiple Notifications in a reply.
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this TrackReply.
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
     * Gets the transactionDetail value for this TrackReply.
     * 
     * @return transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this TrackReply.
     * 
     * @param transactionDetail   * Contains the CustomerTransactionDetail that is echoed back
     * to the caller for matching requests and replies and a Localization
     * element for defining the language/translation used in the reply data.
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this TrackReply.
     * 
     * @return version   * Contains the version of the reply being used.
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this TrackReply.
     * 
     * @param version   * Contains the version of the reply being used.
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the completedTrackDetails value for this TrackReply.
     * 
     * @return completedTrackDetails   * Contains detailed tracking entity information.
     */
    public CompletedTrackDetail[] getCompletedTrackDetails() {
        return completedTrackDetails;
    }


    /**
     * Sets the completedTrackDetails value for this TrackReply.
     * 
     * @param completedTrackDetails   * Contains detailed tracking entity information.
     */
    public void setCompletedTrackDetails(CompletedTrackDetail[] completedTrackDetails) {
        this.completedTrackDetails = completedTrackDetails;
    }

    public CompletedTrackDetail getCompletedTrackDetails(int i) {
        return this.completedTrackDetails[i];
    }

    public void setCompletedTrackDetails(int i, CompletedTrackDetail _value) {
        this.completedTrackDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackReply)) return false;
        TrackReply other = (TrackReply) obj;
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
            ((this.completedTrackDetails==null && other.getCompletedTrackDetails()==null) || 
             (this.completedTrackDetails!=null &&
              java.util.Arrays.equals(this.completedTrackDetails, other.getCompletedTrackDetails())));
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
        if (getCompletedTrackDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedTrackDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCompletedTrackDetails(), i);
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
        new org.apache.axis.description.TypeDesc(TrackReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReply"));
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
        elemField.setFieldName("completedTrackDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CompletedTrackDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CompletedTrackDetail"));
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

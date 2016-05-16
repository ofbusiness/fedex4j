/**
 * PickupAvailabilityReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupAvailabilityReply  implements java.io.Serializable {
    private com.fedex.pickup.stub.NotificationSeverityType highestSeverity;

    private Notification[] notifications;

    private TransactionDetail transactionDetail;

    private VersionId version;

    private java.util.Calendar requestTimestamp;

    private PickupScheduleOption[] options;

    /* Identifies whether the close time is specified by the customer
     * or is the default time. */
    private CloseTimeType closeTimeType;

    /* Close time corresponding to the above specified type */
    private org.apache.axis.types.Time closeTime;

    /* Local time of the service center that will service the pickup */
    private org.apache.axis.types.Time localTime;

    public PickupAvailabilityReply() {
    }

    public PickupAvailabilityReply(
           com.fedex.pickup.stub.NotificationSeverityType highestSeverity,
           Notification[] notifications,
           TransactionDetail transactionDetail,
           VersionId version,
           java.util.Calendar requestTimestamp,
           PickupScheduleOption[] options,
           CloseTimeType closeTimeType,
           org.apache.axis.types.Time closeTime,
           org.apache.axis.types.Time localTime) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.requestTimestamp = requestTimestamp;
           this.options = options;
           this.closeTimeType = closeTimeType;
           this.closeTime = closeTime;
           this.localTime = localTime;
    }


    /**
     * Gets the highestSeverity value for this PickupAvailabilityReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.pickup.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this PickupAvailabilityReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.pickup.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this PickupAvailabilityReply.
     * 
     * @return notifications
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this PickupAvailabilityReply.
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


    /**
     * Gets the transactionDetail value for this PickupAvailabilityReply.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this PickupAvailabilityReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this PickupAvailabilityReply.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PickupAvailabilityReply.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the requestTimestamp value for this PickupAvailabilityReply.
     * 
     * @return requestTimestamp
     */
    public java.util.Calendar getRequestTimestamp() {
        return requestTimestamp;
    }


    /**
     * Sets the requestTimestamp value for this PickupAvailabilityReply.
     * 
     * @param requestTimestamp
     */
    public void setRequestTimestamp(java.util.Calendar requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }


    /**
     * Gets the options value for this PickupAvailabilityReply.
     * 
     * @return options
     */
    public PickupScheduleOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this PickupAvailabilityReply.
     * 
     * @param options
     */
    public void setOptions(PickupScheduleOption[] options) {
        this.options = options;
    }

    public PickupScheduleOption getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, PickupScheduleOption _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the closeTimeType value for this PickupAvailabilityReply.
     * 
     * @return closeTimeType   * Identifies whether the close time is specified by the customer
     * or is the default time.
     */
    public CloseTimeType getCloseTimeType() {
        return closeTimeType;
    }


    /**
     * Sets the closeTimeType value for this PickupAvailabilityReply.
     * 
     * @param closeTimeType   * Identifies whether the close time is specified by the customer
     * or is the default time.
     */
    public void setCloseTimeType(CloseTimeType closeTimeType) {
        this.closeTimeType = closeTimeType;
    }


    /**
     * Gets the closeTime value for this PickupAvailabilityReply.
     * 
     * @return closeTime   * Close time corresponding to the above specified type
     */
    public org.apache.axis.types.Time getCloseTime() {
        return closeTime;
    }


    /**
     * Sets the closeTime value for this PickupAvailabilityReply.
     * 
     * @param closeTime   * Close time corresponding to the above specified type
     */
    public void setCloseTime(org.apache.axis.types.Time closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * Gets the localTime value for this PickupAvailabilityReply.
     * 
     * @return localTime   * Local time of the service center that will service the pickup
     */
    public org.apache.axis.types.Time getLocalTime() {
        return localTime;
    }


    /**
     * Sets the localTime value for this PickupAvailabilityReply.
     * 
     * @param localTime   * Local time of the service center that will service the pickup
     */
    public void setLocalTime(org.apache.axis.types.Time localTime) {
        this.localTime = localTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupAvailabilityReply)) return false;
        PickupAvailabilityReply other = (PickupAvailabilityReply) obj;
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
            ((this.requestTimestamp==null && other.getRequestTimestamp()==null) || 
             (this.requestTimestamp!=null &&
              this.requestTimestamp.equals(other.getRequestTimestamp()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.closeTimeType==null && other.getCloseTimeType()==null) || 
             (this.closeTimeType!=null &&
              this.closeTimeType.equals(other.getCloseTimeType()))) &&
            ((this.closeTime==null && other.getCloseTime()==null) || 
             (this.closeTime!=null &&
              this.closeTime.equals(other.getCloseTime()))) &&
            ((this.localTime==null && other.getLocalTime()==null) || 
             (this.localTime!=null &&
              this.localTime.equals(other.getLocalTime())));
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
        if (getRequestTimestamp() != null) {
            _hashCode += getRequestTimestamp().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseTimeType() != null) {
            _hashCode += getCloseTimeType().hashCode();
        }
        if (getCloseTime() != null) {
            _hashCode += getCloseTime().hashCode();
        }
        if (getLocalTime() != null) {
            _hashCode += getLocalTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupAvailabilityReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupAvailabilityReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RequestTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupScheduleOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CloseTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CloseTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CloseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LocalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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

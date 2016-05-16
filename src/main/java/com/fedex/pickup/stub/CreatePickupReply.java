/**
 * CreatePickupReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class CreatePickupReply  implements java.io.Serializable {
    private com.fedex.pickup.stub.NotificationSeverityType highestSeverity;

    private Notification[] notifications;

    private com.fedex.pickup.stub.TransactionDetail transactionDetail;

    private VersionId version;

    private String pickupConfirmationNumber;

    private String location;

    /* Coded value supplied by dispatch system. */
    private String messageCode;

    /* Message supplied by dispatch system. */
    private String message;

    /* Package Return Program control number */
    private String PRPControlNumber;

    /* Used with "stay late" requests; postal-code specific. */
    private org.apache.axis.types.Time lastAccessTime;

    private com.fedex.pickup.stub.CompletedFreightPickupDetail completedFreightPickupDetail;

    public CreatePickupReply() {
    }

    public CreatePickupReply(
           com.fedex.pickup.stub.NotificationSeverityType highestSeverity,
           Notification[] notifications,
           com.fedex.pickup.stub.TransactionDetail transactionDetail,
           VersionId version,
           String pickupConfirmationNumber,
           String location,
           String messageCode,
           String message,
           String PRPControlNumber,
           org.apache.axis.types.Time lastAccessTime,
           com.fedex.pickup.stub.CompletedFreightPickupDetail completedFreightPickupDetail) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.pickupConfirmationNumber = pickupConfirmationNumber;
           this.location = location;
           this.messageCode = messageCode;
           this.message = message;
           this.PRPControlNumber = PRPControlNumber;
           this.lastAccessTime = lastAccessTime;
           this.completedFreightPickupDetail = completedFreightPickupDetail;
    }


    /**
     * Gets the highestSeverity value for this CreatePickupReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.pickup.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this CreatePickupReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.pickup.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this CreatePickupReply.
     * 
     * @return notifications
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this CreatePickupReply.
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
     * Gets the transactionDetail value for this CreatePickupReply.
     * 
     * @return transactionDetail
     */
    public com.fedex.pickup.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this CreatePickupReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.pickup.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this CreatePickupReply.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreatePickupReply.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the pickupConfirmationNumber value for this CreatePickupReply.
     * 
     * @return pickupConfirmationNumber
     */
    public String getPickupConfirmationNumber() {
        return pickupConfirmationNumber;
    }


    /**
     * Sets the pickupConfirmationNumber value for this CreatePickupReply.
     * 
     * @param pickupConfirmationNumber
     */
    public void setPickupConfirmationNumber(String pickupConfirmationNumber) {
        this.pickupConfirmationNumber = pickupConfirmationNumber;
    }


    /**
     * Gets the location value for this CreatePickupReply.
     * 
     * @return location
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CreatePickupReply.
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Gets the messageCode value for this CreatePickupReply.
     * 
     * @return messageCode   * Coded value supplied by dispatch system.
     */
    public String getMessageCode() {
        return messageCode;
    }


    /**
     * Sets the messageCode value for this CreatePickupReply.
     * 
     * @param messageCode   * Coded value supplied by dispatch system.
     */
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }


    /**
     * Gets the message value for this CreatePickupReply.
     * 
     * @return message   * Message supplied by dispatch system.
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CreatePickupReply.
     * 
     * @param message   * Message supplied by dispatch system.
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * Gets the PRPControlNumber value for this CreatePickupReply.
     * 
     * @return PRPControlNumber   * Package Return Program control number
     */
    public String getPRPControlNumber() {
        return PRPControlNumber;
    }


    /**
     * Sets the PRPControlNumber value for this CreatePickupReply.
     * 
     * @param PRPControlNumber   * Package Return Program control number
     */
    public void setPRPControlNumber(String PRPControlNumber) {
        this.PRPControlNumber = PRPControlNumber;
    }


    /**
     * Gets the lastAccessTime value for this CreatePickupReply.
     * 
     * @return lastAccessTime   * Used with "stay late" requests; postal-code specific.
     */
    public org.apache.axis.types.Time getLastAccessTime() {
        return lastAccessTime;
    }


    /**
     * Sets the lastAccessTime value for this CreatePickupReply.
     * 
     * @param lastAccessTime   * Used with "stay late" requests; postal-code specific.
     */
    public void setLastAccessTime(org.apache.axis.types.Time lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }


    /**
     * Gets the completedFreightPickupDetail value for this CreatePickupReply.
     * 
     * @return completedFreightPickupDetail
     */
    public com.fedex.pickup.stub.CompletedFreightPickupDetail getCompletedFreightPickupDetail() {
        return completedFreightPickupDetail;
    }


    /**
     * Sets the completedFreightPickupDetail value for this CreatePickupReply.
     * 
     * @param completedFreightPickupDetail
     */
    public void setCompletedFreightPickupDetail(com.fedex.pickup.stub.CompletedFreightPickupDetail completedFreightPickupDetail) {
        this.completedFreightPickupDetail = completedFreightPickupDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreatePickupReply)) return false;
        CreatePickupReply other = (CreatePickupReply) obj;
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
            ((this.pickupConfirmationNumber==null && other.getPickupConfirmationNumber()==null) || 
             (this.pickupConfirmationNumber!=null &&
              this.pickupConfirmationNumber.equals(other.getPickupConfirmationNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.messageCode==null && other.getMessageCode()==null) || 
             (this.messageCode!=null &&
              this.messageCode.equals(other.getMessageCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.PRPControlNumber==null && other.getPRPControlNumber()==null) || 
             (this.PRPControlNumber!=null &&
              this.PRPControlNumber.equals(other.getPRPControlNumber()))) &&
            ((this.lastAccessTime==null && other.getLastAccessTime()==null) || 
             (this.lastAccessTime!=null &&
              this.lastAccessTime.equals(other.getLastAccessTime()))) &&
            ((this.completedFreightPickupDetail==null && other.getCompletedFreightPickupDetail()==null) || 
             (this.completedFreightPickupDetail!=null &&
              this.completedFreightPickupDetail.equals(other.getCompletedFreightPickupDetail())));
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
        if (getPickupConfirmationNumber() != null) {
            _hashCode += getPickupConfirmationNumber().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMessageCode() != null) {
            _hashCode += getMessageCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPRPControlNumber() != null) {
            _hashCode += getPRPControlNumber().hashCode();
        }
        if (getLastAccessTime() != null) {
            _hashCode += getLastAccessTime().hashCode();
        }
        if (getCompletedFreightPickupDetail() != null) {
            _hashCode += getCompletedFreightPickupDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePickupReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CreatePickupReply"));
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
        elemField.setFieldName("pickupConfirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "MessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRPControlNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PRPControlNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAccessTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LastAccessTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedFreightPickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompletedFreightPickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompletedFreightPickupDetail"));
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

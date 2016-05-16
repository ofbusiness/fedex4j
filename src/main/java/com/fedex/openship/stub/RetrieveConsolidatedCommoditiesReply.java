/**
 * RetrieveConsolidatedCommoditiesReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RetrieveConsolidatedCommoditiesReply  implements java.io.Serializable {
    private NotificationSeverityType highestSeverity;

    private Notification[] notifications;

    private TransactionDetail transactionDetail;

    private VersionId version;

    /* Provides data about the consolidated commodities including
     * the total customs value. */
    private ConsolidatedCommoditiesSummaryDetail consolidatedCommoditiesSummary;

    public RetrieveConsolidatedCommoditiesReply() {
    }

    public RetrieveConsolidatedCommoditiesReply(
           NotificationSeverityType highestSeverity,
           Notification[] notifications,
           TransactionDetail transactionDetail,
           VersionId version,
           ConsolidatedCommoditiesSummaryDetail consolidatedCommoditiesSummary) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.consolidatedCommoditiesSummary = consolidatedCommoditiesSummary;
    }


    /**
     * Gets the highestSeverity value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @return highestSeverity
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @return notifications
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this RetrieveConsolidatedCommoditiesReply.
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
     * Gets the transactionDetail value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the consolidatedCommoditiesSummary value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @return consolidatedCommoditiesSummary   * Provides data about the consolidated commodities including
     * the total customs value.
     */
    public ConsolidatedCommoditiesSummaryDetail getConsolidatedCommoditiesSummary() {
        return consolidatedCommoditiesSummary;
    }


    /**
     * Sets the consolidatedCommoditiesSummary value for this RetrieveConsolidatedCommoditiesReply.
     * 
     * @param consolidatedCommoditiesSummary   * Provides data about the consolidated commodities including
     * the total customs value.
     */
    public void setConsolidatedCommoditiesSummary(ConsolidatedCommoditiesSummaryDetail consolidatedCommoditiesSummary) {
        this.consolidatedCommoditiesSummary = consolidatedCommoditiesSummary;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RetrieveConsolidatedCommoditiesReply)) return false;
        RetrieveConsolidatedCommoditiesReply other = (RetrieveConsolidatedCommoditiesReply) obj;
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
            ((this.consolidatedCommoditiesSummary==null && other.getConsolidatedCommoditiesSummary()==null) || 
             (this.consolidatedCommoditiesSummary!=null &&
              this.consolidatedCommoditiesSummary.equals(other.getConsolidatedCommoditiesSummary())));
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
        if (getConsolidatedCommoditiesSummary() != null) {
            _hashCode += getConsolidatedCommoditiesSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveConsolidatedCommoditiesReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedCommoditiesSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommoditiesSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommoditiesSummaryDetail"));
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

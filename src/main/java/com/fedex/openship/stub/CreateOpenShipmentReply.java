/**
 * CreateOpenShipmentReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CreateOpenShipmentReply  implements java.io.Serializable {
    private com.fedex.openship.stub.NotificationSeverityType highestSeverity;

    private Notification[] notifications;

    private TransactionDetail transactionDetail;

    private VersionId version;

    private String jobId;

    /* This indicates whether the transaction was processed synchronously
     * or asynchronously. */
    private com.fedex.openship.stub.AsynchronousProcessingResultsDetail asynchronousProcessingResults;

    private ServiceType serviceType;

    private CompletedShipmentDetail completedShipmentDetail;

    /* Empty unless error label behavior is PACKAGE_ERROR_LABELS and
     * one or more errors occured during transaction processing. */
    private ShippingDocument[] errorLabels;

    /* Allows for assignment of index by creation processing. */
    private String index;

    public CreateOpenShipmentReply() {
    }

    public CreateOpenShipmentReply(
           com.fedex.openship.stub.NotificationSeverityType highestSeverity,
           Notification[] notifications,
           TransactionDetail transactionDetail,
           VersionId version,
           String jobId,
           com.fedex.openship.stub.AsynchronousProcessingResultsDetail asynchronousProcessingResults,
           ServiceType serviceType,
           CompletedShipmentDetail completedShipmentDetail,
           ShippingDocument[] errorLabels,
           String index) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.jobId = jobId;
           this.asynchronousProcessingResults = asynchronousProcessingResults;
           this.serviceType = serviceType;
           this.completedShipmentDetail = completedShipmentDetail;
           this.errorLabels = errorLabels;
           this.index = index;
    }


    /**
     * Gets the highestSeverity value for this CreateOpenShipmentReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.openship.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this CreateOpenShipmentReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.openship.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this CreateOpenShipmentReply.
     * 
     * @return notifications
     */
    public Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this CreateOpenShipmentReply.
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
     * Gets the transactionDetail value for this CreateOpenShipmentReply.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this CreateOpenShipmentReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this CreateOpenShipmentReply.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreateOpenShipmentReply.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the jobId value for this CreateOpenShipmentReply.
     * 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this CreateOpenShipmentReply.
     * 
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the asynchronousProcessingResults value for this CreateOpenShipmentReply.
     * 
     * @return asynchronousProcessingResults   * This indicates whether the transaction was processed synchronously
     * or asynchronously.
     */
    public com.fedex.openship.stub.AsynchronousProcessingResultsDetail getAsynchronousProcessingResults() {
        return asynchronousProcessingResults;
    }


    /**
     * Sets the asynchronousProcessingResults value for this CreateOpenShipmentReply.
     * 
     * @param asynchronousProcessingResults   * This indicates whether the transaction was processed synchronously
     * or asynchronously.
     */
    public void setAsynchronousProcessingResults(com.fedex.openship.stub.AsynchronousProcessingResultsDetail asynchronousProcessingResults) {
        this.asynchronousProcessingResults = asynchronousProcessingResults;
    }


    /**
     * Gets the serviceType value for this CreateOpenShipmentReply.
     * 
     * @return serviceType
     */
    public ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this CreateOpenShipmentReply.
     * 
     * @param serviceType
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the completedShipmentDetail value for this CreateOpenShipmentReply.
     * 
     * @return completedShipmentDetail
     */
    public CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }


    /**
     * Sets the completedShipmentDetail value for this CreateOpenShipmentReply.
     * 
     * @param completedShipmentDetail
     */
    public void setCompletedShipmentDetail(CompletedShipmentDetail completedShipmentDetail) {
        this.completedShipmentDetail = completedShipmentDetail;
    }


    /**
     * Gets the errorLabels value for this CreateOpenShipmentReply.
     * 
     * @return errorLabels   * Empty unless error label behavior is PACKAGE_ERROR_LABELS and
     * one or more errors occured during transaction processing.
     */
    public ShippingDocument[] getErrorLabels() {
        return errorLabels;
    }


    /**
     * Sets the errorLabels value for this CreateOpenShipmentReply.
     * 
     * @param errorLabels   * Empty unless error label behavior is PACKAGE_ERROR_LABELS and
     * one or more errors occured during transaction processing.
     */
    public void setErrorLabels(ShippingDocument[] errorLabels) {
        this.errorLabels = errorLabels;
    }

    public ShippingDocument getErrorLabels(int i) {
        return this.errorLabels[i];
    }

    public void setErrorLabels(int i, ShippingDocument _value) {
        this.errorLabels[i] = _value;
    }


    /**
     * Gets the index value for this CreateOpenShipmentReply.
     * 
     * @return index   * Allows for assignment of index by creation processing.
     */
    public String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this CreateOpenShipmentReply.
     * 
     * @param index   * Allows for assignment of index by creation processing.
     */
    public void setIndex(String index) {
        this.index = index;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateOpenShipmentReply)) return false;
        CreateOpenShipmentReply other = (CreateOpenShipmentReply) obj;
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
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.asynchronousProcessingResults==null && other.getAsynchronousProcessingResults()==null) || 
             (this.asynchronousProcessingResults!=null &&
              this.asynchronousProcessingResults.equals(other.getAsynchronousProcessingResults()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.completedShipmentDetail==null && other.getCompletedShipmentDetail()==null) || 
             (this.completedShipmentDetail!=null &&
              this.completedShipmentDetail.equals(other.getCompletedShipmentDetail()))) &&
            ((this.errorLabels==null && other.getErrorLabels()==null) || 
             (this.errorLabels!=null &&
              java.util.Arrays.equals(this.errorLabels, other.getErrorLabels()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getAsynchronousProcessingResults() != null) {
            _hashCode += getAsynchronousProcessingResults().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getCompletedShipmentDetail() != null) {
            _hashCode += getCompletedShipmentDetail().hashCode();
        }
        if (getErrorLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getErrorLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOpenShipmentReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentReply"));
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
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "JobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asynchronousProcessingResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingResultsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ErrorLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Index"));
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

/**
 * CancelPickupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class CancelPickupRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    private CarrierCodeType carrierCode;

    private String pickupConfirmationNumber;

    /* The local date which the pickup was originally scheduled to
     * be picked up on. The date provided is the local to the client of the
     * request. The date specification does not include any time zone designators. */
    private java.util.Date scheduledDate;

    private java.util.Date endDate;

    private String location;

    private String remarks;

    private Payment shippingChargesPayment;

    /* The reason for canceling the pickup request. */
    private String reason;

    /* Identifies the name of the person that requested pickup cancellation. */
    private String contactName;

    /* Identifies the phone number of the person that requested pickup
     * cancellation. */
    private String phoneNumber;

    /* Identifies the phone extension of the person that requested
     * pickup cancellation. */
    private String phoneExtension;

    public CancelPickupRequest() {
    }

    public CancelPickupRequest(
           com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           CarrierCodeType carrierCode,
           String pickupConfirmationNumber,
           java.util.Date scheduledDate,
           java.util.Date endDate,
           String location,
           String remarks,
           Payment shippingChargesPayment,
           String reason,
           String contactName,
           String phoneNumber,
           String phoneExtension) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.carrierCode = carrierCode;
           this.pickupConfirmationNumber = pickupConfirmationNumber;
           this.scheduledDate = scheduledDate;
           this.endDate = endDate;
           this.location = location;
           this.remarks = remarks;
           this.shippingChargesPayment = shippingChargesPayment;
           this.reason = reason;
           this.contactName = contactName;
           this.phoneNumber = phoneNumber;
           this.phoneExtension = phoneExtension;
    }


    /**
     * Gets the webAuthenticationDetail value for this CancelPickupRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.pickup.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this CancelPickupRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this CancelPickupRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this CancelPickupRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this CancelPickupRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this CancelPickupRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this CancelPickupRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CancelPickupRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the carrierCode value for this CancelPickupRequest.
     * 
     * @return carrierCode
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this CancelPickupRequest.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the pickupConfirmationNumber value for this CancelPickupRequest.
     * 
     * @return pickupConfirmationNumber
     */
    public String getPickupConfirmationNumber() {
        return pickupConfirmationNumber;
    }


    /**
     * Sets the pickupConfirmationNumber value for this CancelPickupRequest.
     * 
     * @param pickupConfirmationNumber
     */
    public void setPickupConfirmationNumber(String pickupConfirmationNumber) {
        this.pickupConfirmationNumber = pickupConfirmationNumber;
    }


    /**
     * Gets the scheduledDate value for this CancelPickupRequest.
     * 
     * @return scheduledDate   * The local date which the pickup was originally scheduled to
     * be picked up on. The date provided is the local to the client of the
     * request. The date specification does not include any time zone designators.
     */
    public java.util.Date getScheduledDate() {
        return scheduledDate;
    }


    /**
     * Sets the scheduledDate value for this CancelPickupRequest.
     * 
     * @param scheduledDate   * The local date which the pickup was originally scheduled to
     * be picked up on. The date provided is the local to the client of the
     * request. The date specification does not include any time zone designators.
     */
    public void setScheduledDate(java.util.Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }


    /**
     * Gets the endDate value for this CancelPickupRequest.
     * 
     * @return endDate
     */
    public java.util.Date getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CancelPickupRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the location value for this CancelPickupRequest.
     * 
     * @return location
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CancelPickupRequest.
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Gets the remarks value for this CancelPickupRequest.
     * 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this CancelPickupRequest.
     * 
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the shippingChargesPayment value for this CancelPickupRequest.
     * 
     * @return shippingChargesPayment
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this CancelPickupRequest.
     * 
     * @param shippingChargesPayment
     */
    public void setShippingChargesPayment(Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the reason value for this CancelPickupRequest.
     * 
     * @return reason   * The reason for canceling the pickup request.
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this CancelPickupRequest.
     * 
     * @param reason   * The reason for canceling the pickup request.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the contactName value for this CancelPickupRequest.
     * 
     * @return contactName   * Identifies the name of the person that requested pickup cancellation.
     */
    public String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this CancelPickupRequest.
     * 
     * @param contactName   * Identifies the name of the person that requested pickup cancellation.
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the phoneNumber value for this CancelPickupRequest.
     * 
     * @return phoneNumber   * Identifies the phone number of the person that requested pickup
     * cancellation.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CancelPickupRequest.
     * 
     * @param phoneNumber   * Identifies the phone number of the person that requested pickup
     * cancellation.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the phoneExtension value for this CancelPickupRequest.
     * 
     * @return phoneExtension   * Identifies the phone extension of the person that requested
     * pickup cancellation.
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }


    /**
     * Sets the phoneExtension value for this CancelPickupRequest.
     * 
     * @param phoneExtension   * Identifies the phone extension of the person that requested
     * pickup cancellation.
     */
    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CancelPickupRequest)) return false;
        CancelPickupRequest other = (CancelPickupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.pickupConfirmationNumber==null && other.getPickupConfirmationNumber()==null) || 
             (this.pickupConfirmationNumber!=null &&
              this.pickupConfirmationNumber.equals(other.getPickupConfirmationNumber()))) &&
            ((this.scheduledDate==null && other.getScheduledDate()==null) || 
             (this.scheduledDate!=null &&
              this.scheduledDate.equals(other.getScheduledDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.phoneExtension==null && other.getPhoneExtension()==null) || 
             (this.phoneExtension!=null &&
              this.phoneExtension.equals(other.getPhoneExtension())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getPickupConfirmationNumber() != null) {
            _hashCode += getPickupConfirmationNumber().hashCode();
        }
        if (getScheduledDate() != null) {
            _hashCode += getScheduledDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPhoneExtension() != null) {
            _hashCode += getPhoneExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelPickupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CancelPickupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ClientDetail"));
        elemField.setNillable(false);
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
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CarrierCodeType"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ScheduledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PhoneExtension"));
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

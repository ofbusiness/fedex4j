/**
 * PickupAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupAvailabilityRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    private PickupType pickupType;

    /* Identifies the account number for Freight Pickup Availability */
    private AssociatedAccount accountNumber;

    private Address pickupAddress;

    private PickupRequestType[] pickupRequestType;

    private java.util.Date dispatchDate;

    /* Number of business days to consider when checking availability. */
    private org.apache.axis.types.PositiveInteger numberOfBusinessDays;

    private org.apache.axis.types.Time packageReadyTime;

    private org.apache.axis.types.Time customerCloseTime;

    private CarrierCodeType[] carriers;

    private PickupShipmentAttributes shipmentAttributes;

    public PickupAvailabilityRequest() {
    }

    public PickupAvailabilityRequest(
           WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           PickupType pickupType,
           AssociatedAccount accountNumber,
           Address pickupAddress,
           PickupRequestType[] pickupRequestType,
           java.util.Date dispatchDate,
           org.apache.axis.types.PositiveInteger numberOfBusinessDays,
           org.apache.axis.types.Time packageReadyTime,
           org.apache.axis.types.Time customerCloseTime,
           CarrierCodeType[] carriers,
           PickupShipmentAttributes shipmentAttributes) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.pickupType = pickupType;
           this.accountNumber = accountNumber;
           this.pickupAddress = pickupAddress;
           this.pickupRequestType = pickupRequestType;
           this.dispatchDate = dispatchDate;
           this.numberOfBusinessDays = numberOfBusinessDays;
           this.packageReadyTime = packageReadyTime;
           this.customerCloseTime = customerCloseTime;
           this.carriers = carriers;
           this.shipmentAttributes = shipmentAttributes;
    }


    /**
     * Gets the webAuthenticationDetail value for this PickupAvailabilityRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this PickupAvailabilityRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this PickupAvailabilityRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this PickupAvailabilityRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this PickupAvailabilityRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this PickupAvailabilityRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this PickupAvailabilityRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this PickupAvailabilityRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the pickupType value for this PickupAvailabilityRequest.
     * 
     * @return pickupType
     */
    public PickupType getPickupType() {
        return pickupType;
    }


    /**
     * Sets the pickupType value for this PickupAvailabilityRequest.
     * 
     * @param pickupType
     */
    public void setPickupType(PickupType pickupType) {
        this.pickupType = pickupType;
    }


    /**
     * Gets the accountNumber value for this PickupAvailabilityRequest.
     * 
     * @return accountNumber   * Identifies the account number for Freight Pickup Availability
     */
    public AssociatedAccount getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this PickupAvailabilityRequest.
     * 
     * @param accountNumber   * Identifies the account number for Freight Pickup Availability
     */
    public void setAccountNumber(AssociatedAccount accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the pickupAddress value for this PickupAvailabilityRequest.
     * 
     * @return pickupAddress
     */
    public Address getPickupAddress() {
        return pickupAddress;
    }


    /**
     * Sets the pickupAddress value for this PickupAvailabilityRequest.
     * 
     * @param pickupAddress
     */
    public void setPickupAddress(Address pickupAddress) {
        this.pickupAddress = pickupAddress;
    }


    /**
     * Gets the pickupRequestType value for this PickupAvailabilityRequest.
     * 
     * @return pickupRequestType
     */
    public PickupRequestType[] getPickupRequestType() {
        return pickupRequestType;
    }


    /**
     * Sets the pickupRequestType value for this PickupAvailabilityRequest.
     * 
     * @param pickupRequestType
     */
    public void setPickupRequestType(PickupRequestType[] pickupRequestType) {
        this.pickupRequestType = pickupRequestType;
    }

    public PickupRequestType getPickupRequestType(int i) {
        return this.pickupRequestType[i];
    }

    public void setPickupRequestType(int i, PickupRequestType _value) {
        this.pickupRequestType[i] = _value;
    }


    /**
     * Gets the dispatchDate value for this PickupAvailabilityRequest.
     * 
     * @return dispatchDate
     */
    public java.util.Date getDispatchDate() {
        return dispatchDate;
    }


    /**
     * Sets the dispatchDate value for this PickupAvailabilityRequest.
     * 
     * @param dispatchDate
     */
    public void setDispatchDate(java.util.Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }


    /**
     * Gets the numberOfBusinessDays value for this PickupAvailabilityRequest.
     * 
     * @return numberOfBusinessDays   * Number of business days to consider when checking availability.
     */
    public org.apache.axis.types.PositiveInteger getNumberOfBusinessDays() {
        return numberOfBusinessDays;
    }


    /**
     * Sets the numberOfBusinessDays value for this PickupAvailabilityRequest.
     * 
     * @param numberOfBusinessDays   * Number of business days to consider when checking availability.
     */
    public void setNumberOfBusinessDays(org.apache.axis.types.PositiveInteger numberOfBusinessDays) {
        this.numberOfBusinessDays = numberOfBusinessDays;
    }


    /**
     * Gets the packageReadyTime value for this PickupAvailabilityRequest.
     * 
     * @return packageReadyTime
     */
    public org.apache.axis.types.Time getPackageReadyTime() {
        return packageReadyTime;
    }


    /**
     * Sets the packageReadyTime value for this PickupAvailabilityRequest.
     * 
     * @param packageReadyTime
     */
    public void setPackageReadyTime(org.apache.axis.types.Time packageReadyTime) {
        this.packageReadyTime = packageReadyTime;
    }


    /**
     * Gets the customerCloseTime value for this PickupAvailabilityRequest.
     * 
     * @return customerCloseTime
     */
    public org.apache.axis.types.Time getCustomerCloseTime() {
        return customerCloseTime;
    }


    /**
     * Sets the customerCloseTime value for this PickupAvailabilityRequest.
     * 
     * @param customerCloseTime
     */
    public void setCustomerCloseTime(org.apache.axis.types.Time customerCloseTime) {
        this.customerCloseTime = customerCloseTime;
    }


    /**
     * Gets the carriers value for this PickupAvailabilityRequest.
     * 
     * @return carriers
     */
    public CarrierCodeType[] getCarriers() {
        return carriers;
    }


    /**
     * Sets the carriers value for this PickupAvailabilityRequest.
     * 
     * @param carriers
     */
    public void setCarriers(CarrierCodeType[] carriers) {
        this.carriers = carriers;
    }

    public CarrierCodeType getCarriers(int i) {
        return this.carriers[i];
    }

    public void setCarriers(int i, CarrierCodeType _value) {
        this.carriers[i] = _value;
    }


    /**
     * Gets the shipmentAttributes value for this PickupAvailabilityRequest.
     * 
     * @return shipmentAttributes
     */
    public PickupShipmentAttributes getShipmentAttributes() {
        return shipmentAttributes;
    }


    /**
     * Sets the shipmentAttributes value for this PickupAvailabilityRequest.
     * 
     * @param shipmentAttributes
     */
    public void setShipmentAttributes(PickupShipmentAttributes shipmentAttributes) {
        this.shipmentAttributes = shipmentAttributes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupAvailabilityRequest)) return false;
        PickupAvailabilityRequest other = (PickupAvailabilityRequest) obj;
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
            ((this.pickupType==null && other.getPickupType()==null) || 
             (this.pickupType!=null &&
              this.pickupType.equals(other.getPickupType()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.pickupAddress==null && other.getPickupAddress()==null) || 
             (this.pickupAddress!=null &&
              this.pickupAddress.equals(other.getPickupAddress()))) &&
            ((this.pickupRequestType==null && other.getPickupRequestType()==null) || 
             (this.pickupRequestType!=null &&
              java.util.Arrays.equals(this.pickupRequestType, other.getPickupRequestType()))) &&
            ((this.dispatchDate==null && other.getDispatchDate()==null) || 
             (this.dispatchDate!=null &&
              this.dispatchDate.equals(other.getDispatchDate()))) &&
            ((this.numberOfBusinessDays==null && other.getNumberOfBusinessDays()==null) || 
             (this.numberOfBusinessDays!=null &&
              this.numberOfBusinessDays.equals(other.getNumberOfBusinessDays()))) &&
            ((this.packageReadyTime==null && other.getPackageReadyTime()==null) || 
             (this.packageReadyTime!=null &&
              this.packageReadyTime.equals(other.getPackageReadyTime()))) &&
            ((this.customerCloseTime==null && other.getCustomerCloseTime()==null) || 
             (this.customerCloseTime!=null &&
              this.customerCloseTime.equals(other.getCustomerCloseTime()))) &&
            ((this.carriers==null && other.getCarriers()==null) || 
             (this.carriers!=null &&
              java.util.Arrays.equals(this.carriers, other.getCarriers()))) &&
            ((this.shipmentAttributes==null && other.getShipmentAttributes()==null) || 
             (this.shipmentAttributes!=null &&
              this.shipmentAttributes.equals(other.getShipmentAttributes())));
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
        if (getPickupType() != null) {
            _hashCode += getPickupType().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getPickupAddress() != null) {
            _hashCode += getPickupAddress().hashCode();
        }
        if (getPickupRequestType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickupRequestType());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPickupRequestType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDispatchDate() != null) {
            _hashCode += getDispatchDate().hashCode();
        }
        if (getNumberOfBusinessDays() != null) {
            _hashCode += getNumberOfBusinessDays().hashCode();
        }
        if (getPackageReadyTime() != null) {
            _hashCode += getPackageReadyTime().hashCode();
        }
        if (getCustomerCloseTime() != null) {
            _hashCode += getCustomerCloseTime().hashCode();
        }
        if (getCarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarriers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCarriers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentAttributes() != null) {
            _hashCode += getShipmentAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupAvailabilityRequest"));
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
        elemField.setFieldName("pickupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AssociatedAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DispatchDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfBusinessDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "NumberOfBusinessDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageReadyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PackageReadyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCloseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CustomerCloseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Carriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupShipmentAttributes"));
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

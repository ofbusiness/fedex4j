/**
 * CreatePickupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class CreatePickupRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    private AssociatedAccount associatedAccountNumber;

    /* Specifies the tracking number to be used for processing a pickup
     * for a return shipment. */
    private String trackingNumber;

    private PickupOriginDetail originDetail;

    private com.fedex.pickup.stub.PickupServiceCategoryType pickupServiceCategory;

    private com.fedex.pickup.stub.FreightPickupDetail freightPickupDetail;

    private com.fedex.pickup.stub.ExpressFreightPickupDetail expressFreightDetail;

    private org.apache.axis.types.PositiveInteger packageCount;

    private Weight totalWeight;

    private CarrierCodeType carrierCode;

    private org.apache.axis.types.NonNegativeInteger oversizePackageCount;

    /* This field is being deprecated and will not be removed in the
     * June 2014 load. */
    private String remarks;

    private String commodityDescription;

    /* Describes the country relationship (domestic and/or international)
     * among the shipments being picked up. */
    private com.fedex.pickup.stub.CountryRelationshipType countryRelationship;

    public CreatePickupRequest() {
    }

    public CreatePickupRequest(
           com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           AssociatedAccount associatedAccountNumber,
           String trackingNumber,
           PickupOriginDetail originDetail,
           com.fedex.pickup.stub.PickupServiceCategoryType pickupServiceCategory,
           com.fedex.pickup.stub.FreightPickupDetail freightPickupDetail,
           com.fedex.pickup.stub.ExpressFreightPickupDetail expressFreightDetail,
           org.apache.axis.types.PositiveInteger packageCount,
           Weight totalWeight,
           CarrierCodeType carrierCode,
           org.apache.axis.types.NonNegativeInteger oversizePackageCount,
           String remarks,
           String commodityDescription,
           com.fedex.pickup.stub.CountryRelationshipType countryRelationship) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.associatedAccountNumber = associatedAccountNumber;
           this.trackingNumber = trackingNumber;
           this.originDetail = originDetail;
           this.pickupServiceCategory = pickupServiceCategory;
           this.freightPickupDetail = freightPickupDetail;
           this.expressFreightDetail = expressFreightDetail;
           this.packageCount = packageCount;
           this.totalWeight = totalWeight;
           this.carrierCode = carrierCode;
           this.oversizePackageCount = oversizePackageCount;
           this.remarks = remarks;
           this.commodityDescription = commodityDescription;
           this.countryRelationship = countryRelationship;
    }


    /**
     * Gets the webAuthenticationDetail value for this CreatePickupRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.pickup.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this CreatePickupRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.pickup.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this CreatePickupRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this CreatePickupRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this CreatePickupRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this CreatePickupRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this CreatePickupRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreatePickupRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the associatedAccountNumber value for this CreatePickupRequest.
     * 
     * @return associatedAccountNumber
     */
    public AssociatedAccount getAssociatedAccountNumber() {
        return associatedAccountNumber;
    }


    /**
     * Sets the associatedAccountNumber value for this CreatePickupRequest.
     * 
     * @param associatedAccountNumber
     */
    public void setAssociatedAccountNumber(AssociatedAccount associatedAccountNumber) {
        this.associatedAccountNumber = associatedAccountNumber;
    }


    /**
     * Gets the trackingNumber value for this CreatePickupRequest.
     * 
     * @return trackingNumber   * Specifies the tracking number to be used for processing a pickup
     * for a return shipment.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this CreatePickupRequest.
     * 
     * @param trackingNumber   * Specifies the tracking number to be used for processing a pickup
     * for a return shipment.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the originDetail value for this CreatePickupRequest.
     * 
     * @return originDetail
     */
    public PickupOriginDetail getOriginDetail() {
        return originDetail;
    }


    /**
     * Sets the originDetail value for this CreatePickupRequest.
     * 
     * @param originDetail
     */
    public void setOriginDetail(PickupOriginDetail originDetail) {
        this.originDetail = originDetail;
    }


    /**
     * Gets the pickupServiceCategory value for this CreatePickupRequest.
     * 
     * @return pickupServiceCategory
     */
    public com.fedex.pickup.stub.PickupServiceCategoryType getPickupServiceCategory() {
        return pickupServiceCategory;
    }


    /**
     * Sets the pickupServiceCategory value for this CreatePickupRequest.
     * 
     * @param pickupServiceCategory
     */
    public void setPickupServiceCategory(com.fedex.pickup.stub.PickupServiceCategoryType pickupServiceCategory) {
        this.pickupServiceCategory = pickupServiceCategory;
    }


    /**
     * Gets the freightPickupDetail value for this CreatePickupRequest.
     * 
     * @return freightPickupDetail
     */
    public com.fedex.pickup.stub.FreightPickupDetail getFreightPickupDetail() {
        return freightPickupDetail;
    }


    /**
     * Sets the freightPickupDetail value for this CreatePickupRequest.
     * 
     * @param freightPickupDetail
     */
    public void setFreightPickupDetail(com.fedex.pickup.stub.FreightPickupDetail freightPickupDetail) {
        this.freightPickupDetail = freightPickupDetail;
    }


    /**
     * Gets the expressFreightDetail value for this CreatePickupRequest.
     * 
     * @return expressFreightDetail
     */
    public com.fedex.pickup.stub.ExpressFreightPickupDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this CreatePickupRequest.
     * 
     * @param expressFreightDetail
     */
    public void setExpressFreightDetail(com.fedex.pickup.stub.ExpressFreightPickupDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the packageCount value for this CreatePickupRequest.
     * 
     * @return packageCount
     */
    public org.apache.axis.types.PositiveInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this CreatePickupRequest.
     * 
     * @param packageCount
     */
    public void setPackageCount(org.apache.axis.types.PositiveInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the totalWeight value for this CreatePickupRequest.
     * 
     * @return totalWeight
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this CreatePickupRequest.
     * 
     * @param totalWeight
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the carrierCode value for this CreatePickupRequest.
     * 
     * @return carrierCode
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this CreatePickupRequest.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the oversizePackageCount value for this CreatePickupRequest.
     * 
     * @return oversizePackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getOversizePackageCount() {
        return oversizePackageCount;
    }


    /**
     * Sets the oversizePackageCount value for this CreatePickupRequest.
     * 
     * @param oversizePackageCount
     */
    public void setOversizePackageCount(org.apache.axis.types.NonNegativeInteger oversizePackageCount) {
        this.oversizePackageCount = oversizePackageCount;
    }


    /**
     * Gets the remarks value for this CreatePickupRequest.
     * 
     * @return remarks   * This field is being deprecated and will not be removed in the
     * June 2014 load.
     */
    public String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this CreatePickupRequest.
     * 
     * @param remarks   * This field is being deprecated and will not be removed in the
     * June 2014 load.
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the commodityDescription value for this CreatePickupRequest.
     * 
     * @return commodityDescription
     */
    public String getCommodityDescription() {
        return commodityDescription;
    }


    /**
     * Sets the commodityDescription value for this CreatePickupRequest.
     * 
     * @param commodityDescription
     */
    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }


    /**
     * Gets the countryRelationship value for this CreatePickupRequest.
     * 
     * @return countryRelationship   * Describes the country relationship (domestic and/or international)
     * among the shipments being picked up.
     */
    public com.fedex.pickup.stub.CountryRelationshipType getCountryRelationship() {
        return countryRelationship;
    }


    /**
     * Sets the countryRelationship value for this CreatePickupRequest.
     * 
     * @param countryRelationship   * Describes the country relationship (domestic and/or international)
     * among the shipments being picked up.
     */
    public void setCountryRelationship(com.fedex.pickup.stub.CountryRelationshipType countryRelationship) {
        this.countryRelationship = countryRelationship;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreatePickupRequest)) return false;
        CreatePickupRequest other = (CreatePickupRequest) obj;
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
            ((this.associatedAccountNumber==null && other.getAssociatedAccountNumber()==null) || 
             (this.associatedAccountNumber!=null &&
              this.associatedAccountNumber.equals(other.getAssociatedAccountNumber()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.originDetail==null && other.getOriginDetail()==null) || 
             (this.originDetail!=null &&
              this.originDetail.equals(other.getOriginDetail()))) &&
            ((this.pickupServiceCategory==null && other.getPickupServiceCategory()==null) || 
             (this.pickupServiceCategory!=null &&
              this.pickupServiceCategory.equals(other.getPickupServiceCategory()))) &&
            ((this.freightPickupDetail==null && other.getFreightPickupDetail()==null) || 
             (this.freightPickupDetail!=null &&
              this.freightPickupDetail.equals(other.getFreightPickupDetail()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) || 
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.oversizePackageCount==null && other.getOversizePackageCount()==null) || 
             (this.oversizePackageCount!=null &&
              this.oversizePackageCount.equals(other.getOversizePackageCount()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.commodityDescription==null && other.getCommodityDescription()==null) || 
             (this.commodityDescription!=null &&
              this.commodityDescription.equals(other.getCommodityDescription()))) &&
            ((this.countryRelationship==null && other.getCountryRelationship()==null) || 
             (this.countryRelationship!=null &&
              this.countryRelationship.equals(other.getCountryRelationship())));
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
        if (getAssociatedAccountNumber() != null) {
            _hashCode += getAssociatedAccountNumber().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getOriginDetail() != null) {
            _hashCode += getOriginDetail().hashCode();
        }
        if (getPickupServiceCategory() != null) {
            _hashCode += getPickupServiceCategory().hashCode();
        }
        if (getFreightPickupDetail() != null) {
            _hashCode += getFreightPickupDetail().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getOversizePackageCount() != null) {
            _hashCode += getOversizePackageCount().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getCommodityDescription() != null) {
            _hashCode += getCommodityDescription().hashCode();
        }
        if (getCountryRelationship() != null) {
            _hashCode += getCountryRelationship().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePickupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CreatePickupRequest"));
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
        elemField.setFieldName("associatedAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AssociatedAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AssociatedAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "OriginDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupOriginDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupServiceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupServiceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupServiceCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightPickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightPickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightPickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExpressFreightPickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Weight"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("oversizePackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "OversizePackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
        elemField.setFieldName("commodityDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CommodityDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CountryRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CountryRelationshipType"));
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

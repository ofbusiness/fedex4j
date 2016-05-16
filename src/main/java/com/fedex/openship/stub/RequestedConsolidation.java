/**
 * RequestedConsolidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RequestedConsolidation  implements java.io.Serializable {
    private ConsolidationType consolidationType;

    /* Date for the (intended) actual movement of the consolidation. */
    private java.util.Date shipDate;

    /* Master Air Way Bill tracking ID */
    private TrackingId[] trackingIds;

    /* Specifies a human readable description of the consolidation
     * that is provided by the client, in order to easily identify the consolidation. */
    private String description;

    private Party shipper;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private ContactAndAddress origin;

    /* Indicates the party responsible for purchasing the goods shipped
     * from the shipper to the recipient. The sold to party is not necessarily
     * the recipient or the importer of record. The sold to party is relevant
     * when the purchaser, rather than the recipient, determines when certain
     * customs regulations apply. */
    private Party soldTo;

    private String bookingNumber;

    /* Specifies how selected values in the consolidation are to be
     * determined. */
    private com.fedex.openship.stub.ConsolidationDataSource[] consolidationDataSources;

    private com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested;

    /* References applying to the entire consolidation. */
    private CustomerReference[] customerReferences;

    private LabelSpecification labelSpecification;

    private com.fedex.openship.stub.InternationalDistributionDetail internationalDistributionDetail;

    /* Specifies the transborder data when the consolidation type
     * is transborder distribution. */
    private com.fedex.openship.stub.ConsolidationTransborderDistributionDetail transborderDistributionDetail;

    /* Specifies the type and location id for the distribution location
     * to be used to process the consolidation. */
    private com.fedex.openship.stub.RequestedDistributionLocation[] distributionLocations;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private CustomsClearanceDetail customsClearanceDetail;

    private Payment shippingChargesPayment;

    /* Provides requirements for production of all documents for this
     * consolidation. */
    private com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification;

    /* If specifies, identifies the documents that are required to
     * be generated for every CRN in the consolidation. */
    private com.fedex.openship.stub.RequestedShippingDocumentType[] crnShippingDocumentTypes;

    public RequestedConsolidation() {
    }

    public RequestedConsolidation(
           ConsolidationType consolidationType,
           java.util.Date shipDate,
           TrackingId[] trackingIds,
           String description,
           Party shipper,
           ContactAndAddress origin,
           Party soldTo,
           String bookingNumber,
           com.fedex.openship.stub.ConsolidationDataSource[] consolidationDataSources,
           com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested,
           CustomerReference[] customerReferences,
           LabelSpecification labelSpecification,
           com.fedex.openship.stub.InternationalDistributionDetail internationalDistributionDetail,
           com.fedex.openship.stub.ConsolidationTransborderDistributionDetail transborderDistributionDetail,
           com.fedex.openship.stub.RequestedDistributionLocation[] distributionLocations,
           CustomsClearanceDetail customsClearanceDetail,
           Payment shippingChargesPayment,
           com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification,
           com.fedex.openship.stub.RequestedShippingDocumentType[] crnShippingDocumentTypes) {
           this.consolidationType = consolidationType;
           this.shipDate = shipDate;
           this.trackingIds = trackingIds;
           this.description = description;
           this.shipper = shipper;
           this.origin = origin;
           this.soldTo = soldTo;
           this.bookingNumber = bookingNumber;
           this.consolidationDataSources = consolidationDataSources;
           this.specialServicesRequested = specialServicesRequested;
           this.customerReferences = customerReferences;
           this.labelSpecification = labelSpecification;
           this.internationalDistributionDetail = internationalDistributionDetail;
           this.transborderDistributionDetail = transborderDistributionDetail;
           this.distributionLocations = distributionLocations;
           this.customsClearanceDetail = customsClearanceDetail;
           this.shippingChargesPayment = shippingChargesPayment;
           this.consolidationDocumentSpecification = consolidationDocumentSpecification;
           this.crnShippingDocumentTypes = crnShippingDocumentTypes;
    }


    /**
     * Gets the consolidationType value for this RequestedConsolidation.
     * 
     * @return consolidationType
     */
    public ConsolidationType getConsolidationType() {
        return consolidationType;
    }


    /**
     * Sets the consolidationType value for this RequestedConsolidation.
     * 
     * @param consolidationType
     */
    public void setConsolidationType(ConsolidationType consolidationType) {
        this.consolidationType = consolidationType;
    }


    /**
     * Gets the shipDate value for this RequestedConsolidation.
     * 
     * @return shipDate   * Date for the (intended) actual movement of the consolidation.
     */
    public java.util.Date getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this RequestedConsolidation.
     * 
     * @param shipDate   * Date for the (intended) actual movement of the consolidation.
     */
    public void setShipDate(java.util.Date shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the trackingIds value for this RequestedConsolidation.
     * 
     * @return trackingIds   * Master Air Way Bill tracking ID
     */
    public TrackingId[] getTrackingIds() {
        return trackingIds;
    }


    /**
     * Sets the trackingIds value for this RequestedConsolidation.
     * 
     * @param trackingIds   * Master Air Way Bill tracking ID
     */
    public void setTrackingIds(TrackingId[] trackingIds) {
        this.trackingIds = trackingIds;
    }

    public TrackingId getTrackingIds(int i) {
        return this.trackingIds[i];
    }

    public void setTrackingIds(int i, TrackingId _value) {
        this.trackingIds[i] = _value;
    }


    /**
     * Gets the description value for this RequestedConsolidation.
     * 
     * @return description   * Specifies a human readable description of the consolidation
     * that is provided by the client, in order to easily identify the consolidation.
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RequestedConsolidation.
     * 
     * @param description   * Specifies a human readable description of the consolidation
     * that is provided by the client, in order to easily identify the consolidation.
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the shipper value for this RequestedConsolidation.
     * 
     * @return shipper
     */
    public Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedConsolidation.
     * 
     * @param shipper
     */
    public void setShipper(Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the origin value for this RequestedConsolidation.
     * 
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedConsolidation.
     * 
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the soldTo value for this RequestedConsolidation.
     * 
     * @return soldTo   * Indicates the party responsible for purchasing the goods shipped
     * from the shipper to the recipient. The sold to party is not necessarily
     * the recipient or the importer of record. The sold to party is relevant
     * when the purchaser, rather than the recipient, determines when certain
     * customs regulations apply.
     */
    public Party getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this RequestedConsolidation.
     * 
     * @param soldTo   * Indicates the party responsible for purchasing the goods shipped
     * from the shipper to the recipient. The sold to party is not necessarily
     * the recipient or the importer of record. The sold to party is relevant
     * when the purchaser, rather than the recipient, determines when certain
     * customs regulations apply.
     */
    public void setSoldTo(Party soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the bookingNumber value for this RequestedConsolidation.
     * 
     * @return bookingNumber
     */
    public String getBookingNumber() {
        return bookingNumber;
    }


    /**
     * Sets the bookingNumber value for this RequestedConsolidation.
     * 
     * @param bookingNumber
     */
    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }


    /**
     * Gets the consolidationDataSources value for this RequestedConsolidation.
     * 
     * @return consolidationDataSources   * Specifies how selected values in the consolidation are to be
     * determined.
     */
    public com.fedex.openship.stub.ConsolidationDataSource[] getConsolidationDataSources() {
        return consolidationDataSources;
    }


    /**
     * Sets the consolidationDataSources value for this RequestedConsolidation.
     * 
     * @param consolidationDataSources   * Specifies how selected values in the consolidation are to be
     * determined.
     */
    public void setConsolidationDataSources(com.fedex.openship.stub.ConsolidationDataSource[] consolidationDataSources) {
        this.consolidationDataSources = consolidationDataSources;
    }

    public com.fedex.openship.stub.ConsolidationDataSource getConsolidationDataSources(int i) {
        return this.consolidationDataSources[i];
    }

    public void setConsolidationDataSources(int i, com.fedex.openship.stub.ConsolidationDataSource _value) {
        this.consolidationDataSources[i] = _value;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedConsolidation.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.openship.stub.ConsolidationSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedConsolidation.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.openship.stub.ConsolidationSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the customerReferences value for this RequestedConsolidation.
     * 
     * @return customerReferences   * References applying to the entire consolidation.
     */
    public CustomerReference[] getCustomerReferences() {
        return customerReferences;
    }


    /**
     * Sets the customerReferences value for this RequestedConsolidation.
     * 
     * @param customerReferences   * References applying to the entire consolidation.
     */
    public void setCustomerReferences(CustomerReference[] customerReferences) {
        this.customerReferences = customerReferences;
    }

    public CustomerReference getCustomerReferences(int i) {
        return this.customerReferences[i];
    }

    public void setCustomerReferences(int i, CustomerReference _value) {
        this.customerReferences[i] = _value;
    }


    /**
     * Gets the labelSpecification value for this RequestedConsolidation.
     * 
     * @return labelSpecification
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedConsolidation.
     * 
     * @param labelSpecification
     */
    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the internationalDistributionDetail value for this RequestedConsolidation.
     * 
     * @return internationalDistributionDetail
     */
    public com.fedex.openship.stub.InternationalDistributionDetail getInternationalDistributionDetail() {
        return internationalDistributionDetail;
    }


    /**
     * Sets the internationalDistributionDetail value for this RequestedConsolidation.
     * 
     * @param internationalDistributionDetail
     */
    public void setInternationalDistributionDetail(com.fedex.openship.stub.InternationalDistributionDetail internationalDistributionDetail) {
        this.internationalDistributionDetail = internationalDistributionDetail;
    }


    /**
     * Gets the transborderDistributionDetail value for this RequestedConsolidation.
     * 
     * @return transborderDistributionDetail   * Specifies the transborder data when the consolidation type
     * is transborder distribution.
     */
    public com.fedex.openship.stub.ConsolidationTransborderDistributionDetail getTransborderDistributionDetail() {
        return transborderDistributionDetail;
    }


    /**
     * Sets the transborderDistributionDetail value for this RequestedConsolidation.
     * 
     * @param transborderDistributionDetail   * Specifies the transborder data when the consolidation type
     * is transborder distribution.
     */
    public void setTransborderDistributionDetail(com.fedex.openship.stub.ConsolidationTransborderDistributionDetail transborderDistributionDetail) {
        this.transborderDistributionDetail = transborderDistributionDetail;
    }


    /**
     * Gets the distributionLocations value for this RequestedConsolidation.
     * 
     * @return distributionLocations   * Specifies the type and location id for the distribution location
     * to be used to process the consolidation.
     */
    public com.fedex.openship.stub.RequestedDistributionLocation[] getDistributionLocations() {
        return distributionLocations;
    }


    /**
     * Sets the distributionLocations value for this RequestedConsolidation.
     * 
     * @param distributionLocations   * Specifies the type and location id for the distribution location
     * to be used to process the consolidation.
     */
    public void setDistributionLocations(com.fedex.openship.stub.RequestedDistributionLocation[] distributionLocations) {
        this.distributionLocations = distributionLocations;
    }

    public com.fedex.openship.stub.RequestedDistributionLocation getDistributionLocations(int i) {
        return this.distributionLocations[i];
    }

    public void setDistributionLocations(int i, com.fedex.openship.stub.RequestedDistributionLocation _value) {
        this.distributionLocations[i] = _value;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedConsolidation.
     * 
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedConsolidation.
     * 
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedConsolidation.
     * 
     * @return shippingChargesPayment
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedConsolidation.
     * 
     * @param shippingChargesPayment
     */
    public void setShippingChargesPayment(Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the consolidationDocumentSpecification value for this RequestedConsolidation.
     * 
     * @return consolidationDocumentSpecification   * Provides requirements for production of all documents for this
     * consolidation.
     */
    public com.fedex.openship.stub.ConsolidationDocumentSpecification getConsolidationDocumentSpecification() {
        return consolidationDocumentSpecification;
    }


    /**
     * Sets the consolidationDocumentSpecification value for this RequestedConsolidation.
     * 
     * @param consolidationDocumentSpecification   * Provides requirements for production of all documents for this
     * consolidation.
     */
    public void setConsolidationDocumentSpecification(com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification) {
        this.consolidationDocumentSpecification = consolidationDocumentSpecification;
    }


    /**
     * Gets the crnShippingDocumentTypes value for this RequestedConsolidation.
     * 
     * @return crnShippingDocumentTypes   * If specifies, identifies the documents that are required to
     * be generated for every CRN in the consolidation.
     */
    public com.fedex.openship.stub.RequestedShippingDocumentType[] getCrnShippingDocumentTypes() {
        return crnShippingDocumentTypes;
    }


    /**
     * Sets the crnShippingDocumentTypes value for this RequestedConsolidation.
     * 
     * @param crnShippingDocumentTypes   * If specifies, identifies the documents that are required to
     * be generated for every CRN in the consolidation.
     */
    public void setCrnShippingDocumentTypes(com.fedex.openship.stub.RequestedShippingDocumentType[] crnShippingDocumentTypes) {
        this.crnShippingDocumentTypes = crnShippingDocumentTypes;
    }

    public com.fedex.openship.stub.RequestedShippingDocumentType getCrnShippingDocumentTypes(int i) {
        return this.crnShippingDocumentTypes[i];
    }

    public void setCrnShippingDocumentTypes(int i, com.fedex.openship.stub.RequestedShippingDocumentType _value) {
        this.crnShippingDocumentTypes[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestedConsolidation)) return false;
        RequestedConsolidation other = (RequestedConsolidation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consolidationType==null && other.getConsolidationType()==null) || 
             (this.consolidationType!=null &&
              this.consolidationType.equals(other.getConsolidationType()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.trackingIds==null && other.getTrackingIds()==null) || 
             (this.trackingIds!=null &&
              java.util.Arrays.equals(this.trackingIds, other.getTrackingIds()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.bookingNumber==null && other.getBookingNumber()==null) || 
             (this.bookingNumber!=null &&
              this.bookingNumber.equals(other.getBookingNumber()))) &&
            ((this.consolidationDataSources==null && other.getConsolidationDataSources()==null) || 
             (this.consolidationDataSources!=null &&
              java.util.Arrays.equals(this.consolidationDataSources, other.getConsolidationDataSources()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.customerReferences==null && other.getCustomerReferences()==null) || 
             (this.customerReferences!=null &&
              java.util.Arrays.equals(this.customerReferences, other.getCustomerReferences()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.internationalDistributionDetail==null && other.getInternationalDistributionDetail()==null) || 
             (this.internationalDistributionDetail!=null &&
              this.internationalDistributionDetail.equals(other.getInternationalDistributionDetail()))) &&
            ((this.transborderDistributionDetail==null && other.getTransborderDistributionDetail()==null) || 
             (this.transborderDistributionDetail!=null &&
              this.transborderDistributionDetail.equals(other.getTransborderDistributionDetail()))) &&
            ((this.distributionLocations==null && other.getDistributionLocations()==null) || 
             (this.distributionLocations!=null &&
              java.util.Arrays.equals(this.distributionLocations, other.getDistributionLocations()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) || 
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.consolidationDocumentSpecification==null && other.getConsolidationDocumentSpecification()==null) || 
             (this.consolidationDocumentSpecification!=null &&
              this.consolidationDocumentSpecification.equals(other.getConsolidationDocumentSpecification()))) &&
            ((this.crnShippingDocumentTypes==null && other.getCrnShippingDocumentTypes()==null) || 
             (this.crnShippingDocumentTypes!=null &&
              java.util.Arrays.equals(this.crnShippingDocumentTypes, other.getCrnShippingDocumentTypes())));
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
        if (getConsolidationType() != null) {
            _hashCode += getConsolidationType().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getTrackingIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingIds());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTrackingIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getBookingNumber() != null) {
            _hashCode += getBookingNumber().hashCode();
        }
        if (getConsolidationDataSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidationDataSources());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConsolidationDataSources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getCustomerReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerReferences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getInternationalDistributionDetail() != null) {
            _hashCode += getInternationalDistributionDetail().hashCode();
        }
        if (getTransborderDistributionDetail() != null) {
            _hashCode += getTransborderDistributionDetail().hashCode();
        }
        if (getDistributionLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributionLocations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDistributionLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getConsolidationDocumentSpecification() != null) {
            _hashCode += getConsolidationDocumentSpecification().hashCode();
        }
        if (getCrnShippingDocumentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrnShippingDocumentTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCrnShippingDocumentTypes(), i);
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
        new org.apache.axis.description.TypeDesc(RequestedConsolidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BookingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationDataSources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalDistributionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transborderDistributionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationTransborderDistributionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DistributionLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedDistributionLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crnShippingDocumentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CrnShippingDocumentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShippingDocumentType"));
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

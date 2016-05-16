/**
 * RequestedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * The descriptive data for the shipment being tendered to FedEx.
 */
public class RequestedShipment  implements java.io.Serializable {
    /* Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time). */
    private java.util.Calendar shipTimestamp;

    /* Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values. */
    private DropoffType dropoffType;

    /* Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values. */
    private ServiceType serviceType;

    /* Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values. */
    private PackagingType packagingType;

    /* This specifies information related to the manifest associated
     * with the shipment. */
    private com.fedex.openship.stub.ShipmentManifestDetail manifestDetail;

    private Weight totalWeight;

    /* Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment. */
    private Money totalInsuredValue;

    private Dimensions totalDimensions;

    /* This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible). */
    private String preferredCurrency;

    /* Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address. */
    private Party shipper;

    /* Descriptive data identifying the party receiving the package. */
    private Party recipient;

    private String recipientLocationNumber;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private ContactAndAddress origin;

    private Party soldTo;

    private Payment shippingChargesPayment;

    private com.fedex.openship.stub.ShipmentSpecialServicesRequested specialServicesRequested;

    /* Specifies any custom processing to be applied to this shipment. */
    private com.fedex.openship.stub.ShipmentProcessingOptionsRequested processingOptionsRequested;

    private com.fedex.openship.stub.ExpressFreightDetail expressFreightDetail;

    /* Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services. */
    private com.fedex.openship.stub.FreightShipmentDetail freightShipmentDetail;

    /* Data applicable to shipments that are a part of a consolidation. */
    private com.fedex.openship.stub.ShipmentConsolidationDetail consolidationDetail;

    /* Used with Ground Home Delivery and Freight. */
    private String deliveryInstructions;

    private com.fedex.openship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private com.fedex.openship.stub.CustomsClearanceDetail customsClearanceDetail;

    /* For use in "process tag" transaction. */
    private PickupDetail pickupDetail;

    /* Specifies the characteristics of a shipment pertaining to SmartPost
     * services. */
    private com.fedex.openship.stub.SmartPostShipmentDetail smartPostDetail;

    /* If true, only the shipper/payor will have visibility of this
     * shipment. */
    private Boolean blockInsightVisibility;

    /* Details about the image format and printer type the label is
     * to returned in. */
    private com.fedex.openship.stub.LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private RateRequestType[] rateRequestTypes;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private EdtRequestType edtRequestType;

    /* Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment. */
    private TrackingId masterTrackingId;

    /* The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.) */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies data structures that may be re-used multiple times
     * with s single shipment. */
    private com.fedex.openship.stub.ShipmentConfigurationData configurationData;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment. */
    private com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems;

    public RequestedShipment() {
    }

    public RequestedShipment(
           java.util.Calendar shipTimestamp,
           DropoffType dropoffType,
           ServiceType serviceType,
           PackagingType packagingType,
           com.fedex.openship.stub.ShipmentManifestDetail manifestDetail,
           Weight totalWeight,
           Money totalInsuredValue,
           Dimensions totalDimensions,
           String preferredCurrency,
           Party shipper,
           Party recipient,
           String recipientLocationNumber,
           ContactAndAddress origin,
           Party soldTo,
           Payment shippingChargesPayment,
           com.fedex.openship.stub.ShipmentSpecialServicesRequested specialServicesRequested,
           com.fedex.openship.stub.ShipmentProcessingOptionsRequested processingOptionsRequested,
           com.fedex.openship.stub.ExpressFreightDetail expressFreightDetail,
           com.fedex.openship.stub.FreightShipmentDetail freightShipmentDetail,
           com.fedex.openship.stub.ShipmentConsolidationDetail consolidationDetail,
           String deliveryInstructions,
           com.fedex.openship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.fedex.openship.stub.CustomsClearanceDetail customsClearanceDetail,
           PickupDetail pickupDetail,
           com.fedex.openship.stub.SmartPostShipmentDetail smartPostDetail,
           Boolean blockInsightVisibility,
           com.fedex.openship.stub.LabelSpecification labelSpecification,
           com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification,
           RateRequestType[] rateRequestTypes,
           EdtRequestType edtRequestType,
           TrackingId masterTrackingId,
           org.apache.axis.types.NonNegativeInteger packageCount,
           com.fedex.openship.stub.ShipmentConfigurationData configurationData,
           com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
           this.shipTimestamp = shipTimestamp;
           this.dropoffType = dropoffType;
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.manifestDetail = manifestDetail;
           this.totalWeight = totalWeight;
           this.totalInsuredValue = totalInsuredValue;
           this.totalDimensions = totalDimensions;
           this.preferredCurrency = preferredCurrency;
           this.shipper = shipper;
           this.recipient = recipient;
           this.recipientLocationNumber = recipientLocationNumber;
           this.origin = origin;
           this.soldTo = soldTo;
           this.shippingChargesPayment = shippingChargesPayment;
           this.specialServicesRequested = specialServicesRequested;
           this.processingOptionsRequested = processingOptionsRequested;
           this.expressFreightDetail = expressFreightDetail;
           this.freightShipmentDetail = freightShipmentDetail;
           this.consolidationDetail = consolidationDetail;
           this.deliveryInstructions = deliveryInstructions;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.customsClearanceDetail = customsClearanceDetail;
           this.pickupDetail = pickupDetail;
           this.smartPostDetail = smartPostDetail;
           this.blockInsightVisibility = blockInsightVisibility;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.edtRequestType = edtRequestType;
           this.masterTrackingId = masterTrackingId;
           this.packageCount = packageCount;
           this.configurationData = configurationData;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the shipTimestamp value for this RequestedShipment.
     * 
     * @return shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this RequestedShipment.
     * 
     * @param shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the dropoffType value for this RequestedShipment.
     * 
     * @return dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this RequestedShipment.
     * 
     * @param dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public void setDropoffType(DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the serviceType value for this RequestedShipment.
     * 
     * @return serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RequestedShipment.
     * 
     * @param serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RequestedShipment.
     * 
     * @return packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RequestedShipment.
     * 
     * @param packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the manifestDetail value for this RequestedShipment.
     * 
     * @return manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public com.fedex.openship.stub.ShipmentManifestDetail getManifestDetail() {
        return manifestDetail;
    }


    /**
     * Sets the manifestDetail value for this RequestedShipment.
     * 
     * @param manifestDetail   * This specifies information related to the manifest associated
     * with the shipment.
     */
    public void setManifestDetail(com.fedex.openship.stub.ShipmentManifestDetail manifestDetail) {
        this.manifestDetail = manifestDetail;
    }


    /**
     * Gets the totalWeight value for this RequestedShipment.
     * 
     * @return totalWeight
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this RequestedShipment.
     * 
     * @param totalWeight
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalInsuredValue value for this RequestedShipment.
     * 
     * @return totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this RequestedShipment.
     * 
     * @param totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public void setTotalInsuredValue(Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the totalDimensions value for this RequestedShipment.
     * 
     * @return totalDimensions
     */
    public Dimensions getTotalDimensions() {
        return totalDimensions;
    }


    /**
     * Sets the totalDimensions value for this RequestedShipment.
     * 
     * @param totalDimensions
     */
    public void setTotalDimensions(Dimensions totalDimensions) {
        this.totalDimensions = totalDimensions;
    }


    /**
     * Gets the preferredCurrency value for this RequestedShipment.
     * 
     * @return preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public String getPreferredCurrency() {
        return preferredCurrency;
    }


    /**
     * Sets the preferredCurrency value for this RequestedShipment.
     * 
     * @param preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public void setPreferredCurrency(String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }


    /**
     * Gets the shipper value for this RequestedShipment.
     * 
     * @return shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedShipment.
     * 
     * @param shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public void setShipper(Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the recipient value for this RequestedShipment.
     * 
     * @return recipient   * Descriptive data identifying the party receiving the package.
     */
    public Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestedShipment.
     * 
     * @param recipient   * Descriptive data identifying the party receiving the package.
     */
    public void setRecipient(Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @return recipientLocationNumber
     */
    public String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }


    /**
     * Sets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @param recipientLocationNumber
     */
    public void setRecipientLocationNumber(String recipientLocationNumber) {
        this.recipientLocationNumber = recipientLocationNumber;
    }


    /**
     * Gets the origin value for this RequestedShipment.
     * 
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedShipment.
     * 
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the soldTo value for this RequestedShipment.
     * 
     * @return soldTo
     */
    public Party getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this RequestedShipment.
     * 
     * @param soldTo
     */
    public void setSoldTo(Party soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @return shippingChargesPayment
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @param shippingChargesPayment
     */
    public void setShippingChargesPayment(Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedShipment.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.openship.stub.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedShipment.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.openship.stub.ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the processingOptionsRequested value for this RequestedShipment.
     * 
     * @return processingOptionsRequested   * Specifies any custom processing to be applied to this shipment.
     */
    public com.fedex.openship.stub.ShipmentProcessingOptionsRequested getProcessingOptionsRequested() {
        return processingOptionsRequested;
    }


    /**
     * Sets the processingOptionsRequested value for this RequestedShipment.
     * 
     * @param processingOptionsRequested   * Specifies any custom processing to be applied to this shipment.
     */
    public void setProcessingOptionsRequested(com.fedex.openship.stub.ShipmentProcessingOptionsRequested processingOptionsRequested) {
        this.processingOptionsRequested = processingOptionsRequested;
    }


    /**
     * Gets the expressFreightDetail value for this RequestedShipment.
     * 
     * @return expressFreightDetail
     */
    public com.fedex.openship.stub.ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this RequestedShipment.
     * 
     * @param expressFreightDetail
     */
    public void setExpressFreightDetail(com.fedex.openship.stub.ExpressFreightDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @return freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public com.fedex.openship.stub.FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }


    /**
     * Sets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @param freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public void setFreightShipmentDetail(com.fedex.openship.stub.FreightShipmentDetail freightShipmentDetail) {
        this.freightShipmentDetail = freightShipmentDetail;
    }


    /**
     * Gets the consolidationDetail value for this RequestedShipment.
     * 
     * @return consolidationDetail   * Data applicable to shipments that are a part of a consolidation.
     */
    public com.fedex.openship.stub.ShipmentConsolidationDetail getConsolidationDetail() {
        return consolidationDetail;
    }


    /**
     * Sets the consolidationDetail value for this RequestedShipment.
     * 
     * @param consolidationDetail   * Data applicable to shipments that are a part of a consolidation.
     */
    public void setConsolidationDetail(com.fedex.openship.stub.ShipmentConsolidationDetail consolidationDetail) {
        this.consolidationDetail = consolidationDetail;
    }


    /**
     * Gets the deliveryInstructions value for this RequestedShipment.
     * 
     * @return deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }


    /**
     * Sets the deliveryInstructions value for this RequestedShipment.
     * 
     * @param deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @return variableHandlingChargeDetail
     */
    public com.fedex.openship.stub.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @param variableHandlingChargeDetail
     */
    public void setVariableHandlingChargeDetail(com.fedex.openship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public com.fedex.openship.stub.CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(com.fedex.openship.stub.CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the pickupDetail value for this RequestedShipment.
     * 
     * @return pickupDetail   * For use in "process tag" transaction.
     */
    public PickupDetail getPickupDetail() {
        return pickupDetail;
    }


    /**
     * Sets the pickupDetail value for this RequestedShipment.
     * 
     * @param pickupDetail   * For use in "process tag" transaction.
     */
    public void setPickupDetail(PickupDetail pickupDetail) {
        this.pickupDetail = pickupDetail;
    }


    /**
     * Gets the smartPostDetail value for this RequestedShipment.
     * 
     * @return smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public com.fedex.openship.stub.SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this RequestedShipment.
     * 
     * @param smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public void setSmartPostDetail(com.fedex.openship.stub.SmartPostShipmentDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @return blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public Boolean getBlockInsightVisibility() {
        return blockInsightVisibility;
    }


    /**
     * Sets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @param blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public void setBlockInsightVisibility(Boolean blockInsightVisibility) {
        this.blockInsightVisibility = blockInsightVisibility;
    }


    /**
     * Gets the labelSpecification value for this RequestedShipment.
     * 
     * @return labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public com.fedex.openship.stub.LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedShipment.
     * 
     * @param labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public void setLabelSpecification(com.fedex.openship.stub.LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.fedex.openship.stub.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this RequestedShipment.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this RequestedShipment.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the edtRequestType value for this RequestedShipment.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this RequestedShipment.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the masterTrackingId value for this RequestedShipment.
     * 
     * @return masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this RequestedShipment.
     * 
     * @param masterTrackingId   * Only used with multiple-transaction shipments, to identify
     * the master package in a multi-piece shipment.
     */
    public void setMasterTrackingId(TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the packageCount value for this RequestedShipment.
     * 
     * @return packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this RequestedShipment.
     * 
     * @param packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the configurationData value for this RequestedShipment.
     * 
     * @return configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public com.fedex.openship.stub.ShipmentConfigurationData getConfigurationData() {
        return configurationData;
    }


    /**
     * Sets the configurationData value for this RequestedShipment.
     * 
     * @param configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public void setConfigurationData(com.fedex.openship.stub.ShipmentConfigurationData configurationData) {
        this.configurationData = configurationData;
    }


    /**
     * Gets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public com.fedex.openship.stub.RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public void setRequestedPackageLineItems(com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public com.fedex.openship.stub.RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, com.fedex.openship.stub.RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestedShipment)) return false;
        RequestedShipment other = (RequestedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) || 
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.dropoffType==null && other.getDropoffType()==null) || 
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.manifestDetail==null && other.getManifestDetail()==null) || 
             (this.manifestDetail!=null &&
              this.manifestDetail.equals(other.getManifestDetail()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.totalDimensions==null && other.getTotalDimensions()==null) || 
             (this.totalDimensions!=null &&
              this.totalDimensions.equals(other.getTotalDimensions()))) &&
            ((this.preferredCurrency==null && other.getPreferredCurrency()==null) || 
             (this.preferredCurrency!=null &&
              this.preferredCurrency.equals(other.getPreferredCurrency()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientLocationNumber==null && other.getRecipientLocationNumber()==null) || 
             (this.recipientLocationNumber!=null &&
              this.recipientLocationNumber.equals(other.getRecipientLocationNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.processingOptionsRequested==null && other.getProcessingOptionsRequested()==null) || 
             (this.processingOptionsRequested!=null &&
              this.processingOptionsRequested.equals(other.getProcessingOptionsRequested()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) || 
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.freightShipmentDetail==null && other.getFreightShipmentDetail()==null) || 
             (this.freightShipmentDetail!=null &&
              this.freightShipmentDetail.equals(other.getFreightShipmentDetail()))) &&
            ((this.consolidationDetail==null && other.getConsolidationDetail()==null) || 
             (this.consolidationDetail!=null &&
              this.consolidationDetail.equals(other.getConsolidationDetail()))) &&
            ((this.deliveryInstructions==null && other.getDeliveryInstructions()==null) || 
             (this.deliveryInstructions!=null &&
              this.deliveryInstructions.equals(other.getDeliveryInstructions()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) || 
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) || 
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.pickupDetail==null && other.getPickupDetail()==null) || 
             (this.pickupDetail!=null &&
              this.pickupDetail.equals(other.getPickupDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.blockInsightVisibility==null && other.getBlockInsightVisibility()==null) || 
             (this.blockInsightVisibility!=null &&
              this.blockInsightVisibility.equals(other.getBlockInsightVisibility()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.configurationData==null && other.getConfigurationData()==null) || 
             (this.configurationData!=null &&
              this.configurationData.equals(other.getConfigurationData()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) || 
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
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
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getManifestDetail() != null) {
            _hashCode += getManifestDetail().hashCode();
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getTotalDimensions() != null) {
            _hashCode += getTotalDimensions().hashCode();
        }
        if (getPreferredCurrency() != null) {
            _hashCode += getPreferredCurrency().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientLocationNumber() != null) {
            _hashCode += getRecipientLocationNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getProcessingOptionsRequested() != null) {
            _hashCode += getProcessingOptionsRequested().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getFreightShipmentDetail() != null) {
            _hashCode += getFreightShipmentDetail().hashCode();
        }
        if (getConsolidationDetail() != null) {
            _hashCode += getConsolidationDetail().hashCode();
        }
        if (getDeliveryInstructions() != null) {
            _hashCode += getDeliveryInstructions().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getPickupDetail() != null) {
            _hashCode += getPickupDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getBlockInsightVisibility() != null) {
            _hashCode += getBlockInsightVisibility().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getConfigurationData() != null) {
            _hashCode += getConfigurationData().hashCode();
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(RequestedShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DropoffType"));
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
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manifestDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ManifestDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentManifestDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PreferredCurrency"));
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
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLocationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RecipientLocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptionsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ProcessingOptionsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentProcessingOptionsRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressFreightDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentConsolidationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeliveryInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInsightVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BlockInsightVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MasterTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfigurationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentConfigurationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedPackageLineItem"));
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

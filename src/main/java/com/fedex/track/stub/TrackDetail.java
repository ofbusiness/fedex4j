/**
 * TrackDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * Detailed tracking information about a particular package.
 */
public class TrackDetail  implements java.io.Serializable {
    /* To report soft error on an individual track detail. */
    private Notification notification;

    /* The FedEx package identifier. */
    private String trackingNumber;

    private StringBarcode barcode;

    /* When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number. */
    private String trackingNumberUniqueIdentifier;

    /* Specifies details about the status of the shipment being tracked. */
    private TrackStatusDetail statusDetail;

    private CustomerExceptionRequestDetail[] customerExceptionRequests;

    /* Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for. */
    private TrackReconciliation reconciliation;

    /* Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled */
    private String serviceCommitMessage;

    private String destinationServiceArea;

    private String destinationServiceAreaDescription;

    /* Identifies a FedEx operating company (transportation). */
    private CarrierCodeType carrierCode;

    /* Identifies operating transportation company that is the specific
     * to the carrier code. */
    private OperatingCompanyType operatingCompany;

    /* Specifies a detailed description about the carrier or the operating
     * company. */
    private String operatingCompanyOrCarrierDescription;

    /* If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.) */
    private String cartageAgentCompanyName;

    /* Specifies the FXO production centre contact and address. */
    private ContactAndAddress productionLocationContactAndAddress;

    /* Other related identifiers for this package such as reference
     * numbers. */
    private TrackOtherIdentifierDetail[] otherIdentifiers;

    /* (Returned for CSR SL only.) */
    private String formId;

    /* Specifies details about service such as service description
     * and type. */
    private TrackServiceDescriptionDetail service;

    /* The weight of this package. */
    private Weight packageWeight;

    /* Physical dimensions of the package. */
    private Dimensions packageDimensions;

    /* The dimensional weight of the package. */
    private Weight packageDimensionalWeight;

    /* The weight of the entire shipment. */
    private Weight shipmentWeight;

    /* Retained for legacy compatibility only. */
    private String packaging;

    /* Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING). */
    private PackagingType packagingType;

    /* The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4. */
    private org.apache.axis.types.NonNegativeInteger packageSequenceNumber;

    /* The number of packages in this shipment. */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies the details about the SPOC details. */
    private TrackChargeDetail[] charges;

    private String nickName;

    private String notes;

    private TrackDetailAttributeType[] attributes;

    private ContentRecord[] shipmentContents;

    private String[] packageContents;

    private String clearanceLocationCode;

    private Commodity[] commodities;

    private TrackReturnDetail returnDetail;

    /* Specifies the reason for return. */
    private CustomsOptionDetail[] customsOptionDetails;

    private TrackAdvanceNotificationDetail advanceNotificationDetail;

    /* List of special handlings that applied to this package. (Returned
     * for CSR SL only.) */
    private TrackSpecialHandling[] specialHandlings;

    /* (Returned for CSR SL only.) */
    private Contact shipper;

    /* Indicates last-known possession of package (Returned for CSR
     * SL only.) */
    private TrackPossessionStatusType possessionStatus;

    /* The address information for the shipper. */
    private Address shipperAddress;

    /* The address of the FedEx pickup location/facility. */
    private Address originLocationAddress;

    /* (Returned for CSR SL only.) */
    private String originStationId;

    /* Estimated package pickup time for shipments that haven't been
     * picked up. */
    private java.util.Calendar estimatedPickupTimestamp;

    /* Time package was shipped/tendered over to FedEx. Time portion
     * will be populated if available, otherwise will be set to midnight. */
    private java.util.Calendar shipTimestamp;

    /* The distance from the origin to the destination. Returned for
     * Custom Critical shipments. */
    private Distance totalTransitDistance;

    /* Total distance package still has to travel. Returned for Custom
     * Critical shipments. */
    private Distance distanceToDestination;

    /* Provides additional details about package delivery. */
    private TrackSpecialInstruction[] specialInstructions;

    /* (Returned for CSR SL only.) */
    private Contact recipient;

    /* This is the latest updated destination address. */
    private Address lastUpdatedDestinationAddress;

    /* The address this package is to be (or has been) delivered. */
    private Address destinationAddress;

    private Contact holdAtLocationContact;

    /* The address this package is requested to placed on hold. */
    private Address holdAtLocationAddress;

    /* (Returned for CSR SL only.) */
    private String destinationStationId;

    /* The address of the FedEx delivery location/facility. */
    private Address destinationLocationAddress;

    private FedExLocationType destinationLocationType;

    private String destinationLocationTimeZoneOffset;

    /* Date and time the package should be (or should have been) delivered.
     * (Returned for CSR SL only.) */
    private java.util.Calendar commitmentTimestamp;

    /* Date and time the package would be delivered if the package
     * has appointment delivery as a special service. */
    private java.util.Calendar appointmentDeliveryTimestamp;

    /* Projected package delivery time based on ship time stamp, service
     * and destination. Not populated if delivery has already occurred. */
    private java.util.Calendar estimatedDeliveryTimestamp;

    /* The time the package was actually delivered. */
    private java.util.Calendar actualDeliveryTimestamp;

    /* Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.) */
    private Address actualDeliveryAddress;

    /* Identifies the method of office order delivery. */
    private OfficeOrderDeliveryMethodType officeOrderDeliveryMethod;

    /* Strict text indicating the delivery location at the delivered
     * to address. */
    private TrackDeliveryLocationType deliveryLocationType;

    /* User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text. */
    private String deliveryLocationDescription;

    /* Specifies the number of delivery attempts made to deliver the
     * shipment. */
    private org.apache.axis.types.NonNegativeInteger deliveryAttempts;

    /* This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file". */
    private String deliverySignatureName;

    /* Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin. */
    private PieceCountVerificationDetail[] pieceCountVerificationDetails;

    /* Specifies the total number of unique addresses on the CRNs
     * in a consolidation. */
    private org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation;

    private AvailableImageType[] availableImages;

    private SignatureImageDetail signature;

    /* The types of email notifications that are available for the
     * package. */
    private EMailNotificationEventType[] notificationEventsAvailable;

    /* Returned for cargo shipments only when they are currently split
     * across vehicles. */
    private TrackSplitShipmentPart[] splitShipmentParts;

    /* Specifies the details about the eligibility for different delivery
     * options. */
    private DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails;

    /* Event information for a tracking number. */
    private TrackEvent[] events;

    public TrackDetail() {
    }

    public TrackDetail(
           Notification notification,
           String trackingNumber,
           StringBarcode barcode,
           String trackingNumberUniqueIdentifier,
           TrackStatusDetail statusDetail,
           CustomerExceptionRequestDetail[] customerExceptionRequests,
           TrackReconciliation reconciliation,
           String serviceCommitMessage,
           String destinationServiceArea,
           String destinationServiceAreaDescription,
           CarrierCodeType carrierCode,
           OperatingCompanyType operatingCompany,
           String operatingCompanyOrCarrierDescription,
           String cartageAgentCompanyName,
           ContactAndAddress productionLocationContactAndAddress,
           TrackOtherIdentifierDetail[] otherIdentifiers,
           String formId,
           TrackServiceDescriptionDetail service,
           Weight packageWeight,
           Dimensions packageDimensions,
           Weight packageDimensionalWeight,
           Weight shipmentWeight,
           String packaging,
           PackagingType packagingType,
           org.apache.axis.types.NonNegativeInteger packageSequenceNumber,
           org.apache.axis.types.NonNegativeInteger packageCount,
           TrackChargeDetail[] charges,
           String nickName,
           String notes,
           TrackDetailAttributeType[] attributes,
           ContentRecord[] shipmentContents,
           String[] packageContents,
           String clearanceLocationCode,
           Commodity[] commodities,
           TrackReturnDetail returnDetail,
           CustomsOptionDetail[] customsOptionDetails,
           TrackAdvanceNotificationDetail advanceNotificationDetail,
           TrackSpecialHandling[] specialHandlings,
           Contact shipper,
           TrackPossessionStatusType possessionStatus,
           Address shipperAddress,
           Address originLocationAddress,
           String originStationId,
           java.util.Calendar estimatedPickupTimestamp,
           java.util.Calendar shipTimestamp,
           Distance totalTransitDistance,
           Distance distanceToDestination,
           TrackSpecialInstruction[] specialInstructions,
           Contact recipient,
           Address lastUpdatedDestinationAddress,
           Address destinationAddress,
           Contact holdAtLocationContact,
           Address holdAtLocationAddress,
           String destinationStationId,
           Address destinationLocationAddress,
           FedExLocationType destinationLocationType,
           String destinationLocationTimeZoneOffset,
           java.util.Calendar commitmentTimestamp,
           java.util.Calendar appointmentDeliveryTimestamp,
           java.util.Calendar estimatedDeliveryTimestamp,
           java.util.Calendar actualDeliveryTimestamp,
           Address actualDeliveryAddress,
           OfficeOrderDeliveryMethodType officeOrderDeliveryMethod,
           TrackDeliveryLocationType deliveryLocationType,
           String deliveryLocationDescription,
           org.apache.axis.types.NonNegativeInteger deliveryAttempts,
           String deliverySignatureName,
           PieceCountVerificationDetail[] pieceCountVerificationDetails,
           org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation,
           AvailableImageType[] availableImages,
           SignatureImageDetail signature,
           EMailNotificationEventType[] notificationEventsAvailable,
           TrackSplitShipmentPart[] splitShipmentParts,
           DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails,
           TrackEvent[] events) {
           this.notification = notification;
           this.trackingNumber = trackingNumber;
           this.barcode = barcode;
           this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
           this.statusDetail = statusDetail;
           this.customerExceptionRequests = customerExceptionRequests;
           this.reconciliation = reconciliation;
           this.serviceCommitMessage = serviceCommitMessage;
           this.destinationServiceArea = destinationServiceArea;
           this.destinationServiceAreaDescription = destinationServiceAreaDescription;
           this.carrierCode = carrierCode;
           this.operatingCompany = operatingCompany;
           this.operatingCompanyOrCarrierDescription = operatingCompanyOrCarrierDescription;
           this.cartageAgentCompanyName = cartageAgentCompanyName;
           this.productionLocationContactAndAddress = productionLocationContactAndAddress;
           this.otherIdentifiers = otherIdentifiers;
           this.formId = formId;
           this.service = service;
           this.packageWeight = packageWeight;
           this.packageDimensions = packageDimensions;
           this.packageDimensionalWeight = packageDimensionalWeight;
           this.shipmentWeight = shipmentWeight;
           this.packaging = packaging;
           this.packagingType = packagingType;
           this.packageSequenceNumber = packageSequenceNumber;
           this.packageCount = packageCount;
           this.charges = charges;
           this.nickName = nickName;
           this.notes = notes;
           this.attributes = attributes;
           this.shipmentContents = shipmentContents;
           this.packageContents = packageContents;
           this.clearanceLocationCode = clearanceLocationCode;
           this.commodities = commodities;
           this.returnDetail = returnDetail;
           this.customsOptionDetails = customsOptionDetails;
           this.advanceNotificationDetail = advanceNotificationDetail;
           this.specialHandlings = specialHandlings;
           this.shipper = shipper;
           this.possessionStatus = possessionStatus;
           this.shipperAddress = shipperAddress;
           this.originLocationAddress = originLocationAddress;
           this.originStationId = originStationId;
           this.estimatedPickupTimestamp = estimatedPickupTimestamp;
           this.shipTimestamp = shipTimestamp;
           this.totalTransitDistance = totalTransitDistance;
           this.distanceToDestination = distanceToDestination;
           this.specialInstructions = specialInstructions;
           this.recipient = recipient;
           this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
           this.destinationAddress = destinationAddress;
           this.holdAtLocationContact = holdAtLocationContact;
           this.holdAtLocationAddress = holdAtLocationAddress;
           this.destinationStationId = destinationStationId;
           this.destinationLocationAddress = destinationLocationAddress;
           this.destinationLocationType = destinationLocationType;
           this.destinationLocationTimeZoneOffset = destinationLocationTimeZoneOffset;
           this.commitmentTimestamp = commitmentTimestamp;
           this.appointmentDeliveryTimestamp = appointmentDeliveryTimestamp;
           this.estimatedDeliveryTimestamp = estimatedDeliveryTimestamp;
           this.actualDeliveryTimestamp = actualDeliveryTimestamp;
           this.actualDeliveryAddress = actualDeliveryAddress;
           this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
           this.deliveryLocationType = deliveryLocationType;
           this.deliveryLocationDescription = deliveryLocationDescription;
           this.deliveryAttempts = deliveryAttempts;
           this.deliverySignatureName = deliverySignatureName;
           this.pieceCountVerificationDetails = pieceCountVerificationDetails;
           this.totalUniqueAddressCountInConsolidation = totalUniqueAddressCountInConsolidation;
           this.availableImages = availableImages;
           this.signature = signature;
           this.notificationEventsAvailable = notificationEventsAvailable;
           this.splitShipmentParts = splitShipmentParts;
           this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
           this.events = events;
    }


    /**
     * Gets the notification value for this TrackDetail.
     * 
     * @return notification   * To report soft error on an individual track detail.
     */
    public Notification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this TrackDetail.
     * 
     * @param notification   * To report soft error on an individual track detail.
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    /**
     * Gets the trackingNumber value for this TrackDetail.
     * 
     * @return trackingNumber   * The FedEx package identifier.
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this TrackDetail.
     * 
     * @param trackingNumber   * The FedEx package identifier.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the barcode value for this TrackDetail.
     * 
     * @return barcode
     */
    public StringBarcode getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this TrackDetail.
     * 
     * @param barcode
     */
    public void setBarcode(StringBarcode barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the trackingNumberUniqueIdentifier value for this TrackDetail.
     * 
     * @return trackingNumberUniqueIdentifier   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }


    /**
     * Sets the trackingNumberUniqueIdentifier value for this TrackDetail.
     * 
     * @param trackingNumberUniqueIdentifier   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public void setTrackingNumberUniqueIdentifier(String trackingNumberUniqueIdentifier) {
        this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
    }


    /**
     * Gets the statusDetail value for this TrackDetail.
     * 
     * @return statusDetail   * Specifies details about the status of the shipment being tracked.
     */
    public TrackStatusDetail getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this TrackDetail.
     * 
     * @param statusDetail   * Specifies details about the status of the shipment being tracked.
     */
    public void setStatusDetail(TrackStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the customerExceptionRequests value for this TrackDetail.
     * 
     * @return customerExceptionRequests
     */
    public CustomerExceptionRequestDetail[] getCustomerExceptionRequests() {
        return customerExceptionRequests;
    }


    /**
     * Sets the customerExceptionRequests value for this TrackDetail.
     * 
     * @param customerExceptionRequests
     */
    public void setCustomerExceptionRequests(CustomerExceptionRequestDetail[] customerExceptionRequests) {
        this.customerExceptionRequests = customerExceptionRequests;
    }

    public CustomerExceptionRequestDetail getCustomerExceptionRequests(int i) {
        return this.customerExceptionRequests[i];
    }

    public void setCustomerExceptionRequests(int i, CustomerExceptionRequestDetail _value) {
        this.customerExceptionRequests[i] = _value;
    }


    /**
     * Gets the reconciliation value for this TrackDetail.
     * 
     * @return reconciliation   * Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for.
     */
    public TrackReconciliation getReconciliation() {
        return reconciliation;
    }


    /**
     * Sets the reconciliation value for this TrackDetail.
     * 
     * @param reconciliation   * Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for.
     */
    public void setReconciliation(TrackReconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }


    /**
     * Gets the serviceCommitMessage value for this TrackDetail.
     * 
     * @return serviceCommitMessage   * Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled
     */
    public String getServiceCommitMessage() {
        return serviceCommitMessage;
    }


    /**
     * Sets the serviceCommitMessage value for this TrackDetail.
     * 
     * @param serviceCommitMessage   * Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled
     */
    public void setServiceCommitMessage(String serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }


    /**
     * Gets the destinationServiceArea value for this TrackDetail.
     * 
     * @return destinationServiceArea
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }


    /**
     * Sets the destinationServiceArea value for this TrackDetail.
     * 
     * @param destinationServiceArea
     */
    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }


    /**
     * Gets the destinationServiceAreaDescription value for this TrackDetail.
     * 
     * @return destinationServiceAreaDescription
     */
    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }


    /**
     * Sets the destinationServiceAreaDescription value for this TrackDetail.
     * 
     * @param destinationServiceAreaDescription
     */
    public void setDestinationServiceAreaDescription(String destinationServiceAreaDescription) {
        this.destinationServiceAreaDescription = destinationServiceAreaDescription;
    }


    /**
     * Gets the carrierCode value for this TrackDetail.
     * 
     * @return carrierCode   * Identifies a FedEx operating company (transportation).
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this TrackDetail.
     * 
     * @param carrierCode   * Identifies a FedEx operating company (transportation).
     */
    public void setCarrierCode(CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the operatingCompany value for this TrackDetail.
     * 
     * @return operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public OperatingCompanyType getOperatingCompany() {
        return operatingCompany;
    }


    /**
     * Sets the operatingCompany value for this TrackDetail.
     * 
     * @param operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public void setOperatingCompany(OperatingCompanyType operatingCompany) {
        this.operatingCompany = operatingCompany;
    }


    /**
     * Gets the operatingCompanyOrCarrierDescription value for this TrackDetail.
     * 
     * @return operatingCompanyOrCarrierDescription   * Specifies a detailed description about the carrier or the operating
     * company.
     */
    public String getOperatingCompanyOrCarrierDescription() {
        return operatingCompanyOrCarrierDescription;
    }


    /**
     * Sets the operatingCompanyOrCarrierDescription value for this TrackDetail.
     * 
     * @param operatingCompanyOrCarrierDescription   * Specifies a detailed description about the carrier or the operating
     * company.
     */
    public void setOperatingCompanyOrCarrierDescription(String operatingCompanyOrCarrierDescription) {
        this.operatingCompanyOrCarrierDescription = operatingCompanyOrCarrierDescription;
    }


    /**
     * Gets the cartageAgentCompanyName value for this TrackDetail.
     * 
     * @return cartageAgentCompanyName   * If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.)
     */
    public String getCartageAgentCompanyName() {
        return cartageAgentCompanyName;
    }


    /**
     * Sets the cartageAgentCompanyName value for this TrackDetail.
     * 
     * @param cartageAgentCompanyName   * If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.)
     */
    public void setCartageAgentCompanyName(String cartageAgentCompanyName) {
        this.cartageAgentCompanyName = cartageAgentCompanyName;
    }


    /**
     * Gets the productionLocationContactAndAddress value for this TrackDetail.
     * 
     * @return productionLocationContactAndAddress   * Specifies the FXO production centre contact and address.
     */
    public ContactAndAddress getProductionLocationContactAndAddress() {
        return productionLocationContactAndAddress;
    }


    /**
     * Sets the productionLocationContactAndAddress value for this TrackDetail.
     * 
     * @param productionLocationContactAndAddress   * Specifies the FXO production centre contact and address.
     */
    public void setProductionLocationContactAndAddress(ContactAndAddress productionLocationContactAndAddress) {
        this.productionLocationContactAndAddress = productionLocationContactAndAddress;
    }


    /**
     * Gets the otherIdentifiers value for this TrackDetail.
     * 
     * @return otherIdentifiers   * Other related identifiers for this package such as reference
     * numbers.
     */
    public TrackOtherIdentifierDetail[] getOtherIdentifiers() {
        return otherIdentifiers;
    }


    /**
     * Sets the otherIdentifiers value for this TrackDetail.
     * 
     * @param otherIdentifiers   * Other related identifiers for this package such as reference
     * numbers.
     */
    public void setOtherIdentifiers(TrackOtherIdentifierDetail[] otherIdentifiers) {
        this.otherIdentifiers = otherIdentifiers;
    }

    public TrackOtherIdentifierDetail getOtherIdentifiers(int i) {
        return this.otherIdentifiers[i];
    }

    public void setOtherIdentifiers(int i, TrackOtherIdentifierDetail _value) {
        this.otherIdentifiers[i] = _value;
    }


    /**
     * Gets the formId value for this TrackDetail.
     * 
     * @return formId   * (Returned for CSR SL only.)
     */
    public String getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this TrackDetail.
     * 
     * @param formId   * (Returned for CSR SL only.)
     */
    public void setFormId(String formId) {
        this.formId = formId;
    }


    /**
     * Gets the service value for this TrackDetail.
     * 
     * @return service   * Specifies details about service such as service description
     * and type.
     */
    public TrackServiceDescriptionDetail getService() {
        return service;
    }


    /**
     * Sets the service value for this TrackDetail.
     * 
     * @param service   * Specifies details about service such as service description
     * and type.
     */
    public void setService(TrackServiceDescriptionDetail service) {
        this.service = service;
    }


    /**
     * Gets the packageWeight value for this TrackDetail.
     * 
     * @return packageWeight   * The weight of this package.
     */
    public Weight getPackageWeight() {
        return packageWeight;
    }


    /**
     * Sets the packageWeight value for this TrackDetail.
     * 
     * @param packageWeight   * The weight of this package.
     */
    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * Gets the packageDimensions value for this TrackDetail.
     * 
     * @return packageDimensions   * Physical dimensions of the package.
     */
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }


    /**
     * Sets the packageDimensions value for this TrackDetail.
     * 
     * @param packageDimensions   * Physical dimensions of the package.
     */
    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }


    /**
     * Gets the packageDimensionalWeight value for this TrackDetail.
     * 
     * @return packageDimensionalWeight   * The dimensional weight of the package.
     */
    public Weight getPackageDimensionalWeight() {
        return packageDimensionalWeight;
    }


    /**
     * Sets the packageDimensionalWeight value for this TrackDetail.
     * 
     * @param packageDimensionalWeight   * The dimensional weight of the package.
     */
    public void setPackageDimensionalWeight(Weight packageDimensionalWeight) {
        this.packageDimensionalWeight = packageDimensionalWeight;
    }


    /**
     * Gets the shipmentWeight value for this TrackDetail.
     * 
     * @return shipmentWeight   * The weight of the entire shipment.
     */
    public Weight getShipmentWeight() {
        return shipmentWeight;
    }


    /**
     * Sets the shipmentWeight value for this TrackDetail.
     * 
     * @param shipmentWeight   * The weight of the entire shipment.
     */
    public void setShipmentWeight(Weight shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }


    /**
     * Gets the packaging value for this TrackDetail.
     * 
     * @return packaging   * Retained for legacy compatibility only.
     */
    public String getPackaging() {
        return packaging;
    }


    /**
     * Sets the packaging value for this TrackDetail.
     * 
     * @param packaging   * Retained for legacy compatibility only.
     */
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }


    /**
     * Gets the packagingType value for this TrackDetail.
     * 
     * @return packagingType   * Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING).
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this TrackDetail.
     * 
     * @param packagingType   * Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING).
     */
    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the packageSequenceNumber value for this TrackDetail.
     * 
     * @return packageSequenceNumber   * The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4.
     */
    public org.apache.axis.types.NonNegativeInteger getPackageSequenceNumber() {
        return packageSequenceNumber;
    }


    /**
     * Sets the packageSequenceNumber value for this TrackDetail.
     * 
     * @param packageSequenceNumber   * The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4.
     */
    public void setPackageSequenceNumber(org.apache.axis.types.NonNegativeInteger packageSequenceNumber) {
        this.packageSequenceNumber = packageSequenceNumber;
    }


    /**
     * Gets the packageCount value for this TrackDetail.
     * 
     * @return packageCount   * The number of packages in this shipment.
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TrackDetail.
     * 
     * @param packageCount   * The number of packages in this shipment.
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the charges value for this TrackDetail.
     * 
     * @return charges   * Specifies the details about the SPOC details.
     */
    public TrackChargeDetail[] getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this TrackDetail.
     * 
     * @param charges   * Specifies the details about the SPOC details.
     */
    public void setCharges(TrackChargeDetail[] charges) {
        this.charges = charges;
    }

    public TrackChargeDetail getCharges(int i) {
        return this.charges[i];
    }

    public void setCharges(int i, TrackChargeDetail _value) {
        this.charges[i] = _value;
    }


    /**
     * Gets the nickName value for this TrackDetail.
     * 
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this TrackDetail.
     * 
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the notes value for this TrackDetail.
     * 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this TrackDetail.
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }


    /**
     * Gets the attributes value for this TrackDetail.
     * 
     * @return attributes
     */
    public TrackDetailAttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TrackDetail.
     * 
     * @param attributes
     */
    public void setAttributes(TrackDetailAttributeType[] attributes) {
        this.attributes = attributes;
    }

    public TrackDetailAttributeType getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, TrackDetailAttributeType _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the shipmentContents value for this TrackDetail.
     * 
     * @return shipmentContents
     */
    public ContentRecord[] getShipmentContents() {
        return shipmentContents;
    }


    /**
     * Sets the shipmentContents value for this TrackDetail.
     * 
     * @param shipmentContents
     */
    public void setShipmentContents(ContentRecord[] shipmentContents) {
        this.shipmentContents = shipmentContents;
    }

    public ContentRecord getShipmentContents(int i) {
        return this.shipmentContents[i];
    }

    public void setShipmentContents(int i, ContentRecord _value) {
        this.shipmentContents[i] = _value;
    }


    /**
     * Gets the packageContents value for this TrackDetail.
     * 
     * @return packageContents
     */
    public String[] getPackageContents() {
        return packageContents;
    }


    /**
     * Sets the packageContents value for this TrackDetail.
     * 
     * @param packageContents
     */
    public void setPackageContents(String[] packageContents) {
        this.packageContents = packageContents;
    }

    public String getPackageContents(int i) {
        return this.packageContents[i];
    }

    public void setPackageContents(int i, String _value) {
        this.packageContents[i] = _value;
    }


    /**
     * Gets the clearanceLocationCode value for this TrackDetail.
     * 
     * @return clearanceLocationCode
     */
    public String getClearanceLocationCode() {
        return clearanceLocationCode;
    }


    /**
     * Sets the clearanceLocationCode value for this TrackDetail.
     * 
     * @param clearanceLocationCode
     */
    public void setClearanceLocationCode(String clearanceLocationCode) {
        this.clearanceLocationCode = clearanceLocationCode;
    }


    /**
     * Gets the commodities value for this TrackDetail.
     * 
     * @return commodities
     */
    public Commodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this TrackDetail.
     * 
     * @param commodities
     */
    public void setCommodities(Commodity[] commodities) {
        this.commodities = commodities;
    }

    public Commodity getCommodities(int i) {
        return this.commodities[i];
    }

    public void setCommodities(int i, Commodity _value) {
        this.commodities[i] = _value;
    }


    /**
     * Gets the returnDetail value for this TrackDetail.
     * 
     * @return returnDetail
     */
    public TrackReturnDetail getReturnDetail() {
        return returnDetail;
    }


    /**
     * Sets the returnDetail value for this TrackDetail.
     * 
     * @param returnDetail
     */
    public void setReturnDetail(TrackReturnDetail returnDetail) {
        this.returnDetail = returnDetail;
    }


    /**
     * Gets the customsOptionDetails value for this TrackDetail.
     * 
     * @return customsOptionDetails   * Specifies the reason for return.
     */
    public CustomsOptionDetail[] getCustomsOptionDetails() {
        return customsOptionDetails;
    }


    /**
     * Sets the customsOptionDetails value for this TrackDetail.
     * 
     * @param customsOptionDetails   * Specifies the reason for return.
     */
    public void setCustomsOptionDetails(CustomsOptionDetail[] customsOptionDetails) {
        this.customsOptionDetails = customsOptionDetails;
    }

    public CustomsOptionDetail getCustomsOptionDetails(int i) {
        return this.customsOptionDetails[i];
    }

    public void setCustomsOptionDetails(int i, CustomsOptionDetail _value) {
        this.customsOptionDetails[i] = _value;
    }


    /**
     * Gets the advanceNotificationDetail value for this TrackDetail.
     * 
     * @return advanceNotificationDetail
     */
    public TrackAdvanceNotificationDetail getAdvanceNotificationDetail() {
        return advanceNotificationDetail;
    }


    /**
     * Sets the advanceNotificationDetail value for this TrackDetail.
     * 
     * @param advanceNotificationDetail
     */
    public void setAdvanceNotificationDetail(TrackAdvanceNotificationDetail advanceNotificationDetail) {
        this.advanceNotificationDetail = advanceNotificationDetail;
    }


    /**
     * Gets the specialHandlings value for this TrackDetail.
     * 
     * @return specialHandlings   * List of special handlings that applied to this package. (Returned
     * for CSR SL only.)
     */
    public TrackSpecialHandling[] getSpecialHandlings() {
        return specialHandlings;
    }


    /**
     * Sets the specialHandlings value for this TrackDetail.
     * 
     * @param specialHandlings   * List of special handlings that applied to this package. (Returned
     * for CSR SL only.)
     */
    public void setSpecialHandlings(TrackSpecialHandling[] specialHandlings) {
        this.specialHandlings = specialHandlings;
    }

    public TrackSpecialHandling getSpecialHandlings(int i) {
        return this.specialHandlings[i];
    }

    public void setSpecialHandlings(int i, TrackSpecialHandling _value) {
        this.specialHandlings[i] = _value;
    }


    /**
     * Gets the shipper value for this TrackDetail.
     * 
     * @return shipper   * (Returned for CSR SL only.)
     */
    public Contact getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this TrackDetail.
     * 
     * @param shipper   * (Returned for CSR SL only.)
     */
    public void setShipper(Contact shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the possessionStatus value for this TrackDetail.
     * 
     * @return possessionStatus   * Indicates last-known possession of package (Returned for CSR
     * SL only.)
     */
    public TrackPossessionStatusType getPossessionStatus() {
        return possessionStatus;
    }


    /**
     * Sets the possessionStatus value for this TrackDetail.
     * 
     * @param possessionStatus   * Indicates last-known possession of package (Returned for CSR
     * SL only.)
     */
    public void setPossessionStatus(TrackPossessionStatusType possessionStatus) {
        this.possessionStatus = possessionStatus;
    }


    /**
     * Gets the shipperAddress value for this TrackDetail.
     * 
     * @return shipperAddress   * The address information for the shipper.
     */
    public Address getShipperAddress() {
        return shipperAddress;
    }


    /**
     * Sets the shipperAddress value for this TrackDetail.
     * 
     * @param shipperAddress   * The address information for the shipper.
     */
    public void setShipperAddress(Address shipperAddress) {
        this.shipperAddress = shipperAddress;
    }


    /**
     * Gets the originLocationAddress value for this TrackDetail.
     * 
     * @return originLocationAddress   * The address of the FedEx pickup location/facility.
     */
    public Address getOriginLocationAddress() {
        return originLocationAddress;
    }


    /**
     * Sets the originLocationAddress value for this TrackDetail.
     * 
     * @param originLocationAddress   * The address of the FedEx pickup location/facility.
     */
    public void setOriginLocationAddress(Address originLocationAddress) {
        this.originLocationAddress = originLocationAddress;
    }


    /**
     * Gets the originStationId value for this TrackDetail.
     * 
     * @return originStationId   * (Returned for CSR SL only.)
     */
    public String getOriginStationId() {
        return originStationId;
    }


    /**
     * Sets the originStationId value for this TrackDetail.
     * 
     * @param originStationId   * (Returned for CSR SL only.)
     */
    public void setOriginStationId(String originStationId) {
        this.originStationId = originStationId;
    }


    /**
     * Gets the estimatedPickupTimestamp value for this TrackDetail.
     * 
     * @return estimatedPickupTimestamp   * Estimated package pickup time for shipments that haven't been
     * picked up.
     */
    public java.util.Calendar getEstimatedPickupTimestamp() {
        return estimatedPickupTimestamp;
    }


    /**
     * Sets the estimatedPickupTimestamp value for this TrackDetail.
     * 
     * @param estimatedPickupTimestamp   * Estimated package pickup time for shipments that haven't been
     * picked up.
     */
    public void setEstimatedPickupTimestamp(java.util.Calendar estimatedPickupTimestamp) {
        this.estimatedPickupTimestamp = estimatedPickupTimestamp;
    }


    /**
     * Gets the shipTimestamp value for this TrackDetail.
     * 
     * @return shipTimestamp   * Time package was shipped/tendered over to FedEx. Time portion
     * will be populated if available, otherwise will be set to midnight.
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this TrackDetail.
     * 
     * @param shipTimestamp   * Time package was shipped/tendered over to FedEx. Time portion
     * will be populated if available, otherwise will be set to midnight.
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the totalTransitDistance value for this TrackDetail.
     * 
     * @return totalTransitDistance   * The distance from the origin to the destination. Returned for
     * Custom Critical shipments.
     */
    public Distance getTotalTransitDistance() {
        return totalTransitDistance;
    }


    /**
     * Sets the totalTransitDistance value for this TrackDetail.
     * 
     * @param totalTransitDistance   * The distance from the origin to the destination. Returned for
     * Custom Critical shipments.
     */
    public void setTotalTransitDistance(Distance totalTransitDistance) {
        this.totalTransitDistance = totalTransitDistance;
    }


    /**
     * Gets the distanceToDestination value for this TrackDetail.
     * 
     * @return distanceToDestination   * Total distance package still has to travel. Returned for Custom
     * Critical shipments.
     */
    public Distance getDistanceToDestination() {
        return distanceToDestination;
    }


    /**
     * Sets the distanceToDestination value for this TrackDetail.
     * 
     * @param distanceToDestination   * Total distance package still has to travel. Returned for Custom
     * Critical shipments.
     */
    public void setDistanceToDestination(Distance distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }


    /**
     * Gets the specialInstructions value for this TrackDetail.
     * 
     * @return specialInstructions   * Provides additional details about package delivery.
     */
    public TrackSpecialInstruction[] getSpecialInstructions() {
        return specialInstructions;
    }


    /**
     * Sets the specialInstructions value for this TrackDetail.
     * 
     * @param specialInstructions   * Provides additional details about package delivery.
     */
    public void setSpecialInstructions(TrackSpecialInstruction[] specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public TrackSpecialInstruction getSpecialInstructions(int i) {
        return this.specialInstructions[i];
    }

    public void setSpecialInstructions(int i, TrackSpecialInstruction _value) {
        this.specialInstructions[i] = _value;
    }


    /**
     * Gets the recipient value for this TrackDetail.
     * 
     * @return recipient   * (Returned for CSR SL only.)
     */
    public Contact getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this TrackDetail.
     * 
     * @param recipient   * (Returned for CSR SL only.)
     */
    public void setRecipient(Contact recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the lastUpdatedDestinationAddress value for this TrackDetail.
     * 
     * @return lastUpdatedDestinationAddress   * This is the latest updated destination address.
     */
    public Address getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }


    /**
     * Sets the lastUpdatedDestinationAddress value for this TrackDetail.
     * 
     * @param lastUpdatedDestinationAddress   * This is the latest updated destination address.
     */
    public void setLastUpdatedDestinationAddress(Address lastUpdatedDestinationAddress) {
        this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
    }


    /**
     * Gets the destinationAddress value for this TrackDetail.
     * 
     * @return destinationAddress   * The address this package is to be (or has been) delivered.
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this TrackDetail.
     * 
     * @param destinationAddress   * The address this package is to be (or has been) delivered.
     */
    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the holdAtLocationContact value for this TrackDetail.
     * 
     * @return holdAtLocationContact
     */
    public Contact getHoldAtLocationContact() {
        return holdAtLocationContact;
    }


    /**
     * Sets the holdAtLocationContact value for this TrackDetail.
     * 
     * @param holdAtLocationContact
     */
    public void setHoldAtLocationContact(Contact holdAtLocationContact) {
        this.holdAtLocationContact = holdAtLocationContact;
    }


    /**
     * Gets the holdAtLocationAddress value for this TrackDetail.
     * 
     * @return holdAtLocationAddress   * The address this package is requested to placed on hold.
     */
    public Address getHoldAtLocationAddress() {
        return holdAtLocationAddress;
    }


    /**
     * Sets the holdAtLocationAddress value for this TrackDetail.
     * 
     * @param holdAtLocationAddress   * The address this package is requested to placed on hold.
     */
    public void setHoldAtLocationAddress(Address holdAtLocationAddress) {
        this.holdAtLocationAddress = holdAtLocationAddress;
    }


    /**
     * Gets the destinationStationId value for this TrackDetail.
     * 
     * @return destinationStationId   * (Returned for CSR SL only.)
     */
    public String getDestinationStationId() {
        return destinationStationId;
    }


    /**
     * Sets the destinationStationId value for this TrackDetail.
     * 
     * @param destinationStationId   * (Returned for CSR SL only.)
     */
    public void setDestinationStationId(String destinationStationId) {
        this.destinationStationId = destinationStationId;
    }


    /**
     * Gets the destinationLocationAddress value for this TrackDetail.
     * 
     * @return destinationLocationAddress   * The address of the FedEx delivery location/facility.
     */
    public Address getDestinationLocationAddress() {
        return destinationLocationAddress;
    }


    /**
     * Sets the destinationLocationAddress value for this TrackDetail.
     * 
     * @param destinationLocationAddress   * The address of the FedEx delivery location/facility.
     */
    public void setDestinationLocationAddress(Address destinationLocationAddress) {
        this.destinationLocationAddress = destinationLocationAddress;
    }


    /**
     * Gets the destinationLocationType value for this TrackDetail.
     * 
     * @return destinationLocationType
     */
    public FedExLocationType getDestinationLocationType() {
        return destinationLocationType;
    }


    /**
     * Sets the destinationLocationType value for this TrackDetail.
     * 
     * @param destinationLocationType
     */
    public void setDestinationLocationType(FedExLocationType destinationLocationType) {
        this.destinationLocationType = destinationLocationType;
    }


    /**
     * Gets the destinationLocationTimeZoneOffset value for this TrackDetail.
     * 
     * @return destinationLocationTimeZoneOffset
     */
    public String getDestinationLocationTimeZoneOffset() {
        return destinationLocationTimeZoneOffset;
    }


    /**
     * Sets the destinationLocationTimeZoneOffset value for this TrackDetail.
     * 
     * @param destinationLocationTimeZoneOffset
     */
    public void setDestinationLocationTimeZoneOffset(String destinationLocationTimeZoneOffset) {
        this.destinationLocationTimeZoneOffset = destinationLocationTimeZoneOffset;
    }


    /**
     * Gets the commitmentTimestamp value for this TrackDetail.
     * 
     * @return commitmentTimestamp   * Date and time the package should be (or should have been) delivered.
     * (Returned for CSR SL only.)
     */
    public java.util.Calendar getCommitmentTimestamp() {
        return commitmentTimestamp;
    }


    /**
     * Sets the commitmentTimestamp value for this TrackDetail.
     * 
     * @param commitmentTimestamp   * Date and time the package should be (or should have been) delivered.
     * (Returned for CSR SL only.)
     */
    public void setCommitmentTimestamp(java.util.Calendar commitmentTimestamp) {
        this.commitmentTimestamp = commitmentTimestamp;
    }


    /**
     * Gets the appointmentDeliveryTimestamp value for this TrackDetail.
     * 
     * @return appointmentDeliveryTimestamp   * Date and time the package would be delivered if the package
     * has appointment delivery as a special service.
     */
    public java.util.Calendar getAppointmentDeliveryTimestamp() {
        return appointmentDeliveryTimestamp;
    }


    /**
     * Sets the appointmentDeliveryTimestamp value for this TrackDetail.
     * 
     * @param appointmentDeliveryTimestamp   * Date and time the package would be delivered if the package
     * has appointment delivery as a special service.
     */
    public void setAppointmentDeliveryTimestamp(java.util.Calendar appointmentDeliveryTimestamp) {
        this.appointmentDeliveryTimestamp = appointmentDeliveryTimestamp;
    }


    /**
     * Gets the estimatedDeliveryTimestamp value for this TrackDetail.
     * 
     * @return estimatedDeliveryTimestamp   * Projected package delivery time based on ship time stamp, service
     * and destination. Not populated if delivery has already occurred.
     */
    public java.util.Calendar getEstimatedDeliveryTimestamp() {
        return estimatedDeliveryTimestamp;
    }


    /**
     * Sets the estimatedDeliveryTimestamp value for this TrackDetail.
     * 
     * @param estimatedDeliveryTimestamp   * Projected package delivery time based on ship time stamp, service
     * and destination. Not populated if delivery has already occurred.
     */
    public void setEstimatedDeliveryTimestamp(java.util.Calendar estimatedDeliveryTimestamp) {
        this.estimatedDeliveryTimestamp = estimatedDeliveryTimestamp;
    }


    /**
     * Gets the actualDeliveryTimestamp value for this TrackDetail.
     * 
     * @return actualDeliveryTimestamp   * The time the package was actually delivered.
     */
    public java.util.Calendar getActualDeliveryTimestamp() {
        return actualDeliveryTimestamp;
    }


    /**
     * Sets the actualDeliveryTimestamp value for this TrackDetail.
     * 
     * @param actualDeliveryTimestamp   * The time the package was actually delivered.
     */
    public void setActualDeliveryTimestamp(java.util.Calendar actualDeliveryTimestamp) {
        this.actualDeliveryTimestamp = actualDeliveryTimestamp;
    }


    /**
     * Gets the actualDeliveryAddress value for this TrackDetail.
     * 
     * @return actualDeliveryAddress   * Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.)
     */
    public Address getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }


    /**
     * Sets the actualDeliveryAddress value for this TrackDetail.
     * 
     * @param actualDeliveryAddress   * Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.)
     */
    public void setActualDeliveryAddress(Address actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }


    /**
     * Gets the officeOrderDeliveryMethod value for this TrackDetail.
     * 
     * @return officeOrderDeliveryMethod   * Identifies the method of office order delivery.
     */
    public OfficeOrderDeliveryMethodType getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }


    /**
     * Sets the officeOrderDeliveryMethod value for this TrackDetail.
     * 
     * @param officeOrderDeliveryMethod   * Identifies the method of office order delivery.
     */
    public void setOfficeOrderDeliveryMethod(OfficeOrderDeliveryMethodType officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }


    /**
     * Gets the deliveryLocationType value for this TrackDetail.
     * 
     * @return deliveryLocationType   * Strict text indicating the delivery location at the delivered
     * to address.
     */
    public TrackDeliveryLocationType getDeliveryLocationType() {
        return deliveryLocationType;
    }


    /**
     * Sets the deliveryLocationType value for this TrackDetail.
     * 
     * @param deliveryLocationType   * Strict text indicating the delivery location at the delivered
     * to address.
     */
    public void setDeliveryLocationType(TrackDeliveryLocationType deliveryLocationType) {
        this.deliveryLocationType = deliveryLocationType;
    }


    /**
     * Gets the deliveryLocationDescription value for this TrackDetail.
     * 
     * @return deliveryLocationDescription   * User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text.
     */
    public String getDeliveryLocationDescription() {
        return deliveryLocationDescription;
    }


    /**
     * Sets the deliveryLocationDescription value for this TrackDetail.
     * 
     * @param deliveryLocationDescription   * User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text.
     */
    public void setDeliveryLocationDescription(String deliveryLocationDescription) {
        this.deliveryLocationDescription = deliveryLocationDescription;
    }


    /**
     * Gets the deliveryAttempts value for this TrackDetail.
     * 
     * @return deliveryAttempts   * Specifies the number of delivery attempts made to deliver the
     * shipment.
     */
    public org.apache.axis.types.NonNegativeInteger getDeliveryAttempts() {
        return deliveryAttempts;
    }


    /**
     * Sets the deliveryAttempts value for this TrackDetail.
     * 
     * @param deliveryAttempts   * Specifies the number of delivery attempts made to deliver the
     * shipment.
     */
    public void setDeliveryAttempts(org.apache.axis.types.NonNegativeInteger deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }


    /**
     * Gets the deliverySignatureName value for this TrackDetail.
     * 
     * @return deliverySignatureName   * This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file".
     */
    public String getDeliverySignatureName() {
        return deliverySignatureName;
    }


    /**
     * Sets the deliverySignatureName value for this TrackDetail.
     * 
     * @param deliverySignatureName   * This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file".
     */
    public void setDeliverySignatureName(String deliverySignatureName) {
        this.deliverySignatureName = deliverySignatureName;
    }


    /**
     * Gets the pieceCountVerificationDetails value for this TrackDetail.
     * 
     * @return pieceCountVerificationDetails   * Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin.
     */
    public PieceCountVerificationDetail[] getPieceCountVerificationDetails() {
        return pieceCountVerificationDetails;
    }


    /**
     * Sets the pieceCountVerificationDetails value for this TrackDetail.
     * 
     * @param pieceCountVerificationDetails   * Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin.
     */
    public void setPieceCountVerificationDetails(PieceCountVerificationDetail[] pieceCountVerificationDetails) {
        this.pieceCountVerificationDetails = pieceCountVerificationDetails;
    }

    public PieceCountVerificationDetail getPieceCountVerificationDetails(int i) {
        return this.pieceCountVerificationDetails[i];
    }

    public void setPieceCountVerificationDetails(int i, PieceCountVerificationDetail _value) {
        this.pieceCountVerificationDetails[i] = _value;
    }


    /**
     * Gets the totalUniqueAddressCountInConsolidation value for this TrackDetail.
     * 
     * @return totalUniqueAddressCountInConsolidation   * Specifies the total number of unique addresses on the CRNs
     * in a consolidation.
     */
    public org.apache.axis.types.NonNegativeInteger getTotalUniqueAddressCountInConsolidation() {
        return totalUniqueAddressCountInConsolidation;
    }


    /**
     * Sets the totalUniqueAddressCountInConsolidation value for this TrackDetail.
     * 
     * @param totalUniqueAddressCountInConsolidation   * Specifies the total number of unique addresses on the CRNs
     * in a consolidation.
     */
    public void setTotalUniqueAddressCountInConsolidation(org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation) {
        this.totalUniqueAddressCountInConsolidation = totalUniqueAddressCountInConsolidation;
    }


    /**
     * Gets the availableImages value for this TrackDetail.
     * 
     * @return availableImages
     */
    public AvailableImageType[] getAvailableImages() {
        return availableImages;
    }


    /**
     * Sets the availableImages value for this TrackDetail.
     * 
     * @param availableImages
     */
    public void setAvailableImages(AvailableImageType[] availableImages) {
        this.availableImages = availableImages;
    }

    public AvailableImageType getAvailableImages(int i) {
        return this.availableImages[i];
    }

    public void setAvailableImages(int i, AvailableImageType _value) {
        this.availableImages[i] = _value;
    }


    /**
     * Gets the signature value for this TrackDetail.
     * 
     * @return signature
     */
    public SignatureImageDetail getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TrackDetail.
     * 
     * @param signature
     */
    public void setSignature(SignatureImageDetail signature) {
        this.signature = signature;
    }


    /**
     * Gets the notificationEventsAvailable value for this TrackDetail.
     * 
     * @return notificationEventsAvailable   * The types of email notifications that are available for the
     * package.
     */
    public EMailNotificationEventType[] getNotificationEventsAvailable() {
        return notificationEventsAvailable;
    }


    /**
     * Sets the notificationEventsAvailable value for this TrackDetail.
     * 
     * @param notificationEventsAvailable   * The types of email notifications that are available for the
     * package.
     */
    public void setNotificationEventsAvailable(EMailNotificationEventType[] notificationEventsAvailable) {
        this.notificationEventsAvailable = notificationEventsAvailable;
    }

    public EMailNotificationEventType getNotificationEventsAvailable(int i) {
        return this.notificationEventsAvailable[i];
    }

    public void setNotificationEventsAvailable(int i, EMailNotificationEventType _value) {
        this.notificationEventsAvailable[i] = _value;
    }


    /**
     * Gets the splitShipmentParts value for this TrackDetail.
     * 
     * @return splitShipmentParts   * Returned for cargo shipments only when they are currently split
     * across vehicles.
     */
    public TrackSplitShipmentPart[] getSplitShipmentParts() {
        return splitShipmentParts;
    }


    /**
     * Sets the splitShipmentParts value for this TrackDetail.
     * 
     * @param splitShipmentParts   * Returned for cargo shipments only when they are currently split
     * across vehicles.
     */
    public void setSplitShipmentParts(TrackSplitShipmentPart[] splitShipmentParts) {
        this.splitShipmentParts = splitShipmentParts;
    }

    public TrackSplitShipmentPart getSplitShipmentParts(int i) {
        return this.splitShipmentParts[i];
    }

    public void setSplitShipmentParts(int i, TrackSplitShipmentPart _value) {
        this.splitShipmentParts[i] = _value;
    }


    /**
     * Gets the deliveryOptionEligibilityDetails value for this TrackDetail.
     * 
     * @return deliveryOptionEligibilityDetails   * Specifies the details about the eligibility for different delivery
     * options.
     */
    public DeliveryOptionEligibilityDetail[] getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }


    /**
     * Sets the deliveryOptionEligibilityDetails value for this TrackDetail.
     * 
     * @param deliveryOptionEligibilityDetails   * Specifies the details about the eligibility for different delivery
     * options.
     */
    public void setDeliveryOptionEligibilityDetails(DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }

    public DeliveryOptionEligibilityDetail getDeliveryOptionEligibilityDetails(int i) {
        return this.deliveryOptionEligibilityDetails[i];
    }

    public void setDeliveryOptionEligibilityDetails(int i, DeliveryOptionEligibilityDetail _value) {
        this.deliveryOptionEligibilityDetails[i] = _value;
    }


    /**
     * Gets the events value for this TrackDetail.
     * 
     * @return events   * Event information for a tracking number.
     */
    public TrackEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this TrackDetail.
     * 
     * @param events   * Event information for a tracking number.
     */
    public void setEvents(TrackEvent[] events) {
        this.events = events;
    }

    public TrackEvent getEvents(int i) {
        return this.events[i];
    }

    public void setEvents(int i, TrackEvent _value) {
        this.events[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TrackDetail)) return false;
        TrackDetail other = (TrackDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.barcode==null && other.getBarcode()==null) || 
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.trackingNumberUniqueIdentifier==null && other.getTrackingNumberUniqueIdentifier()==null) || 
             (this.trackingNumberUniqueIdentifier!=null &&
              this.trackingNumberUniqueIdentifier.equals(other.getTrackingNumberUniqueIdentifier()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.customerExceptionRequests==null && other.getCustomerExceptionRequests()==null) || 
             (this.customerExceptionRequests!=null &&
              java.util.Arrays.equals(this.customerExceptionRequests, other.getCustomerExceptionRequests()))) &&
            ((this.reconciliation==null && other.getReconciliation()==null) || 
             (this.reconciliation!=null &&
              this.reconciliation.equals(other.getReconciliation()))) &&
            ((this.serviceCommitMessage==null && other.getServiceCommitMessage()==null) || 
             (this.serviceCommitMessage!=null &&
              this.serviceCommitMessage.equals(other.getServiceCommitMessage()))) &&
            ((this.destinationServiceArea==null && other.getDestinationServiceArea()==null) || 
             (this.destinationServiceArea!=null &&
              this.destinationServiceArea.equals(other.getDestinationServiceArea()))) &&
            ((this.destinationServiceAreaDescription==null && other.getDestinationServiceAreaDescription()==null) || 
             (this.destinationServiceAreaDescription!=null &&
              this.destinationServiceAreaDescription.equals(other.getDestinationServiceAreaDescription()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.operatingCompany==null && other.getOperatingCompany()==null) || 
             (this.operatingCompany!=null &&
              this.operatingCompany.equals(other.getOperatingCompany()))) &&
            ((this.operatingCompanyOrCarrierDescription==null && other.getOperatingCompanyOrCarrierDescription()==null) || 
             (this.operatingCompanyOrCarrierDescription!=null &&
              this.operatingCompanyOrCarrierDescription.equals(other.getOperatingCompanyOrCarrierDescription()))) &&
            ((this.cartageAgentCompanyName==null && other.getCartageAgentCompanyName()==null) || 
             (this.cartageAgentCompanyName!=null &&
              this.cartageAgentCompanyName.equals(other.getCartageAgentCompanyName()))) &&
            ((this.productionLocationContactAndAddress==null && other.getProductionLocationContactAndAddress()==null) || 
             (this.productionLocationContactAndAddress!=null &&
              this.productionLocationContactAndAddress.equals(other.getProductionLocationContactAndAddress()))) &&
            ((this.otherIdentifiers==null && other.getOtherIdentifiers()==null) || 
             (this.otherIdentifiers!=null &&
              java.util.Arrays.equals(this.otherIdentifiers, other.getOtherIdentifiers()))) &&
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.packageWeight==null && other.getPackageWeight()==null) || 
             (this.packageWeight!=null &&
              this.packageWeight.equals(other.getPackageWeight()))) &&
            ((this.packageDimensions==null && other.getPackageDimensions()==null) || 
             (this.packageDimensions!=null &&
              this.packageDimensions.equals(other.getPackageDimensions()))) &&
            ((this.packageDimensionalWeight==null && other.getPackageDimensionalWeight()==null) || 
             (this.packageDimensionalWeight!=null &&
              this.packageDimensionalWeight.equals(other.getPackageDimensionalWeight()))) &&
            ((this.shipmentWeight==null && other.getShipmentWeight()==null) || 
             (this.shipmentWeight!=null &&
              this.shipmentWeight.equals(other.getShipmentWeight()))) &&
            ((this.packaging==null && other.getPackaging()==null) || 
             (this.packaging!=null &&
              this.packaging.equals(other.getPackaging()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.packageSequenceNumber==null && other.getPackageSequenceNumber()==null) || 
             (this.packageSequenceNumber!=null &&
              this.packageSequenceNumber.equals(other.getPackageSequenceNumber()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.charges==null && other.getCharges()==null) || 
             (this.charges!=null &&
              java.util.Arrays.equals(this.charges, other.getCharges()))) &&
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.shipmentContents==null && other.getShipmentContents()==null) || 
             (this.shipmentContents!=null &&
              java.util.Arrays.equals(this.shipmentContents, other.getShipmentContents()))) &&
            ((this.packageContents==null && other.getPackageContents()==null) || 
             (this.packageContents!=null &&
              java.util.Arrays.equals(this.packageContents, other.getPackageContents()))) &&
            ((this.clearanceLocationCode==null && other.getClearanceLocationCode()==null) || 
             (this.clearanceLocationCode!=null &&
              this.clearanceLocationCode.equals(other.getClearanceLocationCode()))) &&
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.returnDetail==null && other.getReturnDetail()==null) || 
             (this.returnDetail!=null &&
              this.returnDetail.equals(other.getReturnDetail()))) &&
            ((this.customsOptionDetails==null && other.getCustomsOptionDetails()==null) || 
             (this.customsOptionDetails!=null &&
              java.util.Arrays.equals(this.customsOptionDetails, other.getCustomsOptionDetails()))) &&
            ((this.advanceNotificationDetail==null && other.getAdvanceNotificationDetail()==null) || 
             (this.advanceNotificationDetail!=null &&
              this.advanceNotificationDetail.equals(other.getAdvanceNotificationDetail()))) &&
            ((this.specialHandlings==null && other.getSpecialHandlings()==null) || 
             (this.specialHandlings!=null &&
              java.util.Arrays.equals(this.specialHandlings, other.getSpecialHandlings()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.possessionStatus==null && other.getPossessionStatus()==null) || 
             (this.possessionStatus!=null &&
              this.possessionStatus.equals(other.getPossessionStatus()))) &&
            ((this.shipperAddress==null && other.getShipperAddress()==null) || 
             (this.shipperAddress!=null &&
              this.shipperAddress.equals(other.getShipperAddress()))) &&
            ((this.originLocationAddress==null && other.getOriginLocationAddress()==null) || 
             (this.originLocationAddress!=null &&
              this.originLocationAddress.equals(other.getOriginLocationAddress()))) &&
            ((this.originStationId==null && other.getOriginStationId()==null) || 
             (this.originStationId!=null &&
              this.originStationId.equals(other.getOriginStationId()))) &&
            ((this.estimatedPickupTimestamp==null && other.getEstimatedPickupTimestamp()==null) || 
             (this.estimatedPickupTimestamp!=null &&
              this.estimatedPickupTimestamp.equals(other.getEstimatedPickupTimestamp()))) &&
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) || 
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.totalTransitDistance==null && other.getTotalTransitDistance()==null) || 
             (this.totalTransitDistance!=null &&
              this.totalTransitDistance.equals(other.getTotalTransitDistance()))) &&
            ((this.distanceToDestination==null && other.getDistanceToDestination()==null) || 
             (this.distanceToDestination!=null &&
              this.distanceToDestination.equals(other.getDistanceToDestination()))) &&
            ((this.specialInstructions==null && other.getSpecialInstructions()==null) || 
             (this.specialInstructions!=null &&
              java.util.Arrays.equals(this.specialInstructions, other.getSpecialInstructions()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.lastUpdatedDestinationAddress==null && other.getLastUpdatedDestinationAddress()==null) || 
             (this.lastUpdatedDestinationAddress!=null &&
              this.lastUpdatedDestinationAddress.equals(other.getLastUpdatedDestinationAddress()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.holdAtLocationContact==null && other.getHoldAtLocationContact()==null) || 
             (this.holdAtLocationContact!=null &&
              this.holdAtLocationContact.equals(other.getHoldAtLocationContact()))) &&
            ((this.holdAtLocationAddress==null && other.getHoldAtLocationAddress()==null) || 
             (this.holdAtLocationAddress!=null &&
              this.holdAtLocationAddress.equals(other.getHoldAtLocationAddress()))) &&
            ((this.destinationStationId==null && other.getDestinationStationId()==null) || 
             (this.destinationStationId!=null &&
              this.destinationStationId.equals(other.getDestinationStationId()))) &&
            ((this.destinationLocationAddress==null && other.getDestinationLocationAddress()==null) || 
             (this.destinationLocationAddress!=null &&
              this.destinationLocationAddress.equals(other.getDestinationLocationAddress()))) &&
            ((this.destinationLocationType==null && other.getDestinationLocationType()==null) || 
             (this.destinationLocationType!=null &&
              this.destinationLocationType.equals(other.getDestinationLocationType()))) &&
            ((this.destinationLocationTimeZoneOffset==null && other.getDestinationLocationTimeZoneOffset()==null) || 
             (this.destinationLocationTimeZoneOffset!=null &&
              this.destinationLocationTimeZoneOffset.equals(other.getDestinationLocationTimeZoneOffset()))) &&
            ((this.commitmentTimestamp==null && other.getCommitmentTimestamp()==null) || 
             (this.commitmentTimestamp!=null &&
              this.commitmentTimestamp.equals(other.getCommitmentTimestamp()))) &&
            ((this.appointmentDeliveryTimestamp==null && other.getAppointmentDeliveryTimestamp()==null) || 
             (this.appointmentDeliveryTimestamp!=null &&
              this.appointmentDeliveryTimestamp.equals(other.getAppointmentDeliveryTimestamp()))) &&
            ((this.estimatedDeliveryTimestamp==null && other.getEstimatedDeliveryTimestamp()==null) || 
             (this.estimatedDeliveryTimestamp!=null &&
              this.estimatedDeliveryTimestamp.equals(other.getEstimatedDeliveryTimestamp()))) &&
            ((this.actualDeliveryTimestamp==null && other.getActualDeliveryTimestamp()==null) || 
             (this.actualDeliveryTimestamp!=null &&
              this.actualDeliveryTimestamp.equals(other.getActualDeliveryTimestamp()))) &&
            ((this.actualDeliveryAddress==null && other.getActualDeliveryAddress()==null) || 
             (this.actualDeliveryAddress!=null &&
              this.actualDeliveryAddress.equals(other.getActualDeliveryAddress()))) &&
            ((this.officeOrderDeliveryMethod==null && other.getOfficeOrderDeliveryMethod()==null) || 
             (this.officeOrderDeliveryMethod!=null &&
              this.officeOrderDeliveryMethod.equals(other.getOfficeOrderDeliveryMethod()))) &&
            ((this.deliveryLocationType==null && other.getDeliveryLocationType()==null) || 
             (this.deliveryLocationType!=null &&
              this.deliveryLocationType.equals(other.getDeliveryLocationType()))) &&
            ((this.deliveryLocationDescription==null && other.getDeliveryLocationDescription()==null) || 
             (this.deliveryLocationDescription!=null &&
              this.deliveryLocationDescription.equals(other.getDeliveryLocationDescription()))) &&
            ((this.deliveryAttempts==null && other.getDeliveryAttempts()==null) || 
             (this.deliveryAttempts!=null &&
              this.deliveryAttempts.equals(other.getDeliveryAttempts()))) &&
            ((this.deliverySignatureName==null && other.getDeliverySignatureName()==null) || 
             (this.deliverySignatureName!=null &&
              this.deliverySignatureName.equals(other.getDeliverySignatureName()))) &&
            ((this.pieceCountVerificationDetails==null && other.getPieceCountVerificationDetails()==null) || 
             (this.pieceCountVerificationDetails!=null &&
              java.util.Arrays.equals(this.pieceCountVerificationDetails, other.getPieceCountVerificationDetails()))) &&
            ((this.totalUniqueAddressCountInConsolidation==null && other.getTotalUniqueAddressCountInConsolidation()==null) || 
             (this.totalUniqueAddressCountInConsolidation!=null &&
              this.totalUniqueAddressCountInConsolidation.equals(other.getTotalUniqueAddressCountInConsolidation()))) &&
            ((this.availableImages==null && other.getAvailableImages()==null) || 
             (this.availableImages!=null &&
              java.util.Arrays.equals(this.availableImages, other.getAvailableImages()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.notificationEventsAvailable==null && other.getNotificationEventsAvailable()==null) || 
             (this.notificationEventsAvailable!=null &&
              java.util.Arrays.equals(this.notificationEventsAvailable, other.getNotificationEventsAvailable()))) &&
            ((this.splitShipmentParts==null && other.getSplitShipmentParts()==null) || 
             (this.splitShipmentParts!=null &&
              java.util.Arrays.equals(this.splitShipmentParts, other.getSplitShipmentParts()))) &&
            ((this.deliveryOptionEligibilityDetails==null && other.getDeliveryOptionEligibilityDetails()==null) || 
             (this.deliveryOptionEligibilityDetails!=null &&
              java.util.Arrays.equals(this.deliveryOptionEligibilityDetails, other.getDeliveryOptionEligibilityDetails()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getTrackingNumberUniqueIdentifier() != null) {
            _hashCode += getTrackingNumberUniqueIdentifier().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getCustomerExceptionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerExceptionRequests());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerExceptionRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReconciliation() != null) {
            _hashCode += getReconciliation().hashCode();
        }
        if (getServiceCommitMessage() != null) {
            _hashCode += getServiceCommitMessage().hashCode();
        }
        if (getDestinationServiceArea() != null) {
            _hashCode += getDestinationServiceArea().hashCode();
        }
        if (getDestinationServiceAreaDescription() != null) {
            _hashCode += getDestinationServiceAreaDescription().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getOperatingCompany() != null) {
            _hashCode += getOperatingCompany().hashCode();
        }
        if (getOperatingCompanyOrCarrierDescription() != null) {
            _hashCode += getOperatingCompanyOrCarrierDescription().hashCode();
        }
        if (getCartageAgentCompanyName() != null) {
            _hashCode += getCartageAgentCompanyName().hashCode();
        }
        if (getProductionLocationContactAndAddress() != null) {
            _hashCode += getProductionLocationContactAndAddress().hashCode();
        }
        if (getOtherIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherIdentifiers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOtherIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getPackageWeight() != null) {
            _hashCode += getPackageWeight().hashCode();
        }
        if (getPackageDimensions() != null) {
            _hashCode += getPackageDimensions().hashCode();
        }
        if (getPackageDimensionalWeight() != null) {
            _hashCode += getPackageDimensionalWeight().hashCode();
        }
        if (getShipmentWeight() != null) {
            _hashCode += getShipmentWeight().hashCode();
        }
        if (getPackaging() != null) {
            _hashCode += getPackaging().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getPackageSequenceNumber() != null) {
            _hashCode += getPackageSequenceNumber().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentContents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShipmentContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageContents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPackageContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClearanceLocationCode() != null) {
            _hashCode += getClearanceLocationCode().hashCode();
        }
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnDetail() != null) {
            _hashCode += getReturnDetail().hashCode();
        }
        if (getCustomsOptionDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomsOptionDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomsOptionDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvanceNotificationDetail() != null) {
            _hashCode += getAdvanceNotificationDetail().hashCode();
        }
        if (getSpecialHandlings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialHandlings());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialHandlings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getPossessionStatus() != null) {
            _hashCode += getPossessionStatus().hashCode();
        }
        if (getShipperAddress() != null) {
            _hashCode += getShipperAddress().hashCode();
        }
        if (getOriginLocationAddress() != null) {
            _hashCode += getOriginLocationAddress().hashCode();
        }
        if (getOriginStationId() != null) {
            _hashCode += getOriginStationId().hashCode();
        }
        if (getEstimatedPickupTimestamp() != null) {
            _hashCode += getEstimatedPickupTimestamp().hashCode();
        }
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getTotalTransitDistance() != null) {
            _hashCode += getTotalTransitDistance().hashCode();
        }
        if (getDistanceToDestination() != null) {
            _hashCode += getDistanceToDestination().hashCode();
        }
        if (getSpecialInstructions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialInstructions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialInstructions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getLastUpdatedDestinationAddress() != null) {
            _hashCode += getLastUpdatedDestinationAddress().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getHoldAtLocationContact() != null) {
            _hashCode += getHoldAtLocationContact().hashCode();
        }
        if (getHoldAtLocationAddress() != null) {
            _hashCode += getHoldAtLocationAddress().hashCode();
        }
        if (getDestinationStationId() != null) {
            _hashCode += getDestinationStationId().hashCode();
        }
        if (getDestinationLocationAddress() != null) {
            _hashCode += getDestinationLocationAddress().hashCode();
        }
        if (getDestinationLocationType() != null) {
            _hashCode += getDestinationLocationType().hashCode();
        }
        if (getDestinationLocationTimeZoneOffset() != null) {
            _hashCode += getDestinationLocationTimeZoneOffset().hashCode();
        }
        if (getCommitmentTimestamp() != null) {
            _hashCode += getCommitmentTimestamp().hashCode();
        }
        if (getAppointmentDeliveryTimestamp() != null) {
            _hashCode += getAppointmentDeliveryTimestamp().hashCode();
        }
        if (getEstimatedDeliveryTimestamp() != null) {
            _hashCode += getEstimatedDeliveryTimestamp().hashCode();
        }
        if (getActualDeliveryTimestamp() != null) {
            _hashCode += getActualDeliveryTimestamp().hashCode();
        }
        if (getActualDeliveryAddress() != null) {
            _hashCode += getActualDeliveryAddress().hashCode();
        }
        if (getOfficeOrderDeliveryMethod() != null) {
            _hashCode += getOfficeOrderDeliveryMethod().hashCode();
        }
        if (getDeliveryLocationType() != null) {
            _hashCode += getDeliveryLocationType().hashCode();
        }
        if (getDeliveryLocationDescription() != null) {
            _hashCode += getDeliveryLocationDescription().hashCode();
        }
        if (getDeliveryAttempts() != null) {
            _hashCode += getDeliveryAttempts().hashCode();
        }
        if (getDeliverySignatureName() != null) {
            _hashCode += getDeliverySignatureName().hashCode();
        }
        if (getPieceCountVerificationDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPieceCountVerificationDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPieceCountVerificationDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalUniqueAddressCountInConsolidation() != null) {
            _hashCode += getTotalUniqueAddressCountInConsolidation().hashCode();
        }
        if (getAvailableImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableImages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAvailableImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getNotificationEventsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEventsAvailable());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationEventsAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSplitShipmentParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSplitShipmentParts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSplitShipmentParts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryOptionEligibilityDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryOptionEligibilityDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeliveryOptionEligibilityDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(TrackDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Barcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "StringBarcode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumberUniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackingNumberUniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackStatusDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerExceptionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomerExceptionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomerExceptionRequestDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Reconciliation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReconciliation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCommitMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ServiceCommitMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceAreaDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationServiceAreaDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OperatingCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OperatingCompanyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingCompanyOrCarrierDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OperatingCompanyOrCarrierDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartageAgentCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CartageAgentCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productionLocationContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ProductionLocationContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OtherIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackOtherIdentifierDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "FormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackServiceDescriptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDimensionalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageDimensionalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ShipmentWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDetailAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ShipmentContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ContentRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PackageContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ClearanceLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Commodity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ReturnDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackReturnDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsOptionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomsOptionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CustomsOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AdvanceNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackAdvanceNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialHandlings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SpecialHandlings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSpecialHandling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possessionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PossessionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackPossessionStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ShipperAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OriginLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originStationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OriginStationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedPickupTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EstimatedPickupTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTransitDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TotalTransitDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Distance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceToDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DistanceToDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Distance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SpecialInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSpecialInstruction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedDestinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "LastUpdatedDestinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "HoldAtLocationContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "HoldAtLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationStationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationStationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "FedExLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationTimeZoneOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DestinationLocationTimeZoneOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "CommitmentTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointmentDeliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AppointmentDeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDeliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EstimatedDeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ActualDeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ActualDeliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeOrderDeliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OfficeOrderDeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "OfficeOrderDeliveryMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackDeliveryLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLocationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryLocationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySignatureName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliverySignatureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCountVerificationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PieceCountVerificationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "PieceCountVerificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUniqueAddressCountInConsolidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TotalUniqueAddressCountInConsolidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableImages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AvailableImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AvailableImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureImageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEventsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "NotificationEventsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "EMailNotificationEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitShipmentParts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SplitShipmentParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackSplitShipmentPart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionEligibilityDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryOptionEligibilityDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "DeliveryOptionEligibilityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TrackEvent"));
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

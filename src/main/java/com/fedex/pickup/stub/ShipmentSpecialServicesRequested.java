/**
 * ShipmentSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * These special services are available at the shipment level for
 * some or all service types. If the shipper is requesting a special
 * service which requires additional data (such as the COD amount), the
 * shipment special service type must be present in the specialServiceTypes
 * collection, and the supporting detail must be provided in the appropriate
 * sub-object below.
 */
public class ShipmentSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction). */
    private ShipmentSpecialServiceType[] specialServiceTypes;

    private CodDetail codDetail;

    private com.fedex.pickup.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;

    private HoldAtLocationDetail holdAtLocationDetail;

    private com.fedex.pickup.stub.EMailNotificationDetail EMailNotificationDetail;

    private ReturnShipmentDetail returnShipmentDetail;

    /* This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type. */
    private PendingShipmentDetail pendingShipmentDetail;

    private com.fedex.pickup.stub.InternationalControlledExportDetail internationalControlledExportDetail;

    private com.fedex.pickup.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;

    private ShipmentDryIceDetail shipmentDryIceDetail;

    private HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;

    private FlatbedTrailerDetail flatbedTrailerDetail;

    private FreightGuaranteeDetail freightGuaranteeDetail;

    /* Electronic Trade document references. */
    private EtdDetail etdDetail;

    /* Specification for labor to be performed with the shipment. */
    private ExtraLaborDetail extraLaborDetail;

    /* Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment. */
    private PalletShrinkwrapDetail palletShrinkwrapDetail;

    /* Specifications for pallets to be provided on Freight shipment. */
    private PalletsProvidedDetail palletsProvidedDetail;

    /* Specifications for pup/set or vehicle delayed for loading or
     * unloading. */
    private DetentionDetail detentionDetail;

    /* Specification for marking or tagging of pieces in shipment. */
    private MarkingOrTaggingDetail markingOrTaggingDetail;

    /* Specification for services performed during non-business hours
     * and/or days. */
    private NonBusinessTimeDetail nonBusinessTimeDetail;

    /* Specification for assembly performed on shipment. */
    private ShipmentAssemblyDetail shipmentAssemblyDetail;

    /* Specification for sorting and/or segregating performed on shipment. */
    private SortAndSegregateDetail sortAndSegregateDetail;

    /* Specification for special equipment used in loading/unloading
     * shipment. */
    private SpecialEquipmentDetail specialEquipmentDetail;

    /* Specification for storage provided for shipment. */
    private StorageDetail storageDetail;

    /* Specification for weighing services provided for shipment. */
    private WeighingDetail weighingDetail;

    /* Specification for date or range of dates on which delivery
     * is to be attempted. */
    private CustomDeliveryWindowDetail customDeliveryWindowDetail;

    public ShipmentSpecialServicesRequested() {
    }

    public ShipmentSpecialServicesRequested(
           ShipmentSpecialServiceType[] specialServiceTypes,
           CodDetail codDetail,
           com.fedex.pickup.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail,
           HoldAtLocationDetail holdAtLocationDetail,
           com.fedex.pickup.stub.EMailNotificationDetail EMailNotificationDetail,
           ReturnShipmentDetail returnShipmentDetail,
           PendingShipmentDetail pendingShipmentDetail,
           com.fedex.pickup.stub.InternationalControlledExportDetail internationalControlledExportDetail,
           com.fedex.pickup.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail,
           ShipmentDryIceDetail shipmentDryIceDetail,
           HomeDeliveryPremiumDetail homeDeliveryPremiumDetail,
           FlatbedTrailerDetail flatbedTrailerDetail,
           FreightGuaranteeDetail freightGuaranteeDetail,
           EtdDetail etdDetail,
           ExtraLaborDetail extraLaborDetail,
           PalletShrinkwrapDetail palletShrinkwrapDetail,
           PalletsProvidedDetail palletsProvidedDetail,
           DetentionDetail detentionDetail,
           MarkingOrTaggingDetail markingOrTaggingDetail,
           NonBusinessTimeDetail nonBusinessTimeDetail,
           ShipmentAssemblyDetail shipmentAssemblyDetail,
           SortAndSegregateDetail sortAndSegregateDetail,
           SpecialEquipmentDetail specialEquipmentDetail,
           StorageDetail storageDetail,
           WeighingDetail weighingDetail,
           CustomDeliveryWindowDetail customDeliveryWindowDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
           this.holdAtLocationDetail = holdAtLocationDetail;
           this.EMailNotificationDetail = EMailNotificationDetail;
           this.returnShipmentDetail = returnShipmentDetail;
           this.pendingShipmentDetail = pendingShipmentDetail;
           this.internationalControlledExportDetail = internationalControlledExportDetail;
           this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
           this.shipmentDryIceDetail = shipmentDryIceDetail;
           this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
           this.flatbedTrailerDetail = flatbedTrailerDetail;
           this.freightGuaranteeDetail = freightGuaranteeDetail;
           this.etdDetail = etdDetail;
           this.extraLaborDetail = extraLaborDetail;
           this.palletShrinkwrapDetail = palletShrinkwrapDetail;
           this.palletsProvidedDetail = palletsProvidedDetail;
           this.detentionDetail = detentionDetail;
           this.markingOrTaggingDetail = markingOrTaggingDetail;
           this.nonBusinessTimeDetail = nonBusinessTimeDetail;
           this.shipmentAssemblyDetail = shipmentAssemblyDetail;
           this.sortAndSegregateDetail = sortAndSegregateDetail;
           this.specialEquipmentDetail = specialEquipmentDetail;
           this.storageDetail = storageDetail;
           this.weighingDetail = weighingDetail;
           this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }


    /**
     * Gets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction).
     */
    public ShipmentSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this ShipmentSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment (or other shipment-level transaction).
     */
    public void setSpecialServiceTypes(ShipmentSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public ShipmentSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, ShipmentSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return codDetail
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param codDetail
     */
    public void setCodDetail(CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return deliveryOnInvoiceAcceptanceDetail
     */
    public com.fedex.pickup.stub.DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Sets the deliveryOnInvoiceAcceptanceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param deliveryOnInvoiceAcceptanceDetail
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(com.fedex.pickup.stub.DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail) {
        this.deliveryOnInvoiceAcceptanceDetail = deliveryOnInvoiceAcceptanceDetail;
    }


    /**
     * Gets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return holdAtLocationDetail
     */
    public HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }


    /**
     * Sets the holdAtLocationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param holdAtLocationDetail
     */
    public void setHoldAtLocationDetail(HoldAtLocationDetail holdAtLocationDetail) {
        this.holdAtLocationDetail = holdAtLocationDetail;
    }


    /**
     * Gets the EMailNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return EMailNotificationDetail
     */
    public com.fedex.pickup.stub.EMailNotificationDetail getEMailNotificationDetail() {
        return EMailNotificationDetail;
    }


    /**
     * Sets the EMailNotificationDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param EMailNotificationDetail
     */
    public void setEMailNotificationDetail(com.fedex.pickup.stub.EMailNotificationDetail EMailNotificationDetail) {
        this.EMailNotificationDetail = EMailNotificationDetail;
    }


    /**
     * Gets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return returnShipmentDetail
     */
    public ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }


    /**
     * Sets the returnShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param returnShipmentDetail
     */
    public void setReturnShipmentDetail(ReturnShipmentDetail returnShipmentDetail) {
        this.returnShipmentDetail = returnShipmentDetail;
    }


    /**
     * Gets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }


    /**
     * Sets the pendingShipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param pendingShipmentDetail   * This field should be populated for pending shipments (e.g.
     * e-mail label) It is required by a PENDING_SHIPMENT special service
     * type.
     */
    public void setPendingShipmentDetail(PendingShipmentDetail pendingShipmentDetail) {
        this.pendingShipmentDetail = pendingShipmentDetail;
    }


    /**
     * Gets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalControlledExportDetail
     */
    public com.fedex.pickup.stub.InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }


    /**
     * Sets the internationalControlledExportDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalControlledExportDetail
     */
    public void setInternationalControlledExportDetail(com.fedex.pickup.stub.InternationalControlledExportDetail internationalControlledExportDetail) {
        this.internationalControlledExportDetail = internationalControlledExportDetail;
    }


    /**
     * Gets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return internationalTrafficInArmsRegulationsDetail
     */
    public com.fedex.pickup.stub.InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Sets the internationalTrafficInArmsRegulationsDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param internationalTrafficInArmsRegulationsDetail
     */
    public void setInternationalTrafficInArmsRegulationsDetail(com.fedex.pickup.stub.InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail) {
        this.internationalTrafficInArmsRegulationsDetail = internationalTrafficInArmsRegulationsDetail;
    }


    /**
     * Gets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return shipmentDryIceDetail
     */
    public ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }


    /**
     * Sets the shipmentDryIceDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param shipmentDryIceDetail
     */
    public void setShipmentDryIceDetail(ShipmentDryIceDetail shipmentDryIceDetail) {
        this.shipmentDryIceDetail = shipmentDryIceDetail;
    }


    /**
     * Gets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return homeDeliveryPremiumDetail
     */
    public HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }


    /**
     * Sets the homeDeliveryPremiumDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param homeDeliveryPremiumDetail
     */
    public void setHomeDeliveryPremiumDetail(HomeDeliveryPremiumDetail homeDeliveryPremiumDetail) {
        this.homeDeliveryPremiumDetail = homeDeliveryPremiumDetail;
    }


    /**
     * Gets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return flatbedTrailerDetail
     */
    public FlatbedTrailerDetail getFlatbedTrailerDetail() {
        return flatbedTrailerDetail;
    }


    /**
     * Sets the flatbedTrailerDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param flatbedTrailerDetail
     */
    public void setFlatbedTrailerDetail(FlatbedTrailerDetail flatbedTrailerDetail) {
        this.flatbedTrailerDetail = flatbedTrailerDetail;
    }


    /**
     * Gets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return freightGuaranteeDetail
     */
    public FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }


    /**
     * Sets the freightGuaranteeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param freightGuaranteeDetail
     */
    public void setFreightGuaranteeDetail(FreightGuaranteeDetail freightGuaranteeDetail) {
        this.freightGuaranteeDetail = freightGuaranteeDetail;
    }


    /**
     * Gets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return etdDetail   * Electronic Trade document references.
     */
    public EtdDetail getEtdDetail() {
        return etdDetail;
    }


    /**
     * Sets the etdDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param etdDetail   * Electronic Trade document references.
     */
    public void setEtdDetail(EtdDetail etdDetail) {
        this.etdDetail = etdDetail;
    }


    /**
     * Gets the extraLaborDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return extraLaborDetail   * Specification for labor to be performed with the shipment.
     */
    public ExtraLaborDetail getExtraLaborDetail() {
        return extraLaborDetail;
    }


    /**
     * Sets the extraLaborDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param extraLaborDetail   * Specification for labor to be performed with the shipment.
     */
    public void setExtraLaborDetail(ExtraLaborDetail extraLaborDetail) {
        this.extraLaborDetail = extraLaborDetail;
    }


    /**
     * Gets the palletShrinkwrapDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return palletShrinkwrapDetail   * Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment.
     */
    public PalletShrinkwrapDetail getPalletShrinkwrapDetail() {
        return palletShrinkwrapDetail;
    }


    /**
     * Sets the palletShrinkwrapDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param palletShrinkwrapDetail   * Specifications for pallets to be shrinkwrapped as part of a
     * Freight shipment.
     */
    public void setPalletShrinkwrapDetail(PalletShrinkwrapDetail palletShrinkwrapDetail) {
        this.palletShrinkwrapDetail = palletShrinkwrapDetail;
    }


    /**
     * Gets the palletsProvidedDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return palletsProvidedDetail   * Specifications for pallets to be provided on Freight shipment.
     */
    public PalletsProvidedDetail getPalletsProvidedDetail() {
        return palletsProvidedDetail;
    }


    /**
     * Sets the palletsProvidedDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param palletsProvidedDetail   * Specifications for pallets to be provided on Freight shipment.
     */
    public void setPalletsProvidedDetail(PalletsProvidedDetail palletsProvidedDetail) {
        this.palletsProvidedDetail = palletsProvidedDetail;
    }


    /**
     * Gets the detentionDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return detentionDetail   * Specifications for pup/set or vehicle delayed for loading or
     * unloading.
     */
    public DetentionDetail getDetentionDetail() {
        return detentionDetail;
    }


    /**
     * Sets the detentionDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param detentionDetail   * Specifications for pup/set or vehicle delayed for loading or
     * unloading.
     */
    public void setDetentionDetail(DetentionDetail detentionDetail) {
        this.detentionDetail = detentionDetail;
    }


    /**
     * Gets the markingOrTaggingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return markingOrTaggingDetail   * Specification for marking or tagging of pieces in shipment.
     */
    public MarkingOrTaggingDetail getMarkingOrTaggingDetail() {
        return markingOrTaggingDetail;
    }


    /**
     * Sets the markingOrTaggingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param markingOrTaggingDetail   * Specification for marking or tagging of pieces in shipment.
     */
    public void setMarkingOrTaggingDetail(MarkingOrTaggingDetail markingOrTaggingDetail) {
        this.markingOrTaggingDetail = markingOrTaggingDetail;
    }


    /**
     * Gets the nonBusinessTimeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return nonBusinessTimeDetail   * Specification for services performed during non-business hours
     * and/or days.
     */
    public NonBusinessTimeDetail getNonBusinessTimeDetail() {
        return nonBusinessTimeDetail;
    }


    /**
     * Sets the nonBusinessTimeDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param nonBusinessTimeDetail   * Specification for services performed during non-business hours
     * and/or days.
     */
    public void setNonBusinessTimeDetail(NonBusinessTimeDetail nonBusinessTimeDetail) {
        this.nonBusinessTimeDetail = nonBusinessTimeDetail;
    }


    /**
     * Gets the shipmentAssemblyDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return shipmentAssemblyDetail   * Specification for assembly performed on shipment.
     */
    public ShipmentAssemblyDetail getShipmentAssemblyDetail() {
        return shipmentAssemblyDetail;
    }


    /**
     * Sets the shipmentAssemblyDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param shipmentAssemblyDetail   * Specification for assembly performed on shipment.
     */
    public void setShipmentAssemblyDetail(ShipmentAssemblyDetail shipmentAssemblyDetail) {
        this.shipmentAssemblyDetail = shipmentAssemblyDetail;
    }


    /**
     * Gets the sortAndSegregateDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return sortAndSegregateDetail   * Specification for sorting and/or segregating performed on shipment.
     */
    public SortAndSegregateDetail getSortAndSegregateDetail() {
        return sortAndSegregateDetail;
    }


    /**
     * Sets the sortAndSegregateDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param sortAndSegregateDetail   * Specification for sorting and/or segregating performed on shipment.
     */
    public void setSortAndSegregateDetail(SortAndSegregateDetail sortAndSegregateDetail) {
        this.sortAndSegregateDetail = sortAndSegregateDetail;
    }


    /**
     * Gets the specialEquipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return specialEquipmentDetail   * Specification for special equipment used in loading/unloading
     * shipment.
     */
    public SpecialEquipmentDetail getSpecialEquipmentDetail() {
        return specialEquipmentDetail;
    }


    /**
     * Sets the specialEquipmentDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param specialEquipmentDetail   * Specification for special equipment used in loading/unloading
     * shipment.
     */
    public void setSpecialEquipmentDetail(SpecialEquipmentDetail specialEquipmentDetail) {
        this.specialEquipmentDetail = specialEquipmentDetail;
    }


    /**
     * Gets the storageDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return storageDetail   * Specification for storage provided for shipment.
     */
    public StorageDetail getStorageDetail() {
        return storageDetail;
    }


    /**
     * Sets the storageDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param storageDetail   * Specification for storage provided for shipment.
     */
    public void setStorageDetail(StorageDetail storageDetail) {
        this.storageDetail = storageDetail;
    }


    /**
     * Gets the weighingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return weighingDetail   * Specification for weighing services provided for shipment.
     */
    public WeighingDetail getWeighingDetail() {
        return weighingDetail;
    }


    /**
     * Sets the weighingDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param weighingDetail   * Specification for weighing services provided for shipment.
     */
    public void setWeighingDetail(WeighingDetail weighingDetail) {
        this.weighingDetail = weighingDetail;
    }


    /**
     * Gets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @return customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }


    /**
     * Sets the customDeliveryWindowDetail value for this ShipmentSpecialServicesRequested.
     * 
     * @param customDeliveryWindowDetail   * Specification for date or range of dates on which delivery
     * is to be attempted.
     */
    public void setCustomDeliveryWindowDetail(CustomDeliveryWindowDetail customDeliveryWindowDetail) {
        this.customDeliveryWindowDetail = customDeliveryWindowDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentSpecialServicesRequested)) return false;
        ShipmentSpecialServicesRequested other = (ShipmentSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) || 
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.codDetail==null && other.getCodDetail()==null) || 
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.deliveryOnInvoiceAcceptanceDetail==null && other.getDeliveryOnInvoiceAcceptanceDetail()==null) || 
             (this.deliveryOnInvoiceAcceptanceDetail!=null &&
              this.deliveryOnInvoiceAcceptanceDetail.equals(other.getDeliveryOnInvoiceAcceptanceDetail()))) &&
            ((this.holdAtLocationDetail==null && other.getHoldAtLocationDetail()==null) || 
             (this.holdAtLocationDetail!=null &&
              this.holdAtLocationDetail.equals(other.getHoldAtLocationDetail()))) &&
            ((this.EMailNotificationDetail==null && other.getEMailNotificationDetail()==null) || 
             (this.EMailNotificationDetail!=null &&
              this.EMailNotificationDetail.equals(other.getEMailNotificationDetail()))) &&
            ((this.returnShipmentDetail==null && other.getReturnShipmentDetail()==null) || 
             (this.returnShipmentDetail!=null &&
              this.returnShipmentDetail.equals(other.getReturnShipmentDetail()))) &&
            ((this.pendingShipmentDetail==null && other.getPendingShipmentDetail()==null) || 
             (this.pendingShipmentDetail!=null &&
              this.pendingShipmentDetail.equals(other.getPendingShipmentDetail()))) &&
            ((this.internationalControlledExportDetail==null && other.getInternationalControlledExportDetail()==null) || 
             (this.internationalControlledExportDetail!=null &&
              this.internationalControlledExportDetail.equals(other.getInternationalControlledExportDetail()))) &&
            ((this.internationalTrafficInArmsRegulationsDetail==null && other.getInternationalTrafficInArmsRegulationsDetail()==null) || 
             (this.internationalTrafficInArmsRegulationsDetail!=null &&
              this.internationalTrafficInArmsRegulationsDetail.equals(other.getInternationalTrafficInArmsRegulationsDetail()))) &&
            ((this.shipmentDryIceDetail==null && other.getShipmentDryIceDetail()==null) || 
             (this.shipmentDryIceDetail!=null &&
              this.shipmentDryIceDetail.equals(other.getShipmentDryIceDetail()))) &&
            ((this.homeDeliveryPremiumDetail==null && other.getHomeDeliveryPremiumDetail()==null) || 
             (this.homeDeliveryPremiumDetail!=null &&
              this.homeDeliveryPremiumDetail.equals(other.getHomeDeliveryPremiumDetail()))) &&
            ((this.flatbedTrailerDetail==null && other.getFlatbedTrailerDetail()==null) || 
             (this.flatbedTrailerDetail!=null &&
              this.flatbedTrailerDetail.equals(other.getFlatbedTrailerDetail()))) &&
            ((this.freightGuaranteeDetail==null && other.getFreightGuaranteeDetail()==null) || 
             (this.freightGuaranteeDetail!=null &&
              this.freightGuaranteeDetail.equals(other.getFreightGuaranteeDetail()))) &&
            ((this.etdDetail==null && other.getEtdDetail()==null) || 
             (this.etdDetail!=null &&
              this.etdDetail.equals(other.getEtdDetail()))) &&
            ((this.extraLaborDetail==null && other.getExtraLaborDetail()==null) || 
             (this.extraLaborDetail!=null &&
              this.extraLaborDetail.equals(other.getExtraLaborDetail()))) &&
            ((this.palletShrinkwrapDetail==null && other.getPalletShrinkwrapDetail()==null) || 
             (this.palletShrinkwrapDetail!=null &&
              this.palletShrinkwrapDetail.equals(other.getPalletShrinkwrapDetail()))) &&
            ((this.palletsProvidedDetail==null && other.getPalletsProvidedDetail()==null) || 
             (this.palletsProvidedDetail!=null &&
              this.palletsProvidedDetail.equals(other.getPalletsProvidedDetail()))) &&
            ((this.detentionDetail==null && other.getDetentionDetail()==null) || 
             (this.detentionDetail!=null &&
              this.detentionDetail.equals(other.getDetentionDetail()))) &&
            ((this.markingOrTaggingDetail==null && other.getMarkingOrTaggingDetail()==null) || 
             (this.markingOrTaggingDetail!=null &&
              this.markingOrTaggingDetail.equals(other.getMarkingOrTaggingDetail()))) &&
            ((this.nonBusinessTimeDetail==null && other.getNonBusinessTimeDetail()==null) || 
             (this.nonBusinessTimeDetail!=null &&
              this.nonBusinessTimeDetail.equals(other.getNonBusinessTimeDetail()))) &&
            ((this.shipmentAssemblyDetail==null && other.getShipmentAssemblyDetail()==null) || 
             (this.shipmentAssemblyDetail!=null &&
              this.shipmentAssemblyDetail.equals(other.getShipmentAssemblyDetail()))) &&
            ((this.sortAndSegregateDetail==null && other.getSortAndSegregateDetail()==null) || 
             (this.sortAndSegregateDetail!=null &&
              this.sortAndSegregateDetail.equals(other.getSortAndSegregateDetail()))) &&
            ((this.specialEquipmentDetail==null && other.getSpecialEquipmentDetail()==null) || 
             (this.specialEquipmentDetail!=null &&
              this.specialEquipmentDetail.equals(other.getSpecialEquipmentDetail()))) &&
            ((this.storageDetail==null && other.getStorageDetail()==null) || 
             (this.storageDetail!=null &&
              this.storageDetail.equals(other.getStorageDetail()))) &&
            ((this.weighingDetail==null && other.getWeighingDetail()==null) || 
             (this.weighingDetail!=null &&
              this.weighingDetail.equals(other.getWeighingDetail()))) &&
            ((this.customDeliveryWindowDetail==null && other.getCustomDeliveryWindowDetail()==null) || 
             (this.customDeliveryWindowDetail!=null &&
              this.customDeliveryWindowDetail.equals(other.getCustomDeliveryWindowDetail())));
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
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDeliveryOnInvoiceAcceptanceDetail() != null) {
            _hashCode += getDeliveryOnInvoiceAcceptanceDetail().hashCode();
        }
        if (getHoldAtLocationDetail() != null) {
            _hashCode += getHoldAtLocationDetail().hashCode();
        }
        if (getEMailNotificationDetail() != null) {
            _hashCode += getEMailNotificationDetail().hashCode();
        }
        if (getReturnShipmentDetail() != null) {
            _hashCode += getReturnShipmentDetail().hashCode();
        }
        if (getPendingShipmentDetail() != null) {
            _hashCode += getPendingShipmentDetail().hashCode();
        }
        if (getInternationalControlledExportDetail() != null) {
            _hashCode += getInternationalControlledExportDetail().hashCode();
        }
        if (getInternationalTrafficInArmsRegulationsDetail() != null) {
            _hashCode += getInternationalTrafficInArmsRegulationsDetail().hashCode();
        }
        if (getShipmentDryIceDetail() != null) {
            _hashCode += getShipmentDryIceDetail().hashCode();
        }
        if (getHomeDeliveryPremiumDetail() != null) {
            _hashCode += getHomeDeliveryPremiumDetail().hashCode();
        }
        if (getFlatbedTrailerDetail() != null) {
            _hashCode += getFlatbedTrailerDetail().hashCode();
        }
        if (getFreightGuaranteeDetail() != null) {
            _hashCode += getFreightGuaranteeDetail().hashCode();
        }
        if (getEtdDetail() != null) {
            _hashCode += getEtdDetail().hashCode();
        }
        if (getExtraLaborDetail() != null) {
            _hashCode += getExtraLaborDetail().hashCode();
        }
        if (getPalletShrinkwrapDetail() != null) {
            _hashCode += getPalletShrinkwrapDetail().hashCode();
        }
        if (getPalletsProvidedDetail() != null) {
            _hashCode += getPalletsProvidedDetail().hashCode();
        }
        if (getDetentionDetail() != null) {
            _hashCode += getDetentionDetail().hashCode();
        }
        if (getMarkingOrTaggingDetail() != null) {
            _hashCode += getMarkingOrTaggingDetail().hashCode();
        }
        if (getNonBusinessTimeDetail() != null) {
            _hashCode += getNonBusinessTimeDetail().hashCode();
        }
        if (getShipmentAssemblyDetail() != null) {
            _hashCode += getShipmentAssemblyDetail().hashCode();
        }
        if (getSortAndSegregateDetail() != null) {
            _hashCode += getSortAndSegregateDetail().hashCode();
        }
        if (getSpecialEquipmentDetail() != null) {
            _hashCode += getSpecialEquipmentDetail().hashCode();
        }
        if (getStorageDetail() != null) {
            _hashCode += getStorageDetail().hashCode();
        }
        if (getWeighingDetail() != null) {
            _hashCode += getWeighingDetail().hashCode();
        }
        if (getCustomDeliveryWindowDetail() != null) {
            _hashCode += getCustomDeliveryWindowDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOnInvoiceAcceptanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DeliveryOnInvoiceAcceptanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EMailNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EMailNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PendingShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PendingShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalControlledExportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "InternationalControlledExportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "InternationalControlledExportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalTrafficInArmsRegulationsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "InternationalTrafficInArmsRegulationsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentDryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryPremiumDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HomeDeliveryPremiumDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HomeDeliveryPremiumDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatbedTrailerDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FlatbedTrailerDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FlatbedTrailerDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightGuaranteeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightGuaranteeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightGuaranteeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraLaborDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExtraLaborDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExtraLaborDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletShrinkwrapDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletShrinkwrapDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletShrinkwrapDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletsProvidedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletsProvidedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PalletsProvidedDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detentionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DetentionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DetentionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markingOrTaggingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "MarkingOrTaggingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "MarkingOrTaggingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBusinessTimeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "NonBusinessTimeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "NonBusinessTimeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAssemblyDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentAssemblyDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentAssemblyDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortAndSegregateDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SortAndSegregateDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SortAndSegregateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialEquipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SpecialEquipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SpecialEquipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "StorageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "StorageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weighingDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "WeighingDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "WeighingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDeliveryWindowDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CustomDeliveryWindowDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CustomDeliveryWindowDetail"));
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

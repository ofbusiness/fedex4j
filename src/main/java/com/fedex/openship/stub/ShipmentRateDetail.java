/**
 * ShipmentRateDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Data for a shipment's total/summary rates, as calculated per a
 * specific rate type. The "total..." fields may differ from the sum
 * of corresponding package data for Multiweight or Express MPS.
 */
public class ShipmentRateDetail  implements java.io.Serializable {
    /* Type used for this specific set of rate data. */
    private ReturnedRateType rateType;

    /* Indicates the rate scale used. */
    private String rateScale;

    /* Indicates the rate zone used (based on origin and destination). */
    private String rateZone;

    private PricingCodeType pricingCode;

    /* Indicates which weight was used. */
    private RatedWeightMethod ratedWeightMethod;

    /* INTERNAL FEDEX USE ONLY. */
    private MinimumChargeType minimumChargeType;

    /* Specifies the currency exchange performed on financial amounts
     * for this rate. */
    private com.fedex.openship.stub.CurrencyExchangeRate currencyExchangeRate;

    /* Indicates which special rating cases applied to this shipment. */
    private com.fedex.openship.stub.SpecialRatingAppliedType[] specialRatingApplied;

    private org.apache.axis.types.NonNegativeInteger dimDivisor;

    /* Identifies the type of dim divisor that was applied. */
    private com.fedex.openship.stub.RateDimensionalDivisorType dimDivisorType;

    private java.math.BigDecimal fuelSurchargePercent;

    private Weight totalBillingWeight;

    /* Sum of dimensional weights for all packages. */
    private Weight totalDimWeight;

    private Money totalBaseCharge;

    private Money totalFreightDiscounts;

    private Money totalNetFreight;

    private Money totalSurcharges;

    /* This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes). */
    private Money totalNetFedExCharge;

    /* Total of the transportation-based taxes. */
    private Money totalTaxes;

    private Money totalNetCharge;

    private Money totalRebates;

    /* Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment. */
    private Money totalDutiesAndTaxes;

    /* This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account. */
    private Money totalNetChargeWithDutiesAndTaxes;

    /* Identifies the Rate Details per each leg in a Freight Shipment */
    private com.fedex.openship.stub.ShipmentLegRateDetail[] shipmentLegRateDetails;

    /* Rate data specific to FedEx Freight and FedEx National Freight
     * services. */
    private FreightRateDetail freightRateDetail;

    /* All rate discounts that apply to this shipment. */
    private RateDiscount[] freightDiscounts;

    /* All rebates that apply to this shipment. */
    private Rebate[] rebates;

    /* All surcharges that apply to this shipment. */
    private Surcharge[] surcharges;

    /* All transportation-based taxes applicable to this shipment. */
    private Tax[] taxes;

    /* All commodity-based duties and taxes applicable to this shipment. */
    private EdtCommodityTax[] dutiesAndTaxes;

    /* The "order level" variable handling charges. */
    private com.fedex.openship.stub.VariableHandlingCharges variableHandlingCharges;

    /* The total of all variable handling charges at both shipment
     * (order) and package level. */
    private com.fedex.openship.stub.VariableHandlingCharges totalVariableHandlingCharges;

    public ShipmentRateDetail() {
    }

    public ShipmentRateDetail(
           ReturnedRateType rateType,
           String rateScale,
           String rateZone,
           PricingCodeType pricingCode,
           RatedWeightMethod ratedWeightMethod,
           MinimumChargeType minimumChargeType,
           com.fedex.openship.stub.CurrencyExchangeRate currencyExchangeRate,
           com.fedex.openship.stub.SpecialRatingAppliedType[] specialRatingApplied,
           org.apache.axis.types.NonNegativeInteger dimDivisor,
           com.fedex.openship.stub.RateDimensionalDivisorType dimDivisorType,
           java.math.BigDecimal fuelSurchargePercent,
           Weight totalBillingWeight,
           Weight totalDimWeight,
           Money totalBaseCharge,
           Money totalFreightDiscounts,
           Money totalNetFreight,
           Money totalSurcharges,
           Money totalNetFedExCharge,
           Money totalTaxes,
           Money totalNetCharge,
           Money totalRebates,
           Money totalDutiesAndTaxes,
           Money totalNetChargeWithDutiesAndTaxes,
           com.fedex.openship.stub.ShipmentLegRateDetail[] shipmentLegRateDetails,
           FreightRateDetail freightRateDetail,
           RateDiscount[] freightDiscounts,
           Rebate[] rebates,
           Surcharge[] surcharges,
           Tax[] taxes,
           EdtCommodityTax[] dutiesAndTaxes,
           com.fedex.openship.stub.VariableHandlingCharges variableHandlingCharges,
           com.fedex.openship.stub.VariableHandlingCharges totalVariableHandlingCharges) {
           this.rateType = rateType;
           this.rateScale = rateScale;
           this.rateZone = rateZone;
           this.pricingCode = pricingCode;
           this.ratedWeightMethod = ratedWeightMethod;
           this.minimumChargeType = minimumChargeType;
           this.currencyExchangeRate = currencyExchangeRate;
           this.specialRatingApplied = specialRatingApplied;
           this.dimDivisor = dimDivisor;
           this.dimDivisorType = dimDivisorType;
           this.fuelSurchargePercent = fuelSurchargePercent;
           this.totalBillingWeight = totalBillingWeight;
           this.totalDimWeight = totalDimWeight;
           this.totalBaseCharge = totalBaseCharge;
           this.totalFreightDiscounts = totalFreightDiscounts;
           this.totalNetFreight = totalNetFreight;
           this.totalSurcharges = totalSurcharges;
           this.totalNetFedExCharge = totalNetFedExCharge;
           this.totalTaxes = totalTaxes;
           this.totalNetCharge = totalNetCharge;
           this.totalRebates = totalRebates;
           this.totalDutiesAndTaxes = totalDutiesAndTaxes;
           this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
           this.shipmentLegRateDetails = shipmentLegRateDetails;
           this.freightRateDetail = freightRateDetail;
           this.freightDiscounts = freightDiscounts;
           this.rebates = rebates;
           this.surcharges = surcharges;
           this.taxes = taxes;
           this.dutiesAndTaxes = dutiesAndTaxes;
           this.variableHandlingCharges = variableHandlingCharges;
           this.totalVariableHandlingCharges = totalVariableHandlingCharges;
    }


    /**
     * Gets the rateType value for this ShipmentRateDetail.
     * 
     * @return rateType   * Type used for this specific set of rate data.
     */
    public ReturnedRateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ShipmentRateDetail.
     * 
     * @param rateType   * Type used for this specific set of rate data.
     */
    public void setRateType(ReturnedRateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the rateScale value for this ShipmentRateDetail.
     * 
     * @return rateScale   * Indicates the rate scale used.
     */
    public String getRateScale() {
        return rateScale;
    }


    /**
     * Sets the rateScale value for this ShipmentRateDetail.
     * 
     * @param rateScale   * Indicates the rate scale used.
     */
    public void setRateScale(String rateScale) {
        this.rateScale = rateScale;
    }


    /**
     * Gets the rateZone value for this ShipmentRateDetail.
     * 
     * @return rateZone   * Indicates the rate zone used (based on origin and destination).
     */
    public String getRateZone() {
        return rateZone;
    }


    /**
     * Sets the rateZone value for this ShipmentRateDetail.
     * 
     * @param rateZone   * Indicates the rate zone used (based on origin and destination).
     */
    public void setRateZone(String rateZone) {
        this.rateZone = rateZone;
    }


    /**
     * Gets the pricingCode value for this ShipmentRateDetail.
     * 
     * @return pricingCode
     */
    public PricingCodeType getPricingCode() {
        return pricingCode;
    }


    /**
     * Sets the pricingCode value for this ShipmentRateDetail.
     * 
     * @param pricingCode
     */
    public void setPricingCode(PricingCodeType pricingCode) {
        this.pricingCode = pricingCode;
    }


    /**
     * Gets the ratedWeightMethod value for this ShipmentRateDetail.
     * 
     * @return ratedWeightMethod   * Indicates which weight was used.
     */
    public RatedWeightMethod getRatedWeightMethod() {
        return ratedWeightMethod;
    }


    /**
     * Sets the ratedWeightMethod value for this ShipmentRateDetail.
     * 
     * @param ratedWeightMethod   * Indicates which weight was used.
     */
    public void setRatedWeightMethod(RatedWeightMethod ratedWeightMethod) {
        this.ratedWeightMethod = ratedWeightMethod;
    }


    /**
     * Gets the minimumChargeType value for this ShipmentRateDetail.
     * 
     * @return minimumChargeType   * INTERNAL FEDEX USE ONLY.
     */
    public MinimumChargeType getMinimumChargeType() {
        return minimumChargeType;
    }


    /**
     * Sets the minimumChargeType value for this ShipmentRateDetail.
     * 
     * @param minimumChargeType   * INTERNAL FEDEX USE ONLY.
     */
    public void setMinimumChargeType(MinimumChargeType minimumChargeType) {
        this.minimumChargeType = minimumChargeType;
    }


    /**
     * Gets the currencyExchangeRate value for this ShipmentRateDetail.
     * 
     * @return currencyExchangeRate   * Specifies the currency exchange performed on financial amounts
     * for this rate.
     */
    public com.fedex.openship.stub.CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }


    /**
     * Sets the currencyExchangeRate value for this ShipmentRateDetail.
     * 
     * @param currencyExchangeRate   * Specifies the currency exchange performed on financial amounts
     * for this rate.
     */
    public void setCurrencyExchangeRate(com.fedex.openship.stub.CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }


    /**
     * Gets the specialRatingApplied value for this ShipmentRateDetail.
     * 
     * @return specialRatingApplied   * Indicates which special rating cases applied to this shipment.
     */
    public com.fedex.openship.stub.SpecialRatingAppliedType[] getSpecialRatingApplied() {
        return specialRatingApplied;
    }


    /**
     * Sets the specialRatingApplied value for this ShipmentRateDetail.
     * 
     * @param specialRatingApplied   * Indicates which special rating cases applied to this shipment.
     */
    public void setSpecialRatingApplied(com.fedex.openship.stub.SpecialRatingAppliedType[] specialRatingApplied) {
        this.specialRatingApplied = specialRatingApplied;
    }

    public com.fedex.openship.stub.SpecialRatingAppliedType getSpecialRatingApplied(int i) {
        return this.specialRatingApplied[i];
    }

    public void setSpecialRatingApplied(int i, com.fedex.openship.stub.SpecialRatingAppliedType _value) {
        this.specialRatingApplied[i] = _value;
    }


    /**
     * Gets the dimDivisor value for this ShipmentRateDetail.
     * 
     * @return dimDivisor
     */
    public org.apache.axis.types.NonNegativeInteger getDimDivisor() {
        return dimDivisor;
    }


    /**
     * Sets the dimDivisor value for this ShipmentRateDetail.
     * 
     * @param dimDivisor
     */
    public void setDimDivisor(org.apache.axis.types.NonNegativeInteger dimDivisor) {
        this.dimDivisor = dimDivisor;
    }


    /**
     * Gets the dimDivisorType value for this ShipmentRateDetail.
     * 
     * @return dimDivisorType   * Identifies the type of dim divisor that was applied.
     */
    public com.fedex.openship.stub.RateDimensionalDivisorType getDimDivisorType() {
        return dimDivisorType;
    }


    /**
     * Sets the dimDivisorType value for this ShipmentRateDetail.
     * 
     * @param dimDivisorType   * Identifies the type of dim divisor that was applied.
     */
    public void setDimDivisorType(com.fedex.openship.stub.RateDimensionalDivisorType dimDivisorType) {
        this.dimDivisorType = dimDivisorType;
    }


    /**
     * Gets the fuelSurchargePercent value for this ShipmentRateDetail.
     * 
     * @return fuelSurchargePercent
     */
    public java.math.BigDecimal getFuelSurchargePercent() {
        return fuelSurchargePercent;
    }


    /**
     * Sets the fuelSurchargePercent value for this ShipmentRateDetail.
     * 
     * @param fuelSurchargePercent
     */
    public void setFuelSurchargePercent(java.math.BigDecimal fuelSurchargePercent) {
        this.fuelSurchargePercent = fuelSurchargePercent;
    }


    /**
     * Gets the totalBillingWeight value for this ShipmentRateDetail.
     * 
     * @return totalBillingWeight
     */
    public Weight getTotalBillingWeight() {
        return totalBillingWeight;
    }


    /**
     * Sets the totalBillingWeight value for this ShipmentRateDetail.
     * 
     * @param totalBillingWeight
     */
    public void setTotalBillingWeight(Weight totalBillingWeight) {
        this.totalBillingWeight = totalBillingWeight;
    }


    /**
     * Gets the totalDimWeight value for this ShipmentRateDetail.
     * 
     * @return totalDimWeight   * Sum of dimensional weights for all packages.
     */
    public Weight getTotalDimWeight() {
        return totalDimWeight;
    }


    /**
     * Sets the totalDimWeight value for this ShipmentRateDetail.
     * 
     * @param totalDimWeight   * Sum of dimensional weights for all packages.
     */
    public void setTotalDimWeight(Weight totalDimWeight) {
        this.totalDimWeight = totalDimWeight;
    }


    /**
     * Gets the totalBaseCharge value for this ShipmentRateDetail.
     * 
     * @return totalBaseCharge
     */
    public Money getTotalBaseCharge() {
        return totalBaseCharge;
    }


    /**
     * Sets the totalBaseCharge value for this ShipmentRateDetail.
     * 
     * @param totalBaseCharge
     */
    public void setTotalBaseCharge(Money totalBaseCharge) {
        this.totalBaseCharge = totalBaseCharge;
    }


    /**
     * Gets the totalFreightDiscounts value for this ShipmentRateDetail.
     * 
     * @return totalFreightDiscounts
     */
    public Money getTotalFreightDiscounts() {
        return totalFreightDiscounts;
    }


    /**
     * Sets the totalFreightDiscounts value for this ShipmentRateDetail.
     * 
     * @param totalFreightDiscounts
     */
    public void setTotalFreightDiscounts(Money totalFreightDiscounts) {
        this.totalFreightDiscounts = totalFreightDiscounts;
    }


    /**
     * Gets the totalNetFreight value for this ShipmentRateDetail.
     * 
     * @return totalNetFreight
     */
    public Money getTotalNetFreight() {
        return totalNetFreight;
    }


    /**
     * Sets the totalNetFreight value for this ShipmentRateDetail.
     * 
     * @param totalNetFreight
     */
    public void setTotalNetFreight(Money totalNetFreight) {
        this.totalNetFreight = totalNetFreight;
    }


    /**
     * Gets the totalSurcharges value for this ShipmentRateDetail.
     * 
     * @return totalSurcharges
     */
    public Money getTotalSurcharges() {
        return totalSurcharges;
    }


    /**
     * Sets the totalSurcharges value for this ShipmentRateDetail.
     * 
     * @param totalSurcharges
     */
    public void setTotalSurcharges(Money totalSurcharges) {
        this.totalSurcharges = totalSurcharges;
    }


    /**
     * Gets the totalNetFedExCharge value for this ShipmentRateDetail.
     * 
     * @return totalNetFedExCharge   * This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes).
     */
    public Money getTotalNetFedExCharge() {
        return totalNetFedExCharge;
    }


    /**
     * Sets the totalNetFedExCharge value for this ShipmentRateDetail.
     * 
     * @param totalNetFedExCharge   * This shipment's totalNetFreight + totalSurcharges (not including
     * totalTaxes).
     */
    public void setTotalNetFedExCharge(Money totalNetFedExCharge) {
        this.totalNetFedExCharge = totalNetFedExCharge;
    }


    /**
     * Gets the totalTaxes value for this ShipmentRateDetail.
     * 
     * @return totalTaxes   * Total of the transportation-based taxes.
     */
    public Money getTotalTaxes() {
        return totalTaxes;
    }


    /**
     * Sets the totalTaxes value for this ShipmentRateDetail.
     * 
     * @param totalTaxes   * Total of the transportation-based taxes.
     */
    public void setTotalTaxes(Money totalTaxes) {
        this.totalTaxes = totalTaxes;
    }


    /**
     * Gets the totalNetCharge value for this ShipmentRateDetail.
     * 
     * @return totalNetCharge
     */
    public Money getTotalNetCharge() {
        return totalNetCharge;
    }


    /**
     * Sets the totalNetCharge value for this ShipmentRateDetail.
     * 
     * @param totalNetCharge
     */
    public void setTotalNetCharge(Money totalNetCharge) {
        this.totalNetCharge = totalNetCharge;
    }


    /**
     * Gets the totalRebates value for this ShipmentRateDetail.
     * 
     * @return totalRebates
     */
    public Money getTotalRebates() {
        return totalRebates;
    }


    /**
     * Sets the totalRebates value for this ShipmentRateDetail.
     * 
     * @param totalRebates
     */
    public void setTotalRebates(Money totalRebates) {
        this.totalRebates = totalRebates;
    }


    /**
     * Gets the totalDutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @return totalDutiesAndTaxes   * Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment.
     */
    public Money getTotalDutiesAndTaxes() {
        return totalDutiesAndTaxes;
    }


    /**
     * Sets the totalDutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @param totalDutiesAndTaxes   * Total of all values under this shipment's dutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment.
     */
    public void setTotalDutiesAndTaxes(Money totalDutiesAndTaxes) {
        this.totalDutiesAndTaxes = totalDutiesAndTaxes;
    }


    /**
     * Gets the totalNetChargeWithDutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @return totalNetChargeWithDutiesAndTaxes   * This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account.
     */
    public Money getTotalNetChargeWithDutiesAndTaxes() {
        return totalNetChargeWithDutiesAndTaxes;
    }


    /**
     * Sets the totalNetChargeWithDutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @param totalNetChargeWithDutiesAndTaxes   * This shipment's totalNetCharge + totalDutiesAndTaxes; only
     * provided if estimated duties and taxes were calculated for this shipment
     * AND duties, taxes and transportation charges are all paid by the same
     * sender's account.
     */
    public void setTotalNetChargeWithDutiesAndTaxes(Money totalNetChargeWithDutiesAndTaxes) {
        this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
    }


    /**
     * Gets the shipmentLegRateDetails value for this ShipmentRateDetail.
     * 
     * @return shipmentLegRateDetails   * Identifies the Rate Details per each leg in a Freight Shipment
     */
    public com.fedex.openship.stub.ShipmentLegRateDetail[] getShipmentLegRateDetails() {
        return shipmentLegRateDetails;
    }


    /**
     * Sets the shipmentLegRateDetails value for this ShipmentRateDetail.
     * 
     * @param shipmentLegRateDetails   * Identifies the Rate Details per each leg in a Freight Shipment
     */
    public void setShipmentLegRateDetails(com.fedex.openship.stub.ShipmentLegRateDetail[] shipmentLegRateDetails) {
        this.shipmentLegRateDetails = shipmentLegRateDetails;
    }

    public com.fedex.openship.stub.ShipmentLegRateDetail getShipmentLegRateDetails(int i) {
        return this.shipmentLegRateDetails[i];
    }

    public void setShipmentLegRateDetails(int i, com.fedex.openship.stub.ShipmentLegRateDetail _value) {
        this.shipmentLegRateDetails[i] = _value;
    }


    /**
     * Gets the freightRateDetail value for this ShipmentRateDetail.
     * 
     * @return freightRateDetail   * Rate data specific to FedEx Freight and FedEx National Freight
     * services.
     */
    public FreightRateDetail getFreightRateDetail() {
        return freightRateDetail;
    }


    /**
     * Sets the freightRateDetail value for this ShipmentRateDetail.
     * 
     * @param freightRateDetail   * Rate data specific to FedEx Freight and FedEx National Freight
     * services.
     */
    public void setFreightRateDetail(FreightRateDetail freightRateDetail) {
        this.freightRateDetail = freightRateDetail;
    }


    /**
     * Gets the freightDiscounts value for this ShipmentRateDetail.
     * 
     * @return freightDiscounts   * All rate discounts that apply to this shipment.
     */
    public RateDiscount[] getFreightDiscounts() {
        return freightDiscounts;
    }


    /**
     * Sets the freightDiscounts value for this ShipmentRateDetail.
     * 
     * @param freightDiscounts   * All rate discounts that apply to this shipment.
     */
    public void setFreightDiscounts(RateDiscount[] freightDiscounts) {
        this.freightDiscounts = freightDiscounts;
    }

    public RateDiscount getFreightDiscounts(int i) {
        return this.freightDiscounts[i];
    }

    public void setFreightDiscounts(int i, RateDiscount _value) {
        this.freightDiscounts[i] = _value;
    }


    /**
     * Gets the rebates value for this ShipmentRateDetail.
     * 
     * @return rebates   * All rebates that apply to this shipment.
     */
    public Rebate[] getRebates() {
        return rebates;
    }


    /**
     * Sets the rebates value for this ShipmentRateDetail.
     * 
     * @param rebates   * All rebates that apply to this shipment.
     */
    public void setRebates(Rebate[] rebates) {
        this.rebates = rebates;
    }

    public Rebate getRebates(int i) {
        return this.rebates[i];
    }

    public void setRebates(int i, Rebate _value) {
        this.rebates[i] = _value;
    }


    /**
     * Gets the surcharges value for this ShipmentRateDetail.
     * 
     * @return surcharges   * All surcharges that apply to this shipment.
     */
    public Surcharge[] getSurcharges() {
        return surcharges;
    }


    /**
     * Sets the surcharges value for this ShipmentRateDetail.
     * 
     * @param surcharges   * All surcharges that apply to this shipment.
     */
    public void setSurcharges(Surcharge[] surcharges) {
        this.surcharges = surcharges;
    }

    public Surcharge getSurcharges(int i) {
        return this.surcharges[i];
    }

    public void setSurcharges(int i, Surcharge _value) {
        this.surcharges[i] = _value;
    }


    /**
     * Gets the taxes value for this ShipmentRateDetail.
     * 
     * @return taxes   * All transportation-based taxes applicable to this shipment.
     */
    public Tax[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this ShipmentRateDetail.
     * 
     * @param taxes   * All transportation-based taxes applicable to this shipment.
     */
    public void setTaxes(Tax[] taxes) {
        this.taxes = taxes;
    }

    public Tax getTaxes(int i) {
        return this.taxes[i];
    }

    public void setTaxes(int i, Tax _value) {
        this.taxes[i] = _value;
    }


    /**
     * Gets the dutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @return dutiesAndTaxes   * All commodity-based duties and taxes applicable to this shipment.
     */
    public EdtCommodityTax[] getDutiesAndTaxes() {
        return dutiesAndTaxes;
    }


    /**
     * Sets the dutiesAndTaxes value for this ShipmentRateDetail.
     * 
     * @param dutiesAndTaxes   * All commodity-based duties and taxes applicable to this shipment.
     */
    public void setDutiesAndTaxes(EdtCommodityTax[] dutiesAndTaxes) {
        this.dutiesAndTaxes = dutiesAndTaxes;
    }

    public EdtCommodityTax getDutiesAndTaxes(int i) {
        return this.dutiesAndTaxes[i];
    }

    public void setDutiesAndTaxes(int i, EdtCommodityTax _value) {
        this.dutiesAndTaxes[i] = _value;
    }


    /**
     * Gets the variableHandlingCharges value for this ShipmentRateDetail.
     * 
     * @return variableHandlingCharges   * The "order level" variable handling charges.
     */
    public com.fedex.openship.stub.VariableHandlingCharges getVariableHandlingCharges() {
        return variableHandlingCharges;
    }


    /**
     * Sets the variableHandlingCharges value for this ShipmentRateDetail.
     * 
     * @param variableHandlingCharges   * The "order level" variable handling charges.
     */
    public void setVariableHandlingCharges(com.fedex.openship.stub.VariableHandlingCharges variableHandlingCharges) {
        this.variableHandlingCharges = variableHandlingCharges;
    }


    /**
     * Gets the totalVariableHandlingCharges value for this ShipmentRateDetail.
     * 
     * @return totalVariableHandlingCharges   * The total of all variable handling charges at both shipment
     * (order) and package level.
     */
    public com.fedex.openship.stub.VariableHandlingCharges getTotalVariableHandlingCharges() {
        return totalVariableHandlingCharges;
    }


    /**
     * Sets the totalVariableHandlingCharges value for this ShipmentRateDetail.
     * 
     * @param totalVariableHandlingCharges   * The total of all variable handling charges at both shipment
     * (order) and package level.
     */
    public void setTotalVariableHandlingCharges(com.fedex.openship.stub.VariableHandlingCharges totalVariableHandlingCharges) {
        this.totalVariableHandlingCharges = totalVariableHandlingCharges;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShipmentRateDetail)) return false;
        ShipmentRateDetail other = (ShipmentRateDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.rateScale==null && other.getRateScale()==null) || 
             (this.rateScale!=null &&
              this.rateScale.equals(other.getRateScale()))) &&
            ((this.rateZone==null && other.getRateZone()==null) || 
             (this.rateZone!=null &&
              this.rateZone.equals(other.getRateZone()))) &&
            ((this.pricingCode==null && other.getPricingCode()==null) || 
             (this.pricingCode!=null &&
              this.pricingCode.equals(other.getPricingCode()))) &&
            ((this.ratedWeightMethod==null && other.getRatedWeightMethod()==null) || 
             (this.ratedWeightMethod!=null &&
              this.ratedWeightMethod.equals(other.getRatedWeightMethod()))) &&
            ((this.minimumChargeType==null && other.getMinimumChargeType()==null) || 
             (this.minimumChargeType!=null &&
              this.minimumChargeType.equals(other.getMinimumChargeType()))) &&
            ((this.currencyExchangeRate==null && other.getCurrencyExchangeRate()==null) || 
             (this.currencyExchangeRate!=null &&
              this.currencyExchangeRate.equals(other.getCurrencyExchangeRate()))) &&
            ((this.specialRatingApplied==null && other.getSpecialRatingApplied()==null) || 
             (this.specialRatingApplied!=null &&
              java.util.Arrays.equals(this.specialRatingApplied, other.getSpecialRatingApplied()))) &&
            ((this.dimDivisor==null && other.getDimDivisor()==null) || 
             (this.dimDivisor!=null &&
              this.dimDivisor.equals(other.getDimDivisor()))) &&
            ((this.dimDivisorType==null && other.getDimDivisorType()==null) || 
             (this.dimDivisorType!=null &&
              this.dimDivisorType.equals(other.getDimDivisorType()))) &&
            ((this.fuelSurchargePercent==null && other.getFuelSurchargePercent()==null) || 
             (this.fuelSurchargePercent!=null &&
              this.fuelSurchargePercent.equals(other.getFuelSurchargePercent()))) &&
            ((this.totalBillingWeight==null && other.getTotalBillingWeight()==null) || 
             (this.totalBillingWeight!=null &&
              this.totalBillingWeight.equals(other.getTotalBillingWeight()))) &&
            ((this.totalDimWeight==null && other.getTotalDimWeight()==null) || 
             (this.totalDimWeight!=null &&
              this.totalDimWeight.equals(other.getTotalDimWeight()))) &&
            ((this.totalBaseCharge==null && other.getTotalBaseCharge()==null) || 
             (this.totalBaseCharge!=null &&
              this.totalBaseCharge.equals(other.getTotalBaseCharge()))) &&
            ((this.totalFreightDiscounts==null && other.getTotalFreightDiscounts()==null) || 
             (this.totalFreightDiscounts!=null &&
              this.totalFreightDiscounts.equals(other.getTotalFreightDiscounts()))) &&
            ((this.totalNetFreight==null && other.getTotalNetFreight()==null) || 
             (this.totalNetFreight!=null &&
              this.totalNetFreight.equals(other.getTotalNetFreight()))) &&
            ((this.totalSurcharges==null && other.getTotalSurcharges()==null) || 
             (this.totalSurcharges!=null &&
              this.totalSurcharges.equals(other.getTotalSurcharges()))) &&
            ((this.totalNetFedExCharge==null && other.getTotalNetFedExCharge()==null) || 
             (this.totalNetFedExCharge!=null &&
              this.totalNetFedExCharge.equals(other.getTotalNetFedExCharge()))) &&
            ((this.totalTaxes==null && other.getTotalTaxes()==null) || 
             (this.totalTaxes!=null &&
              this.totalTaxes.equals(other.getTotalTaxes()))) &&
            ((this.totalNetCharge==null && other.getTotalNetCharge()==null) || 
             (this.totalNetCharge!=null &&
              this.totalNetCharge.equals(other.getTotalNetCharge()))) &&
            ((this.totalRebates==null && other.getTotalRebates()==null) || 
             (this.totalRebates!=null &&
              this.totalRebates.equals(other.getTotalRebates()))) &&
            ((this.totalDutiesAndTaxes==null && other.getTotalDutiesAndTaxes()==null) || 
             (this.totalDutiesAndTaxes!=null &&
              this.totalDutiesAndTaxes.equals(other.getTotalDutiesAndTaxes()))) &&
            ((this.totalNetChargeWithDutiesAndTaxes==null && other.getTotalNetChargeWithDutiesAndTaxes()==null) || 
             (this.totalNetChargeWithDutiesAndTaxes!=null &&
              this.totalNetChargeWithDutiesAndTaxes.equals(other.getTotalNetChargeWithDutiesAndTaxes()))) &&
            ((this.shipmentLegRateDetails==null && other.getShipmentLegRateDetails()==null) || 
             (this.shipmentLegRateDetails!=null &&
              java.util.Arrays.equals(this.shipmentLegRateDetails, other.getShipmentLegRateDetails()))) &&
            ((this.freightRateDetail==null && other.getFreightRateDetail()==null) || 
             (this.freightRateDetail!=null &&
              this.freightRateDetail.equals(other.getFreightRateDetail()))) &&
            ((this.freightDiscounts==null && other.getFreightDiscounts()==null) || 
             (this.freightDiscounts!=null &&
              java.util.Arrays.equals(this.freightDiscounts, other.getFreightDiscounts()))) &&
            ((this.rebates==null && other.getRebates()==null) || 
             (this.rebates!=null &&
              java.util.Arrays.equals(this.rebates, other.getRebates()))) &&
            ((this.surcharges==null && other.getSurcharges()==null) || 
             (this.surcharges!=null &&
              java.util.Arrays.equals(this.surcharges, other.getSurcharges()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.dutiesAndTaxes==null && other.getDutiesAndTaxes()==null) || 
             (this.dutiesAndTaxes!=null &&
              java.util.Arrays.equals(this.dutiesAndTaxes, other.getDutiesAndTaxes()))) &&
            ((this.variableHandlingCharges==null && other.getVariableHandlingCharges()==null) || 
             (this.variableHandlingCharges!=null &&
              this.variableHandlingCharges.equals(other.getVariableHandlingCharges()))) &&
            ((this.totalVariableHandlingCharges==null && other.getTotalVariableHandlingCharges()==null) || 
             (this.totalVariableHandlingCharges!=null &&
              this.totalVariableHandlingCharges.equals(other.getTotalVariableHandlingCharges())));
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
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getRateScale() != null) {
            _hashCode += getRateScale().hashCode();
        }
        if (getRateZone() != null) {
            _hashCode += getRateZone().hashCode();
        }
        if (getPricingCode() != null) {
            _hashCode += getPricingCode().hashCode();
        }
        if (getRatedWeightMethod() != null) {
            _hashCode += getRatedWeightMethod().hashCode();
        }
        if (getMinimumChargeType() != null) {
            _hashCode += getMinimumChargeType().hashCode();
        }
        if (getCurrencyExchangeRate() != null) {
            _hashCode += getCurrencyExchangeRate().hashCode();
        }
        if (getSpecialRatingApplied() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialRatingApplied());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialRatingApplied(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDimDivisor() != null) {
            _hashCode += getDimDivisor().hashCode();
        }
        if (getDimDivisorType() != null) {
            _hashCode += getDimDivisorType().hashCode();
        }
        if (getFuelSurchargePercent() != null) {
            _hashCode += getFuelSurchargePercent().hashCode();
        }
        if (getTotalBillingWeight() != null) {
            _hashCode += getTotalBillingWeight().hashCode();
        }
        if (getTotalDimWeight() != null) {
            _hashCode += getTotalDimWeight().hashCode();
        }
        if (getTotalBaseCharge() != null) {
            _hashCode += getTotalBaseCharge().hashCode();
        }
        if (getTotalFreightDiscounts() != null) {
            _hashCode += getTotalFreightDiscounts().hashCode();
        }
        if (getTotalNetFreight() != null) {
            _hashCode += getTotalNetFreight().hashCode();
        }
        if (getTotalSurcharges() != null) {
            _hashCode += getTotalSurcharges().hashCode();
        }
        if (getTotalNetFedExCharge() != null) {
            _hashCode += getTotalNetFedExCharge().hashCode();
        }
        if (getTotalTaxes() != null) {
            _hashCode += getTotalTaxes().hashCode();
        }
        if (getTotalNetCharge() != null) {
            _hashCode += getTotalNetCharge().hashCode();
        }
        if (getTotalRebates() != null) {
            _hashCode += getTotalRebates().hashCode();
        }
        if (getTotalDutiesAndTaxes() != null) {
            _hashCode += getTotalDutiesAndTaxes().hashCode();
        }
        if (getTotalNetChargeWithDutiesAndTaxes() != null) {
            _hashCode += getTotalNetChargeWithDutiesAndTaxes().hashCode();
        }
        if (getShipmentLegRateDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentLegRateDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShipmentLegRateDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreightRateDetail() != null) {
            _hashCode += getFreightRateDetail().hashCode();
        }
        if (getFreightDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreightDiscounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFreightDiscounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRebates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRebates());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRebates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurcharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurcharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSurcharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDutiesAndTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDutiesAndTaxes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDutiesAndTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariableHandlingCharges() != null) {
            _hashCode += getVariableHandlingCharges().hashCode();
        }
        if (getTotalVariableHandlingCharges() != null) {
            _hashCode += getTotalVariableHandlingCharges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentRateDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRateDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateScale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PricingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PricingCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratedWeightMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RatedWeightMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RatedWeightMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumChargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MinimumChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MinimumChargeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CurrencyExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CurrencyExchangeRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialRatingApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialRatingApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialRatingAppliedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimDivisor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DimDivisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimDivisorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DimDivisorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateDimensionalDivisorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelSurchargePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FuelSurchargePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBillingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalBillingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDimWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalDimWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBaseCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalBaseCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFreightDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalFreightDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetFreight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalNetFreight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSurcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalSurcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetFedExCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalNetFedExCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalNetCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRebates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalRebates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalDutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNetChargeWithDutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalNetChargeWithDutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentLegRateDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentLegRateDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentLegRateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightRateDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Rebates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Rebate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Surcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Surcharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesAndTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DutiesAndTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtCommodityTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharges"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVariableHandlingCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalVariableHandlingCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharges"));
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

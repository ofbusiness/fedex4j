/**
 * InternationalDistributionSummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Totals accumulated during the processing of CRNs into the consolidation.
 */
public class InternationalDistributionSummaryDetail  implements java.io.Serializable {
    private Weight totalWeight;

    private org.apache.axis.types.NonNegativeInteger totalPackageCount;

    private org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount;

    private Money totalCustomsValue;

    private Money totalInsuredValue;

    private Money totalFreightCharges;

    private Money totalInsuranceCharges;

    private Money totalTaxesOrMiscellaneousCharges;

    private Money totalHandlingCosts;

    private Money totalPackingCosts;

    private ShipmentDryIceDetail dryIceDetail;

    private DangerousGoodsAccessibilityType dangerousGoodsAccessibility;

    public InternationalDistributionSummaryDetail() {
    }

    public InternationalDistributionSummaryDetail(
           Weight totalWeight,
           org.apache.axis.types.NonNegativeInteger totalPackageCount,
           org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount,
           Money totalCustomsValue,
           Money totalInsuredValue,
           Money totalFreightCharges,
           Money totalInsuranceCharges,
           Money totalTaxesOrMiscellaneousCharges,
           Money totalHandlingCosts,
           Money totalPackingCosts,
           ShipmentDryIceDetail dryIceDetail,
           DangerousGoodsAccessibilityType dangerousGoodsAccessibility) {
           this.totalWeight = totalWeight;
           this.totalPackageCount = totalPackageCount;
           this.totalUniqueAddressCount = totalUniqueAddressCount;
           this.totalCustomsValue = totalCustomsValue;
           this.totalInsuredValue = totalInsuredValue;
           this.totalFreightCharges = totalFreightCharges;
           this.totalInsuranceCharges = totalInsuranceCharges;
           this.totalTaxesOrMiscellaneousCharges = totalTaxesOrMiscellaneousCharges;
           this.totalHandlingCosts = totalHandlingCosts;
           this.totalPackingCosts = totalPackingCosts;
           this.dryIceDetail = dryIceDetail;
           this.dangerousGoodsAccessibility = dangerousGoodsAccessibility;
    }


    /**
     * Gets the totalWeight value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalWeight
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalWeight
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalPackageCount value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalPackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPackageCount() {
        return totalPackageCount;
    }


    /**
     * Sets the totalPackageCount value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalPackageCount
     */
    public void setTotalPackageCount(org.apache.axis.types.NonNegativeInteger totalPackageCount) {
        this.totalPackageCount = totalPackageCount;
    }


    /**
     * Gets the totalUniqueAddressCount value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalUniqueAddressCount
     */
    public org.apache.axis.types.NonNegativeInteger getTotalUniqueAddressCount() {
        return totalUniqueAddressCount;
    }


    /**
     * Sets the totalUniqueAddressCount value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalUniqueAddressCount
     */
    public void setTotalUniqueAddressCount(org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount) {
        this.totalUniqueAddressCount = totalUniqueAddressCount;
    }


    /**
     * Gets the totalCustomsValue value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalCustomsValue
     */
    public Money getTotalCustomsValue() {
        return totalCustomsValue;
    }


    /**
     * Sets the totalCustomsValue value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalCustomsValue
     */
    public void setTotalCustomsValue(Money totalCustomsValue) {
        this.totalCustomsValue = totalCustomsValue;
    }


    /**
     * Gets the totalInsuredValue value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalInsuredValue
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalInsuredValue
     */
    public void setTotalInsuredValue(Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the totalFreightCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalFreightCharges
     */
    public Money getTotalFreightCharges() {
        return totalFreightCharges;
    }


    /**
     * Sets the totalFreightCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalFreightCharges
     */
    public void setTotalFreightCharges(Money totalFreightCharges) {
        this.totalFreightCharges = totalFreightCharges;
    }


    /**
     * Gets the totalInsuranceCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalInsuranceCharges
     */
    public Money getTotalInsuranceCharges() {
        return totalInsuranceCharges;
    }


    /**
     * Sets the totalInsuranceCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalInsuranceCharges
     */
    public void setTotalInsuranceCharges(Money totalInsuranceCharges) {
        this.totalInsuranceCharges = totalInsuranceCharges;
    }


    /**
     * Gets the totalTaxesOrMiscellaneousCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalTaxesOrMiscellaneousCharges
     */
    public Money getTotalTaxesOrMiscellaneousCharges() {
        return totalTaxesOrMiscellaneousCharges;
    }


    /**
     * Sets the totalTaxesOrMiscellaneousCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalTaxesOrMiscellaneousCharges
     */
    public void setTotalTaxesOrMiscellaneousCharges(Money totalTaxesOrMiscellaneousCharges) {
        this.totalTaxesOrMiscellaneousCharges = totalTaxesOrMiscellaneousCharges;
    }


    /**
     * Gets the totalHandlingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalHandlingCosts
     */
    public Money getTotalHandlingCosts() {
        return totalHandlingCosts;
    }


    /**
     * Sets the totalHandlingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalHandlingCosts
     */
    public void setTotalHandlingCosts(Money totalHandlingCosts) {
        this.totalHandlingCosts = totalHandlingCosts;
    }


    /**
     * Gets the totalPackingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalPackingCosts
     */
    public Money getTotalPackingCosts() {
        return totalPackingCosts;
    }


    /**
     * Sets the totalPackingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalPackingCosts
     */
    public void setTotalPackingCosts(Money totalPackingCosts) {
        this.totalPackingCosts = totalPackingCosts;
    }


    /**
     * Gets the dryIceDetail value for this InternationalDistributionSummaryDetail.
     * 
     * @return dryIceDetail
     */
    public ShipmentDryIceDetail getDryIceDetail() {
        return dryIceDetail;
    }


    /**
     * Sets the dryIceDetail value for this InternationalDistributionSummaryDetail.
     * 
     * @param dryIceDetail
     */
    public void setDryIceDetail(ShipmentDryIceDetail dryIceDetail) {
        this.dryIceDetail = dryIceDetail;
    }


    /**
     * Gets the dangerousGoodsAccessibility value for this InternationalDistributionSummaryDetail.
     * 
     * @return dangerousGoodsAccessibility
     */
    public DangerousGoodsAccessibilityType getDangerousGoodsAccessibility() {
        return dangerousGoodsAccessibility;
    }


    /**
     * Sets the dangerousGoodsAccessibility value for this InternationalDistributionSummaryDetail.
     * 
     * @param dangerousGoodsAccessibility
     */
    public void setDangerousGoodsAccessibility(DangerousGoodsAccessibilityType dangerousGoodsAccessibility) {
        this.dangerousGoodsAccessibility = dangerousGoodsAccessibility;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InternationalDistributionSummaryDetail)) return false;
        InternationalDistributionSummaryDetail other = (InternationalDistributionSummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalPackageCount==null && other.getTotalPackageCount()==null) || 
             (this.totalPackageCount!=null &&
              this.totalPackageCount.equals(other.getTotalPackageCount()))) &&
            ((this.totalUniqueAddressCount==null && other.getTotalUniqueAddressCount()==null) || 
             (this.totalUniqueAddressCount!=null &&
              this.totalUniqueAddressCount.equals(other.getTotalUniqueAddressCount()))) &&
            ((this.totalCustomsValue==null && other.getTotalCustomsValue()==null) || 
             (this.totalCustomsValue!=null &&
              this.totalCustomsValue.equals(other.getTotalCustomsValue()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.totalFreightCharges==null && other.getTotalFreightCharges()==null) || 
             (this.totalFreightCharges!=null &&
              this.totalFreightCharges.equals(other.getTotalFreightCharges()))) &&
            ((this.totalInsuranceCharges==null && other.getTotalInsuranceCharges()==null) || 
             (this.totalInsuranceCharges!=null &&
              this.totalInsuranceCharges.equals(other.getTotalInsuranceCharges()))) &&
            ((this.totalTaxesOrMiscellaneousCharges==null && other.getTotalTaxesOrMiscellaneousCharges()==null) || 
             (this.totalTaxesOrMiscellaneousCharges!=null &&
              this.totalTaxesOrMiscellaneousCharges.equals(other.getTotalTaxesOrMiscellaneousCharges()))) &&
            ((this.totalHandlingCosts==null && other.getTotalHandlingCosts()==null) || 
             (this.totalHandlingCosts!=null &&
              this.totalHandlingCosts.equals(other.getTotalHandlingCosts()))) &&
            ((this.totalPackingCosts==null && other.getTotalPackingCosts()==null) || 
             (this.totalPackingCosts!=null &&
              this.totalPackingCosts.equals(other.getTotalPackingCosts()))) &&
            ((this.dryIceDetail==null && other.getDryIceDetail()==null) || 
             (this.dryIceDetail!=null &&
              this.dryIceDetail.equals(other.getDryIceDetail()))) &&
            ((this.dangerousGoodsAccessibility==null && other.getDangerousGoodsAccessibility()==null) || 
             (this.dangerousGoodsAccessibility!=null &&
              this.dangerousGoodsAccessibility.equals(other.getDangerousGoodsAccessibility())));
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
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalPackageCount() != null) {
            _hashCode += getTotalPackageCount().hashCode();
        }
        if (getTotalUniqueAddressCount() != null) {
            _hashCode += getTotalUniqueAddressCount().hashCode();
        }
        if (getTotalCustomsValue() != null) {
            _hashCode += getTotalCustomsValue().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getTotalFreightCharges() != null) {
            _hashCode += getTotalFreightCharges().hashCode();
        }
        if (getTotalInsuranceCharges() != null) {
            _hashCode += getTotalInsuranceCharges().hashCode();
        }
        if (getTotalTaxesOrMiscellaneousCharges() != null) {
            _hashCode += getTotalTaxesOrMiscellaneousCharges().hashCode();
        }
        if (getTotalHandlingCosts() != null) {
            _hashCode += getTotalHandlingCosts().hashCode();
        }
        if (getTotalPackingCosts() != null) {
            _hashCode += getTotalPackingCosts().hashCode();
        }
        if (getDryIceDetail() != null) {
            _hashCode += getDryIceDetail().hashCode();
        }
        if (getDangerousGoodsAccessibility() != null) {
            _hashCode += getDangerousGoodsAccessibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalDistributionSummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionSummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUniqueAddressCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalUniqueAddressCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCustomsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalCustomsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
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
        elemField.setFieldName("totalFreightCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalFreightCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuranceCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalInsuranceCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxesOrMiscellaneousCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalTaxesOrMiscellaneousCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHandlingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalHandlingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPackingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TotalPackingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsAccessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsAccessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsAccessibilityType"));
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

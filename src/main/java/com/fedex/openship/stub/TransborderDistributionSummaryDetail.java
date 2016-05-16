/**
 * TransborderDistributionSummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the summary of aggregates that are maintianed for a transborder
 * consolidation.
 */
public class TransborderDistributionSummaryDetail  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger expressPackageCount;

    private Weight expressTotalPackageWeight;

    private Weight expressTotalPackageAdjustedWeight;

    private org.apache.axis.types.NonNegativeInteger expressFreightPackageCount;

    private Weight expressTotalFreightWeight;

    private Weight expressTotalFreightAdjustedWeight;

    private org.apache.axis.types.NonNegativeInteger groundPackageCount;

    private Weight groundTotalPackageWeight;

    private Weight groundTotalPackageAdjustedWeight;

    /* The number of commodities that are unique commodities in the
     * consolidation. These commodities are mentioned as separate items on
     * the consolidated commercial invoice. */
    private org.apache.axis.types.NonNegativeInteger numberOfUnconsolidatedCommodities;

    public TransborderDistributionSummaryDetail() {
    }

    public TransborderDistributionSummaryDetail(
           org.apache.axis.types.NonNegativeInteger expressPackageCount,
           Weight expressTotalPackageWeight,
           Weight expressTotalPackageAdjustedWeight,
           org.apache.axis.types.NonNegativeInteger expressFreightPackageCount,
           Weight expressTotalFreightWeight,
           Weight expressTotalFreightAdjustedWeight,
           org.apache.axis.types.NonNegativeInteger groundPackageCount,
           Weight groundTotalPackageWeight,
           Weight groundTotalPackageAdjustedWeight,
           org.apache.axis.types.NonNegativeInteger numberOfUnconsolidatedCommodities) {
           this.expressPackageCount = expressPackageCount;
           this.expressTotalPackageWeight = expressTotalPackageWeight;
           this.expressTotalPackageAdjustedWeight = expressTotalPackageAdjustedWeight;
           this.expressFreightPackageCount = expressFreightPackageCount;
           this.expressTotalFreightWeight = expressTotalFreightWeight;
           this.expressTotalFreightAdjustedWeight = expressTotalFreightAdjustedWeight;
           this.groundPackageCount = groundPackageCount;
           this.groundTotalPackageWeight = groundTotalPackageWeight;
           this.groundTotalPackageAdjustedWeight = groundTotalPackageAdjustedWeight;
           this.numberOfUnconsolidatedCommodities = numberOfUnconsolidatedCommodities;
    }


    /**
     * Gets the expressPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressPackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getExpressPackageCount() {
        return expressPackageCount;
    }


    /**
     * Sets the expressPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressPackageCount
     */
    public void setExpressPackageCount(org.apache.axis.types.NonNegativeInteger expressPackageCount) {
        this.expressPackageCount = expressPackageCount;
    }


    /**
     * Gets the expressTotalPackageWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressTotalPackageWeight
     */
    public Weight getExpressTotalPackageWeight() {
        return expressTotalPackageWeight;
    }


    /**
     * Sets the expressTotalPackageWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressTotalPackageWeight
     */
    public void setExpressTotalPackageWeight(Weight expressTotalPackageWeight) {
        this.expressTotalPackageWeight = expressTotalPackageWeight;
    }


    /**
     * Gets the expressTotalPackageAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressTotalPackageAdjustedWeight
     */
    public Weight getExpressTotalPackageAdjustedWeight() {
        return expressTotalPackageAdjustedWeight;
    }


    /**
     * Sets the expressTotalPackageAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressTotalPackageAdjustedWeight
     */
    public void setExpressTotalPackageAdjustedWeight(Weight expressTotalPackageAdjustedWeight) {
        this.expressTotalPackageAdjustedWeight = expressTotalPackageAdjustedWeight;
    }


    /**
     * Gets the expressFreightPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressFreightPackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getExpressFreightPackageCount() {
        return expressFreightPackageCount;
    }


    /**
     * Sets the expressFreightPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressFreightPackageCount
     */
    public void setExpressFreightPackageCount(org.apache.axis.types.NonNegativeInteger expressFreightPackageCount) {
        this.expressFreightPackageCount = expressFreightPackageCount;
    }


    /**
     * Gets the expressTotalFreightWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressTotalFreightWeight
     */
    public Weight getExpressTotalFreightWeight() {
        return expressTotalFreightWeight;
    }


    /**
     * Sets the expressTotalFreightWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressTotalFreightWeight
     */
    public void setExpressTotalFreightWeight(Weight expressTotalFreightWeight) {
        this.expressTotalFreightWeight = expressTotalFreightWeight;
    }


    /**
     * Gets the expressTotalFreightAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return expressTotalFreightAdjustedWeight
     */
    public Weight getExpressTotalFreightAdjustedWeight() {
        return expressTotalFreightAdjustedWeight;
    }


    /**
     * Sets the expressTotalFreightAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param expressTotalFreightAdjustedWeight
     */
    public void setExpressTotalFreightAdjustedWeight(Weight expressTotalFreightAdjustedWeight) {
        this.expressTotalFreightAdjustedWeight = expressTotalFreightAdjustedWeight;
    }


    /**
     * Gets the groundPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @return groundPackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getGroundPackageCount() {
        return groundPackageCount;
    }


    /**
     * Sets the groundPackageCount value for this TransborderDistributionSummaryDetail.
     * 
     * @param groundPackageCount
     */
    public void setGroundPackageCount(org.apache.axis.types.NonNegativeInteger groundPackageCount) {
        this.groundPackageCount = groundPackageCount;
    }


    /**
     * Gets the groundTotalPackageWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return groundTotalPackageWeight
     */
    public Weight getGroundTotalPackageWeight() {
        return groundTotalPackageWeight;
    }


    /**
     * Sets the groundTotalPackageWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param groundTotalPackageWeight
     */
    public void setGroundTotalPackageWeight(Weight groundTotalPackageWeight) {
        this.groundTotalPackageWeight = groundTotalPackageWeight;
    }


    /**
     * Gets the groundTotalPackageAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @return groundTotalPackageAdjustedWeight
     */
    public Weight getGroundTotalPackageAdjustedWeight() {
        return groundTotalPackageAdjustedWeight;
    }


    /**
     * Sets the groundTotalPackageAdjustedWeight value for this TransborderDistributionSummaryDetail.
     * 
     * @param groundTotalPackageAdjustedWeight
     */
    public void setGroundTotalPackageAdjustedWeight(Weight groundTotalPackageAdjustedWeight) {
        this.groundTotalPackageAdjustedWeight = groundTotalPackageAdjustedWeight;
    }


    /**
     * Gets the numberOfUnconsolidatedCommodities value for this TransborderDistributionSummaryDetail.
     * 
     * @return numberOfUnconsolidatedCommodities   * The number of commodities that are unique commodities in the
     * consolidation. These commodities are mentioned as separate items on
     * the consolidated commercial invoice.
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfUnconsolidatedCommodities() {
        return numberOfUnconsolidatedCommodities;
    }


    /**
     * Sets the numberOfUnconsolidatedCommodities value for this TransborderDistributionSummaryDetail.
     * 
     * @param numberOfUnconsolidatedCommodities   * The number of commodities that are unique commodities in the
     * consolidation. These commodities are mentioned as separate items on
     * the consolidated commercial invoice.
     */
    public void setNumberOfUnconsolidatedCommodities(org.apache.axis.types.NonNegativeInteger numberOfUnconsolidatedCommodities) {
        this.numberOfUnconsolidatedCommodities = numberOfUnconsolidatedCommodities;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransborderDistributionSummaryDetail)) return false;
        TransborderDistributionSummaryDetail other = (TransborderDistributionSummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expressPackageCount==null && other.getExpressPackageCount()==null) || 
             (this.expressPackageCount!=null &&
              this.expressPackageCount.equals(other.getExpressPackageCount()))) &&
            ((this.expressTotalPackageWeight==null && other.getExpressTotalPackageWeight()==null) || 
             (this.expressTotalPackageWeight!=null &&
              this.expressTotalPackageWeight.equals(other.getExpressTotalPackageWeight()))) &&
            ((this.expressTotalPackageAdjustedWeight==null && other.getExpressTotalPackageAdjustedWeight()==null) || 
             (this.expressTotalPackageAdjustedWeight!=null &&
              this.expressTotalPackageAdjustedWeight.equals(other.getExpressTotalPackageAdjustedWeight()))) &&
            ((this.expressFreightPackageCount==null && other.getExpressFreightPackageCount()==null) || 
             (this.expressFreightPackageCount!=null &&
              this.expressFreightPackageCount.equals(other.getExpressFreightPackageCount()))) &&
            ((this.expressTotalFreightWeight==null && other.getExpressTotalFreightWeight()==null) || 
             (this.expressTotalFreightWeight!=null &&
              this.expressTotalFreightWeight.equals(other.getExpressTotalFreightWeight()))) &&
            ((this.expressTotalFreightAdjustedWeight==null && other.getExpressTotalFreightAdjustedWeight()==null) || 
             (this.expressTotalFreightAdjustedWeight!=null &&
              this.expressTotalFreightAdjustedWeight.equals(other.getExpressTotalFreightAdjustedWeight()))) &&
            ((this.groundPackageCount==null && other.getGroundPackageCount()==null) || 
             (this.groundPackageCount!=null &&
              this.groundPackageCount.equals(other.getGroundPackageCount()))) &&
            ((this.groundTotalPackageWeight==null && other.getGroundTotalPackageWeight()==null) || 
             (this.groundTotalPackageWeight!=null &&
              this.groundTotalPackageWeight.equals(other.getGroundTotalPackageWeight()))) &&
            ((this.groundTotalPackageAdjustedWeight==null && other.getGroundTotalPackageAdjustedWeight()==null) || 
             (this.groundTotalPackageAdjustedWeight!=null &&
              this.groundTotalPackageAdjustedWeight.equals(other.getGroundTotalPackageAdjustedWeight()))) &&
            ((this.numberOfUnconsolidatedCommodities==null && other.getNumberOfUnconsolidatedCommodities()==null) || 
             (this.numberOfUnconsolidatedCommodities!=null &&
              this.numberOfUnconsolidatedCommodities.equals(other.getNumberOfUnconsolidatedCommodities())));
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
        if (getExpressPackageCount() != null) {
            _hashCode += getExpressPackageCount().hashCode();
        }
        if (getExpressTotalPackageWeight() != null) {
            _hashCode += getExpressTotalPackageWeight().hashCode();
        }
        if (getExpressTotalPackageAdjustedWeight() != null) {
            _hashCode += getExpressTotalPackageAdjustedWeight().hashCode();
        }
        if (getExpressFreightPackageCount() != null) {
            _hashCode += getExpressFreightPackageCount().hashCode();
        }
        if (getExpressTotalFreightWeight() != null) {
            _hashCode += getExpressTotalFreightWeight().hashCode();
        }
        if (getExpressTotalFreightAdjustedWeight() != null) {
            _hashCode += getExpressTotalFreightAdjustedWeight().hashCode();
        }
        if (getGroundPackageCount() != null) {
            _hashCode += getGroundPackageCount().hashCode();
        }
        if (getGroundTotalPackageWeight() != null) {
            _hashCode += getGroundTotalPackageWeight().hashCode();
        }
        if (getGroundTotalPackageAdjustedWeight() != null) {
            _hashCode += getGroundTotalPackageAdjustedWeight().hashCode();
        }
        if (getNumberOfUnconsolidatedCommodities() != null) {
            _hashCode += getNumberOfUnconsolidatedCommodities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransborderDistributionSummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressTotalPackageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressTotalPackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressTotalPackageAdjustedWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressTotalPackageAdjustedWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressFreightPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressTotalFreightWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressTotalFreightWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressTotalFreightAdjustedWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressTotalFreightAdjustedWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groundPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GroundPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groundTotalPackageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GroundTotalPackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groundTotalPackageAdjustedWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GroundTotalPackageAdjustedWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfUnconsolidatedCommodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NumberOfUnconsolidatedCommodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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

/**
 * HazardousCommodityDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Identifies and describes an individual hazardous commodity.
 */
public class HazardousCommodityDescription  implements java.io.Serializable {
    /* Regulatory identifier for a commodity (e.g. "UN ID" value). */
    private String id;

    /* In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity. */
    private org.apache.axis.types.NonNegativeInteger sequenceNumber;

    private com.fedex.openship.stub.HazardousCommodityPackingGroupType packingGroup;

    private com.fedex.openship.stub.HazardousCommodityPackingDetail packingDetails;

    private Boolean reportableQuantity;

    private String properShippingName;

    private String technicalName;

    private java.math.BigDecimal percentage;

    private String hazardClass;

    private String[] subsidiaryClasses;

    private String labelText;

    /* Indicates any special processing options to be applied to the
     * description of the dangerous goods commodity. */
    private com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType[] processingOptions;

    /* Information related to quantity limitations and operator or
     * state variations as may be applicable to the dangerous goods commodity. */
    private String authorization;

    public HazardousCommodityDescription() {
    }

    public HazardousCommodityDescription(
           String id,
           org.apache.axis.types.NonNegativeInteger sequenceNumber,
           com.fedex.openship.stub.HazardousCommodityPackingGroupType packingGroup,
           com.fedex.openship.stub.HazardousCommodityPackingDetail packingDetails,
           Boolean reportableQuantity,
           String properShippingName,
           String technicalName,
           java.math.BigDecimal percentage,
           String hazardClass,
           String[] subsidiaryClasses,
           String labelText,
           com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType[] processingOptions,
           String authorization) {
           this.id = id;
           this.sequenceNumber = sequenceNumber;
           this.packingGroup = packingGroup;
           this.packingDetails = packingDetails;
           this.reportableQuantity = reportableQuantity;
           this.properShippingName = properShippingName;
           this.technicalName = technicalName;
           this.percentage = percentage;
           this.hazardClass = hazardClass;
           this.subsidiaryClasses = subsidiaryClasses;
           this.labelText = labelText;
           this.processingOptions = processingOptions;
           this.authorization = authorization;
    }


    /**
     * Gets the id value for this HazardousCommodityDescription.
     * 
     * @return id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this HazardousCommodityDescription.
     * 
     * @param id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the sequenceNumber value for this HazardousCommodityDescription.
     * 
     * @return sequenceNumber   * In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity.
     */
    public org.apache.axis.types.NonNegativeInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this HazardousCommodityDescription.
     * 
     * @param sequenceNumber   * In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity.
     */
    public void setSequenceNumber(org.apache.axis.types.NonNegativeInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the packingGroup value for this HazardousCommodityDescription.
     * 
     * @return packingGroup
     */
    public com.fedex.openship.stub.HazardousCommodityPackingGroupType getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this HazardousCommodityDescription.
     * 
     * @param packingGroup
     */
    public void setPackingGroup(com.fedex.openship.stub.HazardousCommodityPackingGroupType packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the packingDetails value for this HazardousCommodityDescription.
     * 
     * @return packingDetails
     */
    public com.fedex.openship.stub.HazardousCommodityPackingDetail getPackingDetails() {
        return packingDetails;
    }


    /**
     * Sets the packingDetails value for this HazardousCommodityDescription.
     * 
     * @param packingDetails
     */
    public void setPackingDetails(com.fedex.openship.stub.HazardousCommodityPackingDetail packingDetails) {
        this.packingDetails = packingDetails;
    }


    /**
     * Gets the reportableQuantity value for this HazardousCommodityDescription.
     * 
     * @return reportableQuantity
     */
    public Boolean getReportableQuantity() {
        return reportableQuantity;
    }


    /**
     * Sets the reportableQuantity value for this HazardousCommodityDescription.
     * 
     * @param reportableQuantity
     */
    public void setReportableQuantity(Boolean reportableQuantity) {
        this.reportableQuantity = reportableQuantity;
    }


    /**
     * Gets the properShippingName value for this HazardousCommodityDescription.
     * 
     * @return properShippingName
     */
    public String getProperShippingName() {
        return properShippingName;
    }


    /**
     * Sets the properShippingName value for this HazardousCommodityDescription.
     * 
     * @param properShippingName
     */
    public void setProperShippingName(String properShippingName) {
        this.properShippingName = properShippingName;
    }


    /**
     * Gets the technicalName value for this HazardousCommodityDescription.
     * 
     * @return technicalName
     */
    public String getTechnicalName() {
        return technicalName;
    }


    /**
     * Sets the technicalName value for this HazardousCommodityDescription.
     * 
     * @param technicalName
     */
    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }


    /**
     * Gets the percentage value for this HazardousCommodityDescription.
     * 
     * @return percentage
     */
    public java.math.BigDecimal getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this HazardousCommodityDescription.
     * 
     * @param percentage
     */
    public void setPercentage(java.math.BigDecimal percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the hazardClass value for this HazardousCommodityDescription.
     * 
     * @return hazardClass
     */
    public String getHazardClass() {
        return hazardClass;
    }


    /**
     * Sets the hazardClass value for this HazardousCommodityDescription.
     * 
     * @param hazardClass
     */
    public void setHazardClass(String hazardClass) {
        this.hazardClass = hazardClass;
    }


    /**
     * Gets the subsidiaryClasses value for this HazardousCommodityDescription.
     * 
     * @return subsidiaryClasses
     */
    public String[] getSubsidiaryClasses() {
        return subsidiaryClasses;
    }


    /**
     * Sets the subsidiaryClasses value for this HazardousCommodityDescription.
     * 
     * @param subsidiaryClasses
     */
    public void setSubsidiaryClasses(String[] subsidiaryClasses) {
        this.subsidiaryClasses = subsidiaryClasses;
    }

    public String getSubsidiaryClasses(int i) {
        return this.subsidiaryClasses[i];
    }

    public void setSubsidiaryClasses(int i, String _value) {
        this.subsidiaryClasses[i] = _value;
    }


    /**
     * Gets the labelText value for this HazardousCommodityDescription.
     * 
     * @return labelText
     */
    public String getLabelText() {
        return labelText;
    }


    /**
     * Sets the labelText value for this HazardousCommodityDescription.
     * 
     * @param labelText
     */
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }


    /**
     * Gets the processingOptions value for this HazardousCommodityDescription.
     * 
     * @return processingOptions   * Indicates any special processing options to be applied to the
     * description of the dangerous goods commodity.
     */
    public com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType[] getProcessingOptions() {
        return processingOptions;
    }


    /**
     * Sets the processingOptions value for this HazardousCommodityDescription.
     * 
     * @param processingOptions   * Indicates any special processing options to be applied to the
     * description of the dangerous goods commodity.
     */
    public void setProcessingOptions(com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType[] processingOptions) {
        this.processingOptions = processingOptions;
    }

    public com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType getProcessingOptions(int i) {
        return this.processingOptions[i];
    }

    public void setProcessingOptions(int i, com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType _value) {
        this.processingOptions[i] = _value;
    }


    /**
     * Gets the authorization value for this HazardousCommodityDescription.
     * 
     * @return authorization   * Information related to quantity limitations and operator or
     * state variations as may be applicable to the dangerous goods commodity.
     */
    public String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this HazardousCommodityDescription.
     * 
     * @param authorization   * Information related to quantity limitations and operator or
     * state variations as may be applicable to the dangerous goods commodity.
     */
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HazardousCommodityDescription)) return false;
        HazardousCommodityDescription other = (HazardousCommodityDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.packingGroup==null && other.getPackingGroup()==null) || 
             (this.packingGroup!=null &&
              this.packingGroup.equals(other.getPackingGroup()))) &&
            ((this.packingDetails==null && other.getPackingDetails()==null) || 
             (this.packingDetails!=null &&
              this.packingDetails.equals(other.getPackingDetails()))) &&
            ((this.reportableQuantity==null && other.getReportableQuantity()==null) || 
             (this.reportableQuantity!=null &&
              this.reportableQuantity.equals(other.getReportableQuantity()))) &&
            ((this.properShippingName==null && other.getProperShippingName()==null) || 
             (this.properShippingName!=null &&
              this.properShippingName.equals(other.getProperShippingName()))) &&
            ((this.technicalName==null && other.getTechnicalName()==null) || 
             (this.technicalName!=null &&
              this.technicalName.equals(other.getTechnicalName()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.hazardClass==null && other.getHazardClass()==null) || 
             (this.hazardClass!=null &&
              this.hazardClass.equals(other.getHazardClass()))) &&
            ((this.subsidiaryClasses==null && other.getSubsidiaryClasses()==null) || 
             (this.subsidiaryClasses!=null &&
              java.util.Arrays.equals(this.subsidiaryClasses, other.getSubsidiaryClasses()))) &&
            ((this.labelText==null && other.getLabelText()==null) || 
             (this.labelText!=null &&
              this.labelText.equals(other.getLabelText()))) &&
            ((this.processingOptions==null && other.getProcessingOptions()==null) || 
             (this.processingOptions!=null &&
              java.util.Arrays.equals(this.processingOptions, other.getProcessingOptions()))) &&
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getPackingGroup() != null) {
            _hashCode += getPackingGroup().hashCode();
        }
        if (getPackingDetails() != null) {
            _hashCode += getPackingDetails().hashCode();
        }
        if (getReportableQuantity() != null) {
            _hashCode += getReportableQuantity().hashCode();
        }
        if (getProperShippingName() != null) {
            _hashCode += getProperShippingName().hashCode();
        }
        if (getTechnicalName() != null) {
            _hashCode += getTechnicalName().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getHazardClass() != null) {
            _hashCode += getHazardClass().hashCode();
        }
        if (getSubsidiaryClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryClasses());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSubsidiaryClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelText() != null) {
            _hashCode += getLabelText().hashCode();
        }
        if (getProcessingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingOptions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProcessingOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportableQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReportableQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properShippingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ProperShippingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TechnicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SubsidiaryClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityDescriptionProcessingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Authorization"));
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

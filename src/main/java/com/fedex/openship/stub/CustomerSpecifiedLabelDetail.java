/**
 * CustomerSpecifiedLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Allows customer-specified control of label content.
 */
public class CustomerSpecifiedLabelDetail  implements java.io.Serializable {
    /* If omitted, no doc tab will be produced (i.e. default is former
     * NONE type). */
    private DocTabContent docTabContent;

    /* Controls the position of the customer specified content relative
     * to the FedEx portion. */
    private com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition;

    private CustomLabelDetail customContent;

    private com.fedex.openship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries;

    /* Controls which data/sections will be suppressed. */
    private LabelMaskableDataType[] maskedData;

    /* For customers producing their own Ground labels, this field
     * specifies which secondary barcode will be printed on the label; so
     * that the primary barcode produced by FedEx has the correct SCNC. */
    private SecondaryBarcodeType secondaryBarcode;

    private Localization termsAndConditionsLocalization;

    private com.fedex.openship.stub.RegulatoryLabelContentDetail[] regulatoryLabels;

    /* Controls the number of additional copies of supplemental labels. */
    private AdditionalLabelsDetail[] additionalLabels;

    /* This value reduces the default quantity of destination/consignee
     * air waybill labels. A value of zero indicates no change to default.
     * A minimum of one copy will always be produced. */
    private org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount;

    public CustomerSpecifiedLabelDetail() {
    }

    public CustomerSpecifiedLabelDetail(
           DocTabContent docTabContent,
           com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition,
           CustomLabelDetail customContent,
           com.fedex.openship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries,
           LabelMaskableDataType[] maskedData,
           SecondaryBarcodeType secondaryBarcode,
           Localization termsAndConditionsLocalization,
           com.fedex.openship.stub.RegulatoryLabelContentDetail[] regulatoryLabels,
           AdditionalLabelsDetail[] additionalLabels,
           org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount) {
           this.docTabContent = docTabContent;
           this.customContentPosition = customContentPosition;
           this.customContent = customContent;
           this.configurableReferenceEntries = configurableReferenceEntries;
           this.maskedData = maskedData;
           this.secondaryBarcode = secondaryBarcode;
           this.termsAndConditionsLocalization = termsAndConditionsLocalization;
           this.regulatoryLabels = regulatoryLabels;
           this.additionalLabels = additionalLabels;
           this.airWaybillSuppressionCount = airWaybillSuppressionCount;
    }


    /**
     * Gets the docTabContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @return docTabContent   * If omitted, no doc tab will be produced (i.e. default is former
     * NONE type).
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }


    /**
     * Sets the docTabContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @param docTabContent   * If omitted, no doc tab will be produced (i.e. default is former
     * NONE type).
     */
    public void setDocTabContent(DocTabContent docTabContent) {
        this.docTabContent = docTabContent;
    }


    /**
     * Gets the customContentPosition value for this CustomerSpecifiedLabelDetail.
     * 
     * @return customContentPosition   * Controls the position of the customer specified content relative
     * to the FedEx portion.
     */
    public com.fedex.openship.stub.RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }


    /**
     * Sets the customContentPosition value for this CustomerSpecifiedLabelDetail.
     * 
     * @param customContentPosition   * Controls the position of the customer specified content relative
     * to the FedEx portion.
     */
    public void setCustomContentPosition(com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition) {
        this.customContentPosition = customContentPosition;
    }


    /**
     * Gets the customContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @return customContent
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this CustomerSpecifiedLabelDetail.
     * 
     * @param customContent
     */
    public void setCustomContent(CustomLabelDetail customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the configurableReferenceEntries value for this CustomerSpecifiedLabelDetail.
     * 
     * @return configurableReferenceEntries
     */
    public com.fedex.openship.stub.ConfigurableLabelReferenceEntry[] getConfigurableReferenceEntries() {
        return configurableReferenceEntries;
    }


    /**
     * Sets the configurableReferenceEntries value for this CustomerSpecifiedLabelDetail.
     * 
     * @param configurableReferenceEntries
     */
    public void setConfigurableReferenceEntries(com.fedex.openship.stub.ConfigurableLabelReferenceEntry[] configurableReferenceEntries) {
        this.configurableReferenceEntries = configurableReferenceEntries;
    }

    public com.fedex.openship.stub.ConfigurableLabelReferenceEntry getConfigurableReferenceEntries(int i) {
        return this.configurableReferenceEntries[i];
    }

    public void setConfigurableReferenceEntries(int i, com.fedex.openship.stub.ConfigurableLabelReferenceEntry _value) {
        this.configurableReferenceEntries[i] = _value;
    }


    /**
     * Gets the maskedData value for this CustomerSpecifiedLabelDetail.
     * 
     * @return maskedData   * Controls which data/sections will be suppressed.
     */
    public LabelMaskableDataType[] getMaskedData() {
        return maskedData;
    }


    /**
     * Sets the maskedData value for this CustomerSpecifiedLabelDetail.
     * 
     * @param maskedData   * Controls which data/sections will be suppressed.
     */
    public void setMaskedData(LabelMaskableDataType[] maskedData) {
        this.maskedData = maskedData;
    }

    public LabelMaskableDataType getMaskedData(int i) {
        return this.maskedData[i];
    }

    public void setMaskedData(int i, LabelMaskableDataType _value) {
        this.maskedData[i] = _value;
    }


    /**
     * Gets the secondaryBarcode value for this CustomerSpecifiedLabelDetail.
     * 
     * @return secondaryBarcode   * For customers producing their own Ground labels, this field
     * specifies which secondary barcode will be printed on the label; so
     * that the primary barcode produced by FedEx has the correct SCNC.
     */
    public SecondaryBarcodeType getSecondaryBarcode() {
        return secondaryBarcode;
    }


    /**
     * Sets the secondaryBarcode value for this CustomerSpecifiedLabelDetail.
     * 
     * @param secondaryBarcode   * For customers producing their own Ground labels, this field
     * specifies which secondary barcode will be printed on the label; so
     * that the primary barcode produced by FedEx has the correct SCNC.
     */
    public void setSecondaryBarcode(SecondaryBarcodeType secondaryBarcode) {
        this.secondaryBarcode = secondaryBarcode;
    }


    /**
     * Gets the termsAndConditionsLocalization value for this CustomerSpecifiedLabelDetail.
     * 
     * @return termsAndConditionsLocalization
     */
    public Localization getTermsAndConditionsLocalization() {
        return termsAndConditionsLocalization;
    }


    /**
     * Sets the termsAndConditionsLocalization value for this CustomerSpecifiedLabelDetail.
     * 
     * @param termsAndConditionsLocalization
     */
    public void setTermsAndConditionsLocalization(Localization termsAndConditionsLocalization) {
        this.termsAndConditionsLocalization = termsAndConditionsLocalization;
    }


    /**
     * Gets the regulatoryLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @return regulatoryLabels
     */
    public com.fedex.openship.stub.RegulatoryLabelContentDetail[] getRegulatoryLabels() {
        return regulatoryLabels;
    }


    /**
     * Sets the regulatoryLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @param regulatoryLabels
     */
    public void setRegulatoryLabels(com.fedex.openship.stub.RegulatoryLabelContentDetail[] regulatoryLabels) {
        this.regulatoryLabels = regulatoryLabels;
    }

    public com.fedex.openship.stub.RegulatoryLabelContentDetail getRegulatoryLabels(int i) {
        return this.regulatoryLabels[i];
    }

    public void setRegulatoryLabels(int i, com.fedex.openship.stub.RegulatoryLabelContentDetail _value) {
        this.regulatoryLabels[i] = _value;
    }


    /**
     * Gets the additionalLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @return additionalLabels   * Controls the number of additional copies of supplemental labels.
     */
    public AdditionalLabelsDetail[] getAdditionalLabels() {
        return additionalLabels;
    }


    /**
     * Sets the additionalLabels value for this CustomerSpecifiedLabelDetail.
     * 
     * @param additionalLabels   * Controls the number of additional copies of supplemental labels.
     */
    public void setAdditionalLabels(AdditionalLabelsDetail[] additionalLabels) {
        this.additionalLabels = additionalLabels;
    }

    public AdditionalLabelsDetail getAdditionalLabels(int i) {
        return this.additionalLabels[i];
    }

    public void setAdditionalLabels(int i, AdditionalLabelsDetail _value) {
        this.additionalLabels[i] = _value;
    }


    /**
     * Gets the airWaybillSuppressionCount value for this CustomerSpecifiedLabelDetail.
     * 
     * @return airWaybillSuppressionCount   * This value reduces the default quantity of destination/consignee
     * air waybill labels. A value of zero indicates no change to default.
     * A minimum of one copy will always be produced.
     */
    public org.apache.axis.types.NonNegativeInteger getAirWaybillSuppressionCount() {
        return airWaybillSuppressionCount;
    }


    /**
     * Sets the airWaybillSuppressionCount value for this CustomerSpecifiedLabelDetail.
     * 
     * @param airWaybillSuppressionCount   * This value reduces the default quantity of destination/consignee
     * air waybill labels. A value of zero indicates no change to default.
     * A minimum of one copy will always be produced.
     */
    public void setAirWaybillSuppressionCount(org.apache.axis.types.NonNegativeInteger airWaybillSuppressionCount) {
        this.airWaybillSuppressionCount = airWaybillSuppressionCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomerSpecifiedLabelDetail)) return false;
        CustomerSpecifiedLabelDetail other = (CustomerSpecifiedLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docTabContent==null && other.getDocTabContent()==null) || 
             (this.docTabContent!=null &&
              this.docTabContent.equals(other.getDocTabContent()))) &&
            ((this.customContentPosition==null && other.getCustomContentPosition()==null) || 
             (this.customContentPosition!=null &&
              this.customContentPosition.equals(other.getCustomContentPosition()))) &&
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              this.customContent.equals(other.getCustomContent()))) &&
            ((this.configurableReferenceEntries==null && other.getConfigurableReferenceEntries()==null) || 
             (this.configurableReferenceEntries!=null &&
              java.util.Arrays.equals(this.configurableReferenceEntries, other.getConfigurableReferenceEntries()))) &&
            ((this.maskedData==null && other.getMaskedData()==null) || 
             (this.maskedData!=null &&
              java.util.Arrays.equals(this.maskedData, other.getMaskedData()))) &&
            ((this.secondaryBarcode==null && other.getSecondaryBarcode()==null) || 
             (this.secondaryBarcode!=null &&
              this.secondaryBarcode.equals(other.getSecondaryBarcode()))) &&
            ((this.termsAndConditionsLocalization==null && other.getTermsAndConditionsLocalization()==null) || 
             (this.termsAndConditionsLocalization!=null &&
              this.termsAndConditionsLocalization.equals(other.getTermsAndConditionsLocalization()))) &&
            ((this.regulatoryLabels==null && other.getRegulatoryLabels()==null) || 
             (this.regulatoryLabels!=null &&
              java.util.Arrays.equals(this.regulatoryLabels, other.getRegulatoryLabels()))) &&
            ((this.additionalLabels==null && other.getAdditionalLabels()==null) || 
             (this.additionalLabels!=null &&
              java.util.Arrays.equals(this.additionalLabels, other.getAdditionalLabels()))) &&
            ((this.airWaybillSuppressionCount==null && other.getAirWaybillSuppressionCount()==null) || 
             (this.airWaybillSuppressionCount!=null &&
              this.airWaybillSuppressionCount.equals(other.getAirWaybillSuppressionCount())));
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
        if (getDocTabContent() != null) {
            _hashCode += getDocTabContent().hashCode();
        }
        if (getCustomContentPosition() != null) {
            _hashCode += getCustomContentPosition().hashCode();
        }
        if (getCustomContent() != null) {
            _hashCode += getCustomContent().hashCode();
        }
        if (getConfigurableReferenceEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurableReferenceEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConfigurableReferenceEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaskedData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaskedData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMaskedData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecondaryBarcode() != null) {
            _hashCode += getSecondaryBarcode().hashCode();
        }
        if (getTermsAndConditionsLocalization() != null) {
            _hashCode += getTermsAndConditionsLocalization().hashCode();
        }
        if (getRegulatoryLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegulatoryLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRegulatoryLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalLabels());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdditionalLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirWaybillSuppressionCount() != null) {
            _hashCode += getAirWaybillSuppressionCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerSpecifiedLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerSpecifiedLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContentPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomContentPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RelativeVerticalPositionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurableReferenceEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfigurableReferenceEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfigurableLabelReferenceEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MaskedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelMaskableDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryBarcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SecondaryBarcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SecondaryBarcodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditionsLocalization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TermsAndConditionsLocalization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Localization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulatoryLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryLabelContentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdditionalLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdditionalLabelsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airWaybillSuppressionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AirWaybillSuppressionCount"));
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

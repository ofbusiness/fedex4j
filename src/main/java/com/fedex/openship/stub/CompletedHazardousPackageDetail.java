/**
 * CompletedHazardousPackageDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Completed package-level hazardous commodity information for a single
 * package.
 */
public class CompletedHazardousPackageDetail  implements java.io.Serializable {
    /* A unique reference id that matches the package to a package
     * configuration. This is populated if the client provided a package
     * configuration for several packages that have the exact same dangerous
     * goods content. */
    private String referenceId;

    private com.fedex.openship.stub.DangerousGoodsAccessibilityType accessibility;

    /* When true indicates that the package can be transported only
     * on a cargo aircraft. */
    private Boolean cargoAircraftOnly;

    private com.fedex.openship.stub.HazardousCommodityRegulationType regulation;

    /* Specifies the maximum radiation level from the package (measured
     * in microSieverts per hour at a distance of one meter from the external
     * surface of the package, divided by 10). */
    private java.math.BigDecimal radioactiveTransportIndex;

    /* Specifies the label that is to be put on a package containing
     * radioactive material. The label type is determined in accordance with
     * the Transportation of Dangerous Goods Act and indicates the type of
     * radioactive material being handled as well as the relative risk. */
    private RadioactiveLabelType labelType;

    /* Documents the kinds and quantities of all hazardous commodities
     * in the current package. */
    private ValidatedHazardousContainer[] containers;

    public CompletedHazardousPackageDetail() {
    }

    public CompletedHazardousPackageDetail(
           String referenceId,
           com.fedex.openship.stub.DangerousGoodsAccessibilityType accessibility,
           Boolean cargoAircraftOnly,
           com.fedex.openship.stub.HazardousCommodityRegulationType regulation,
           java.math.BigDecimal radioactiveTransportIndex,
           RadioactiveLabelType labelType,
           ValidatedHazardousContainer[] containers) {
           this.referenceId = referenceId;
           this.accessibility = accessibility;
           this.cargoAircraftOnly = cargoAircraftOnly;
           this.regulation = regulation;
           this.radioactiveTransportIndex = radioactiveTransportIndex;
           this.labelType = labelType;
           this.containers = containers;
    }


    /**
     * Gets the referenceId value for this CompletedHazardousPackageDetail.
     * 
     * @return referenceId   * A unique reference id that matches the package to a package
     * configuration. This is populated if the client provided a package
     * configuration for several packages that have the exact same dangerous
     * goods content.
     */
    public String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this CompletedHazardousPackageDetail.
     * 
     * @param referenceId   * A unique reference id that matches the package to a package
     * configuration. This is populated if the client provided a package
     * configuration for several packages that have the exact same dangerous
     * goods content.
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the accessibility value for this CompletedHazardousPackageDetail.
     * 
     * @return accessibility
     */
    public com.fedex.openship.stub.DangerousGoodsAccessibilityType getAccessibility() {
        return accessibility;
    }


    /**
     * Sets the accessibility value for this CompletedHazardousPackageDetail.
     * 
     * @param accessibility
     */
    public void setAccessibility(com.fedex.openship.stub.DangerousGoodsAccessibilityType accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * Gets the cargoAircraftOnly value for this CompletedHazardousPackageDetail.
     * 
     * @return cargoAircraftOnly   * When true indicates that the package can be transported only
     * on a cargo aircraft.
     */
    public Boolean getCargoAircraftOnly() {
        return cargoAircraftOnly;
    }


    /**
     * Sets the cargoAircraftOnly value for this CompletedHazardousPackageDetail.
     * 
     * @param cargoAircraftOnly   * When true indicates that the package can be transported only
     * on a cargo aircraft.
     */
    public void setCargoAircraftOnly(Boolean cargoAircraftOnly) {
        this.cargoAircraftOnly = cargoAircraftOnly;
    }


    /**
     * Gets the regulation value for this CompletedHazardousPackageDetail.
     * 
     * @return regulation
     */
    public com.fedex.openship.stub.HazardousCommodityRegulationType getRegulation() {
        return regulation;
    }


    /**
     * Sets the regulation value for this CompletedHazardousPackageDetail.
     * 
     * @param regulation
     */
    public void setRegulation(com.fedex.openship.stub.HazardousCommodityRegulationType regulation) {
        this.regulation = regulation;
    }


    /**
     * Gets the radioactiveTransportIndex value for this CompletedHazardousPackageDetail.
     * 
     * @return radioactiveTransportIndex   * Specifies the maximum radiation level from the package (measured
     * in microSieverts per hour at a distance of one meter from the external
     * surface of the package, divided by 10).
     */
    public java.math.BigDecimal getRadioactiveTransportIndex() {
        return radioactiveTransportIndex;
    }


    /**
     * Sets the radioactiveTransportIndex value for this CompletedHazardousPackageDetail.
     * 
     * @param radioactiveTransportIndex   * Specifies the maximum radiation level from the package (measured
     * in microSieverts per hour at a distance of one meter from the external
     * surface of the package, divided by 10).
     */
    public void setRadioactiveTransportIndex(java.math.BigDecimal radioactiveTransportIndex) {
        this.radioactiveTransportIndex = radioactiveTransportIndex;
    }


    /**
     * Gets the labelType value for this CompletedHazardousPackageDetail.
     * 
     * @return labelType   * Specifies the label that is to be put on a package containing
     * radioactive material. The label type is determined in accordance with
     * the Transportation of Dangerous Goods Act and indicates the type of
     * radioactive material being handled as well as the relative risk.
     */
    public RadioactiveLabelType getLabelType() {
        return labelType;
    }


    /**
     * Sets the labelType value for this CompletedHazardousPackageDetail.
     * 
     * @param labelType   * Specifies the label that is to be put on a package containing
     * radioactive material. The label type is determined in accordance with
     * the Transportation of Dangerous Goods Act and indicates the type of
     * radioactive material being handled as well as the relative risk.
     */
    public void setLabelType(RadioactiveLabelType labelType) {
        this.labelType = labelType;
    }


    /**
     * Gets the containers value for this CompletedHazardousPackageDetail.
     * 
     * @return containers   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public ValidatedHazardousContainer[] getContainers() {
        return containers;
    }


    /**
     * Sets the containers value for this CompletedHazardousPackageDetail.
     * 
     * @param containers   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public void setContainers(ValidatedHazardousContainer[] containers) {
        this.containers = containers;
    }

    public ValidatedHazardousContainer getContainers(int i) {
        return this.containers[i];
    }

    public void setContainers(int i, ValidatedHazardousContainer _value) {
        this.containers[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedHazardousPackageDetail)) return false;
        CompletedHazardousPackageDetail other = (CompletedHazardousPackageDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.accessibility==null && other.getAccessibility()==null) || 
             (this.accessibility!=null &&
              this.accessibility.equals(other.getAccessibility()))) &&
            ((this.cargoAircraftOnly==null && other.getCargoAircraftOnly()==null) || 
             (this.cargoAircraftOnly!=null &&
              this.cargoAircraftOnly.equals(other.getCargoAircraftOnly()))) &&
            ((this.regulation==null && other.getRegulation()==null) || 
             (this.regulation!=null &&
              this.regulation.equals(other.getRegulation()))) &&
            ((this.radioactiveTransportIndex==null && other.getRadioactiveTransportIndex()==null) || 
             (this.radioactiveTransportIndex!=null &&
              this.radioactiveTransportIndex.equals(other.getRadioactiveTransportIndex()))) &&
            ((this.labelType==null && other.getLabelType()==null) || 
             (this.labelType!=null &&
              this.labelType.equals(other.getLabelType()))) &&
            ((this.containers==null && other.getContainers()==null) || 
             (this.containers!=null &&
              java.util.Arrays.equals(this.containers, other.getContainers())));
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
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getAccessibility() != null) {
            _hashCode += getAccessibility().hashCode();
        }
        if (getCargoAircraftOnly() != null) {
            _hashCode += getCargoAircraftOnly().hashCode();
        }
        if (getRegulation() != null) {
            _hashCode += getRegulation().hashCode();
        }
        if (getRadioactiveTransportIndex() != null) {
            _hashCode += getRadioactiveTransportIndex().hashCode();
        }
        if (getLabelType() != null) {
            _hashCode += getLabelType().hashCode();
        }
        if (getContainers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContainers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContainers(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedHazardousPackageDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHazardousPackageDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Accessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsAccessibilityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoAircraftOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CargoAircraftOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Regulation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityRegulationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radioactiveTransportIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactiveTransportIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactiveLabelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Containers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousContainer"));
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

/**
 * ValidatedHazardousCommodityDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Identifies and describes an individual hazardous commodity. For
 * 201001 load, this is based on data from the FedEx Ground Hazardous
 * Materials Shipping Guide.
 */
public class ValidatedHazardousCommodityDescription  implements java.io.Serializable {
    /* Regulatory identifier for a commodity (e.g. "UN ID" value). */
    private String id;

    /* In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity. */
    private org.apache.axis.types.NonNegativeInteger sequenceNumber;

    private HazardousCommodityPackingGroupType packingGroup;

    private String packingInstructions;

    private String properShippingName;

    /* Fully-expanded descriptive text for a hazardous commodity. */
    private String properShippingNameAndDescription;

    private String technicalName;

    private String hazardClass;

    private String[] subsidiaryClasses;

    /* Coded indications for special requirements or constraints. */
    private String symbols;

    private String tunnelRestrictionCode;

    private String specialProvisions;

    private HazardousCommodityAttributeType[] attributes;

    private String authorization;

    private String labelText;

    public ValidatedHazardousCommodityDescription() {
    }

    public ValidatedHazardousCommodityDescription(
           String id,
           org.apache.axis.types.NonNegativeInteger sequenceNumber,
           HazardousCommodityPackingGroupType packingGroup,
           String packingInstructions,
           String properShippingName,
           String properShippingNameAndDescription,
           String technicalName,
           String hazardClass,
           String[] subsidiaryClasses,
           String symbols,
           String tunnelRestrictionCode,
           String specialProvisions,
           HazardousCommodityAttributeType[] attributes,
           String authorization,
           String labelText) {
           this.id = id;
           this.sequenceNumber = sequenceNumber;
           this.packingGroup = packingGroup;
           this.packingInstructions = packingInstructions;
           this.properShippingName = properShippingName;
           this.properShippingNameAndDescription = properShippingNameAndDescription;
           this.technicalName = technicalName;
           this.hazardClass = hazardClass;
           this.subsidiaryClasses = subsidiaryClasses;
           this.symbols = symbols;
           this.tunnelRestrictionCode = tunnelRestrictionCode;
           this.specialProvisions = specialProvisions;
           this.attributes = attributes;
           this.authorization = authorization;
           this.labelText = labelText;
    }


    /**
     * Gets the id value for this ValidatedHazardousCommodityDescription.
     * 
     * @return id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this ValidatedHazardousCommodityDescription.
     * 
     * @param id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the sequenceNumber value for this ValidatedHazardousCommodityDescription.
     * 
     * @return sequenceNumber   * In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity.
     */
    public org.apache.axis.types.NonNegativeInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this ValidatedHazardousCommodityDescription.
     * 
     * @param sequenceNumber   * In conjunction with the regulatory identifier, this field uniquely
     * identifies a specific hazardous materials commodity.
     */
    public void setSequenceNumber(org.apache.axis.types.NonNegativeInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the packingGroup value for this ValidatedHazardousCommodityDescription.
     * 
     * @return packingGroup
     */
    public HazardousCommodityPackingGroupType getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this ValidatedHazardousCommodityDescription.
     * 
     * @param packingGroup
     */
    public void setPackingGroup(HazardousCommodityPackingGroupType packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the packingInstructions value for this ValidatedHazardousCommodityDescription.
     * 
     * @return packingInstructions
     */
    public String getPackingInstructions() {
        return packingInstructions;
    }


    /**
     * Sets the packingInstructions value for this ValidatedHazardousCommodityDescription.
     * 
     * @param packingInstructions
     */
    public void setPackingInstructions(String packingInstructions) {
        this.packingInstructions = packingInstructions;
    }


    /**
     * Gets the properShippingName value for this ValidatedHazardousCommodityDescription.
     * 
     * @return properShippingName
     */
    public String getProperShippingName() {
        return properShippingName;
    }


    /**
     * Sets the properShippingName value for this ValidatedHazardousCommodityDescription.
     * 
     * @param properShippingName
     */
    public void setProperShippingName(String properShippingName) {
        this.properShippingName = properShippingName;
    }


    /**
     * Gets the properShippingNameAndDescription value for this ValidatedHazardousCommodityDescription.
     * 
     * @return properShippingNameAndDescription   * Fully-expanded descriptive text for a hazardous commodity.
     */
    public String getProperShippingNameAndDescription() {
        return properShippingNameAndDescription;
    }


    /**
     * Sets the properShippingNameAndDescription value for this ValidatedHazardousCommodityDescription.
     * 
     * @param properShippingNameAndDescription   * Fully-expanded descriptive text for a hazardous commodity.
     */
    public void setProperShippingNameAndDescription(String properShippingNameAndDescription) {
        this.properShippingNameAndDescription = properShippingNameAndDescription;
    }


    /**
     * Gets the technicalName value for this ValidatedHazardousCommodityDescription.
     * 
     * @return technicalName
     */
    public String getTechnicalName() {
        return technicalName;
    }


    /**
     * Sets the technicalName value for this ValidatedHazardousCommodityDescription.
     * 
     * @param technicalName
     */
    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }


    /**
     * Gets the hazardClass value for this ValidatedHazardousCommodityDescription.
     * 
     * @return hazardClass
     */
    public String getHazardClass() {
        return hazardClass;
    }


    /**
     * Sets the hazardClass value for this ValidatedHazardousCommodityDescription.
     * 
     * @param hazardClass
     */
    public void setHazardClass(String hazardClass) {
        this.hazardClass = hazardClass;
    }


    /**
     * Gets the subsidiaryClasses value for this ValidatedHazardousCommodityDescription.
     * 
     * @return subsidiaryClasses
     */
    public String[] getSubsidiaryClasses() {
        return subsidiaryClasses;
    }


    /**
     * Sets the subsidiaryClasses value for this ValidatedHazardousCommodityDescription.
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
     * Gets the symbols value for this ValidatedHazardousCommodityDescription.
     * 
     * @return symbols   * Coded indications for special requirements or constraints.
     */
    public String getSymbols() {
        return symbols;
    }


    /**
     * Sets the symbols value for this ValidatedHazardousCommodityDescription.
     * 
     * @param symbols   * Coded indications for special requirements or constraints.
     */
    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }


    /**
     * Gets the tunnelRestrictionCode value for this ValidatedHazardousCommodityDescription.
     * 
     * @return tunnelRestrictionCode
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }


    /**
     * Sets the tunnelRestrictionCode value for this ValidatedHazardousCommodityDescription.
     * 
     * @param tunnelRestrictionCode
     */
    public void setTunnelRestrictionCode(String tunnelRestrictionCode) {
        this.tunnelRestrictionCode = tunnelRestrictionCode;
    }


    /**
     * Gets the specialProvisions value for this ValidatedHazardousCommodityDescription.
     * 
     * @return specialProvisions
     */
    public String getSpecialProvisions() {
        return specialProvisions;
    }


    /**
     * Sets the specialProvisions value for this ValidatedHazardousCommodityDescription.
     * 
     * @param specialProvisions
     */
    public void setSpecialProvisions(String specialProvisions) {
        this.specialProvisions = specialProvisions;
    }


    /**
     * Gets the attributes value for this ValidatedHazardousCommodityDescription.
     * 
     * @return attributes
     */
    public HazardousCommodityAttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ValidatedHazardousCommodityDescription.
     * 
     * @param attributes
     */
    public void setAttributes(HazardousCommodityAttributeType[] attributes) {
        this.attributes = attributes;
    }

    public HazardousCommodityAttributeType getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, HazardousCommodityAttributeType _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the authorization value for this ValidatedHazardousCommodityDescription.
     * 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this ValidatedHazardousCommodityDescription.
     * 
     * @param authorization
     */
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the labelText value for this ValidatedHazardousCommodityDescription.
     * 
     * @return labelText
     */
    public String getLabelText() {
        return labelText;
    }


    /**
     * Sets the labelText value for this ValidatedHazardousCommodityDescription.
     * 
     * @param labelText
     */
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ValidatedHazardousCommodityDescription)) return false;
        ValidatedHazardousCommodityDescription other = (ValidatedHazardousCommodityDescription) obj;
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
            ((this.packingInstructions==null && other.getPackingInstructions()==null) || 
             (this.packingInstructions!=null &&
              this.packingInstructions.equals(other.getPackingInstructions()))) &&
            ((this.properShippingName==null && other.getProperShippingName()==null) || 
             (this.properShippingName!=null &&
              this.properShippingName.equals(other.getProperShippingName()))) &&
            ((this.properShippingNameAndDescription==null && other.getProperShippingNameAndDescription()==null) || 
             (this.properShippingNameAndDescription!=null &&
              this.properShippingNameAndDescription.equals(other.getProperShippingNameAndDescription()))) &&
            ((this.technicalName==null && other.getTechnicalName()==null) || 
             (this.technicalName!=null &&
              this.technicalName.equals(other.getTechnicalName()))) &&
            ((this.hazardClass==null && other.getHazardClass()==null) || 
             (this.hazardClass!=null &&
              this.hazardClass.equals(other.getHazardClass()))) &&
            ((this.subsidiaryClasses==null && other.getSubsidiaryClasses()==null) || 
             (this.subsidiaryClasses!=null &&
              java.util.Arrays.equals(this.subsidiaryClasses, other.getSubsidiaryClasses()))) &&
            ((this.symbols==null && other.getSymbols()==null) || 
             (this.symbols!=null &&
              this.symbols.equals(other.getSymbols()))) &&
            ((this.tunnelRestrictionCode==null && other.getTunnelRestrictionCode()==null) || 
             (this.tunnelRestrictionCode!=null &&
              this.tunnelRestrictionCode.equals(other.getTunnelRestrictionCode()))) &&
            ((this.specialProvisions==null && other.getSpecialProvisions()==null) || 
             (this.specialProvisions!=null &&
              this.specialProvisions.equals(other.getSpecialProvisions()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization()))) &&
            ((this.labelText==null && other.getLabelText()==null) || 
             (this.labelText!=null &&
              this.labelText.equals(other.getLabelText())));
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
        if (getPackingInstructions() != null) {
            _hashCode += getPackingInstructions().hashCode();
        }
        if (getProperShippingName() != null) {
            _hashCode += getProperShippingName().hashCode();
        }
        if (getProperShippingNameAndDescription() != null) {
            _hashCode += getProperShippingNameAndDescription().hashCode();
        }
        if (getTechnicalName() != null) {
            _hashCode += getTechnicalName().hashCode();
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
        if (getSymbols() != null) {
            _hashCode += getSymbols().hashCode();
        }
        if (getTunnelRestrictionCode() != null) {
            _hashCode += getTunnelRestrictionCode().hashCode();
        }
        if (getSpecialProvisions() != null) {
            _hashCode += getSpecialProvisions().hashCode();
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
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        if (getLabelText() != null) {
            _hashCode += getLabelText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatedHazardousCommodityDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousCommodityDescription"));
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
        elemField.setFieldName("packingInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackingInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("properShippingNameAndDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ProperShippingNameAndDescription"));
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
        elemField.setFieldName("symbols");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Symbols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelRestrictionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TunnelRestrictionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialProvisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialProvisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityAttributeType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelText"));
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

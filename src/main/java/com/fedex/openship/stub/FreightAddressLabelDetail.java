/**
 * FreightAddressLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Data required to produce the Freight handling-unit-level address
 * labels. Note that the number of UNIQUE labels (the N as in 1 of N,
 * 2 of N, etc.) is determined by total handling units.
 */
public class FreightAddressLabelDetail  implements java.io.Serializable {
    private ShippingDocumentFormat format;

    /* Indicates the number of copies to be produced for each unique
     * label. */
    private org.apache.axis.types.NonNegativeInteger copies;

    /* Specifies the quadrant of the page on which the label printing
     * will start. */
    private PageQuadrantType startingPosition;

    /* If omitted, no doc tab will be produced (i.e. default = former
     * NONE type). */
    private DocTabContent docTabContent;

    /* Controls the position of the customer specified content relative
     * to the FedEx portion. */
    private com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition;

    private CustomLabelDetail customContent;

    public FreightAddressLabelDetail() {
    }

    public FreightAddressLabelDetail(
           ShippingDocumentFormat format,
           org.apache.axis.types.NonNegativeInteger copies,
           PageQuadrantType startingPosition,
           DocTabContent docTabContent,
           com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition,
           CustomLabelDetail customContent) {
           this.format = format;
           this.copies = copies;
           this.startingPosition = startingPosition;
           this.docTabContent = docTabContent;
           this.customContentPosition = customContentPosition;
           this.customContent = customContent;
    }


    /**
     * Gets the format value for this FreightAddressLabelDetail.
     * 
     * @return format
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this FreightAddressLabelDetail.
     * 
     * @param format
     */
    public void setFormat(ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the copies value for this FreightAddressLabelDetail.
     * 
     * @return copies   * Indicates the number of copies to be produced for each unique
     * label.
     */
    public org.apache.axis.types.NonNegativeInteger getCopies() {
        return copies;
    }


    /**
     * Sets the copies value for this FreightAddressLabelDetail.
     * 
     * @param copies   * Indicates the number of copies to be produced for each unique
     * label.
     */
    public void setCopies(org.apache.axis.types.NonNegativeInteger copies) {
        this.copies = copies;
    }


    /**
     * Gets the startingPosition value for this FreightAddressLabelDetail.
     * 
     * @return startingPosition   * Specifies the quadrant of the page on which the label printing
     * will start.
     */
    public PageQuadrantType getStartingPosition() {
        return startingPosition;
    }


    /**
     * Sets the startingPosition value for this FreightAddressLabelDetail.
     * 
     * @param startingPosition   * Specifies the quadrant of the page on which the label printing
     * will start.
     */
    public void setStartingPosition(PageQuadrantType startingPosition) {
        this.startingPosition = startingPosition;
    }


    /**
     * Gets the docTabContent value for this FreightAddressLabelDetail.
     * 
     * @return docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }


    /**
     * Sets the docTabContent value for this FreightAddressLabelDetail.
     * 
     * @param docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public void setDocTabContent(DocTabContent docTabContent) {
        this.docTabContent = docTabContent;
    }


    /**
     * Gets the customContentPosition value for this FreightAddressLabelDetail.
     * 
     * @return customContentPosition   * Controls the position of the customer specified content relative
     * to the FedEx portion.
     */
    public com.fedex.openship.stub.RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }


    /**
     * Sets the customContentPosition value for this FreightAddressLabelDetail.
     * 
     * @param customContentPosition   * Controls the position of the customer specified content relative
     * to the FedEx portion.
     */
    public void setCustomContentPosition(com.fedex.openship.stub.RelativeVerticalPositionType customContentPosition) {
        this.customContentPosition = customContentPosition;
    }


    /**
     * Gets the customContent value for this FreightAddressLabelDetail.
     * 
     * @return customContent
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this FreightAddressLabelDetail.
     * 
     * @param customContent
     */
    public void setCustomContent(CustomLabelDetail customContent) {
        this.customContent = customContent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreightAddressLabelDetail)) return false;
        FreightAddressLabelDetail other = (FreightAddressLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.copies==null && other.getCopies()==null) || 
             (this.copies!=null &&
              this.copies.equals(other.getCopies()))) &&
            ((this.startingPosition==null && other.getStartingPosition()==null) || 
             (this.startingPosition!=null &&
              this.startingPosition.equals(other.getStartingPosition()))) &&
            ((this.docTabContent==null && other.getDocTabContent()==null) || 
             (this.docTabContent!=null &&
              this.docTabContent.equals(other.getDocTabContent()))) &&
            ((this.customContentPosition==null && other.getCustomContentPosition()==null) || 
             (this.customContentPosition!=null &&
              this.customContentPosition.equals(other.getCustomContentPosition()))) &&
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              this.customContent.equals(other.getCustomContent())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getCopies() != null) {
            _hashCode += getCopies().hashCode();
        }
        if (getStartingPosition() != null) {
            _hashCode += getStartingPosition().hashCode();
        }
        if (getDocTabContent() != null) {
            _hashCode += getDocTabContent().hashCode();
        }
        if (getCustomContentPosition() != null) {
            _hashCode += getCustomContentPosition().hashCode();
        }
        if (getCustomContent() != null) {
            _hashCode += getCustomContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreightAddressLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightAddressLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Copies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StartingPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PageQuadrantType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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

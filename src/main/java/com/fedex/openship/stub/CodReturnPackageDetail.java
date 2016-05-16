/**
 * CodReturnPackageDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the information associated with a package that has COD
 * special service in a ground shipment.
 */
public class CodReturnPackageDetail  implements java.io.Serializable {
    private Money collectionAmount;

    private CodAdjustmentType adjustmentType;

    private Boolean electronic;

    private PackageBarcodes barcodes;

    private ShippingDocument label;

    public CodReturnPackageDetail() {
    }

    public CodReturnPackageDetail(
           Money collectionAmount,
           CodAdjustmentType adjustmentType,
           Boolean electronic,
           PackageBarcodes barcodes,
           ShippingDocument label) {
           this.collectionAmount = collectionAmount;
           this.adjustmentType = adjustmentType;
           this.electronic = electronic;
           this.barcodes = barcodes;
           this.label = label;
    }


    /**
     * Gets the collectionAmount value for this CodReturnPackageDetail.
     * 
     * @return collectionAmount
     */
    public Money getCollectionAmount() {
        return collectionAmount;
    }


    /**
     * Sets the collectionAmount value for this CodReturnPackageDetail.
     * 
     * @param collectionAmount
     */
    public void setCollectionAmount(Money collectionAmount) {
        this.collectionAmount = collectionAmount;
    }


    /**
     * Gets the adjustmentType value for this CodReturnPackageDetail.
     * 
     * @return adjustmentType
     */
    public CodAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this CodReturnPackageDetail.
     * 
     * @param adjustmentType
     */
    public void setAdjustmentType(CodAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the electronic value for this CodReturnPackageDetail.
     * 
     * @return electronic
     */
    public Boolean getElectronic() {
        return electronic;
    }


    /**
     * Sets the electronic value for this CodReturnPackageDetail.
     * 
     * @param electronic
     */
    public void setElectronic(Boolean electronic) {
        this.electronic = electronic;
    }


    /**
     * Gets the barcodes value for this CodReturnPackageDetail.
     * 
     * @return barcodes
     */
    public PackageBarcodes getBarcodes() {
        return barcodes;
    }


    /**
     * Sets the barcodes value for this CodReturnPackageDetail.
     * 
     * @param barcodes
     */
    public void setBarcodes(PackageBarcodes barcodes) {
        this.barcodes = barcodes;
    }


    /**
     * Gets the label value for this CodReturnPackageDetail.
     * 
     * @return label
     */
    public ShippingDocument getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CodReturnPackageDetail.
     * 
     * @param label
     */
    public void setLabel(ShippingDocument label) {
        this.label = label;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CodReturnPackageDetail)) return false;
        CodReturnPackageDetail other = (CodReturnPackageDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collectionAmount==null && other.getCollectionAmount()==null) || 
             (this.collectionAmount!=null &&
              this.collectionAmount.equals(other.getCollectionAmount()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.electronic==null && other.getElectronic()==null) || 
             (this.electronic!=null &&
              this.electronic.equals(other.getElectronic()))) &&
            ((this.barcodes==null && other.getBarcodes()==null) || 
             (this.barcodes!=null &&
              this.barcodes.equals(other.getBarcodes()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (getCollectionAmount() != null) {
            _hashCode += getCollectionAmount().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getElectronic() != null) {
            _hashCode += getElectronic().hashCode();
        }
        if (getBarcodes() != null) {
            _hashCode += getBarcodes().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodReturnPackageDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodReturnPackageDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CollectionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodAdjustmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Electronic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Barcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageBarcodes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocument"));
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

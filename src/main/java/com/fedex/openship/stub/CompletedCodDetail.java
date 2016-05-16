/**
 * CompletedCodDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the results of processing for the COD special service.
 */
public class CompletedCodDetail  implements java.io.Serializable {
    private Money collectionAmount;

    private CodAdjustmentType adjustmentType;

    public CompletedCodDetail() {
    }

    public CompletedCodDetail(
           Money collectionAmount,
           CodAdjustmentType adjustmentType) {
           this.collectionAmount = collectionAmount;
           this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the collectionAmount value for this CompletedCodDetail.
     * 
     * @return collectionAmount
     */
    public Money getCollectionAmount() {
        return collectionAmount;
    }


    /**
     * Sets the collectionAmount value for this CompletedCodDetail.
     * 
     * @param collectionAmount
     */
    public void setCollectionAmount(Money collectionAmount) {
        this.collectionAmount = collectionAmount;
    }


    /**
     * Gets the adjustmentType value for this CompletedCodDetail.
     * 
     * @return adjustmentType
     */
    public CodAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this CompletedCodDetail.
     * 
     * @param adjustmentType
     */
    public void setAdjustmentType(CodAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedCodDetail)) return false;
        CompletedCodDetail other = (CompletedCodDetail) obj;
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
              this.adjustmentType.equals(other.getAdjustmentType())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompletedCodDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedCodDetail"));
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

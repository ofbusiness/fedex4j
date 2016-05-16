/**
 * TransborderDistributionSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies features of service within a Transborder Distribution
 * shipment.
 */
public class TransborderDistributionSpecialServicesRequested  implements java.io.Serializable {
    /* Identifies features of service requested for the current Transborder
     * Distribution shipment. */
    private TransborderDistributionSpecialServiceType[] specialServiceTypes;

    /* Specifies details for origin-country LTL services performed
     * by FedEx. */
    private TransborderDistributionLtlDetail transborderDistributionLtlDetail;

    public TransborderDistributionSpecialServicesRequested() {
    }

    public TransborderDistributionSpecialServicesRequested(
           TransborderDistributionSpecialServiceType[] specialServiceTypes,
           TransborderDistributionLtlDetail transborderDistributionLtlDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.transborderDistributionLtlDetail = transborderDistributionLtlDetail;
    }


    /**
     * Gets the specialServiceTypes value for this TransborderDistributionSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * Identifies features of service requested for the current Transborder
     * Distribution shipment.
     */
    public TransborderDistributionSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this TransborderDistributionSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * Identifies features of service requested for the current Transborder
     * Distribution shipment.
     */
    public void setSpecialServiceTypes(TransborderDistributionSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public TransborderDistributionSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, TransborderDistributionSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the transborderDistributionLtlDetail value for this TransborderDistributionSpecialServicesRequested.
     * 
     * @return transborderDistributionLtlDetail   * Specifies details for origin-country LTL services performed
     * by FedEx.
     */
    public TransborderDistributionLtlDetail getTransborderDistributionLtlDetail() {
        return transborderDistributionLtlDetail;
    }


    /**
     * Sets the transborderDistributionLtlDetail value for this TransborderDistributionSpecialServicesRequested.
     * 
     * @param transborderDistributionLtlDetail   * Specifies details for origin-country LTL services performed
     * by FedEx.
     */
    public void setTransborderDistributionLtlDetail(TransborderDistributionLtlDetail transborderDistributionLtlDetail) {
        this.transborderDistributionLtlDetail = transborderDistributionLtlDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransborderDistributionSpecialServicesRequested)) return false;
        TransborderDistributionSpecialServicesRequested other = (TransborderDistributionSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) || 
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.transborderDistributionLtlDetail==null && other.getTransborderDistributionLtlDetail()==null) || 
             (this.transborderDistributionLtlDetail!=null &&
              this.transborderDistributionLtlDetail.equals(other.getTransborderDistributionLtlDetail())));
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
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransborderDistributionLtlDetail() != null) {
            _hashCode += getTransborderDistributionLtlDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransborderDistributionSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transborderDistributionLtlDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionLtlDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionLtlDetail"));
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

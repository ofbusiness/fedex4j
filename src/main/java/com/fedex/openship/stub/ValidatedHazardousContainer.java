/**
 * ValidatedHazardousContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the concept of a container used to package dangerous
 * goods commodities.
 */
public class ValidatedHazardousContainer  implements java.io.Serializable {
    /* Indicates that the quantity of the dangerous goods packaged
     * is permissible for shipping. This is used to ensure that the dangerous
     * goods commodities do not exceed the net quantity per package restrictions. */
    private java.math.BigDecimal QValue;

    /* Documents the kinds and quantities of all hazardous commodities
     * in the current package. */
    private com.fedex.openship.stub.ValidatedHazardousCommodityContent[] hazardousCommodities;

    public ValidatedHazardousContainer() {
    }

    public ValidatedHazardousContainer(
           java.math.BigDecimal QValue,
           com.fedex.openship.stub.ValidatedHazardousCommodityContent[] hazardousCommodities) {
           this.QValue = QValue;
           this.hazardousCommodities = hazardousCommodities;
    }


    /**
     * Gets the QValue value for this ValidatedHazardousContainer.
     * 
     * @return QValue   * Indicates that the quantity of the dangerous goods packaged
     * is permissible for shipping. This is used to ensure that the dangerous
     * goods commodities do not exceed the net quantity per package restrictions.
     */
    public java.math.BigDecimal getQValue() {
        return QValue;
    }


    /**
     * Sets the QValue value for this ValidatedHazardousContainer.
     * 
     * @param QValue   * Indicates that the quantity of the dangerous goods packaged
     * is permissible for shipping. This is used to ensure that the dangerous
     * goods commodities do not exceed the net quantity per package restrictions.
     */
    public void setQValue(java.math.BigDecimal QValue) {
        this.QValue = QValue;
    }


    /**
     * Gets the hazardousCommodities value for this ValidatedHazardousContainer.
     * 
     * @return hazardousCommodities   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public com.fedex.openship.stub.ValidatedHazardousCommodityContent[] getHazardousCommodities() {
        return hazardousCommodities;
    }


    /**
     * Sets the hazardousCommodities value for this ValidatedHazardousContainer.
     * 
     * @param hazardousCommodities   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public void setHazardousCommodities(com.fedex.openship.stub.ValidatedHazardousCommodityContent[] hazardousCommodities) {
        this.hazardousCommodities = hazardousCommodities;
    }

    public com.fedex.openship.stub.ValidatedHazardousCommodityContent getHazardousCommodities(int i) {
        return this.hazardousCommodities[i];
    }

    public void setHazardousCommodities(int i, com.fedex.openship.stub.ValidatedHazardousCommodityContent _value) {
        this.hazardousCommodities[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ValidatedHazardousContainer)) return false;
        ValidatedHazardousContainer other = (ValidatedHazardousContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.QValue==null && other.getQValue()==null) || 
             (this.QValue!=null &&
              this.QValue.equals(other.getQValue()))) &&
            ((this.hazardousCommodities==null && other.getHazardousCommodities()==null) || 
             (this.hazardousCommodities!=null &&
              java.util.Arrays.equals(this.hazardousCommodities, other.getHazardousCommodities())));
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
        if (getQValue() != null) {
            _hashCode += getQValue().hashCode();
        }
        if (getHazardousCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHazardousCommodities());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHazardousCommodities(), i);
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
        new org.apache.axis.description.TypeDesc(ValidatedHazardousContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "QValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousCommodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousCommodityContent"));
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

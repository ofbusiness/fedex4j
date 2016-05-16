/**
 * ConsolidationSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * These special services are available at the consolidation level
 * for some or all consolidation types. If the shipper is requesting
 * a special service which requires additional data (such as the COD
 * amount), the consolidation special service type must be present in
 * the specialServiceTypes collection, and the supporting detail must
 * be provided in the appropriate sub-object below.
 */
public class ConsolidationSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * consolidation. */
    private ConsolidationSpecialServiceType[] specialServiceTypes;

    private PriorityAlertDetail priorityAlertDetail;

    public ConsolidationSpecialServicesRequested() {
    }

    public ConsolidationSpecialServicesRequested(
           ConsolidationSpecialServiceType[] specialServiceTypes,
           PriorityAlertDetail priorityAlertDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.priorityAlertDetail = priorityAlertDetail;
    }


    /**
     * Gets the specialServiceTypes value for this ConsolidationSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * consolidation.
     */
    public ConsolidationSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this ConsolidationSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * consolidation.
     */
    public void setSpecialServiceTypes(ConsolidationSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public ConsolidationSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, ConsolidationSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the priorityAlertDetail value for this ConsolidationSpecialServicesRequested.
     * 
     * @return priorityAlertDetail
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }


    /**
     * Sets the priorityAlertDetail value for this ConsolidationSpecialServicesRequested.
     * 
     * @param priorityAlertDetail
     */
    public void setPriorityAlertDetail(PriorityAlertDetail priorityAlertDetail) {
        this.priorityAlertDetail = priorityAlertDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationSpecialServicesRequested)) return false;
        ConsolidationSpecialServicesRequested other = (ConsolidationSpecialServicesRequested) obj;
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
            ((this.priorityAlertDetail==null && other.getPriorityAlertDetail()==null) || 
             (this.priorityAlertDetail!=null &&
              this.priorityAlertDetail.equals(other.getPriorityAlertDetail())));
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
        if (getPriorityAlertDetail() != null) {
            _hashCode += getPriorityAlertDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail"));
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

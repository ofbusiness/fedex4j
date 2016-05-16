/**
 * ConsolidatedCommodityDestinationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidatedCommodityDestinationDetail  implements java.io.Serializable {
    private String countryCode;

    private String stateOrProvinceCode;

    private Boolean residential;

    public ConsolidatedCommodityDestinationDetail() {
    }

    public ConsolidatedCommodityDestinationDetail(
           String countryCode,
           String stateOrProvinceCode,
           Boolean residential) {
           this.countryCode = countryCode;
           this.stateOrProvinceCode = stateOrProvinceCode;
           this.residential = residential;
    }


    /**
     * Gets the countryCode value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the stateOrProvinceCode value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @return stateOrProvinceCode
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }


    /**
     * Sets the stateOrProvinceCode value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @param stateOrProvinceCode
     */
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }


    /**
     * Gets the residential value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @return residential
     */
    public Boolean getResidential() {
        return residential;
    }


    /**
     * Sets the residential value for this ConsolidatedCommodityDestinationDetail.
     * 
     * @param residential
     */
    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedCommodityDestinationDetail)) return false;
        ConsolidatedCommodityDestinationDetail other = (ConsolidatedCommodityDestinationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.stateOrProvinceCode==null && other.getStateOrProvinceCode()==null) || 
             (this.stateOrProvinceCode!=null &&
              this.stateOrProvinceCode.equals(other.getStateOrProvinceCode()))) &&
            ((this.residential==null && other.getResidential()==null) || 
             (this.residential!=null &&
              this.residential.equals(other.getResidential())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getStateOrProvinceCode() != null) {
            _hashCode += getStateOrProvinceCode().hashCode();
        }
        if (getResidential() != null) {
            _hashCode += getResidential().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidatedCommodityDestinationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodityDestinationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOrProvinceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StateOrProvinceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Residential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

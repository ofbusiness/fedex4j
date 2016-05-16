/**
 * ReturnShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class ReturnShipmentDetail  implements java.io.Serializable {
    private ReturnType returnType;

    private Rma rma;

    private ReturnEMailDetail returnEMailDetail;

    private com.fedex.pickup.stub.ReturnAssociationDetail returnAssociation;

    public ReturnShipmentDetail() {
    }

    public ReturnShipmentDetail(
           ReturnType returnType,
           Rma rma,
           ReturnEMailDetail returnEMailDetail,
           com.fedex.pickup.stub.ReturnAssociationDetail returnAssociation) {
           this.returnType = returnType;
           this.rma = rma;
           this.returnEMailDetail = returnEMailDetail;
           this.returnAssociation = returnAssociation;
    }


    /**
     * Gets the returnType value for this ReturnShipmentDetail.
     * 
     * @return returnType
     */
    public ReturnType getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this ReturnShipmentDetail.
     * 
     * @param returnType
     */
    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the rma value for this ReturnShipmentDetail.
     * 
     * @return rma
     */
    public Rma getRma() {
        return rma;
    }


    /**
     * Sets the rma value for this ReturnShipmentDetail.
     * 
     * @param rma
     */
    public void setRma(Rma rma) {
        this.rma = rma;
    }


    /**
     * Gets the returnEMailDetail value for this ReturnShipmentDetail.
     * 
     * @return returnEMailDetail
     */
    public ReturnEMailDetail getReturnEMailDetail() {
        return returnEMailDetail;
    }


    /**
     * Sets the returnEMailDetail value for this ReturnShipmentDetail.
     * 
     * @param returnEMailDetail
     */
    public void setReturnEMailDetail(ReturnEMailDetail returnEMailDetail) {
        this.returnEMailDetail = returnEMailDetail;
    }


    /**
     * Gets the returnAssociation value for this ReturnShipmentDetail.
     * 
     * @return returnAssociation
     */
    public com.fedex.pickup.stub.ReturnAssociationDetail getReturnAssociation() {
        return returnAssociation;
    }


    /**
     * Sets the returnAssociation value for this ReturnShipmentDetail.
     * 
     * @param returnAssociation
     */
    public void setReturnAssociation(com.fedex.pickup.stub.ReturnAssociationDetail returnAssociation) {
        this.returnAssociation = returnAssociation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReturnShipmentDetail)) return false;
        ReturnShipmentDetail other = (ReturnShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            ((this.rma==null && other.getRma()==null) || 
             (this.rma!=null &&
              this.rma.equals(other.getRma()))) &&
            ((this.returnEMailDetail==null && other.getReturnEMailDetail()==null) || 
             (this.returnEMailDetail!=null &&
              this.returnEMailDetail.equals(other.getReturnEMailDetail()))) &&
            ((this.returnAssociation==null && other.getReturnAssociation()==null) || 
             (this.returnAssociation!=null &&
              this.returnAssociation.equals(other.getReturnAssociation())));
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
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        if (getRma() != null) {
            _hashCode += getRma().hashCode();
        }
        if (getReturnEMailDetail() != null) {
            _hashCode += getReturnEMailDetail().hashCode();
        }
        if (getReturnAssociation() != null) {
            _hashCode += getReturnAssociation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Rma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Rma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnEMailDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnEMailDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnEMailDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnAssociationDetail"));
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

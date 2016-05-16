/**
 * PackageSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * These special services are available at the package level for some
 * or all service types. If the shipper is requesting a special service
 * which requires additional data, the package special service type must
 * be present in the specialServiceTypes collection, and the supporting
 * detail must be provided in the appropriate sub-object below.
 */
public class PackageSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * shipment or package. */
    private PackageSpecialServiceType[] specialServiceTypes;

    /* For use with FedEx Ground services only; COD must be present
     * in shipment's special services. */
    private CodDetail codDetail;

    private DangerousGoodsDetail dangerousGoodsDetail;

    private Weight dryIceWeight;

    private SignatureOptionDetail signatureOptionDetail;

    private org.apache.axis.types.NonNegativeInteger pieceCountVerificationBoxCount;

    private PriorityAlertDetail priorityAlertDetail;

    private AlcoholDetail alcoholDetail;

    public PackageSpecialServicesRequested() {
    }

    public PackageSpecialServicesRequested(
           PackageSpecialServiceType[] specialServiceTypes,
           CodDetail codDetail,
           DangerousGoodsDetail dangerousGoodsDetail,
           Weight dryIceWeight,
           SignatureOptionDetail signatureOptionDetail,
           org.apache.axis.types.NonNegativeInteger pieceCountVerificationBoxCount,
           PriorityAlertDetail priorityAlertDetail,
           AlcoholDetail alcoholDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.dangerousGoodsDetail = dangerousGoodsDetail;
           this.dryIceWeight = dryIceWeight;
           this.signatureOptionDetail = signatureOptionDetail;
           this.pieceCountVerificationBoxCount = pieceCountVerificationBoxCount;
           this.priorityAlertDetail = priorityAlertDetail;
           this.alcoholDetail = alcoholDetail;
    }


    /**
     * Gets the specialServiceTypes value for this PackageSpecialServicesRequested.
     * 
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public PackageSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this PackageSpecialServicesRequested.
     * 
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public void setSpecialServiceTypes(PackageSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public PackageSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, PackageSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this PackageSpecialServicesRequested.
     * 
     * @return codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this PackageSpecialServicesRequested.
     * 
     * @param codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public void setCodDetail(CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     * 
     * @return dangerousGoodsDetail
     */
    public DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }


    /**
     * Sets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     * 
     * @param dangerousGoodsDetail
     */
    public void setDangerousGoodsDetail(DangerousGoodsDetail dangerousGoodsDetail) {
        this.dangerousGoodsDetail = dangerousGoodsDetail;
    }


    /**
     * Gets the dryIceWeight value for this PackageSpecialServicesRequested.
     * 
     * @return dryIceWeight
     */
    public Weight getDryIceWeight() {
        return dryIceWeight;
    }


    /**
     * Sets the dryIceWeight value for this PackageSpecialServicesRequested.
     * 
     * @param dryIceWeight
     */
    public void setDryIceWeight(Weight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }


    /**
     * Gets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     * 
     * @return signatureOptionDetail
     */
    public SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }


    /**
     * Sets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     * 
     * @param signatureOptionDetail
     */
    public void setSignatureOptionDetail(SignatureOptionDetail signatureOptionDetail) {
        this.signatureOptionDetail = signatureOptionDetail;
    }


    /**
     * Gets the pieceCountVerificationBoxCount value for this PackageSpecialServicesRequested.
     * 
     * @return pieceCountVerificationBoxCount
     */
    public org.apache.axis.types.NonNegativeInteger getPieceCountVerificationBoxCount() {
        return pieceCountVerificationBoxCount;
    }


    /**
     * Sets the pieceCountVerificationBoxCount value for this PackageSpecialServicesRequested.
     * 
     * @param pieceCountVerificationBoxCount
     */
    public void setPieceCountVerificationBoxCount(org.apache.axis.types.NonNegativeInteger pieceCountVerificationBoxCount) {
        this.pieceCountVerificationBoxCount = pieceCountVerificationBoxCount;
    }


    /**
     * Gets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     * 
     * @return priorityAlertDetail
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }


    /**
     * Sets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     * 
     * @param priorityAlertDetail
     */
    public void setPriorityAlertDetail(PriorityAlertDetail priorityAlertDetail) {
        this.priorityAlertDetail = priorityAlertDetail;
    }


    /**
     * Gets the alcoholDetail value for this PackageSpecialServicesRequested.
     * 
     * @return alcoholDetail
     */
    public AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }


    /**
     * Sets the alcoholDetail value for this PackageSpecialServicesRequested.
     * 
     * @param alcoholDetail
     */
    public void setAlcoholDetail(AlcoholDetail alcoholDetail) {
        this.alcoholDetail = alcoholDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PackageSpecialServicesRequested)) return false;
        PackageSpecialServicesRequested other = (PackageSpecialServicesRequested) obj;
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
            ((this.codDetail==null && other.getCodDetail()==null) || 
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.dangerousGoodsDetail==null && other.getDangerousGoodsDetail()==null) || 
             (this.dangerousGoodsDetail!=null &&
              this.dangerousGoodsDetail.equals(other.getDangerousGoodsDetail()))) &&
            ((this.dryIceWeight==null && other.getDryIceWeight()==null) || 
             (this.dryIceWeight!=null &&
              this.dryIceWeight.equals(other.getDryIceWeight()))) &&
            ((this.signatureOptionDetail==null && other.getSignatureOptionDetail()==null) || 
             (this.signatureOptionDetail!=null &&
              this.signatureOptionDetail.equals(other.getSignatureOptionDetail()))) &&
            ((this.pieceCountVerificationBoxCount==null && other.getPieceCountVerificationBoxCount()==null) || 
             (this.pieceCountVerificationBoxCount!=null &&
              this.pieceCountVerificationBoxCount.equals(other.getPieceCountVerificationBoxCount()))) &&
            ((this.priorityAlertDetail==null && other.getPriorityAlertDetail()==null) || 
             (this.priorityAlertDetail!=null &&
              this.priorityAlertDetail.equals(other.getPriorityAlertDetail()))) &&
            ((this.alcoholDetail==null && other.getAlcoholDetail()==null) || 
             (this.alcoholDetail!=null &&
              this.alcoholDetail.equals(other.getAlcoholDetail())));
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
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDangerousGoodsDetail() != null) {
            _hashCode += getDangerousGoodsDetail().hashCode();
        }
        if (getDryIceWeight() != null) {
            _hashCode += getDryIceWeight().hashCode();
        }
        if (getSignatureOptionDetail() != null) {
            _hashCode += getSignatureOptionDetail().hashCode();
        }
        if (getPieceCountVerificationBoxCount() != null) {
            _hashCode += getPieceCountVerificationBoxCount().hashCode();
        }
        if (getPriorityAlertDetail() != null) {
            _hashCode += getPriorityAlertDetail().hashCode();
        }
        if (getAlcoholDetail() != null) {
            _hashCode += getAlcoholDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DryIceWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureOptionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCountVerificationBoxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PieceCountVerificationBoxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AlcoholDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AlcoholDetail"));
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

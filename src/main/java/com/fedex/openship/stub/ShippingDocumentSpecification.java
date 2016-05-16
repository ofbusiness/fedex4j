/**
 * ShippingDocumentSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Contains all data required for additional (non-label) shipping
 * documents to be produced in conjunction with a specific shipment.
 */
public class ShippingDocumentSpecification  implements java.io.Serializable {
    /* Indicates the types of shipping documents requested by the
     * shipper. */
    private RequestedShippingDocumentType[] shippingDocumentTypes;

    private CertificateOfOriginDetail certificateOfOrigin;

    private CommercialInvoiceDetail commercialInvoiceDetail;

    /* Specifies the production of each package-level custom document
     * (the same specification is used for all packages). */
    private CustomDocumentDetail[] customPackageDocumentDetail;

    /* Specifies the production of a shipment-level custom document. */
    private CustomDocumentDetail[] customShipmentDocumentDetail;

    private ExportDeclarationDetail exportDeclarationDetail;

    private GeneralAgencyAgreementDetail generalAgencyAgreementDetail;

    private com.fedex.openship.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail;

    /* Specifies the production of the OP-900 document for hazardous
     * materials packages. */
    private Op900Detail op900Detail;

    /* Specifies the production of the 1421c document for dangerous
     * goods shipment. */
    private com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail;

    /* Specifies the production of the OP-900 document for hazardous
     * materials. */
    private FreightAddressLabelDetail freightAddressLabelDetail;

    /* Specifies the production of the return instructions document. */
    private ReturnInstructionsDetail returnInstructionsDetail;

    public ShippingDocumentSpecification() {
    }

    public ShippingDocumentSpecification(
           RequestedShippingDocumentType[] shippingDocumentTypes,
           CertificateOfOriginDetail certificateOfOrigin,
           CommercialInvoiceDetail commercialInvoiceDetail,
           CustomDocumentDetail[] customPackageDocumentDetail,
           CustomDocumentDetail[] customShipmentDocumentDetail,
           ExportDeclarationDetail exportDeclarationDetail,
           GeneralAgencyAgreementDetail generalAgencyAgreementDetail,
           com.fedex.openship.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail,
           Op900Detail op900Detail,
           com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail,
           FreightAddressLabelDetail freightAddressLabelDetail,
           ReturnInstructionsDetail returnInstructionsDetail) {
           this.shippingDocumentTypes = shippingDocumentTypes;
           this.certificateOfOrigin = certificateOfOrigin;
           this.commercialInvoiceDetail = commercialInvoiceDetail;
           this.customPackageDocumentDetail = customPackageDocumentDetail;
           this.customShipmentDocumentDetail = customShipmentDocumentDetail;
           this.exportDeclarationDetail = exportDeclarationDetail;
           this.generalAgencyAgreementDetail = generalAgencyAgreementDetail;
           this.naftaCertificateOfOriginDetail = naftaCertificateOfOriginDetail;
           this.op900Detail = op900Detail;
           this.dangerousGoodsShippersDeclarationDetail = dangerousGoodsShippersDeclarationDetail;
           this.freightAddressLabelDetail = freightAddressLabelDetail;
           this.returnInstructionsDetail = returnInstructionsDetail;
    }


    /**
     * Gets the shippingDocumentTypes value for this ShippingDocumentSpecification.
     * 
     * @return shippingDocumentTypes   * Indicates the types of shipping documents requested by the
     * shipper.
     */
    public RequestedShippingDocumentType[] getShippingDocumentTypes() {
        return shippingDocumentTypes;
    }


    /**
     * Sets the shippingDocumentTypes value for this ShippingDocumentSpecification.
     * 
     * @param shippingDocumentTypes   * Indicates the types of shipping documents requested by the
     * shipper.
     */
    public void setShippingDocumentTypes(RequestedShippingDocumentType[] shippingDocumentTypes) {
        this.shippingDocumentTypes = shippingDocumentTypes;
    }

    public RequestedShippingDocumentType getShippingDocumentTypes(int i) {
        return this.shippingDocumentTypes[i];
    }

    public void setShippingDocumentTypes(int i, RequestedShippingDocumentType _value) {
        this.shippingDocumentTypes[i] = _value;
    }


    /**
     * Gets the certificateOfOrigin value for this ShippingDocumentSpecification.
     * 
     * @return certificateOfOrigin
     */
    public CertificateOfOriginDetail getCertificateOfOrigin() {
        return certificateOfOrigin;
    }


    /**
     * Sets the certificateOfOrigin value for this ShippingDocumentSpecification.
     * 
     * @param certificateOfOrigin
     */
    public void setCertificateOfOrigin(CertificateOfOriginDetail certificateOfOrigin) {
        this.certificateOfOrigin = certificateOfOrigin;
    }


    /**
     * Gets the commercialInvoiceDetail value for this ShippingDocumentSpecification.
     * 
     * @return commercialInvoiceDetail
     */
    public CommercialInvoiceDetail getCommercialInvoiceDetail() {
        return commercialInvoiceDetail;
    }


    /**
     * Sets the commercialInvoiceDetail value for this ShippingDocumentSpecification.
     * 
     * @param commercialInvoiceDetail
     */
    public void setCommercialInvoiceDetail(CommercialInvoiceDetail commercialInvoiceDetail) {
        this.commercialInvoiceDetail = commercialInvoiceDetail;
    }


    /**
     * Gets the customPackageDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @return customPackageDocumentDetail   * Specifies the production of each package-level custom document
     * (the same specification is used for all packages).
     */
    public CustomDocumentDetail[] getCustomPackageDocumentDetail() {
        return customPackageDocumentDetail;
    }


    /**
     * Sets the customPackageDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @param customPackageDocumentDetail   * Specifies the production of each package-level custom document
     * (the same specification is used for all packages).
     */
    public void setCustomPackageDocumentDetail(CustomDocumentDetail[] customPackageDocumentDetail) {
        this.customPackageDocumentDetail = customPackageDocumentDetail;
    }

    public CustomDocumentDetail getCustomPackageDocumentDetail(int i) {
        return this.customPackageDocumentDetail[i];
    }

    public void setCustomPackageDocumentDetail(int i, CustomDocumentDetail _value) {
        this.customPackageDocumentDetail[i] = _value;
    }


    /**
     * Gets the customShipmentDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @return customShipmentDocumentDetail   * Specifies the production of a shipment-level custom document.
     */
    public CustomDocumentDetail[] getCustomShipmentDocumentDetail() {
        return customShipmentDocumentDetail;
    }


    /**
     * Sets the customShipmentDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @param customShipmentDocumentDetail   * Specifies the production of a shipment-level custom document.
     */
    public void setCustomShipmentDocumentDetail(CustomDocumentDetail[] customShipmentDocumentDetail) {
        this.customShipmentDocumentDetail = customShipmentDocumentDetail;
    }

    public CustomDocumentDetail getCustomShipmentDocumentDetail(int i) {
        return this.customShipmentDocumentDetail[i];
    }

    public void setCustomShipmentDocumentDetail(int i, CustomDocumentDetail _value) {
        this.customShipmentDocumentDetail[i] = _value;
    }


    /**
     * Gets the exportDeclarationDetail value for this ShippingDocumentSpecification.
     * 
     * @return exportDeclarationDetail
     */
    public ExportDeclarationDetail getExportDeclarationDetail() {
        return exportDeclarationDetail;
    }


    /**
     * Sets the exportDeclarationDetail value for this ShippingDocumentSpecification.
     * 
     * @param exportDeclarationDetail
     */
    public void setExportDeclarationDetail(ExportDeclarationDetail exportDeclarationDetail) {
        this.exportDeclarationDetail = exportDeclarationDetail;
    }


    /**
     * Gets the generalAgencyAgreementDetail value for this ShippingDocumentSpecification.
     * 
     * @return generalAgencyAgreementDetail
     */
    public GeneralAgencyAgreementDetail getGeneralAgencyAgreementDetail() {
        return generalAgencyAgreementDetail;
    }


    /**
     * Sets the generalAgencyAgreementDetail value for this ShippingDocumentSpecification.
     * 
     * @param generalAgencyAgreementDetail
     */
    public void setGeneralAgencyAgreementDetail(GeneralAgencyAgreementDetail generalAgencyAgreementDetail) {
        this.generalAgencyAgreementDetail = generalAgencyAgreementDetail;
    }


    /**
     * Gets the naftaCertificateOfOriginDetail value for this ShippingDocumentSpecification.
     * 
     * @return naftaCertificateOfOriginDetail
     */
    public com.fedex.openship.stub.NaftaCertificateOfOriginDetail getNaftaCertificateOfOriginDetail() {
        return naftaCertificateOfOriginDetail;
    }


    /**
     * Sets the naftaCertificateOfOriginDetail value for this ShippingDocumentSpecification.
     * 
     * @param naftaCertificateOfOriginDetail
     */
    public void setNaftaCertificateOfOriginDetail(com.fedex.openship.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail) {
        this.naftaCertificateOfOriginDetail = naftaCertificateOfOriginDetail;
    }


    /**
     * Gets the op900Detail value for this ShippingDocumentSpecification.
     * 
     * @return op900Detail   * Specifies the production of the OP-900 document for hazardous
     * materials packages.
     */
    public Op900Detail getOp900Detail() {
        return op900Detail;
    }


    /**
     * Sets the op900Detail value for this ShippingDocumentSpecification.
     * 
     * @param op900Detail   * Specifies the production of the OP-900 document for hazardous
     * materials packages.
     */
    public void setOp900Detail(Op900Detail op900Detail) {
        this.op900Detail = op900Detail;
    }


    /**
     * Gets the dangerousGoodsShippersDeclarationDetail value for this ShippingDocumentSpecification.
     * 
     * @return dangerousGoodsShippersDeclarationDetail   * Specifies the production of the 1421c document for dangerous
     * goods shipment.
     */
    public com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail getDangerousGoodsShippersDeclarationDetail() {
        return dangerousGoodsShippersDeclarationDetail;
    }


    /**
     * Sets the dangerousGoodsShippersDeclarationDetail value for this ShippingDocumentSpecification.
     * 
     * @param dangerousGoodsShippersDeclarationDetail   * Specifies the production of the 1421c document for dangerous
     * goods shipment.
     */
    public void setDangerousGoodsShippersDeclarationDetail(com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail) {
        this.dangerousGoodsShippersDeclarationDetail = dangerousGoodsShippersDeclarationDetail;
    }


    /**
     * Gets the freightAddressLabelDetail value for this ShippingDocumentSpecification.
     * 
     * @return freightAddressLabelDetail   * Specifies the production of the OP-900 document for hazardous
     * materials.
     */
    public FreightAddressLabelDetail getFreightAddressLabelDetail() {
        return freightAddressLabelDetail;
    }


    /**
     * Sets the freightAddressLabelDetail value for this ShippingDocumentSpecification.
     * 
     * @param freightAddressLabelDetail   * Specifies the production of the OP-900 document for hazardous
     * materials.
     */
    public void setFreightAddressLabelDetail(FreightAddressLabelDetail freightAddressLabelDetail) {
        this.freightAddressLabelDetail = freightAddressLabelDetail;
    }


    /**
     * Gets the returnInstructionsDetail value for this ShippingDocumentSpecification.
     * 
     * @return returnInstructionsDetail   * Specifies the production of the return instructions document.
     */
    public ReturnInstructionsDetail getReturnInstructionsDetail() {
        return returnInstructionsDetail;
    }


    /**
     * Sets the returnInstructionsDetail value for this ShippingDocumentSpecification.
     * 
     * @param returnInstructionsDetail   * Specifies the production of the return instructions document.
     */
    public void setReturnInstructionsDetail(ReturnInstructionsDetail returnInstructionsDetail) {
        this.returnInstructionsDetail = returnInstructionsDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingDocumentSpecification)) return false;
        ShippingDocumentSpecification other = (ShippingDocumentSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingDocumentTypes==null && other.getShippingDocumentTypes()==null) || 
             (this.shippingDocumentTypes!=null &&
              java.util.Arrays.equals(this.shippingDocumentTypes, other.getShippingDocumentTypes()))) &&
            ((this.certificateOfOrigin==null && other.getCertificateOfOrigin()==null) || 
             (this.certificateOfOrigin!=null &&
              this.certificateOfOrigin.equals(other.getCertificateOfOrigin()))) &&
            ((this.commercialInvoiceDetail==null && other.getCommercialInvoiceDetail()==null) || 
             (this.commercialInvoiceDetail!=null &&
              this.commercialInvoiceDetail.equals(other.getCommercialInvoiceDetail()))) &&
            ((this.customPackageDocumentDetail==null && other.getCustomPackageDocumentDetail()==null) || 
             (this.customPackageDocumentDetail!=null &&
              java.util.Arrays.equals(this.customPackageDocumentDetail, other.getCustomPackageDocumentDetail()))) &&
            ((this.customShipmentDocumentDetail==null && other.getCustomShipmentDocumentDetail()==null) || 
             (this.customShipmentDocumentDetail!=null &&
              java.util.Arrays.equals(this.customShipmentDocumentDetail, other.getCustomShipmentDocumentDetail()))) &&
            ((this.exportDeclarationDetail==null && other.getExportDeclarationDetail()==null) || 
             (this.exportDeclarationDetail!=null &&
              this.exportDeclarationDetail.equals(other.getExportDeclarationDetail()))) &&
            ((this.generalAgencyAgreementDetail==null && other.getGeneralAgencyAgreementDetail()==null) || 
             (this.generalAgencyAgreementDetail!=null &&
              this.generalAgencyAgreementDetail.equals(other.getGeneralAgencyAgreementDetail()))) &&
            ((this.naftaCertificateOfOriginDetail==null && other.getNaftaCertificateOfOriginDetail()==null) || 
             (this.naftaCertificateOfOriginDetail!=null &&
              this.naftaCertificateOfOriginDetail.equals(other.getNaftaCertificateOfOriginDetail()))) &&
            ((this.op900Detail==null && other.getOp900Detail()==null) || 
             (this.op900Detail!=null &&
              this.op900Detail.equals(other.getOp900Detail()))) &&
            ((this.dangerousGoodsShippersDeclarationDetail==null && other.getDangerousGoodsShippersDeclarationDetail()==null) || 
             (this.dangerousGoodsShippersDeclarationDetail!=null &&
              this.dangerousGoodsShippersDeclarationDetail.equals(other.getDangerousGoodsShippersDeclarationDetail()))) &&
            ((this.freightAddressLabelDetail==null && other.getFreightAddressLabelDetail()==null) || 
             (this.freightAddressLabelDetail!=null &&
              this.freightAddressLabelDetail.equals(other.getFreightAddressLabelDetail()))) &&
            ((this.returnInstructionsDetail==null && other.getReturnInstructionsDetail()==null) || 
             (this.returnInstructionsDetail!=null &&
              this.returnInstructionsDetail.equals(other.getReturnInstructionsDetail())));
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
        if (getShippingDocumentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDocumentTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getShippingDocumentTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificateOfOrigin() != null) {
            _hashCode += getCertificateOfOrigin().hashCode();
        }
        if (getCommercialInvoiceDetail() != null) {
            _hashCode += getCommercialInvoiceDetail().hashCode();
        }
        if (getCustomPackageDocumentDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomPackageDocumentDetail());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomPackageDocumentDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomShipmentDocumentDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomShipmentDocumentDetail());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomShipmentDocumentDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExportDeclarationDetail() != null) {
            _hashCode += getExportDeclarationDetail().hashCode();
        }
        if (getGeneralAgencyAgreementDetail() != null) {
            _hashCode += getGeneralAgencyAgreementDetail().hashCode();
        }
        if (getNaftaCertificateOfOriginDetail() != null) {
            _hashCode += getNaftaCertificateOfOriginDetail().hashCode();
        }
        if (getOp900Detail() != null) {
            _hashCode += getOp900Detail().hashCode();
        }
        if (getDangerousGoodsShippersDeclarationDetail() != null) {
            _hashCode += getDangerousGoodsShippersDeclarationDetail().hashCode();
        }
        if (getFreightAddressLabelDetail() != null) {
            _hashCode += getFreightAddressLabelDetail().hashCode();
        }
        if (getReturnInstructionsDetail() != null) {
            _hashCode += getReturnInstructionsDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDocumentSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShippingDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateOfOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CertificateOfOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CertificateOfOriginDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CommercialInvoiceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CommercialInvoiceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPackageDocumentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomPackageDocumentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customShipmentDocumentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomShipmentDocumentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportDeclarationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportDeclarationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportDeclarationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalAgencyAgreementDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GeneralAgencyAgreementDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GeneralAgencyAgreementDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naftaCertificateOfOriginDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaCertificateOfOriginDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaCertificateOfOriginDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op900Detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Op900Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Op900Detail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsShippersDeclarationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsShippersDeclarationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsShippersDeclarationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightAddressLabelDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightAddressLabelDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightAddressLabelDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnInstructionsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnInstructionsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnInstructionsDetail"));
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

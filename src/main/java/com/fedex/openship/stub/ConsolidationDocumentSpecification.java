/**
 * ConsolidationDocumentSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Contains all data required for (non-label) documents to be produced
 * in conjunction with a specific international distribution consolidation.
 */
public class ConsolidationDocumentSpecification  implements java.io.Serializable {
    /* Indicates the types of international distribution documents
     * requested by the shipper. */
    private com.fedex.openship.stub.RequestedConsolidationDocumentType[] consolidationDocumentTypes;

    /* Specifies the production of the short form of the Child Reference
     * Number document. */
    private CondensedCrnReportDetail condensedCrnReportDetail;

    /* Specifies the production of the consolidated commercial invoice
     * document. */
    private com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail consolidatedCommercialInvoiceDetail;

    /* Specifies the production of the consolidation-level custom
     * documents. */
    private CustomConsolidationDocumentDetail[] customDocumentDetails;

    private com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail consolidatedCustomsLinehaulReportDetail;

    private ConsolidatedPartyReportDetail consolidatedPartyReportDetail;

    private com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail consolidatedSoldToSummaryReportDetail;

    /* Specifies the production of the consolidation-level customs
     * packing list. */
    private CustomsPackingListDetail customsPackingListDetail;

    /* Specifies the production of the Child Reference Number document. */
    private CrnReportDetail crnReportDetail;

    public ConsolidationDocumentSpecification() {
    }

    public ConsolidationDocumentSpecification(
           com.fedex.openship.stub.RequestedConsolidationDocumentType[] consolidationDocumentTypes,
           CondensedCrnReportDetail condensedCrnReportDetail,
           com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail consolidatedCommercialInvoiceDetail,
           CustomConsolidationDocumentDetail[] customDocumentDetails,
           com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail consolidatedCustomsLinehaulReportDetail,
           ConsolidatedPartyReportDetail consolidatedPartyReportDetail,
           com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail consolidatedSoldToSummaryReportDetail,
           CustomsPackingListDetail customsPackingListDetail,
           CrnReportDetail crnReportDetail) {
           this.consolidationDocumentTypes = consolidationDocumentTypes;
           this.condensedCrnReportDetail = condensedCrnReportDetail;
           this.consolidatedCommercialInvoiceDetail = consolidatedCommercialInvoiceDetail;
           this.customDocumentDetails = customDocumentDetails;
           this.consolidatedCustomsLinehaulReportDetail = consolidatedCustomsLinehaulReportDetail;
           this.consolidatedPartyReportDetail = consolidatedPartyReportDetail;
           this.consolidatedSoldToSummaryReportDetail = consolidatedSoldToSummaryReportDetail;
           this.customsPackingListDetail = customsPackingListDetail;
           this.crnReportDetail = crnReportDetail;
    }


    /**
     * Gets the consolidationDocumentTypes value for this ConsolidationDocumentSpecification.
     * 
     * @return consolidationDocumentTypes   * Indicates the types of international distribution documents
     * requested by the shipper.
     */
    public com.fedex.openship.stub.RequestedConsolidationDocumentType[] getConsolidationDocumentTypes() {
        return consolidationDocumentTypes;
    }


    /**
     * Sets the consolidationDocumentTypes value for this ConsolidationDocumentSpecification.
     * 
     * @param consolidationDocumentTypes   * Indicates the types of international distribution documents
     * requested by the shipper.
     */
    public void setConsolidationDocumentTypes(com.fedex.openship.stub.RequestedConsolidationDocumentType[] consolidationDocumentTypes) {
        this.consolidationDocumentTypes = consolidationDocumentTypes;
    }

    public com.fedex.openship.stub.RequestedConsolidationDocumentType getConsolidationDocumentTypes(int i) {
        return this.consolidationDocumentTypes[i];
    }

    public void setConsolidationDocumentTypes(int i, com.fedex.openship.stub.RequestedConsolidationDocumentType _value) {
        this.consolidationDocumentTypes[i] = _value;
    }


    /**
     * Gets the condensedCrnReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return condensedCrnReportDetail   * Specifies the production of the short form of the Child Reference
     * Number document.
     */
    public CondensedCrnReportDetail getCondensedCrnReportDetail() {
        return condensedCrnReportDetail;
    }


    /**
     * Sets the condensedCrnReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param condensedCrnReportDetail   * Specifies the production of the short form of the Child Reference
     * Number document.
     */
    public void setCondensedCrnReportDetail(CondensedCrnReportDetail condensedCrnReportDetail) {
        this.condensedCrnReportDetail = condensedCrnReportDetail;
    }


    /**
     * Gets the consolidatedCommercialInvoiceDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return consolidatedCommercialInvoiceDetail   * Specifies the production of the consolidated commercial invoice
     * document.
     */
    public com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail getConsolidatedCommercialInvoiceDetail() {
        return consolidatedCommercialInvoiceDetail;
    }


    /**
     * Sets the consolidatedCommercialInvoiceDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param consolidatedCommercialInvoiceDetail   * Specifies the production of the consolidated commercial invoice
     * document.
     */
    public void setConsolidatedCommercialInvoiceDetail(com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail consolidatedCommercialInvoiceDetail) {
        this.consolidatedCommercialInvoiceDetail = consolidatedCommercialInvoiceDetail;
    }


    /**
     * Gets the customDocumentDetails value for this ConsolidationDocumentSpecification.
     * 
     * @return customDocumentDetails   * Specifies the production of the consolidation-level custom
     * documents.
     */
    public CustomConsolidationDocumentDetail[] getCustomDocumentDetails() {
        return customDocumentDetails;
    }


    /**
     * Sets the customDocumentDetails value for this ConsolidationDocumentSpecification.
     * 
     * @param customDocumentDetails   * Specifies the production of the consolidation-level custom
     * documents.
     */
    public void setCustomDocumentDetails(CustomConsolidationDocumentDetail[] customDocumentDetails) {
        this.customDocumentDetails = customDocumentDetails;
    }

    public CustomConsolidationDocumentDetail getCustomDocumentDetails(int i) {
        return this.customDocumentDetails[i];
    }

    public void setCustomDocumentDetails(int i, CustomConsolidationDocumentDetail _value) {
        this.customDocumentDetails[i] = _value;
    }


    /**
     * Gets the consolidatedCustomsLinehaulReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return consolidatedCustomsLinehaulReportDetail
     */
    public com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail getConsolidatedCustomsLinehaulReportDetail() {
        return consolidatedCustomsLinehaulReportDetail;
    }


    /**
     * Sets the consolidatedCustomsLinehaulReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param consolidatedCustomsLinehaulReportDetail
     */
    public void setConsolidatedCustomsLinehaulReportDetail(com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail consolidatedCustomsLinehaulReportDetail) {
        this.consolidatedCustomsLinehaulReportDetail = consolidatedCustomsLinehaulReportDetail;
    }


    /**
     * Gets the consolidatedPartyReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return consolidatedPartyReportDetail
     */
    public ConsolidatedPartyReportDetail getConsolidatedPartyReportDetail() {
        return consolidatedPartyReportDetail;
    }


    /**
     * Sets the consolidatedPartyReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param consolidatedPartyReportDetail
     */
    public void setConsolidatedPartyReportDetail(ConsolidatedPartyReportDetail consolidatedPartyReportDetail) {
        this.consolidatedPartyReportDetail = consolidatedPartyReportDetail;
    }


    /**
     * Gets the consolidatedSoldToSummaryReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return consolidatedSoldToSummaryReportDetail
     */
    public com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail getConsolidatedSoldToSummaryReportDetail() {
        return consolidatedSoldToSummaryReportDetail;
    }


    /**
     * Sets the consolidatedSoldToSummaryReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param consolidatedSoldToSummaryReportDetail
     */
    public void setConsolidatedSoldToSummaryReportDetail(com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail consolidatedSoldToSummaryReportDetail) {
        this.consolidatedSoldToSummaryReportDetail = consolidatedSoldToSummaryReportDetail;
    }


    /**
     * Gets the customsPackingListDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return customsPackingListDetail   * Specifies the production of the consolidation-level customs
     * packing list.
     */
    public CustomsPackingListDetail getCustomsPackingListDetail() {
        return customsPackingListDetail;
    }


    /**
     * Sets the customsPackingListDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param customsPackingListDetail   * Specifies the production of the consolidation-level customs
     * packing list.
     */
    public void setCustomsPackingListDetail(CustomsPackingListDetail customsPackingListDetail) {
        this.customsPackingListDetail = customsPackingListDetail;
    }


    /**
     * Gets the crnReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @return crnReportDetail   * Specifies the production of the Child Reference Number document.
     */
    public CrnReportDetail getCrnReportDetail() {
        return crnReportDetail;
    }


    /**
     * Sets the crnReportDetail value for this ConsolidationDocumentSpecification.
     * 
     * @param crnReportDetail   * Specifies the production of the Child Reference Number document.
     */
    public void setCrnReportDetail(CrnReportDetail crnReportDetail) {
        this.crnReportDetail = crnReportDetail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationDocumentSpecification)) return false;
        ConsolidationDocumentSpecification other = (ConsolidationDocumentSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consolidationDocumentTypes==null && other.getConsolidationDocumentTypes()==null) || 
             (this.consolidationDocumentTypes!=null &&
              java.util.Arrays.equals(this.consolidationDocumentTypes, other.getConsolidationDocumentTypes()))) &&
            ((this.condensedCrnReportDetail==null && other.getCondensedCrnReportDetail()==null) || 
             (this.condensedCrnReportDetail!=null &&
              this.condensedCrnReportDetail.equals(other.getCondensedCrnReportDetail()))) &&
            ((this.consolidatedCommercialInvoiceDetail==null && other.getConsolidatedCommercialInvoiceDetail()==null) || 
             (this.consolidatedCommercialInvoiceDetail!=null &&
              this.consolidatedCommercialInvoiceDetail.equals(other.getConsolidatedCommercialInvoiceDetail()))) &&
            ((this.customDocumentDetails==null && other.getCustomDocumentDetails()==null) || 
             (this.customDocumentDetails!=null &&
              java.util.Arrays.equals(this.customDocumentDetails, other.getCustomDocumentDetails()))) &&
            ((this.consolidatedCustomsLinehaulReportDetail==null && other.getConsolidatedCustomsLinehaulReportDetail()==null) || 
             (this.consolidatedCustomsLinehaulReportDetail!=null &&
              this.consolidatedCustomsLinehaulReportDetail.equals(other.getConsolidatedCustomsLinehaulReportDetail()))) &&
            ((this.consolidatedPartyReportDetail==null && other.getConsolidatedPartyReportDetail()==null) || 
             (this.consolidatedPartyReportDetail!=null &&
              this.consolidatedPartyReportDetail.equals(other.getConsolidatedPartyReportDetail()))) &&
            ((this.consolidatedSoldToSummaryReportDetail==null && other.getConsolidatedSoldToSummaryReportDetail()==null) || 
             (this.consolidatedSoldToSummaryReportDetail!=null &&
              this.consolidatedSoldToSummaryReportDetail.equals(other.getConsolidatedSoldToSummaryReportDetail()))) &&
            ((this.customsPackingListDetail==null && other.getCustomsPackingListDetail()==null) || 
             (this.customsPackingListDetail!=null &&
              this.customsPackingListDetail.equals(other.getCustomsPackingListDetail()))) &&
            ((this.crnReportDetail==null && other.getCrnReportDetail()==null) || 
             (this.crnReportDetail!=null &&
              this.crnReportDetail.equals(other.getCrnReportDetail())));
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
        if (getConsolidationDocumentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidationDocumentTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConsolidationDocumentTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCondensedCrnReportDetail() != null) {
            _hashCode += getCondensedCrnReportDetail().hashCode();
        }
        if (getConsolidatedCommercialInvoiceDetail() != null) {
            _hashCode += getConsolidatedCommercialInvoiceDetail().hashCode();
        }
        if (getCustomDocumentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomDocumentDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomDocumentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolidatedCustomsLinehaulReportDetail() != null) {
            _hashCode += getConsolidatedCustomsLinehaulReportDetail().hashCode();
        }
        if (getConsolidatedPartyReportDetail() != null) {
            _hashCode += getConsolidatedPartyReportDetail().hashCode();
        }
        if (getConsolidatedSoldToSummaryReportDetail() != null) {
            _hashCode += getConsolidatedSoldToSummaryReportDetail().hashCode();
        }
        if (getCustomsPackingListDetail() != null) {
            _hashCode += getCustomsPackingListDetail().hashCode();
        }
        if (getCrnReportDetail() != null) {
            _hashCode += getCrnReportDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsolidationDocumentSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationDocumentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condensedCrnReportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CondensedCrnReportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CondensedCrnReportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedCommercialInvoiceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommercialInvoiceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommercialInvoiceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDocumentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDocumentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomConsolidationDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedCustomsLinehaulReportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCustomsLinehaulReportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationCustomsLinehaulReportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedPartyReportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedPartyReportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedPartyReportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedSoldToSummaryReportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedSoldToSummaryReportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedSoldToSummaryReportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsPackingListDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsPackingListDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsPackingListDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crnReportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CrnReportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CrnReportDetail"));
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

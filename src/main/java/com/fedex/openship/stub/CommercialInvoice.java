/**
 * CommercialInvoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * CommercialInvoice element is required for electronic upload of
 * CI data. It will serve to create/transmit an Electronic Commercial
 * Invoice through the FedEx Systems. Customers are responsible for printing
 * their own Commercial Invoice.If you would likeFedEx to generate a
 * Commercial Invoice and transmit it to Customs. for clearance purposes,
 * you need to specify that in the ShippingDocumentSpecification element.
 * If you would like a copy of the Commercial Invoice that FedEx generated
 * returned to you in reply it needs to be specified in the ETDDetail/RequestedDocumentCopies
 * element. Commercial Invoice support consists of maximum of 99 commodity
 * line items.
 */
public class CommercialInvoice  implements java.io.Serializable {
    /* Any comments that need to be communicated about this shipment. */
    private String[] comments;

    /* Any freight charges that are associated with this shipment. */
    private Money freightCharge;

    /* Any taxes or miscellaneous charges(other than Freight charges
     * or Insurance charges) that are associated with this shipment. */
    private Money taxesOrMiscellaneousCharge;

    /* Specifies which kind of charge is being recorded in the preceding
     * field. */
    private com.fedex.openship.stub.TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType;

    /* Any packing costs that are associated with this shipment. */
    private Money packingCosts;

    /* Any handling costs that are associated with this shipment. */
    private Money handlingCosts;

    /* Free-form text. */
    private String specialInstructions;

    /* Free-form text. */
    private String declarationStatement;

    /* Free-form text. */
    private String paymentTerms;

    /* The reason for the shipment. Note: SOLD is not a valid purpose
     * for a Proforma Invoice. */
    private com.fedex.openship.stub.PurposeOfShipmentType purpose;

    /* Additional customer reference data. */
    private com.fedex.openship.stub.CustomerReference[] customerReferences;

    /* Name of the International Expert that completed the Commercial
     * Invoice different from Sender. */
    private String originatorName;

    /* Required for dutiable international Express or Ground shipments.
     * This field is not applicable to an international PIB(document) or
     * a non-document which does not require a Commercial Invoice. */
    private String termsOfSale;

    public CommercialInvoice() {
    }

    public CommercialInvoice(
           String[] comments,
           Money freightCharge,
           Money taxesOrMiscellaneousCharge,
           com.fedex.openship.stub.TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType,
           Money packingCosts,
           Money handlingCosts,
           String specialInstructions,
           String declarationStatement,
           String paymentTerms,
           com.fedex.openship.stub.PurposeOfShipmentType purpose,
           com.fedex.openship.stub.CustomerReference[] customerReferences,
           String originatorName,
           String termsOfSale) {
           this.comments = comments;
           this.freightCharge = freightCharge;
           this.taxesOrMiscellaneousCharge = taxesOrMiscellaneousCharge;
           this.taxesOrMiscellaneousChargeType = taxesOrMiscellaneousChargeType;
           this.packingCosts = packingCosts;
           this.handlingCosts = handlingCosts;
           this.specialInstructions = specialInstructions;
           this.declarationStatement = declarationStatement;
           this.paymentTerms = paymentTerms;
           this.purpose = purpose;
           this.customerReferences = customerReferences;
           this.originatorName = originatorName;
           this.termsOfSale = termsOfSale;
    }


    /**
     * Gets the comments value for this CommercialInvoice.
     * 
     * @return comments   * Any comments that need to be communicated about this shipment.
     */
    public String[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CommercialInvoice.
     * 
     * @param comments   * Any comments that need to be communicated about this shipment.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public String getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, String _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the freightCharge value for this CommercialInvoice.
     * 
     * @return freightCharge   * Any freight charges that are associated with this shipment.
     */
    public Money getFreightCharge() {
        return freightCharge;
    }


    /**
     * Sets the freightCharge value for this CommercialInvoice.
     * 
     * @param freightCharge   * Any freight charges that are associated with this shipment.
     */
    public void setFreightCharge(Money freightCharge) {
        this.freightCharge = freightCharge;
    }


    /**
     * Gets the taxesOrMiscellaneousCharge value for this CommercialInvoice.
     * 
     * @return taxesOrMiscellaneousCharge   * Any taxes or miscellaneous charges(other than Freight charges
     * or Insurance charges) that are associated with this shipment.
     */
    public Money getTaxesOrMiscellaneousCharge() {
        return taxesOrMiscellaneousCharge;
    }


    /**
     * Sets the taxesOrMiscellaneousCharge value for this CommercialInvoice.
     * 
     * @param taxesOrMiscellaneousCharge   * Any taxes or miscellaneous charges(other than Freight charges
     * or Insurance charges) that are associated with this shipment.
     */
    public void setTaxesOrMiscellaneousCharge(Money taxesOrMiscellaneousCharge) {
        this.taxesOrMiscellaneousCharge = taxesOrMiscellaneousCharge;
    }


    /**
     * Gets the taxesOrMiscellaneousChargeType value for this CommercialInvoice.
     * 
     * @return taxesOrMiscellaneousChargeType   * Specifies which kind of charge is being recorded in the preceding
     * field.
     */
    public com.fedex.openship.stub.TaxesOrMiscellaneousChargeType getTaxesOrMiscellaneousChargeType() {
        return taxesOrMiscellaneousChargeType;
    }


    /**
     * Sets the taxesOrMiscellaneousChargeType value for this CommercialInvoice.
     * 
     * @param taxesOrMiscellaneousChargeType   * Specifies which kind of charge is being recorded in the preceding
     * field.
     */
    public void setTaxesOrMiscellaneousChargeType(com.fedex.openship.stub.TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType) {
        this.taxesOrMiscellaneousChargeType = taxesOrMiscellaneousChargeType;
    }


    /**
     * Gets the packingCosts value for this CommercialInvoice.
     * 
     * @return packingCosts   * Any packing costs that are associated with this shipment.
     */
    public Money getPackingCosts() {
        return packingCosts;
    }


    /**
     * Sets the packingCosts value for this CommercialInvoice.
     * 
     * @param packingCosts   * Any packing costs that are associated with this shipment.
     */
    public void setPackingCosts(Money packingCosts) {
        this.packingCosts = packingCosts;
    }


    /**
     * Gets the handlingCosts value for this CommercialInvoice.
     * 
     * @return handlingCosts   * Any handling costs that are associated with this shipment.
     */
    public Money getHandlingCosts() {
        return handlingCosts;
    }


    /**
     * Sets the handlingCosts value for this CommercialInvoice.
     * 
     * @param handlingCosts   * Any handling costs that are associated with this shipment.
     */
    public void setHandlingCosts(Money handlingCosts) {
        this.handlingCosts = handlingCosts;
    }


    /**
     * Gets the specialInstructions value for this CommercialInvoice.
     * 
     * @return specialInstructions   * Free-form text.
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }


    /**
     * Sets the specialInstructions value for this CommercialInvoice.
     * 
     * @param specialInstructions   * Free-form text.
     */
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }


    /**
     * Gets the declarationStatement value for this CommercialInvoice.
     * 
     * @return declarationStatement   * Free-form text.
     */
    public String getDeclarationStatement() {
        return declarationStatement;
    }


    /**
     * Sets the declarationStatement value for this CommercialInvoice.
     * 
     * @param declarationStatement   * Free-form text.
     */
    public void setDeclarationStatement(String declarationStatement) {
        this.declarationStatement = declarationStatement;
    }


    /**
     * Gets the paymentTerms value for this CommercialInvoice.
     * 
     * @return paymentTerms   * Free-form text.
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }


    /**
     * Sets the paymentTerms value for this CommercialInvoice.
     * 
     * @param paymentTerms   * Free-form text.
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }


    /**
     * Gets the purpose value for this CommercialInvoice.
     * 
     * @return purpose   * The reason for the shipment. Note: SOLD is not a valid purpose
     * for a Proforma Invoice.
     */
    public com.fedex.openship.stub.PurposeOfShipmentType getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this CommercialInvoice.
     * 
     * @param purpose   * The reason for the shipment. Note: SOLD is not a valid purpose
     * for a Proforma Invoice.
     */
    public void setPurpose(com.fedex.openship.stub.PurposeOfShipmentType purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the customerReferences value for this CommercialInvoice.
     * 
     * @return customerReferences   * Additional customer reference data.
     */
    public com.fedex.openship.stub.CustomerReference[] getCustomerReferences() {
        return customerReferences;
    }


    /**
     * Sets the customerReferences value for this CommercialInvoice.
     * 
     * @param customerReferences   * Additional customer reference data.
     */
    public void setCustomerReferences(com.fedex.openship.stub.CustomerReference[] customerReferences) {
        this.customerReferences = customerReferences;
    }

    public com.fedex.openship.stub.CustomerReference getCustomerReferences(int i) {
        return this.customerReferences[i];
    }

    public void setCustomerReferences(int i, com.fedex.openship.stub.CustomerReference _value) {
        this.customerReferences[i] = _value;
    }


    /**
     * Gets the originatorName value for this CommercialInvoice.
     * 
     * @return originatorName   * Name of the International Expert that completed the Commercial
     * Invoice different from Sender.
     */
    public String getOriginatorName() {
        return originatorName;
    }


    /**
     * Sets the originatorName value for this CommercialInvoice.
     * 
     * @param originatorName   * Name of the International Expert that completed the Commercial
     * Invoice different from Sender.
     */
    public void setOriginatorName(String originatorName) {
        this.originatorName = originatorName;
    }


    /**
     * Gets the termsOfSale value for this CommercialInvoice.
     * 
     * @return termsOfSale   * Required for dutiable international Express or Ground shipments.
     * This field is not applicable to an international PIB(document) or
     * a non-document which does not require a Commercial Invoice.
     */
    public String getTermsOfSale() {
        return termsOfSale;
    }


    /**
     * Sets the termsOfSale value for this CommercialInvoice.
     * 
     * @param termsOfSale   * Required for dutiable international Express or Ground shipments.
     * This field is not applicable to an international PIB(document) or
     * a non-document which does not require a Commercial Invoice.
     */
    public void setTermsOfSale(String termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CommercialInvoice)) return false;
        CommercialInvoice other = (CommercialInvoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.freightCharge==null && other.getFreightCharge()==null) || 
             (this.freightCharge!=null &&
              this.freightCharge.equals(other.getFreightCharge()))) &&
            ((this.taxesOrMiscellaneousCharge==null && other.getTaxesOrMiscellaneousCharge()==null) || 
             (this.taxesOrMiscellaneousCharge!=null &&
              this.taxesOrMiscellaneousCharge.equals(other.getTaxesOrMiscellaneousCharge()))) &&
            ((this.taxesOrMiscellaneousChargeType==null && other.getTaxesOrMiscellaneousChargeType()==null) || 
             (this.taxesOrMiscellaneousChargeType!=null &&
              this.taxesOrMiscellaneousChargeType.equals(other.getTaxesOrMiscellaneousChargeType()))) &&
            ((this.packingCosts==null && other.getPackingCosts()==null) || 
             (this.packingCosts!=null &&
              this.packingCosts.equals(other.getPackingCosts()))) &&
            ((this.handlingCosts==null && other.getHandlingCosts()==null) || 
             (this.handlingCosts!=null &&
              this.handlingCosts.equals(other.getHandlingCosts()))) &&
            ((this.specialInstructions==null && other.getSpecialInstructions()==null) || 
             (this.specialInstructions!=null &&
              this.specialInstructions.equals(other.getSpecialInstructions()))) &&
            ((this.declarationStatement==null && other.getDeclarationStatement()==null) || 
             (this.declarationStatement!=null &&
              this.declarationStatement.equals(other.getDeclarationStatement()))) &&
            ((this.paymentTerms==null && other.getPaymentTerms()==null) || 
             (this.paymentTerms!=null &&
              this.paymentTerms.equals(other.getPaymentTerms()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.customerReferences==null && other.getCustomerReferences()==null) || 
             (this.customerReferences!=null &&
              java.util.Arrays.equals(this.customerReferences, other.getCustomerReferences()))) &&
            ((this.originatorName==null && other.getOriginatorName()==null) || 
             (this.originatorName!=null &&
              this.originatorName.equals(other.getOriginatorName()))) &&
            ((this.termsOfSale==null && other.getTermsOfSale()==null) || 
             (this.termsOfSale!=null &&
              this.termsOfSale.equals(other.getTermsOfSale())));
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
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreightCharge() != null) {
            _hashCode += getFreightCharge().hashCode();
        }
        if (getTaxesOrMiscellaneousCharge() != null) {
            _hashCode += getTaxesOrMiscellaneousCharge().hashCode();
        }
        if (getTaxesOrMiscellaneousChargeType() != null) {
            _hashCode += getTaxesOrMiscellaneousChargeType().hashCode();
        }
        if (getPackingCosts() != null) {
            _hashCode += getPackingCosts().hashCode();
        }
        if (getHandlingCosts() != null) {
            _hashCode += getHandlingCosts().hashCode();
        }
        if (getSpecialInstructions() != null) {
            _hashCode += getSpecialInstructions().hashCode();
        }
        if (getDeclarationStatement() != null) {
            _hashCode += getDeclarationStatement().hashCode();
        }
        if (getPaymentTerms() != null) {
            _hashCode += getPaymentTerms().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getCustomerReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerReferences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomerReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginatorName() != null) {
            _hashCode += getOriginatorName().hashCode();
        }
        if (getTermsOfSale() != null) {
            _hashCode += getTermsOfSale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommercialInvoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CommercialInvoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxesOrMiscellaneousCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxesOrMiscellaneousCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxesOrMiscellaneousChargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxesOrMiscellaneousChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxesOrMiscellaneousChargeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HandlingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarationStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeclarationStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PaymentTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PurposeOfShipmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "OriginatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsOfSale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TermsOfSale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

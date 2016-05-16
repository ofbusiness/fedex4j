/**
 * SignatureProofOfDeliveryLetterRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;


/**
 * FedEx Signature Proof Of Delivery Letter request.
 */
public class SignatureProofOfDeliveryLetterRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private WebAuthenticationDetail webAuthenticationDetail;

    /* Descriptive data identifying the client submitting the transaction. */
    private ClientDetail clientDetail;

    /* Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations. */
    private TransactionDetail transactionDetail;

    /* The version of the request being used. */
    private VersionId version;

    /* Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery. */
    private QualifiedTrackingNumber qualifiedTrackingNumber;

    /* Additional customer-supplied text to be added to the body of
     * the letter. */
    private String additionalComments;

    /* Identifies the set of SPOD image types. */
    private SignatureProofOfDeliveryImageType letterFormat;

    /* If provided this information will be print on the letter. */
    private ContactAndAddress consignee;

    public SignatureProofOfDeliveryLetterRequest() {
    }

    public SignatureProofOfDeliveryLetterRequest(
           WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           QualifiedTrackingNumber qualifiedTrackingNumber,
           String additionalComments,
           SignatureProofOfDeliveryImageType letterFormat,
           ContactAndAddress consignee) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.qualifiedTrackingNumber = qualifiedTrackingNumber;
           this.additionalComments = additionalComments;
           this.letterFormat = letterFormat;
           this.consignee = consignee;
    }


    /**
     * Gets the webAuthenticationDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param transactionDetail   * Contains a free form field that is echoed back in the reply
     * to match requests with replies and data that governs the data payload
     * language/translations.
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return version   * The version of the request being used.
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param version   * The version of the request being used.
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the qualifiedTrackingNumber value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return qualifiedTrackingNumber   * Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery.
     */
    public QualifiedTrackingNumber getQualifiedTrackingNumber() {
        return qualifiedTrackingNumber;
    }


    /**
     * Sets the qualifiedTrackingNumber value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param qualifiedTrackingNumber   * Tracking number and additional shipment data used to identify
     * a unique shipment for proof of delivery.
     */
    public void setQualifiedTrackingNumber(QualifiedTrackingNumber qualifiedTrackingNumber) {
        this.qualifiedTrackingNumber = qualifiedTrackingNumber;
    }


    /**
     * Gets the additionalComments value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return additionalComments   * Additional customer-supplied text to be added to the body of
     * the letter.
     */
    public String getAdditionalComments() {
        return additionalComments;
    }


    /**
     * Sets the additionalComments value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param additionalComments   * Additional customer-supplied text to be added to the body of
     * the letter.
     */
    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }


    /**
     * Gets the letterFormat value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return letterFormat   * Identifies the set of SPOD image types.
     */
    public SignatureProofOfDeliveryImageType getLetterFormat() {
        return letterFormat;
    }


    /**
     * Sets the letterFormat value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param letterFormat   * Identifies the set of SPOD image types.
     */
    public void setLetterFormat(SignatureProofOfDeliveryImageType letterFormat) {
        this.letterFormat = letterFormat;
    }


    /**
     * Gets the consignee value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @return consignee   * If provided this information will be print on the letter.
     */
    public ContactAndAddress getConsignee() {
        return consignee;
    }


    /**
     * Sets the consignee value for this SignatureProofOfDeliveryLetterRequest.
     * 
     * @param consignee   * If provided this information will be print on the letter.
     */
    public void setConsignee(ContactAndAddress consignee) {
        this.consignee = consignee;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SignatureProofOfDeliveryLetterRequest)) return false;
        SignatureProofOfDeliveryLetterRequest other = (SignatureProofOfDeliveryLetterRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.qualifiedTrackingNumber==null && other.getQualifiedTrackingNumber()==null) || 
             (this.qualifiedTrackingNumber!=null &&
              this.qualifiedTrackingNumber.equals(other.getQualifiedTrackingNumber()))) &&
            ((this.additionalComments==null && other.getAdditionalComments()==null) || 
             (this.additionalComments!=null &&
              this.additionalComments.equals(other.getAdditionalComments()))) &&
            ((this.letterFormat==null && other.getLetterFormat()==null) || 
             (this.letterFormat!=null &&
              this.letterFormat.equals(other.getLetterFormat()))) &&
            ((this.consignee==null && other.getConsignee()==null) || 
             (this.consignee!=null &&
              this.consignee.equals(other.getConsignee())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getQualifiedTrackingNumber() != null) {
            _hashCode += getQualifiedTrackingNumber().hashCode();
        }
        if (getAdditionalComments() != null) {
            _hashCode += getAdditionalComments().hashCode();
        }
        if (getLetterFormat() != null) {
            _hashCode += getLetterFormat().hashCode();
        }
        if (getConsignee() != null) {
            _hashCode += getConsignee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatureProofOfDeliveryLetterRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryLetterRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "QualifiedTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "QualifiedTrackingNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "AdditionalComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("letterFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "LetterFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "SignatureProofOfDeliveryImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "Consignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v10", "ContactAndAddress"));
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

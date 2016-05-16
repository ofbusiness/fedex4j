/**
 * ConsolidationDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidationDocument  implements java.io.Serializable {
    /* Identifies the type of business document in this instance. */
    private com.fedex.openship.stub.ReturnedConsolidationDocumentType type;

    private com.fedex.openship.stub.ShippingDocumentDispositionType shippingDocumentDisposition;

    /* The name under which a STORED or DEFERRED document is written. */
    private String accessReference;

    /* Specifies the image type of the consoldiation document. */
    private com.fedex.openship.stub.ShippingDocumentImageType imageType;

    /* Specifies the image resolution in DPI (dots per inch). */
    private org.apache.axis.types.NonNegativeInteger resolution;

    /* Can be zero for documents whose disposition implies that no
     * content is included. */
    private org.apache.axis.types.NonNegativeInteger copiesToPrint;

    /* One or more document parts which make up a single logical document,
     * such as multiple pages of a single form. */
    private ShippingDocumentPart[] parts;

    public ConsolidationDocument() {
    }

    public ConsolidationDocument(
           com.fedex.openship.stub.ReturnedConsolidationDocumentType type,
           com.fedex.openship.stub.ShippingDocumentDispositionType shippingDocumentDisposition,
           String accessReference,
           com.fedex.openship.stub.ShippingDocumentImageType imageType,
           org.apache.axis.types.NonNegativeInteger resolution,
           org.apache.axis.types.NonNegativeInteger copiesToPrint,
           ShippingDocumentPart[] parts) {
           this.type = type;
           this.shippingDocumentDisposition = shippingDocumentDisposition;
           this.accessReference = accessReference;
           this.imageType = imageType;
           this.resolution = resolution;
           this.copiesToPrint = copiesToPrint;
           this.parts = parts;
    }


    /**
     * Gets the type value for this ConsolidationDocument.
     * 
     * @return type   * Identifies the type of business document in this instance.
     */
    public com.fedex.openship.stub.ReturnedConsolidationDocumentType getType() {
        return type;
    }


    /**
     * Sets the type value for this ConsolidationDocument.
     * 
     * @param type   * Identifies the type of business document in this instance.
     */
    public void setType(com.fedex.openship.stub.ReturnedConsolidationDocumentType type) {
        this.type = type;
    }


    /**
     * Gets the shippingDocumentDisposition value for this ConsolidationDocument.
     * 
     * @return shippingDocumentDisposition
     */
    public com.fedex.openship.stub.ShippingDocumentDispositionType getShippingDocumentDisposition() {
        return shippingDocumentDisposition;
    }


    /**
     * Sets the shippingDocumentDisposition value for this ConsolidationDocument.
     * 
     * @param shippingDocumentDisposition
     */
    public void setShippingDocumentDisposition(com.fedex.openship.stub.ShippingDocumentDispositionType shippingDocumentDisposition) {
        this.shippingDocumentDisposition = shippingDocumentDisposition;
    }


    /**
     * Gets the accessReference value for this ConsolidationDocument.
     * 
     * @return accessReference   * The name under which a STORED or DEFERRED document is written.
     */
    public String getAccessReference() {
        return accessReference;
    }


    /**
     * Sets the accessReference value for this ConsolidationDocument.
     * 
     * @param accessReference   * The name under which a STORED or DEFERRED document is written.
     */
    public void setAccessReference(String accessReference) {
        this.accessReference = accessReference;
    }


    /**
     * Gets the imageType value for this ConsolidationDocument.
     * 
     * @return imageType   * Specifies the image type of the consoldiation document.
     */
    public com.fedex.openship.stub.ShippingDocumentImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this ConsolidationDocument.
     * 
     * @param imageType   * Specifies the image type of the consoldiation document.
     */
    public void setImageType(com.fedex.openship.stub.ShippingDocumentImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the resolution value for this ConsolidationDocument.
     * 
     * @return resolution   * Specifies the image resolution in DPI (dots per inch).
     */
    public org.apache.axis.types.NonNegativeInteger getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this ConsolidationDocument.
     * 
     * @param resolution   * Specifies the image resolution in DPI (dots per inch).
     */
    public void setResolution(org.apache.axis.types.NonNegativeInteger resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the copiesToPrint value for this ConsolidationDocument.
     * 
     * @return copiesToPrint   * Can be zero for documents whose disposition implies that no
     * content is included.
     */
    public org.apache.axis.types.NonNegativeInteger getCopiesToPrint() {
        return copiesToPrint;
    }


    /**
     * Sets the copiesToPrint value for this ConsolidationDocument.
     * 
     * @param copiesToPrint   * Can be zero for documents whose disposition implies that no
     * content is included.
     */
    public void setCopiesToPrint(org.apache.axis.types.NonNegativeInteger copiesToPrint) {
        this.copiesToPrint = copiesToPrint;
    }


    /**
     * Gets the parts value for this ConsolidationDocument.
     * 
     * @return parts   * One or more document parts which make up a single logical document,
     * such as multiple pages of a single form.
     */
    public ShippingDocumentPart[] getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this ConsolidationDocument.
     * 
     * @param parts   * One or more document parts which make up a single logical document,
     * such as multiple pages of a single form.
     */
    public void setParts(ShippingDocumentPart[] parts) {
        this.parts = parts;
    }

    public ShippingDocumentPart getParts(int i) {
        return this.parts[i];
    }

    public void setParts(int i, ShippingDocumentPart _value) {
        this.parts[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationDocument)) return false;
        ConsolidationDocument other = (ConsolidationDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.shippingDocumentDisposition==null && other.getShippingDocumentDisposition()==null) || 
             (this.shippingDocumentDisposition!=null &&
              this.shippingDocumentDisposition.equals(other.getShippingDocumentDisposition()))) &&
            ((this.accessReference==null && other.getAccessReference()==null) || 
             (this.accessReference!=null &&
              this.accessReference.equals(other.getAccessReference()))) &&
            ((this.imageType==null && other.getImageType()==null) || 
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.copiesToPrint==null && other.getCopiesToPrint()==null) || 
             (this.copiesToPrint!=null &&
              this.copiesToPrint.equals(other.getCopiesToPrint()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              java.util.Arrays.equals(this.parts, other.getParts())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getShippingDocumentDisposition() != null) {
            _hashCode += getShippingDocumentDisposition().hashCode();
        }
        if (getAccessReference() != null) {
            _hashCode += getAccessReference().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getCopiesToPrint() != null) {
            _hashCode += getCopiesToPrint().hashCode();
        }
        if (getParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParts(), i);
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
        new org.apache.axis.description.TypeDesc(ConsolidationDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedConsolidationDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentDisposition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentDisposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentDispositionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AccessReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copiesToPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CopiesToPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentPart"));
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

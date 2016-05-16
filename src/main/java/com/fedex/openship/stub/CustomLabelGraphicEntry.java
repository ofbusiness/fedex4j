/**
 * CustomLabelGraphicEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Image to be included from printer's memory, or from a local file
 * for offline clients.
 */
public class CustomLabelGraphicEntry  implements java.io.Serializable {
    private CustomLabelPosition position;

    /* Printer-specific index of graphic image to be printed. */
    private String printerGraphicId;

    /* Fully-qualified path and file name for graphic image to be
     * printed. */
    private String fileGraphicFullName;

    public CustomLabelGraphicEntry() {
    }

    public CustomLabelGraphicEntry(
           CustomLabelPosition position,
           String printerGraphicId,
           String fileGraphicFullName) {
           this.position = position;
           this.printerGraphicId = printerGraphicId;
           this.fileGraphicFullName = fileGraphicFullName;
    }


    /**
     * Gets the position value for this CustomLabelGraphicEntry.
     * 
     * @return position
     */
    public CustomLabelPosition getPosition() {
        return position;
    }


    /**
     * Sets the position value for this CustomLabelGraphicEntry.
     * 
     * @param position
     */
    public void setPosition(CustomLabelPosition position) {
        this.position = position;
    }


    /**
     * Gets the printerGraphicId value for this CustomLabelGraphicEntry.
     * 
     * @return printerGraphicId   * Printer-specific index of graphic image to be printed.
     */
    public String getPrinterGraphicId() {
        return printerGraphicId;
    }


    /**
     * Sets the printerGraphicId value for this CustomLabelGraphicEntry.
     * 
     * @param printerGraphicId   * Printer-specific index of graphic image to be printed.
     */
    public void setPrinterGraphicId(String printerGraphicId) {
        this.printerGraphicId = printerGraphicId;
    }


    /**
     * Gets the fileGraphicFullName value for this CustomLabelGraphicEntry.
     * 
     * @return fileGraphicFullName   * Fully-qualified path and file name for graphic image to be
     * printed.
     */
    public String getFileGraphicFullName() {
        return fileGraphicFullName;
    }


    /**
     * Sets the fileGraphicFullName value for this CustomLabelGraphicEntry.
     * 
     * @param fileGraphicFullName   * Fully-qualified path and file name for graphic image to be
     * printed.
     */
    public void setFileGraphicFullName(String fileGraphicFullName) {
        this.fileGraphicFullName = fileGraphicFullName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomLabelGraphicEntry)) return false;
        CustomLabelGraphicEntry other = (CustomLabelGraphicEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.printerGraphicId==null && other.getPrinterGraphicId()==null) || 
             (this.printerGraphicId!=null &&
              this.printerGraphicId.equals(other.getPrinterGraphicId()))) &&
            ((this.fileGraphicFullName==null && other.getFileGraphicFullName()==null) || 
             (this.fileGraphicFullName!=null &&
              this.fileGraphicFullName.equals(other.getFileGraphicFullName())));
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getPrinterGraphicId() != null) {
            _hashCode += getPrinterGraphicId().hashCode();
        }
        if (getFileGraphicFullName() != null) {
            _hashCode += getFileGraphicFullName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomLabelGraphicEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelGraphicEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printerGraphicId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PrinterGraphicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileGraphicFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FileGraphicFullName"));
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

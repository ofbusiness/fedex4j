/**
 * CustomLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CustomLabelDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.CustomLabelCoordinateUnits coordinateUnits;

    private com.fedex.openship.stub.CustomLabelTextEntry[] textEntries;

    private com.fedex.openship.stub.CustomLabelGraphicEntry[] graphicEntries;

    private com.fedex.openship.stub.CustomLabelBoxEntry[] boxEntries;

    private com.fedex.openship.stub.CustomLabelTextBoxEntry[] textBoxEntries;

    private com.fedex.openship.stub.CustomLabelBarcodeEntry[] barcodeEntries;

    public CustomLabelDetail() {
    }

    public CustomLabelDetail(
           com.fedex.openship.stub.CustomLabelCoordinateUnits coordinateUnits,
           com.fedex.openship.stub.CustomLabelTextEntry[] textEntries,
           com.fedex.openship.stub.CustomLabelGraphicEntry[] graphicEntries,
           com.fedex.openship.stub.CustomLabelBoxEntry[] boxEntries,
           com.fedex.openship.stub.CustomLabelTextBoxEntry[] textBoxEntries,
           com.fedex.openship.stub.CustomLabelBarcodeEntry[] barcodeEntries) {
           this.coordinateUnits = coordinateUnits;
           this.textEntries = textEntries;
           this.graphicEntries = graphicEntries;
           this.boxEntries = boxEntries;
           this.textBoxEntries = textBoxEntries;
           this.barcodeEntries = barcodeEntries;
    }


    /**
     * Gets the coordinateUnits value for this CustomLabelDetail.
     * 
     * @return coordinateUnits
     */
    public com.fedex.openship.stub.CustomLabelCoordinateUnits getCoordinateUnits() {
        return coordinateUnits;
    }


    /**
     * Sets the coordinateUnits value for this CustomLabelDetail.
     * 
     * @param coordinateUnits
     */
    public void setCoordinateUnits(com.fedex.openship.stub.CustomLabelCoordinateUnits coordinateUnits) {
        this.coordinateUnits = coordinateUnits;
    }


    /**
     * Gets the textEntries value for this CustomLabelDetail.
     * 
     * @return textEntries
     */
    public com.fedex.openship.stub.CustomLabelTextEntry[] getTextEntries() {
        return textEntries;
    }


    /**
     * Sets the textEntries value for this CustomLabelDetail.
     * 
     * @param textEntries
     */
    public void setTextEntries(com.fedex.openship.stub.CustomLabelTextEntry[] textEntries) {
        this.textEntries = textEntries;
    }

    public com.fedex.openship.stub.CustomLabelTextEntry getTextEntries(int i) {
        return this.textEntries[i];
    }

    public void setTextEntries(int i, com.fedex.openship.stub.CustomLabelTextEntry _value) {
        this.textEntries[i] = _value;
    }


    /**
     * Gets the graphicEntries value for this CustomLabelDetail.
     * 
     * @return graphicEntries
     */
    public com.fedex.openship.stub.CustomLabelGraphicEntry[] getGraphicEntries() {
        return graphicEntries;
    }


    /**
     * Sets the graphicEntries value for this CustomLabelDetail.
     * 
     * @param graphicEntries
     */
    public void setGraphicEntries(com.fedex.openship.stub.CustomLabelGraphicEntry[] graphicEntries) {
        this.graphicEntries = graphicEntries;
    }

    public com.fedex.openship.stub.CustomLabelGraphicEntry getGraphicEntries(int i) {
        return this.graphicEntries[i];
    }

    public void setGraphicEntries(int i, com.fedex.openship.stub.CustomLabelGraphicEntry _value) {
        this.graphicEntries[i] = _value;
    }


    /**
     * Gets the boxEntries value for this CustomLabelDetail.
     * 
     * @return boxEntries
     */
    public com.fedex.openship.stub.CustomLabelBoxEntry[] getBoxEntries() {
        return boxEntries;
    }


    /**
     * Sets the boxEntries value for this CustomLabelDetail.
     * 
     * @param boxEntries
     */
    public void setBoxEntries(com.fedex.openship.stub.CustomLabelBoxEntry[] boxEntries) {
        this.boxEntries = boxEntries;
    }

    public com.fedex.openship.stub.CustomLabelBoxEntry getBoxEntries(int i) {
        return this.boxEntries[i];
    }

    public void setBoxEntries(int i, com.fedex.openship.stub.CustomLabelBoxEntry _value) {
        this.boxEntries[i] = _value;
    }


    /**
     * Gets the textBoxEntries value for this CustomLabelDetail.
     * 
     * @return textBoxEntries
     */
    public com.fedex.openship.stub.CustomLabelTextBoxEntry[] getTextBoxEntries() {
        return textBoxEntries;
    }


    /**
     * Sets the textBoxEntries value for this CustomLabelDetail.
     * 
     * @param textBoxEntries
     */
    public void setTextBoxEntries(com.fedex.openship.stub.CustomLabelTextBoxEntry[] textBoxEntries) {
        this.textBoxEntries = textBoxEntries;
    }

    public com.fedex.openship.stub.CustomLabelTextBoxEntry getTextBoxEntries(int i) {
        return this.textBoxEntries[i];
    }

    public void setTextBoxEntries(int i, com.fedex.openship.stub.CustomLabelTextBoxEntry _value) {
        this.textBoxEntries[i] = _value;
    }


    /**
     * Gets the barcodeEntries value for this CustomLabelDetail.
     * 
     * @return barcodeEntries
     */
    public com.fedex.openship.stub.CustomLabelBarcodeEntry[] getBarcodeEntries() {
        return barcodeEntries;
    }


    /**
     * Sets the barcodeEntries value for this CustomLabelDetail.
     * 
     * @param barcodeEntries
     */
    public void setBarcodeEntries(com.fedex.openship.stub.CustomLabelBarcodeEntry[] barcodeEntries) {
        this.barcodeEntries = barcodeEntries;
    }

    public com.fedex.openship.stub.CustomLabelBarcodeEntry getBarcodeEntries(int i) {
        return this.barcodeEntries[i];
    }

    public void setBarcodeEntries(int i, com.fedex.openship.stub.CustomLabelBarcodeEntry _value) {
        this.barcodeEntries[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomLabelDetail)) return false;
        CustomLabelDetail other = (CustomLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coordinateUnits==null && other.getCoordinateUnits()==null) || 
             (this.coordinateUnits!=null &&
              this.coordinateUnits.equals(other.getCoordinateUnits()))) &&
            ((this.textEntries==null && other.getTextEntries()==null) || 
             (this.textEntries!=null &&
              java.util.Arrays.equals(this.textEntries, other.getTextEntries()))) &&
            ((this.graphicEntries==null && other.getGraphicEntries()==null) || 
             (this.graphicEntries!=null &&
              java.util.Arrays.equals(this.graphicEntries, other.getGraphicEntries()))) &&
            ((this.boxEntries==null && other.getBoxEntries()==null) || 
             (this.boxEntries!=null &&
              java.util.Arrays.equals(this.boxEntries, other.getBoxEntries()))) &&
            ((this.textBoxEntries==null && other.getTextBoxEntries()==null) || 
             (this.textBoxEntries!=null &&
              java.util.Arrays.equals(this.textBoxEntries, other.getTextBoxEntries()))) &&
            ((this.barcodeEntries==null && other.getBarcodeEntries()==null) || 
             (this.barcodeEntries!=null &&
              java.util.Arrays.equals(this.barcodeEntries, other.getBarcodeEntries())));
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
        if (getCoordinateUnits() != null) {
            _hashCode += getCoordinateUnits().hashCode();
        }
        if (getTextEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTextEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGraphicEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphicEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGraphicEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoxEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoxEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBoxEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTextBoxEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextBoxEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTextBoxEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarcodeEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarcodeEntries());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBarcodeEntries(), i);
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
        new org.apache.axis.description.TypeDesc(CustomLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CoordinateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelCoordinateUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TextEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelTextEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GraphicEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelGraphicEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BoxEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelBoxEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textBoxEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TextBoxEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelTextBoxEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BarcodeEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelBarcodeEntry"));
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

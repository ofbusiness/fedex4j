/**
 * RadionuclideDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RadionuclideDetail  implements java.io.Serializable {
    private String radionuclide;

    private com.fedex.openship.stub.RadionuclideActivity activity;

    /* Indicates whether packaging type "EXCEPTED" or "EXCEPTED_PACKAGE"
     * is for radioactive material in reportable quantity. */
    private Boolean exceptedPackagingIsReportableQuantity;

    private PhysicalFormType physicalForm;

    private String chemicalForm;

    public RadionuclideDetail() {
    }

    public RadionuclideDetail(
           String radionuclide,
           com.fedex.openship.stub.RadionuclideActivity activity,
           Boolean exceptedPackagingIsReportableQuantity,
           PhysicalFormType physicalForm,
           String chemicalForm) {
           this.radionuclide = radionuclide;
           this.activity = activity;
           this.exceptedPackagingIsReportableQuantity = exceptedPackagingIsReportableQuantity;
           this.physicalForm = physicalForm;
           this.chemicalForm = chemicalForm;
    }


    /**
     * Gets the radionuclide value for this RadionuclideDetail.
     * 
     * @return radionuclide
     */
    public String getRadionuclide() {
        return radionuclide;
    }


    /**
     * Sets the radionuclide value for this RadionuclideDetail.
     * 
     * @param radionuclide
     */
    public void setRadionuclide(String radionuclide) {
        this.radionuclide = radionuclide;
    }


    /**
     * Gets the activity value for this RadionuclideDetail.
     * 
     * @return activity
     */
    public com.fedex.openship.stub.RadionuclideActivity getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this RadionuclideDetail.
     * 
     * @param activity
     */
    public void setActivity(com.fedex.openship.stub.RadionuclideActivity activity) {
        this.activity = activity;
    }


    /**
     * Gets the exceptedPackagingIsReportableQuantity value for this RadionuclideDetail.
     * 
     * @return exceptedPackagingIsReportableQuantity   * Indicates whether packaging type "EXCEPTED" or "EXCEPTED_PACKAGE"
     * is for radioactive material in reportable quantity.
     */
    public Boolean getExceptedPackagingIsReportableQuantity() {
        return exceptedPackagingIsReportableQuantity;
    }


    /**
     * Sets the exceptedPackagingIsReportableQuantity value for this RadionuclideDetail.
     * 
     * @param exceptedPackagingIsReportableQuantity   * Indicates whether packaging type "EXCEPTED" or "EXCEPTED_PACKAGE"
     * is for radioactive material in reportable quantity.
     */
    public void setExceptedPackagingIsReportableQuantity(Boolean exceptedPackagingIsReportableQuantity) {
        this.exceptedPackagingIsReportableQuantity = exceptedPackagingIsReportableQuantity;
    }


    /**
     * Gets the physicalForm value for this RadionuclideDetail.
     * 
     * @return physicalForm
     */
    public PhysicalFormType getPhysicalForm() {
        return physicalForm;
    }


    /**
     * Sets the physicalForm value for this RadionuclideDetail.
     * 
     * @param physicalForm
     */
    public void setPhysicalForm(PhysicalFormType physicalForm) {
        this.physicalForm = physicalForm;
    }


    /**
     * Gets the chemicalForm value for this RadionuclideDetail.
     * 
     * @return chemicalForm
     */
    public String getChemicalForm() {
        return chemicalForm;
    }


    /**
     * Sets the chemicalForm value for this RadionuclideDetail.
     * 
     * @param chemicalForm
     */
    public void setChemicalForm(String chemicalForm) {
        this.chemicalForm = chemicalForm;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RadionuclideDetail)) return false;
        RadionuclideDetail other = (RadionuclideDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.radionuclide==null && other.getRadionuclide()==null) || 
             (this.radionuclide!=null &&
              this.radionuclide.equals(other.getRadionuclide()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.exceptedPackagingIsReportableQuantity==null && other.getExceptedPackagingIsReportableQuantity()==null) || 
             (this.exceptedPackagingIsReportableQuantity!=null &&
              this.exceptedPackagingIsReportableQuantity.equals(other.getExceptedPackagingIsReportableQuantity()))) &&
            ((this.physicalForm==null && other.getPhysicalForm()==null) || 
             (this.physicalForm!=null &&
              this.physicalForm.equals(other.getPhysicalForm()))) &&
            ((this.chemicalForm==null && other.getChemicalForm()==null) || 
             (this.chemicalForm!=null &&
              this.chemicalForm.equals(other.getChemicalForm())));
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
        if (getRadionuclide() != null) {
            _hashCode += getRadionuclide().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getExceptedPackagingIsReportableQuantity() != null) {
            _hashCode += getExceptedPackagingIsReportableQuantity().hashCode();
        }
        if (getPhysicalForm() != null) {
            _hashCode += getPhysicalForm().hashCode();
        }
        if (getChemicalForm() != null) {
            _hashCode += getChemicalForm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RadionuclideDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadionuclideDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radionuclide");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Radionuclide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadionuclideActivity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptedPackagingIsReportableQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExceptedPackagingIsReportableQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PhysicalForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PhysicalFormType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemicalForm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ChemicalForm"));
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

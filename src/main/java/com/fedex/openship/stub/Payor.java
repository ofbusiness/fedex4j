/**
 * Payor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * The descriptive data identifying the party responsible for payment
 * for a service.
 */
public class Payor  implements java.io.Serializable {
    private Party responsibleParty;

    private com.fedex.openship.stub.AssociatedAccount[] associatedAccounts;

    public Payor() {
    }

    public Payor(
           Party responsibleParty,
           com.fedex.openship.stub.AssociatedAccount[] associatedAccounts) {
           this.responsibleParty = responsibleParty;
           this.associatedAccounts = associatedAccounts;
    }


    /**
     * Gets the responsibleParty value for this Payor.
     * 
     * @return responsibleParty
     */
    public Party getResponsibleParty() {
        return responsibleParty;
    }


    /**
     * Sets the responsibleParty value for this Payor.
     * 
     * @param responsibleParty
     */
    public void setResponsibleParty(Party responsibleParty) {
        this.responsibleParty = responsibleParty;
    }


    /**
     * Gets the associatedAccounts value for this Payor.
     * 
     * @return associatedAccounts
     */
    public com.fedex.openship.stub.AssociatedAccount[] getAssociatedAccounts() {
        return associatedAccounts;
    }


    /**
     * Sets the associatedAccounts value for this Payor.
     * 
     * @param associatedAccounts
     */
    public void setAssociatedAccounts(com.fedex.openship.stub.AssociatedAccount[] associatedAccounts) {
        this.associatedAccounts = associatedAccounts;
    }

    public com.fedex.openship.stub.AssociatedAccount getAssociatedAccounts(int i) {
        return this.associatedAccounts[i];
    }

    public void setAssociatedAccounts(int i, com.fedex.openship.stub.AssociatedAccount _value) {
        this.associatedAccounts[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Payor)) return false;
        Payor other = (Payor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responsibleParty==null && other.getResponsibleParty()==null) || 
             (this.responsibleParty!=null &&
              this.responsibleParty.equals(other.getResponsibleParty()))) &&
            ((this.associatedAccounts==null && other.getAssociatedAccounts()==null) || 
             (this.associatedAccounts!=null &&
              java.util.Arrays.equals(this.associatedAccounts, other.getAssociatedAccounts())));
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
        if (getResponsibleParty() != null) {
            _hashCode += getResponsibleParty().hashCode();
        }
        if (getAssociatedAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedAccounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAssociatedAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(Payor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ResponsibleParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedAccount"));
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

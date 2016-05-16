/**
 * FreightPickupDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class FreightPickupDetail  implements java.io.Serializable {
    /* Contact Information of origin service center representative
     * that authorized the pickup */
    private Contact approvedBy;

    private PaymentType payment;

    private com.fedex.pickup.stub.FreightShipmentRoleType role;

    /* Used in connection with "Send Bill To" (SBT) identification
     * of customer's account used for billing. */
    private Party alternateBilling;

    private Contact submittedBy;

    private com.fedex.pickup.stub.FreightPickupLineItem[] lineItems;

    public FreightPickupDetail() {
    }

    public FreightPickupDetail(
           Contact approvedBy,
           PaymentType payment,
           com.fedex.pickup.stub.FreightShipmentRoleType role,
           Party alternateBilling,
           Contact submittedBy,
           com.fedex.pickup.stub.FreightPickupLineItem[] lineItems) {
           this.approvedBy = approvedBy;
           this.payment = payment;
           this.role = role;
           this.alternateBilling = alternateBilling;
           this.submittedBy = submittedBy;
           this.lineItems = lineItems;
    }


    /**
     * Gets the approvedBy value for this FreightPickupDetail.
     * 
     * @return approvedBy   * Contact Information of origin service center representative
     * that authorized the pickup
     */
    public Contact getApprovedBy() {
        return approvedBy;
    }


    /**
     * Sets the approvedBy value for this FreightPickupDetail.
     * 
     * @param approvedBy   * Contact Information of origin service center representative
     * that authorized the pickup
     */
    public void setApprovedBy(Contact approvedBy) {
        this.approvedBy = approvedBy;
    }


    /**
     * Gets the payment value for this FreightPickupDetail.
     * 
     * @return payment
     */
    public PaymentType getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this FreightPickupDetail.
     * 
     * @param payment
     */
    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }


    /**
     * Gets the role value for this FreightPickupDetail.
     * 
     * @return role
     */
    public com.fedex.pickup.stub.FreightShipmentRoleType getRole() {
        return role;
    }


    /**
     * Sets the role value for this FreightPickupDetail.
     * 
     * @param role
     */
    public void setRole(com.fedex.pickup.stub.FreightShipmentRoleType role) {
        this.role = role;
    }


    /**
     * Gets the alternateBilling value for this FreightPickupDetail.
     * 
     * @return alternateBilling   * Used in connection with "Send Bill To" (SBT) identification
     * of customer's account used for billing.
     */
    public Party getAlternateBilling() {
        return alternateBilling;
    }


    /**
     * Sets the alternateBilling value for this FreightPickupDetail.
     * 
     * @param alternateBilling   * Used in connection with "Send Bill To" (SBT) identification
     * of customer's account used for billing.
     */
    public void setAlternateBilling(Party alternateBilling) {
        this.alternateBilling = alternateBilling;
    }


    /**
     * Gets the submittedBy value for this FreightPickupDetail.
     * 
     * @return submittedBy
     */
    public Contact getSubmittedBy() {
        return submittedBy;
    }


    /**
     * Sets the submittedBy value for this FreightPickupDetail.
     * 
     * @param submittedBy
     */
    public void setSubmittedBy(Contact submittedBy) {
        this.submittedBy = submittedBy;
    }


    /**
     * Gets the lineItems value for this FreightPickupDetail.
     * 
     * @return lineItems
     */
    public com.fedex.pickup.stub.FreightPickupLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this FreightPickupDetail.
     * 
     * @param lineItems
     */
    public void setLineItems(com.fedex.pickup.stub.FreightPickupLineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.fedex.pickup.stub.FreightPickupLineItem getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.fedex.pickup.stub.FreightPickupLineItem _value) {
        this.lineItems[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreightPickupDetail)) return false;
        FreightPickupDetail other = (FreightPickupDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvedBy==null && other.getApprovedBy()==null) || 
             (this.approvedBy!=null &&
              this.approvedBy.equals(other.getApprovedBy()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.alternateBilling==null && other.getAlternateBilling()==null) || 
             (this.alternateBilling!=null &&
              this.alternateBilling.equals(other.getAlternateBilling()))) &&
            ((this.submittedBy==null && other.getSubmittedBy()==null) || 
             (this.submittedBy!=null &&
              this.submittedBy.equals(other.getSubmittedBy()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems())));
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
        if (getApprovedBy() != null) {
            _hashCode += getApprovedBy().hashCode();
        }
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getAlternateBilling() != null) {
            _hashCode += getAlternateBilling().hashCode();
        }
        if (getSubmittedBy() != null) {
            _hashCode += getSubmittedBy().hashCode();
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(FreightPickupDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightPickupDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ApprovedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightShipmentRoleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AlternateBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SubmittedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FreightPickupLineItem"));
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

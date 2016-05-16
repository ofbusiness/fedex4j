/**
 * ExpressFreightPickupDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class ExpressFreightPickupDetail  implements java.io.Serializable {
    private ServiceType service;

    private String bookingNumber;

    private Dimensions dimensions;

    private TruckType truckType;

    private TrailerSizeType trailerSize;

    public ExpressFreightPickupDetail() {
    }

    public ExpressFreightPickupDetail(
           ServiceType service,
           String bookingNumber,
           Dimensions dimensions,
           TruckType truckType,
           TrailerSizeType trailerSize) {
           this.service = service;
           this.bookingNumber = bookingNumber;
           this.dimensions = dimensions;
           this.truckType = truckType;
           this.trailerSize = trailerSize;
    }


    /**
     * Gets the service value for this ExpressFreightPickupDetail.
     * 
     * @return service
     */
    public ServiceType getService() {
        return service;
    }


    /**
     * Sets the service value for this ExpressFreightPickupDetail.
     * 
     * @param service
     */
    public void setService(ServiceType service) {
        this.service = service;
    }


    /**
     * Gets the bookingNumber value for this ExpressFreightPickupDetail.
     * 
     * @return bookingNumber
     */
    public String getBookingNumber() {
        return bookingNumber;
    }


    /**
     * Sets the bookingNumber value for this ExpressFreightPickupDetail.
     * 
     * @param bookingNumber
     */
    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }


    /**
     * Gets the dimensions value for this ExpressFreightPickupDetail.
     * 
     * @return dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ExpressFreightPickupDetail.
     * 
     * @param dimensions
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the truckType value for this ExpressFreightPickupDetail.
     * 
     * @return truckType
     */
    public TruckType getTruckType() {
        return truckType;
    }


    /**
     * Sets the truckType value for this ExpressFreightPickupDetail.
     * 
     * @param truckType
     */
    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }


    /**
     * Gets the trailerSize value for this ExpressFreightPickupDetail.
     * 
     * @return trailerSize
     */
    public TrailerSizeType getTrailerSize() {
        return trailerSize;
    }


    /**
     * Sets the trailerSize value for this ExpressFreightPickupDetail.
     * 
     * @param trailerSize
     */
    public void setTrailerSize(TrailerSizeType trailerSize) {
        this.trailerSize = trailerSize;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExpressFreightPickupDetail)) return false;
        ExpressFreightPickupDetail other = (ExpressFreightPickupDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.bookingNumber==null && other.getBookingNumber()==null) || 
             (this.bookingNumber!=null &&
              this.bookingNumber.equals(other.getBookingNumber()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.truckType==null && other.getTruckType()==null) || 
             (this.truckType!=null &&
              this.truckType.equals(other.getTruckType()))) &&
            ((this.trailerSize==null && other.getTrailerSize()==null) || 
             (this.trailerSize!=null &&
              this.trailerSize.equals(other.getTrailerSize())));
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
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getBookingNumber() != null) {
            _hashCode += getBookingNumber().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getTruckType() != null) {
            _hashCode += getTruckType().hashCode();
        }
        if (getTrailerSize() != null) {
            _hashCode += getTrailerSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressFreightPickupDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExpressFreightPickupDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "BookingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("truckType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TruckType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TruckType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trailerSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TrailerSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TrailerSizeType"));
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

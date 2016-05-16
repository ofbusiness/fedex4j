/**
 * PickupOriginDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupOriginDetail  implements java.io.Serializable {
    private Boolean useAccountAddress;

    /* FedEx USE ONLY (with IVR client) */
    private String addressId;

    private ContactAndAddress pickupLocation;

    private com.fedex.pickup.stub.PickupBuildingLocationType packageLocation;

    private BuildingPartCode buildingPart;

    private String buildingPartDescription;

    private java.util.Calendar readyTimestamp;

    private org.apache.axis.types.Time companyCloseTime;

    /* FedEx IVR Only. Customer is willing to stay late for pickup. */
    private Boolean stayLate;

    /* FedEx USE ONLY (with IVR client) */
    private PickupRequestType pickupDateType;

    /* FedEx IVR Only */
    private org.apache.axis.types.Time lastAccessTime;

    /* Alternate postal code tied to pickup location (European pickups) */
    private String geographicalPostalCode;

    /* FedEx USE ONLY */
    private String location;

    /* FedEx USE ONLY (with IVR client) */
    private Boolean deleteLastUsed;

    private String suppliesRequested;

    /* Applies only to Europe */
    private Boolean earlyPickup;

    public PickupOriginDetail() {
    }

    public PickupOriginDetail(
           Boolean useAccountAddress,
           String addressId,
           ContactAndAddress pickupLocation,
           com.fedex.pickup.stub.PickupBuildingLocationType packageLocation,
           BuildingPartCode buildingPart,
           String buildingPartDescription,
           java.util.Calendar readyTimestamp,
           org.apache.axis.types.Time companyCloseTime,
           Boolean stayLate,
           PickupRequestType pickupDateType,
           org.apache.axis.types.Time lastAccessTime,
           String geographicalPostalCode,
           String location,
           Boolean deleteLastUsed,
           String suppliesRequested,
           Boolean earlyPickup) {
           this.useAccountAddress = useAccountAddress;
           this.addressId = addressId;
           this.pickupLocation = pickupLocation;
           this.packageLocation = packageLocation;
           this.buildingPart = buildingPart;
           this.buildingPartDescription = buildingPartDescription;
           this.readyTimestamp = readyTimestamp;
           this.companyCloseTime = companyCloseTime;
           this.stayLate = stayLate;
           this.pickupDateType = pickupDateType;
           this.lastAccessTime = lastAccessTime;
           this.geographicalPostalCode = geographicalPostalCode;
           this.location = location;
           this.deleteLastUsed = deleteLastUsed;
           this.suppliesRequested = suppliesRequested;
           this.earlyPickup = earlyPickup;
    }


    /**
     * Gets the useAccountAddress value for this PickupOriginDetail.
     * 
     * @return useAccountAddress
     */
    public Boolean getUseAccountAddress() {
        return useAccountAddress;
    }


    /**
     * Sets the useAccountAddress value for this PickupOriginDetail.
     * 
     * @param useAccountAddress
     */
    public void setUseAccountAddress(Boolean useAccountAddress) {
        this.useAccountAddress = useAccountAddress;
    }


    /**
     * Gets the addressId value for this PickupOriginDetail.
     * 
     * @return addressId   * FedEx USE ONLY (with IVR client)
     */
    public String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this PickupOriginDetail.
     * 
     * @param addressId   * FedEx USE ONLY (with IVR client)
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the pickupLocation value for this PickupOriginDetail.
     * 
     * @return pickupLocation
     */
    public ContactAndAddress getPickupLocation() {
        return pickupLocation;
    }


    /**
     * Sets the pickupLocation value for this PickupOriginDetail.
     * 
     * @param pickupLocation
     */
    public void setPickupLocation(ContactAndAddress pickupLocation) {
        this.pickupLocation = pickupLocation;
    }


    /**
     * Gets the packageLocation value for this PickupOriginDetail.
     * 
     * @return packageLocation
     */
    public com.fedex.pickup.stub.PickupBuildingLocationType getPackageLocation() {
        return packageLocation;
    }


    /**
     * Sets the packageLocation value for this PickupOriginDetail.
     * 
     * @param packageLocation
     */
    public void setPackageLocation(com.fedex.pickup.stub.PickupBuildingLocationType packageLocation) {
        this.packageLocation = packageLocation;
    }


    /**
     * Gets the buildingPart value for this PickupOriginDetail.
     * 
     * @return buildingPart
     */
    public BuildingPartCode getBuildingPart() {
        return buildingPart;
    }


    /**
     * Sets the buildingPart value for this PickupOriginDetail.
     * 
     * @param buildingPart
     */
    public void setBuildingPart(BuildingPartCode buildingPart) {
        this.buildingPart = buildingPart;
    }


    /**
     * Gets the buildingPartDescription value for this PickupOriginDetail.
     * 
     * @return buildingPartDescription
     */
    public String getBuildingPartDescription() {
        return buildingPartDescription;
    }


    /**
     * Sets the buildingPartDescription value for this PickupOriginDetail.
     * 
     * @param buildingPartDescription
     */
    public void setBuildingPartDescription(String buildingPartDescription) {
        this.buildingPartDescription = buildingPartDescription;
    }


    /**
     * Gets the readyTimestamp value for this PickupOriginDetail.
     * 
     * @return readyTimestamp
     */
    public java.util.Calendar getReadyTimestamp() {
        return readyTimestamp;
    }


    /**
     * Sets the readyTimestamp value for this PickupOriginDetail.
     * 
     * @param readyTimestamp
     */
    public void setReadyTimestamp(java.util.Calendar readyTimestamp) {
        this.readyTimestamp = readyTimestamp;
    }


    /**
     * Gets the companyCloseTime value for this PickupOriginDetail.
     * 
     * @return companyCloseTime
     */
    public org.apache.axis.types.Time getCompanyCloseTime() {
        return companyCloseTime;
    }


    /**
     * Sets the companyCloseTime value for this PickupOriginDetail.
     * 
     * @param companyCloseTime
     */
    public void setCompanyCloseTime(org.apache.axis.types.Time companyCloseTime) {
        this.companyCloseTime = companyCloseTime;
    }


    /**
     * Gets the stayLate value for this PickupOriginDetail.
     * 
     * @return stayLate   * FedEx IVR Only. Customer is willing to stay late for pickup.
     */
    public Boolean getStayLate() {
        return stayLate;
    }


    /**
     * Sets the stayLate value for this PickupOriginDetail.
     * 
     * @param stayLate   * FedEx IVR Only. Customer is willing to stay late for pickup.
     */
    public void setStayLate(Boolean stayLate) {
        this.stayLate = stayLate;
    }


    /**
     * Gets the pickupDateType value for this PickupOriginDetail.
     * 
     * @return pickupDateType   * FedEx USE ONLY (with IVR client)
     */
    public PickupRequestType getPickupDateType() {
        return pickupDateType;
    }


    /**
     * Sets the pickupDateType value for this PickupOriginDetail.
     * 
     * @param pickupDateType   * FedEx USE ONLY (with IVR client)
     */
    public void setPickupDateType(PickupRequestType pickupDateType) {
        this.pickupDateType = pickupDateType;
    }


    /**
     * Gets the lastAccessTime value for this PickupOriginDetail.
     * 
     * @return lastAccessTime   * FedEx IVR Only
     */
    public org.apache.axis.types.Time getLastAccessTime() {
        return lastAccessTime;
    }


    /**
     * Sets the lastAccessTime value for this PickupOriginDetail.
     * 
     * @param lastAccessTime   * FedEx IVR Only
     */
    public void setLastAccessTime(org.apache.axis.types.Time lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }


    /**
     * Gets the geographicalPostalCode value for this PickupOriginDetail.
     * 
     * @return geographicalPostalCode   * Alternate postal code tied to pickup location (European pickups)
     */
    public String getGeographicalPostalCode() {
        return geographicalPostalCode;
    }


    /**
     * Sets the geographicalPostalCode value for this PickupOriginDetail.
     * 
     * @param geographicalPostalCode   * Alternate postal code tied to pickup location (European pickups)
     */
    public void setGeographicalPostalCode(String geographicalPostalCode) {
        this.geographicalPostalCode = geographicalPostalCode;
    }


    /**
     * Gets the location value for this PickupOriginDetail.
     * 
     * @return location   * FedEx USE ONLY
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PickupOriginDetail.
     * 
     * @param location   * FedEx USE ONLY
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Gets the deleteLastUsed value for this PickupOriginDetail.
     * 
     * @return deleteLastUsed   * FedEx USE ONLY (with IVR client)
     */
    public Boolean getDeleteLastUsed() {
        return deleteLastUsed;
    }


    /**
     * Sets the deleteLastUsed value for this PickupOriginDetail.
     * 
     * @param deleteLastUsed   * FedEx USE ONLY (with IVR client)
     */
    public void setDeleteLastUsed(Boolean deleteLastUsed) {
        this.deleteLastUsed = deleteLastUsed;
    }


    /**
     * Gets the suppliesRequested value for this PickupOriginDetail.
     * 
     * @return suppliesRequested
     */
    public String getSuppliesRequested() {
        return suppliesRequested;
    }


    /**
     * Sets the suppliesRequested value for this PickupOriginDetail.
     * 
     * @param suppliesRequested
     */
    public void setSuppliesRequested(String suppliesRequested) {
        this.suppliesRequested = suppliesRequested;
    }


    /**
     * Gets the earlyPickup value for this PickupOriginDetail.
     * 
     * @return earlyPickup   * Applies only to Europe
     */
    public Boolean getEarlyPickup() {
        return earlyPickup;
    }


    /**
     * Sets the earlyPickup value for this PickupOriginDetail.
     * 
     * @param earlyPickup   * Applies only to Europe
     */
    public void setEarlyPickup(Boolean earlyPickup) {
        this.earlyPickup = earlyPickup;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PickupOriginDetail)) return false;
        PickupOriginDetail other = (PickupOriginDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.useAccountAddress==null && other.getUseAccountAddress()==null) || 
             (this.useAccountAddress!=null &&
              this.useAccountAddress.equals(other.getUseAccountAddress()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.pickupLocation==null && other.getPickupLocation()==null) || 
             (this.pickupLocation!=null &&
              this.pickupLocation.equals(other.getPickupLocation()))) &&
            ((this.packageLocation==null && other.getPackageLocation()==null) || 
             (this.packageLocation!=null &&
              this.packageLocation.equals(other.getPackageLocation()))) &&
            ((this.buildingPart==null && other.getBuildingPart()==null) || 
             (this.buildingPart!=null &&
              this.buildingPart.equals(other.getBuildingPart()))) &&
            ((this.buildingPartDescription==null && other.getBuildingPartDescription()==null) || 
             (this.buildingPartDescription!=null &&
              this.buildingPartDescription.equals(other.getBuildingPartDescription()))) &&
            ((this.readyTimestamp==null && other.getReadyTimestamp()==null) || 
             (this.readyTimestamp!=null &&
              this.readyTimestamp.equals(other.getReadyTimestamp()))) &&
            ((this.companyCloseTime==null && other.getCompanyCloseTime()==null) || 
             (this.companyCloseTime!=null &&
              this.companyCloseTime.equals(other.getCompanyCloseTime()))) &&
            ((this.stayLate==null && other.getStayLate()==null) || 
             (this.stayLate!=null &&
              this.stayLate.equals(other.getStayLate()))) &&
            ((this.pickupDateType==null && other.getPickupDateType()==null) || 
             (this.pickupDateType!=null &&
              this.pickupDateType.equals(other.getPickupDateType()))) &&
            ((this.lastAccessTime==null && other.getLastAccessTime()==null) || 
             (this.lastAccessTime!=null &&
              this.lastAccessTime.equals(other.getLastAccessTime()))) &&
            ((this.geographicalPostalCode==null && other.getGeographicalPostalCode()==null) || 
             (this.geographicalPostalCode!=null &&
              this.geographicalPostalCode.equals(other.getGeographicalPostalCode()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.deleteLastUsed==null && other.getDeleteLastUsed()==null) || 
             (this.deleteLastUsed!=null &&
              this.deleteLastUsed.equals(other.getDeleteLastUsed()))) &&
            ((this.suppliesRequested==null && other.getSuppliesRequested()==null) || 
             (this.suppliesRequested!=null &&
              this.suppliesRequested.equals(other.getSuppliesRequested()))) &&
            ((this.earlyPickup==null && other.getEarlyPickup()==null) || 
             (this.earlyPickup!=null &&
              this.earlyPickup.equals(other.getEarlyPickup())));
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
        if (getUseAccountAddress() != null) {
            _hashCode += getUseAccountAddress().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getPickupLocation() != null) {
            _hashCode += getPickupLocation().hashCode();
        }
        if (getPackageLocation() != null) {
            _hashCode += getPackageLocation().hashCode();
        }
        if (getBuildingPart() != null) {
            _hashCode += getBuildingPart().hashCode();
        }
        if (getBuildingPartDescription() != null) {
            _hashCode += getBuildingPartDescription().hashCode();
        }
        if (getReadyTimestamp() != null) {
            _hashCode += getReadyTimestamp().hashCode();
        }
        if (getCompanyCloseTime() != null) {
            _hashCode += getCompanyCloseTime().hashCode();
        }
        if (getStayLate() != null) {
            _hashCode += getStayLate().hashCode();
        }
        if (getPickupDateType() != null) {
            _hashCode += getPickupDateType().hashCode();
        }
        if (getLastAccessTime() != null) {
            _hashCode += getLastAccessTime().hashCode();
        }
        if (getGeographicalPostalCode() != null) {
            _hashCode += getGeographicalPostalCode().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getDeleteLastUsed() != null) {
            _hashCode += getDeleteLastUsed().hashCode();
        }
        if (getSuppliesRequested() != null) {
            _hashCode += getSuppliesRequested().hashCode();
        }
        if (getEarlyPickup() != null) {
            _hashCode += getEarlyPickup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupOriginDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupOriginDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useAccountAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UseAccountAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PackageLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupBuildingLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "BuildingPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "BuildingPartCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingPartDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "BuildingPartDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReadyTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCloseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CompanyCloseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stayLate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "StayLate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupDateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAccessTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LastAccessTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geographicalPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "GeographicalPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteLastUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DeleteLastUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "SuppliesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earlyPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EarlyPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

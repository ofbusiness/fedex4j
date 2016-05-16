/**
 * ShipmentSpecialServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class ShipmentSpecialServiceType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShipmentSpecialServiceType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BLIND_SHIPMENT = "BLIND_SHIPMENT";
    public static final String _BROKER_SELECT_OPTION = "BROKER_SELECT_OPTION";
    public static final String _CALL_BEFORE_DELIVERY = "CALL_BEFORE_DELIVERY";
    public static final String _COD = "COD";
    public static final String _COD_REMITTANCE = "COD_REMITTANCE";
    public static final String _CUSTOM_DELIVERY_WINDOW = "CUSTOM_DELIVERY_WINDOW";
    public static final String _CUT_FLOWERS = "CUT_FLOWERS";
    public static final String _DANGEROUS_GOODS = "DANGEROUS_GOODS";
    public static final String _DELIVERY_ON_INVOICE_ACCEPTANCE = "DELIVERY_ON_INVOICE_ACCEPTANCE";
    public static final String _DETENTION = "DETENTION";
    public static final String _DO_NOT_BREAK_DOWN_PALLETS = "DO_NOT_BREAK_DOWN_PALLETS";
    public static final String _DO_NOT_STACK_PALLETS = "DO_NOT_STACK_PALLETS";
    public static final String _DRY_ICE = "DRY_ICE";
    public static final String _EAST_COAST_SPECIAL = "EAST_COAST_SPECIAL";
    public static final String _ELECTRONIC_TRADE_DOCUMENTS = "ELECTRONIC_TRADE_DOCUMENTS";
    public static final String _EMAIL_NOTIFICATION = "EMAIL_NOTIFICATION";
    public static final String _EXCLUSIVE_USE = "EXCLUSIVE_USE";
    public static final String _EXHIBITION_DELIVERY = "EXHIBITION_DELIVERY";
    public static final String _EXHIBITION_PICKUP = "EXHIBITION_PICKUP";
    public static final String _EXPEDITED_ALTERNATE_DELIVERY_ROUTE = "EXPEDITED_ALTERNATE_DELIVERY_ROUTE";
    public static final String _EXPEDITED_ONE_DAY_EARLIER = "EXPEDITED_ONE_DAY_EARLIER";
    public static final String _EXPEDITED_SERVICE_MONITORING_AND_DELIVERY = "EXPEDITED_SERVICE_MONITORING_AND_DELIVERY";
    public static final String _EXPEDITED_STANDARD_DAY_EARLY_DELIVERY = "EXPEDITED_STANDARD_DAY_EARLY_DELIVERY";
    public static final String _EXTRA_LABOR = "EXTRA_LABOR";
    public static final String _EXTREME_LENGTH = "EXTREME_LENGTH";
    public static final String _FEDEX_ONE_RATE = "FEDEX_ONE_RATE";
    public static final String _FLATBED_TRAILER = "FLATBED_TRAILER";
    public static final String _FOOD = "FOOD";
    public static final String _FREIGHT_GUARANTEE = "FREIGHT_GUARANTEE";
    public static final String _FREIGHT_TO_COLLECT = "FREIGHT_TO_COLLECT";
    public static final String _FUTURE_DAY_SHIPMENT = "FUTURE_DAY_SHIPMENT";
    public static final String _HOLD_AT_LOCATION = "HOLD_AT_LOCATION";
    public static final String _HOLIDAY_DELIVERY = "HOLIDAY_DELIVERY";
    public static final String _HOLIDAY_GUARANTEE = "HOLIDAY_GUARANTEE";
    public static final String _HOME_DELIVERY_PREMIUM = "HOME_DELIVERY_PREMIUM";
    public static final String _INSIDE_DELIVERY = "INSIDE_DELIVERY";
    public static final String _INSIDE_PICKUP = "INSIDE_PICKUP";
    public static final String _INTERNATIONAL_CONTROLLED_EXPORT_SERVICE = "INTERNATIONAL_CONTROLLED_EXPORT_SERVICE";
    public static final String _INTERNATIONAL_MAIL_SERVICE = "INTERNATIONAL_MAIL_SERVICE";
    public static final String _INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS = "INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS";
    public static final String _LIFTGATE_DELIVERY = "LIFTGATE_DELIVERY";
    public static final String _LIFTGATE_PICKUP = "LIFTGATE_PICKUP";
    public static final String _LIMITED_ACCESS_DELIVERY = "LIMITED_ACCESS_DELIVERY";
    public static final String _LIMITED_ACCESS_PICKUP = "LIMITED_ACCESS_PICKUP";
    public static final String _MARKING_OR_TAGGING = "MARKING_OR_TAGGING";
    public static final String _NON_BUSINESS_TIME = "NON_BUSINESS_TIME";
    public static final String _PALLETS_PROVIDED = "PALLETS_PROVIDED";
    public static final String _PALLET_SHRINKWRAP = "PALLET_SHRINKWRAP";
    public static final String _PALLET_WEIGHT_ALLOWANCE = "PALLET_WEIGHT_ALLOWANCE";
    public static final String _PENDING_COMPLETE = "PENDING_COMPLETE";
    public static final String _PENDING_SHIPMENT = "PENDING_SHIPMENT";
    public static final String _PERMIT = "PERMIT";
    public static final String _PHARMACY_DELIVERY = "PHARMACY_DELIVERY";
    public static final String _POISON = "POISON";
    public static final String _PORT_DELIVERY = "PORT_DELIVERY";
    public static final String _PORT_PICKUP = "PORT_PICKUP";
    public static final String _PRE_DELIVERY_NOTIFICATION = "PRE_DELIVERY_NOTIFICATION";
    public static final String _PRE_EIG_PROCESSING = "PRE_EIG_PROCESSING";
    public static final String _PRE_MULTIPLIER_PROCESSING = "PRE_MULTIPLIER_PROCESSING";
    public static final String _PROTECTION_FROM_FREEZING = "PROTECTION_FROM_FREEZING";
    public static final String _REGIONAL_MALL_DELIVERY = "REGIONAL_MALL_DELIVERY";
    public static final String _REGIONAL_MALL_PICKUP = "REGIONAL_MALL_PICKUP";
    public static final String _RETURNS_CLEARANCE = "RETURNS_CLEARANCE";
    public static final String _RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED = "RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED";
    public static final String _RETURN_SHIPMENT = "RETURN_SHIPMENT";
    public static final String _SATURDAY_DELIVERY = "SATURDAY_DELIVERY";
    public static final String _SATURDAY_PICKUP = "SATURDAY_PICKUP";
    public static final String _SHIPMENT_ASSEMBLY = "SHIPMENT_ASSEMBLY";
    public static final String _SORT_AND_SEGREGATE = "SORT_AND_SEGREGATE";
    public static final String _SPECIAL_DELIVERY = "SPECIAL_DELIVERY";
    public static final String _SPECIAL_EQUIPMENT = "SPECIAL_EQUIPMENT";
    public static final String _STORAGE = "STORAGE";
    public static final String _SUNDAY_DELIVERY = "SUNDAY_DELIVERY";
    public static final String _THIRD_PARTY_CONSIGNEE = "THIRD_PARTY_CONSIGNEE";
    public static final String _TOP_LOAD = "TOP_LOAD";
    public static final String _USPS_DELIVERY = "USPS_DELIVERY";
    public static final String _USPS_PICKUP = "USPS_PICKUP";
    public static final String _WEIGHING = "WEIGHING";
    public static final ShipmentSpecialServiceType BLIND_SHIPMENT = new ShipmentSpecialServiceType(_BLIND_SHIPMENT);
    public static final ShipmentSpecialServiceType BROKER_SELECT_OPTION = new ShipmentSpecialServiceType(_BROKER_SELECT_OPTION);
    public static final ShipmentSpecialServiceType CALL_BEFORE_DELIVERY = new ShipmentSpecialServiceType(_CALL_BEFORE_DELIVERY);
    public static final ShipmentSpecialServiceType COD = new ShipmentSpecialServiceType(_COD);
    public static final ShipmentSpecialServiceType COD_REMITTANCE = new ShipmentSpecialServiceType(_COD_REMITTANCE);
    public static final ShipmentSpecialServiceType CUSTOM_DELIVERY_WINDOW = new ShipmentSpecialServiceType(_CUSTOM_DELIVERY_WINDOW);
    public static final ShipmentSpecialServiceType CUT_FLOWERS = new ShipmentSpecialServiceType(_CUT_FLOWERS);
    public static final ShipmentSpecialServiceType DANGEROUS_GOODS = new ShipmentSpecialServiceType(_DANGEROUS_GOODS);
    public static final ShipmentSpecialServiceType DELIVERY_ON_INVOICE_ACCEPTANCE = new ShipmentSpecialServiceType(_DELIVERY_ON_INVOICE_ACCEPTANCE);
    public static final ShipmentSpecialServiceType DETENTION = new ShipmentSpecialServiceType(_DETENTION);
    public static final ShipmentSpecialServiceType DO_NOT_BREAK_DOWN_PALLETS = new ShipmentSpecialServiceType(_DO_NOT_BREAK_DOWN_PALLETS);
    public static final ShipmentSpecialServiceType DO_NOT_STACK_PALLETS = new ShipmentSpecialServiceType(_DO_NOT_STACK_PALLETS);
    public static final ShipmentSpecialServiceType DRY_ICE = new ShipmentSpecialServiceType(_DRY_ICE);
    public static final ShipmentSpecialServiceType EAST_COAST_SPECIAL = new ShipmentSpecialServiceType(_EAST_COAST_SPECIAL);
    public static final ShipmentSpecialServiceType ELECTRONIC_TRADE_DOCUMENTS = new ShipmentSpecialServiceType(_ELECTRONIC_TRADE_DOCUMENTS);
    public static final ShipmentSpecialServiceType EMAIL_NOTIFICATION = new ShipmentSpecialServiceType(_EMAIL_NOTIFICATION);
    public static final ShipmentSpecialServiceType EXCLUSIVE_USE = new ShipmentSpecialServiceType(_EXCLUSIVE_USE);
    public static final ShipmentSpecialServiceType EXHIBITION_DELIVERY = new ShipmentSpecialServiceType(_EXHIBITION_DELIVERY);
    public static final ShipmentSpecialServiceType EXHIBITION_PICKUP = new ShipmentSpecialServiceType(_EXHIBITION_PICKUP);
    public static final ShipmentSpecialServiceType EXPEDITED_ALTERNATE_DELIVERY_ROUTE = new ShipmentSpecialServiceType(_EXPEDITED_ALTERNATE_DELIVERY_ROUTE);
    public static final ShipmentSpecialServiceType EXPEDITED_ONE_DAY_EARLIER = new ShipmentSpecialServiceType(_EXPEDITED_ONE_DAY_EARLIER);
    public static final ShipmentSpecialServiceType EXPEDITED_SERVICE_MONITORING_AND_DELIVERY = new ShipmentSpecialServiceType(_EXPEDITED_SERVICE_MONITORING_AND_DELIVERY);
    public static final ShipmentSpecialServiceType EXPEDITED_STANDARD_DAY_EARLY_DELIVERY = new ShipmentSpecialServiceType(_EXPEDITED_STANDARD_DAY_EARLY_DELIVERY);
    public static final ShipmentSpecialServiceType EXTRA_LABOR = new ShipmentSpecialServiceType(_EXTRA_LABOR);
    public static final ShipmentSpecialServiceType EXTREME_LENGTH = new ShipmentSpecialServiceType(_EXTREME_LENGTH);
    public static final ShipmentSpecialServiceType FEDEX_ONE_RATE = new ShipmentSpecialServiceType(_FEDEX_ONE_RATE);
    public static final ShipmentSpecialServiceType FLATBED_TRAILER = new ShipmentSpecialServiceType(_FLATBED_TRAILER);
    public static final ShipmentSpecialServiceType FOOD = new ShipmentSpecialServiceType(_FOOD);
    public static final ShipmentSpecialServiceType FREIGHT_GUARANTEE = new ShipmentSpecialServiceType(_FREIGHT_GUARANTEE);
    public static final ShipmentSpecialServiceType FREIGHT_TO_COLLECT = new ShipmentSpecialServiceType(_FREIGHT_TO_COLLECT);
    public static final ShipmentSpecialServiceType FUTURE_DAY_SHIPMENT = new ShipmentSpecialServiceType(_FUTURE_DAY_SHIPMENT);
    public static final ShipmentSpecialServiceType HOLD_AT_LOCATION = new ShipmentSpecialServiceType(_HOLD_AT_LOCATION);
    public static final ShipmentSpecialServiceType HOLIDAY_DELIVERY = new ShipmentSpecialServiceType(_HOLIDAY_DELIVERY);
    public static final ShipmentSpecialServiceType HOLIDAY_GUARANTEE = new ShipmentSpecialServiceType(_HOLIDAY_GUARANTEE);
    public static final ShipmentSpecialServiceType HOME_DELIVERY_PREMIUM = new ShipmentSpecialServiceType(_HOME_DELIVERY_PREMIUM);
    public static final ShipmentSpecialServiceType INSIDE_DELIVERY = new ShipmentSpecialServiceType(_INSIDE_DELIVERY);
    public static final ShipmentSpecialServiceType INSIDE_PICKUP = new ShipmentSpecialServiceType(_INSIDE_PICKUP);
    public static final ShipmentSpecialServiceType INTERNATIONAL_CONTROLLED_EXPORT_SERVICE = new ShipmentSpecialServiceType(_INTERNATIONAL_CONTROLLED_EXPORT_SERVICE);
    public static final ShipmentSpecialServiceType INTERNATIONAL_MAIL_SERVICE = new ShipmentSpecialServiceType(_INTERNATIONAL_MAIL_SERVICE);
    public static final ShipmentSpecialServiceType INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS = new ShipmentSpecialServiceType(_INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS);
    public static final ShipmentSpecialServiceType LIFTGATE_DELIVERY = new ShipmentSpecialServiceType(_LIFTGATE_DELIVERY);
    public static final ShipmentSpecialServiceType LIFTGATE_PICKUP = new ShipmentSpecialServiceType(_LIFTGATE_PICKUP);
    public static final ShipmentSpecialServiceType LIMITED_ACCESS_DELIVERY = new ShipmentSpecialServiceType(_LIMITED_ACCESS_DELIVERY);
    public static final ShipmentSpecialServiceType LIMITED_ACCESS_PICKUP = new ShipmentSpecialServiceType(_LIMITED_ACCESS_PICKUP);
    public static final ShipmentSpecialServiceType MARKING_OR_TAGGING = new ShipmentSpecialServiceType(_MARKING_OR_TAGGING);
    public static final ShipmentSpecialServiceType NON_BUSINESS_TIME = new ShipmentSpecialServiceType(_NON_BUSINESS_TIME);
    public static final ShipmentSpecialServiceType PALLETS_PROVIDED = new ShipmentSpecialServiceType(_PALLETS_PROVIDED);
    public static final ShipmentSpecialServiceType PALLET_SHRINKWRAP = new ShipmentSpecialServiceType(_PALLET_SHRINKWRAP);
    public static final ShipmentSpecialServiceType PALLET_WEIGHT_ALLOWANCE = new ShipmentSpecialServiceType(_PALLET_WEIGHT_ALLOWANCE);
    public static final ShipmentSpecialServiceType PENDING_COMPLETE = new ShipmentSpecialServiceType(_PENDING_COMPLETE);
    public static final ShipmentSpecialServiceType PENDING_SHIPMENT = new ShipmentSpecialServiceType(_PENDING_SHIPMENT);
    public static final ShipmentSpecialServiceType PERMIT = new ShipmentSpecialServiceType(_PERMIT);
    public static final ShipmentSpecialServiceType PHARMACY_DELIVERY = new ShipmentSpecialServiceType(_PHARMACY_DELIVERY);
    public static final ShipmentSpecialServiceType POISON = new ShipmentSpecialServiceType(_POISON);
    public static final ShipmentSpecialServiceType PORT_DELIVERY = new ShipmentSpecialServiceType(_PORT_DELIVERY);
    public static final ShipmentSpecialServiceType PORT_PICKUP = new ShipmentSpecialServiceType(_PORT_PICKUP);
    public static final ShipmentSpecialServiceType PRE_DELIVERY_NOTIFICATION = new ShipmentSpecialServiceType(_PRE_DELIVERY_NOTIFICATION);
    public static final ShipmentSpecialServiceType PRE_EIG_PROCESSING = new ShipmentSpecialServiceType(_PRE_EIG_PROCESSING);
    public static final ShipmentSpecialServiceType PRE_MULTIPLIER_PROCESSING = new ShipmentSpecialServiceType(_PRE_MULTIPLIER_PROCESSING);
    public static final ShipmentSpecialServiceType PROTECTION_FROM_FREEZING = new ShipmentSpecialServiceType(_PROTECTION_FROM_FREEZING);
    public static final ShipmentSpecialServiceType REGIONAL_MALL_DELIVERY = new ShipmentSpecialServiceType(_REGIONAL_MALL_DELIVERY);
    public static final ShipmentSpecialServiceType REGIONAL_MALL_PICKUP = new ShipmentSpecialServiceType(_REGIONAL_MALL_PICKUP);
    public static final ShipmentSpecialServiceType RETURNS_CLEARANCE = new ShipmentSpecialServiceType(_RETURNS_CLEARANCE);
    public static final ShipmentSpecialServiceType RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED = new ShipmentSpecialServiceType(_RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED);
    public static final ShipmentSpecialServiceType RETURN_SHIPMENT = new ShipmentSpecialServiceType(_RETURN_SHIPMENT);
    public static final ShipmentSpecialServiceType SATURDAY_DELIVERY = new ShipmentSpecialServiceType(_SATURDAY_DELIVERY);
    public static final ShipmentSpecialServiceType SATURDAY_PICKUP = new ShipmentSpecialServiceType(_SATURDAY_PICKUP);
    public static final ShipmentSpecialServiceType SHIPMENT_ASSEMBLY = new ShipmentSpecialServiceType(_SHIPMENT_ASSEMBLY);
    public static final ShipmentSpecialServiceType SORT_AND_SEGREGATE = new ShipmentSpecialServiceType(_SORT_AND_SEGREGATE);
    public static final ShipmentSpecialServiceType SPECIAL_DELIVERY = new ShipmentSpecialServiceType(_SPECIAL_DELIVERY);
    public static final ShipmentSpecialServiceType SPECIAL_EQUIPMENT = new ShipmentSpecialServiceType(_SPECIAL_EQUIPMENT);
    public static final ShipmentSpecialServiceType STORAGE = new ShipmentSpecialServiceType(_STORAGE);
    public static final ShipmentSpecialServiceType SUNDAY_DELIVERY = new ShipmentSpecialServiceType(_SUNDAY_DELIVERY);
    public static final ShipmentSpecialServiceType THIRD_PARTY_CONSIGNEE = new ShipmentSpecialServiceType(_THIRD_PARTY_CONSIGNEE);
    public static final ShipmentSpecialServiceType TOP_LOAD = new ShipmentSpecialServiceType(_TOP_LOAD);
    public static final ShipmentSpecialServiceType USPS_DELIVERY = new ShipmentSpecialServiceType(_USPS_DELIVERY);
    public static final ShipmentSpecialServiceType USPS_PICKUP = new ShipmentSpecialServiceType(_USPS_PICKUP);
    public static final ShipmentSpecialServiceType WEIGHING = new ShipmentSpecialServiceType(_WEIGHING);
    public String getValue() { return _value_;}
    public static ShipmentSpecialServiceType fromValue(String value)
          throws IllegalArgumentException {
        ShipmentSpecialServiceType enumeration = (ShipmentSpecialServiceType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShipmentSpecialServiceType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentSpecialServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ShipmentSpecialServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

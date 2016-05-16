/**
 * PickupPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public interface PickupPortType extends java.rmi.Remote {
    public com.fedex.pickup.stub.PickupAvailabilityReply getPickupAvailability(com.fedex.pickup.stub.PickupAvailabilityRequest pickupAvailabilityRequest) throws java.rmi.RemoteException;
    public com.fedex.pickup.stub.CreatePickupReply createPickup(com.fedex.pickup.stub.CreatePickupRequest createPickupRequest) throws java.rmi.RemoteException;
    public com.fedex.pickup.stub.CancelPickupReply cancelPickup(com.fedex.pickup.stub.CancelPickupRequest cancelPickupRequest) throws java.rmi.RemoteException;
}

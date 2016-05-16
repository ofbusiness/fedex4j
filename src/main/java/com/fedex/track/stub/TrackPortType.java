/**
 * TrackPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.track.stub;

public interface TrackPortType extends java.rmi.Remote {
    public SignatureProofOfDeliveryLetterReply retrieveSignatureProofOfDeliveryLetter(SignatureProofOfDeliveryLetterRequest signatureProofOfDeliveryLetterRequest) throws java.rmi.RemoteException;
    public TrackReply track(TrackRequest trackRequest) throws java.rmi.RemoteException;
    public SignatureProofOfDeliveryFaxReply sendSignatureProofOfDeliveryFax(SignatureProofOfDeliveryFaxRequest signatureProofOfDeliveryFaxRequest) throws java.rmi.RemoteException;
    public SendNotificationsReply sendNotifications(SendNotificationsRequest sendNotificationsRequest) throws java.rmi.RemoteException;
}

/**
 * OpenShipServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class OpenShipServiceSoapBindingStub extends org.apache.axis.client.Stub implements OpenShipPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[22];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationRequest"), ModifyConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationReply"));
        oper.setReturnClass(ModifyConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentRequest"), ValidateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentReply"));
        oper.setReturnClass(ValidateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentRequest"), RetrieveOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentReply"));
        oper.setReturnClass(RetrieveOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOpenConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationRequest"), DeleteOpenConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationReply"));
        oper.setReturnClass(DeleteOpenConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationRequest"), CreateConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationReply"));
        oper.setReturnClass(CreateConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrievePackageInOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentRequest"), com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveConsolidatedCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesRequest"), com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPackageInOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentRequest"), com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentRequest"), CreateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentReply"));
        oper.setReturnClass(CreateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePendingShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentRequest"), DeletePendingShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentReply"));
        oper.setReturnClass(DeletePendingShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentRequest"), ConfirmOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentReply"));
        oper.setReturnClass(ConfirmOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConfirmOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsRequest"), com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConfirmConsolidationResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsRequest"), com.fedex.openship.stub.GetConfirmConsolidationResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentRequest"), ModifyOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentReply"));
        oper.setReturnClass(ModifyOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationRequest"), ConfirmConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationReply"));
        oper.setReturnClass(ConfirmConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPendingShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreatePendingShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentRequest"), CreateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentReply"));
        oper.setReturnClass(CreateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreatePendingShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModifyOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsRequest"), com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePackagesFromOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentRequest"), com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPackagesToOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentRequest"), com.fedex.openship.stub.AddPackagesToOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentReply"));
        oper.setReturnClass(AddPackagesToOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreateOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsRequest"), com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationRequest"), RetrieveConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationReply"));
        oper.setReturnClass(RetrieveConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentRequest"), DeleteOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentReply"));
        oper.setReturnClass(DeleteOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

    }

    public OpenShipServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OpenShipServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OpenShipServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AddPackagesToOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = AddPackagesToOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AddPackagesToOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AddPackagesToOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Address");
            cachedSerQNames.add(qName);
            cls = Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AdrLicenseDetail");
            cachedSerQNames.add(qName);
            cls = AdrLicenseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedAccount");
            cachedSerQNames.add(qName);
            cls = AssociatedAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedAccountNumberType");
            cachedSerQNames.add(qName);
            cls = AssociatedAccountNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = AssociatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedShipmentType");
            cachedSerQNames.add(qName);
            cls = AssociatedShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingId");
            cachedSerQNames.add(qName);
            cls = AssociatedTrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AssociatedTrackingIdType");
            cachedSerQNames.add(qName);
            cls = AssociatedTrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingResultsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingResultsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingResultType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcode");
            cachedSerQNames.add(qName);
            cls = BinaryBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = BinaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BrokerType");
            cachedSerQNames.add(qName);
            cls = BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodAdjustmentType");
            cachedSerQNames.add(qName);
            cls = CodAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodDetail");
            cachedSerQNames.add(qName);
            cls = CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodReturnPackageDetail");
            cachedSerQNames.add(qName);
            cls = CodReturnPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Commodity");
            cachedSerQNames.add(qName);
            cls = Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedCodDetail");
            cachedSerQNames.add(qName);
            cls = CompletedCodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = CompletedConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedEtdDetail");
            cachedSerQNames.add(qName);
            cls = CompletedEtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHazardousPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHazardousShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHazardousSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedHoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = CompletedHoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedPackageDetail");
            cachedSerQNames.add(qName);
            cls = CompletedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedShipmentConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = CompletedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedSmartPostDetail");
            cachedSerQNames.add(qName);
            cls = CompletedSmartPostDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedTagDetail");
            cachedSerQNames.add(qName);
            cls = CompletedTagDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CondensedCrnReportDetail");
            cachedSerQNames.add(qName);
            cls = CondensedCrnReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationReply");
            cachedSerQNames.add(qName);
            cls = ConfirmConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = ConfirmConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = ConfirmOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = ConfirmOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommoditiesSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommoditiesSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodity");
            cachedSerQNames.add(qName);
            cls = ConsolidatedCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodityDestinationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedCommodityDetail");
            cachedSerQNames.add(qName);
            cls = ConsolidatedCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedPartyReportDetail");
            cachedSerQNames.add(qName);
            cls = ConsolidatedPartyReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidatedSoldToSummaryReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationCustomsLinehaulReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSource");
            cachedSerQNames.add(qName);
            cls = ConsolidationDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataSourceType");
            cachedSerQNames.add(qName);
            cls = ConsolidationDataSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDataType");
            cachedSerQNames.add(qName);
            cls = ConsolidationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocument");
            cachedSerQNames.add(qName);
            cls = ConsolidationDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationKey");
            cachedSerQNames.add(qName);
            cls = ConsolidationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipment");
            cachedSerQNames.add(qName);
            cls = ConsolidationShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = ConsolidationShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationType");
            cachedSerQNames.add(qName);
            cls = ConsolidationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Contact");
            cachedSerQNames.add(qName);
            cls = Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationReply");
            cachedSerQNames.add(qName);
            cls = CreateConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = CreateConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = CreateOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = CreateOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = CreateOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CrnReportDetail");
            cachedSerQNames.add(qName);
            cls = CrnReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomConsolidationDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomConsolidationDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsDeclarationStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsDeclarationStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsDeclarationStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsDeclarationStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsPackingListDetail");
            cachedSerQNames.add(qName);
            cls = CustomsPackingListDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CustomsRoleType");
            cachedSerQNames.add(qName);
            cls = CustomsRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DateRange");
            cachedSerQNames.add(qName);
            cls = DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeclarationCurrency");
            cachedSerQNames.add(qName);
            cls = DeclarationCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeclarationValueType");
            cachedSerQNames.add(qName);
            cls = DeclarationValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationReply");
            cachedSerQNames.add(qName);
            cls = DeleteOpenConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = DeleteOpenConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = DeleteOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeleteOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = DeleteOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePackagesFromOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentReply");
            cachedSerQNames.add(qName);
            cls = DeletePendingShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeletePendingShipmentRequest");
            cachedSerQNames.add(qName);
            cls = DeletePendingShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Dimensions");
            cachedSerQNames.add(qName);
            cls = Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DistributionClearanceType");
            cachedSerQNames.add(qName);
            cls = DistributionClearanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = DocumentFormatOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DropoffType");
            cachedSerQNames.add(qName);
            cls = DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationEventType");
            cachedSerQNames.add(qName);
            cls = EMailNotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = EmailOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FedExDistributionLocationType");
            cachedSerQNames.add(qName);
            cls = FedExDistributionLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmConsolidationResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmConsolidationResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetConfirmOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetCreateOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GetModifyOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "GroundDeliveryEligibilityType");
            cachedSerQNames.add(qName);
            cls = GroundDeliveryEligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ImageId");
            cachedSerQNames.add(qName);
            cls = ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDistributionSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDistributionSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LicenseOrPermitDetail");
            cachedSerQNames.add(qName);
            cls = LicenseOrPermitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Localization");
            cachedSerQNames.add(qName);
            cls = Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Measure");
            cachedSerQNames.add(qName);
            cls = Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationReply");
            cachedSerQNames.add(qName);
            cls = ModifyConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = ModifyConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = ModifyOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = ModifyOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyPackageInOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Money");
            cachedSerQNames.add(qName);
            cls = Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaLowValueStatementDetail");
            cachedSerQNames.add(qName);
            cls = NaftaLowValueStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Notification");
            cachedSerQNames.add(qName);
            cls = Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "OperationalInstruction");
            cachedSerQNames.add(qName);
            cls = OperationalInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageBarcodes");
            cachedSerQNames.add(qName);
            cls = PackageBarcodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageOperationalDetail");
            cachedSerQNames.add(qName);
            cls = PackageOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageRating");
            cachedSerQNames.add(qName);
            cls = PackageRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackagingType");
            cachedSerQNames.add(qName);
            cls = PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Party");
            cachedSerQNames.add(qName);
            cls = Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payment");
            cachedSerQNames.add(qName);
            cls = Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PaymentType");
            cachedSerQNames.add(qName);
            cls = PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Payor");
            cachedSerQNames.add(qName);
            cls = Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentAccessDetail");
            cachedSerQNames.add(qName);
            cls = PendingShipmentAccessDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentAccessorDetail");
            cachedSerQNames.add(qName);
            cls = PendingShipmentAccessorDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PrintedReference");
            cachedSerQNames.add(qName);
            cls = PrintedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PrintedReferenceType");
            cachedSerQNames.add(qName);
            cls = PrintedReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactiveLabelType");
            cachedSerQNames.add(qName);
            cls = RadioactiveLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Rebate");
            cachedSerQNames.add(qName);
            cls = Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RebateType");
            cachedSerQNames.add(qName);
            cls = RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidation");
            cachedSerQNames.add(qName);
            cls = RequestedConsolidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidationDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedConsolidationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedDistributionLocation");
            cachedSerQNames.add(qName);
            cls = RequestedDistributionLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidatedCommoditiesRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationReply");
            cachedSerQNames.add(qName);
            cls = RetrieveConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = RetrieveConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = RetrieveOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrieveOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = RetrieveOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RetrievePackageInOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedConsolidationDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnedConsolidationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = ReturnedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnType");
            cachedSerQNames.add(qName);
            cls = ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Rma");
            cachedSerQNames.add(qName);
            cls = Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RotationType");
            cachedSerQNames.add(qName);
            cls = RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ServiceCategoryType");
            cachedSerQNames.add(qName);
            cls = ServiceCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ServiceType");
            cachedSerQNames.add(qName);
            cls = ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = ShipmentConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentInclusionSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentInclusionSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentInternationalDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentInternationalDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentManifestDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentManifestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentOperationalDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = ShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentRating");
            cachedSerQNames.add(qName);
            cls = ShipmentRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShipmentTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocument");
            cachedSerQNames.add(qName);
            cls = ShippingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentPart");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SplitPaymentDetail");
            cachedSerQNames.add(qName);
            cls = SplitPaymentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SplitPaymentSpecification");
            cachedSerQNames.add(qName);
            cls = SplitPaymentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SplitPaymentType");
            cachedSerQNames.add(qName);
            cls = SplitPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Surcharge");
            cachedSerQNames.add(qName);
            cls = Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Tax");
            cachedSerQNames.add(qName);
            cls = Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxType");
            cachedSerQNames.add(qName);
            cls = TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TinType");
            cachedSerQNames.add(qName);
            cls = TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingId");
            cachedSerQNames.add(qName);
            cls = TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionLtlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionLtlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionRoutingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionRoutingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UnitSystemType");
            cachedSerQNames.add(qName);
            cls = UnitSystemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings4() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidatedHazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidatedHazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidatedHazardousContainer");
            cachedSerQNames.add(qName);
            cls = ValidatedHazardousContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = ValidateOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ValidateOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = ValidateOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VersionId");
            cachedSerQNames.add(qName);
            cls = VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Volume");
            cachedSerQNames.add(qName);
            cls = Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Weight");
            cachedSerQNames.add(qName);
            cls = Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ModifyConsolidationReply modifyConsolidation(ModifyConsolidationRequest modifyConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/modifyConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {modifyConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ModifyConsolidationReply) _resp;
            } catch (Exception _exception) {
                return (ModifyConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, ModifyConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ValidateOpenShipmentReply validateOpenShipment(ValidateOpenShipmentRequest validateOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/validateOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {validateOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ValidateOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (ValidateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, ValidateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RetrieveOpenShipmentReply retrieveOpenShipment(RetrieveOpenShipmentRequest retrieveOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/retrieveOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {retrieveOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RetrieveOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (RetrieveOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, RetrieveOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeleteOpenConsolidationReply deleteOpenConsolidation(DeleteOpenConsolidationRequest deleteOpenConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/deleteOpenConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOpenConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteOpenConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeleteOpenConsolidationReply) _resp;
            } catch (Exception _exception) {
                return (DeleteOpenConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, DeleteOpenConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CreateConsolidationReply createConsolidation(CreateConsolidationRequest createConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/createConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateConsolidationReply) _resp;
            } catch (Exception _exception) {
                return (CreateConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, CreateConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrievePackageInOpenShipmentReply retrievePackageInOpenShipment(com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest retrievePackageInOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/retrievePackageInOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrievePackageInOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {retrievePackageInOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrievePackageInOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.RetrievePackageInOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply retrieveConsolidatedCommodities(com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest retrieveConsolidatedCommoditiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/retrieveConsolidatedCommodities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveConsolidatedCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {retrieveConsolidatedCommoditiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ModifyPackageInOpenShipmentReply modifyPackageInOpenShipment(com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest modifyPackageInOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/modifyPackageInOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyPackageInOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {modifyPackageInOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ModifyPackageInOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.ModifyPackageInOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CreateOpenShipmentReply createOpenShipment(CreateOpenShipmentRequest createOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/createOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (CreateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, CreateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeletePendingShipmentReply deletePendingShipment(DeletePendingShipmentRequest deletePendingShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/deletePendingShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePendingShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deletePendingShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeletePendingShipmentReply) _resp;
            } catch (Exception _exception) {
                return (DeletePendingShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, DeletePendingShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ConfirmOpenShipmentReply confirmOpenShipment(ConfirmOpenShipmentRequest confirmOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/confirmOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {confirmOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ConfirmOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (ConfirmOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, ConfirmOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply getConfirmOpenShipmentResults(com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest getConfirmOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/getConfirmOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConfirmOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getConfirmOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetConfirmConsolidationResultsReply getConfirmConsolidationResults(com.fedex.openship.stub.GetConfirmConsolidationResultsRequest getConfirmConsolidationResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/getConfirmConsolidationResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConfirmConsolidationResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getConfirmConsolidationResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetConfirmConsolidationResultsReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.GetConfirmConsolidationResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ModifyOpenShipmentReply modifyOpenShipment(ModifyOpenShipmentRequest modifyOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/modifyOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {modifyOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ModifyOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (ModifyOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, ModifyOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ConfirmConsolidationReply confirmConsolidation(ConfirmConsolidationRequest confirmConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/confirmConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {confirmConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ConfirmConsolidationReply) _resp;
            } catch (Exception _exception) {
                return (ConfirmConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, ConfirmConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CreateOpenShipmentReply createPendingShipment(CreateOpenShipmentRequest createPendingShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/createPendingShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createPendingShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {createPendingShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (CreateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, CreateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetModifyOpenShipmentResultsReply getModifyOpenShipmentResults(com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest getModifyOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/getModifyOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getModifyOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getModifyOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetModifyOpenShipmentResultsReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.GetModifyOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply deletePackagesFromOpenShipment(com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest deletePackagesFromOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/deletePackagesFromOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePackagesFromOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deletePackagesFromOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AddPackagesToOpenShipmentReply addPackagesToOpenShipment(com.fedex.openship.stub.AddPackagesToOpenShipmentRequest addPackagesToOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/addPackagesToOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addPackagesToOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {addPackagesToOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AddPackagesToOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (AddPackagesToOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, AddPackagesToOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetCreateOpenShipmentResultsReply getCreateOpenShipmentResults(com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest getCreateOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/getCreateOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreateOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {getCreateOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetCreateOpenShipmentResultsReply) _resp;
            } catch (Exception _exception) {
                return (com.fedex.openship.stub.GetCreateOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RetrieveConsolidationReply retrieveConsolidation(RetrieveConsolidationRequest retrieveConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/retrieveConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {retrieveConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RetrieveConsolidationReply) _resp;
            } catch (Exception _exception) {
                return (RetrieveConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, RetrieveConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeleteOpenShipmentReply deleteOpenShipment(DeleteOpenShipmentRequest deleteOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v9/deleteOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {deleteOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeleteOpenShipmentReply) _resp;
            } catch (Exception _exception) {
                return (DeleteOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, DeleteOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

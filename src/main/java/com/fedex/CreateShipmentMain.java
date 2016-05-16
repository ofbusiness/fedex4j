package com.fedex;

import com.fedex.openship.stub.*;
import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;
//import org.apache.log4j.net.SyslogAppender;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by mohit on 13/05/16.
 */
public class CreateShipmentMain {

    //
    public static String index;
    public static final String dev_accountNumber = "510087984";
    public static final String dev_meterNumber = "118724827";
    public static final String dev_key = "8fM8x9uNsUSLEIfO";
    public static final String dev_password = "34ymdcY7vHEpBf347x9CClUXT";


    public static final String prod_accountNumber = "275128910";
    public static final String prod_meterNumber = "109395163";
    public static final String prod_key = "AWTfEA4rkZ4FRsuq";
    public static final String prod_password = "HHUIvYv3WBw7hseQNun2qw2iT";


    public static String endPoint = "https://wsbeta.fedex.com:443/web-services";


    public static String accountNumber = dev_accountNumber;
    public static String meterNumber = dev_meterNumber;
    public static String key = dev_key;
    public static String password = dev_password;


    public static final String ENV = "DEV";

    public static void main(String args[]) {


        if(ENV.equals("PROD")){
            accountNumber = prod_accountNumber;
            meterNumber = prod_meterNumber;
            key = prod_key;
            password = prod_password;
            endPoint = "https://ws.fedex.com:443/web-services";
        }

        CreateOpenShipmentRequest request = new CreateOpenShipmentRequest(); // Build a request object

        ConfirmOpenShipmentRequest confirm_request = new ConfirmOpenShipmentRequest(); // Build a request object

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        String transactionId = "OFB-TR-"+ System.currentTimeMillis();

        transactionDetail.setCustomerTransactionId(transactionId); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 9, 0, 0);
        request.setVersion(versionId);
        //
        request.setIndex(index);
        CreateOpenShipmentActionType[] actions = new CreateOpenShipmentActionType[1];
        actions[0] = CreateOpenShipmentActionType.STRONG_VALIDATION;
    //    request.setActions(actions);
        //

        RequestedShipment requestedShipment = new RequestedShipment();
        requestedShipment.setShipTimestamp(Calendar.getInstance()); // Ship date and time
        PickupDetail pickupDetail = new PickupDetail();
        pickupDetail.setCourierInstructions("test this pickup");
        pickupDetail.setLatestPickupDateTime(Calendar.getInstance());
        pickupDetail.setReadyDateTime(Calendar.getInstance());
        pickupDetail.setLatestPickupDateTime(Calendar.getInstance());
        pickupDetail.setRequestType(PickupRequestType.SAME_DAY);


        requestedShipment.setPickupDetail(pickupDetail);

        requestedShipment.setPackageCount(new PositiveInteger("1"));

        /**
         * Adding requested package line item
         */

        RequestedPackageLineItem requestedPackageLineItem = new RequestedPackageLineItem();
        requestedPackageLineItem.setSequenceNumber(new PositiveInteger("1"));
        requestedPackageLineItem.setGroupPackageCount(new PositiveInteger("1"));
        requestedPackageLineItem.setWeight(addPackageWeight(50.5, WeightUnits.KG));

//		requestedPackageLineItem.setContentRecords();
//        requestedPackageLineItem.setDimensions(addPackageDimensions(108, 5, 5, LinearUnits.IN));
        requestedPackageLineItem.setCustomerReferences(new CustomerReference[]{
                addCustomerReference(CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), "CR1234"),
                addCustomerReference(CustomerReferenceType.INVOICE_NUMBER.getValue(), "IV1234"),
                addCustomerReference(CustomerReferenceType.P_O_NUMBER.getValue(), "PO1234"),
        });


        /**
         * Package special service requested
         */

        PackageSpecialServicesRequested packageSpecialServicesRequested = new PackageSpecialServicesRequested();
        PackageSpecialServiceType packageSpecialServiceType[] = new PackageSpecialServiceType[1];
        packageSpecialServiceType[0]=PackageSpecialServiceType.COD;
        packageSpecialServicesRequested.setSpecialServiceTypes(packageSpecialServiceType);
        CodDetail packageCodDetail = new CodDetail();
        Party packageCodRecepient = new Party();
        Address packageRecepientAddress = new Address();
        packageRecepientAddress.setCity("Gurgaon");
        packageRecepientAddress.setCountryCode("IN");
        packageRecepientAddress.setPostalCode("122001");
        packageRecepientAddress.setStateOrProvinceCode("Haryana");
        Contact packageRecepientContact = new Contact();
        packageRecepientContact.setCompanyName("OfbTech");
        packageRecepientContact.setPersonName("TestPerson");
        packageCodRecepient.setContact(packageRecepientContact);
        packageCodRecepient.setAddress(packageRecepientAddress);
        packageCodDetail.setCodRecipient(packageCodRecepient);
        packageCodDetail.setCollectionType(CodCollectionType.CASH);
        packageCodDetail.setCodCollectionAmount(addMoney("INR", 150.0));
        packageSpecialServicesRequested.setCodDetail(packageCodDetail);

        /**
         * End of package special services requested
         *
         */


    //   requestedPackageLineItem.setSpecialServicesRequested(packageSpecialServicesRequested);

        /**
         * End of Adding Requested package line items
         */
        requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {requestedPackageLineItem});
        //
        requestedShipment.setPickupDetail(pickupDetail);
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP); // Dropoff Types are BUSINESS_SERVICE_CENTER, DROP_BOX, REGULAR_PICKUP, REQUEST_COURIER, STATION
        requestedShipment.setServiceType(ServiceType.FEDEX_EXPRESS_SAVER); // Service types are STANDARD_OVERNIGHT, PRIORITY_OVERNIGHT, FEDEX_GROUND ...
        requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING); // Packaging type FEDEX_BOX, FEDEX_PAK, FEDEX_TUBE, YOUR_PACKAGING, ...

        /**
         * Adding shipper Information  ofb/supplier
         */

        Party shipperParty = new Party(); // Sender information
        Contact shipperContact = new Contact();
        shipperContact.setPersonName("SenderTest Name");
        shipperContact.setCompanyName("Test Sender Company Name");
        shipperContact.setPhoneNumber("0805522713");
        Address shipperAddress = new Address();
        shipperAddress.setStreetLines(new String[] {"Address Line 1"});
        shipperAddress.setCity("Gurgaon");
        shipperAddress.setStateOrProvinceCode("Haryana");
        shipperAddress.setPostalCode("122001");
        shipperAddress.setCountryCode("IN");
        shipperParty.setContact(shipperContact);
        shipperParty.setAddress(shipperAddress);
        /**
         * END OF Adding Shipper Information
         */
        requestedShipment.setShipper(shipperParty);

        /**
         * Adding recepient party  / shipping address
         */

        Party recipientParty = new Party(); // Recipient information
        Contact recipientContact = new Contact();
        recipientContact.setPersonName("Test Recipient Name");
        recipientContact.setCompanyName("Recipient Company Name");
        recipientContact.setPhoneNumber("+911234567890");
        Address recipientAddress = new Address();
        recipientAddress.setStreetLines(new String[] {"Sahara mall, Mehrauli Gurgaon Road"});
        recipientAddress.setCity("Gurgaon");
        recipientAddress.setStateOrProvinceCode("Haryana");
        recipientAddress.setPostalCode("122001");
        recipientAddress.setCountryCode("IN");
        recipientAddress.setResidential(Boolean.valueOf(false));
        recipientParty.setContact(recipientContact);
        recipientParty.setAddress(recipientAddress);
        /**
         *
         * End of Adding receipient party
         */
        requestedShipment.setRecipient(recipientParty);

        /**
         * Shipping Charges Payment
         */

        Payment payment = new Payment(); // Payment information
        payment.setPaymentType(PaymentType.THIRD_PARTY);
        Payor payor = new Payor();
        Party responsibleParty = new Party();
        responsibleParty.setAccountNumber(getPayorAccountNumber());
        Address responsiblePartyAddress = new Address();
        responsiblePartyAddress.setCountryCode("IN");
        responsibleParty.setAddress(responsiblePartyAddress);
        responsibleParty.setContact(new Contact());
        payor.setResponsibleParty(responsibleParty);
        payment.setPayor(payor);

        /**
         *
         * End of Shipping Charges Payment
         */

        requestedShipment.setShippingChargesPayment(payment);


        /**
         * Adding Customs clearance detail optional/
         */

        CustomsClearanceDetail customs = new CustomsClearanceDetail (); // International details
        customs.setDutiesPayment(addDutiesPayment());
        customs.setCustomsValue(addMoney("INR", 2.0));
        customs.setDocumentContent(InternationalDocumentContentType.NON_DOCUMENTS);
        // Set export detail - To be used for Shipments that fall under AES Compliance
        //ExportDetail exportDetail = new ExportDetail();
        //exportDetail.setExportComplianceStatement("AESX20091127123456");
        //intd.setExportDetail(exportDetail);
        Commodity commodity = new Commodity();
        commodity.setNumberOfPieces(new NonNegativeInteger("1"));
        commodity.setDescription("Books");
        commodity.setCountryOfManufacture("IN");
        commodity.setWeight(new Weight());
        commodity.getWeight().setValue(new BigDecimal(1.0));
        commodity.getWeight().setUnits(WeightUnits.KG);
        commodity.setQuantity(new BigDecimal("1"));
        commodity.setQuantityUnits("EA");
        commodity.setUnitPrice(new Money());
        commodity.getUnitPrice().setAmount(new BigDecimal(2.000000));
        commodity.getUnitPrice().setCurrency("INR");
        commodity.setCustomsValue(new Money());
        commodity.getCustomsValue().setAmount(new BigDecimal(2.000000));
        commodity.getCustomsValue().setCurrency("INR");
        commodity.setCountryOfManufacture("IN");
//        commodity.setHarmonizedCode("490199009100");
        customs.setCommodities(new Commodity[] {commodity});// Commodity details

        CommercialInvoice commercialInvoice = new CommercialInvoice();
        commercialInvoice.setPurpose(PurposeOfShipmentType.SOLD);
//        commercialInvoice.setComments(["testing one two three"]);
        customs.setCommercialInvoice(commercialInvoice);

        /**
         * End of Adding Customs clearance detail
         */

        requestedShipment.setCustomsClearanceDetail(customs);


        /**
         * Adding shipment special services required
         */

        ShipmentSpecialServicesRequested shipmentSpecialServicesRequested = new ShipmentSpecialServicesRequested();
        ShipmentSpecialServiceType shipmentSpecialServiceType[]=new ShipmentSpecialServiceType[1];
        shipmentSpecialServiceType[0]=ShipmentSpecialServiceType.COD;
        shipmentSpecialServicesRequested.setSpecialServiceTypes(shipmentSpecialServiceType);

        // RECEPIENT ADDRESS
        Address shipmentSpecialCodRecipientAddress = new Address();
        shipmentSpecialCodRecipientAddress.setCity("Gurgaon");
        shipmentSpecialCodRecipientAddress.setCountryCode("IN");
        shipmentSpecialCodRecipientAddress.setPostalCode("122001");
        shipmentSpecialCodRecipientAddress.setStateOrProvinceCode("Haryana");

        // SETTING RECEPIENT CONTACT
        Contact shipmentSpecialCodRecipientContact = new Contact();

        shipmentSpecialCodRecipientContact.setCompanyName("OfbTech");
        shipmentSpecialCodRecipientContact.setPersonName("TestPerson");
        shipmentSpecialCodRecipientContact.setPhoneNumber("+919999999999");


        //COD Recepient PARTY
        Party shipmentSpecialCodRecipient = new Party();
        shipmentSpecialCodRecipient.setContact(recipientContact);
        shipmentSpecialCodRecipient.setAddress(recipientAddress);

        Money codMoney = new Money();
        codMoney.setCurrency("INR");
        codMoney.setAmount(new BigDecimal(2.0));


        //COD DETAIL
        CodDetail shipmentSpecialCodDetail = new CodDetail();
        shipmentSpecialCodDetail.setCollectionType(CodCollectionType.CASH);
        shipmentSpecialCodDetail.setCodCollectionAmount(codMoney);
        shipmentSpecialCodDetail.setCodRecipient(shipmentSpecialCodRecipient);

        shipmentSpecialServicesRequested.setCodDetail(shipmentSpecialCodDetail);

        /**
         * End of Adding shipment special services required
         */
        //Example Shipment special service (Express COD).
        requestedShipment.setSpecialServicesRequested(shipmentSpecialServicesRequested);


        /**
         * Adding Label specification
         */

        LabelSpecification labelSpecification = new LabelSpecification(); // Label specification
        labelSpecification.setImageType(ShippingDocumentImageType.PDF);// Image types PDF, PNG, DPL, ...
        labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D); //LABEL_DATA_ONLY, COMMON2D
        //labelSpecification.setLabelStockType(LabelStockType.value2); // STOCK_4X6.75_LEADING_DOC_TAB
        //labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);


        /**
         * End of Adding Label Specification
         */
        requestedShipment.setLabelSpecification(labelSpecification);
        //

        request.setRequestedShipment(requestedShipment);



        //
        try {
            // Initialize the service
            OpenShipServiceLocator service;
            OpenShipPortType port;
            //
            service = new OpenShipServiceLocator();
            updateEndPoint(service);
            port = service.getOpenShipServicePort();
            //
            System.out.println("\n**Creating OpenShipment**\n");
            CreateOpenShipmentReply createOpenShipmentReply = port.createOpenShipment(request);

        //    ConfirmOpenShipmentReply confirmOpenShipmentReply = new ConfirmOpenShipmentReply();
            // This is the call to the ship web service passing in a request object and returning a reply object

            System.out.println("Reply " + createOpenShipmentReply.toString());
            System.out.println("Transaction detail " + createOpenShipmentReply.getTransactionDetail().toString());

            //
          /*  if (isResponseOk(createOpenShipmentReply.getHighestSeverity())) // check if the call was successful
            {
                writeServiceOutput(createOpenShipmentReply);

                System.out.println("tata!!");

            }*/



            if (isResponseOk(createOpenShipmentReply.getHighestSeverity())) // check if the call was successful
            {
                writeServiceOutput(createOpenShipmentReply);
               System.out.println("\n**Adding Package to OpenShipment**\n");
                AddPackagesToOpenShipmentReply addPackagesToOpenShipmentReply = port.addPackagesToOpenShipment(buildAddPackagesToOpenShipmentRequest());
                if(isResponseOk(addPackagesToOpenShipmentReply.getHighestSeverity()))
                {
                    TrackingId trackingId = writeServiceOutput(addPackagesToOpenShipmentReply);
           /*         System.out.println("\n**Modifying Package in OpenShipment**\n");
                    ModifyPackageInOpenShipmentReply modifyPackageInOpenShipmentReply = port.modifyPackageInOpenShipment(buildModifyPackageInOpenShipmentRequest(trackingId));
                    if(isResponseOk(modifyPackageInOpenShipmentReply.getHighestSeverity()))
                    {
                        writeServiceOutput(modifyPackageInOpenShipmentReply);*/
                        System.out.println("\n**Validating OpenShipment**\n");
                        ValidateOpenShipmentReply validateOpenShipmentReply = port.validateOpenShipment(buildValidateOpenShipmentRequest());
                        if(isResponseOk(validateOpenShipmentReply.getHighestSeverity()))
                        {
                            printNotifications(validateOpenShipmentReply.getNotifications());
                            System.out.println("\n**Confirming OpenShipment**\n");
                            ConfirmOpenShipmentReply confirmOpenShipmentReply = port.confirmOpenShipment(buildConfirmOpenShipmentRequest());
                            if(isResponseOk(validateOpenShipmentReply.getHighestSeverity()))
                            {
                                writeServiceOutput(confirmOpenShipmentReply);
                            }

                            printNotifications(confirmOpenShipmentReply.getNotifications());
                        }
                    printNotifications(validateOpenShipmentReply.getNotifications());
                        //System.out.println("\n**Deleting OpenShipment**\n");
                        //DeleteOpenShipmentReply deleteOpenShipmentReply = port.deleteOpenShipment(buildDeleteOpenShipmentRequest());
                        //if(isResponseOk(deleteOpenShipmentReply.getHighestSeverity()))
                        //{
                        //	printNotifications(deleteOpenShipmentReply.getNotifications());
                        //}
             //       }else printNotifications(modifyPackageInOpenShipmentReply.getNotifications());
                }else printNotifications(addPackagesToOpenShipmentReply.getNotifications());
            }
            else{
                printNotifications(createOpenShipmentReply.getNotifications());
            }
        }catch(Exception e){

        }
    }

    private static void printNotifications(Notification[] notifications) {
        System.out.println("Notifications:");
        if (notifications == null || notifications.length == 0) {
            System.out.println("  No notifications returned");
        }
        for (int i=0; i < notifications.length; i++){
            Notification n = notifications[i];
            System.out.print("  Notification no. " + i + ": ");
            if (n == null) {
                System.out.println("null");
                continue;
            } else {
                System.out.println("");
            }
            NotificationSeverityType nst = n.getSeverity();

            System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
            System.out.println("    Code: " + n.getCode());
            System.out.println("    Message: " + n.getMessage());
            System.out.println("    Source: " + n.getSource());
        }
    }

    private static ValidateOpenShipmentRequest buildValidateOpenShipmentRequest()
    {
        ValidateOpenShipmentRequest request = new ValidateOpenShipmentRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - ValidateOpenShipment"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 9, 0, 0);
        request.setVersion(versionId);
        //
        request.setIndex(index);
        return request;
    }

    private static ConfirmOpenShipmentRequest buildConfirmOpenShipmentRequest()
    {
        ConfirmOpenShipmentRequest request = new ConfirmOpenShipmentRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - ConfirmOpenShipment"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 9, 0, 0);
        request.setVersion(versionId);
        //
        request.setIndex(index);
        return request;
    }

    private static AddPackagesToOpenShipmentRequest buildAddPackagesToOpenShipmentRequest()
    {
        AddPackagesToOpenShipmentRequest request = new AddPackagesToOpenShipmentRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - AddPackageToOpenShipment"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 9, 0, 0);
        request.setVersion(versionId);
        //
        request.setIndex(index);
        CreateOpenShipmentActionType[] actions = new CreateOpenShipmentActionType[1];
        actions[0] = CreateOpenShipmentActionType.STRONG_VALIDATION;
        //
        request.setRequestedPackageLineItems(new RequestedPackageLineItem[] {addRequestedPackageLineItem()});
        return request;
    }

 /*   private static ModifyPackageInOpenShipmentRequest buildModifyPackageInOpenShipmentRequest(TrackingId trackingId)
    {
        ModifyPackageInOpenShipmentRequest request = new ModifyPackageInOpenShipmentRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - AddPackageToOpenShipment"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 9, 0, 0);
        request.setVersion(versionId);
        //
        request.setIndex(index);
        request.setTrackingId(trackingId);
        //CreateOpenShipmentActionType[] actions = new CreateOpenShipmentActionType[1];
        //actions[0] = CreateOpenShipmentActionType.STRONG_VALIDATION;
        //
        request.setRequestedPackageLineItem(addRequestedPackageLineItem());
        request.getRequestedPackageLineItem().setWeight(addPackageWeight(35.0,WeightUnits.KG));
        return request;
    }*/

    private static RequestedPackageLineItem addRequestedPackageLineItem(){
        RequestedPackageLineItem requestedPackageLineItem = new RequestedPackageLineItem();
        requestedPackageLineItem.setSequenceNumber(new PositiveInteger("1"));
        requestedPackageLineItem.setGroupPackageCount(new PositiveInteger("1"));
        requestedPackageLineItem.setWeight(addPackageWeight(50.5, WeightUnits.KG));

//		requestedPackageLineItem.setContentRecords();
//        requestedPackageLineItem.setDimensions(addPackageDimensions(108, 5, 5, LinearUnits.IN));
        requestedPackageLineItem.setCustomerReferences(new CustomerReference[]{
                addCustomerReference(CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), "CR1234"),
                addCustomerReference(CustomerReferenceType.INVOICE_NUMBER.getValue(), "IV1234"),
                addCustomerReference(CustomerReferenceType.P_O_NUMBER.getValue(), "PO1234"),
        });

        return requestedPackageLineItem;
    }

    private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
        if (notificationSeverityType == null) {
            return false;
        }
        if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
                notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
                notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
            return true;
        }

        return false;
    }


    private static Money addMoney(String currency, Double value){
        Money money = new Money();
        money.setCurrency(currency);
        money.setAmount(new BigDecimal(value));
        return money;
    }



    private static Payment addDutiesPayment(){
        Payment payment = new Payment(); // Payment information
        payment.setPaymentType(PaymentType.SENDER);
        Payor payor = new Payor();
        Party responsibleParty = new Party();
        responsibleParty.setAccountNumber(getPayorAccountNumber());
        Address responsiblePartyAddress = new Address();
        responsiblePartyAddress.setCountryCode("US");
        responsibleParty.setAddress(responsiblePartyAddress);
        responsibleParty.setContact(new Contact());
        payor.setResponsibleParty(responsibleParty);
        payment.setPayor(payor);
        return payment;
    }



    private static String getPayorAccountNumber() {
        // See if payor account number is set as system property,
        // if not default it to "XXX"
        String payorAccountNumber = System.getProperty("Payor.AccountNumber");
        if (payorAccountNumber == null) {
            payorAccountNumber = accountNumber; // Replace "XXX" with the payor account number
        }
        return payorAccountNumber;
    }

    private static Weight addPackageWeight(Double packageWeight, WeightUnits weightUnits){
        Weight weight = new Weight();
        weight.setUnits(weightUnits);
        weight.setValue(new BigDecimal(packageWeight));
        return weight;
    }
    private static Dimensions addPackageDimensions(Integer length, Integer height, Integer width, LinearUnits linearUnits){
        Dimensions dimensions = new Dimensions();
        dimensions.setLength(new NonNegativeInteger(length.toString()));
        dimensions.setHeight(new NonNegativeInteger(height.toString()));
        dimensions.setWidth(new NonNegativeInteger(width.toString()));
        dimensions.setUnits(linearUnits);
        return dimensions;
    }

    //Shipment level reply information
    private static void printShipmentOperationalDetails(ShipmentOperationalDetail shipmentOperationalDetail){
        if(shipmentOperationalDetail!=null){
            System.out.println("Routing Details");
            printString(shipmentOperationalDetail.getUrsaPrefixCode(), "URSA Prefix", "  ");
            if(shipmentOperationalDetail.getCommitDay()!=null)
                printString(shipmentOperationalDetail.getCommitDay().getValue(), "Service Commitment", "  ");
            printString(shipmentOperationalDetail.getAirportId(), "Airport Id", "  ");
            if(shipmentOperationalDetail.getDeliveryDay()!=null)
                printString(shipmentOperationalDetail.getDeliveryDay().getValue(), "Delivery Day", "  ");
            System.out.println();
        }
    }

    private static void printShipmentRating(ShipmentRating shipmentRating){
        if(shipmentRating!=null){
            System.out.println("Shipment Rate Details");
            ShipmentRateDetail[] srd = shipmentRating.getShipmentRateDetails();
            for(int j=0; j < srd.length; j++)
            {
                System.out.println("  Rate Type: " + srd[j].getRateType().getValue());
                printWeight(srd[j].getTotalBillingWeight(), "Shipment Billing Weight", "    ");
                printMoney(srd[j].getTotalBaseCharge(), "Shipment Base Charge", "    ");
                printMoney(srd[j].getTotalNetCharge(), "Shipment Net Charge", "    ");
                printMoney(srd[j].getTotalSurcharges(), "Shipment Total Surcharge", "    ");
                if (null != srd[j].getSurcharges())
                {
                    System.out.println("Surcharge Details");
                    Surcharge[] s = srd[j].getSurcharges();
                    for(int k=0; k < s.length; k++)
                    {
                        printMoney(s[k].getAmount(),s[k].getSurchargeType().getValue(), "      ");
                    }
                }
                printFreightDetail(srd[j].getFreightRateDetail());
                System.out.println();
            }
        }
    }
    private static void printFreightDetail(FreightRateDetail freightRateDetail){
        if(freightRateDetail!=null){
            System.out.println("  Freight Details");
            printFreightNotations(freightRateDetail);
            printFreightBaseCharges(freightRateDetail);

        }
    }
    private static void printFreightNotations(FreightRateDetail frd){
        if(null != frd.getNotations()){
            System.out.println("    Notations");
            FreightRateNotation notations[] = frd.getNotations();
            for(int n=0; n< notations.length; n++){
                printString(notations[n].getCode(), "Code", "      ");
                printString(notations[n].getDescription(), "Notification", "      ");
            }
        }
    }

    private static void printFreightBaseCharges(FreightRateDetail frd){
        if(null != frd.getBaseCharges()){
            FreightBaseCharge baseCharges[] = frd.getBaseCharges();
            for(int i=0; i < baseCharges.length; i++){
                System.out.println("    Freight Rate Details");
                printString(baseCharges[i].getDescription(), "Description", "      ");
                printString(baseCharges[i].getFreightClass().getValue(), "Freight Class", "      ");
                printString(baseCharges[i].getRatedAsClass().getValue(), "Rated Class", "      ");
                printWeight(baseCharges[i].getWeight(), "Weight", "      ");
                printString(baseCharges[i].getChargeBasis().getValue(), "Charge Basis", "      ");
                printMoney(baseCharges[i].getChargeRate(), "Charge Rate", "      ");
                printMoney(baseCharges[i].getExtendedAmount(), "Extended Amount", "      ");
                printString(baseCharges[i].getNmfcCode(), "NMFC Code", "      ");
            }
        }
    }
    private static void printMoney(Money money, String description, String space){
        if(money!=null){
            System.out.println(space + description + ": " + money.getAmount() + " " + money.getCurrency());
        }
    }
    private static void printWeight(Weight weight, String description, String space){
        if(weight!=null){
            System.out.println(space + description + ": " + weight.getValue() + " " + weight.getUnits());
        }
    }


    private static CustomerReference addCustomerReference(String customerReferenceType, String customerReferenceValue){
        CustomerReference customerReference = new CustomerReference();
        customerReference.setCustomerReferenceType(CustomerReferenceType.fromString(customerReferenceType));
        customerReference.setValue(customerReferenceValue);
        return customerReference;
    }

    private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        userCredential.setKey(key);
        userCredential.setPassword(password);

        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential=false; //Set this value to true is using a parent credential
        if(useParentCredential){

            String parentKey = System.getProperty("parentkey");
            String parentPassword = System.getProperty("parentpassword");
            //
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
            //
            if (parentKey == null) {
                parentKey = "XXX"; // Replace "XXX" with clients parent key
            }
            if (parentPassword == null) {
                parentPassword = "XXX"; // Replace "XXX" with clients parent password
            }
            parentCredential = new WebAuthenticationCredential();
            parentCredential.setKey(parentKey);
            parentCredential.setPassword(parentPassword);
        }
        return new WebAuthenticationDetail(parentCredential, userCredential);
    }

    private static TrackingId writeServiceOutput(CreateOpenShipmentReply reply) throws Exception
    {
        try
        {
            index=reply.getIndex();
            printString(index,"index", "");
            System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
            printString(reply.getJobId(), "Job Id", "");
            CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
            TrackingId masterTrackingNumber =  printMasterTrackingNumber(csd);
          //  saveShipmentDocumentsToFile(csd.getShipmentDocuments(), masterTrackingNumber.getTrackingNumber());
            //  If Express COD shipment is requested, the COD return label is returned as an Associated Shipment.
          //  getAssociatedShipmentLabels(csd.getAssociatedShipments());

            return masterTrackingNumber;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            return null;
        }
    }

    private static TrackingId printMasterTrackingNumber(CompletedShipmentDetail csd){
        TrackingId masterTrackingId=null;
        if(null != csd.getMasterTrackingId()){
            masterTrackingId = csd.getMasterTrackingId();
            System.out.println("Master Tracking Number");
            System.out.println("  Type: "
                    + csd.getMasterTrackingId().getTrackingIdType());
            System.out.println("  Tracking Number: "
                    + csd.getMasterTrackingId().getTrackingNumber());

            System.out.println(csd.getCompletedPackageDetails()[0].getTrackingIds().toString());
        }
        return masterTrackingId;
    }

    private static TrackingId writeServiceOutput(AddPackagesToOpenShipmentReply reply) throws Exception
    {
        TrackingId trackingNumber = null;
        try
        {
            System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
            printString(reply.getJobId(), "Job Id", "");
            CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
            CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
            printPackageDetails(cpd);
            if(cpd[0] != null && cpd[0].getTrackingIds()[0] != null)
                trackingNumber = cpd[0].getTrackingIds()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            //
        }
        return trackingNumber;
    }
    private static void writeServiceOutput(ModifyPackageInOpenShipmentReply reply) throws Exception
    {
        try
        {
            System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
            printString(reply.getJobId(), "Job Id", "");
            CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
            CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
            printPackageDetails(cpd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            //
        }
    }
    private static void writeServiceOutput(ConfirmOpenShipmentReply reply) throws Exception
    {
        try
        {
            System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
            CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
            String masterTrackingNumber=printMasterTrackingNumber(csd).getTrackingNumber();
            printShipmentOperationalDetails(csd.getOperationalDetail());
            printShipmentRating(csd.getShipmentRating());
            CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
            printPackageDetails(cpd);
            saveShipmentDocumentsToFile(csd.getShipmentDocuments(), masterTrackingNumber);
            //  If Express COD shipment is requested, the COD return label is returned as an Associated Shipment.
            getAssociatedShipmentLabels(csd.getAssociatedShipments());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            //
        }

    }
    private static void getAssociatedShipmentLabels(AssociatedShipmentDetail[] associatedShipmentDetail) throws Exception{
        if(associatedShipmentDetail!=null){
            for (int j=0; j < associatedShipmentDetail.length; j++){
                if(associatedShipmentDetail[j].getLabel()!=null && associatedShipmentDetail[j].getType()!=null){
                    String trackingNumber = associatedShipmentDetail[j].getTrackingId().getTrackingNumber();
                    String associatedShipmentType = associatedShipmentDetail[j].getType().getValue();
                    ShippingDocument associatedShipmentLabel = associatedShipmentDetail[j].getLabel();
                    saveAssociatedShipmentLabelToFile(associatedShipmentLabel, trackingNumber, associatedShipmentType);
                }
            }
        }
    }
    private static void saveAssociatedShipmentLabelToFile(ShippingDocument shippingDocument, String trackingNumber, String labelName) throws Exception {
        ShippingDocumentPart[] sdparts = shippingDocument.getParts();
        for (int a=0; a < sdparts.length; a++) {
            ShippingDocumentPart sdpart = sdparts[a];
            String labelLocation = System.getProperty("file.label.location");
            if (labelLocation == null) {
                labelLocation = ".";
            }
            String associatedShipmentLabelFileName =  new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
            File associatedShipmentLabelFile = new File(associatedShipmentLabelFileName);
            FileOutputStream fos = new FileOutputStream( associatedShipmentLabelFile );
            fos.write(sdpart.getImage());
            fos.close();
            System.out.println("\nAssociated shipment label file name " + associatedShipmentLabelFile.getAbsolutePath());
            //Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + associatedShipmentLabelFile.getAbsolutePath());
        }
    }

    private static void saveShipmentDocumentsToFile(ShippingDocument[] shippingDocument, String trackingNumber) throws Exception{
        if(shippingDocument!= null){
            for(int i=0; i < shippingDocument.length; i++){
                ShippingDocumentPart[] sdparts = shippingDocument[i].getParts();
                for (int a=0; a < sdparts.length; a++) {
                    ShippingDocumentPart sdpart = sdparts[a];
                    String labelLocation = System.getProperty("file.label.location");
                    if (labelLocation == null) {
                        labelLocation = ".";
                    }
                    String labelName = shippingDocument[i].getType().getValue();
                    String shippingDocumentLabelFileName =  new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
                    File shippingDocumentLabelFile = new File(shippingDocumentLabelFileName);
                    FileOutputStream fos = new FileOutputStream( shippingDocumentLabelFile );
                    fos.write(sdpart.getImage());
                    fos.close();
                    System.out.println("\nAssociated shipment label file name " + shippingDocumentLabelFile.getAbsolutePath());
                   /// Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + shippingDocumentLabelFile.getAbsolutePath());
                }
            }
        }
    }

    private static void printString(String value, String description, String space){
        if(value!=null){
            System.out.println(space + description + ": " + value);
        }
    }

    private static void printPackageDetails(CompletedPackageDetail[] cpd) throws Exception{
        if(cpd!=null){
            System.out.println("Package Details");
            for (int i=0; i < cpd.length; i++) { // Package details / Rating information for each package
                String trackingNumber = cpd[i].getTrackingIds()[0].getTrackingNumber();
                printTrackingNumbers(cpd[i]);
                savePackageLabelToFile(cpd[i].getLabel(), trackingNumber);
                System.out.println();
            }
        }
    }
    private static void savePackageLabelToFile(ShippingDocument shippingDocument, String trackingNumber) throws Exception{
        if(shippingDocument!= null){
            ShippingDocumentPart[] sdparts = shippingDocument.getParts();
            for (int a=0; a < sdparts.length; a++) {
                ShippingDocumentPart sdpart = sdparts[a];
                String labelLocation = System.getProperty("file.label.location");
                if (labelLocation == null) {
                    labelLocation = ".";
                }
                String labelName = shippingDocument.getType().getValue();
                String shippingDocumentLabelFileName =  new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
                File shippingDocumentLabelFile = new File(shippingDocumentLabelFileName);
                FileOutputStream fos = new FileOutputStream( shippingDocumentLabelFile );
                fos.write(sdpart.getImage());
                fos.close();
                printString(shippingDocumentLabelFile.getAbsolutePath(), "Package label file name", "  ");
                System.out.println("Package label file name " + shippingDocumentLabelFile.getAbsolutePath());
               // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + shippingDocumentLabelFile.getAbsolutePath());
            }
        }
    }
    private static void printPackageRating(PackageRating packageRating){
        if(packageRating!=null){
            System.out.println("Package Rate Details");
            PackageRateDetail[] prd = packageRating.getPackageRateDetails();
            for(int j=0; j < prd.length; j++)
            {
                System.out.println("  Rate Type: " + prd[j].getRateType().getValue());
                printWeight(prd[j].getBillingWeight(), "Billing Weight", "    ");
                printMoney(prd[j].getBaseCharge(), "Base Charge", "    ");
                printMoney(prd[j].getNetCharge(), "Net Charge", "    ");
                printMoney(prd[j].getTotalSurcharges(), "Total Surcharge", "    ");
                if (null != prd[j].getSurcharges())
                {
                    System.out.println("    Surcharge Details");
                    Surcharge[] s = prd[j].getSurcharges();
                    for(int k=0; k < s.length; k++)
                    {
                        printMoney(s[k].getAmount(),s[k].getSurchargeType().getValue(), "      ");
                    }
                }
                System.out.println();
            }
        }
    }

    private static void printTrackingNumbers(CompletedPackageDetail completedPackageDetail){
        if(completedPackageDetail.getTrackingIds()!=null){
            TrackingId[] trackingId = completedPackageDetail.getTrackingIds();
            for(int i=0; i< trackingId.length; i++){
                String trackNumber = trackingId[i].getTrackingNumber();
                String trackType = trackingId[i].getTrackingIdType().getValue();
                String formId = trackingId[i].getFormId();
                printString(trackNumber, trackType + " tracking number", "  ");
                printString(formId, "Form Id", "  ");
            }
        }
    }


    private static void updateEndPoint(OpenShipServiceLocator serviceLocator) {
        if (endPoint != null) {
            serviceLocator.setOpenShipServicePortEndpointAddress(endPoint);
        }
    }
}

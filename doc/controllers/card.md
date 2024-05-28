# Card

APIs for Retrieve and update shell card details

```java
CardController cardController = client.getCardController();
```

## Class Name

`CardController`

## Methods

* [Search Card](../../doc/controllers/card.md#search-card)
* [Card Summary](../../doc/controllers/card.md#card-summary)
* [Order Card](../../doc/controllers/card.md#order-card)
* [Order Card Enquiry](../../doc/controllers/card.md#order-card-enquiry)
* [Card Cancel](../../doc/controllers/card.md#card-cancel)
* [Card Update Status](../../doc/controllers/card.md#card-update-status)
* [Purchase Category](../../doc/controllers/card.md#purchase-category)
* [Card Details](../../doc/controllers/card.md#card-details)
* [Card Move](../../doc/controllers/card.md#card-move)
* [Card Pin Reminder](../../doc/controllers/card.md#card-pin-reminder)
* [Schedule Card Block](../../doc/controllers/card.md#schedule-card-block)
* [Auto Renew](../../doc/controllers/card.md#auto-renew)
* [Update Mobile Payment Registration Status](../../doc/controllers/card.md#update-mobile-payment-registration-status)
* [Get Key](../../doc/controllers/card.md#get-key)
* [Delivery Address Update](../../doc/controllers/card.md#delivery-address-update)


# Search Card

This API allows to search for Shell Cards in the Shell Card Platform. It provides flexible search criteria and supports paging.

#### New version updates

* Oauth authentication to access the API
* New parameters have been added in the response. Below are the list of parameters added
  * IsEMVContact
  * IsEMVContactless
  * IsRFID
  * RFIDUID
  * EMAID
  * EVPrintedNumber
  * CardMediaCode

#### Supported operations

* Search cards by card id or PAN
* Search cards by card status
* Search cards by excluding card status
* Search cards by date fields
* Search cards by embossed fields
* Search cards by card configuration fields
* Search cards by included/excluded list of cards
* Search cards by excluding card bundle Id

```java
CompletableFuture<CardSearchResponse> searchCardAsync(
    final String requestId,
    final SearchCardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`SearchCardRequest`](../../doc/models/search-card-request.md) | Body, Optional | requestbody |

## Response Type

[`CardSearchResponse`](../../doc/models/card-search-response.md)

## Example Usage

```java
String requestId = "RequestId8";
SearchCardRequest body = new SearchCardRequest.Builder()
    .filters(new SearchRequest.Builder(
        Arrays.asList(
            "ACTIVE",
            "BLOCKED"
        )
    )
    .accountId(1223)
    .accountNumber("CZ00000923")
    .cardGroupId(424)
    .cardGroupName("CARDGRP1")
    .cardSegment("Fleet")
    .cardTypeCode("7077327")
    .colCoCode(32)
    .colCoId(32)
    .coverage("National")
    .creationDate("20211222")
    .driverName(Arrays.asList(
            "JAN KOLLER",
            "DRIVER23",
            "DRIVER25"
        ))
    .effectiveDate("20211222")
    .excludeCancelledCards(true)
    .excludeCardGroupId(425)
    .excludeCardGroupName("CARDGRP2")
    .excludeCards(Arrays.asList(
            new SearchCard.Builder()
                .cardId(466907)
                .pAN("7077327290224795811")
                .build()
        ))
    .excludeFraudCards(false)
    .excludePendingRenewalCards(true)
    .excludeReplacedCards(false)
    .expiryMonth("052022")
    .includeCards(Arrays.asList(
            new SearchCard.Builder()
                .cardId(466906)
                .pAN("7077327290224795801")
                .build()
        ))
    .includeIntermediateStatus(false)
    .issuedAfter("20211123")
    .network("ShellSitesOnly")
    .pANEndsWith("1284")
    .payerId(1223)
    .payerNumber("CZ00000923")
    .purchaseCategoryCode("3")
    .sortOrder("1,3,7")
    .includeScheduledCardBlocks(false)
    .tokenTypeID(107)
    .tokenTypeName("CZ CRT Int MultiNetwork - CHIP")
    .vehicleRegistrationNumber(Arrays.asList(
            "5A2 7512",
            "5A2 7514"
        ))
    .excludeOldCards(false)
    .excludeExpiringCards(false)
    .reissueSetting("true")
    .requestId("233e4567-e89b-12d3-a456-426614174000")
    .build())
    .pageSize("50")
    .page("1")
    .build();

cardController.searchCardAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "Page": 1,
  "TotalRecords": 3420,
  "TotalPages": 3420,
  "PageSize": 50,
  "Data": [
    {
      "AccountId": 1223,
      "AccountName": "NewtestPandB",
      "AccountNumber": "CZ00000923",
      "AccountShortName": "NewtestPandB",
      "BundleId": "null",
      "CardBlockSchedules": [
        {
          "null": null
        }
      ],
      "CardGroupId": 5,
      "CardGroupName": "null",
      "CardId": 385316,
      "CardTypeCode": "7077327",
      "CardTypeId": 105,
      "CardTypeName": "CZ CRT INT MUL R7",
      "ColCoCountryCode": "CZ",
      "CreationDate": "20190911 13:58:30",
      "DriverName": "Jhon",
      "EffectiveDate": "20190911",
      "ExpiryDate": "20230930",
      "FleetIdInput": true,
      "IsCRT": true,
      "IsFleet": false,
      "IsInternational": true,
      "IsNational": false,
      "IsPartnerSitesIncluded": true,
      "IsShellSitesOnly": false,
      "IssueDate": "20190911",
      "IsSuperseded": true,
      "IsVirtualCard": false,
      "LastModifiedDate": "20230720 09:33:28",
      "LastUsedDate": "20230720 09:33:28",
      "LocalCurrencyCode": "CZK",
      "LocalCurrencySymbol": "Kč",
      "OdometerInput": true,
      "PAN": "7077327290223410782",
      "PurchaseCategoryCode": "3",
      "PurchaseCategoryId": 103,
      "PurchaseCategoryName": "3 - No Restriction",
      "Reason": "Lost",
      "ReissueSetting": "False",
      "StatusDescription": "Active",
      "StatusId": 1,
      "TokenTypeID": 107,
      "TokenTypeName": "CZ CRT Int MultiNetwork - CHIP",
      "VRN": "GHJHJDKSDS",
      "ClientReferenceId": "233e4567-e89b-12d3-a456-426614174000",
      "IsEMVContact": false,
      "IsEMVContactless": false,
      "IsRFID": false,
      "RFIDUID": "AFR56T",
      "EMAID": "JUYHF767",
      "EVPrintedNumber": "87394FDE",
      "CardMediaCode": "100999",
      "MediumTypeID": 0,
      "MediumType": null
    }
  ],
  "RequestId": "4cb1d11e-c387-48a5-b667-a1d862be4343",
  "Status": "SUCCESS"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Card Summary

This API allows to search for fuel cards in the Shell Card Platform and returns a high-level summary count. It provides flexible search criteria.

#### New version updates

* Oauth authentication to access the API
* Minor change in response structure with addition of Status parameter

#### Supported operations

* Search cards by card id or PAN
* Search cards by card status
* Search cards by excluding card status
* Search cards by date fields
* Search cards by embossed fields
* Search cards by card configuration fields
* Search cards by included/excluded list of cards

```java
CompletableFuture<CardSummaryResponse> cardSummaryAsync(
    final String requestId,
    final CardSummaryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CardSummaryRequest`](../../doc/models/card-summary-request.md) | Body, Optional | summary request body |

## Response Type

[`CardSummaryResponse`](../../doc/models/card-summary-response.md)

## Example Usage

```java
String requestId = "RequestId8";
CardSummaryRequest body = new CardSummaryRequest.Builder()
    .filters(new SummaryRequest.Builder(
        Arrays.asList(
            "ACTIVE",
            "BLOCKED"
        ),
        "233e4567-e89b-12d3-a456-426614174000"
    )
    .accountId(1223)
    .accountNumber("CZ00000923")
    .colCoCode(32)
    .colCoId(32)
    .payerId(1223)
    .payerNumber("CZ00000923")
    .cardGroupId(424)
    .cardGroupName("CARDGRP1")
    .issuedAfter("20211123")
    .pANEndsWith("1284")
    .driverName(Arrays.asList(
            "JAN KOLLER",
            "DRIVER23",
            "DRIVER25"
        ))
    .vehicleRegistrationNumber(Arrays.asList(
            "5A2 7512",
            "5A2 7514"
        ))
    .includeCards(Arrays.asList(
            new SearchCard.Builder()
                .cardId(466906)
                .pAN("7077327290224795801")
                .build()
        ))
    .excludeCards(Arrays.asList(
            new SearchCard.Builder()
                .cardId(466907)
                .pAN("7077327290224795811")
                .build()
        ))
    .cardSegment("Fleet")
    .purchaseCategoryCode("3")
    .cardTypeCode("7077327")
    .excludePendingRenewalCards(true)
    .excludeCancelledCards(true)
    .excludeReplacedCards(false)
    .excludeFraudCards(false)
    .excludeCardGroupId(425)
    .excludeCardGroupName("CARDGRP2")
    .creationDate("20211222")
    .effectiveDate("20211222")
    .network("ShellSitesOnly")
    .coverage("National")
    .expiryMonth("052022")
    .excludeOldCards(false)
    .reissueSetting("true")
    .build())
    .build();

cardController.cardSummaryAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "233e4567-e89b-12d3-a456-426614174000",
  "Status": "SUCCESS",
  "Data": [
    {
      "ActiveCards": 0,
      "BlockedCards": 0,
      "CancelledCards": 0,
      "ExpiredCards": 0,
      "ExpiringCards": 0,
      "FraudCards": 0,
      "NewCards": 0,
      "RenewalPendingCards": 0,
      "ReplacedCards": 0,
      "TemporaryBlockByCustomer": 0,
      "TemporaryBlockByShell": 0,
      "TotalCards": 0
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Order Card

This API allows ordering one or more fuel cards (up to 50). If the API call succeeds, the API will return a reference number and queue the request for asynchronous processing.

#### New version updates

* Oauth authentication to access the API
* New parameters have been added in the response for the new PIN management changes. Below parameters needs to be derived from the new PIN encryption method explained in our Mobility Card PIN Management product.
  * SelfSelectedEncryptedPIN
  * SelfSelectedPINKeyID
  * SelfSelectedPINSessionKey
* New parameters have been added in the response for card and pin delivery mechanism which gives the opportunity to deliver card & pin by email, SMS or post.
  Also the possibility to deliver card and pin to different address if the use case demands.
  * CardDeliveryType
  * PINDeliveryAddressType
  * PINAdviceType
  * PINContact
  * CardContact

#### Supported operations

* Order one or more cards (up to 50)
* Order card with self selected PIN
* Order card with vehicle registration number
* Order card and add to new or exisitng card group
* Order card and enable fleetId or odemeter input
* Order card and specify product groups

#### Validation rules

* Number of cards per request does not exceed 50

#### API response

* A main reference number for the API request (**OrderReference**)
* Individual reference numbers (**OrderCardReference**) for each new card

```java
CompletableFuture<OrderCardResponse> orderCardAsync(
    final String requestId,
    final OrderCardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`OrderCardRequest`](../../doc/models/order-card-request.md) | Body, Optional | Order card request body |

## Response Type

[`OrderCardResponse`](../../doc/models/order-card-response.md)

## Example Usage

```java
String requestId = "RequestId8";
OrderCardRequest body = new OrderCardRequest.Builder()
    .cardDetails(Arrays.asList(
        new CardDetail.Builder(
            1,
            1
        )
        .payerId(853)
        .payerNumber("PH50000843")
        .accountId(854)
        .accountNumber("PH50000844")
        .colCoCode(86)
        .colCoId(1)
        .cardTypeId(1)
        .tokenTypeId(107)
        .embossText("PARKLEY")
        .vRN("MV65YLH")
        .driverName("Robert")
        .odometerInputRequired(false)
        .fleetIdInputRequired(false)
        .purchaseCategoryId(54)
        .selfSelectedEncryptedPIN("0hCx7wfFp3z8QkW8dElhHiMwCwC1")
        .selfSelectedPINKeyID("123aaa33198dc8f3s4k77dsc78")
        .selfSelectedPINSessionKey("WoWB+8UEd71+8QXwuE75flkAQ /4Q6gDFSn027oJ/0ne6LmzVIxJ87yoeqKS /C+OIBJ7bTvasLH+xvDSZtzoOZHr 7wfFmpfSyet8KnKjnagSicrUgpGk 7qFyOw3iA9/Qd6Oy9djYR3C3cDWEpj /YREZ1lBGReb9fqdSpoKx8mnGuPAw7")
        .cardGroupId(5)
        .cardGroupName("Group1")
        .isNewCardGroup(false)
        .embossCardGroup(false)
        .cardContact(new CardDeliveryContact.Builder(
                "Robert",
                "WILTON AUFDERHAR",
                "Herrn Dieter Whausen Lansstrab",
                "12130",
                "manila",
                "WILTON AUFDERHAR"
            )
            .deliveryContactTitle("Mr.")
            .deliveryAddressLine2("10th avenue")
            .deliveryAddressLine3("makati city")
            .deliveryRegionId(43)
            .deliveryRegion("Philippines")
            .phoneNumber("99999999999")
            .emailAddress("xxxxx@example.com")
            .saveForCardReissue(false)
            .build())
        .pINDeliveryAddressType(1)
        .pINContact(new PINDeliveryContact.Builder()
                .deliveryContactTitle("Mr.")
                .deliveryContactName("Robert")
                .deliveryCompanyName("WILTON AUFDERHAR")
                .deliveryAddressLine1("Herrn Dieter Whausen Lansstrab")
                .deliveryAddressLine2("10th avenue")
                .deliveryAddressLine3("makati city")
                .deliveryZipCode("12130")
                .deliveryCity("manila")
                .deliveryRegionId(43)
                .deliveryRegion("Philippines")
                .deliveryCountry("WILTON AUFDERHAR")
                .phoneNumber("99999999999")
                .emailAddress("xxxxx@example.com")
                .saveForPINReminder(false)
                .build())
        .notifyCaller(false)
        .caller("NextGenUI")
        .notifyCallerOnSync(false)
        .validateFleetId(false)
        .fleetOption("ALERT")
        .bundleId("1046")
        .usageRestrictionAction("None")
        .productRestrictionAction("None")
        .products(Arrays.asList(
                "011",
                "033"
            ))
        .productGroups(Arrays.asList(
                "670246404",
                "40557126"
            ))
        .expiryDate("1221")
        .clientReferenceId("cli123")
        .build()
    ))
    .build();

cardController.orderCardAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "string",
  "Status": "string",
  "Data": [
    {
      "DriverAndVRN": "Robert:MV65YLH",
      "OrderCardReference": 488351
    }
  ],
  "MainReference": 0
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Order Card Enquiry

This API retrieves the card order status from the Shell Card Platform based on the given reference numbers.

#### New version updates

    * Oauth authentication to access the API
    * Minor change in response structure with addition of Status parameter

#### Supported operations

    * Get order status by Bulk Card Order Reference
    * Get order status by Order Reference (main reference for the order)
    * Get order status by Card Reference (individual card reference belonging to an order reference)

```java
CompletableFuture<OrderCardEnquiryResponse> orderCardEnquiryAsync(
    final String requestId,
    final OrderCardEnquiryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`OrderCardEnquiryRequest`](../../doc/models/order-card-enquiry-request.md) | Body, Optional | Order Card Enquiry request body |

## Response Type

[`OrderCardEnquiryResponse`](../../doc/models/order-card-enquiry-response.md)

## Example Usage

```java
String requestId = "RequestId8";
OrderCardEnquiryRequest body = new OrderCardEnquiryRequest.Builder()
    .filters(new OrderCardEnquiryReq.Builder()
        .accountId(70)
        .accountNumber("NL00000063")
        .colCoCode(18)
        .colCoId(18)
        .colCoCountryCode("NL")
        .payerId(70)
        .payerNumber("NL00000063")
        .referenceNumber(25)
        .referenceType(OrderCardEnquiryReqReferenceTypeEnum.ENUM_1)
        .fromDate("20210502")
        .toDate("20210505")
        .orderRequestId("34edbfbf-f05e-4d8d-bcd4-9eb7aea5ea41")
        .build())
    .build();

cardController.orderCardEnquiryAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "string",
  "Status": "string",
  "Data": [
    {
      "AccountId": 0,
      "AccountNumber": "string",
      "BCOReference": 0,
      "BCORowNumber": 0,
      "CardGroupId": 0,
      "CardGroupName": "string",
      "CardId": 0,
      "CardPAN": "string",
      "CardTypeCode": "string",
      "CardTypeId": 0,
      "CardTypeName": "string",
      "DriverName": "string",
      "ErrorCode": "string",
      "ErrorDescription": "string",
      "GatewaySyncErrorCode": "string",
      "GatewaySyncErrorDescription": "string",
      "GatewaySyncStatus": "string",
      "MainReference": 0,
      "OrderCardReference": 0,
      "OrderStatus": "string",
      "PayerId": 0,
      "PayerNumber": "string",
      "ProcessedDate": "string",
      "PurchaseCategoryCode": "string",
      "PurchaseCategoryId": 0,
      "PurchaseCategoryName": "string",
      "SubmittedDate": "string",
      "SyncProcessedDate": "string",
      "SyncRequestedDate": "string",
      "VRN": "string",
      "OrderRequestId": "string",
      "ExpiryDate": "string",
      "ClientReferenceId": "string",
      "StatusDescription": "string",
      "ColCoId": 0
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Card Cancel

This API allows cancelling one or multiple cards (up to 500) within a single API call. This API allows updating of
the card to the following status-

* Block (Cancelled)

#### New version updates

* Oauth authentication to access the API
* Change in the request body
  * PIN delivery address details have been added along with Email and Phone number for card and PIN delivery.

Requests that passed the below validations are queued-

* All Mandatory fields are passed.
* Card is present in the Shell Card Platform.
* Only one matching card is available in the cards platform for the given PAN and expiry date for Block requests.
* Card is allowed to be moved to proposed state as per the card status transition configuration in cards platform.
* A valid Reason Id or Reason Text is provided. The reason for card cancellation can be “Damaged” or “NoLongerRequired”.
* For the given card, there is no Cancel request already submitted via this API and is being processed.
* ‘IsReplacementChargeable’ is set to ‘False’ only to the configured customer, other customers need to set it as ‘True’ only. If other customers pass this value as ‘False’.

Note- Shell Card Platform will maintain the list of   customers, to whom ‘IsReplacementChargeable’ can be set as ‘False’.

If all validations are passed, the request will be accepted and the API will return reference numbers for tracking purpose. If any of the validations fail, the API will return the appropriate error details on response.  The API response will include-

* A main reference number for the API request.
* A list of successfully validated and accepted cards along with the individual reference numbers for each of the successful requests.
* A list of cards for which at least validation has failed along with the appropriate error code and details.

A permanent block (cancelled) request for the card will be queued in Shell Card Platform after the configured damaged card active period (configured as number of days).

When a card is requested to be Blocked permanently (cancelled) for which a request has already been submitted to report as Damaged and the damaged card active period is not yet completed, the damaged card request will be marked as superseded and the new Block (cancelled) request will be processed.

```java
CompletableFuture<CancelCardResponse> cardCancelAsync(
    final String requestId,
    final CancelCardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CancelCardRequest`](../../doc/models/cancel-card-request.md) | Body, Optional | Update status request body |

## Response Type

[`CancelCardResponse`](../../doc/models/cancel-card-response.md)

## Example Usage

```java
String requestId = "RequestId8";
CancelCardRequest body = new CancelCardRequest.Builder(
    Arrays.asList(
        new UpdateCard.Builder()
            .caller("NextGenUI")
            .isReplacementChargeable(true)
            .notifyCaller(false)
            .notifyCallerOnSync(false)
            .orderCardReplacement(true)
            .cardSettings(new ReplaceCardSettings.Builder(
                1
            )
            .selfSelectedEncryptedPIN("0hCx7wfFp3z8QkW8dElhHiMwCwC1")
            .selfSelectedPINKeyID("123aaa33198dc8f3s4k77dsc78")
            .selfSelectedPINSessionKey("WoWB+8UEd71+8QXwuE75flkAQ /4Q6gDFSn027oJ/0ne6LmzVIxJ87yoeqKS /C+OIBJ7bTvasLH+xvDSZtzoOZHr 7wfFmpfSyet8KnKjnagSicrUgpGk 7qFyOw3iA9/Qd6Oy9djYR3C3cDWEpj /YREZ1lBGReb9fqdSpoKx8mnGuPAw7")
            .validateFleetId(false)
            .cardGroupId(156)
            .deliveryContactTitle("Mr")
            .deliveryContactName("SAPE")
            .deliveryCompanyName("welcome")
            .deliveryAddressLine1("123/89")
            .deliveryAddressLine2("Mac Street")
            .deliveryAddressLine3("NLStrret")
            .deliveryZipCode("1213242")
            .deliveryCity("Chennai")
            .deliveryRegionId(54)
            .deliveryRegion("Mountain Province")
            .deliveryCountry("CZ")
            .phoneNumber("99999999999")
            .emailAddress("xxxxx@examp\"le.com")
            .pINDeliveryAddressType(1)
            .pINAdviceType(1)
            .pINDeliveryContactTitle("5058F1AF")
            .pINDeliveryContactName("WILTON")
            .pINDeliveryCompanyName("WILTON AUFDERHAR")
            .pINDeliveryAddressLine1("Herrn Dieter Whausen Lansstrab")
            .pINDeliveryAddressLine2("Wall street")
            .pINDeliveryAddressLine3("Wall Street")
            .pINDeliveryZipCode("12103")
            .pINDeliveryCity("Berlin")
            .pINDeliveryRegionId(1)
            .pINDeliveryRegion("Berlin-Brandenburg")
            .pINDeliveryCountry("DEU")
            .pINPhoneNumber("99999999999")
            .pINEmailAddress("xxxxx@example.com")
            .saveForPINReminder(false)
            .saveForCardReissue(false)
            .expiryDate("1221")
            .build())
            .accountId(854)
            .accountNumber("PH50000844")
            .cardExpiryDate("20181031")
            .cardId(125)
            .colCoCode(86)
            .colCoId(1)
            .pAN("7002861007636000020")
            .payerId(853)
            .payerNumber("PH50000843")
            .build()
    )
)
.reasonText("Lost")
.build();

cardController.cardCancelAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "ba093ec6-a738-47d3-d25d-2f15a6d04fc6",
  "MainReference": 466536,
  "OrderReplacementReference": 466537,
  "Status": "SUCCESS",
  "Data": [
    {
      "ReplacementCardReference": 599643,
      "UpdateCardReference": 39269,
      "AccountId": 1227,
      "AccountNumber": "CZ00000927",
      "CardExpiryDate": "20240930",
      "CardId": 462079,
      "ColCoCode": 32,
      "ColCoId": 32,
      "PAN": "7002329040232130111",
      "PayerId": 1227,
      "PayerNumber": "CZ00000927"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Card Update Status

This API allows updating of the card status for one or more cards (up to 500) within a single API call.  If the API call succeeds, the API will return a reference number and queue the request for asynchronous processing.

#### New version updates

* Oauth authentication to access the API
* Change in the request body
  * Pin change related parameters - SelfSelectedEncryptedPIN, SelfSelectedPINKeyID, SelfSelectedPINSessionKey
  * PIN delivery address details have been added along with Email and Phone number for card and PIN delivery.
  * SaveForPINReminder - The given address will be used for sending PIN reminders in future when requested.
  * SaveForCardReissue - If this is specified, the contact address will be saved in cards platform for card reissue processing.

#### Supported operations

* Updating a card status to Temporary block, Unblock, Block (Cancelled)
  or Damaged
* Requesting a replacement card when status is set to Block or Damaged

#### Validation rules

* Number of cards per request does not exceed 500
* A card can be changed to proposed status as per the card status transition configuration in the Shell Card Platform
* Locating a card -
  * If target status set to **TemporaryBlock**, then only one matching active card should exist in the Shell Card Platform for the given **PAN** and **CardExpiryDate**
  * If target status set to **Unblock** or **Block**, then only one matching card should exist in the Shell Card Platform for the given **PAN** and **CardExpiryDate**
* A valid Reason Id or Reason Text is provided
  * If target status set to **Block** or **Damaged** and a **ReasonText** is provided, the value must be from the fixed list - *'Lost'*, *'Stolen'* or *'Card no longer required'*
* For the given card, there is no Status Update request already submitted via this API and is being processed
* The **OrderReplacementCard** field is set to True only for cards with a target status set to Block or Damaged

#### API response

* A main reference number for the API request (**OrderReplacementReference**)
* A list of successfully validated and accepted cards along with the individual reference numbers (**UpdateCardReference**) for each of the successful  request
* A list of cards (**ErrorCards**) that failed validation along with the appropriate error code and message

#### Asynchronous processing of valid API request

* Replacement cards
  * Request for a replacement card will be placed only when the Block card or Block damaged card request is successfully placed.
  * The Replacement card request will be processed only when the permanent Block card request is successfully processed. In case of damaged card request, the replacement card request will be processed immediately.
* Damaged cards
  * Setting a card to Damaged will automatically trigger a request to permanently block the card. This will only take effect once the ‘Damaged Active’ period has passed.
  * The Damaged card active period is the number of days after which a "Damaged" card request will be processed. This value is configured at ColCo level.
  * If a card is reported as damaged at 10pm local time on 1st Nov and the damaged card period is set to 10 days, then the block request will be submitted to the Shell Card Platform on 11th Nov 00-01 local time.
  * If during the damage card active period another request is made to set the card to Temporarily Blocked or Blocked permanently (cancelled), then the damaged card request will be marked as superseded and the new Temporary Block or Block (cancelled) will be processed.

```java
CompletableFuture<UpdateCardStatusResponse> cardUpdateStatusAsync(
    final String requestId,
    final UpdateCardStatusRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`UpdateCardStatusRequest`](../../doc/models/update-card-status-request.md) | Body, Optional | Update status request body |

## Response Type

[`UpdateCardStatusResponse`](../../doc/models/update-card-status-response.md)

## Example Usage

```java
String requestId = "RequestId8";
UpdateCardStatusRequest body = new UpdateCardStatusRequest.Builder(
    Arrays.asList(
        new UpdateCard.Builder()
            .caller("Motix")
            .isReplacementChargeable(true)
            .notifyCaller(true)
            .notifyCallerOnSync(false)
            .orderCardReplacement(true)
            .cardSettings(new ReplaceCardSettings.Builder(
                1
            )
            .selfSelectedEncryptedPIN("0hCx7wfFp3z8QkW8dElhHiMwCwC1")
            .selfSelectedPINKeyID("123aaa33198dc8f3s4k77dsc78")
            .selfSelectedPINSessionKey("WoWB+8UEd71+8QXwuE75flkAQ /4Q6gDFSn027oJ/0ne6LmzVIxJ87yoeqKS /C+OIBJ7bTvasLH+xvDSZtzoOZHr 7wfFmpfSyet8KnKjnagSicrUgpGk 7qFyOw3iA9/Qd6Oy9djYR3C3cDWEpj /YREZ1lBGReb9fqdSpoKx8mnGuPAw7")
            .validateFleetId(false)
            .cardGroupId(156)
            .deliveryContactTitle("Mr")
            .deliveryContactName("SAPE")
            .deliveryCompanyName("welcome")
            .deliveryAddressLine1("123/89")
            .deliveryAddressLine2("Mac Street")
            .deliveryAddressLine3("NLStrret")
            .deliveryZipCode("1213242")
            .deliveryCity("Chennai")
            .deliveryRegionId(54)
            .deliveryRegion("Mountain Province")
            .deliveryCountry("CZ")
            .phoneNumber("99999999999")
            .emailAddress("xxxxx@example.com")
            .pINDeliveryAddressType(1)
            .pINAdviceType(1)
            .pINDeliveryContactTitle("50388633F")
            .pINDeliveryContactName("WILTON")
            .pINDeliveryCompanyName("WILTON AUFDERHAR")
            .pINDeliveryAddressLine1("Herrn Dieter Whausen Lansstrab")
            .pINDeliveryAddressLine2("Wall street")
            .pINDeliveryAddressLine3("Wall Street")
            .pINDeliveryZipCode("12103")
            .pINDeliveryCity("Berlin")
            .pINDeliveryRegionId(1)
            .pINDeliveryRegion("Berlin-Brandenburg")
            .pINDeliveryCountry("DEU")
            .pINPhoneNumber("99999999999")
            .pINEmailAddress("xxxxx@example.com")
            .saveForPINReminder(false)
            .saveForCardReissue(false)
            .expiryDate("1221")
            .build())
            .accountId(1223)
            .accountNumber("CZ00000928")
            .cardExpiryDate("20221215")
            .cardId(385360)
            .colCoCode(32)
            .colCoId(32)
            .pAN("7077327290223410816")
            .payerId(1223)
            .payerNumber("CZ00000928")
            .build()
    ),
    "Unblock"
)
.reasonId(1236)
.reasonText("Unblock")
.build();

cardController.cardUpdateStatusAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "233e4567-e89b-12d3-a456-426614174000",
  "MainReference": 466543,
  "OrderReplacementReference": 466544,
  "Status": "SUCCESS",
  "Data": [
    {
      "ReplacementCardReference": 599649,
      "UpdateCardReference": 39270,
      "AccountId": 1227,
      "AccountNumber": "CZ00000927",
      "CardExpiryDate": "20240930",
      "CardId": 462083,
      "ColCoCode": 32,
      "ColCoId": 32,
      "PAN": "7077327290223421201",
      "PayerId": 1227,
      "PayerNumber": "CZ00000927"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Purchase Category

This API will allow querying the purchase categories of Card
for the given country and/or card type.
It will also include the below data associated with each of the purchase categories on it’s response.

* List of fuel and non-fuel product sets associated.
* List of products configured in each product set

```java
CompletableFuture<PurchaseCategoryResponse> purchaseCategoryAsync(
    final String apikey,
    final String requestId,
    final PurchaseCategoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `apikey` | `String` | Header, Required | This is the API key of the specific environment which needs to be passed by the client. |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`PurchaseCategoryRequest`](../../doc/models/purchase-category-request.md) | Body, Optional | PurchaseCategory request body |

## Response Type

[`PurchaseCategoryResponse`](../../doc/models/purchase-category-response.md)

## Example Usage

```java
String apikey = "apikey6";
String requestId = "RequestId8";
PurchaseCategoryRequest body = new PurchaseCategoryRequest.Builder()
    .colCoId(32)
    .languageCode("EN-GB")
    .build();

cardController.purchaseCategoryAsync(apikey, requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "PurchaseCategories": [
    {
      "Code": "0",
      "Id": 100,
      "IsVisible": false,
      "Name": "0 - Diesel Products and TMF",
      "Title": "0 - Diesel Products and TMF",
      "Description": "0 - Diesel Products and TMF",
      "ProductGroups": [
        {
          "IsDefault": false,
          "IsFuelType": true,
          "Name": "Other Fuels",
          "ProductGroupId": "P102",
          "Products": [
            {
              "Description": "Hydrogen",
              "GlobalProductCode": "019"
            },
            {
              "Description": "CNG",
              "GlobalProductCode": "029"
            },
            {
              "Description": "LPG",
              "GlobalProductCode": "034"
            }
          ],
          "ReferenceId": 100
        }
      ]
    }
  ],
  "Error": {
    "Code": "0000",
    "Description": "Success"
  },
  "RequestId": "47aca5b8-8186-49e5-b8d0-30f73fffd0f1"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request  due to something that is perceived to be a client<br>error (e.g., malformed request syntax, invalid<br>request message framing, or deceptive request routing). | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | The server understood the request but refuses to authorize it. | [`ErrorUserAccessError1Exception`](../../doc/models/error-user-access-error-1-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | The server encountered an unexpected condition the prevented it from fulfilling the request. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |


# Card Details

This API allows to fetch details of a single fuel card from the Shell Card Platform. If a **CardId** request parameter is provided, this will return a single card.  If a **PAN** request parameter is provided, this may result in multiple fuel cards matching the search criteria. The card details of the most recently issued card will be returned.

#### Supported operations

* Get card by card id or PAN

```java
CompletableFuture<CardDetailsResponse> cardDetailsAsync(
    final String apikey,
    final String requestId,
    final CardDetailsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `apikey` | `String` | Header, Required | This is the API key of the specific environment which needs to be passed by the client. |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CardDetailsRequest`](../../doc/models/card-details-request.md) | Body, Optional | Card details request body |

## Response Type

[`CardDetailsResponse`](../../doc/models/card-details-response.md)

## Example Usage

```java
String apikey = "apikey6";
String requestId = "RequestId8";
CardDetailsRequest body = new CardDetailsRequest.Builder()
    .colCoCode(86)
    .colCoId(1)
    .colCoCountryCode("PH")
    .clientReferenceId("adc-1671-ftwiQweh-67UJs")
    .payerNumber("PH50000843")
    .payerId(853)
    .accountNumber("PH50000844")
    .accountId(854)
    .pAN("7002861007636000020")
    .cardId(125)
    .tokenTypeID(107)
    .tokenTypeName("PH FLE NAT SIN R1")
    .creationDate("20181001")
    .effectiveDate("20181001")
    .includeBundleDetails(false)
    .includeIntermediateStatus(false)
    .includeScheduledCardBlocks(false)
    .build();

cardController.cardDetailsAsync(apikey, requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "PayerId": 853,
  "PayerNumber": "PH50000843",
  "AccountId": 854,
  "AccountNumber": "PH50000844",
  "AccountShortName": "PARKLEY",
  "ColCoCountryCode": "PH",
  "LocalCurrencyCode": "EUR",
  "LocalCurrencySymbol": "€",
  "CardId": 125,
  "PAN": "7002861007636000020",
  "StatusId": 1,
  "Status": "string",
  "OdometerPrompt": true,
  "FleetIdPrompt": true,
  "PINType": "Card",
  "HasPIN": true,
  "IsSelfSelectedPIN": true,
  "TemporaryBlockAllowed": true,
  "UnblockAllowed": true,
  "PermanentBlockAllowed": true,
  "IssueNumber": 1,
  "ReissueSetting": "True",
  "InternationalPOSLanguageID": 8,
  "InternationalPOSLanguageCode": "eng",
  "LocalPOSLanguageID": 8,
  "LocalPOSLanguageCode": "eng",
  "CardTypeCode": "7077861",
  "CardTypeId": 1,
  "CardTypeName": "Philippines CRT 7077861",
  "TokenTypeId": 107,
  "TokenTypeName": "PH FLE NAT SIN R1",
  "IsChipCard": false,
  "IsMagStripCard": true,
  "IsVirtualCard": true,
  "PurchaseCategoryCode": "6",
  "PurchaseCategoryId": 54,
  "PurchaseCategoryName": "2 - FuelSave and Lubricants",
  "IsCRT": true,
  "IsFleet": true,
  "IsInternational": true,
  "IsNational": true,
  "IsPartnerSitesIncluded": true,
  "IsShellSitesOnly": true,
  "FuelSets": [
    {
      "ProductRestrictionId": 120,
      "Description": "FS02: Diesel"
    }
  ],
  "NonFuelSets": [
    {
      "ProductRestrictionId": 120,
      "Description": "FS02: Diesel"
    }
  ],
  "IssuedDate": "20181001",
  "ExpiryDate": "20181031",
  "LastUsedDate": "20181001 13:23:55",
  "MisuseDate": "20181001 13:23:55",
  "Temperature": "10-Warm",
  "DriverName": "ROBERT",
  "VRN": "MV65YLH",
  "EmbossText": "PARKLEY",
  "CardGroupId": 5,
  "CardGroupName": "GROUP1",
  "RenewalDate": "20181001",
  "RenewedCardId": 1325,
  "RenewedCardStatusId": 10,
  "RenewedCardStatus": "New",
  "RenewedCardExpiryDate": "20181031",
  "RenewedCardIssueNumber": 2,
  "RenewedCardReissueSetting": "True",
  "CreationDate": "20181001",
  "EffectiveDate": "20181001",
  "LastModifiedDate": "20181001 13:23:55",
  "BundleId": null,
  "CardDeliveryAddress": {
    "ContactForeName": "ROBERT",
    "ContactMiddleName": "M",
    "ContactLastName": "Langdon",
    "ContactTitle": "Mr.",
    "CompanyName": "PARKLEY Philippines",
    "AddressId": 1768,
    "AddressLine1": "No 345, 1st cross,",
    "AddressLine2": "10th avenue",
    "AddressLine3": "makati city",
    "ZipCode": "1630",
    "City": "manila",
    "RegionId": null,
    "Region": "EU",
    "CountryId": 1,
    "CountryISOCode": "PH",
    "Country": "Philippines"
  },
  "PINDeliveryAddress": {
    "ContactForeName": "ROBERT",
    "ContactMiddleName": "M",
    "ContactLastName": "Langdon",
    "ContactTitle": "Mr.",
    "CompanyName": "PARKLEY Philippines",
    "AddressId": 1768,
    "AddressLine1": "No 345, 1st cross,",
    "AddressLine2": "10th avenue",
    "AddressLine3": "makati city",
    "ZipCode": "1630",
    "City": "manila",
    "RegionId": null,
    "Region": "EU",
    "CountryId": 1,
    "CountryISOCode": "PH",
    "Country": "Philippines"
  },
  "CardBlockSchedules": [
    {
      "FromDate": "20210212",
      "ToDate": "20210212"
    }
  ],
  "Error": {
    "Code": "0000",
    "Description": "Success"
  },
  "RequestId": "ed557f02-c7d7-4c01-b3e5-11bf3239c8ed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request  due to something that is perceived to be a client<br>error (e.g., malformed request syntax, invalid<br>request message framing, or deceptive request routing). | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | The server understood the request but refuses to authorize it. | [`ErrorUserAccessError1Exception`](../../doc/models/error-user-access-error-1-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | The server encountered an unexpected condition the prevented it from fulfilling the request. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |


# Card Move

This API allows to move one or more fuel cards (up to 500) across card groups within a single account or across accounts under the same payer. If the API call succeeds, the API will return a reference number and queue the request for asynchronous processing.

#### Supported operations

* Moving card to exisitng card group
* Moving card to new card group
* Removing a card from a card group

#### Validation rules

* Number of cards per request does not exceed 500
* Given **PAN** for a card matches with only one card
* A card is allowed to be moved to the **TargetCardGroupId** or **TargetAccountNumber**
* A pending move request does not exist in the queue for a card submitted on the same date (customers local)
* A card has not been moved as part of a previous request on the same date (customers local)

#### API response

* A main reference number for the API request (**MoveCardRequestReference**)
* Individual reference numbers (**MoveCardReference**) for each card move request that passes validation
* A list of cards (**ErrorCards**) that failed validation along with the appropriate error code and message

#### Asynchronous processing of valid API request

* Move card requests that have been submitted and processed will be reflected after midnight according to the customers local date

```java
CompletableFuture<CardMoveResponse> cardMoveAsync(
    final String apikey,
    final String requestId,
    final CardMoveRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `apikey` | `String` | Header, Required | This is the API key of the specific environment which needs to be passed by the client. |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CardMoveRequest`](../../doc/models/card-move-request.md) | Body, Optional | Move cards request body. |

## Response Type

[`CardMoveResponse`](../../doc/models/card-move-response.md)

## Example Usage

```java
String apikey = "apikey6";
String requestId = "RequestId8";
CardMoveRequest body = new CardMoveRequest.Builder()
    .colCoCode(86)
    .colCoId(1)
    .colCoCountryCode("PH")
    .payerNumber("PH50000843")
    .payerId(853)
    .cards(Arrays.asList(
        new CardMoveRequestCardsItems.Builder()
            .accountNumber("PH50000844")
            .accountId(854)
            .pAN("7002861007636000020")
            .cardId(125)
            .build()
    ))
    .targetAccountId(855)
    .targetAccountNumber("GB000000123")
    .targetCardGroupId(93)
    .targetNewCardGroupName("GROUP1")
    .build();

cardController.cardMoveAsync(apikey, requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "MoveCardRequestReference": 0,
  "SuccessfulRequests": [
    {
      "AccountNumber": "PH50000844",
      "AccountId": 854,
      "PAN": "7002861007636000020",
      "CardId": 125,
      "MoveCardReference": 9074
    }
  ],
  "ErrorCards": [
    {
      "AccountNumber": "PH50000844",
      "AccountId": 854,
      "PAN": "7002861007636000020",
      "CardId": 125,
      "ValidationErrorCode": "0000",
      "ValidationErrorDescription": "Invalid parameter value – [ParameterName]"
    }
  ],
  "RequestId": "ed557f02-c7d7-4c01-b3e5-11bf3239c8ed",
  "Error": {
    "Description": "Success",
    "Code": "0000"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request  due to something that is perceived to be a client<br>error (e.g., malformed request syntax, invalid<br>request message framing, or deceptive request routing). | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | The server understood the request but refuses to authorize it. | [`ErrorUserAccessError1Exception`](../../doc/models/error-user-access-error-1-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | The server encountered an unexpected condition the prevented it from fulfilling the request. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |


# Card Pin Reminder

This API allows requesting a PIN reminder for a fuel card. If the API call succeeds, the API will return a reference number and queue the request for asynchronous processing.

#### New version updates

* Oauth authentication to access the API
* Change in request body where PIN delivery type can be requested via Email, SMS or Post. PIN delivery contact can be set to different values based on previous contact details of card or pin delivery or can set specific contact details for this request.
  * PINAdviceType
  * PINContactType
  * PINDeliverTo
* Please note that we have a **savePINReminder** parameter in order to save the contact details for future such requests.
* Change in response body where Card details are also provided along with expiry date and PAN details.

#### Supported operations

* Request a pin reminder by card Id or PAN

#### Validation rules

* Given **PAN** or **CardId** is active
* Given **PAN** matches only one active card
* Requested card has PIN
* There is no pending PIN Reminder request in the queue awaiting to be processed for the card
* A PIN reminder request has not been successfully processed in the last 48 hours for the card

```java
CompletableFuture<PINReminderResponse> cardPinReminderAsync(
    final String requestId,
    final PINReminderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`PINReminderRequest`](../../doc/models/pin-reminder-request.md) | Body, Optional | PIN reminder request body |

## Response Type

[`PINReminderResponse`](../../doc/models/pin-reminder-response.md)

## Example Usage

```java
String requestId = "RequestId8";
PINReminderRequest body = new PINReminderRequest.Builder()
    .accountNumber("CZ00000927")
    .colCoCode(32)
    .payerNumber("CZ00000927")
    .pINReminderCardDetails(Arrays.asList(
        new PINReminderCardDetails.Builder(
            1
        )
        .cardId(463402)
        .pAN("7027329200000115820")
        .cardExpiryDate("20241031")
        .pINContactType(4)
        .pINDeliverTo(new PINDeliveryDetails.Builder(
                "CGI",
                "Address1",
                "938373",
                "City1"
            )
            .contactName("Alex")
            .contactTitle("Mr")
            .regionID(0)
            .countryID(0)
            .phoneNumber("9998883332")
            .emailAddress("abc.gmail.com")
            .savePINReminder(false)
            .build())
        .build()
    ))
    .build();

cardController.cardPinReminderAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "ba093ec6-a738-47d3-d25d-2f15a6d04fc6",
  "MainReference": 466588,
  "Status": "SUCCESS",
  "Data": [
    {
      "CardId": 463402,
      "PANID": null,
      "PAN": null,
      "CardExpiryDate": null,
      "ReferenceId": 2360
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Schedule Card Block

This API allows scheduling Card Block / Unblock requests for one or multiple cards (up to 500 (configurable)) within a single API call. This API is used to perform the following Actions:



* AddOrUpdate (Schedule a new request or update an existing     scheduled request for the overlapping period.
* AddAndOverwriteAll (all the existing requests of the given card will be removed and a new request with the specified FromDate and ToDate will be added.)
* Delete (Deletes the scheduled request for the same From and To date)
* DeleteAll (Deletes all the scheduled requests for the given card)

> Requests that passed the below validations are queue:

* All Mandatory fields are passed in the request.
* Card is present in the Shell Card Platform. Only one matching card is available in the cards platform for the given PAN and expiry date for the requests
* The scheduled period start date or end date should be later than or equal to the current date.

> If all validations are passed, the request will be accepted and saved in the intermediate queue  and the API will return reference numbers for tracking purpose.

> A background service will execute the block/unblock requests on a daily basis, based on the scheduled block or unblock date.

* The newly added block/unblock request will have a status ‘A’ when it is yet to be moved to the actual queue.

* When the request is moved to the actual queue table, the status will be updated as ‘P’ if the request has a value for ‘ToDate’, else, the status will be updated as ‘S’ or ‘F’ based on whether the request has been successfully moved to the actual queue table or if an error is encountered during processing.

* When the unblock request is moved to the actual queue table, the status of the request will be changed from ‘P’ to ‘S’ or ‘F’ based on whether the request has been successfully moved to the actual queue table or if an error has occurred during processing.

> If any of the validations fail, the API will return the appropriate error details in the response.
> The API response will include:

* An error entity holding the details of any error encountered.
* A list of submitted cards along with the individual reference numbers for each of the request.

```java
CompletableFuture<ScheduleCardBlockResponse> scheduleCardBlockAsync(
    final String requestId,
    final ScheduleCardBlockRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`ScheduleCardBlockRequest`](../../doc/models/schedule-card-block-request.md) | Body, Optional | request body |

## Response Type

[`ScheduleCardBlockResponse`](../../doc/models/schedule-card-block-response.md)

## Example Usage

```java
String requestId = "RequestId8";
ScheduleCardBlockRequest body = new ScheduleCardBlockRequest.Builder()
    .isTimeSupported(true)
    .scheduleCardBlockCards(Arrays.asList(
        new ScheduleCardBlockCardsItems.Builder(
            "AddOrUpdate"
        )
        .colCoCode(32)
        .colCoId(32)
        .accountId(928)
        .accountNumber("CZ00000928")
        .payerId(928)
        .payerNumber("CZ00000928")
        .cardId(234)
        .pAN("7077327290223418348")
        .cardExpiryDate("20240731")
        .fromDate("20230701 14:30")
        .toDate("20230731 16:30")
        .caller("NextGenUI")
        .notifyCaller(true)
        .build()
    ))
    .build();

cardController.scheduleCardBlockAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "MainReference": 4124828,
  "RequestId": "b471023f-b1e1-45df-8fe8-126291bd0c30",
  "Status": "SUCCESS",
  "Data": [
    {
      "CardId": 458951,
      "FromDate": "20230613 00:00",
      "ToDate": "20230614 00:00",
      "ReferenceId": 342
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Auto Renew

This API allows to update the reissue indicator of a single card. If the API call succeeds, the API will return a reference number for tracking purposes and queue the request for asynchronous processing.

#### Supported operations

* Update the reissue indicator of a card to enable auto renewal
* Update the reissue indicator of a card to disable auto renewal

#### Validation rules

* Card status must be either Active, Temporary Block (Customer), Temporary Block (Shell) or Pending Renewal, otherwise an error code 9016 is returned

#### API response

* Returns a reference number for the API request (**AutoRenewReference**)

#### Asynchronous processing of valid API request

* If the provided card is superseded i.e. a replacement/new card is already issued, then the latest card's reissue indicator should be updated in the Shell Card Platform.
* Providing a **PAN** request paramter may result in multiple fuel cards being located in the Shell Card Platform. The card details of the most recently issued card will be considered.

```java
CompletableFuture<AutoRenewCardResponse> autoRenewAsync(
    final String requestId,
    final AutoRenewCardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`AutoRenewCardRequest`](../../doc/models/auto-renew-card-request.md) | Body, Optional | Auto renew request body |

## Response Type

[`AutoRenewCardResponse`](../../doc/models/auto-renew-card-response.md)

## Example Usage

```java
String requestId = "RequestId8";
AutoRenewCardRequest body = new AutoRenewCardRequest.Builder()
    .colCoId(32)
    .colCoCode(32)
    .payerNumber("CZ00000928")
    .payerId(1227)
    .autoRenewCards(Arrays.asList(
        new AutoRenewCardRequestAutoRenewCardsItems.Builder(
            true
        )
        .accountNumber("CZ00000929")
        .accountId(1229)
        .pAN("7077327290223440243")
        .cardId(446472)
        .build()
    ))
    .build();

cardController.autoRenewAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "MainReference": 326712,
  "RequestId": "0e6fb42a-51b0-43b2-f010-92f822657f6a",
  "Status": "SUCCESS",
  "Data": [
    {
      "AutoRenewReferenceId": 226,
      "CardIdAndPAN": "446472;7077327290223440243"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Update Mobile Payment Registration Status

This operation allows  update the approval status of Mobile Payment Registration requests requiring for Fleet Manager approval.
If the approval status is:

* “Approved” then the request status will be changed to Pending for processing.
* “Rejected” then status will be updated to “CI” (Failed) with appropriate error message.

```java
CompletableFuture<UpdateMPayRegStatusResponse> updateMobilePaymentRegistrationStatusAsync(
    final String requestId,
    final UpdateMPayRegStatusRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`UpdateMPayRegStatusRequest`](../../doc/models/update-m-pay-reg-status-request.md) | Body, Optional | Request body |

## Response Type

[`UpdateMPayRegStatusResponse`](../../doc/models/update-m-pay-reg-status-response.md)

## Example Usage

```java
String requestId = "RequestId8";
UpdateMPayRegStatusRequest body = new UpdateMPayRegStatusRequest.Builder()
    .colCoId(32)
    .colCoCode(32)
    .payerId(1223)
    .payerNumber("CZ00000923")
    .mPayRequests(Arrays.asList(
        new UpdateMPayRegStatusRequestMPayRequestsItems.Builder()
            .globalRequestID("123")
            .status("Rejected")
            .approverUserID("AdminUser100")
            .approverUserDisplayName("AdminUser100")
            .reason("approved")
            .build()
    ))
    .build();

cardController.updateMobilePaymentRegistrationStatusAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "RequestId": "b471023f-b1e1-45df-8fe8-126291bd0c30",
  "Status": "SUCCESS"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 403 | Forbidden | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`ErrorObjectException`](../../doc/models/error-object-exception.md) |


# Get Key

Get a new public key that will be used to encrypt data for selected PIN process when ordering new Shell Card. This encrypted data is used for further processing.

```java
CompletableFuture<GeneratePINKeyResponse> getKeyAsync(
    final String requestId,
    final Boolean fleet)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `fleet` | `Boolean` | Query, Optional | If the public key will be used a long time for multiple files this parameter will be true. If the parameter is true then public Key will be valid for 90 days. If the parameter is false then the key will be valid for one time. default value will be false. |

## Response Type

[`GeneratePINKeyResponse`](../../doc/models/generate-pin-key-response.md)

## Example Usage

```java
String requestId = "RequestId8";

cardController.getKeyAsync(requestId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "uid": "123aaa33198dc8f3s4k77dsc78",
  "value": "LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUlJQ0lqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FnOEFNSUlDQ2dLQ0FnRUFvZ0dSQ3k4N1FjQ3d6MFI0NE9LTwpucEhhZ0p1bW83Wll1V21JdXY2b1ZseUxqYkcwWlgyUFBSUy9LVUdhbXdiWGQwMGtYeHBXbFA5cXJ2N2hYMlNSCkJ2TFJVWFR0TCtvWS9QajN0c2Z6d0liT3VDei9qUnQ5Uk9WdzNBTkZTNjF6blVFTkVsSlNXN2dudnJuL29USWwKRWlid2VVTE5aTlJObFRwQTI1QVhKanhXMzM3ZUx0Y2F5cXJiQlNJNVFmRitCTGJJbE1Rd2tqSkNhUFEzV0pUKwpxcnlCREFCME5ocm02VlBmK2toN2FyR2JqL3ZLS0NRWVBkQWhRKzI3OGp0ZGJZdFBzYWtjN0RqVXpTenl2Wm9HCmhiSEt4V0ZTODFnL2ZlQUZNbFFDVlErZk15ZVN5dFZKOGlmZjFZR2RydEJCdG16U0NRN2V0K1IwaHpUbzJXblcKZzREZG1oWmlZT0MvUU55dk5uY1VSeDRZMU84VW1nSmorNE56c3VyQ2dQMmRSUjNpVXRIYlZaZjRzTEpZWk5CWApORGxjUDNzYWlwTXJ6Z0RpM0VCbWZzdEJOODdvWVdsRzRQNmlPVGt3dzdDVyt0TUdRNmJPcVBBNFF0cWMrYUZMCktZR3FWREhWRnBhZWdwYXl0U2g3T25nd0cwckJod0M4ODNpeVFaZDNKRW1lSWt2V05wYTVRSExqRmJKTEg4M2YKdk9TR2E0aGR6ZmZqYUhUM2VvR2VCRU5NaTZIbFo4RVZHWUh0VUpXZGMzZ2h5OHdPbmZkTlN2NzV3SUZYbHNragpIdHM3Z3NkM3hDN1B3ZnBqOEV5Lyt2aTVLNHM5M29IaE5TYlRhNlUzNUVsZkFXL20zK1YxWjZqVUpwRWpmZkZYCnI0YlFiR3pQNVhWYkNKL21ndmVNM3lNQ0F3RUFBUT09Ci0tLS0tRU5EIFBVQkxJQyBLRVktLS0tLQo="
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request  due to something that is perceived to be a client<br>error (e.g., malformed request syntax, invalid<br>request message framing, or deceptive request routing). | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | The server understood the request but refuses to authorize it. | [`ErrorUserAccessError1Exception`](../../doc/models/error-user-access-error-1-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | The server encountered an unexpected condition the prevented it from fulfilling the request. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |


# Delivery Address Update

This API allows users to update the card’s delivery addresses (card delivery address used for card re-issue and PIN delivery address used when PIN reminder is requested)

#### Supported operations

* card delivery address update

```java
CompletableFuture<DeliveryAddressUpdateResponse> deliveryAddressUpdateAsync(
    final String apikey,
    final DeliveryAddressUpdateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `apikey` | `String` | Header, Required | This is the API key of the specific environment which needs to be passed by the client. |
| `body` | [`DeliveryAddressUpdateRequest`](../../doc/models/delivery-address-update-request.md) | Body, Optional | Delivery Address Update Request Body |

## Response Type

[`DeliveryAddressUpdateResponse`](../../doc/models/delivery-address-update-response.md)

## Example Usage

```java
String apikey = "apikey6";
DeliveryAddressUpdateRequest body = new DeliveryAddressUpdateRequest.Builder()
    .colCoId(5)
    .colCoCode(5)
    .payerId(123456)
    .payerNumber("GB000000123")
    .accountId(12356)
    .accountNumber("GB000000124")
    .build();

cardController.deliveryAddressUpdateAsync(apikey, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request  due to something that is perceived to be a client<br>error (e.g., malformed request syntax, invalid<br>request message framing, or deceptive request routing). | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | The server understood the request but refuses to authorize it. | [`ErrorUserAccessError1Exception`](../../doc/models/error-user-access-error-1-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | The server encountered an unexpected condition the prevented it from fulfilling the request. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |

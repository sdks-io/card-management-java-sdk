
# Order Card Enquiry

This entity models the data that is sent in the https

## Structure

`OrderCardEnquiry`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account ID on the card request | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | AccountNumber | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `BCOReference` | `Integer` | Optional | Bulk card order request refrence numer.<br /><br>This field will be null if the order is not through BCO. | Integer getBCOReference() | setBCOReference(Integer bCOReference) |
| `BCORowNumber` | `Integer` | Optional | Row number of the request in the BCO file.<br /><br>This field will be null if the order is not through BCO. | Integer getBCORowNumber() | setBCORowNumber(Integer bCORowNumber) |
| `CardGroupId` | `Integer` | Optional | Card group ID | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card group name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `CardId` | `Integer` | Optional | Unique Card Id.<br /><br>The field will be null if the card order request is not successly processed. | Integer getCardId() | setCardId(Integer cardId) |
| `CardPAN` | `String` | Optional | Card PAN.<br /><br>Mask PAN (Mask all digits except the Last 6 digits of the PAN).<br /><br>The field will be null if the card order request is not successly processed. | String getCardPAN() | setCardPAN(String cardPAN) |
| `CardTypeCode` | `String` | Optional | CardTypeCode<br /><br>ISO code of the card i.e. first 7 digits of the PAN | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeId` | `Integer` | Optional | CardTypeId | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | CardTypeName | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `DriverName` | `String` | Optional | Driver name | String getDriverName() | setDriverName(String driverName) |
| `ErrorCode` | `String` | Optional | Error code for the order card request.<br /><br>The value will be 0000 if it is processed without errors. | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorDescription` | `String` | Optional | Error description for the order card request.<br /><br>The value will be empty string if it is processed without errors. | String getErrorDescription() | setErrorDescription(String errorDescription) |
| `GatewaySyncErrorCode` | `String` | Optional | Error code for the Gateway sync error.<br /><br>The value will be 0000 if it is processed without errors. | String getGatewaySyncErrorCode() | setGatewaySyncErrorCode(String gatewaySyncErrorCode) |
| `GatewaySyncErrorDescription` | `String` | Optional | Error description for the Gateway sync error.<br /><br>The value will be empty string if it is processed without errors. | String getGatewaySyncErrorDescription() | setGatewaySyncErrorDescription(String gatewaySyncErrorDescription) |
| `GatewaySyncStatus` | `String` | Optional | GatewaySyncStatus<br /><br>Status of the card sync with CFGW.<br /><br>Possible values:<br /><br>-Success<br /><br>-Failed<br /><br>-In Progress<br /><br>-Not Submitted | String getGatewaySyncStatus() | setGatewaySyncStatus(String gatewaySyncStatus) |
| `MainReference` | `Integer` | Optional | Main reference number for the order card request.<br /><br>This field will be null if the order is through BCO. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `OrderCardReference` | `Integer` | Optional | Indivitual card reference number for the order card request.<br /><br>This field will be null if the order is through BCO. | Integer getOrderCardReference() | setOrderCardReference(Integer orderCardReference) |
| `OrderStatus` | `String` | Optional | Order status.<br /><br>Possible values:<br /><br>P   Pending<br /><br>I   Picked up for processing<br /><br>PX	Failed at Queue but retry attempts pending<br /><br>X	Failed  at Queue<br /><br>R	Card is processed, awaiting for PAN update.<br /><br>S	Processed<br /><br>F	Failed | String getOrderStatus() | setOrderStatus(String orderStatus) |
| `PayerId` | `Integer` | Optional | Payer ID on the card request. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number on the card request | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `ProcessedDate` | `String` | Optional | Date and time (in cutomers local time) when the card order request is processed<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: The client application to convert the string to appropriate date/time type. | String getProcessedDate() | setProcessedDate(String processedDate) |
| `PurchaseCategoryCode` | `String` | Optional | PurchaseCategoryCode | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `PurchaseCategoryId` | `Integer` | Optional | PurchaseCategoryId <br /><br>Note: Not Purchase code. This is a unique purchase category id assigned | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `PurchaseCategoryName` | `String` | Optional | PurchaseCategoryName | String getPurchaseCategoryName() | setPurchaseCategoryName(String purchaseCategoryName) |
| `SubmittedDate` | `String` | Optional | Date and time (in cutomers local time) when the card order request is submitted.<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: The client application to convert the string to appropriate date/time type. | String getSubmittedDate() | setSubmittedDate(String submittedDate) |
| `SyncProcessedDate` | `String` | Optional | SyncProcessedDate<br /><br>Date and time (in cutomers local time) when the sync card request is processed.<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: The client application to convert the string to appropriate date/time type. | String getSyncProcessedDate() | setSyncProcessedDate(String syncProcessedDate) |
| `SyncRequestedDate` | `String` | Optional | SyncRequestedDate<br /><br>Date and time (in cutomers local time) when the sync card request is submitted.<br /><br>Format: yyyyMMdd HH:mm:ss <br /><br>Note: The client application to convert the string to appropriate date/time type. | String getSyncRequestedDate() | setSyncRequestedDate(String syncRequestedDate) |
| `VRN` | `String` | Optional | Vehicle registration number | String getVRN() | setVRN(String vRN) |
| `OrderRequestId` | `String` | Optional | Unique Id of the Original Order card request, the status of which is enquired by this API. <br /><br>This is returned for end to end traceability of a request based on the original Order Card request. | String getOrderRequestId() | setOrderRequestId(String orderRequestId) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card.<br /><br>Format: MMyy<br /><br>(Clients to convert this to appropriate DateTime type.)<br /><br>Note: This is the Expiry Date saved.<br /><br>If the Order Card request is still not processed, i.e.PAN is not yet issued, this field will be null or empty. <br /><br>For a Card Order with a custom Expiry Date passed in the request, this value will be returned after it is updated successfully. | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `ClientReferenceId` | `String` | Optional | This is the Client Reference Id of card in the order which needs to be passed by the client. | String getClientReferenceId() | setClientReferenceId(String clientReferenceId) |
| `StatusDescription` | `String` | Optional | Order status.<br /><br>Possible values<br /><br>Success<br /><br>Failed<br /><br>InProgress<br /> | String getStatusDescription() | setStatusDescription(String statusDescription) |
| `ColCoId` | `Integer` | Optional | Colcoid | Integer getColCoId() | setColCoId(Integer colCoId) |

## Example (as JSON)

```json
{
  "AccountId": 206,
  "AccountNumber": "AccountNumber0",
  "BCOReference": 154,
  "BCORowNumber": 80,
  "CardGroupId": 252
}
```


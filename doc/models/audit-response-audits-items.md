
# Audit Response Audits Items

## Structure

`AuditResponseAuditsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account id of the customer.<br>It will be the source account id in case of “Fund Transfer | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account number of the customer.<br>It will be the source account number in case of “Fund Transfer” | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AdditionalInformation1` | `String` | Optional | Additional information in the request. | String getAdditionalInformation1() | setAdditionalInformation1(String additionalInformation1) |
| `AdditionalInformation2` | `String` | Optional | Additional information in the request. | String getAdditionalInformation2() | setAdditionalInformation2(String additionalInformation2) |
| `AdditionalInformation3` | `String` | Optional | Additional information in the request. | String getAdditionalInformation3() | setAdditionalInformation3(String additionalInformation3) |
| `AdditionalInformation4` | `String` | Optional | Additional information in the request. | String getAdditionalInformation4() | setAdditionalInformation4(String additionalInformation4) |
| `AdditionalInformation5` | `String` | Optional | Additional information in the request. | String getAdditionalInformation5() | setAdditionalInformation5(String additionalInformation5) |
| `AdditionalInformation6` | `String` | Optional | Additional information in the request. | String getAdditionalInformation6() | setAdditionalInformation6(String additionalInformation6) |
| `AdditionalInformation7` | `String` | Optional | Additional information in the request. | String getAdditionalInformation7() | setAdditionalInformation7(String additionalInformation7) |
| `AdditionalInformation8` | `String` | Optional | Additional information in the request. | String getAdditionalInformation8() | setAdditionalInformation8(String additionalInformation8) |
| `AdditionalInformation9` | `String` | Optional | Additional information in the request. | String getAdditionalInformation9() | setAdditionalInformation9(String additionalInformation9) |
| `CardGroupId` | `Integer` | Optional | Additional information in the request. | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card group name in the request. | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `CardId` | `Integer` | Optional | Card Id in the request | Integer getCardId() | setCardId(Integer cardId) |
| `ColCoCode` | `Integer` | Optional | Collecting company code of the customer | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting company id of the customer. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ErrorCode` | `String` | Optional | Error code of the request | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorString` | `String` | Optional | Error description of the request | String getErrorString() | setErrorString(String errorString) |
| `GlobalRequestID` | `String` | Optional | Global unique request reference provided by client application. | String getGlobalRequestID() | setGlobalRequestID(String globalRequestID) |
| `PAN` | `String` | Optional | PAN in the request.<br>If Mask PAN is enabled at Microservices configuration then all digits of the PAN, except the last 6 digits, will be masked. | String getPAN() | setPAN(String pAN) |
| `PayerId` | `Integer` | Optional | Payer id of the customer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer number of the customer. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `ProcessedOn` | `String` | Optional | Request processed date.<br>Format: yyyyMMdd HH:mm: ss | String getProcessedOn() | setProcessedOn(String processedOn) |
| `RequestedBy` | `String` | Optional | vUUID of the user who submitted this request.<br>It will be the UUID of the Driver in the case of “MobilePaymentRegistration” | String getRequestedBy() | setRequestedBy(String requestedBy) |
| `RequestedOperation` | `String` | Optional | User requested operation.<br>Possible values:<br>•	OrderCard<br>•	CreateCardGroup<br>•	PINReminder<br>•	MoveCard<br>•	UpdateCardStatus<br>•	UpdateCardGroup<br>•	AutoRenew<br>•	BulkCardOrder<br>•	BulkCardBlock<br>•	BulkCardOrderMultiAccount<br>•	MobilePaymentRegistration<br>•	UpdateCompanyInfo<br>•	BCOSummary<br>•	BCOMultiAccountSummary<br>•	BCBSummary<br>•	FundTransfer<br>•	DeliveryAddressUpdate | String getRequestedOperation() | setRequestedOperation(String requestedOperation) |
| `RequestReference` | `Integer` | Optional | Reference number for the requested operation. | Integer getRequestReference() | setRequestReference(Integer requestReference) |
| `RequestType` | `String` | Optional | Request type initiated under the requested operation.<br>Possible values:<br>•	OrderCard<br>•	CreateCardGroup<br>•	PINReminder<br>•	MoveCard<br>•	UpdateCardStatus<br>•	UpdateCardGroup<br>•	AutoRenew<br>•	BulkCardOrder<br>•	BulkCardBlock<br>•	BulkCardOrderMultiAccount<br>•	MobilePaymentRegistration<br>•	UpdateCompanyInfo<br>•	BCOSummary<br>•	BCOMultiAccountSummary<br>•	BCBSummary<br>•	FundTransfer<br>•	DeliveryAddressUpdate | String getRequestType() | setRequestType(String requestType) |
| `Status` | `String` | Optional | Status of the request.<br>Possible values:<br>•	Success<br>•	Failed<br>•	InProgress<br>•	Submitted<br>•	Rejected<br>•	PendingApproval<br>•	MailedToCSC | String getStatus() | setStatus(String status) |
| `SubmittedOn` | `String` | Optional | Request submitted date.<br>Format: yyyyMMdd HH:mm: ss | String getSubmittedOn() | setSubmittedOn(String submittedOn) |
| `SubRequestReference` | `Integer` | Optional | Reference number for the individual request type. | Integer getSubRequestReference() | setSubRequestReference(Integer subRequestReference) |
| `UserDisplayName` | `String` | Optional | Display name of the user who submitted this request.<br>It will be the Display Name of the Driver in the case of “MobilePaymentRegistration” in the below format: | String getUserDisplayName() | setUserDisplayName(String userDisplayName) |

## Example (as JSON)

```json
{
  "AccountId": 123,
  "AccountNumber": "BE00000113",
  "AdditionalInformation1": "922",
  "AdditionalInformation2": "2016",
  "AdditionalInformation3": "MERCEDES GLE KLASSE SEGM. L",
  "AdditionalInformation4": "408135/3",
  "AdditionalInformation5": "API TEST CUSTOMER 113",
  "AdditionalInformation6": "408135/3",
  "AdditionalInformation7": "null",
  "AdditionalInformation8": "null",
  "AdditionalInformation9": "null",
  "CardGroupId": 123,
  "CardGroupName": "test",
  "CardId": 10594,
  "ColCoCode": 9,
  "ColCoId": 9,
  "ErrorCode": "0000",
  "ErrorString": "null",
  "GlobalRequestID": "6f1473ea-7f68-4ccb-acee-4b5b997aad5a",
  "PAN": "7002097550439850717",
  "PayerId": 123,
  "PayerNumber": "BE00000113",
  "ProcessedOn": "20240201 14:30:26",
  "RequestedBy": "EWyIv8LpjgW3LlKDDUo0VZMN6JKpqRc",
  "RequestedOperation": "OrderCard",
  "RequestReference": 519876,
  "RequestType": "OrderCard",
  "Status": "Success",
  "SubmittedOn": "20240201 14:29:16",
  "SubRequestReference": 720061,
  "UserDisplayName": "Supriya-ThridPartyAgent"
}
```


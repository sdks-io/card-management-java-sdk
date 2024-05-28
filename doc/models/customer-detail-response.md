
# Customer Detail Response

## Structure

`CustomerDetailResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the selected account. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountName` | `String` | Optional | Account Name of the selected account. | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | Account Number of the selected account. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Short name of the customer. | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `AccountTradingName` | `String` | Optional | Trading name of the customer | String getAccountTradingName() | setAccountTradingName(String accountTradingName) |
| `AllowFleetIdInput` | `Boolean` | Optional | True/False.<br>When false, users should not be allowed to enable Fleet Id prompt option while ordering cards under this account. | Boolean getAllowFleetIdInput() | setAllowFleetIdInput(Boolean allowFleetIdInput) |
| `Band` | `String` | Optional | Band Id and Description of the Payer in Card Platform<br>e.g. (Id – Description):<br>1-Platinum<br>2-Gold<br>3-Silver<br>4-Bronze | String getBand() | setBand(String band) |
| `BillingAddress` | [`Address`](../../doc/models/address.md) | Optional | - | Address getBillingAddress() | setBillingAddress(Address billingAddress) |
| `CardGroupPosition` | `String` | Optional | Card group position at –<br>•	Payer – Payer level<br>•	Account – Account level | String getCardGroupPosition() | setCardGroupPosition(String cardGroupPosition) |
| `CorrespondenceAddress` | [`Address`](../../doc/models/address.md) | Optional | - | Address getCorrespondenceAddress() | setCorrespondenceAddress(Address correspondenceAddress) |
| `DeliveryAddresses` | [`List<DeliveryAddresses>`](../../doc/models/delivery-addresses.md) | Optional | - | List<DeliveryAddresses> getDeliveryAddresses() | setDeliveryAddresses(List<DeliveryAddresses> deliveryAddresses) |
| `FleetPin` | `Boolean` | Optional | Is Fleet Pin optional enabled for the selected account | Boolean getFleetPin() | setFleetPin(Boolean fleetPin) |
| `FullName` | `String` | Optional | Full Name of the customer | String getFullName() | setFullName(String fullName) |
| `InvoiceCustomerId` | `Integer` | Optional | Customer Id of the Invoice Point of the account | Integer getInvoiceCustomerId() | setInvoiceCustomerId(Integer invoiceCustomerId) |
| `InvoiceCustomerShortName` | `String` | Optional | Short Name of the Invoice Point of the account | String getInvoiceCustomerShortName() | setInvoiceCustomerShortName(String invoiceCustomerShortName) |
| `IsInvoicePoint` | `Boolean` | Optional | Whether the account is an invoice point. | Boolean getIsInvoicePoint() | setIsInvoicePoint(Boolean isInvoicePoint) |
| `MarketingSegmentation` | `String` | Optional | Marketing Segmentation id and description<br>e.g. (Id – Description):<br>1-National CRT<br>2-International CRT & IKAs<br>3-Small Customers<br>4-National/International Fleet/IKA | String getMarketingSegmentation() | setMarketingSegmentation(String marketingSegmentation) |
| `VATNumber` | `String` | Optional | VAT Registration Number of Customer | String getVATNumber() | setVATNumber(String vATNumber) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected account. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerName` | `String` | Optional | Payer Name of the selected account. | String getPayerName() | setPayerName(String payerName) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected account. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `SelfSelectedPin` | `Boolean` | Optional | Is Self-selected Pin enabled for the account | Boolean getSelfSelectedPin() | setSelfSelectedPin(Boolean selfSelectedPin) |
| `Status` | `String` | Optional | Payer current status id and description<br>e.g. (Id – Description):<br>1-Active<br>2-Requested from UTA<br>3-Awaiting embossing<br>4-Manufactured<br>5-Awaiting despatch | String getStatus() | setStatus(String status) |
| `DefaultPINAdviceType` | `Integer` | Optional | Default PIN AdviceType of the customer.<br>Possible Values:<br><br>1. Paper<br>2. Email<br>3. SMS<br>4. None | Integer getDefaultPINAdviceType() | setDefaultPINAdviceType(Integer defaultPINAdviceType) |
| `PINAdviceTypes` | [`List<PINAdviceTypes>`](../../doc/models/pin-advice-types.md) | Optional | - | List<PINAdviceTypes> getPINAdviceTypes() | setPINAdviceTypes(List<PINAdviceTypes> pINAdviceTypes) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request id | String getRequestId() | setRequestId(String requestId) |
| `PINChangeAllowedByCardholder` | `Boolean` | Optional | PIN change allowed for card holder or not. | Boolean getPINChangeAllowedByCardholder() | setPINChangeAllowedByCardholder(Boolean pINChangeAllowedByCardholder) |
| `PINChangeAllowedFromFleetPIN` | `Boolean` | Optional | PIN change allowed from fleetpin or not. | Boolean getPINChangeAllowedFromFleetPIN() | setPINChangeAllowedFromFleetPIN(Boolean pINChangeAllowedFromFleetPIN) |

## Example (as JSON)

```json
{
  "AccountId": 1227,
  "AccountName": "5.11.3 DE",
  "AccountNumber": "DE00001067",
  "AccountShortName": "5.11.3 DE",
  "AccountTradingName": "5.11.3 DE",
  "Band": "2 - Gold",
  "FullName": "5.11.3 DE",
  "InvoiceCustomerId": 1227,
  "InvoiceCustomerShortName": "5.11.3 DE",
  "MarketingSegmentation": "4 - National/International Fleet/IKA",
  "VATNumber": "PH6578900900",
  "PayerId": 1227,
  "PayerName": "5.11.3 DE",
  "PayerNumber": "DE00001067",
  "Status": "1 - Active",
  "DefaultPINAdviceType": 1,
  "RequestId": "908358e3-03ca-4aef-93b2-37586b859171"
}
```


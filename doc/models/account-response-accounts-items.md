
# Account Response Accounts Items

## Structure

`AccountResponseAccountsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountFullName` | `String` | Optional | Account Full Name | String getAccountFullName() | setAccountFullName(String accountFullName) |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `BestOfIndicator` | `Boolean` | Optional | Best of Indicator of the Pricing customer/account configured. | Boolean getBestOfIndicator() | setBestOfIndicator(Boolean bestOfIndicator) |
| `BillingFrequencyType` | `String` | Optional | Billing/Invoice frequency. The frequency in which the transactions will be considered for invoicing in a bulling run<br>E.g.:<br>1	Daily (all days)<br>2	Daily (only working days)<br>3	Weekly - Monday<br>4	Weekly – Tuesday<br>Etc. | String getBillingFrequencyType() | setBillingFrequencyType(String billingFrequencyType) |
| `BillingFrequencyTypeId` | `Integer` | Optional | Billing/Invoice frequency Identifier. Indicates the frequency in which the transactions will be considered for invoicing in a bulling run | Integer getBillingFrequencyTypeId() | setBillingFrequencyTypeId(Integer billingFrequencyTypeId) |
| `BillingRunFrequency` | `String` | Optional | Frequency at which the billing process is triggered. E.g.:<br>1	Daily (all days)<br>2	Daily (only working days)<br>3	Weekly - Monday<br>4	Weekly – Tuesday<br>Etc. | String getBillingRunFrequency() | setBillingRunFrequency(String billingRunFrequency) |
| `BillingRunFrequencyTypeId` | `Integer` | Optional | Frequency at which the billing process is triggered.<br>E.g.: 1, 2, 3, etc. | Integer getBillingRunFrequencyTypeId() | setBillingRunFrequencyTypeId(Integer billingRunFrequencyTypeId) |
| `ColCoCountryCode` | `String` | Optional | The 2-character ISO Code for the customer and card owning country. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `CurrencyCode` | `String` | Optional | ISO code of customer currency. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | € | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Day1Run` | `Integer` | Optional | The first day in a month when the billing should run in case of multiple billing runs configured with in a single month | Integer getDay1Run() | setDay1Run(Integer day1Run) |
| `Day2Run` | `Integer` | Optional | The second day in a month when the billing should run in case of multiple billing runs configured with in a single month | Integer getDay2Run() | setDay2Run(Integer day2Run) |
| `Day3Run` | `Integer` | Optional | The third day in a month when the billing should run in case of multiple billing runs configured with in a single month | Integer getDay3Run() | setDay3Run(Integer day3Run) |
| `Day4Run` | `Integer` | Optional | The fourth day in a month when the billing should run in case of multiple billing runs configured with in a single month | Integer getDay4Run() | setDay4Run(Integer day4Run) |
| `FrequencyType` | `String` | Optional | Frequency type unit id & description<br>E.g.:<br>1 - Daily<br>2 - Weekly<br>3 - Monthly<br>4 - Invoicing<br>6 - Calendar quarter | String getFrequencyType() | setFrequencyType(String frequencyType) |
| `GrossAmount` | `Double` | Optional | Gross amount in customer currency. | Double getGrossAmount() | setGrossAmount(Double grossAmount) |
| `InternationalPOSLanguageCode` | `String` | Optional | POS international language code | String getInternationalPOSLanguageCode() | setInternationalPOSLanguageCode(String internationalPOSLanguageCode) |
| `InternationalPOSLanguageID` | `Integer` | Optional | POS international language ID | Integer getInternationalPOSLanguageID() | setInternationalPOSLanguageID(Integer internationalPOSLanguageID) |
| `InvoiceAccountID` | `Integer` | Optional | The Account ID of the account on which the invoice is generated. | Integer getInvoiceAccountID() | setInvoiceAccountID(Integer invoiceAccountID) |
| `InvoiceAccountNumber` | `String` | Optional | The Account Number of the account on which the invoice is generated. | String getInvoiceAccountNumber() | setInvoiceAccountNumber(String invoiceAccountNumber) |
| `InvoiceAccountShortName` | `String` | Optional | The Account Short Name of the account on which the invoice is generated. | String getInvoiceAccountShortName() | setInvoiceAccountShortName(String invoiceAccountShortName) |
| `InvoiceDistributionMethods` | [`List<InvoiceDistributionMethod>`](../../doc/models/invoice-distribution-method.md) | Optional | - | List<InvoiceDistributionMethod> getInvoiceDistributionMethods() | setInvoiceDistributionMethods(List<InvoiceDistributionMethod> invoiceDistributionMethods) |
| `IsInternational` | `Boolean` | Optional | Whether the account is international. | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsInvoicePoint` | `Boolean` | Optional | Whether the account is an invoice point. | Boolean getIsInvoicePoint() | setIsInvoicePoint(Boolean isInvoicePoint) |
| `LastModifiedDate` | `String` | Optional | Account last modified date and time | String getLastModifiedDate() | setLastModifiedDate(String lastModifiedDate) |
| `LocalCurrencyCode` | `String` | Optional | ISO code of customer currency. | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Customer currency symbol. | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `LocalPOSLanguageCode` | `String` | Optional | POS local language code | String getLocalPOSLanguageCode() | setLocalPOSLanguageCode(String localPOSLanguageCode) |
| `LocalPOSLanguageID` | `Integer` | Optional | POS local language ID | Integer getLocalPOSLanguageID() | setLocalPOSLanguageID(Integer localPOSLanguageID) |
| `NetAmount` | `Double` | Optional | Net amount in customer currency. | Double getNetAmount() | setNetAmount(Double netAmount) |
| `OutstandingBalance` | `Double` | Optional | Outstanding balance in customer currency. | Double getOutstandingBalance() | setOutstandingBalance(Double outstandingBalance) |
| `PaidAmount` | `Double` | Optional | Amount paid in customer currency. | Double getPaidAmount() | setPaidAmount(Double paidAmount) |
| `Status` | `String` | Optional | Account Status | String getStatus() | setStatus(String status) |
| `StatusReason` | `String` | Optional | Account status change reason id-description for the Status Reason, if any | String getStatusReason() | setStatusReason(String statusReason) |
| `TotalActiveCardGroups` | `Integer` | Optional | Total number of active card groups under the account | Integer getTotalActiveCardGroups() | setTotalActiveCardGroups(Integer totalActiveCardGroups) |
| `TotalActiveCards` | `Integer` | Optional | Total number of active cards under the account. | Integer getTotalActiveCards() | setTotalActiveCards(Integer totalActiveCards) |
| `TotalBlockedCards` | `Integer` | Optional | Total number of cards under the account that are permanently blocked | Integer getTotalBlockedCards() | setTotalBlockedCards(Integer totalBlockedCards) |
| `TotalCancelledCards` | `Integer` | Optional | Total number of cards under the account that are cancelled | Integer getTotalCancelledCards() | setTotalCancelledCards(Integer totalCancelledCards) |
| `TotalCards` | `Integer` | Optional | Total number of cards under the account. | Integer getTotalCards() | setTotalCards(Integer totalCards) |
| `TotalExpiredCards` | `Integer` | Optional | Total number of expired cards under the account. | Integer getTotalExpiredCards() | setTotalExpiredCards(Integer totalExpiredCards) |
| `TotalFraudCards` | `Integer` | Optional | Total number of cards in Fraud status. | Integer getTotalFraudCards() | setTotalFraudCards(Integer totalFraudCards) |
| `TotalNewCards` | `Integer` | Optional | Total number of cards in “New” status. | Integer getTotalNewCards() | setTotalNewCards(Integer totalNewCards) |
| `TotalRenewalPendingCards` | `Integer` | Optional | Total number of Renewal Pending account under the payer | Integer getTotalRenewalPendingCards() | setTotalRenewalPendingCards(Integer totalRenewalPendingCards) |
| `TotalReplacedCards` | `Integer` | Optional | Total number of cards under the account with status as “Replaced” | Integer getTotalReplacedCards() | setTotalReplacedCards(Integer totalReplacedCards) |
| `TotalTemporaryBlockCardsByCustomer` | `Integer` | Optional | Total number of cards under the account that are temporarily blocked by customer. | Integer getTotalTemporaryBlockCardsByCustomer() | setTotalTemporaryBlockCardsByCustomer(Integer totalTemporaryBlockCardsByCustomer) |
| `TotalTemporaryBlockCardsByShell` | `Integer` | Optional | Total number of cards under the account that are temporarily blocked by Shell. | Integer getTotalTemporaryBlockCardsByShell() | setTotalTemporaryBlockCardsByShell(Integer totalTemporaryBlockCardsByShell) |
| `VATAmount` | `Double` | Optional | VAT amount in customer currency. | Double getVATAmount() | setVATAmount(Double vATAmount) |
| `IsPartnerCard` | `Integer` | Optional | The account / sub-account is partner card account or not.<br>Possible values (1= Non-PC account, 2= PC account, 3= PC Payer with Card Types, 4= PC Payer)<br>Note: A partner card account is assumed to have only partner card card-types associated | Integer getIsPartnerCard() | setIsPartnerCard(Integer isPartnerCard) |
| `TollsCustomerId` | `String` | Optional | Customer id in e-TM system | String getTollsCustomerId() | setTollsCustomerId(String tollsCustomerId) |
| `TollsColcoCountryTypeId` | `String` | Optional | Colco country type id in e-TM system | String getTollsColcoCountryTypeId() | setTollsColcoCountryTypeId(String tollsColcoCountryTypeId) |
| `Contracts` | [`List<CustomerContract>`](../../doc/models/customer-contract.md) | Optional | - | List<CustomerContract> getContracts() | setContracts(List<CustomerContract> contracts) |
| `IsConsortiumMember` | `String` | Optional | true | String getIsConsortiumMember() | setIsConsortiumMember(String isConsortiumMember) |

## Example (as JSON)

```json
{
  "AccountFullName": "CI TEST_Update20 New updated",
  "AccountId": 123,
  "AccountNumber": "DE00000008",
  "AccountShortName": "CI TEST_Update20",
  "BillingFrequencyType": "Monthly - 3rd",
  "BillingFrequencyTypeId": 1,
  "BillingRunFrequency": "Weekly - Monday",
  "BillingRunFrequencyTypeId": 1,
  "ColCoCountryCode": "14",
  "CurrencyCode": "14",
  "CurrencySymbol": "EUR",
  "Day1Run": 1,
  "Day2Run": 31,
  "Day3Run": 2,
  "Day4Run": 3,
  "FrequencyType": "Daily",
  "GrossAmount": 1232,
  "InternationalPOSLanguageCode": "deu",
  "InternationalPOSLanguageID": 1,
  "InvoiceAccountID": 9,
  "InvoiceAccountNumber": "DE00000008",
  "InvoiceAccountShortName": "BCI TEST_Update20",
  "LastModifiedDate": "20240131 11:12:34",
  "LocalCurrencyCode": "EUR",
  "LocalCurrencySymbol": "€",
  "LocalPOSLanguageCode": "deu",
  "LocalPOSLanguageID": 1,
  "NetAmount": 3434,
  "OutstandingBalance": 4354,
  "PaidAmount": 4343,
  "Status": "Blocked",
  "StatusReason": "3 - Customer Request",
  "TotalActiveCardGroups": 198,
  "TotalActiveCards": 544,
  "TotalBlockedCards": 121,
  "TotalCancelledCards": 168,
  "TotalCards": 10966,
  "TotalExpiredCards": 1000,
  "TotalFraudCards": 8,
  "TotalNewCards": 2,
  "TotalRenewalPendingCards": 0,
  "TotalReplacedCards": 20,
  "TotalTemporaryBlockCardsByCustomer": 9,
  "TotalTemporaryBlockCardsByShell": 2,
  "VATAmount": 2322,
  "IsPartnerCard": 1,
  "TollsCustomerId": "332",
  "TollsColcoCountryTypeId": "14",
  "BestOfIndicator": false
}
```


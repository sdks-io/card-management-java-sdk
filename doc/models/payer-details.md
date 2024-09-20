
# Payer Details

## Structure

`PayerDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting company id of the customer. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting company code of the customer. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `CountryCode` | `String` | Optional | ISO code of the customer country. | String getCountryCode() | setCountryCode(String countryCode) |
| `Country` | `String` | Optional | Country of the customer | String getCountry() | setCountry(String country) |
| `PayerId` | `Integer` | Optional | Payer id of the customer | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the customer | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerFullName` | `String` | Optional | Full Name of the Payer | String getPayerFullName() | setPayerFullName(String payerFullName) |
| `PayerShortName` | `String` | Optional | Short name of the payer | String getPayerShortName() | setPayerShortName(String payerShortName) |
| `PayerGroupId` | `Integer` | Optional | Payer Group Id | Integer getPayerGroupId() | setPayerGroupId(Integer payerGroupId) |
| `AmountDue` | `Double` | Optional | Invoiced amount and due for payment from the last SOA. | Double getAmountDue() | setAmountDue(Double amountDue) |
| `AmountOverdue` | `Double` | Optional | Invoiced amount and overdue for payment from the last SOA. | Double getAmountOverdue() | setAmountOverdue(Double amountOverdue) |
| `AmountNotOverdue` | `Double` | Optional | Invoiced amount and not overdue for payment from the last SOA. | Double getAmountNotOverdue() | setAmountNotOverdue(Double amountNotOverdue) |
| `OutstandingBalance` | `Double` | Optional | Current outstanding balance amount from the last SOA. | Double getOutstandingBalance() | setOutstandingBalance(Double outstandingBalance) |
| `UnallocatedPayment` | `Double` | Optional | Unallocated payment.<br>When negative, indicates overdue amount from the last SOA. | Double getUnallocatedPayment() | setUnallocatedPayment(Double unallocatedPayment) |
| `SOACurrencyCode` | `String` | Optional | Currency ISO code | String getSOACurrencyCode() | setSOACurrencyCode(String sOACurrencyCode) |
| `SOACurrencySymbol` | `String` | Optional | Currency symbol | String getSOACurrencySymbol() | setSOACurrencySymbol(String sOACurrencySymbol) |
| `SOACreditLimitCurrencyCode` | `String` | Optional | Currency ISO code | String getSOACreditLimitCurrencyCode() | setSOACreditLimitCurrencyCode(String sOACreditLimitCurrencyCode) |
| `SOACreditLimitCurrencySymbol` | `String` | Optional | Currency symbol | String getSOACreditLimitCurrencySymbol() | setSOACreditLimitCurrencySymbol(String sOACreditLimitCurrencySymbol) |
| `LastPaymentCurrencyCode` | `String` | Optional | Currency ISO code | String getLastPaymentCurrencyCode() | setLastPaymentCurrencyCode(String lastPaymentCurrencyCode) |
| `LastPaymentCurrencySymbol` | `String` | Optional | currency symbol | String getLastPaymentCurrencySymbol() | setLastPaymentCurrencySymbol(String lastPaymentCurrencySymbol) |
| `LastPaymentAmount` | `Double` | Optional | Latest payment amount for the requested payer. | Double getLastPaymentAmount() | setLastPaymentAmount(Double lastPaymentAmount) |
| `LastPaymentDate` | `String` | Optional | Latest payment date for the requested payer. | String getLastPaymentDate() | setLastPaymentDate(String lastPaymentDate) |
| `SOALastPaymentAmount` | `Double` | Optional | Last payment amount in statement of account for the requested payer. | Double getSOALastPaymentAmount() | setSOALastPaymentAmount(Double sOALastPaymentAmount) |
| `SOALastPaymentDate` | `String` | Optional | Last payment date in statement of account for the requested payer. | String getSOALastPaymentDate() | setSOALastPaymentDate(String sOALastPaymentDate) |
| `CurrencyCode` | `String` | Optional | Currency ISO code | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Currency Symbol | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `ColCoCountryCode` | `String` | Optional | The 2-character ISO Code for the customer and card owning country. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `LocalCurrencyCode` | `String` | Optional | Currency ISO code of the local country. | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Currency Symbol of the local country | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `LocalCurrencyExchangeRate` | `Double` | Optional | Exchange rate from OU base currency to local currency. | Double getLocalCurrencyExchangeRate() | setLocalCurrencyExchangeRate(Double localCurrencyExchangeRate) |
| `LocalCurrencyExchangeRateSoA` | `Double` | Optional | Exchange rate from SoA credit limit currency to local currency | Double getLocalCurrencyExchangeRateSoA() | setLocalCurrencyExchangeRateSoA(Double localCurrencyExchangeRateSoA) |
| `BillingFrequencyTypeId` | `Integer` | Optional | Billing/Invoice frequency Identifier. Indicates the frequency in which the transactions will be considered for invoicing in a bulling run<br>E.g.: 1, 2, 3, etc. | Integer getBillingFrequencyTypeId() | setBillingFrequencyTypeId(Integer billingFrequencyTypeId) |
| `BillingFrequencyType` | `String` | Optional | Billing/Invoice frequency. The frequency in which the transactions will be considered for invoicing in a bulling run<br>E.g.:<br>1    Daily (all days)<br>2    Daily (only working days)<br>3    Weekly - Monday<br>4    Weekly – Tuesday<br>Etc. | String getBillingFrequencyType() | setBillingFrequencyType(String billingFrequencyType) |
| `BillingRunFrequencyTypeId` | `Integer` | Optional | Frequency at which the billing process is triggered.<br>E.g.: 1, 2, 3, etc. | Integer getBillingRunFrequencyTypeId() | setBillingRunFrequencyTypeId(Integer billingRunFrequencyTypeId) |
| `BillingRunFrequnecy` | `String` | Optional | Frequency at which the billing process is triggered.E.g.:<br>1    Daily (all days)<br>2    Daily (only working days)<br>3    Weekly - Monday<br>4    Weekly – Tuesday<br>Etc. | String getBillingRunFrequnecy() | setBillingRunFrequnecy(String billingRunFrequnecy) |
| `Day1Run` | `Integer` | Optional | The first day in a month when the billing should run in case of multiple billing runs configured with in a single month. | Integer getDay1Run() | setDay1Run(Integer day1Run) |
| `Day2Run` | `Integer` | Optional | The second day in a month when the billing should run in case of multiple billing runs configured with in a single month. | Integer getDay2Run() | setDay2Run(Integer day2Run) |
| `Day3Run` | `Integer` | Optional | The third day in a month when the billing should run in case of multiple billing runs configured with in a single month. | Integer getDay3Run() | setDay3Run(Integer day3Run) |
| `Day4Run` | `Integer` | Optional | The fourth day in a month when the billing should run in case of multiple billing runs configured with in a single month. | Integer getDay4Run() | setDay4Run(Integer day4Run) |
| `InvoiceDistributionMethods` | [`List<InvoiceDistributionMethod>`](../../doc/models/invoice-distribution-method.md) | Optional | - | List<InvoiceDistributionMethod> getInvoiceDistributionMethods() | setInvoiceDistributionMethods(List<InvoiceDistributionMethod> invoiceDistributionMethods) |
| `OutputType` | `String` | Optional | Invoice output type (Id-Description)<br>E.g.:<br>1-PDF<br>6-Print | String getOutputType() | setOutputType(String outputType) |
| `InvoiceAccountID` | `Integer` | Optional | The Account ID of the account on which the invoice is generated. | Integer getInvoiceAccountID() | setInvoiceAccountID(Integer invoiceAccountID) |
| `InvoiceAccountNumber` | `String` | Optional | The Account Number of the account on which the invoice is generated. | String getInvoiceAccountNumber() | setInvoiceAccountNumber(String invoiceAccountNumber) |
| `InvoiceAccountShortName` | `String` | Optional | The Account Short Name of the account on which the invoice is generated. | String getInvoiceAccountShortName() | setInvoiceAccountShortName(String invoiceAccountShortName) |
| `BestOfIndicator` | `Boolean` | Optional | Best of Indicator of the Pricing customer/account configured.<br>**Default**: `false` | Boolean getBestOfIndicator() | setBestOfIndicator(Boolean bestOfIndicator) |
| `IsInternational` | `Boolean` | Optional | Whether the account is international.<br>**Default**: `false` | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `TotalAccounts` | `Integer` | Optional | Total number of accounts under the payer. | Integer getTotalAccounts() | setTotalAccounts(Integer totalAccounts) |
| `TotalActiveAccounts` | `Integer` | Optional | Total number of active accounts under the payer. | Integer getTotalActiveAccounts() | setTotalActiveAccounts(Integer totalActiveAccounts) |
| `TotalCards` | `Integer` | Optional | Total number of cards under the payer. | Integer getTotalCards() | setTotalCards(Integer totalCards) |
| `TotalActiveCards` | `Integer` | Optional | Total number of active cards under the payer. | Integer getTotalActiveCards() | setTotalActiveCards(Integer totalActiveCards) |
| `TotalBlockedCards` | `Integer` | Optional | Total number of cards under the payer that are permanently blocked | Integer getTotalBlockedCards() | setTotalBlockedCards(Integer totalBlockedCards) |
| `TotalCancelledCards` | `Integer` | Optional | Total number of cards under the payer that are cancelled | Integer getTotalCancelledCards() | setTotalCancelledCards(Integer totalCancelledCards) |
| `TotalExpiredCards` | `Integer` | Optional | Total number of expired cards under the payer. | Integer getTotalExpiredCards() | setTotalExpiredCards(Integer totalExpiredCards) |
| `TotalRenewalPendingCards` | `Integer` | Optional | Total number of Renewal Pending cards under the payer. | Integer getTotalRenewalPendingCards() | setTotalRenewalPendingCards(Integer totalRenewalPendingCards) |
| `TotalReplacedCards` | `Integer` | Optional | Total number of cards under the payer with status as “Replaced | Integer getTotalReplacedCards() | setTotalReplacedCards(Integer totalReplacedCards) |
| `TotalTemporaryBlockCardsByCustomer` | `Integer` | Optional | Total number of cards under the payer that are temporarily blocked by customer. | Integer getTotalTemporaryBlockCardsByCustomer() | setTotalTemporaryBlockCardsByCustomer(Integer totalTemporaryBlockCardsByCustomer) |
| `TotalTemporaryBlockCardsByShell` | `Integer` | Optional | Total number of cards under the payer that are temporarily blocked by Shell. | Integer getTotalTemporaryBlockCardsByShell() | setTotalTemporaryBlockCardsByShell(Integer totalTemporaryBlockCardsByShell) |
| `TotalNewCards` | `Integer` | Optional | Total number of cards in “New” status | Integer getTotalNewCards() | setTotalNewCards(Integer totalNewCards) |
| `TotalFraudCards` | `Integer` | Optional | Total number of cards in Fraud status | Integer getTotalFraudCards() | setTotalFraudCards(Integer totalFraudCards) |
| `TotalBlockedAccounts` | `Integer` | Optional | Total number of accounts in Blocked status | Integer getTotalBlockedAccounts() | setTotalBlockedAccounts(Integer totalBlockedAccounts) |
| `TotalCancelledAccounts` | `Integer` | Optional | Total number of accounts in Cancel status | Integer getTotalCancelledAccounts() | setTotalCancelledAccounts(Integer totalCancelledAccounts) |
| `PayerTradingName` | `String` | Optional | Trading name for the Payer | String getPayerTradingName() | setPayerTradingName(String payerTradingName) |
| `Status` | `String` | Optional | Payer current status id and description<br>e.g. (Id – Description):<br>1-Active<br>2-Requested from UTA<br>3-Awaiting embossing<br>4-Manufactured<br>5-Awaiting despatch | String getStatus() | setStatus(String status) |
| `BillingLanguage` | `String` | Optional | Payer Billing Language id and description | String getBillingLanguage() | setBillingLanguage(String billingLanguage) |
| `LegalEntity` | `String` | Optional | Legal entity id and description of the Payer | String getLegalEntity() | setLegalEntity(String legalEntity) |
| `DateEstablished` | `String` | Optional | Payer/Company Established Date. | String getDateEstablished() | setDateEstablished(String dateEstablished) |
| `CustomerClassification` | `String` | Optional | Payer/Company Classification id and description | String getCustomerClassification() | setCustomerClassification(String customerClassification) |
| `IndustryClass` | `String` | Optional | Payer/Company Industry class id and description | String getIndustryClass() | setIndustryClass(String industryClass) |
| `MarketingSegmentation` | `String` | Optional | Marketing Segmentation id and description | String getMarketingSegmentation() | setMarketingSegmentation(String marketingSegmentation) |
| `LineOfBusiness` | `String` | Optional | Payer/Company Line of Business Id and Description | String getLineOfBusiness() | setLineOfBusiness(String lineOfBusiness) |
| `PrintCreditLimit` | `Boolean` | Optional | Is Credit Limit printed on the statement of account: True/False<br>If True Credit Limit is printed on invoice/SOA<br>**Default**: `false` | Boolean getPrintCreditLimit() | setPrintCreditLimit(Boolean printCreditLimit) |
| `CardGroupType` | `String` | Optional | Card Group Type configured for Payer<br>e.g. (Id – Description):<br>1-Horizontal only<br>2-Vertical only<br>3-Both | String getCardGroupType() | setCardGroupType(String cardGroupType) |
| `RenewCards` | `Boolean` | Optional | If set to True cards will be automatically renewed on expiry<br>**Default**: `false` | Boolean getRenewCards() | setRenewCards(Boolean renewCards) |
| `AllowSelectPIN` | `Boolean` | Optional | If set to True then Self Select PIN is allowed for Payer<br>**Default**: `false` | Boolean getAllowSelectPIN() | setAllowSelectPIN(Boolean allowSelectPIN) |
| `UseFleetPIN` | `Boolean` | Optional | If set to True then Fleet PIN is applied for the cards directly under payer | Boolean getUseFleetPIN() | setUseFleetPIN(Boolean useFleetPIN) |
| `VATRegNumber` | `String` | Optional | Payer/Company VAT registration number. | String getVATRegNumber() | setVATRegNumber(String vATRegNumber) |
| `VATRegNumber2` | `String` | Optional | Payer/Company VAT registration number 2. | String getVATRegNumber2() | setVATRegNumber2(String vATRegNumber2) |
| `RegistrationNumber` | `String` | Optional | Payer/Company Registration number | String getRegistrationNumber() | setRegistrationNumber(String registrationNumber) |
| `RegistrationNumber2` | `String` | Optional | Payer/Company Registration number2 | String getRegistrationNumber2() | setRegistrationNumber2(String registrationNumber2) |
| `SalesLedgerBalance` | `Double` | Optional | Sales Ledger Balance (Billed) | Double getSalesLedgerBalance() | setSalesLedgerBalance(Double salesLedgerBalance) |
| `Exposure` | `Double` | Optional | Exposure after guarantee | Double getExposure() | setExposure(Double exposure) |
| `OutstandingDebt` | `Double` | Optional | Total outstanding debt (including billed and unbilled sales and fee items) | Double getOutstandingDebt() | setOutstandingDebt(Double outstandingDebt) |
| `AvailableCredit` | `Double` | Optional | The available credit for the payer.<br>This is the credit limit minus the outstanding debt. | Double getAvailableCredit() | setAvailableCredit(Double availableCredit) |
| `Band` | `String` | Optional | Band Id and Description of the Payer in Card Platform.<br>e.g. (Id – Description):<br>1-Platinum<br>2-Gold<br>3-Silver<br>4-Bronze | String getBand() | setBand(String band) |
| `GlobalCustomerReferenceId` | `String` | Optional | Global Customer reference id configured in card platform for Payer (Same as Payer Group) | String getGlobalCustomerReferenceId() | setGlobalCustomerReferenceId(String globalCustomerReferenceId) |
| `CreditLimit` | `Double` | Optional | Payment Credit limit of Payer. | Double getCreditLimit() | setCreditLimit(Double creditLimit) |
| `CreditLimitInCustomerCurrency` | `Double` | Optional | Credit limit in Customer currency.<br>Note: For currency details refer the parameters CurrencyCode & CurrencySymbol in the PayerDetail response. | Double getCreditLimitInCustomerCurrency() | setCreditLimitInCustomerCurrency(Double creditLimitInCustomerCurrency) |
| `BillingCurrencyCode` | `String` | Optional | Customer Billing currency ISO code. | String getBillingCurrencyCode() | setBillingCurrencyCode(String billingCurrencyCode) |
| `BillingCurrencySymbol` | `String` | Optional | Customer Billing currency Symbol. | String getBillingCurrencySymbol() | setBillingCurrencySymbol(String billingCurrencySymbol) |
| `PaymentMethod` | `String` | Optional | Payment method Id and Description as configured for Payer in Card Platform | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `PaymentTerms` | `String` | Optional | Payment terms Id and Description as configured for Payer in Card Platform | String getPaymentTerms() | setPaymentTerms(String paymentTerms) |
| `TemporaryCreditLimitIncrease` | `Double` | Optional | Temporary Credit limit increase value | Double getTemporaryCreditLimitIncrease() | setTemporaryCreditLimitIncrease(Double temporaryCreditLimitIncrease) |
| `TemporaryCreditLimitIncreaseInCustomerCurrency` | `Double` | Optional | Temporary Credit limit increase value | Double getTemporaryCreditLimitIncreaseInCustomerCurrency() | setTemporaryCreditLimitIncreaseInCustomerCurrency(Double temporaryCreditLimitIncreaseInCustomerCurrency) |
| `TemporaryCreditLimitExpiryDate` | `String` | Optional | Temporary Credit limit expiry date | String getTemporaryCreditLimitExpiryDate() | setTemporaryCreditLimitExpiryDate(String temporaryCreditLimitExpiryDate) |
| `PayerBankAccount` | [`List<BankAccount>`](../../doc/models/bank-account.md) | Optional | - | List<BankAccount> getPayerBankAccount() | setPayerBankAccount(List<BankAccount> payerBankAccount) |
| `CardDeliveryAddress` | [`Address`](../../doc/models/address.md) | Optional | - | Address getCardDeliveryAddress() | setCardDeliveryAddress(Address cardDeliveryAddress) |
| `CorrespondanceAddress` | [`Address`](../../doc/models/address.md) | Optional | - | Address getCorrespondanceAddress() | setCorrespondanceAddress(Address correspondanceAddress) |
| `BillingAddress` | [`Address`](../../doc/models/address.md) | Optional | - | Address getBillingAddress() | setBillingAddress(Address billingAddress) |
| `HasActiveVolBasedPricing` | `Boolean` | Optional | True, if the payer is setup for volume-based pricing and is active on the current date, else false.<br><br>This field is returned only when IncludeBonusParameters is set to True in the request. Else set to null. | Boolean getHasActiveVolBasedPricing() | setHasActiveVolBasedPricing(Boolean hasActiveVolBasedPricing) |
| `HasActiveVolBasedBonus` | `Boolean` | Optional | True, if the payer is setup for volume-based bonus and is active on the current date, else false.<br>This field is returned only when IncludeBonusParameters is set to True in the request. Else set to null. | Boolean getHasActiveVolBasedBonus() | setHasActiveVolBasedBonus(Boolean hasActiveVolBasedBonus) |
| `HasActiveVolBasedAssociationBonus` | `Boolean` | Optional | True, if the payer is setup for volume-based association bonus and is active on the current date, else false.<br>This field is returned only when IncludeBonusParameters is set to True in the request. Else set to null. | Boolean getHasActiveVolBasedAssociationBonus() | setHasActiveVolBasedAssociationBonus(Boolean hasActiveVolBasedAssociationBonus) |
| `FinanceCurrency` | [`FinanceCurrency2`](../../doc/models/finance-currency-2.md) | Optional | - | FinanceCurrency2 getFinanceCurrency() | setFinanceCurrency(FinanceCurrency2 financeCurrency) |
| `TollsCustomerId` | `String` | Optional | Customer id in e-TM system<br>This field will have value only when ReturnTollsCustomerId is set to true in the request else set to null or empty. | String getTollsCustomerId() | setTollsCustomerId(String tollsCustomerId) |
| `TollsColcoCountryTypeId` | `String` | Optional | String    Colco country type id in e-TM system<br>This field will have value only when ReturnTollsCustomerId is set to true in the request else set to null or empty. | String getTollsColcoCountryTypeId() | setTollsColcoCountryTypeId(String tollsColcoCountryTypeId) |
| `Contracts` | [`List<CustomerContract>`](../../doc/models/customer-contract.md) | Optional | - | List<CustomerContract> getContracts() | setContracts(List<CustomerContract> contracts) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "CountryCode": "DE",
  "Country": "Germany",
  "PayerId": 12345,
  "PayerNumber": "DE000000123",
  "PayerFullName": "ABC Company",
  "PayerShortName": "ABC",
  "PayerGroupId": 456,
  "AmountDue": 1500,
  "AmountOverdue": 450,
  "AmountNotOverdue": 4546.76,
  "OutstandingBalance": 456,
  "UnallocatedPayment": 123,
  "SOACurrencyCode": "EUR",
  "SOACurrencySymbol": "€",
  "SOACreditLimitCurrencyCode": "EUR",
  "SOACreditLimitCurrencySymbol": "€",
  "LastPaymentCurrencyCode": "EUR",
  "LastPaymentCurrencySymbol": "€",
  "LastPaymentAmount": 5465,
  "LastPaymentDate": "20230405",
  "SOALastPaymentAmount": 45443,
  "SOALastPaymentDate": "20230805",
  "CurrencyCode": "EUR",
  "CurrencySymbol": "€",
  "ColCoCountryCode": "DE",
  "LocalCurrencyCode": "EUR",
  "LocalCurrencySymbol": "€",
  "LocalCurrencyExchangeRate": 1.45,
  "LocalCurrencyExchangeRate_SoA": 1.2,
  "BillingFrequencyTypeId": 1,
  "BillingFrequencyType": "weekly",
  "BillingRunFrequencyTypeId": 1,
  "BillingRunFrequnecy": "weekly",
  "Day1Run": 0,
  "Day2Run": 0,
  "Day3Run": 0,
  "Day4Run": 0,
  "OutputType": "PDF",
  "InvoiceAccountID": 12345,
  "InvoiceAccountNumber": "1234567",
  "InvoiceAccountShortName": "Test Account",
  "BestOfIndicator": false,
  "IsInternational": false,
  "TotalAccounts": 5,
  "TotalActiveAccounts": 4,
  "TotalCards": 567,
  "TotalActiveCards": 560,
  "TotalBlockedCards": 6,
  "TotalCancelledCards": 0,
  "TotalExpiredCards": 1,
  "TotalRenewalPendingCards": 0,
  "TotalReplacedCards": 0,
  "TotalTemporaryBlockCardsByCustomer": 0,
  "TotalTemporaryBlockCardsByShell": 0,
  "TotalNewCards": 0,
  "TotalBlockedAccounts": 0,
  "TotalCancelledAccounts": 0,
  "PayerTradingName": "ABC Company",
  "Status": "Active",
  "BillingLanguage": "1-German",
  "LegalEntity": "20-Unlimited Corporation",
  "DateEstablished": "19880504",
  "CustomerClassification": "3-10049 Domestic",
  "IndustryClass": "4-Growing of sugar cane",
  "MarketingSegmentation": "1-National CRT",
  "LineOfBusiness": "1-CRT",
  "PrintCreditLimit": false,
  "CardGroupType": "1-Horizontal only",
  "RenewCards": false,
  "AllowSelectPIN": false,
  "VATRegNumber": "4534545",
  "VATRegNumber2": "45345545",
  "RegistrationNumber": "453543",
  "RegistrationNumber2": "35435",
  "SalesLedgerBalance": 0,
  "Exposure": 0,
  "OutstandingDebt": 0,
  "AvailableCredit": 0,
  "Band": "Gold",
  "GlobalCustomerReferenceId": "1234",
  "CreditLimit": 3434,
  "BillingCurrencyCode": "EUR",
  "BillingCurrencySymbol": "€",
  "PaymentMethod": "Incoming - Bank Transfer",
  "PaymentTerms": "0 days after invoice",
  "TemporaryCreditLimitIncrease": 0,
  "TemporaryCreditLimitIncreaseInCustomerCurrency": 0,
  "TemporaryCreditLimitExpiryDate": "20230504",
  "TollsCustomerId": "2332",
  "TollsColcoCountryTypeId": "33"
}
```


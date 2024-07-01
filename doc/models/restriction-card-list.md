
# Restriction Card List

## Structure

`RestrictionCardList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card<br>Format: yyyyMMdd<br>Note: Clients to convert this to appropriate DateTime type. | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `StatusId` | `Integer` | Optional | Card Status id | Integer getStatusId() | setStatusId(Integer statusId) |
| `StatusDescription` | `String` | Optional | Status Description (Active, Temporarily Blocked, etc.,) | String getStatusDescription() | setStatusDescription(String statusDescription) |
| `DriverName` | `String` | Optional | Driver name<br>Example:  ANDREW GILBERRY | String getDriverName() | setDriverName(String driverName) |
| `VRN` | `String` | Optional | Vehicle registration number<br>Example: MV65YLH | String getVRN() | setVRN(String vRN) |
| `IssueDate` | `String` | Optional | Issue date<br>Format: yyyyMMdd<br>Note: Clients to convert this to appropriate DateTime type. | String getIssueDate() | setIssueDate(String issueDate) |
| `IssueNumber` | `Integer` | Optional | Issue Number | Integer getIssueNumber() | setIssueNumber(Integer issueNumber) |
| `AccountId` | `Integer` | Optional | Account ID<br>Example: 29484 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number<br>Example: GB99215176 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountName` | `String` | Optional | Account Name<br>Example: MATTHEW ALGIE & COMPANY LIMITED | String getAccountName() | setAccountName(String accountName) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `CurrencyCode` | `String` | Optional | ISO currency code of the Customer Currency<br>Example: GBP | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `ColCoCurrencyCode` | `String` | Optional | ISO currency code of the country.<br>Example: GBP | String getColCoCurrencyCode() | setColCoCurrencyCode(String colCoCurrencyCode) |
| `ColCoCurrencySymbol` | `String` | Optional | Currency symbol of the country.<br>Example: £, $ | String getColCoCurrencySymbol() | setColCoCurrencySymbol(String colCoCurrencySymbol) |
| `RestrictionCurrencyCode` | `String` | Optional | ISO currency code of the country.<br>Example: GBP | String getRestrictionCurrencyCode() | setRestrictionCurrencyCode(String restrictionCurrencyCode) |
| `RestrictionCurrencySymbol` | `String` | Optional | Currency symbol of the country.<br>Example: £, $ | String getRestrictionCurrencySymbol() | setRestrictionCurrencySymbol(String restrictionCurrencySymbol) |
| `PurchaseCategoryId` | `String` | Optional | Purchase category Id<br>Example: 123, 124, etc., | String getPurchaseCategoryId() | setPurchaseCategoryId(String purchaseCategoryId) |
| `PurchaseCategoryCode` | `String` | Optional | Purchase category code<br>Example:<br>0 - All Fuels (without VP) and Lubricants<br>1 - FuelSave only<br>2 - FuelSave and Lubricants<br>3 - No Restrictions<br>4 - VP and FuelSave<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and FuelSave and Lubricants | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `PurchaseCategoryName` | `String` | Optional | Purchase category name<br>Example:<br>0 - All Fuels (without VP) and Lubricants<br>1 - FuelSave only<br>2 - FuelSave and Lubricants<br>3 - No Restrictions<br>4 - VP and FuelSave<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and FuelSave and Lubricants | String getPurchaseCategoryName() | setPurchaseCategoryName(String purchaseCategoryName) |
| `IsSuperseded` | `Boolean` | Optional | True/False<br>True if a new card is issued with the same PAN, else false | Boolean getIsSuperseded() | setIsSuperseded(Boolean isSuperseded) |
| `IsVirtualCard` | `Boolean` | Optional | True/False<br>True if it is a virtual card, else false | Boolean getIsVirtualCard() | setIsVirtualCard(Boolean isVirtualCard) |
| `IsNational` | `Boolean` | Optional | True/False<br>True if it is a national card, else false | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsInternational` | `Boolean` | Optional | True/False<br>True if it is an international card, else false | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsCRT` | `Boolean` | Optional | True/False<br>True if it is a CRT type card, else false | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True/False<br>True if it is a Fleet type card, else false | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsShellSitesOnly` | `Boolean` | Optional | True/False<br>True if it is only allowed at Shell sites, else false | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True/False<br>True if it is allowed at all partner sites, else false | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `CardTypeId` | `Integer` | Optional | Card Type ID<br>Example Id & Description:<br>1 - Philippines CRT 7077861<br>2- Philippines Fleet 7002861<br>5-SHELL FLEET- HONG KONG 7002821<br>6-SHELL NHF- HONG KONG 7002821<br>7-SHELL CRT- HONG KONG 7077821 | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeCode` | `String` | Optional | ISO code of the card i.e. first 7 digits of the PAN | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeName` | `String` | Optional | Card Type Name<br>Example Id & Description:<br>1 - Philippines CRT 7077861<br>2- Philippines Fleet 7002861<br>5-SHELL FLEET- HONG KONG 7002821<br>6-SHELL NHF- HONG KONG 7002821<br>7-SHELL CRT- HONG KONG 7077821 | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `BundleId` | `String` | Optional | Bundle Id associated with card in the Gateway.<br>This field will have a null value if the card is not associated with any bundle of IncludeBundleDetails in request is false.<br>If the search is based on a bundle Id, the same will be returned. | String getBundleId() | setBundleId(String bundleId) |
| `MediumTypeID` | `Integer` | Optional | Id of the medium type identifier.<br>Example: 1,2,4<br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>4 - Fuel Card and Key fob Card<br>5 - Key fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 – Smartpay | Integer getMediumTypeID() | setMediumTypeID(Integer mediumTypeID) |
| `MediumType` | `String` | Optional | Name of the medium type identifier.<br><br>Example: Fuel Card, Fuel Card with EV, Key fob  <br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>4 - Fuel Card and Key fob Card<br>5 - Key fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 - Smartpay | String getMediumType() | setMediumType(String mediumType) |

## Example (as JSON)

```json
{
  "CardId": 110,
  "PAN": "PAN8",
  "ExpiryDate": "ExpiryDate8",
  "StatusId": 178,
  "StatusDescription": "StatusDescription4"
}
```


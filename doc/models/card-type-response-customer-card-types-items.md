
# Card Type Response Customer Card Types Items

## Structure

`CardTypeResponseCustomerCardTypesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CanHavePIN` | `Boolean` | Optional | True/False – Whether the cards of this card type can have PIN. | Boolean getCanHavePIN() | setCanHavePIN(Boolean canHavePIN) |
| `CardTypeId` | `Integer` | Optional | Card Type Id | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name. | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `ColCoCurrencyCode` | `String` | Optional | ISO currency code of the country. | String getColCoCurrencyCode() | setColCoCurrencyCode(String colCoCurrencyCode) |
| `CustomerCardTypeId` | `Integer` | Optional | Customer Card Type Id | Integer getCustomerCardTypeId() | setCustomerCardTypeId(Integer customerCardTypeId) |
| `DayTimeRestrictions` | [`CardDayTimeRestrictions`](../../doc/models/card-day-time-restrictions.md) | Optional | - | CardDayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(CardDayTimeRestrictions dayTimeRestrictions) |
| `DefaultPurchaseCategoryId` | `Integer` | Optional | Default Purchase category of the card type. | Integer getDefaultPurchaseCategoryId() | setDefaultPurchaseCategoryId(Integer defaultPurchaseCategoryId) |
| `EmbossAccountName` | `String` | Optional | Default Name to be embossed on the card | String getEmbossAccountName() | setEmbossAccountName(String embossAccountName) |
| `ExpiryPeriod` | `Integer` | Optional | Default Expiry period. | Integer getExpiryPeriod() | setExpiryPeriod(Integer expiryPeriod) |
| `IsCRT` | `Boolean` | Optional | True/False – Wether it is a CRT Card type or not. | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True/False – Whether it is it a Fleet Card typeor not. | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsInternational` | `Boolean` | Optional | True/False – Whether it is an International Card type or not. | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsNational` | `Boolean` | Optional | True/False – Whether it is a National Card type or not. | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True/False – Whether this card type is allowed in partner Stations. | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `IsShellSitesOnly` | `Boolean` | Optional | True/False – Whether it is only allowed in Shell Stations or not. | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `IsVirtual` | `Boolean` | Optional | True/False - Whether it is a Virtual Card type or not. | Boolean getIsVirtual() | setIsVirtual(Boolean isVirtual) |
| `IsVisibleToCustomers` | `Boolean` | Optional | True/False – Whether this card type is visible in SFH for card ordering. | Boolean getIsVisibleToCustomers() | setIsVisibleToCustomers(Boolean isVisibleToCustomers) |
| `IsActive` | `Boolean` | Optional | Whether card type is active or not. | Boolean getIsActive() | setIsActive(Boolean isActive) |
| `IsCardAvailableForDownload` | `Boolean` | Optional | - | Boolean getIsCardAvailableForDownload() | setIsCardAvailableForDownload(Boolean isCardAvailableForDownload) |
| `IsCardVisibleToCustomers` | `Boolean` | Optional | - | Boolean getIsCardVisibleToCustomers() | setIsCardVisibleToCustomers(Boolean isCardVisibleToCustomers) |
| `PANLength` | `Integer` | Optional | PAN Length | Integer getPANLength() | setPANLength(Integer pANLength) |
| `PurchaseCategories` | [`List<PurchaseCategories>`](../../doc/models/purchase-categories.md) | Optional | - | List<PurchaseCategories> getPurchaseCategories() | setPurchaseCategories(List<PurchaseCategories> purchaseCategories) |
| `TokenTypeId` | `Integer` | Optional | Token type identifier. | Integer getTokenTypeId() | setTokenTypeId(Integer tokenTypeId) |
| `TokenTypeName` | `String` | Optional | Token Type Name. | String getTokenTypeName() | setTokenTypeName(String tokenTypeName) |
| `UsageRestrictions` | [`CardUsageRestrictions`](../../doc/models/card-usage-restrictions.md) | Optional | - | CardUsageRestrictions getUsageRestrictions() | setUsageRestrictions(CardUsageRestrictions usageRestrictions) |
| `EMVContactless` | `Boolean` | Optional | Is Europay, MasterCard, and Visa Contactless enabled or not. | Boolean getEMVContactless() | setEMVContactless(Boolean eMVContactless) |
| `RFID` | `Boolean` | Optional | Whether the card type is enabled for RFID (Radio Frequency Identification) | Boolean getRFID() | setRFID(Boolean rFID) |
| `PINChangeSupported` | `Boolean` | Optional | PIN change supported or not. | Boolean getPINChangeSupported() | setPINChangeSupported(Boolean pINChangeSupported) |
| `RequirePIN` | `Boolean` | Optional | Whether a PIN is mandatory for the cards of this card type. | Boolean getRequirePIN() | setRequirePIN(Boolean requirePIN) |
| `OfflinePIN` | `Boolean` | Optional | Whether offline PIN is enabled or not. | Boolean getOfflinePIN() | setOfflinePIN(Boolean offlinePIN) |
| `IsDefault` | `Boolean` | Optional | Whether card type is default or not. | Boolean getIsDefault() | setIsDefault(Boolean isDefault) |
| `ApplicationsToShowNPIITokens` | `Boolean` | Optional | True/False<br>Note: ApplicationsToShowNPIITokens will be set as ‘True’ when the accessing application API key exists in the “ApplicationsToShowNPIITokens” card type configuration else “False”. | Boolean getApplicationsToShowNPIITokens() | setApplicationsToShowNPIITokens(Boolean applicationsToShowNPIITokens) |
| `MediumTypeID` | `Integer` | Optional | Id of the medium type identifier.<br>Example: 1,2,4<br><br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>3 - EV only<br>4 - Fuel Card and Key Fob<br>5 - Key Fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 – Smartpay Token | Integer getMediumTypeID() | setMediumTypeID(Integer mediumTypeID) |
| `MediumType` | `String` | Optional | Name of the medium type identifier.<br>Example: Fuel Card, Fuel Card with EV, Key Fob<br><br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>3 - EV only<br>4 - Fuel Card and Key Fob<br>5 - Key Fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 - Smartpay Token | String getMediumType() | setMediumType(String mediumType) |
| `ColCoCurrencySymbol` | `String` | Optional | Currency symbol of the country. | String getColCoCurrencySymbol() | setColCoCurrencySymbol(String colCoCurrencySymbol) |

## Example (as JSON)

```json
{
  "CardTypeId": 228,
  "CardTypeName": "DE-Kleinfhzg. International Multi",
  "ColCoCurrencyCode": "EUR",
  "CustomerCardTypeId": 1576,
  "DefaultPurchaseCategoryId": 127,
  "EmbossAccountName": "5.11.3 DE",
  "ExpiryPeriod": 48,
  "PANLength": 19,
  "TokenTypeId": 160,
  "TokenTypeName": "DE FLT INT MUL - CHIP",
  "MediumTypeID": 1,
  "MediumType": "Fuel Card",
  "ColCoCurrencySymbol": "£",
  "CanHavePIN": false
}
```


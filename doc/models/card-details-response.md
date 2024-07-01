
# Card Details Response

## Structure

`CardDetailsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment Customer in the Shell Card Platform) of the selected payer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account Id (i.e. Customer Id of the Customer in the Shell Card Platform) of the customer. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account short name. | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `ColCoCountryCode` | `String` | Optional | ISO 3166 Alpha-2 Country Code for the customer and card owning country. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `LocalCurrencyCode` | `String` | Optional | ISO 4217 Curreny Code of the local currency. | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Currency symbol of local currency. | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `CardId` | `Integer` | Optional | Unique Card Id in Cards platform. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Card PAN. In the response body the PAN will be masked if the option is enabled in the Shell Card Platform. | String getPAN() | setPAN(String pAN) |
| `StatusId` | [`CardDetailsResponseStatusIdEnum`](../../doc/models/card-details-response-status-id-enum.md) | Optional | - | CardDetailsResponseStatusIdEnum getStatusId() | setStatusId(CardDetailsResponseStatusIdEnum statusId) |
| `Status` | `String` | Optional | Possible Id’s and description:<br><br>* 1  Active<br>* 7  Blocked Card<br>* 8  Expired<br>* 9  Cancelled<br>* 10  New<br>* 23  Pending Renewal<br>* 31  Replaced<br>* 41  Temporary Block (Customer)<br>* 42  Temporary Block (Shell)<br>* 43  Fraud<br>* 101 Active (Block in progress) *<br>* 102 Blocked Card (Unblock in progress) *<br>* 103 Active (Cancel in progress) *<br>* 104 Active (Marked as damaged) *<br>* 105 New (Cancel as damaged) *<br>* 106 Active(Scheduled for block) ”#<br>* 107 Blocked Card(Scheduled for unblock) *#<br>* 108 Blocked Card (Cancel in progress) *<br><br>> Note:<br>> •  Items marked with * are intermediate statuses  to indicate that there are pending requests in progress. , The response can contain these intermediate statuses only if the IncludeIntermediateStatus flag is true.<br>> •  The placeholder “<Shell Card Platform Status>” in the items marked with # will be replaced with the Shell Card Platform status description. E.g., “Active (Scheduled for block)” | String getStatus() | setStatus(String status) |
| `OdometerPrompt` | `Boolean` | Optional | True if odometer input is enabled on the card, else false | Boolean getOdometerPrompt() | setOdometerPrompt(Boolean odometerPrompt) |
| `FleetIdPrompt` | `Boolean` | Optional | True if fleet id input is enabled, else false | Boolean getFleetIdPrompt() | setFleetIdPrompt(Boolean fleetIdPrompt) |
| `PINType` | [`CardDetailsResponsePINTypeEnum`](../../doc/models/card-details-response-pin-type-enum.md) | Optional | - | CardDetailsResponsePINTypeEnum getPINType() | setPINType(CardDetailsResponsePINTypeEnum pINType) |
| `HasPIN` | `Boolean` | Optional | True if card has PIN, else false | Boolean getHasPIN() | setHasPIN(Boolean hasPIN) |
| `IsSelfSelectedPIN` | `Boolean` | Optional | True if card has Self Selected PIN, else false | Boolean getIsSelfSelectedPIN() | setIsSelfSelectedPIN(Boolean isSelfSelectedPIN) |
| `TemporaryBlockAllowed` | `Boolean` | Optional | True if card can be blocked temporarily, else false | Boolean getTemporaryBlockAllowed() | setTemporaryBlockAllowed(Boolean temporaryBlockAllowed) |
| `UnblockAllowed` | `Boolean` | Optional | True/False True if card can be Unblocked, else false | Boolean getUnblockAllowed() | setUnblockAllowed(Boolean unblockAllowed) |
| `PermanentBlockAllowed` | `Boolean` | Optional | True if card can be blocked permanently, else false | Boolean getPermanentBlockAllowed() | setPermanentBlockAllowed(Boolean permanentBlockAllowed) |
| `IssueNumber` | `Integer` | Optional | Issue number of the card | Integer getIssueNumber() | setIssueNumber(Integer issueNumber) |
| `ReissueSetting` | `Object` | Optional | - | Object getReissueSetting() | setReissueSetting(Object reissueSetting) |
| `InternationalPOSLanguageID` | [`CardDetailsResponseInternationalPOSLanguageIDEnum`](../../doc/models/card-details-response-international-pos-language-id-enum.md) | Optional | - | CardDetailsResponseInternationalPOSLanguageIDEnum getInternationalPOSLanguageID() | setInternationalPOSLanguageID(CardDetailsResponseInternationalPOSLanguageIDEnum internationalPOSLanguageID) |
| `InternationalPOSLanguageCode` | [`CardDetailsResponseInternationalPOSLanguageCodeEnum`](../../doc/models/card-details-response-international-pos-language-code-enum.md) | Optional | - | CardDetailsResponseInternationalPOSLanguageCodeEnum getInternationalPOSLanguageCode() | setInternationalPOSLanguageCode(CardDetailsResponseInternationalPOSLanguageCodeEnum internationalPOSLanguageCode) |
| `LocalPOSLanguageID` | [`CardDetailsResponseInternationalPOSLanguageIDEnum`](../../doc/models/card-details-response-international-pos-language-id-enum.md) | Optional | - | CardDetailsResponseInternationalPOSLanguageIDEnum getLocalPOSLanguageID() | setLocalPOSLanguageID(CardDetailsResponseInternationalPOSLanguageIDEnum localPOSLanguageID) |
| `LocalPOSLanguageCode` | [`CardDetailsResponseInternationalPOSLanguageCodeEnum`](../../doc/models/card-details-response-international-pos-language-code-enum.md) | Optional | - | CardDetailsResponseInternationalPOSLanguageCodeEnum getLocalPOSLanguageCode() | setLocalPOSLanguageCode(CardDetailsResponseInternationalPOSLanguageCodeEnum localPOSLanguageCode) |
| `CardTypeCode` | `String` | Optional | ISO code of the card i.e. first 7 digits of the PAN. | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeId` | `Integer` | Optional | Card Type ID | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `TokenTypeId` | `Integer` | Optional | Token Type ID configured for the Card | Integer getTokenTypeId() | setTokenTypeId(Integer tokenTypeId) |
| `TokenTypeName` | `String` | Optional | Token Type Name configured for the Card | String getTokenTypeName() | setTokenTypeName(String tokenTypeName) |
| `IsChipCard` | `Boolean` | Optional | True if a chip card, else false | Boolean getIsChipCard() | setIsChipCard(Boolean isChipCard) |
| `IsMagStripCard` | `Boolean` | Optional | True if it is a magnetic stripe card, else false | Boolean getIsMagStripCard() | setIsMagStripCard(Boolean isMagStripCard) |
| `IsVirtualCard` | `Boolean` | Optional | True if it is a virtual card, else false | Boolean getIsVirtualCard() | setIsVirtualCard(Boolean isVirtualCard) |
| `PurchaseCategoryCode` | `String` | Optional | Purchase category code of the card.<br>**Constraints**: *Maximum Length*: `1` | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `PurchaseCategoryId` | `Integer` | Optional | Purchase category identifier in the Shell Card Platform. | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `PurchaseCategoryName` | `String` | Optional | Purchase category name | String getPurchaseCategoryName() | setPurchaseCategoryName(String purchaseCategoryName) |
| `IsCRT` | `Boolean` | Optional | True if it is a Commercial Road Transport (CRT) card, else false | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True if it is a Fleet card, else false | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsInternational` | `Boolean` | Optional | True if it is an international card, else false | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsNational` | `Boolean` | Optional | True if it is a national card, else false | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True if it is allowed at all partner sites, else false | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `IsShellSitesOnly` | `Boolean` | Optional | True if it is only allowed at Shell sites, else false | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `FuelSets` | [`List<CardDetailsResponseFuelSetsItems>`](../../doc/models/card-details-response-fuel-sets-items.md) | Optional | List of active fuel type product restrictions applied on the card.<br>**Constraints**: *Unique Items Required* | List<CardDetailsResponseFuelSetsItems> getFuelSets() | setFuelSets(List<CardDetailsResponseFuelSetsItems> fuelSets) |
| `NonFuelSets` | [`List<CardDetailsResponseNonFuelSetsItems>`](../../doc/models/card-details-response-non-fuel-sets-items.md) | Optional | List of active non-fuel type product restrictions applied on the card.<br>**Constraints**: *Unique Items Required* | List<CardDetailsResponseNonFuelSetsItems> getNonFuelSets() | setNonFuelSets(List<CardDetailsResponseNonFuelSetsItems> nonFuelSets) |
| `IssuedDate` | `String` | Optional | Card issue date. | String getIssuedDate() | setIssuedDate(String issuedDate) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card. | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `LastUsedDate` | `String` | Optional | Card last used date. | String getLastUsedDate() | setLastUsedDate(String lastUsedDate) |
| `MisuseDate` | `String` | Optional | Last misused date of the card. | String getMisuseDate() | setMisuseDate(String misuseDate) |
| `Temperature` | `String` | Optional | Hot-list status | String getTemperature() | setTemperature(String temperature) |
| `DriverName` | `String` | Optional | Driver name of the card. Note- While ordering card, optional when VRN is passed else mandatory.<br>**Constraints**: *Maximum Length*: `27` | String getDriverName() | setDriverName(String driverName) |
| `VRN` | `String` | Optional | Vehicle registration number of the card. Note- While ordering card, optional when DriverName is passed else mandatory.<br>**Constraints**: *Maximum Length*: `16` | String getVRN() | setVRN(String vRN) |
| `EmbossText` | `String` | Optional | Text printed on the card as account name.<br>**Constraints**: *Maximum Length*: `25` | String getEmbossText() | setEmbossText(String embossText) |
| `CardGroupId` | `Integer` | Optional | Existing Card Group ID, under which the replacement card is to be created.<br>Pass “-1” if the replacement card should not be assigned to any card group.<br>Optional.<br>If not provided, the replacement card will be created under the same card group as the current card.<br>Example- 156 | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card group name. Note- 1. While ordering card this field is mandatory when IsNewCardGroup is true.<br>**Constraints**: *Maximum Length*: `30` | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `RenewalDate` | `String` | Optional | Renewal date of the card. Applicable if ReissueSetting is set to True. | String getRenewalDate() | setRenewalDate(String renewalDate) |
| `RenewedCardId` | `Integer` | Optional | Renewed card id. | Integer getRenewedCardId() | setRenewedCardId(Integer renewedCardId) |
| `RenewedCardStatusId` | `Integer` | Optional | Renewed card status id. | Integer getRenewedCardStatusId() | setRenewedCardStatusId(Integer renewedCardStatusId) |
| `RenewedCardStatus` | `String` | Optional | Renewed card status description. | String getRenewedCardStatus() | setRenewedCardStatus(String renewedCardStatus) |
| `RenewedCardExpiryDate` | `String` | Optional | Renewed card expiry date. | String getRenewedCardExpiryDate() | setRenewedCardExpiryDate(String renewedCardExpiryDate) |
| `RenewedCardIssueNumber` | `Integer` | Optional | Renewed card issue number. | Integer getRenewedCardIssueNumber() | setRenewedCardIssueNumber(Integer renewedCardIssueNumber) |
| `RenewedCardReissueSetting` | [`CardDetailsResponseRenewedCardReissueSettingEnum`](../../doc/models/card-details-response-renewed-card-reissue-setting-enum.md) | Optional | - | CardDetailsResponseRenewedCardReissueSettingEnum getRenewedCardReissueSetting() | setRenewedCardReissueSetting(CardDetailsResponseRenewedCardReissueSettingEnum renewedCardReissueSetting) |
| `CreationDate` | `String` | Optional | Card Creation Date time | String getCreationDate() | setCreationDate(String creationDate) |
| `EffectiveDate` | `String` | Optional | Effective date for the Card | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `LastModifiedDate` | `String` | Optional | Card last modified date | String getLastModifiedDate() | setLastModifiedDate(String lastModifiedDate) |
| `BundleId` | `String` | Optional | Bundle Id associated with card in the Gateway. This field will have a null value if the card is not associated with any bundle in Gateway or the value of IncludeBundleDetails in request is false. | String getBundleId() | setBundleId(String bundleId) |
| `CardDeliveryAddress` | [`CardDeliveryAddress`](../../doc/models/card-delivery-address.md) | Optional | - | CardDeliveryAddress getCardDeliveryAddress() | setCardDeliveryAddress(CardDeliveryAddress cardDeliveryAddress) |
| `PINDeliveryAddress` | [`PINDeliveryAddress`](../../doc/models/pin-delivery-address.md) | Optional | - | PINDeliveryAddress getPINDeliveryAddress() | setPINDeliveryAddress(PINDeliveryAddress pINDeliveryAddress) |
| `CardBlockSchedules` | [`List<CardDetailsResponseCardBlockSchedulesItemsAllOf0>`](../../doc/models/card-details-response-card-block-schedules-items-all-of-0.md) | Optional | **Constraints**: *Unique Items Required* | List<CardDetailsResponseCardBlockSchedulesItemsAllOf0> getCardBlockSchedules() | setCardBlockSchedules(List<CardDetailsResponseCardBlockSchedulesItemsAllOf0> cardBlockSchedules) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

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
  "OdometerPrompt": true,
  "FleetIdPrompt": true,
  "HasPIN": true,
  "IsSelfSelectedPIN": true,
  "TemporaryBlockAllowed": true,
  "UnblockAllowed": true,
  "PermanentBlockAllowed": true,
  "IssueNumber": 1,
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
  "CreationDate": "20181001",
  "EffectiveDate": "20181001",
  "LastModifiedDate": "20181001 13:23:55",
  "RequestId": "ed557f02-c7d7-4c01-b3e5-11bf3239c8ed"
}
```


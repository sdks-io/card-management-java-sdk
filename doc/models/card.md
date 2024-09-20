
# Card

## Structure

`Card`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account ID | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `BundleId` | `String` | Optional | Bundle Id associated with card in the Gateway.<br /><br><br>This field will have null value if the card is not associated with any bundle in Gateway or the value of IncludeBundleDetails in request is false. | String getBundleId() | setBundleId(String bundleId) |
| `CardBlockSchedules` | [`List<CardBlockSchedule>`](../../doc/models/card-block-schedule.md) | Optional | List of Scheduled Card Blocks details<br /><br>Entity: CardBlockSchedule | List<CardBlockSchedule> getCardBlockSchedules() | setCardBlockSchedules(List<CardBlockSchedule> cardBlockSchedules) |
| `CardGroupId` | `Integer` | Optional | Card group ID | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card group name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `CardTypeCode` | `String` | Optional | ISO code of the card i.e. first 7 digits of the PAN | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeId` | `Integer` | Optional | Card Type ID Example Id and Description: 1 -Philippines CRT 7077861 2-Philippines<br /><br>Fleet 7002861 5-SHELL FLEET-HONG KONG 7002821 6-SHELL NHF- HONG KONG 7002821 7-SHELL CRT- HONG KONG 7077821 | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name Example Id and Description: 1-Philippines CRT 7077861 2-Philippines <br /><br>Fleet 7002861 5-SHELL FLEET- HONG KONG 7002821 6-SHELL NHF- HONG KONG 7002821 7-SHELL  CRT- HONG KONG 7077821 | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `ColCoCountryCode` | `String` | Optional | The 2 character ISO Code for the customer and card owning country. <br /><br>If default card type is not set then the first two alphabets of the account ID is returned. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `CreationDate` | `String` | Optional | Card Creation datetime.<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: Clients to convert this to appropriate DateTime type. | String getCreationDate() | setCreationDate(String creationDate) |
| `DriverName` | `String` | Optional | Driver name | String getDriverName() | setDriverName(String driverName) |
| `EffectiveDate` | `String` | Optional | Effective date for the Card<br /><br>Format: yyyyMMdd<br /><br>Note: Clients to convert this to appropriate DateTime type. | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card.<br /><br>Format: yyyyMMdd<br /><br>Note: Clients to convert this to appropriate DateTime type. | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `FleetIdInput` | `Boolean` | Optional | True/False True if fleet id input is enabled, else false | Boolean getFleetIdInput() | setFleetIdInput(Boolean fleetIdInput) |
| `IsCRT` | `Boolean` | Optional | True/False True if it is a CRT type card, else false | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True/False True if it is a Fleet type card, else false | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsInternational` | `Boolean` | Optional | True/False True if it is an international card, else false | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsNational` | `Boolean` | Optional | True/False True if it is a national card, else false | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True/False True if it is allowed at all partner sites, else false | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `IsShellSitesOnly` | `Boolean` | Optional | True/False True if it is only allowed at Shell sites, else false | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `IssueDate` | `String` | Optional | Issue date<br /><br>Format: yyyyMMdd<br /><br>Note: Clients to convert this to appropriate DateTime type. | String getIssueDate() | setIssueDate(String issueDate) |
| `IsSuperseded` | `Boolean` | Optional | True/False True if a new card is issued with the same PAN, else false. | Boolean getIsSuperseded() | setIsSuperseded(Boolean isSuperseded) |
| `IsVirtualCard` | `Boolean` | Optional | True/False True if it is a virtual card, else false | Boolean getIsVirtualCard() | setIsVirtualCard(Boolean isVirtualCard) |
| `LastModifiedDate` | `String` | Optional | Card last modified date and time<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: Clients to convert this to appropriate DateTime type. | String getLastModifiedDate() | setLastModifiedDate(String lastModifiedDate) |
| `LastUsedDate` | `String` | Optional | Card last used date .<br /><br>Note: last used date of a card will be calculated based on billed/unbilled sales items<br><br>      of a given card.The query that extracts the last used dates will be applied on the<br>    <br>      subset of the cards being returned to the client.Unbilled sales items is checked<br>    <br>      first and for those not found in the unbilled table, sales items will be checked<br>    <br>      (only when the last used date is not found in unbilled table for at least a single<br>    <br>      card from the result). The transactions in last 48 hours are not expected to be<br><br>Therefore this field gives the correct information up to 48 hours early.<br /><br>Format: yyyyMMdd HH:mm:ss<br /><br>Note: Clients to convert this to appropriate DateTime type | String getLastUsedDate() | setLastUsedDate(String lastUsedDate) |
| `LocalCurrencyCode` | `String` | Optional | ISO code of the local currency. <br /> | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Local currency symbol. <br /> | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `OdometerInput` | `Boolean` | Optional | True/False True if odometer input is enabled on the card, else false | Boolean getOdometerInput() | setOdometerInput(Boolean odometerInput) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `MaskedPAN` | `String` | Optional | Card PAN Mask PAN (Mask all digits except the Last 6 digits of the PAN) | String getMaskedPAN() | setMaskedPAN(String maskedPAN) |
| `PANID` | `Double` | Optional | Card PAN ID. | Double getPANID() | setPANID(Double pANID) |
| `PurchaseCategoryCode` | `String` | Optional | Purchase category code | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `PurchaseCategoryId` | `Integer` | Optional | Purchase category Id <br /><br>Note: Not Purchase code. | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `PurchaseCategoryName` | `String` | Optional | Purchase category name | String getPurchaseCategoryName() | setPurchaseCategoryName(String purchaseCategoryName) |
| `Reason` | `String` | Optional | Card Status reason Example: Lost Stolen Card no longer required | String getReason() | setReason(String reason) |
| `ReissueSetting` | `String` | Optional | Reissue setting of the card. If the card is superseded (i.e. a replacement/new card is issued) then reissue setting of the latest card issued. <br /><br>Values<br /><br>•True –Card will be Reissued when nearing its expiry date <br /><br>•False –Card will not be Reissued | String getReissueSetting() | setReissueSetting(String reissueSetting) |
| `StatusDescription` | `String` | Optional | Status Description (Active, Temporarily Blocked, etc.,)<br /><br>Possible Ids and description: 1 Active 7 Blocked Card 8 Expired 9 Cancelled 10 New 23 Pending Renewal 31 Replaced 41<br /><br>Temporary Block(Customer) 42 Temporary Block(Shell) 43 Fraud 101 Active(Block in progress)<br /><br><br>* 102 Blocked Card(Unblock in progress) <br /><br>* 103 Active(Cancel in progress) <br /><br>* 104 Active(Marked as damaged)<br /><br>* 105 New(Cancel in progress) <br /><br>* 106 { Status}(Scheduled for block)<br /><br>* 107 { Status}(Scheduled for unblock) <br /><br>  *# Note: Items marked with* are intermediate statuses  to indicate that there are pending requests in progress.<br /><br>  The response can contain these intermediate statuses only if the<br /><br>  IncludeIntermediateStatus flag is true. The placeholder { Status} in the items<br /><br>  marked with # will be replaced with the  status description. E.g., Active (Scheduled for block) | String getStatusDescription() | setStatusDescription(String statusDescription) |
| `StatusId` | `Integer` | Optional | Card Status id Possible Ids and description: 1 Active 7 Blocked Card 8 Expired 9 Cancelled 10 New 23 Pending Renewal 31 Replaced 41 Temporary Block(Customer) 42 <br /><br>Temporary Block(Shell) 43 Fraud 101 Active(Block in progress) <br /><br><br>* 102 Blocked Card(Unblock in progress)<br /><br>* 103 Active(Cancel in progress) <br /><br>* 104 Active(Marked as damaged) <br /><br>* 105 New(Cancel in progress)<br /><br>* 106 { Status}(Scheduled for block) <br /><br><br># 107 {Status}(Scheduled for unblock)<br /><br><br>*# Note: Items marked with* are intermediate statuses to indicate that there are pending requests in progress.<br /><br>The response can contain these intermediate statuses only if the IncludeIntermediateStatus flag is true.<br /><br>The placeholder { Status} in the items marked with # will be replaced with<br /><br>the status description. E.g., Active (Scheduled for block) | Integer getStatusId() | setStatusId(Integer statusId) |
| `TokenTypeID` | `Integer` | Optional | Token Type ID configured for the Card E.g. 107 | Integer getTokenTypeID() | setTokenTypeID(Integer tokenTypeID) |
| `TokenTypeName` | `String` | Optional | Token Type Name configured for the Card | String getTokenTypeName() | setTokenTypeName(String tokenTypeName) |
| `VRN` | `String` | Optional | Vehicle registration number | String getVRN() | setVRN(String vRN) |
| `ClientReferenceId` | `String` | Optional | Customer reference number of the card. | String getClientReferenceId() | setClientReferenceId(String clientReferenceId) |
| `IsEMVContact` | `Boolean` | Optional | Is Europay, MasterCard, and Visa Contact enabled or not. | Boolean getIsEMVContact() | setIsEMVContact(Boolean isEMVContact) |
| `IsEMVContactless` | `Boolean` | Optional | Is Europay, MasterCard, and Visa Contactless enabled or not. | Boolean getIsEMVContactless() | setIsEMVContactless(Boolean isEMVContactless) |
| `IsRFID` | `Boolean` | Optional | Whether the card type is enabled for RFID (Radio Frequency Identification) | Boolean getIsRFID() | setIsRFID(Boolean isRFID) |
| `RFIDUID` | `String` | Optional | RFIDUID | String getRFIDUID() | setRFIDUID(String rFIDUID) |
| `EMAID` | `String` | Optional | EMAID | String getEMAID() | setEMAID(String eMAID) |
| `EVPrintedNumber` | `String` | Optional | EV Printed Number | String getEVPrintedNumber() | setEVPrintedNumber(String eVPrintedNumber) |
| `CardMediaCode` | `String` | Optional | Card Media Code. | String getCardMediaCode() | setCardMediaCode(String cardMediaCode) |

## Example (as JSON)

```json
{
  "AccountId": 140,
  "AccountName": "AccountName0",
  "AccountNumber": "AccountNumber4",
  "AccountShortName": "AccountShortName6",
  "BundleId": "BundleId2"
}
```


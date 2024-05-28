
# Replace Card Settings

Request entity object for ReplaceCardSettings

## Structure

`ReplaceCardSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SelfSelectedEncryptedPIN` | `String` | Optional | The encrypted value of self-selected PIN.<br /><br>Optional – When not provided, the PIN will be auto generated(if the card token type supports PIN) and delivered based on the given PIN delivery option.<br /><br>Max Length: 256<br>**Constraints**: *Maximum Length*: `256` | String getSelfSelectedEncryptedPIN() | setSelfSelectedEncryptedPIN(String selfSelectedEncryptedPIN) |
| `SelfSelectedPINKeyID` | `String` | Optional | KeyId of the PIN encrypted value.<br /><br>Mandatory, if opted for self-selected PIN else optional.<br /><br>Max Length: 30<br>**Constraints**: *Maximum Length*: `30` | String getSelfSelectedPINKeyID() | setSelfSelectedPINKeyID(String selfSelectedPINKeyID) |
| `SelfSelectedPINSessionKey` | `String` | Optional | Encoded message of the TCS form which is used for encrypting the PIN of this card.<br /><br>The encode message forms are provided to clients by another API (“TCS”).<br /><br>Instructions to encrypt the PIN is covered in the related API specifications document.<br /><br>Mandatory –If opted for self-selected PIN else optional.<br>Max Length: 1024<br>**Constraints**: *Maximum Length*: `1024` | String getSelfSelectedPINSessionKey() | setSelfSelectedPINSessionKey(String selfSelectedPINSessionKey) |
| `ValidateFleetId` | `Boolean` | Optional | True/False.<br /><br>Optional <br /><br>Default: False<br /><br>For cards ordered with Validate Fleet Id parameter set to true, CFGW will be notified to enable this validation for the card.<br /><br>Note: When “FleetIdInputRequired” is not set on the card, validate fleet id will be considered false regardless of the value passed on this parameter. | Boolean getValidateFleetId() | setValidateFleetId(Boolean validateFleetId) |
| `CardGroupId` | `Integer` | Optional | Existing Card Group ID, under which the replacement card is to be created.<br /><br>Pass “-1” if the replacement card should not be assigned to any card group.<br /><br>Optional <br /><br>If not provided, the replacement card will be created under the same card group as the current card. | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardDeliveryType` | `Integer` | Required | Card delivery type.<br /><br>Mandatory <br /><br>Allowed Value: <br /><br><br>1. Customer Address(Default) <br /><br>2. New Delivery Address <br /><br>3. Old Card Address | Integer getCardDeliveryType() | setCardDeliveryType(Integer cardDeliveryType) |
| `DeliveryContactTitle` | `String` | Optional | Title of the contact person. <br /><br>Optional<br /><br>Max field length: 10<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryContactTitle() | setDeliveryContactTitle(String deliveryContactTitle) |
| `DeliveryContactName` | `String` | Optional | Name of the contact person <br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true.<br /><br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryContactName() | setDeliveryContactName(String deliveryContactName) |
| `DeliveryCompanyName` | `String` | Optional | Company name <br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true.<br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryCompanyName() | setDeliveryCompanyName(String deliveryCompanyName) |
| `DeliveryAddressLine1` | `String` | Optional | Address line 1 <br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true.<br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine1() | setDeliveryAddressLine1(String deliveryAddressLine1) |
| `DeliveryAddressLine2` | `String` | Optional | Address line 2 <br /><br>Optional <br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine2() | setDeliveryAddressLine2(String deliveryAddressLine2) |
| `DeliveryAddressLine3` | `String` | Optional | Address line 3 <br /><br>Optional<br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine3() | setDeliveryAddressLine3(String deliveryAddressLine3) |
| `DeliveryZipCode` | `String` | Optional | ZIP code <br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true.<br /><br>Max field length: 10<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryZipCode() | setDeliveryZipCode(String deliveryZipCode) |
| `DeliveryCity` | `String` | Optional | City  <br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true.<br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryCity() | setDeliveryCity(String deliveryCity) |
| `DeliveryRegionId` | `Integer` | Optional | Region Id  <br /><br>Optional | Integer getDeliveryRegionId() | setDeliveryRegionId(Integer deliveryRegionId) |
| `DeliveryRegion` | `String` | Optional | Region  <br /><br>Optional<br /><br>When region is passed | String getDeliveryRegion() | setDeliveryRegion(String deliveryRegion) |
| `DeliveryCountry` | `String` | Optional | The ISO code of the country.<br /><br>Mandatory - If CardDeliveryType  is 2 and OrderCardReplacement is passed as true | String getDeliveryCountry() | setDeliveryCountry(String deliveryCountry) |
| `DeliveryCountryId` | `Integer` | Optional | The countryId of gicen country.<br /> | Integer getDeliveryCountryId() | setDeliveryCountryId(Integer deliveryCountryId) |
| `PhoneNumber` | `String` | Optional | Phone number for to send SMS. <br /><br>Optional<br /><br>Max field length: 20<br>**Constraints**: *Maximum Length*: `16` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `EmailAddress` | `String` | Optional | Email address for to send email.<br /><br>Mandatory if PINAdviceType is email else optional.<br /><br>Max field length: 90<br>**Constraints**: *Maximum Length*: `90` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PINDeliveryAddressType` | `Integer` | Optional | PIN delivery address type selection.<br /><br>Optional<br /><br>Allowed Values:<br /><br><br>1. Customer Address(Default)<br /><br>2. Card Address<br /><br>3. New Delivery Address | Integer getPINDeliveryAddressType() | setPINDeliveryAddressType(Integer pINDeliveryAddressType) |
| `PINAdviceType` | `Integer` | Optional | PIN delivery method.<br /><br>Mandatory when OrderReplacement Is true.<br /><br>Allowed Values:<br /><br><br>1. Paper<br /><br>2. Email<br /><br>3. SMS<br /><br>4. None | Integer getPINAdviceType() | setPINAdviceType(Integer pINAdviceType) |
| `PINDeliveryContactTitle` | `String` | Optional | Title of the contact person.<br /><br>Optional <br /><br>Max field length: 10<br>**Constraints**: *Maximum Length*: `10` | String getPINDeliveryContactTitle() | setPINDeliveryContactTitle(String pINDeliveryContactTitle) |
| `PINDeliveryContactName` | `String` | Optional | Name of the contact person.<br /><br>Mandatory - If PINAdviceType is paper else optional.<br /><br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getPINDeliveryContactName() | setPINDeliveryContactName(String pINDeliveryContactName) |
| `PINDeliveryCompanyName` | `String` | Optional | Company name.<br /><br>Mandatory - If PINAdviceType is paper else optional.<br /><br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getPINDeliveryCompanyName() | setPINDeliveryCompanyName(String pINDeliveryCompanyName) |
| `PINDeliveryAddressLine1` | `String` | Optional | Address line 1.<br /><br>Mandatory - If PINAdviceType is paper else optional.<br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getPINDeliveryAddressLine1() | setPINDeliveryAddressLine1(String pINDeliveryAddressLine1) |
| `PINDeliveryAddressLine2` | `String` | Optional | Address line 2.<br /><br>Optional <br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getPINDeliveryAddressLine2() | setPINDeliveryAddressLine2(String pINDeliveryAddressLine2) |
| `PINDeliveryAddressLine3` | `String` | Optional | Address line 3.<br /><br>Optional <br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getPINDeliveryAddressLine3() | setPINDeliveryAddressLine3(String pINDeliveryAddressLine3) |
| `PINDeliveryZipCode` | `String` | Optional | ZIP code.<br /><br>Mandatory - if PINAdviceType is paper else optional. <br /><br>Max field length: 10<br>**Constraints**: *Maximum Length*: `10` | String getPINDeliveryZipCode() | setPINDeliveryZipCode(String pINDeliveryZipCode) |
| `PINDeliveryCity` | `String` | Optional | City.<br /><br>Mandatory - If PINAdviceType is paper else optional. <br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getPINDeliveryCity() | setPINDeliveryCity(String pINDeliveryCity) |
| `PINDeliveryRegionId` | `Integer` | Optional | Region Id.<br /><br>Optional | Integer getPINDeliveryRegionId() | setPINDeliveryRegionId(Integer pINDeliveryRegionId) |
| `PINDeliveryRegion` | `String` | Optional | Region.<br /><br>When region is passed | String getPINDeliveryRegion() | setPINDeliveryRegion(String pINDeliveryRegion) |
| `PINDeliveryCountry` | `String` | Optional | The ISO code of the country.<br /><br>Mappings for ISO code <br /><br>Mandatory if PINAdviceType is paper else optional. | String getPINDeliveryCountry() | setPINDeliveryCountry(String pINDeliveryCountry) |
| `PINDeliveryCountryId` | `Integer` | Optional | The countryId of the country.<br /><br>Mappings for ISO code<br /><br>This is not an input parameter. | Integer getPINDeliveryCountryId() | setPINDeliveryCountryId(Integer pINDeliveryCountryId) |
| `PINPhoneNumber` | `String` | Optional | Phone number for to send SMS of the PIN in case PINAdviceType is SMS.<br /><br>Mandatory if PINAdviceType is SMS else optional.<br /><br>Max field length: 20<br>**Constraints**: *Maximum Length*: `16` | String getPINPhoneNumber() | setPINPhoneNumber(String pINPhoneNumber) |
| `PINEmailAddress` | `String` | Optional | Email address for to send email of the PIN in case PINAdviceType is Email.<br /><br>Mandatory if PINAdviceType is email else optional.<br /><br>Max field length: 90<br>**Constraints**: *Maximum Length*: `90` | String getPINEmailAddress() | setPINEmailAddress(String pINEmailAddress) |
| `SaveForPINReminder` | `Boolean` | Optional | The given address will be used for sending PIN reminders in future when requested.<br /><br>PIN Advice type should be Paper<br>Optional | Boolean getSaveForPINReminder() | setSaveForPINReminder(Boolean saveForPINReminder) |
| `SaveForCardReissue` | `Boolean` | Optional | If this is specified, the contact address will be saved in cards platform for card reissue processing.<br /><br>Optional | Boolean getSaveForCardReissue() | setSaveForCardReissue(Boolean saveForCardReissue) |
| `ExpiryDate` | `String` | Optional | Expiry Date for newly created card to be update in cards plot form.<br /><br>Optional <br /><br>Format: MMyy <br /><br>Eg:1221 <br /><br>If not apply the default Expiry Date.<br /><br>Note:<br /><br>There is a limit to the ExpiryDate which the user can choose for the Card.<br>If the user chooses a later ExpiryDate than the allowed value for the CardType of the OU,<br>the background service logs the respective error code and description<br>**Constraints**: *Maximum Length*: `4` | String getExpiryDate() | setExpiryDate(String expiryDate) |

## Example (as JSON)

```json
{
  "SelfSelectedEncryptedPIN": "SelfSelectedEncryptedPIN8",
  "SelfSelectedPINKeyID": "SelfSelectedPINKeyID4",
  "SelfSelectedPINSessionKey": "SelfSelectedPINSessionKey2",
  "ValidateFleetId": false,
  "CardGroupId": 154,
  "CardDeliveryType": 38
}
```


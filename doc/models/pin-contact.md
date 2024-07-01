
# PIN Contact

## Structure

`PINContact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeliveryContactTitle` | `String` | Optional | Title of the contact person <br /><br>Optional<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryContactTitle() | setDeliveryContactTitle(String deliveryContactTitle) |
| `DeliveryContactName` | `String` | Optional | Name of the contact person <br /><br>Mandatory - If PINAdviceType is paper else optional. <br /><br>Max field length: 50  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryContactName() | setDeliveryContactName(String deliveryContactName) |
| `DeliveryCompanyName` | `String` | Optional | Company name <br /><br>Mandatory - If PINAdviceType is paper else optional. <br /><br>Max field length: 50  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryCompanyName() | setDeliveryCompanyName(String deliveryCompanyName) |
| `DeliveryAddressLine1` | `String` | Optional | Address line 1 <br /><br>Mandatory - if PINAdviceType is paper else optional.<br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine1() | setDeliveryAddressLine1(String deliveryAddressLine1) |
| `DeliveryAddressLine2` | `String` | Optional | Address line 2 <br /><br>Optional <br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine2() | setDeliveryAddressLine2(String deliveryAddressLine2) |
| `DeliveryAddressLine3` | `String` | Optional | Address line 3 <br /><br>Optional <br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine3() | setDeliveryAddressLine3(String deliveryAddressLine3) |
| `DeliveryZipCode` | `String` | Optional | ZIP code <br /><br>Mandatory - if PINAdviceType is paper else optional. <br /><br>Max field length: 10  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryZipCode() | setDeliveryZipCode(String deliveryZipCode) |
| `DeliveryCity` | `String` | Optional | City  <br /><br>Mandatory - If PINAdviceType is paper else optional. <br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryCity() | setDeliveryCity(String deliveryCity) |
| `DeliveryRegionId` | `Integer` | Optional | Region Id  <br /><br>Optional | Integer getDeliveryRegionId() | setDeliveryRegionId(Integer deliveryRegionId) |
| `DeliveryRegion` | `String` | Optional | Region  <br /><br>Optional<br /> | String getDeliveryRegion() | setDeliveryRegion(String deliveryRegion) |
| `DeliveryCountry` | `String` | Optional | The ISO code of the country.<br /><br>Mandatory if PINAdviceType is paper else optional. | String getDeliveryCountry() | setDeliveryCountry(String deliveryCountry) |
| `PhoneNumber` | `String` | Optional | Phone number for to send SMS of the PIN in case PINAdviceType is SMS.<br /><br>Mandatory if PINAdviceType is SMS else optional.<br /><br>Max field length: 20<br>**Constraints**: *Maximum Length*: `20` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `EmailAddress` | `String` | Optional | Email address for to send email of the PIN in case PINAdviceType is Email.<br /><br>Mandatory if PINAdviceType is email else optional.<br /><br>Max field length: 90. <br/>Note:Based on the international standard that there can be Max Length 64 before the @ (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)<br>**Constraints**: *Maximum Length*: `90` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `SaveForPINReminder` | `Boolean` | Optional | The given address will be used for sending PIN reminders in future when requested.<br /><br>Only allowed for paper delivery<br /><br>Optional | Boolean getSaveForPINReminder() | setSaveForPINReminder(Boolean saveForPINReminder) |

## Example (as JSON)

```json
{
  "DeliveryContactTitle": "DeliveryContactTitle2",
  "DeliveryContactName": "DeliveryContactName2",
  "DeliveryCompanyName": "DeliveryCompanyName4",
  "DeliveryAddressLine1": "DeliveryAddressLine16",
  "DeliveryAddressLine2": "DeliveryAddressLine28"
}
```



# Card Contact

## Structure

`CardContact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeliveryContactTitle` | `String` | Optional | Title of the contact person <br /><br>Optional<br>Max field length: 10<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryContactTitle() | setDeliveryContactTitle(String deliveryContactTitle) |
| `DeliveryContactName` | `String` | Required | Name of the contact person <br /><br>Mandatory  <br /><br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryContactName() | setDeliveryContactName(String deliveryContactName) |
| `DeliveryCompanyName` | `String` | Required | Company name <br /><br>Mandatory  <br /><br>Max field length: 50<br>**Constraints**: *Maximum Length*: `50` | String getDeliveryCompanyName() | setDeliveryCompanyName(String deliveryCompanyName) |
| `DeliveryAddressLine1` | `String` | Required | Address line 1 <br /><br>Mandatory<br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine1() | setDeliveryAddressLine1(String deliveryAddressLine1) |
| `DeliveryAddressLine2` | `String` | Optional | Address line 2 <br /><br>Optional <br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine2() | setDeliveryAddressLine2(String deliveryAddressLine2) |
| `DeliveryAddressLine3` | `String` | Optional | Address line 3 <br /><br>Optional <br /><br>Max field length: 40  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryAddressLine3() | setDeliveryAddressLine3(String deliveryAddressLine3) |
| `DeliveryZipCode` | `String` | Required | ZIP code <br /><br>Mandatory  <br /><br>Max field length: 10  <br /><br>Optional<br>**Constraints**: *Maximum Length*: `10` | String getDeliveryZipCode() | setDeliveryZipCode(String deliveryZipCode) |
| `DeliveryCity` | `String` | Required | City  <br /><br>Mandatory  <br /><br>Max field length: 40<br>**Constraints**: *Maximum Length*: `40` | String getDeliveryCity() | setDeliveryCity(String deliveryCity) |
| `DeliveryRegionId` | `Integer` | Optional | Region Id  <br /><br>Optional | Integer getDeliveryRegionId() | setDeliveryRegionId(Integer deliveryRegionId) |
| `DeliveryRegion` | `String` | Optional | Region  <br /><br>Optional<br /><br>When region is passed | String getDeliveryRegion() | setDeliveryRegion(String deliveryRegion) |
| `DeliveryCountry` | `String` | Required | The ISO code of the country.<br /> | String getDeliveryCountry() | setDeliveryCountry(String deliveryCountry) |
| `PhoneNumber` | `String` | Optional | Phone number for courier delivery.<br /><br>Optional.<br /><br>Max field length: 20<br>**Constraints**: *Maximum Length*: `20` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `EmailAddress` | `String` | Optional | Email address for courier delivery.<br /><br>Optional.<br /><br>Max field length: 90 <br/>Note:Based on the international standard that there can be Max Length 64 before the @ (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2)<br>**Constraints**: *Maximum Length*: `90` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `SaveForCardReissue` | `Boolean` | Optional | If this is specified, the contact address will be saved in cards platform for card reissue processing.<br /><br>Optional | Boolean getSaveForCardReissue() | setSaveForCardReissue(Boolean saveForCardReissue) |

## Example (as JSON)

```json
{
  "DeliveryContactTitle": "DeliveryContactTitle4",
  "DeliveryContactName": "DeliveryContactName0",
  "DeliveryCompanyName": "DeliveryCompanyName2",
  "DeliveryAddressLine1": "DeliveryAddressLine18",
  "DeliveryAddressLine2": "DeliveryAddressLine20",
  "DeliveryAddressLine3": "DeliveryAddressLine32",
  "DeliveryZipCode": "DeliveryZipCode0",
  "DeliveryCity": "DeliveryCity2",
  "DeliveryRegionId": 152,
  "DeliveryRegion": "DeliveryRegion4",
  "DeliveryCountry": "DeliveryCountry0"
}
```


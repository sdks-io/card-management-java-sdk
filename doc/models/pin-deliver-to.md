
# PIN Deliver To

## Structure

`PINDeliverTo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContactName` | `String` | Optional | Contact Name<br>Max Length: 50 | String getContactName() | setContactName(String contactName) |
| `ContactTitle` | `String` | Optional | Contact Title<br>Max Length: 50 | String getContactTitle() | setContactTitle(String contactTitle) |
| `CompanyName` | `String` | Required | Company Name for PIN delivery.<br>Max Length: 50 | String getCompanyName() | setCompanyName(String companyName) |
| `AddressLine` | `String` | Required | Address Lines<br>Max Length: 1024 | String getAddressLine() | setAddressLine(String addressLine) |
| `ZipCode` | `String` | Required | Zip Code<br>Max Length: 10 | String getZipCode() | setZipCode(String zipCode) |
| `City` | `String` | Required | City<br>Max Length: 40 | String getCity() | setCity(String city) |
| `RegionID` | `Integer` | Optional | Region | Integer getRegionID() | setRegionID(Integer regionID) |
| `CountryID` | `Integer` | Optional | Country | Integer getCountryID() | setCountryID(Integer countryID) |
| `PhoneNumber` | `String` | Optional | Cardholder phone number for PIN delivery. | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `EmailAddress` | `String` | Optional | Cardholder email address for PIN delivery<br>Max Length : 90<br>Example: xxxxxx@example.com <br/>Note:Based on the international standard that there can be Max Length 64 before the @ (the 'Local part’) =64(minimum of 1) Max Lenth after the (the domain) = 88 (Minimum of 2) | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `SavePINReminder` | `Boolean` | Optional | Save PIN Reminder<br>If SavePINReminder is true, the contact address will be saved database for PIN reminder.<br><br><br/>Only allowed for PIN Advice paper delivery. | Boolean getSavePINReminder() | setSavePINReminder(Boolean savePINReminder) |

## Example (as JSON)

```json
{
  "ContactName": "ContactName0",
  "ContactTitle": "ContactTitle6",
  "CompanyName": "CompanyName2",
  "AddressLine": "AddressLine6",
  "ZipCode": "ZipCode4",
  "City": "City0",
  "RegionID": 6,
  "CountryID": 136,
  "PhoneNumber": "PhoneNumber4"
}
```


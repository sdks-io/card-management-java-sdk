
# Update Card Renewal Address

Delivery address of card. This address will be used for card reissue and PIN reminders in future.
Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.

## Structure

`UpdateCardRenewalAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContactName` | `String` | Required | Contact name<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.<br><br>Max Length: 50 | String getContactName() | setContactName(String contactName) |
| `ContactTitle` | `String` | Optional | Title<br>Max Length: 50 | String getContactTitle() | setContactTitle(String contactTitle) |
| `CompanyName` | `String` | Required | Company name.<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.<br>Max Length: 50 | String getCompanyName() | setCompanyName(String companyName) |
| `AddressLine` | `String` | Required | Address line 1,2 and 3<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.<br>Max Length: 128<br>Note: -Each address line should be separated by “\r\n”. | String getAddressLine() | setAddressLine(String addressLine) |
| `ZipCode` | `String` | Required | ZipCode<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.<br>Max Length: 10 | String getZipCode() | setZipCode(String zipCode) |
| `City` | `String` | Optional | City<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise.<br>Max Length: 40 | String getCity() | setCity(String city) |
| `RegionID` | `Integer` | Optional | Region id of card. | Integer getRegionID() | setRegionID(Integer regionID) |
| `CountryID` | `int` | Required | Country ID<br>Note: Mandatory when ‘UseCustomerDefaultAddress’ is set to ‘false’. The field is ignored otherwise. | int getCountryID() | setCountryID(int countryID) |
| `EmailAddress` | `String` | Optional | Email Address<br><br>Max Length: 90<br>Note: -<br>Based on the international standard that there can be<br>•    Max Length 64 before the @ (the 'Local part’) =64(minimum of 1)<br>•    Max Lenth after the (the domain) = 88 (Minimum of 2) | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PhoneNumber` | `String` | Optional | Phone number<br>Optional<br>Max Length: 16 | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |

## Example (as JSON)

```json
{
  "ContactName": "Jack",
  "ContactTitle": "Mr",
  "CompanyName": "Travel Transport",
  "AddressLine": "Elm Street 11",
  "ZipCode": "1023EA",
  "City": "London",
  "RegionID": 2,
  "CountryID": 8,
  "EmailAddress": "testmail@gmail.com",
  "PhoneNumber": "+99999999999"
}
```


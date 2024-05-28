
# Address

## Structure

`Address`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressId` | `Integer` | Optional | Address Id in cards platform. | Integer getAddressId() | setAddressId(Integer addressId) |
| `AddressLine1` | `String` | Optional | Address line1 | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Address line2 | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | AddressLine3 | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `ZipCode` | `String` | Optional | ZipCode | String getZipCode() | setZipCode(String zipCode) |
| `City` | `String` | Optional | City | String getCity() | setCity(String city) |
| `RegionId` | `Integer` | Optional | Region Id of the address. | Integer getRegionId() | setRegionId(Integer regionId) |
| `CountryISOCode` | `String` | Optional | Country ISO code of the address | String getCountryISOCode() | setCountryISOCode(String countryISOCode) |
| `Country` | `String` | Optional | Country for the address | String getCountry() | setCountry(String country) |
| `Telephone` | `String` | Optional | Telephone number of the address contact | String getTelephone() | setTelephone(String telephone) |
| `EmailAddress` | `String` | Optional | Email address of the address contact | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `Fax` | `String` | Optional | Fax number of the address contact | String getFax() | setFax(String fax) |

## Example (as JSON)

```json
{
  "AddressId": 1,
  "AddressLine1": "test street",
  "AddressLine2": "Address line2",
  "AddressLine3": "AddressLine3",
  "ZipCode": "667 78",
  "City": "LUMPUR",
  "RegionId": 1234,
  "CountryISOCode": "CZ",
  "Country": "Germany",
  "Telephone": "3245872364823",
  "EmailAddress": "testmail@gmail.com",
  "Fax": "3245872364823"
}
```



# Delivery Addresses

## Structure

`DeliveryAddresses`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressId` | `Integer` | Optional | Address Id | Integer getAddressId() | setAddressId(Integer addressId) |
| `AddressLine1` | `String` | Optional | AddressLine1 | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | AddressLine2 | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | AddressLine3 | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `City` | `String` | Optional | City | String getCity() | setCity(String city) |
| `CompanyName` | `String` | Optional | Account Name | String getCompanyName() | setCompanyName(String companyName) |
| `ContactForeName` | `String` | Optional | Contact fore name of the delivery address. | String getContactForeName() | setContactForeName(String contactForeName) |
| `ContactLastName` | `String` | Optional | Contact last name of the delivery address. | String getContactLastName() | setContactLastName(String contactLastName) |
| `ContactMiddleName` | `String` | Optional | Contact middle name of the delivery address. | String getContactMiddleName() | setContactMiddleName(String contactMiddleName) |
| `ContactTitle` | `String` | Optional | ContactTitle | String getContactTitle() | setContactTitle(String contactTitle) |
| `Country` | `String` | Optional | Country | String getCountry() | setCountry(String country) |
| `CountryId` | `Integer` | Optional | Country Id | Integer getCountryId() | setCountryId(Integer countryId) |
| `CountryISOCode` | `String` | Optional | Country ISO code | String getCountryISOCode() | setCountryISOCode(String countryISOCode) |
| `Fax` | `String` | Optional | Fax number of the address contact. | String getFax() | setFax(String fax) |
| `Region` | `String` | Optional | Region of the Card Delivery address | String getRegion() | setRegion(String region) |
| `RegionId` | `Integer` | Optional | Region Id of the address. | Integer getRegionId() | setRegionId(Integer regionId) |
| `Telephone` | `String` | Optional | Telephone number of the address contact | String getTelephone() | setTelephone(String telephone) |
| `ZipCode` | `String` | Optional | Delivery Zip code | String getZipCode() | setZipCode(String zipCode) |
| `AddressType` | `Integer` | Optional | Delivery address type.<br>Possible Values:<br>1 – Card and PIN delivery address<br>2 – Card delivery address<br>3 – PIN delivery address | Integer getAddressType() | setAddressType(Integer addressType) |

## Example (as JSON)

```json
{
  "AddressId": 1,
  "AddressLine1": "AddressLine1",
  "AddressLine2": "AddressLine2",
  "AddressLine3": "AddressLine3",
  "City": "germany",
  "CompanyName": "5.11.3 DE",
  "ContactForeName": "5.11.13 DE",
  "ContactLastName": "SAM",
  "ContactMiddleName": "SAM",
  "ContactTitle": "Mr",
  "Country": "Germany",
  "CountryId": 9,
  "CountryISOCode": "DE",
  "Fax": "657875",
  "Region": "Germany",
  "RegionId": 133,
  "Telephone": "78787786868",
  "ZipCode": "E14 5HQ",
  "AddressType": 1
}
```


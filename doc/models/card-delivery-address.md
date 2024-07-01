
# Card Delivery Address

## Structure

`CardDeliveryAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContactForeName` | `String` | Optional | Fore name of the contact person | String getContactForeName() | setContactForeName(String contactForeName) |
| `ContactMiddleName` | `String` | Optional | Middle name of the contact person | String getContactMiddleName() | setContactMiddleName(String contactMiddleName) |
| `ContactLastName` | `String` | Optional | Last name of the contact person | String getContactLastName() | setContactLastName(String contactLastName) |
| `ContactTitle` | `String` | Optional | Title of the contact person Optional Max field length- 10 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request.<br>**Constraints**: *Maximum Length*: `10` | String getContactTitle() | setContactTitle(String contactTitle) |
| `CompanyName` | `String` | Required | Company name Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request. | String getCompanyName() | setCompanyName(String companyName) |
| `AddressId` | `int` | Required | Address Id in cards platform. | int getAddressId() | setAddressId(int addressId) |
| `AddressLine1` | `String` | Required | Address line 1 Mandatory if IsNewDeliveryAddress and OrderReplacement are passed True. Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request.<br>**Constraints**: *Minimum Length*: `1` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Address line 2 Optional Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request. | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | Address line Optional Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request. | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `ZipCode` | `String` | Required | ZIP code Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. True, Max field length- 10 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request.<br>**Constraints**: *Maximum Length*: `10` | String getZipCode() | setZipCode(String zipCode) |
| `City` | `String` | Optional | City Max field length- 40 Note- If the Shell Card Platform configuration is set to clear the personal details captured on card orders, this value will be cleared from the record after processing the request.<br>**Constraints**: *Maximum Length*: `40` | String getCity() | setCity(String city) |
| `RegionId` | `Integer` | Optional | Region Id | Integer getRegionId() | setRegionId(Integer regionId) |
| `Region` | `String` | Optional | Region Optional When region is passed, Shell Card Platform will look up for the region id for the given region.  If the option to clear personal details is set in the Shell Card Platform, then this value will be cleared from the record after processing the request . | String getRegion() | setRegion(String region) |
| `CountryId` | `int` | Required | Country Id in cards platform. | int getCountryId() | setCountryId(int countryId) |
| `CountryISOCode` | `String` | Required | The ISO code of the country. Mandatory if IsNewDeliveryAddress and OrderReplacement are passed. If the option to clear personal details is set in the Shell Card Platform, then this value will be cleared from the record after processing the request . | String getCountryISOCode() | setCountryISOCode(String countryISOCode) |
| `Country` | `String` | Required | Country name. | String getCountry() | setCountry(String country) |

## Example (as JSON)

```json
{
  "ContactForeName": "ROBERT",
  "ContactMiddleName": "M",
  "ContactLastName": "Langdon",
  "ContactTitle": "Mr.",
  "CompanyName": "PARKLEY Philippines",
  "AddressId": 1768,
  "AddressLine1": "No 345, 1st cross,",
  "AddressLine2": "10th avenue",
  "AddressLine3": "makati city",
  "ZipCode": "1630",
  "City": "manila",
  "Region": "EU",
  "CountryId": 1,
  "CountryISOCode": "PH",
  "Country": "Philippines"
}
```


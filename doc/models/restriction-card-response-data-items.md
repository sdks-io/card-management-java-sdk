
# Restriction Card Response Data Items

## Structure

`RestrictionCardResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the customer. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `DayTimeRestrictionDescription` | `String` | Optional | This field will have a value only when “DayTimeRestrictionStatus” is “Failed”. | String getDayTimeRestrictionDescription() | setDayTimeRestrictionDescription(String dayTimeRestrictionDescription) |
| `DayTimeRestrictionStatus` | `String` | Optional | Status of the card day/time restriction submitted to API. Based on the response from API value will be set as either “Success” or “Failed”. | String getDayTimeRestrictionStatus() | setDayTimeRestrictionStatus(String dayTimeRestrictionStatus) |
| `LocationRestrictionDescription` | `String` | Optional | This field will have a value only when “LocationRestrictionStatus” is “Failed”. | String getLocationRestrictionDescription() | setLocationRestrictionDescription(String locationRestrictionDescription) |
| `LocationRestrictionStatus` | `String` | Optional | Card Location restriction submitted to gateway based on gateway response value set as “Success” or “Failed”. | String getLocationRestrictionStatus() | setLocationRestrictionStatus(String locationRestrictionStatus) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `ProductRestrictionDescription` | `String` | Optional | This field will have a value only when “ProductRestrictionStatus” is “Failed”. | String getProductRestrictionDescription() | setProductRestrictionDescription(String productRestrictionDescription) |
| `ProductRestrictionStatus` | `String` | Optional | Status of the card product restriction submitted | String getProductRestrictionStatus() | setProductRestrictionStatus(String productRestrictionStatus) |
| `UsageRestrictionDescription` | `String` | Optional | This field will have a value only when “UsageRestrictionStatus” is “Failed”. | String getUsageRestrictionDescription() | setUsageRestrictionDescription(String usageRestrictionDescription) |
| `UsageRestrictionStatus` | `String` | Optional | Status of the card usage restriction submitted | String getUsageRestrictionStatus() | setUsageRestrictionStatus(String usageRestrictionStatus) |
| `ValidationErrorCode` | `String` | Optional | Error code for validation failure.<br>Example error codes:<br>0007, 9007, 7000, 7001. | String getValidationErrorCode() | setValidationErrorCode(String validationErrorCode) |
| `ValidationErrorDescription` | `String` | Optional | Description of validation failure. | String getValidationErrorDescription() | setValidationErrorDescription(String validationErrorDescription) |

## Example (as JSON)

```json
{
  "AccountId": 182,
  "AccountNumber": "AccountNumber8",
  "CardId": 88,
  "DayTimeRestrictionDescription": "DayTimeRestrictionDescription8",
  "DayTimeRestrictionStatus": "DayTimeRestrictionStatus8"
}
```


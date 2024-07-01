
# Restrictioncards Res

## Structure

`RestrictioncardsRes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CardId` | `String` | Optional | Unique Card Id<br>Example: 275549 | String getCardId() | setCardId(String cardId) |
| `PAN` | `String` | Optional | Card PAN.<br>Example: 7002051006629890645 | String getPAN() | setPAN(String pAN) |
| `UsageRestrictionStatus` | `String` | Optional | Status of the card usage restriction submitted. Based on the response the value will be set as either “Success” or “Failed”. | String getUsageRestrictionStatus() | setUsageRestrictionStatus(String usageRestrictionStatus) |
| `UsageRestrictionDescription` | `String` | Optional | Response for the usage restriction in case of an error. This field will have a value only when “UsageRestrictionStatus” is “Failed”. | String getUsageRestrictionDescription() | setUsageRestrictionDescription(String usageRestrictionDescription) |
| `DayTimeRestrictionStatus` | `String` | Optional | Status of the card day/time restriction submitted. Based on the response from Gateway value will be set as either “Success” or “Failed”. | String getDayTimeRestrictionStatus() | setDayTimeRestrictionStatus(String dayTimeRestrictionStatus) |
| `DayTimeRestrictionDescription` | `String` | Optional | Response for the day/time restriction in case of an error. This field will have a value only when “DayTimeRestrictionStatus” is “Failed”. | String getDayTimeRestrictionDescription() | setDayTimeRestrictionDescription(String dayTimeRestrictionDescription) |
| `ProductRestrictionStatus` | `String` | Optional | Status of the card product restriction submitted. Based on the response  the value will be set  either as “Success” or “Failed”. | String getProductRestrictionStatus() | setProductRestrictionStatus(String productRestrictionStatus) |
| `ProductRestrictionDescription` | `String` | Optional | Response for the product restriction in case of an error. This field will have a value only when “ProductRestrictionStatus” is “Failed”. | String getProductRestrictionDescription() | setProductRestrictionDescription(String productRestrictionDescription) |
| `LocationRestrictionStatus` | `String` | Optional | Card Location restriction submitted, based on response value set as “Success” or “Failed”. | String getLocationRestrictionStatus() | setLocationRestrictionStatus(String locationRestrictionStatus) |
| `LocationRestrictionStatusDescription` | `String` | Optional | Response for the location restriction in case of an error. This field will have a value only when “LocationRestrictionStatus” is “Failed”. | String getLocationRestrictionStatusDescription() | setLocationRestrictionStatusDescription(String locationRestrictionStatusDescription) |
| `ValidationErrorCode` | `String` | Optional | Error code for validation failure. | String getValidationErrorCode() | setValidationErrorCode(String validationErrorCode) |
| `ValidationErrorDescription` | `String` | Optional | Description of validation failure. | String getValidationErrorDescription() | setValidationErrorDescription(String validationErrorDescription) |

## Example (as JSON)

```json
{
  "AccountId": 148,
  "AccountNumber": "AccountNumber0",
  "CardId": "CardId0",
  "PAN": "PAN2",
  "UsageRestrictionStatus": "UsageRestrictionStatus0"
}
```


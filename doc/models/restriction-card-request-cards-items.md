
# Restriction Card Request Cards Items

## Structure

`RestrictionCardRequestCardsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed, else Mandatory.<br>This input is a search criterion, if given.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Optional if AccountNumber is passed, else Mandatory.<br>This input is a search criterion, if given.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `PAN` | `String` | Optional | Card PAN.<br>Optional if CardId is given, else mandatory.<br>Example: 7002051006629890645<br>Note:<br>•	PAN is ignored if CardId is given.<br>When PAN matches with multiple cards, the restriction will be applied on the latest issued card. | String getPAN() | setPAN(String pAN) |
| `CardId` | `Integer` | Optional | Unique Card Id<br>Optional if PAN is given, else mandatory.<br>Example: 275549 | Integer getCardId() | setCardId(Integer cardId) |
| `ResetUsageRestrictions` | `Boolean` | Optional | True/False.<br>If true, the usage restrictions applied on the card in Gateway will be reset to Customer Card Type level max limits, if there are no customer level overrides available then OU card type max limits. Else, the card restrictions will be updated with the usage restrictions provided in the API. | Boolean getResetUsageRestrictions() | setResetUsageRestrictions(Boolean resetUsageRestrictions) |
| `ResetDayTimeRestrictions` | `Boolean` | Optional | True/False.<br>If true, the Day/Time restrictions applied on the card will be deleted. Else, the card restrictions will be updated with the day/time restrictions provided in the API. | Boolean getResetDayTimeRestrictions() | setResetDayTimeRestrictions(Boolean resetDayTimeRestrictions) |
| `ResetProductRestrictions` | `Boolean` | Optional | True/False.<br>If true, Default fuel/non-fuel sets configured at the purchase category level will be applied to the card. Else, the card will be applied with product restrictions provided in the API. | Boolean getResetProductRestrictions() | setResetProductRestrictions(Boolean resetProductRestrictions) |
| `ResetLocationRestrictions` | `Boolean` | Optional | True/False.<br>If true, the location restrictions applied on the card will be deleted. Else, the card restrictions will be updated with the location restrictions provided in the API. | Boolean getResetLocationRestrictions() | setResetLocationRestrictions(Boolean resetLocationRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestrictions`](../../doc/models/day-time-restrictions.md) | Optional | Day/time restrictions such as weekdays and time range to be applied on the bundle.<br>Mandatory if respective action is set as “Add”.<br>The details of DayTimeRestriction entity is given below. | DayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestrictions dayTimeRestrictions) |
| `LocationRestrictions` | [`LocationRestrictions`](../../doc/models/location-restrictions.md) | Optional | Location restrictions to be applied on the bundle which either allows or restricts using the cards, which are under the bundle, in the specified locations.<br>Mandatory if respective action is set as “Add”.<br>Details of location restrictions are given below. | LocationRestrictions getLocationRestrictions() | setLocationRestrictions(LocationRestrictions locationRestrictions) |
| `ProductRestrictions` | [`ProductRestrictions`](../../doc/models/product-restrictions.md) | Optional | - | ProductRestrictions getProductRestrictions() | setProductRestrictions(ProductRestrictions productRestrictions) |
| `UsageRestrictions` | [`UsageRestrictions`](../../doc/models/usage-restrictions.md) | Optional | - | UsageRestrictions getUsageRestrictions() | setUsageRestrictions(UsageRestrictions usageRestrictions) |

## Example (as JSON)

```json
{
  "AccountNumber": "AccountNumber4",
  "AccountId": 114,
  "PAN": "PAN6",
  "CardId": 20,
  "ResetUsageRestrictions": false
}
```


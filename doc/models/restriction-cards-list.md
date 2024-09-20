
# Restriction Cards List

## Structure

`RestrictionCardsList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Optional if AccountNumber is passed, else Mandatory.<br>This input is a search criterion, if given.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Card PAN.<br>Optional if CardId is given, else mandatory.<br>Example: 7002051006629890645<br>Note:<br>•    PAN is ignored if CardId is given.<br>When PAN matches with multiple cards, the restriction will be applied on the latest issued card. | String getPAN() | setPAN(String pAN) |
| `ResetUsageRestrictions` | `Boolean` | Optional | True/False.<br>If true, the usage restrictions applied on the card in Gateway will be reset to Customer Card Type level max limits, if there are no customer level overrides available then OU card type max limits. Else, the card restrictions will be updated with the usage restrictions provided in the API.<br>This property is not dependent on IsVelocityCeiling or SetDefaultOnVelocityUpdate flags. | Boolean getResetUsageRestrictions() | setResetUsageRestrictions(Boolean resetUsageRestrictions) |
| `ResetDayTimeRestrictions` | `Boolean` | Optional | True/False.<br>If true, the Day/Time restrictions applied on the card will be deleted. Else, the card restrictions will be updated with the day/time restrictions provided in the API. | Boolean getResetDayTimeRestrictions() | setResetDayTimeRestrictions(Boolean resetDayTimeRestrictions) |
| `ResetProductRestrictions` | `Boolean` | Optional | True/False.<br>If true, Default fuel/non-fuel sets configured at the purchase category level will be applied to the card. Else, the card will be applied with product restrictions provided in the API. | Boolean getResetProductRestrictions() | setResetProductRestrictions(Boolean resetProductRestrictions) |
| `ResetLocationRestrictions` | `Boolean` | Optional | True/False.<br>If true, the location restrictions applied on the card will be deleted. Else, the card restrictions will be updated with the location restrictions provided in the API. | Boolean getResetLocationRestrictions() | setResetLocationRestrictions(Boolean resetLocationRestrictions) |
| `UsageRestrictions` | `Object` | Optional | - | Object getUsageRestrictions() | setUsageRestrictions(Object usageRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestrictions`](../../doc/models/day-time-restrictions.md) | Optional | - | DayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestrictions dayTimeRestrictions) |
| `ProductRestrictions` | `Object` | Optional | - | Object getProductRestrictions() | setProductRestrictions(Object productRestrictions) |
| `LocationRestrictions` | [`LocationRestriction`](../../doc/models/location-restriction.md) | Optional | - | LocationRestriction getLocationRestrictions() | setLocationRestrictions(LocationRestriction locationRestrictions) |

## Example (as JSON)

```json
{
  "AccountId": 84,
  "CardId": 246,
  "PAN": "PAN8",
  "ResetUsageRestrictions": false,
  "ResetDayTimeRestrictions": false
}
```


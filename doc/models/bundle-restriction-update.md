
# Bundle Restriction Update

## Structure

`BundleRestrictionUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResetDayTimeRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the day/time restriction is to be reset for card bundle.<br>Optional<br>Default value is False. | Boolean getResetDayTimeRestriction() | setResetDayTimeRestriction(Boolean resetDayTimeRestriction) |
| `ResetLocationRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the location restriction is to be reset for card bundle.<br>Optional<br>Default value is False. | Boolean getResetLocationRestriction() | setResetLocationRestriction(Boolean resetLocationRestriction) |
| `ResetProductRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the product restriction is to be reset for card bundle.<br>Optional<br>Default value is False. | Boolean getResetProductRestriction() | setResetProductRestriction(Boolean resetProductRestriction) |
| `UsageRestrictions` | [`UsageRestrictionsCard`](../../doc/models/usage-restrictions-card.md) | Optional | - | UsageRestrictionsCard getUsageRestrictions() | setUsageRestrictions(UsageRestrictionsCard usageRestrictions) |
| `DayTimeRestrictionProfileId` | `String` | Optional | Identifier of the day/time restriction profile to be updated for the bundle in Gateway.<br>Optional | String getDayTimeRestrictionProfileId() | setDayTimeRestrictionProfileId(String dayTimeRestrictionProfileId) |
| `DayTimeRestrictions` | [`CardDayTimeRestrictions`](../../doc/models/card-day-time-restrictions.md) | Optional | - | CardDayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(CardDayTimeRestrictions dayTimeRestrictions) |
| `ProductRestrictions` | [`ProductRestrictionCard`](../../doc/models/product-restriction-card.md) | Optional | - | ProductRestrictionCard getProductRestrictions() | setProductRestrictions(ProductRestrictionCard productRestrictions) |
| `LocationRestrictionProfileId` | `String` | Optional | Identifier of the location restriction profile to be updated for the bundle in Gateway.<br>Optional | String getLocationRestrictionProfileId() | setLocationRestrictionProfileId(String locationRestrictionProfileId) |
| `LocationRestrictions` | [`LocationRestriction`](../../doc/models/location-restriction.md) | Optional | - | LocationRestriction getLocationRestrictions() | setLocationRestrictions(LocationRestriction locationRestrictions) |

## Example (as JSON)

```json
{
  "ResetDayTimeRestriction": false,
  "ResetLocationRestriction": false,
  "ResetProductRestriction": false,
  "UsageRestrictions": {
    "DailySpend": 7.72,
    "WeeklySpend": 10.22,
    "MonthlySpend": 48.66,
    "PerTransactionSpend": 17.28,
    "AnnualSpend": 223.08
  },
  "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId2"
}
```


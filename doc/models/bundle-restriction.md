
# Bundle Restriction

## Structure

`BundleRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResetDayTimeRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the day/time restriction is to be reset for card bundle.<br>Optional<br>Default value is False.<br>**Default**: `false` | Boolean getResetDayTimeRestriction() | setResetDayTimeRestriction(Boolean resetDayTimeRestriction) |
| `ResetLocationRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the location restriction is to be reset for card bundle.<br>Optional<br>Default value is False.<br>**Default**: `false` | Boolean getResetLocationRestriction() | setResetLocationRestriction(Boolean resetLocationRestriction) |
| `ResetProductRestriction` | `Boolean` | Optional | True/False<br>A value indicates if the product restriction is to be reset for card bundle.<br>Optional<br>Default value is False.<br>**Default**: `false` | Boolean getResetProductRestriction() | setResetProductRestriction(Boolean resetProductRestriction) |
| `UsageRestrictions` | [`UsageRestrictions`](../../doc/models/usage-restrictions.md) | Optional | - | UsageRestrictions getUsageRestrictions() | setUsageRestrictions(UsageRestrictions usageRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestrictions`](../../doc/models/day-time-restrictions.md) | Optional | Day/time restrictions such as weekdays and time range to be applied on the bundle.<br>Mandatory if respective action is set as “Add”.<br>The details of DayTimeRestriction entity is given below. | DayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestrictions dayTimeRestrictions) |
| `ProductRestriction` | [`ProductRestrictions`](../../doc/models/product-restrictions.md) | Optional | - | ProductRestrictions getProductRestriction() | setProductRestriction(ProductRestrictions productRestriction) |
| `LocationRestrictionProfileId` | `String` | Optional | Identifier of the location restriction profile to be updated for the bundle in Gateway.<br>Optional | String getLocationRestrictionProfileId() | setLocationRestrictionProfileId(String locationRestrictionProfileId) |
| `LocationRestrictions` | [`LocationRestrictions`](../../doc/models/location-restrictions.md) | Optional | Location restrictions to be applied on the bundle which either allows or restricts using the cards, which are under the bundle, in the specified locations.<br>Mandatory if respective action is set as “Add”.<br>Details of location restrictions are given below. | LocationRestrictions getLocationRestrictions() | setLocationRestrictions(LocationRestrictions locationRestrictions) |

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
    "DailyVolume": 122
  },
  "DayTimeRestrictions": {
    "Friday": false,
    "Monday": false,
    "Saturday": false,
    "Sunday": false,
    "Thursday": false
  }
}
```

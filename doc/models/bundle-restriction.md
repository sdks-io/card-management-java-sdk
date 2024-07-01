
# Bundle Restriction

## Structure

`BundleRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DayTimeRestrictionAction` | `String` | Optional | The value indicates what actions to be performed with respect to day time restriction.<br>Mandatory<br>Allowed values –<br>•	Add: Apply the given restriction on the bundle.<br>•	Default: No Day/Time restriction will be applied on the bundle in Gateway. | String getDayTimeRestrictionAction() | setDayTimeRestrictionAction(String dayTimeRestrictionAction) |
| `LocationRestrictionAction` | `String` | Optional | The value indicates what actions to be performed with respect to location restriction.<br>Mandatory<br>Allowed values –<br>•	Add: Apply the given restriction on the bundle.<br>•	Default: No location restriction will be applied on the bundle in Gateway. | String getLocationRestrictionAction() | setLocationRestrictionAction(String locationRestrictionAction) |
| `UsageRestrictions` | [`UsageRestrictionsCard`](../../doc/models/usage-restrictions-card.md) | Optional | - | UsageRestrictionsCard getUsageRestrictions() | setUsageRestrictions(UsageRestrictionsCard usageRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestriction`](../../doc/models/day-time-restriction.md) | Optional | Details of the day/time restrictions such as weekdays and time range in which transactions should be allowed on the card. | DayTimeRestriction getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestriction dayTimeRestrictions) |
| `ProductRestrictions` | [`ProductRestrictionCard`](../../doc/models/product-restriction-card.md) | Optional | - | ProductRestrictionCard getProductRestrictions() | setProductRestrictions(ProductRestrictionCard productRestrictions) |
| `LocationRestrictions` | [`LocationRestriction`](../../doc/models/location-restriction.md) | Optional | - | LocationRestriction getLocationRestrictions() | setLocationRestrictions(LocationRestriction locationRestrictions) |

## Example (as JSON)

```json
{
  "DayTimeRestrictionAction": "DayTimeRestrictionAction8",
  "LocationRestrictionAction": "LocationRestrictionAction6",
  "UsageRestrictions": {
    "DailySpend": 7.72,
    "WeeklySpend": 10.22,
    "MonthlySpend": 48.66,
    "PerTransactionSpend": 17.28,
    "AnnualSpend": 223.08
  },
  "DayTimeRestrictions": {
    "Monday": false,
    "Tuesday": false,
    "Wednesday": false,
    "Thursday": false,
    "Friday": false
  },
  "ProductRestrictions": {
    "Products": [
      "Products4"
    ],
    "ProductGroups": [
      "ProductGroups3",
      "ProductGroups4"
    ]
  }
}
```


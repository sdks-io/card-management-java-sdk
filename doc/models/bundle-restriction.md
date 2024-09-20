
# Bundle Restriction

## Structure

`BundleRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DayTimeRestrictionAction` | `String` | Optional | The value indicates what actions to be performed with respect to day time restriction.<br>Mandatory<br>Allowed values –<br>•    Add: Apply the given restriction on the bundle.<br>•    Default: No Day/Time restriction will be applied on the bundle in Gateway. | String getDayTimeRestrictionAction() | setDayTimeRestrictionAction(String dayTimeRestrictionAction) |
| `LocationRestrictionAction` | `String` | Optional | The value indicates what actions to be performed with respect to location restriction.<br>Mandatory<br>Allowed values –<br>•    Add: Apply the given restriction on the bundle.<br>•    Default: No location restriction will be applied on the bundle in Gateway. | String getLocationRestrictionAction() | setLocationRestrictionAction(String locationRestrictionAction) |
| `UsageRestrictions` | `Object` | Optional | - | Object getUsageRestrictions() | setUsageRestrictions(Object usageRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestrictions`](../../doc/models/day-time-restrictions.md) | Optional | - | DayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestrictions dayTimeRestrictions) |
| `ProductRestrictions` | `Object` | Optional | - | Object getProductRestrictions() | setProductRestrictions(Object productRestrictions) |
| `LocationRestrictions` | [`LocationRestriction`](../../doc/models/location-restriction.md) | Optional | - | LocationRestriction getLocationRestrictions() | setLocationRestrictions(LocationRestriction locationRestrictions) |

## Example (as JSON)

```json
{
  "DayTimeRestrictionAction": "DayTimeRestrictionAction8",
  "LocationRestrictionAction": "LocationRestrictionAction6",
  "UsageRestrictions": {
    "key1": "val1",
    "key2": "val2"
  },
  "DayTimeRestrictions": {
    "Monday": false,
    "Tuesday": false,
    "Wednesday": false,
    "Thursday": false,
    "Friday": false
  },
  "ProductRestrictions": {
    "key1": "val1",
    "key2": "val2"
  }
}
```


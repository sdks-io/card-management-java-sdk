
# Day Time Restriction

Details of the day/time restrictions such as weekdays and time range in which transactions should be allowed on the card.

## Structure

`DayTimeRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Monday` | `Boolean` | Optional | True if card could be used on a Monday, else false | Boolean getMonday() | setMonday(Boolean monday) |
| `Tuesday` | `Boolean` | Optional | True if card could be used on a Tuesday, else false. | Boolean getTuesday() | setTuesday(Boolean tuesday) |
| `Wednesday` | `Boolean` | Optional | True if card could be used on a Wednesday, else false. | Boolean getWednesday() | setWednesday(Boolean wednesday) |
| `Thursday` | `Boolean` | Optional | True if card could be used on a Thursday, else false | Boolean getThursday() | setThursday(Boolean thursday) |
| `Friday` | `Boolean` | Optional | True if card could be used on a Friday, else false | Boolean getFriday() | setFriday(Boolean friday) |
| `Saturday` | `Boolean` | Optional | True if card could be used on a Saturday, else false | Boolean getSaturday() | setSaturday(Boolean saturday) |
| `Sunday` | `Boolean` | Optional | True if card could be used on a Sunday, else false. | Boolean getSunday() | setSunday(Boolean sunday) |
| `TimeFrom` | `String` | Optional | Card could be used from this time in a day.<br>Format: HH:mm (24-hour format)<br>Note:<br><br>1. Clients to convert this to appropriate DateTime or TimeSpan type.<br>   “00:00” is the lowest time value and “23:59” is the highest time value. | String getTimeFrom() | setTimeFrom(String timeFrom) |
| `TimeTo` | `String` | Optional | Card could be used up to this time in a day.<br>Format: HH:mm (24-hour format)<br>Note:<br><br>1. Clients to convert this to appropriate DateTime or TimeSpan type.<br>   “00:00” is the lowest time value and “23:59” is the highest time value. | String getTimeTo() | setTimeTo(String timeTo) |

## Example (as JSON)

```json
{
  "Monday": false,
  "Tuesday": false,
  "Wednesday": false,
  "Thursday": false,
  "Friday": false
}
```


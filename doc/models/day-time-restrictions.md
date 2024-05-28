
# Day Time Restrictions

Day/time restrictions such as weekdays and time range to be applied on the bundle.
Mandatory if respective action is set as “Add”.
The details of DayTimeRestriction entity is given below.

## Structure

`DayTimeRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Friday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Friday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getFriday() | setFriday(Boolean friday) |
| `Monday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Monday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getMonday() | setMonday(Boolean monday) |
| `Saturday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Saturday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getSaturday() | setSaturday(Boolean saturday) |
| `Sunday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Sunday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getSunday() | setSunday(Boolean sunday) |
| `Thursday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Thursday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getThursday() | setThursday(Boolean thursday) |
| `TimeFrom` | `String` | Optional | Card could be used from this time in a day.<br>Mandatory if TimeTo is passed, else optional.<br>Format: HH:mm (24-hour format)<br>Note:<br>2.	“00:00” is the lowest time value and “23:59” is the highest time value.<br>To allow card to be used throughout the day pass null in TimeFrom and TimeTo. | String getTimeFrom() | setTimeFrom(String timeFrom) |
| `TimeTo` | `String` | Optional | Card could be used up to this time in a day.<br>Mandatory if TimeFrom is passed, else optional.<br>Format: HH:mm (24-hour format)<br>Note:<br>2.	“00:00” is the lowest time value and “23:59” is the highest time value.<br>To allow card to be used throughout the day pass null in TimeFrom and TimeTo. | String getTimeTo() | setTimeTo(String timeTo) |
| `Tuesday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Tuesday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getTuesday() | setTuesday(Boolean tuesday) |
| `Wednesday` | `Boolean` | Optional | True/False.<br>True if card could be used on a Wednesday, else false.<br>Default value: false.<br>**Default**: `false` | Boolean getWednesday() | setWednesday(Boolean wednesday) |

## Example (as JSON)

```json
{
  "Friday": false,
  "Monday": false,
  "Saturday": false,
  "Sunday": false,
  "Thursday": false,
  "Tuesday": false,
  "Wednesday": false
}
```


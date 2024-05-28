
# Card Day Time Restrictions

## Structure

`CardDayTimeRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level` | `String` | Optional | Describes at which level the restriction is set at.<br>Possible values:<br>OU = Restriction set at ColCo card type<br>Customer = Restriction set at customer card type | String getLevel() | setLevel(String level) |
| `Monday` | `Boolean` | Optional | Whether the transaction is allowed on Mondays or not. | Boolean getMonday() | setMonday(Boolean monday) |
| `Tuesday` | `Boolean` | Optional | Whether the transaction is allowed on Tuesdays or not. | Boolean getTuesday() | setTuesday(Boolean tuesday) |
| `Wednesday` | `Boolean` | Optional | Whether the transaction is allowed on Wednesdays or not. | Boolean getWednesday() | setWednesday(Boolean wednesday) |
| `Thursday` | `Boolean` | Optional | Whether the transaction is allowed on Thursdays or not. | Boolean getThursday() | setThursday(Boolean thursday) |
| `Friday` | `Boolean` | Optional | Whether the transaction is allowed on Fridays or not. | Boolean getFriday() | setFriday(Boolean friday) |
| `Saturday` | `Boolean` | Optional | Whether the transaction is allowed on Saturdays or not. | Boolean getSaturday() | setSaturday(Boolean saturday) |
| `Sunday` | `Boolean` | Optional | Whether the transaction is allowed on Sundays or not. | Boolean getSunday() | setSunday(Boolean sunday) |
| `TimeFrom` | `String` | Optional | The time in the day from when the transaction is allowed.<br>Format: HH:mm: ss<br>E.g., 21:00:00<br><br>Note:<br><br>1) The client application has to convert the value to the required date-time data type.<br>2) The value will be 00:00:00 when no restriction set for this field. | String getTimeFrom() | setTimeFrom(String timeFrom) |
| `TimeTo` | `String` | Optional | allowed.<br>Format: HH:mm: ss<br>E.g., 21:00:00<br><br>Note:<br><br>1) The client application has to convert the value to the required date-time data type.<br>2) The value will be 00:00:00 when no restriction set for this field. | String getTimeTo() | setTimeTo(String timeTo) |

## Example (as JSON)

```json
{
  "Level": "OU= 24537",
  "TimeFrom": "07:56:00",
  "TimeTo": "08:19:09",
  "Monday": false,
  "Tuesday": false,
  "Wednesday": false,
  "Thursday": false
}
```


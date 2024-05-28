
# PIN Advice Types

## Structure

`PINAdviceTypes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PINAdviceTypeID` | `Integer` | Optional | Id of of PIN advice type.<br>Possible Values:<br><br>1. Paper<br>2. Email<br>3. SMS<br>4. None | Integer getPINAdviceTypeID() | setPINAdviceTypeID(Integer pINAdviceTypeID) |
| `IsCardOrderOption` | `Boolean` | Optional | Whether the PIN advice type is available for card ordering | Boolean getIsCardOrderOption() | setIsCardOrderOption(Boolean isCardOrderOption) |
| `IsPINReminderOption` | `Boolean` | Optional | Whether the PIN advice type is available for PIN Reminder | Boolean getIsPINReminderOption() | setIsPINReminderOption(Boolean isPINReminderOption) |

## Example (as JSON)

```json
{
  "PINAdviceTypeID": 1,
  "IsCardOrderOption": false,
  "IsPINReminderOption": false
}
```


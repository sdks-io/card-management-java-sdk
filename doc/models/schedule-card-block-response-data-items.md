
# Schedule Card Block Response Data Items

## Structure

`ScheduleCardBlockResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Unique Id of the card. | Integer getCardId() | setCardId(Integer cardId) |
| `FromDate` | `String` | Optional | Effective start date & time of Block / Unblock as updated in the intermediate queue table.<br><br>Format: yyyyMMdd HH:mm<br>Eg: 20230512 12:30 | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Effective end date & time of Block / Unblock as updated in the intermediate queue table.<br><br>Format: yyyyMMdd HH:mm<br>Eg: 20230512 14:30 | String getToDate() | setToDate(String toDate) |
| `ReferenceId` | `Integer` | Optional | Effective end date & time of Block / Unblock as updated in the intermediate queue table.<br><br>Format: yyyyMMdd HH:mm<br>Eg: 20230512 14:30 | Integer getReferenceId() | setReferenceId(Integer referenceId) |

## Example (as JSON)

```json
{
  "CardId": 86,
  "FromDate": "FromDate8",
  "ToDate": "ToDate8",
  "ReferenceId": 10
}
```


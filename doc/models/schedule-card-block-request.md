
# Schedule Card Block Request

## Structure

`ScheduleCardBlockRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IsTimeSupported` | `Boolean` | Optional | Default: False<br>True – It supports both date & time.<br>False – It supports only date. Time will be ignored if it is provided in the request. | Boolean getIsTimeSupported() | setIsTimeSupported(Boolean isTimeSupported) |
| `ScheduleCardBlockCards` | [`List<ScheduleCardBlockCardsItems>`](../../doc/models/schedule-card-block-cards-items.md) | Optional | List of ScheduleCardBlockCard entity. Each card in the list will be scheduled for Block or Unblock. The details of the entity are given below. | List<ScheduleCardBlockCardsItems> getScheduleCardBlockCards() | setScheduleCardBlockCards(List<ScheduleCardBlockCardsItems> scheduleCardBlockCards) |

## Example (as JSON)

```json
{
  "IsTimeSupported": false,
  "ScheduleCardBlockCards": [
    {
      "ColCoCode": 184,
      "ColCoId": 170,
      "AccountId": 22,
      "AccountNumber": "AccountNumber6",
      "PayerId": 218,
      "Action": "Action2"
    },
    {
      "ColCoCode": 184,
      "ColCoId": 170,
      "AccountId": 22,
      "AccountNumber": "AccountNumber6",
      "PayerId": 218,
      "Action": "Action2"
    },
    {
      "ColCoCode": 184,
      "ColCoId": 170,
      "AccountId": 22,
      "AccountNumber": "AccountNumber6",
      "PayerId": 218,
      "Action": "Action2"
    }
  ]
}
```


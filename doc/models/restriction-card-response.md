
# Restriction Card Response

## Structure

`RestrictionCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainReference` | `Integer` | Optional | Main reference number for tracking.<br>Example: 123455 | Integer getMainReference() | setMainReference(Integer mainReference) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | API Response Status | String getStatus() | setStatus(String status) |
| `Data` | [`List<RestrictionCardResponseDataItems>`](../../doc/models/restriction-card-response-data-items.md) | Optional | List of card restriction requests validated and submitted successfully for processing. | List<RestrictionCardResponseDataItems> getData() | setData(List<RestrictionCardResponseDataItems> data) |

## Example (as JSON)

```json
{
  "MainReference": 104,
  "RequestId": "RequestId0",
  "Status": "Status6",
  "Data": [
    {
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CardId": 224,
      "DayTimeRestrictionDescription": "DayTimeRestrictionDescription8",
      "DayTimeRestrictionStatus": "DayTimeRestrictionStatus8"
    },
    {
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CardId": 224,
      "DayTimeRestrictionDescription": "DayTimeRestrictionDescription8",
      "DayTimeRestrictionStatus": "DayTimeRestrictionStatus8"
    }
  ]
}
```


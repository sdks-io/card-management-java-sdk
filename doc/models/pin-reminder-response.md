
# PIN Reminder Response

## Structure

`PINReminderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `MainReference` | `Integer` | Optional | Service reference number for tracking. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCESS, FAILED | String getStatus() | setStatus(String status) |
| `Data` | [`List<PINReminderReference>`](../../doc/models/pin-reminder-reference.md) | Optional | - | List<PINReminderReference> getData() | setData(List<PINReminderReference> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId8",
  "MainReference": 42,
  "Status": "Status4",
  "Data": [
    {
      "CardId": 224,
      "PANID": 0,
      "PAN": 154,
      "CardExpiryDate": "CardExpiryDate6",
      "ReferenceId": 108
    },
    {
      "CardId": 224,
      "PANID": 0,
      "PAN": 154,
      "CardExpiryDate": "CardExpiryDate6",
      "ReferenceId": 108
    }
  ]
}
```


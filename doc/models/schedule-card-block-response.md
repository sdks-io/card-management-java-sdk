
# Schedule Card Block Response

## Structure

`ScheduleCardBlockResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainReference` | `Integer` | Optional | Reference number for tracking the execution of the request.<br>Note: Reference will be empty for status 9006 and 9012 i.e., request for all the cards failed. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `RequestId` | `String` | Optional | API Request ID | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Overall Status of the API call | String getStatus() | setStatus(String status) |
| `Data` | [`List<ScheduleCardBlockResponseDataItems>`](../../doc/models/schedule-card-block-response-data-items.md) | Optional | List of SubmittedScheduleCardBlockCard entity. | List<ScheduleCardBlockResponseDataItems> getData() | setData(List<ScheduleCardBlockResponseDataItems> data) |

## Example (as JSON)

```json
{
  "MainReference": 98,
  "RequestId": "RequestId4",
  "Status": "Status2",
  "Data": [
    {
      "CardId": 224,
      "FromDate": "FromDate2",
      "ToDate": "ToDate8",
      "ReferenceId": 108
    }
  ]
}
```



# Order Card Response

## Structure

`OrderCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCESS, FAILED | String getStatus() | setStatus(String status) |
| `Data` | [`List<CreateCardResponse>`](../../doc/models/create-card-response.md) | Optional | - | List<CreateCardResponse> getData() | setData(List<CreateCardResponse> data) |
| `MainReference` | `Integer` | Optional | Main order reference number for tracking. | Integer getMainReference() | setMainReference(Integer mainReference) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "Status": "Status8",
  "Data": [
    {
      "DriverAndVRN": "DriverAndVRN6",
      "OrderCardReference": 86
    }
  ],
  "MainReference": 110
}
```


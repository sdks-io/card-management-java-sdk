
# Auto Renew Card Response

## Structure

`AutoRenewCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainReference` | `Integer` | Optional | Main reference number for tracking.<br>Example: 123455 | Integer getMainReference() | setMainReference(Integer mainReference) |
| `RequestId` | `String` | Optional | API | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED, PARTIAL_SUCCESS | String getStatus() | setStatus(String status) |
| `Data` | [`List<AutoRenewCardResponseDataItems>`](../../doc/models/auto-renew-card-response-data-items.md) | Optional | List of Auto Renew reference entity. The fields of this entity are described below. | List<AutoRenewCardResponseDataItems> getData() | setData(List<AutoRenewCardResponseDataItems> data) |

## Example (as JSON)

```json
{
  "MainReference": 14,
  "RequestId": "RequestId6",
  "Status": "Status2",
  "Data": [
    {
      "AutoRenewReferenceId": 102,
      "CardIdAndPAN": "CardIdAndPAN4",
      "PANID": 176.64
    }
  ]
}
```


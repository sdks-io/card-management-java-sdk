
# Card Summary Response

## Structure

`CardSummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getStatus() | setStatus(String status) |
| `Data` | [`List<SummaryResponse>`](../../doc/models/summary-response.md) | Optional | - | List<SummaryResponse> getData() | setData(List<SummaryResponse> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status0",
  "Data": [
    {
      "ActiveCards": 252,
      "BlockedCards": 156,
      "CancelledCards": 102,
      "ExpiredCards": 156,
      "ExpiringCards": 122
    },
    {
      "ActiveCards": 252,
      "BlockedCards": 156,
      "CancelledCards": 102,
      "ExpiredCards": 156,
      "ExpiringCards": 122
    },
    {
      "ActiveCards": 252,
      "BlockedCards": 156,
      "CancelledCards": 102,
      "ExpiredCards": 156,
      "ExpiringCards": 122
    }
  ]
}
```


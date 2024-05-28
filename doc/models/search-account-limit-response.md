
# Search Account Limit Response

## Structure

`SearchAccountLimitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Data` | [`SearchAccountLimitResponseData`](../../doc/models/search-account-limit-response-data.md) | Optional | - | SearchAccountLimitResponseData getData() | setData(SearchAccountLimitResponseData data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId0",
  "Status": "Status6",
  "Data": {
    "AccountId": 62,
    "AccountNumber": "AccountNumber8",
    "ReferenceProduct": "ReferenceProduct8",
    "RestrictionCondition": "RestrictionCondition4",
    "VelocityLimits": [
      {
        "Type": "Type0",
        "Period": "Period2",
        "Limit": 24.94,
        "Accumulation": 132.24,
        "Balance": 189.6
      },
      {
        "Type": "Type0",
        "Period": "Period2",
        "Limit": 24.94,
        "Accumulation": 132.24,
        "Balance": 189.6
      },
      {
        "Type": "Type0",
        "Period": "Period2",
        "Limit": 24.94,
        "Accumulation": 132.24,
        "Balance": 189.6
      }
    ]
  }
}
```


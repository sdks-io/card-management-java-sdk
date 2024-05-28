
# Summary of Bundle Response

## Structure

`SummaryOfBundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Data` | [`List<SummaryOfBundleResponseDataItems>`](../../doc/models/summary-of-bundle-response-data-items.md) | Optional | - | List<SummaryOfBundleResponseDataItems> getData() | setData(List<SummaryOfBundleResponseDataItems> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "Status": "Status8",
  "Data": [
    {
      "PayerId": 2,
      "PayerNumber": "PayerNumber6",
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CountOfCardsNotInBundle": 122
    }
  ]
}
```


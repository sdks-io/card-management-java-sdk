
# Card Search Response

## Structure

`CardSearchResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED, PARTIAL_SUCCES | String getStatus() | setStatus(String status) |
| `Data` | [`List<Card>`](../../doc/models/card.md) | Optional | - | List<Card> getData() | setData(List<Card> data) |
| `Page` | `Integer` | Optional | Specifies the returned page of the results | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Specifies the number of records to be returned which could be less than the PageSize in the request | Integer getPageSize() | setPageSize(Integer pageSize) |
| `TotalPages` | `Integer` | Optional | Specifies the total pages available in the result | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `TotalRecords` | `Integer` | Optional | Specifies the total pages available in the result | Integer getTotalRecords() | setTotalRecords(Integer totalRecords) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status2",
  "Data": [
    {
      "AccountId": 62,
      "AccountName": "AccountName4",
      "AccountNumber": "AccountNumber8",
      "AccountShortName": "AccountShortName0",
      "BundleId": "BundleId6"
    },
    {
      "AccountId": 62,
      "AccountName": "AccountName4",
      "AccountNumber": "AccountNumber8",
      "AccountShortName": "AccountShortName0",
      "BundleId": "BundleId6"
    }
  ],
  "Page": 130,
  "PageSize": 110
}
```


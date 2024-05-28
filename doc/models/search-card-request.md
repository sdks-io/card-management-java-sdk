
# Search Card Request

## Structure

`SearchCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`SearchRequest`](../../doc/models/search-request.md) | Optional | Encapsulate the Search details request. | SearchRequest getFilters() | setFilters(SearchRequest filters) |
| `PageSize` | `String` | Optional | Page Size – Number of records to show on a page<br>Optional<br>Default value 50 | String getPageSize() | setPageSize(String pageSize) |
| `Page` | `String` | Optional | Page Number | String getPage() | setPage(String page) |

## Example (as JSON)

```json
{
  "PageSize": "1",
  "Page": "1",
  "Filters": {
    "AccountId": 108,
    "AccountNumber": "AccountNumber2",
    "CardGroupId": 154,
    "CardGroupName": "CardGroupName4",
    "CardSegment": "CardSegment4",
    "CardStatus": [
      "CardStatus7",
      "CardStatus8"
    ]
  }
}
```



# Card Group Response

## Structure

`CardGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardGroups` | [`List<CardGroupResponseCardGroupsItems>`](../../doc/models/card-group-response-card-groups-items.md) | Optional | - | List<CardGroupResponseCardGroupsItems> getCardGroups() | setCardGroups(List<CardGroupResponseCardGroupsItems> cardGroups) |
| `CurrentPage` | `Integer` | Optional | current page | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `RowCount` | `Integer` | Optional | number of records in current response | Integer getRowCount() | setRowCount(Integer rowCount) |
| `TotalPages` | `Integer` | Optional | Total pages available | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "CurrentPage": 1,
  "RowCount": 1,
  "TotalPages": 1,
  "RequestId": "3cc14d61-8f2a-4d88-cc3c-c53110646a85",
  "CardGroups": [
    {
      "AccountId": 114,
      "AccountNumber": "AccountNumber8",
      "AccountShortName": "AccountShortName0",
      "ActiveCards": 200,
      "BlockedCards": 104
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


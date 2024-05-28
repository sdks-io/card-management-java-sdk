
# Account Response

## Structure

`AccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Accounts` | [`List<AccountResponseAccountsItems>`](../../doc/models/account-response-accounts-items.md) | Optional | - | List<AccountResponseAccountsItems> getAccounts() | setAccounts(List<AccountResponseAccountsItems> accounts) |
| `CurrentPage` | `Integer` | Optional | current page | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `RowCount` | `Integer` | Optional | Total row count matched for the given input criteria | Integer getRowCount() | setRowCount(Integer rowCount) |
| `TotalPages` | `Integer` | Optional | Calculated page count based on page size from the incoming API request and total number of rows matched for the given input criteria. | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request ID | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "CurrentPage": 1,
  "RowCount": 1,
  "TotalPages": 1,
  "RequestId": "e5165f29-7e6f-45b4-96fe-f303df9ca180",
  "Accounts": [
    {
      "AccountFullName": "AccountFullName8",
      "AccountId": 28,
      "AccountNumber": "AccountNumber0",
      "AccountShortName": "AccountShortName2",
      "BestOfIndicator": false
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


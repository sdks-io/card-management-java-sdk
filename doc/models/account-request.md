
# Account Request

## Structure

`AccountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | Account Status.<br>Optional if StatusList is passed, else mandatory.<br>Ignored if StatusList is passed.<br>Allowed values:<br>•	ALL<br>•	ACTIVE<br>•	BLOCKED<br>•	CANCELLED<br>•	CREDITLOCK<br>•	DELINQUENCYLOCK | String getStatus() | setStatus(String status) |
| `IncludeCardSummary` | `Boolean` | Optional | Include card summary details in the response.<br><br>When passed as false, the card summary related parameters on response will be set to null.<br><br>Optional – default value: true.<br>**Default**: `true` | Boolean getIncludeCardSummary() | setIncludeCardSummary(Boolean includeCardSummary) |
| `PayerId` | `Integer` | Optional | Payer id of the customer.<br>Optional if PayerNumber is passed, else Mandatory. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | PayerNumber of the customer.<br>Optional if PayerId is passed, else Mandatory. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br>Optional<br>Default value 50 | Integer getPageSize() | setPageSize(Integer pageSize) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>ColCoCode or ColCoCountryCode  is Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoCountryCode` | `String` | Optional | The 2-character ISO Code for the customer and card owning country.<br>ColCoCode or ColCoCountryCode  is Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `CurrentPage` | `Integer` | Optional | Page Number (as shown to the users)<br>Optional<br>Default value 1 | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `InvoicePointsOnly` | `Boolean` | Optional | Optional – default value: false.<br>When passed as true, the API will return accounts that are configured as Invoice Point only.<br>**Default**: `false` | Boolean getInvoicePointsOnly() | setInvoicePointsOnly(Boolean invoicePointsOnly) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id (in GFN) of the selected payer.<br>Optional if ColCoCode or ColCoCountryCode  is passed else Mandatory. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ReturnTollsCustomerId` | `Boolean` | Optional | Return e-Toll Customer details When True. | Boolean getReturnTollsCustomerId() | setReturnTollsCustomerId(Boolean returnTollsCustomerId) |
| `Accounts` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccounts() | setAccounts(List<Accounts> accounts) |
| `AccountName` | `String` | Optional | Account Name of the customer.<br>Optional.<br>Minimum of 4 characters should be provided else not considered.<br>Accounts those have the entered value at any part of the Name will be returned. | String getAccountName() | setAccountName(String accountName) |
| `StatusList` | `List<String>` | Optional | Account Statuses.<br>Optional<br>Multiple statuses are allowed to be included in the search criteria.<br>Allowed values:<br>•	ACTIVE<br>•	BLOCKED<br>•	CANCELLED<br>•	CREDITLOCK<br>•	DELINQUENCYLOCK | List<String> getStatusList() | setStatusList(List<String> statusList) |

## Example (as JSON)

```json
{
  "Status": "ALL",
  "IncludeCardSummary": true,
  "PayerId": 9,
  "PayerNumber": "GB00000111",
  "PageSize": 10,
  "RequestId": "b9eb91b6-65d4-4196-f910-6b0846875e70",
  "ColCoCode": 14,
  "ColCoCountryCode": "14",
  "CurrentPage": 1,
  "InvoicePointsOnly": false,
  "ColCoId": 14,
  "AccountName": "test"
}
```



# Card Group Request

## Structure

`CardGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer id of the customer.<br>Optional if PayerNumber is passed, else Mandatory.<br>This input is a search criterion.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | PayerNumber of the customer.<br>Optional if PayerId is passed, else Mandatory.<br>This input is a search criterion.<br>Example: GB00123456 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `Account` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccount() | setAccount(List<Accounts> account) |
| `CardGroupName` | `String` | Optional | Card Group Name<br>Optional.<br>Minimum of 2 characters should be provided else not considered.<br>CardGroups those have the entered value at any part | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `Status` | `String` | Optional | Card Group Status<br>Mandatory<br>Allowed values:<br>•	ALL<br>•	TERMINATED<br>•	ACTIVE | String getStatus() | setStatus(String status) |
| `CurrentPage` | `Integer` | Optional | Page Number (as shown to the users)<br>Optional<br>Default value 1 | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br>Optional<br>Default value 50.<br>Return all rows if -1 is supplied as page size. | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "PayerId": 123,
  "PayerNumber": "GB00123456",
  "CardGroupName": "test",
  "Status": "ALL",
  "PageSize": 1,
  "Account": [
    {
      "AccountId": 66,
      "AccountNumber": "AccountNumber2"
    },
    {
      "AccountId": 66,
      "AccountNumber": "AccountNumber2"
    }
  ]
}
```


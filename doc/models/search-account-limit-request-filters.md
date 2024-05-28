
# Search Account Limit Request Filters

## Structure

`SearchAccountLimitRequestFilters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id  of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Optional if AccountNumber is passed else Mandatory<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed else Mandatory<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "PayerId": 1234,
  "PayerNumber": "GB99215176",
  "AccountId": 29484,
  "AccountNumber": "GB99215176"
}
```


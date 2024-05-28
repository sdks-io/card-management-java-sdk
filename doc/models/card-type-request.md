
# Card Type Request

## Structure

`CardTypeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br>Optional if AccountNumber is passed else Mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed else Mandatory<br>Example: GB000000124 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `IncludeUsageRestrictions` | `Boolean` | Optional | Include usage restrictions in the response.<br>Optional field– default value is False.<br>Possible values: True/False | Boolean getIncludeUsageRestrictions() | setIncludeUsageRestrictions(Boolean includeUsageRestrictions) |
| `IncludePurchaseCategories` | `Boolean` | Optional | Include purchase categories in the response.<br>Optional field– default value is False.<br>Possible values: True/False | Boolean getIncludePurchaseCategories() | setIncludePurchaseCategories(Boolean includePurchaseCategories) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "PayerId": 2343,
  "PayerNumber": "GB000000124",
  "AccountId": 343,
  "AccountNumber": "GB000000124"
}
```


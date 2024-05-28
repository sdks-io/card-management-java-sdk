
# Account Restriction Request

## Structure

`AccountRestrictionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `String` | Optional | Account Number of the customer on which the restrictions will be applied.<br>Optional if AccountId is passed, else Mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ResetUsageRestrictions` | `Boolean` | Optional | If true, the usage restrictions applied on the account will be removed.<br>Optional<br>Default: False<br>**Default**: `false` | Boolean getResetUsageRestrictions() | setResetUsageRestrictions(Boolean resetUsageRestrictions) |
| `UsageRestrictions` | [`UsageRestrictions`](../../doc/models/usage-restrictions.md) | Optional | - | UsageRestrictions getUsageRestrictions() | setUsageRestrictions(UsageRestrictions usageRestrictions) |

## Example (as JSON)

```json
{
  "ResetUsageRestrictions": false,
  "ColCoId": 138,
  "ColCoCode": 152,
  "PayerId": 186,
  "PayerNumber": "PayerNumber8",
  "AccountNumber": "AccountNumber0"
}
```



# Account Access

## Structure

`AccountAccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColcoId` | `Integer` | Optional | Collecting company id. | Integer getColcoId() | setColcoId(Integer colcoId) |
| `ColcoCode` | `Integer` | Optional | Collecting company code. | Integer getColcoCode() | setColcoCode(Integer colcoCode) |
| `PayerId` | `Integer` | Optional | Payer Id to which the user has access | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number to which the user has access | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerName` | `String` | Optional | Name of the Payer to which the user has access | String getPayerName() | setPayerName(String payerName) |
| `AccountId` | `Integer` | Optional | Account Id to which the user has access | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number to which the user has access | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountName` | `String` | Optional | Name of the Account to which the user has access | String getAccountName() | setAccountName(String accountName) |

## Example (as JSON)

```json
{
  "ColcoId": 14,
  "ColcoCode": 14,
  "PayerId": 854,
  "PayerNumber": "DE26688504",
  "PayerName": "TK MobilPlus",
  "AccountId": 435,
  "AccountNumber": "DE26688504",
  "AccountName": "TK Sub Account"
}
```


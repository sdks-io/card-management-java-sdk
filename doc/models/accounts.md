
# Accounts

## Structure

`Accounts`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br>Optional, if AccountNumber is passed, else mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional, if AccountId is passed, else mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "AccountId": 3453,
  "AccountNumber": "GB000000124"
}
```


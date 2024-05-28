
# Search Account Limit Response Data

## Structure

`SearchAccountLimitResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | - | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ReferenceProduct` | `String` | Optional | 3 digit Shell global fuel product code, if already set up. | String getReferenceProduct() | setReferenceProduct(String referenceProduct) |
| `RestrictionCondition` | `String` | Optional | The restriction condition code. | String getRestrictionCondition() | setRestrictionCondition(String restrictionCondition) |
| `VelocityLimits` | [`List<AccountVelocityLimit>`](../../doc/models/account-velocity-limit.md) | Optional | - | List<AccountVelocityLimit> getVelocityLimits() | setVelocityLimits(List<AccountVelocityLimit> velocityLimits) |

## Example (as JSON)

```json
{
  "AccountId": 29484,
  "AccountNumber": "GB99215176",
  "ReferenceProduct": "021",
  "RestrictionCondition": "DECLINE_ALERT",
  "VelocityLimits": [
    {
      "Type": "Type0",
      "Period": "Period2",
      "Limit": 24.94,
      "Accumulation": 132.24,
      "Balance": 189.6
    },
    {
      "Type": "Type0",
      "Period": "Period2",
      "Limit": 24.94,
      "Accumulation": 132.24,
      "Balance": 189.6
    }
  ]
}
```



# Search Account Limit Response

## Structure

`SearchAccountLimitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |
| `AccountId` | `Integer` | Optional | Account ID of the customer. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number<br>Example: GB99215176 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ReferenceProduct` | `String` | Optional | 3 digit Shell global fuel product code, if already set up.<br>Example: 021 | String getReferenceProduct() | setReferenceProduct(String referenceProduct) |
| `RestrictionCondition` | `String` | Optional | The restriction condition code.<br>Example: DECLINE_ALERT | String getRestrictionCondition() | setRestrictionCondition(String restrictionCondition) |
| `VelocityLimits` | [`List<AccountVelocityLimit>`](../../doc/models/account-velocity-limit.md) | Optional | - | List<AccountVelocityLimit> getVelocityLimits() | setVelocityLimits(List<AccountVelocityLimit> velocityLimits) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "2ace3991-5d03-4a68-ac68-ca9119b25101",
  "AccountId": 114,
  "AccountNumber": "AccountNumber2",
  "ReferenceProduct": "ReferenceProduct2",
  "RestrictionCondition": "RestrictionCondition0"
}
```


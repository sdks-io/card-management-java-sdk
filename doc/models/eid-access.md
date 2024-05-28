
# EID Access

## Structure

`EIDAccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `String` | Optional | Collecting company id. | String getColCoId() | setColCoId(String colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting company Code | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `AccountGroupId` | `String` | Optional | Identifier for the EID account group configured for the user. | String getAccountGroupId() | setAccountGroupId(String accountGroupId) |

## Example (as JSON)

```json
{
  "ColCoId": "14",
  "ColCoCode": 14,
  "AccountGroupId": "345"
}
```



# Account Velocity Limit

## Structure

`AccountVelocityLimit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Type of velocity (COUNT type is not present for limits of PERTRX period<br>Possible Values: VALUE, VOLUME, COUNT | String getType() | setType(String type) |
| `Period` | `String` | Optional | Duration of the velocity or threshold alert.<br>Possible Values: DAILY, WEEKLY, MONTHLY, ANNUAL, LIFETIME, PERTRX | String getPeriod() | setPeriod(String period) |
| `Limit` | `Double` | Optional | The limit associated with this velocity with the correct number of digits after the decimal point according to the minor denomination of the currency of the card issuer.<br>Example: 1500.55 | Double getLimit() | setLimit(Double limit) |
| `Accumulation` | `Double` | Optional | The transaction accumulation during the current period with the correct number of digits after the decimal point according to the minor denomination of the currency of the card issuer (except for COUNT type velocity). Not present for PERTRX period.<br>Example: 1100.55 | Double getAccumulation() | setAccumulation(Double accumulation) |
| `Balance` | `Double` | Optional | The remaining/available balance at this point in time with the correct number of digits after the decimal point according to the minor denomination of the currency of the card issuer (except for COUNT type velocity). Not present for PERTRX period.<br>Example: 400.55 | Double getBalance() | setBalance(Double balance) |
| `MOverride` | `Boolean` | Optional | Indicate if the limit is overridden or default. (false for default).<br>Example: false | Boolean getMOverride() | setMOverride(Boolean override) |
| `ProductGroup` | `String` | Optional | The reference group name for product differentiated velocities. This field cannot be used with Volume type velocity.<br>Example: RoadSvc<br>This is an optional output field. | String getProductGroup() | setProductGroup(String productGroup) |
| `Threshold` | `Double` | Optional | The limit to trigger an alert if the balance after a transaction reaches it or below. 0 indicates no alerts will be sent. Not present if not set (issuer value threshold limit applies if available). Not present for COUNT type velocity.<br>Example: 50.55<br>This is an optional output field. | Double getThreshold() | setThreshold(Double threshold) |

## Example (as JSON)

```json
{
  "Type": "Type4",
  "Period": "Period6",
  "Limit": 90.78,
  "Accumulation": 198.08,
  "Balance": 132.24
}
```


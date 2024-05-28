
# Card Usage Restrictions

## Structure

`CardUsageRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level` | `String` | Optional | Describes at which level the restriction is set at.<br>Possible values:<br>OU = Restriction set at ColCo card type<br>Customer = Restriction set at customer card type | String getLevel() | setLevel(String level) |
| `DailySpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in a day. | Double getDailySpendLimit() | setDailySpendLimit(Double dailySpendLimit) |
| `WeeklySpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in a week. | Double getWeeklySpendLimit() | setWeeklySpendLimit(Double weeklySpendLimit) |
| `MonthlySpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in a month. | Double getMonthlySpendLimit() | setMonthlySpendLimit(Double monthlySpendLimit) |
| `AnnualSpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in a year. | Double getAnnualSpendLimit() | setAnnualSpendLimit(Double annualSpendLimit) |
| `LifeTimeSpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in the card’s life time. | Double getLifeTimeSpendLimit() | setLifeTimeSpendLimit(Double lifeTimeSpendLimit) |
| `DailyVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in a day. | Double getDailyVolumeLimit() | setDailyVolumeLimit(Double dailyVolumeLimit) |
| `WeeklyVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in a week. | Double getWeeklyVolumeLimit() | setWeeklyVolumeLimit(Double weeklyVolumeLimit) |
| `MonthlyVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in a month. | Double getMonthlyVolumeLimit() | setMonthlyVolumeLimit(Double monthlyVolumeLimit) |
| `AnnualVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in a year.<br>**Default**: `0d` | Double getAnnualVolumeLimit() | setAnnualVolumeLimit(Double annualVolumeLimit) |
| `LifeTimeVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in the card’s life time. | Double getLifeTimeVolumeLimit() | setLifeTimeVolumeLimit(Double lifeTimeVolumeLimit) |
| `TransactionSpendLimit` | `Double` | Optional | Maximum amount that can be spend on the card in a transaction. | Double getTransactionSpendLimit() | setTransactionSpendLimit(Double transactionSpendLimit) |
| `TransactionVolumeLimit` | `Double` | Optional | Maximum volume of fuel that can be bought on the card in a transaction. | Double getTransactionVolumeLimit() | setTransactionVolumeLimit(Double transactionVolumeLimit) |
| `DailyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed on a card in a day. | Double getDailyTransactionCount() | setDailyTransactionCount(Double dailyTransactionCount) |
| `WeeklyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed on a card in a week. | Double getWeeklyTransactionCount() | setWeeklyTransactionCount(Double weeklyTransactionCount) |
| `MonthlyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed on a card in a month. | Double getMonthlyTransactionCount() | setMonthlyTransactionCount(Double monthlyTransactionCount) |
| `AnnualTransactionCount` | `Double` | Optional | Maximum number of transactions allowed on the card in a year. | Double getAnnualTransactionCount() | setAnnualTransactionCount(Double annualTransactionCount) |
| `LifeTimeTransactionCount` | `Double` | Optional | Maximum number of transactions allowed on the card in the card’s life time. | Double getLifeTimeTransactionCount() | setLifeTimeTransactionCount(Double lifeTimeTransactionCount) |
| `IsVelocityCeiling` | `Boolean` | Optional | IsVelocityCeiling flag<br>Note: When "True", the velocity defaults configured in MS DB will be considered as the Max Limits for velocity changes. When ‘false’ max allowed limits will be 999999999999 for Type “Count” and 9999999999.99 for Type ‘Value’. | Boolean getIsVelocityCeiling() | setIsVelocityCeiling(Boolean isVelocityCeiling) |

## Example (as JSON)

```json
{
  "Level": "OU",
  "DailySpendLimit": 120.0,
  "WeeklySpendLimit": 56.07,
  "MonthlySpendLimit": 0.0,
  "AnnualSpendLimit": 0.0,
  "LifeTimeSpendLimit": 0,
  "DailyVolumeLimit": 0,
  "WeeklyVolumeLimit": 0,
  "MonthlyVolumeLimit": 0,
  "AnnualVolumeLimit": 0,
  "LifeTimeVolumeLimit": 0,
  "TransactionSpendLimit": 0,
  "TransactionVolumeLimit": 0,
  "DailyTransactionCount": 100,
  "WeeklyTransactionCount": 100,
  "MonthlyTransactionCount": 100,
  "AnnualTransactionCount": 100,
  "LifeTimeTransactionCount": 100
}
```


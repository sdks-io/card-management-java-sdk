
# Usage Restrictions Card

## Structure

`UsageRestrictionsCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DailySpend` | `Double` | Optional | Maximum spend value (amount) allowed per day.<br>Optional<br>It allows null in the input field. If Values is passed as null, apply the card type limit. However, if the card type limit is NULL for the same field then No limit will be applied in Gateway. | Double getDailySpend() | setDailySpend(Double dailySpend) |
| `WeeklySpend` | `Double` | Optional | Maximum spend value (amount) allowed per week.<br>Optional | Double getWeeklySpend() | setWeeklySpend(Double weeklySpend) |
| `MonthlySpend` | `Double` | Optional | Maximum spend value (amount) allowed per month.<br>Optional | Double getMonthlySpend() | setMonthlySpend(Double monthlySpend) |
| `PerTransactionSpend` | `Double` | Optional | Maximum spend value (amount) allowed per transaction.<br>Optional | Double getPerTransactionSpend() | setPerTransactionSpend(Double perTransactionSpend) |
| `AnnualSpend` | `Double` | Optional | Maximum spend value (amount) allowed per annum.<br>Optional | Double getAnnualSpend() | setAnnualSpend(Double annualSpend) |
| `LifeTimeSpend` | `Double` | Optional | Maximum spend value (amount) allowed in card’s life time.<br>Optional | Double getLifeTimeSpend() | setLifeTimeSpend(Double lifeTimeSpend) |
| `DailyVolume` | `Double` | Optional | Maximum volume (quantity) allowed per day.<br>Optional | Double getDailyVolume() | setDailyVolume(Double dailyVolume) |
| `WeeklyVolume` | `Double` | Optional | Maximum volume (quantity) allowed per week.<br>Optional | Double getWeeklyVolume() | setWeeklyVolume(Double weeklyVolume) |
| `MonthlyVolume` | `Double` | Optional | Maximum volume (quantity) allowed per month.<br>Optional | Double getMonthlyVolume() | setMonthlyVolume(Double monthlyVolume) |
| `PerTransactionVolume` | `Double` | Optional | Maximum volume (quantity) allowed per transaction.<br>Optional | Double getPerTransactionVolume() | setPerTransactionVolume(Double perTransactionVolume) |
| `AnnualVolume` | `Double` | Optional | Maximum volume (quantity) allowed per annum.<br>Optional | Double getAnnualVolume() | setAnnualVolume(Double annualVolume) |
| `LifeTimeVolume` | `Double` | Optional | Maximum volume (quantity) allowed in card’s life time.<br>Optional | Double getLifeTimeVolume() | setLifeTimeVolume(Double lifeTimeVolume) |
| `DailyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per day.<br>Optional | Double getDailyTransactionCount() | setDailyTransactionCount(Double dailyTransactionCount) |
| `WeeklyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per week.<br>Optional | Double getWeeklyTransactionCount() | setWeeklyTransactionCount(Double weeklyTransactionCount) |
| `MonthlyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per month.<br>Optional. | Double getMonthlyTransactionCount() | setMonthlyTransactionCount(Double monthlyTransactionCount) |
| `AnnualTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per annum. | Double getAnnualTransactionCount() | setAnnualTransactionCount(Double annualTransactionCount) |
| `LifeTimeTransactionCount` | `Double` | Optional | Maximum number of transactions allowed in card’s lifetime.<br>Optional | Double getLifeTimeTransactionCount() | setLifeTimeTransactionCount(Double lifeTimeTransactionCount) |

## Example (as JSON)

```json
{
  "DailySpend": 76.58,
  "WeeklySpend": 181.92,
  "MonthlySpend": 132.96,
  "PerTransactionSpend": 101.58,
  "AnnualSpend": 51.38
}
```


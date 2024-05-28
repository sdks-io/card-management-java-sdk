
# Usage Restrictions

## Structure

`UsageRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DailySpend` | `Double` | Optional | Maximum spend value (amount) allowed per day.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getDailySpend() | setDailySpend(Double dailySpend) |
| `WeeklySpend` | `Double` | Optional | Maximum spend value (amount) allowed per week.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getWeeklySpend() | setWeeklySpend(Double weeklySpend) |
| `MonthlySpend` | `Double` | Optional | Maximum spend value (amount) allowed per month.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getMonthlySpend() | setMonthlySpend(Double monthlySpend) |
| `PerTransactionSpend` | `Double` | Optional | Maximum spend value (amount) allowed per transaction.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getPerTransactionSpend() | setPerTransactionSpend(Double perTransactionSpend) |
| `DailyVolume` | `Integer` | Optional | Maximum volume (quantity) allowed per day.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Integer getDailyVolume() | setDailyVolume(Integer dailyVolume) |
| `WeeklyVolume` | `Integer` | Optional | Maximum volume (quantity) allowed per week.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Integer getWeeklyVolume() | setWeeklyVolume(Integer weeklyVolume) |
| `MonthlyVolume` | `Integer` | Optional | Maximum volume (quantity) allowed per month.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Integer getMonthlyVolume() | setMonthlyVolume(Integer monthlyVolume) |
| `PerTransactionVolume` | `Integer` | Optional | Maximum volume (quantity) allowed per transaction.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Integer getPerTransactionVolume() | setPerTransactionVolume(Integer perTransactionVolume) |
| `DailyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per day.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getDailyTransactionCount() | setDailyTransactionCount(Double dailyTransactionCount) |
| `WeeklyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per week.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getWeeklyTransactionCount() | setWeeklyTransactionCount(Double weeklyTransactionCount) |
| `MonthlyTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per month.<br>Optional.<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getMonthlyTransactionCount() | setMonthlyTransactionCount(Double monthlyTransactionCount) |
| `AnnualSpend` | `Double` | Optional | Maximum spend value (amount) allowed per annum.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getAnnualSpend() | setAnnualSpend(Double annualSpend) |
| `LifeTimeSpend` | `Double` | Optional | Maximum spend value (amount) allowed in card’s life time.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getLifeTimeSpend() | setLifeTimeSpend(Double lifeTimeSpend) |
| `AnnualVolume` | `Double` | Optional | Maximum volume (quantity) allowed per annum.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getAnnualVolume() | setAnnualVolume(Double annualVolume) |
| `LifeTimeVolume` | `Double` | Optional | Maximum volume (quantity) allowed in card’s life time.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getLifeTimeVolume() | setLifeTimeVolume(Double lifeTimeVolume) |
| `AnnualTransactionCount` | `Double` | Optional | Maximum number of transactions allowed per annum.<br>Optional.<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getAnnualTransactionCount() | setAnnualTransactionCount(Double annualTransactionCount) |
| `LifeTimeTransactionCount` | `Double` | Optional | Maximum number of transactions allowed in card’s lifetime.<br>Optional<br>The value ‘0’ represents not set. If Values is passed as null, will be considered as inherited.<br>Valid range: 0 to 9999999999 | Double getLifeTimeTransactionCount() | setLifeTimeTransactionCount(Double lifeTimeTransactionCount) |

## Example (as JSON)

```json
{
  "DailySpend": 7.72,
  "WeeklySpend": 10.22,
  "MonthlySpend": 48.66,
  "PerTransactionSpend": 17.28,
  "DailyVolume": 122
}
```


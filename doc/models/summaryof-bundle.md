
# Summaryof Bundle

## Structure

`SummaryofBundle`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Either PayerId or PayerNumber or both must be passed.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Either PayerId or PayerNumber or both must be passed.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Either AccountId or AccountNumber or both must be passed.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Either AccountId or AccountNumber or both must be passed.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `BundleId` | `List<String>` | Required | Identifier of the card bundle in Gateway.<br>Mandatory | List<String> getBundleId() | setBundleId(List<String> bundleId) |

## Example (as JSON)

```json
{
  "ColCoId": 12,
  "ColCoCode": 26,
  "PayerNumber": "PayerNumber4",
  "PayerId": 60,
  "AccountId": 120,
  "BundleId": [
    "BundleId0"
  ]
}
```


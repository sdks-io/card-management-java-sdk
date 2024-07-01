
# Summaryofbundle Response

## Structure

`SummaryofbundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |
| `PayerId` | `Integer` | Optional | Payer Id of the bundles and cards.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the bundles and cards.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | - | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the bundle.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CountOfCardsNotInBundle` | `Integer` | Optional | Count of cards that are not part of the bundle in a given account. | Integer getCountOfCardsNotInBundle() | setCountOfCardsNotInBundle(Integer countOfCardsNotInBundle) |
| `CardBundles` | [`CardBundle`](../../doc/models/card-bundle.md) | Optional | - | CardBundle getCardBundles() | setCardBundles(CardBundle cardBundles) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "2ace3991-5d03-4a68-ac68-ca9119b25101",
  "PayerId": 70,
  "PayerNumber": "PayerNumber2",
  "AccountId": 130,
  "AccountNumber": "AccountNumber4"
}
```



# Summary of Bundle Response Data Items

## Structure

`SummaryOfBundleResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | Payer Id of the bundles and cards.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the bundles and cards.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account ID of the bundle.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the bundle.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CountOfCardsNotInBundle` | `Integer` | Optional | Count of cards that are not part of the bundle in a given account. | Integer getCountOfCardsNotInBundle() | setCountOfCardsNotInBundle(Integer countOfCardsNotInBundle) |
| `CardBundles` | [`List<SummaryOfBundleResponseDataItemsCardBundlesItems>`](../../doc/models/summary-of-bundle-response-data-items-card-bundles-items.md) | Optional | List of Card Bundles | List<SummaryOfBundleResponseDataItemsCardBundlesItems> getCardBundles() | setCardBundles(List<SummaryOfBundleResponseDataItemsCardBundlesItems> cardBundles) |

## Example (as JSON)

```json
{
  "PayerId": 102,
  "PayerNumber": "PayerNumber6",
  "AccountId": 162,
  "AccountNumber": "AccountNumber8",
  "CountOfCardsNotInBundle": 222
}
```


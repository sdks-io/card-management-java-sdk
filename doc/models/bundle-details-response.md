
# Bundle Details Response

## Structure

`BundleDetailsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | Payer Id of the bundles and cards.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the bundles and cards.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account ID of the bundle.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the bundle.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `BundleId` | `String` | Optional | unique identifier for the Card Bundle | String getBundleId() | setBundleId(String bundleId) |
| `ExternalBundleId` | `String` | Optional | External system allocated Card Bundle identifier for Card Bundle. | String getExternalBundleId() | setExternalBundleId(String externalBundleId) |
| `Description` | `String` | Optional | Card Bundle Description. | String getDescription() | setDescription(String description) |
| `Pans` | `List<String>` | Optional | List of Card Pans added to the card bundle. | List<String> getPans() | setPans(List<String> pans) |
| `RestrictionCurrencyCode` | `String` | Optional | ISO currency code of the country.<br>Example: GBP | String getRestrictionCurrencyCode() | setRestrictionCurrencyCode(String restrictionCurrencyCode) |
| `RestrictionCurrencySymbol` | `String` | Optional | Currency symbol of the country.<br>Example: £, $ | String getRestrictionCurrencySymbol() | setRestrictionCurrencySymbol(String restrictionCurrencySymbol) |
| `Restrictions` | [`BundledRestrictionsList`](../../doc/models/bundled-restrictions-list.md) | Optional | - | BundledRestrictionsList getRestrictions() | setRestrictions(BundledRestrictionsList restrictions) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "PayerId": 172,
  "PayerNumber": "PayerNumber4",
  "AccountId": 232,
  "AccountNumber": "AccountNumber6",
  "BundleId": "BundleId4"
}
```


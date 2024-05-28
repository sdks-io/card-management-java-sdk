
# Summary of Bundle Response Data Items Card Bundles Items

## Structure

`SummaryOfBundleResponseDataItemsCardBundlesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BundleId` | `String` | Optional | Gateway assigned unique identifier for the Card Bundle. | String getBundleId() | setBundleId(String bundleId) |
| `ExternalBundleId` | `String` | Optional | External system allocated Card Bundle identifier for Card Bundle. | String getExternalBundleId() | setExternalBundleId(String externalBundleId) |
| `Description` | `String` | Optional | Card Bundle Description. | String getDescription() | setDescription(String description) |
| `TotalCards` | `Integer` | Optional | No of Card PAN added to the card bundle. | Integer getTotalCards() | setTotalCards(Integer totalCards) |

## Example (as JSON)

```json
{
  "BundleId": "BundleId0",
  "ExternalBundleId": "ExternalBundleId4",
  "Description": "Description8",
  "TotalCards": 126
}
```


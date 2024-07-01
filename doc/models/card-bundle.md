
# Card Bundle

## Structure

`CardBundle`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BundleId` | `String` | Optional | Unique identifier for the Card Bundle | String getBundleId() | setBundleId(String bundleId) |
| `ExternalBundleId` | `String` | Optional | External system allocated Card Bundle identifier for Card Bundle. | String getExternalBundleId() | setExternalBundleId(String externalBundleId) |
| `Description` | `String` | Optional | DescriptionCard Bundle Description. | String getDescription() | setDescription(String description) |
| `TotalCards` | `Integer` | Optional | No of Card PAN added to the card bundle. | Integer getTotalCards() | setTotalCards(Integer totalCards) |

## Example (as JSON)

```json
{
  "BundleId": "BundleId4",
  "ExternalBundleId": "ExternalBundleId0",
  "Description": "Description4",
  "TotalCards": 126
}
```


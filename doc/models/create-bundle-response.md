
# Create Bundle Response

## Structure

`CreateBundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |
| `BundleCreationStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getBundleCreationStatus() | setBundleCreationStatus(ErrorStatus bundleCreationStatus) |
| `BundleId` | `String` | Optional | Identifier of the newly created bundle | String getBundleId() | setBundleId(String bundleId) |
| `DayTimeRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getDayTimeRestrictionStatus() | setDayTimeRestrictionStatus(ErrorStatus dayTimeRestrictionStatus) |
| `DayTimeRestrictionProfileId` | `String` | Optional | Identifier of the day/time restriction profile created | String getDayTimeRestrictionProfileId() | setDayTimeRestrictionProfileId(String dayTimeRestrictionProfileId) |
| `LocationRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getLocationRestrictionStatus() | setLocationRestrictionStatus(ErrorStatus locationRestrictionStatus) |
| `LocationRestrictionProfileId` | `String` | Optional | Identifier of the location restriction profile created | String getLocationRestrictionProfileId() | setLocationRestrictionProfileId(String locationRestrictionProfileId) |
| `UsageRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getUsageRestrictionStatus() | setUsageRestrictionStatus(ErrorStatus usageRestrictionStatus) |
| `ProductRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getProductRestrictionStatus() | setProductRestrictionStatus(ErrorStatus productRestrictionStatus) |
| `Cards` | [`BundleCardRestrictionStatus`](../../doc/models/bundle-card-restriction-status.md) | Optional | - | BundleCardRestrictionStatus getCards() | setCards(BundleCardRestrictionStatus cards) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "2ace3991-5d03-4a68-ac68-ca9119b25101",
  "BundleCreationStatus": {
    "Code": "Code8",
    "Description": "Description8"
  },
  "BundleId": "BundleId2",
  "DayTimeRestrictionStatus": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId0"
}
```


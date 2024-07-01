
# Update Bundle Response

## Structure

`UpdateBundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |
| `RequestActionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getRequestActionStatus() | setRequestActionStatus(ErrorStatus requestActionStatus) |
| `DayTimeRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getDayTimeRestrictionStatus() | setDayTimeRestrictionStatus(ErrorStatus dayTimeRestrictionStatus) |
| `LocationRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getLocationRestrictionStatus() | setLocationRestrictionStatus(ErrorStatus locationRestrictionStatus) |
| `ProductRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getProductRestrictionStatus() | setProductRestrictionStatus(ErrorStatus productRestrictionStatus) |
| `UsageRestrictionStatus` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getUsageRestrictionStatus() | setUsageRestrictionStatus(ErrorStatus usageRestrictionStatus) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "2ace3991-5d03-4a68-ac68-ca9119b25101",
  "RequestActionStatus": {
    "Code": "Code6",
    "Description": "Description0"
  },
  "DayTimeRestrictionStatus": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "LocationRestrictionStatus": {
    "Code": "Code6",
    "Description": "Description0"
  },
  "ProductRestrictionStatus": {
    "Code": "Code8",
    "Description": "Description8"
  }
}
```


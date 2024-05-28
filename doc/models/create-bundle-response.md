
# Create Bundle Response

## Structure

`CreateBundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Response status | String getStatus() | setStatus(String status) |
| `Data` | [`List<CreateBundleResponseDataItems>`](../../doc/models/create-bundle-response-data-items.md) | Optional | - | List<CreateBundleResponseDataItems> getData() | setData(List<CreateBundleResponseDataItems> data) |
| `Errors` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getErrors() | setErrors(List<ErrorDetails> errors) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "Status": "Status8",
  "Data": [
    {
      "BundleId": "BundleId6",
      "Cards": [
        {
          "PAN": "PAN0"
        }
      ],
      "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId4",
      "LocationRestrictionProfileId": "LocationRestrictionProfileId6",
      "ProductRestrictionProfileId": "ProductRestrictionProfileId0"
    },
    {
      "BundleId": "BundleId6",
      "Cards": [
        {
          "PAN": "PAN0"
        }
      ],
      "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId4",
      "LocationRestrictionProfileId": "LocationRestrictionProfileId6",
      "ProductRestrictionProfileId": "ProductRestrictionProfileId0"
    },
    {
      "BundleId": "BundleId6",
      "Cards": [
        {
          "PAN": "PAN0"
        }
      ],
      "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId4",
      "LocationRestrictionProfileId": "LocationRestrictionProfileId6",
      "ProductRestrictionProfileId": "ProductRestrictionProfileId0"
    }
  ],
  "Errors": [
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ]
}
```


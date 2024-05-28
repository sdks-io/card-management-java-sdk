
# Update Bundle Response

## Structure

`UpdateBundleResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | API Response Status | String getStatus() | setStatus(String status) |
| `Errors` | [`ErrorDetails`](../../doc/models/error-details.md) | Optional | - | ErrorDetails getErrors() | setErrors(ErrorDetails errors) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId4",
  "Status": "Status0",
  "Errors": {
    "Code": "Code4",
    "Title": "Title6",
    "Detail": "Detail6",
    "AdditionalInfo": {
      "key1": "val1",
      "key2": "val2"
    }
  }
}
```


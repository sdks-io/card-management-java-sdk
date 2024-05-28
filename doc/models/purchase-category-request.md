
# Purchase Category Request

## Structure

`PurchaseCategoryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code). | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id (in Shell Cards Platform). | Integer getColCoId() | setColCoId(Integer colCoId) |
| `CardTypeId` | `Integer` | Optional | Card type Id | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `PurchaseCategoryId` | `Integer` | Optional | Purchase category Id<br>Optional.<br>Example: 123, 124, etc., | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `LanguageCode` | `String` | Optional | Language code for the Title and Description.<br>Language codes should be same as SFH supported language<br>Optional.<br>Default: en-GB<br>Example:<br>en-GB – English (UK)<br>nl-NL – Dutch (Netherlands) | String getLanguageCode() | setLanguageCode(String languageCode) |

## Example (as JSON)

```json
{
  "PurchaseCategoryId": 123,
  "LanguageCode": "en-GB",
  "RequestId": "RequestId6",
  "ColCoCode": 30,
  "ColCoId": 16,
  "CardTypeId": 82
}
```


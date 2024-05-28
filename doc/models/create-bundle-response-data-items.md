
# Create Bundle Response Data Items

## Structure

`CreateBundleResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BundleId` | `String` | Optional | Identifier of the newly created bundle in Gateway. | String getBundleId() | setBundleId(String bundleId) |
| `Cards` | [`List<CreateBundleResponseDataItemsCardsItems>`](../../doc/models/create-bundle-response-data-items-cards-items.md) | Optional | List of product restriction requests validated and submitted successfully for each card. | List<CreateBundleResponseDataItemsCardsItems> getCards() | setCards(List<CreateBundleResponseDataItemsCardsItems> cards) |
| `DayTimeRestrictionProfileId` | `String` | Optional | Identifier of the day/time restriction profile created for the bundle in Gateway.<br>This will be null if respective action is passed as “Default”. | String getDayTimeRestrictionProfileId() | setDayTimeRestrictionProfileId(String dayTimeRestrictionProfileId) |
| `LocationRestrictionProfileId` | `String` | Optional | Identifier of the location restriction profile created for the bundle in Gateway.<br>This will be null if respective action is passed as “Default”. | String getLocationRestrictionProfileId() | setLocationRestrictionProfileId(String locationRestrictionProfileId) |
| `ProductRestrictionProfileId` | `String` | Optional | Identifier of the location restriction profile created for the bundle in Gateway.<br>This will be null if respective action is passed as “Default”. | String getProductRestrictionProfileId() | setProductRestrictionProfileId(String productRestrictionProfileId) |

## Example (as JSON)

```json
{
  "BundleId": "BundleId0",
  "Cards": [
    {
      "PAN": "PAN0"
    },
    {
      "PAN": "PAN0"
    }
  ],
  "DayTimeRestrictionProfileId": "DayTimeRestrictionProfileId8",
  "LocationRestrictionProfileId": "LocationRestrictionProfileId0",
  "ProductRestrictionProfileId": "ProductRestrictionProfileId4"
}
```


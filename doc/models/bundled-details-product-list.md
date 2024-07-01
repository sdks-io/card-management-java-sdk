
# Bundled Details Product List

## Structure

`BundledDetailsProductList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PurchaseCategoryId` | `Integer` | Optional | Purchase category Id<br>Example: 123, 124, etc., | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `PurchaseCategoryCode` | `String` | Optional | Purchase category name.<br>Example:<br>0 - All Fuels (without VP) and Lubricants<br>1 - FuelSave only<br>2 - FuelSave and Lubricants<br>3 - No Restrictions | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `Products` | `List<String>` | Optional | An array of 3-digit global product codes.<br>Example: [ "033", "021", "023" ] | List<String> getProducts() | setProducts(List<String> products) |
| `ProductGroups` | `List<String>` | Optional | An array of product group ids.<br>Example: [ "670246404", "40557126" ] | List<String> getProductGroups() | setProductGroups(List<String> productGroups) |
| `FuelSetId` | `String` | Optional | Fuel set id that is allowed to be purchased with the card | String getFuelSetId() | setFuelSetId(String fuelSetId) |
| `FuelSetName` | `String` | Optional | Fuel set name that is allowed to be purchased with the card | String getFuelSetName() | setFuelSetName(String fuelSetName) |
| `NonFuelSets` | `String` | Optional | Non-Fuel set name that is allowed to be purchased with the card | String getNonFuelSets() | setNonFuelSets(String nonFuelSets) |

## Example (as JSON)

```json
{
  "PurchaseCategoryId": 162,
  "PurchaseCategoryCode": "PurchaseCategoryCode6",
  "Products": [
    "Products2",
    "Products3",
    "Products4"
  ],
  "ProductGroups": [
    "ProductGroups5",
    "ProductGroups6",
    "ProductGroups7"
  ],
  "FuelSetId": "FuelSetId8"
}
```


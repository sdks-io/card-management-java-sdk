
# Product Group

## Structure

`ProductGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReferenceId` | `Integer` | Optional | Referenced Purchase Category Id<br>Example: 123, 124 | Integer getReferenceId() | setReferenceId(Integer referenceId) |
| `ProductGroupId` | `String` | Optional | Product group ID | String getProductGroupId() | setProductGroupId(String productGroupId) |
| `Name` | `String` | Optional | Product group name | String getName() | setName(String name) |
| `IsDefault` | `Boolean` | Optional | Indicates whether this is a default Product Group at ColCo level or not.<br>Note: The Customer level default settings are not considered here. | Boolean getIsDefault() | setIsDefault(Boolean isDefault) |
| `IsFuelType` | `Boolean` | Optional | Identifies the type of Product group.<br>true - if it is a Fuel type Product group<br>false - if it is Non-Fuel type | Boolean getIsFuelType() | setIsFuelType(Boolean isFuelType) |
| `Products` | [`List<ProductAllOf0>`](../../doc/models/product-all-of-0.md) | Optional | - | List<ProductAllOf0> getProducts() | setProducts(List<ProductAllOf0> products) |

## Example (as JSON)

```json
{
  "ReferenceId": 123,
  "ProductGroupId": "7",
  "Name": "Automotive Gas Oil",
  "IsDefault": false,
  "IsFuelType": false
}
```


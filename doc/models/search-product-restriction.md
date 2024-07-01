
# Search Product Restriction

## Structure

`SearchProductRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Products` | [`List<RestrictionProduct>`](../../doc/models/restriction-product.md) | Optional | - | List<RestrictionProduct> getProducts() | setProducts(List<RestrictionProduct> products) |
| `ProductGroups` | [`List<ProductGroup>`](../../doc/models/product-group.md) | Optional | - | List<ProductGroup> getProductGroups() | setProductGroups(List<ProductGroup> productGroups) |

## Example (as JSON)

```json
{
  "Products": [
    {
      "GlobalProductCode": "GlobalProductCode6",
      "Description": "Description8"
    },
    {
      "GlobalProductCode": "GlobalProductCode6",
      "Description": "Description8"
    }
  ],
  "ProductGroups": [
    {
      "ReferenceId": 82,
      "ProductGroupId": "ProductGroupId6",
      "Name": "Name0",
      "IsDefault": false,
      "IsFuelType": false
    }
  ]
}
```


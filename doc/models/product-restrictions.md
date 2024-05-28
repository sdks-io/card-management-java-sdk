
# Product Restrictions

## Structure

`ProductRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Products` | `List<String>` | Optional | An array of 3-digit global product codes.<br>Optional. However, this field is mandatory when the Product restrictions are migrated to Gateway and Product Groups are not provided.<br>Example: [ "033", "021", "023" ] | List<String> getProducts() | setProducts(List<String> products) |
| `ProductGroups` | `List<String>` | Optional | An array of product group ids.<br>Optional. However, this field is mandatory when the Product restrictions are migrated to Gateway and Products are not provided.<br>Example: [ "670246404", "40557126" ] | List<String> getProductGroups() | setProductGroups(List<String> productGroups) |

## Example (as JSON)

```json
{
  "Products": [
    "Products4"
  ],
  "ProductGroups": [
    "ProductGroups3",
    "ProductGroups4"
  ]
}
```


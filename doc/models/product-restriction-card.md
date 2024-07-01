
# Product Restriction Card

## Structure

`ProductRestrictionCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Products` | `List<String>` | Optional | An array of 3-digit global product codes.<br>Optional.<br>Example: [ "033", "021", "023”] | List<String> getProducts() | setProducts(List<String> products) |
| `ProductGroups` | `List<String>` | Optional | An array of product group IDs.<br>Optional.<br>Example: [ "670246404", "40557126" ] | List<String> getProductGroups() | setProductGroups(List<String> productGroups) |

## Example (as JSON)

```json
{
  "Products": [
    "Products2"
  ],
  "ProductGroups": [
    "ProductGroups9",
    "ProductGroups0"
  ]
}
```


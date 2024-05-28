
# Purchase Category Response

## Structure

`PurchaseCategoryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PurchaseCategories` | [`List<PurchaseCategory1AllOf0>`](../../doc/models/purchase-category-1-all-of-0.md) | Optional | - | List<PurchaseCategory1AllOf0> getPurchaseCategories() | setPurchaseCategories(List<PurchaseCategory1AllOf0> purchaseCategories) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "PurchaseCategories": [
    {
      "Id": 166,
      "Code": "Code6",
      "Name": "Name4",
      "IsVisible": false,
      "ProductGroups": [
        {
          "ReferenceId": 82,
          "ProductGroupId": "ProductGroupId6",
          "Name": "Name0",
          "IsDefault": false,
          "IsFuelType": false
        }
      ],
      "Title": "Title4",
      "Description": "Description0"
    },
    {
      "Id": 166,
      "Code": "Code6",
      "Name": "Name4",
      "IsVisible": false,
      "ProductGroups": [
        {
          "ReferenceId": 82,
          "ProductGroupId": "ProductGroupId6",
          "Name": "Name0",
          "IsDefault": false,
          "IsFuelType": false
        }
      ],
      "Title": "Title4",
      "Description": "Description0"
    },
    {
      "Id": 166,
      "Code": "Code6",
      "Name": "Name4",
      "IsVisible": false,
      "ProductGroups": [
        {
          "ReferenceId": 82,
          "ProductGroupId": "ProductGroupId6",
          "Name": "Name0",
          "IsDefault": false,
          "IsFuelType": false
        }
      ],
      "Title": "Title4",
      "Description": "Description0"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


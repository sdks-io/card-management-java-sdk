
# Purchase Categories

## Structure

`PurchaseCategories`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | Purchase category Id | Integer getId() | setId(Integer id) |
| `Code` | `String` | Optional | Purchase category code<br>Example: 0,1, 2 etc.<br>Full list below:<br>0 - All Fuels (without VP) and Lubricants<br>1 - Fuel Save only<br>2 - Fuel Save and Lubricants<br>3 - No Restrictions<br>4 - VP and Fuel Save<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and Fuel Save and Lubricants | String getCode() | setCode(String code) |
| `Name` | `String` | Optional | Purchase category name<br>Example: Fuel Save Only<br>Full list below:<br>0 - All Fuels (without VP) and Lubricants<br>1 - Fuel Save only<br>2 - Fuel Save and Lubricants<br>3 - No Restrictions<br>4 - VP and Fuel Save<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and Fuel Save and Lubricants | String getName() | setName(String name) |
| `IsVisible` | `Boolean` | Optional | If True then PurchaseCategory can be used while submitting new order cards requests.<br>If false this PurchaseCategory will not be used for Ordering Cards. | Boolean getIsVisible() | setIsVisible(Boolean isVisible) |
| `ProductGroups` | `String` | Optional | List of Default product groups | String getProductGroups() | setProductGroups(String productGroups) |

## Example (as JSON)

```json
{
  "Id": 123,
  "Code": "1",
  "Name": "FuelSave only",
  "ProductGroups": "19,1",
  "IsVisible": false
}
```


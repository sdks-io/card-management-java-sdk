
# Payer Access

## Structure

`PayerAccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IsDefault` | `Boolean` | Optional | Whether this payer is the default payer of the user.<br>**Default**: `false` | Boolean getIsDefault() | setIsDefault(Boolean isDefault) |
| `ColcoId` | `Integer` | Optional | Collecting company id. | Integer getColcoId() | setColcoId(Integer colcoId) |
| `ColcoCode` | `Integer` | Optional | Collecting company code.<br>Example:<br>86-Philippines<br>5-UK | Integer getColcoCode() | setColcoCode(Integer colcoCode) |
| `ColCoCountryCode` | `String` | Optional | The 2-character ISO Code for the customer and card owning country | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `PayerGroupId` | `Integer` | Optional | Payer Group Id of the payer. | Integer getPayerGroupId() | setPayerGroupId(Integer payerGroupId) |
| `PayerGroup` | `String` | Optional | Payer group of the payer.<br>The value of this parameter will always be null when the input parameter “IncludePayerGroup” is false. | String getPayerGroup() | setPayerGroup(String payerGroup) |
| `PayerId` | `Integer` | Optional | Payer Id to which the user has access<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number to which the user has access<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerName` | `String` | Optional | Name of the Payer to which the user has access | String getPayerName() | setPayerName(String payerName) |

## Example (as JSON)

```json
{
  "IsDefault": false,
  "ColcoId": 14,
  "ColcoCode": 14,
  "ColCoCountryCode": "DE",
  "PayerGroupId": 123,
  "PayerGroup": "null",
  "PayerId": 854,
  "PayerNumber": "DE26688504",
  "PayerName": "TK MobilPlus"
}
```


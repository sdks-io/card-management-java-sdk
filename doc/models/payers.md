
# Payers

## Structure

`Payers`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the payer | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer id of the customer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the customer. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerName` | `String` | Optional | Payer Name of the customer. | String getPayerName() | setPayerName(String payerName) |
| `PayerGroupId` | `Integer` | Optional | Payer Group identifier of the customer | Integer getPayerGroupId() | setPayerGroupId(Integer payerGroupId) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "PayerId": 12345,
  "PayerName": "ABC company",
  "PayerGroupId": 456,
  "PayerNumber": "PayerNumber0"
}
```


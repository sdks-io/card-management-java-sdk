
# Create Card Response

This entity models the data that is sent in the http response body for this operation.

## Structure

`CreateCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DriverAndVRN` | `String` | Optional | Driver and VRN of the card. ;( semicolon) is used as delimiter | String getDriverAndVRN() | setDriverAndVRN(String driverAndVRN) |
| `OrderCardReference` | `Integer` | Optional | Reference number for each individual card in the order | Integer getOrderCardReference() | setOrderCardReference(Integer orderCardReference) |

## Example (as JSON)

```json
{
  "DriverAndVRN": "Robert:MV65YLH",
  "OrderCardReference": 488351
}
```


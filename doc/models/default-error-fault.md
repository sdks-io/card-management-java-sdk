
# Default Error Fault

Error object

## Structure

`DefaultErrorFault`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Faultstring` | `String` | Optional | Error Description | String getFaultstring() | setFaultstring(String faultstring) |
| `Detail` | [`DefaultErrorFaultDetail`](../../doc/models/default-error-fault-detail.md) | Optional | Details about the error | DefaultErrorFaultDetail getDetail() | setDetail(DefaultErrorFaultDetail detail) |

## Example (as JSON)

```json
{
  "faultstring": "faultstring8",
  "detail": {
    "errorcode": "errorcode6"
  }
}
```


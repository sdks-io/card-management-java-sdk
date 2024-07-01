
# Default Error Fault

Error object

## Structure

`DefaultErrorFault`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Faultstring` | `String` | Optional | Error Description | String getFaultstring() | setFaultstring(String faultstring) |
| `Detail` | [`Detail`](../../doc/models/detail.md) | Optional | - | Detail getDetail() | setDetail(Detail detail) |

## Example (as JSON)

```json
{
  "faultstring": "faultstring8",
  "detail": {
    "errorcode": "errorcode6"
  }
}
```


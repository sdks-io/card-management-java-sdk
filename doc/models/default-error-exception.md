
# Default Error Exception

Error response

## Structure

`DefaultErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Fault` | [`DefaultErrorFault`](../../doc/models/default-error-fault.md) | Optional | Error object | DefaultErrorFault getFault() | setFault(DefaultErrorFault fault) |

## Example (as JSON)

```json
{
  "fault": {
    "faultstring": "faultstring2",
    "detail": {
      "errorcode": "errorcode6"
    }
  }
}
```


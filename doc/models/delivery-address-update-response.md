
# Delivery Address Update Response

## Structure

`DeliveryAddressUpdateResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request ID to which was passed on the API request. | String getRequestId() | setRequestId(String requestId) |
| `ServiceReference` | `Integer` | Optional | Service reference number for tracking. | Integer getServiceReference() | setServiceReference(Integer serviceReference) |
| `DeliveryAddressUpdateReferences` | [`DeliveryAddressUpdateReferences2`](../../doc/models/delivery-address-update-references-2.md) | Optional | - | DeliveryAddressUpdateReferences2 getDeliveryAddressUpdateReferences() | setDeliveryAddressUpdateReferences(DeliveryAddressUpdateReferences2 deliveryAddressUpdateReferences) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "eb621f45-a543-4d9a-a934-2f223b263c42",
  "ServiceReference": 123456,
  "DeliveryAddressUpdateReferences": {
    "CardId": 66,
    "CardPAN": "CardPAN8",
    "AccountId": 160,
    "AccountNumber": "AccountNumber8",
    "ReferenceId": 10
  },
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


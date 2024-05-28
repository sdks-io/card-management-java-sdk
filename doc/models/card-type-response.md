
# Card Type Response

## Structure

`CardTypeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerCardTypes` | [`List<CardTypeResponseCustomerCardTypesItems>`](../../doc/models/card-type-response-customer-card-types-items.md) | Optional | - | List<CardTypeResponseCustomerCardTypesItems> getCustomerCardTypes() | setCustomerCardTypes(List<CardTypeResponseCustomerCardTypesItems> customerCardTypes) |
| `Error` | [`CardTypeResponseError`](../../doc/models/card-type-response-error.md) | Optional | - | CardTypeResponseError getError() | setError(CardTypeResponseError error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "RequestId": "a0a7ceb0-5b32-4ec8-88e1-ad868967e43f",
  "CustomerCardTypes": [
    {
      "CanHavePIN": false,
      "CardTypeId": 2,
      "CardTypeName": "CardTypeName2",
      "ColCoCurrencyCode": "ColCoCurrencyCode4",
      "CustomerCardTypeId": 32
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


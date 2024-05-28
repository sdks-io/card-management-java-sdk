
# Cancel Card Response

## Structure

`CancelCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `MainReference` | `Integer` | Optional | Cancel card reference number for tracking the execution of the request. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `OrderReplacementReference` | `Integer` | Optional | Order replacement reference number for tracking the execution of the order replacement cards request. | Integer getOrderReplacementReference() | setOrderReplacementReference(Integer orderReplacementReference) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCESS, FAILED, PARTIAL_SUCCESS | String getStatus() | setStatus(String status) |
| `Data` | [`List<SubmittedCard>`](../../doc/models/submitted-card.md) | Optional | - | List<SubmittedCard> getData() | setData(List<SubmittedCard> data) |
| `Errors` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getErrors() | setErrors(List<ErrorDetails> errors) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "MainReference": 166,
  "OrderReplacementReference": 120,
  "Status": "Status8",
  "Data": [
    {
      "ReplacementCardReference": 84,
      "UpdateCardReference": 178,
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CardExpiryDate": "CardExpiryDate6"
    },
    {
      "ReplacementCardReference": 84,
      "UpdateCardReference": 178,
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CardExpiryDate": "CardExpiryDate6"
    },
    {
      "ReplacementCardReference": 84,
      "UpdateCardReference": 178,
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "CardExpiryDate": "CardExpiryDate6"
    }
  ]
}
```


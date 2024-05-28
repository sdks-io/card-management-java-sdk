
# Card Move Response

## Structure

`CardMoveResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MoveCardRequestReference` | `Integer` | Optional | - | Integer getMoveCardRequestReference() | setMoveCardRequestReference(Integer moveCardRequestReference) |
| `SuccessfulRequests` | [`List<CardMoveResponseSuccessfulRequestsItems>`](../../doc/models/card-move-response-successful-requests-items.md) | Optional | - | List<CardMoveResponseSuccessfulRequestsItems> getSuccessfulRequests() | setSuccessfulRequests(List<CardMoveResponseSuccessfulRequestsItems> successfulRequests) |
| `ErrorCards` | [`List<CardMoveResponseErrorCardsItems>`](../../doc/models/card-move-response-error-cards-items.md) | Optional | - | List<CardMoveResponseErrorCardsItems> getErrorCards() | setErrorCards(List<CardMoveResponseErrorCardsItems> errorCards) |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "MoveCardRequestReference": 70,
  "SuccessfulRequests": [
    {
      "AccountNumber": "AccountNumber8",
      "AccountId": 112,
      "PAN": "PAN0",
      "CardId": 18,
      "MoveCardReference": 248
    }
  ],
  "ErrorCards": [
    {
      "AccountNumber": "AccountNumber4",
      "AccountId": 230,
      "PAN": "PAN6",
      "CardId": 136,
      "ValidationErrorCode": "ValidationErrorCode6"
    },
    {
      "AccountNumber": "AccountNumber4",
      "AccountId": 230,
      "PAN": "PAN6",
      "CardId": 136,
      "ValidationErrorCode": "ValidationErrorCode6"
    }
  ],
  "RequestId": "RequestId2",
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```


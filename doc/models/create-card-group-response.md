
# Create Card Group Response

## Structure

`CreateCardGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainReference` | `Integer` | Optional | Reference number for tracking the execution of the requests – new Card Group creation and to move the cards to the new card group.<br>Reference number will be null when the validations of new card group parameters fail. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `NewCardGroupReference` | `Integer` | Optional | Reference number for tracking the execution of card group creation.<br>Reference number will be null when the validations of new card group parameters fail. | Integer getNewCardGroupReference() | setNewCardGroupReference(Integer newCardGroupReference) |
| `SuccessfulRequests` | [`List<CreateCardGroupResponseSuccessfulRequestsItems>`](../../doc/models/create-card-group-response-successful-requests-items.md) | Optional | List of cards validated and submitted successfully for processing. | List<CreateCardGroupResponseSuccessfulRequestsItems> getSuccessfulRequests() | setSuccessfulRequests(List<CreateCardGroupResponseSuccessfulRequestsItems> successfulRequests) |
| `ErrorCards` | [`List<CreateCardGroupResponseErrorCardsItems>`](../../doc/models/create-card-group-response-error-cards-items.md) | Optional | List of cards that failed validation and not submitted for processing.<br>Entity: FailedCardReference<br>This list will be empty when the validations of new card group parameters fail. | List<CreateCardGroupResponseErrorCardsItems> getErrorCards() | setErrorCards(List<CreateCardGroupResponseErrorCardsItems> errorCards) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "RequestId": "ed557f02-c7d7-4c01-b3e5-11bf3239c8ed",
  "MainReference": 104,
  "NewCardGroupReference": 174,
  "SuccessfulRequests": [
    {
      "CardId": 18,
      "PAN": "PAN0",
      "Reference": 228
    }
  ],
  "ErrorCards": [
    {
      "CardId": 136,
      "PAN": "PAN6",
      "ErrorCode": "ErrorCode0",
      "ErrorDescription": "ErrorDescription6"
    },
    {
      "CardId": 136,
      "PAN": "PAN6",
      "ErrorCode": "ErrorCode0",
      "ErrorDescription": "ErrorDescription6"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```



# Update Card Group Response

## Structure

`UpdateCardGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainReference` | `Integer` | Optional | Reference number for tracking the overall request.<br>The value will be null when the validation fails. | Integer getMainReference() | setMainReference(Integer mainReference) |
| `UpdateCardGroupReference` | `Integer` | Optional | Reference number for tracking the execution of terminate card-group request.<br>Reference number will be null when the validations fail or TerminateCardGroup in the request object is false. | Integer getUpdateCardGroupReference() | setUpdateCardGroupReference(Integer updateCardGroupReference) |
| `NewCardGroupReference` | `Integer` | Optional | Reference number for tracking the execution of new card group creation in the case when the cards in the terminating card-group have to be moved to a new card-group.<br>Reference number will be null when the validations fail or new card-group creation is not requested. | Integer getNewCardGroupReference() | setNewCardGroupReference(Integer newCardGroupReference) |
| `MoveCardReferences` | [`List<UpdateCardGroupResponseMoveCardReferencesItems>`](../../doc/models/update-card-group-response-move-card-references-items.md) | Optional | List of cards submitted successfully for processing the move to the target card-group or to change card-group to null.<br>This list will be empty when the validations fail or there are no cards in the card-group that is getting terminated or MoveCards in the request object is false | List<UpdateCardGroupResponseMoveCardReferencesItems> getMoveCardReferences() | setMoveCardReferences(List<UpdateCardGroupResponseMoveCardReferencesItems> moveCardReferences) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request ID | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "MainReference": 244,
  "UpdateCardGroupReference": 188,
  "NewCardGroupReference": 34,
  "MoveCardReferences": [
    {
      "CardId": 234,
      "PAN": "PAN6",
      "Reference": 188
    },
    {
      "CardId": 234,
      "PAN": "PAN6",
      "Reference": 188
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```



# Create Card Group Response Successful Requests Items

## Structure

`CreateCardGroupResponseSuccessfulRequestsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Card Id of the card. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | PAN of the card. | String getPAN() | setPAN(String pAN) |
| `Reference` | `Integer` | Optional | Reference number for tracking of update status request of the specific card, | Integer getReference() | setReference(Integer reference) |

## Example (as JSON)

```json
{
  "CardId": 250,
  "PAN": "PAN0",
  "Reference": 204
}
```


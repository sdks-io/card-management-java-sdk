
# Update Card Group Response Move Card References Items

## Structure

`UpdateCardGroupResponseMoveCardReferencesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Card Id of the card.<br>Example: 123 | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | PAN of the card.<br>Example: 7002051123456789145 | String getPAN() | setPAN(String pAN) |
| `Reference` | `Integer` | Optional | Reference number for tracking of update status request of the specific card. | Integer getReference() | setReference(Integer reference) |

## Example (as JSON)

```json
{
  "CardId": 2,
  "PAN": "PAN4",
  "Reference": 44
}
```



# Search Card

SearchCard

## Structure

`SearchCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Unique Card Id<br>Optional if PAN is given, else mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Card PAN.<br>Optional if CardId is given, else mandatory.<br>Note: PAN is ignored if CardId is given. | String getPAN() | setPAN(String pAN) |

## Example (as JSON)

```json
{
  "CardId": 32,
  "PAN": "PAN2"
}
```


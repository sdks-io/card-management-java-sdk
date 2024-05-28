
# Restriction Search Card Request Filters Cards Items

## Structure

`RestrictionSearchCardRequestFiltersCardsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PAN` | `String` | Optional | Card PAN.<br>Optional if CardId is given, else mandatory.<br>Note: PAN is ignored if CardId is given. | String getPAN() | setPAN(String pAN) |
| `CardId` | `Integer` | Optional | Unique Card Id in GFN.<br>Optional if PAN is given, else mandatory. | Integer getCardId() | setCardId(Integer cardId) |

## Example (as JSON)

```json
{
  "PAN": "PAN0",
  "CardId": 72
}
```


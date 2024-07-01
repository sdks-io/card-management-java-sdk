
# Card Restriction Response

## Structure

`CardRestrictionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |
| `RestrictionRequestReference` | `Double` | Optional | Reference number for tracking the execution of the card restriction requests. | Double getRestrictionRequestReference() | setRestrictionRequestReference(Double restrictionRequestReference) |
| `Cards` | [`List<RestrictioncardsRes>`](../../doc/models/restrictioncards-res.md) | Optional | - | List<RestrictioncardsRes> getCards() | setCards(List<RestrictioncardsRes> cards) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "2ace3991-5d03-4a68-ac68-ca9119b25101",
  "RestrictionRequestReference": 140.46,
  "Cards": [
    {
      "AccountId": 184,
      "AccountNumber": "AccountNumber8",
      "CardId": "CardId8",
      "PAN": "PAN0",
      "UsageRestrictionStatus": "UsageRestrictionStatus8"
    },
    {
      "AccountId": 184,
      "AccountNumber": "AccountNumber8",
      "CardId": "CardId8",
      "PAN": "PAN0",
      "UsageRestrictionStatus": "UsageRestrictionStatus8"
    },
    {
      "AccountId": 184,
      "AccountNumber": "AccountNumber8",
      "CardId": "CardId8",
      "PAN": "PAN0",
      "UsageRestrictionStatus": "UsageRestrictionStatus8"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```



# Create Card Group Response Error Cards Items

## Structure

`CreateCardGroupResponseErrorCardsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Card Id of the card. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | PAN of the card. | String getPAN() | setPAN(String pAN) |
| `ErrorCode` | `String` | Optional | Error code for validation failure. | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorDescription` | `String` | Optional | Description of validation failure. | String getErrorDescription() | setErrorDescription(String errorDescription) |

## Example (as JSON)

```json
{
  "CardId": 66,
  "PAN": "PAN2",
  "ErrorCode": "ErrorCode6",
  "ErrorDescription": "ErrorDescription2"
}
```


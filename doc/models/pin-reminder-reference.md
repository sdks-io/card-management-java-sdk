
# PIN Reminder Reference

This class holds the PIN Reminder References

## Structure

`PINReminderReference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `PANID` | `Integer` | Optional | PAN ID | Integer getPANID() | setPANID(Integer pANID) |
| `PAN` | `Integer` | Optional | PAN | Integer getPAN() | setPAN(Integer pAN) |
| `CardExpiryDate` | `String` | Optional | Expiry date of the card.<br>Mandatory if Either PAN or PANID is passed, else optional.<br>Format: yyyyMMdd | String getCardExpiryDate() | setCardExpiryDate(String cardExpiryDate) |
| `ReferenceId` | `Integer` | Optional | Individual card pin reminder reference number for the Pin Reminder request. | Integer getReferenceId() | setReferenceId(Integer referenceId) |

## Example (as JSON)

```json
{
  "CardId": 122,
  "PANID": 154,
  "PAN": 52,
  "CardExpiryDate": "CardExpiryDate4",
  "ReferenceId": 46
}
```


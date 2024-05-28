
# Create Card Group Request Cards Items

## Structure

`CreateCardGroupRequestCardsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the account of the card.<br>Optional if AccountNumber is passed, else Mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the account of the card.<br>Optional if AccountId is passed, else Mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CardId` | `Integer` | Optional | Card Id of the card.<br>Optional if PAN is passed, else Mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | PAN of the card.<br>Optional if CardId is passed, else Mandatory. | String getPAN() | setPAN(String pAN) |

## Example (as JSON)

```json
{
  "AccountId": 164,
  "AccountNumber": "AccountNumber4",
  "CardId": 70,
  "PAN": "PAN6"
}
```


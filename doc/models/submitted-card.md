
# Submitted Card

Response entity object for SubmittedCard list <br/>Note: This list will be empty for status 9006 and 9012 i.e., request for all the cards failed.

## Structure

`SubmittedCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReplacementCardReference` | `Integer` | Optional | Reference number for tracking of replacement card order request of the specific card,<br /><br>This is applicable for requests with target status as Block and OrderReplacement passed as True. | Integer getReplacementCardReference() | setReplacementCardReference(Integer replacementCardReference) |
| `UpdateCardReference` | `Integer` | Optional | Reference number for tracking of update status request of the specific card, | Integer getUpdateCardReference() | setUpdateCardReference(Integer updateCardReference) |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br /><br>Optional if AccountNumber is passed, else Mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br /><br>Optional if AccountId is passed, else Mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CardExpiryDate` | `String` | Optional | Expiry date of the card.<br /><br>Mandatory if PAN is passed, else optional.<br /><br>Format: yyyyMMdd | String getCardExpiryDate() | setCardExpiryDate(String cardExpiryDate) |
| `CardId` | `Integer` | Optional | Card Id of the card.<br /><br>Optional if PAN is passed, else Mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `ColCoCode` | `Integer` | Optional | Collecting company code of the customer. <br /><br>Optional if ColCoId is passed, else Mandatory.<br /> | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting company id of the customer. <br /><br>Optional if ColCoCode is passed, else Mandatory.<br /> | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PAN` | `String` | Optional | PAN of the card.<br /><br>Optional if CardId is passed, else Mandatory.<br /> | String getPAN() | setPAN(String pAN) |
| `PayerId` | `Integer` | Optional | Payer id of the customer.<br /><br>Optional if PayerNumber is passed, else Mandatory. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | PayerNumber of the customer.<br /><br>Optional if PayerId is passed, else Mandatory. | String getPayerNumber() | setPayerNumber(String payerNumber) |

## Example (as JSON)

```json
{
  "ReplacementCardReference": 234,
  "UpdateCardReference": 140,
  "AccountId": 124,
  "AccountNumber": "AccountNumber8",
  "CardExpiryDate": "CardExpiryDate6"
}
```


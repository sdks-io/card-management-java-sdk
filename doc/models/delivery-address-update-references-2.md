
# Delivery Address Update References 2

## Structure

`DeliveryAddressUpdateReferences2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | CardId | Integer getCardId() | setCardId(Integer cardId) |
| `CardPAN` | `String` | Optional | PAN of the card. | String getCardPAN() | setCardPAN(String cardPAN) |
| `AccountId` | `Integer` | Optional | AccountId | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ReferenceId` | `Integer` | Optional | Individual delivery address update reference number for the delivery address update request. | Integer getReferenceId() | setReferenceId(Integer referenceId) |
| `ErrorInfo` | `String` | Optional | Individual error information for the delivery address update request. | String getErrorInfo() | setErrorInfo(String errorInfo) |

## Example (as JSON)

```json
{
  "CardId": 12345,
  "CardPAN": "7002051006629889654",
  "AccountId": 12356,
  "AccountNumber": "GB000000124",
  "ReferenceId": 573567,
  "ErrorInfo": "null"
}
```


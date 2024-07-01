
# Card Restriction Req

## Structure

`CardRestrictionReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `Cards` | [`RestrictionCardsList`](../../doc/models/restriction-cards-list.md) | Optional | - | RestrictionCardsList getCards() | setCards(RestrictionCardsList cards) |

## Example (as JSON)

```json
{
  "ColCoId": 188,
  "ColCoCode": 202,
  "PayerId": 236,
  "PayerNumber": "PayerNumber8",
  "Cards": {
    "AccountId": 184,
    "CardId": 90,
    "PAN": "PAN0",
    "ResetUsageRestrictions": false,
    "ResetDayTimeRestrictions": false
  }
}
```


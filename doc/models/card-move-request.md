
# Card Move Request

## Structure

`CardMoveRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | - | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | - | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCountryCode` | `String` | Optional | - | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `PayerNumber` | `String` | Optional | - | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerId` | `Integer` | Optional | - | Integer getPayerId() | setPayerId(Integer payerId) |
| `Cards` | [`List<CardMoveRequestCardsItems>`](../../doc/models/card-move-request-cards-items.md) | Optional | - | List<CardMoveRequestCardsItems> getCards() | setCards(List<CardMoveRequestCardsItems> cards) |
| `TargetAccountId` | `Integer` | Optional | - | Integer getTargetAccountId() | setTargetAccountId(Integer targetAccountId) |
| `TargetAccountNumber` | `String` | Optional | - | String getTargetAccountNumber() | setTargetAccountNumber(String targetAccountNumber) |
| `TargetCardGroupId` | `Integer` | Optional | - | Integer getTargetCardGroupId() | setTargetCardGroupId(Integer targetCardGroupId) |
| `TargetNewCardGroupName` | `String` | Optional | - | String getTargetNewCardGroupName() | setTargetNewCardGroupName(String targetNewCardGroupName) |

## Example (as JSON)

```json
{
  "ColCoCode": 166,
  "ColCoId": 152,
  "ColCoCountryCode": "ColCoCountryCode0",
  "PayerNumber": "PayerNumber2",
  "PayerId": 200
}
```


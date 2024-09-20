
# Auto Renew Card Request

## Structure

`AutoRenewCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1-Philippines<br>5-UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86-Philippines<br>5-UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Optional | Payer Number (Ex: GB000000123) of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerId` | `Integer` | Optional | Payer Id  of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `AutoRenewCards` | [`List<AutoRenewCardRequestAutoRenewCardsItems>`](../../doc/models/auto-renew-card-request-auto-renew-cards-items.md) | Optional | - | List<AutoRenewCardRequestAutoRenewCardsItems> getAutoRenewCards() | setAutoRenewCards(List<AutoRenewCardRequestAutoRenewCardsItems> autoRenewCards) |

## Example (as JSON)

```json
{
  "ColCoId": 138,
  "ColCoCode": 152,
  "PayerNumber": "PayerNumber2",
  "PayerId": 186,
  "AutoRenewCards": [
    {
      "AccountNumber": "AccountNumber6",
      "AccountId": 112,
      "PAN": "PAN8",
      "PANID": 223.22,
      "CardId": 18,
      "ReissueSetting": false
    }
  ]
}
```


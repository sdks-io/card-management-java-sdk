
# Auto Renew Card Response Data Items

## Structure

`AutoRenewCardResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AutoRenewReferenceId` | `Integer` | Optional | CardId and PAN of the card. ;( Semicolon is used as delimiter. | Integer getAutoRenewReferenceId() | setAutoRenewReferenceId(Integer autoRenewReferenceId) |
| `CardIdAndPAN` | `String` | Optional | Reference number for each individual auto renew card in the order. | String getCardIdAndPAN() | setCardIdAndPAN(String cardIdAndPAN) |
| `PANID` | `Double` | Optional | PANID of the card | Double getPANID() | setPANID(Double pANID) |

## Example (as JSON)

```json
{
  "AutoRenewReferenceId": 84,
  "CardIdAndPAN": "CardIdAndPAN6",
  "PANID": 48.46
}
```


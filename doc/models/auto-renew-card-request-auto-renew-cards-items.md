
# Auto Renew Card Request Auto Renew Cards Items

## Structure

`AutoRenewCardRequestAutoRenewCardsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed, else Mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br>Optional if AccountNumber is passed, else Mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `PAN` | `String` | Optional | PAN of the card.<br>Optional if CardId is passed, else Mandatory. | String getPAN() | setPAN(String pAN) |
| `PANID` | `Double` | Optional | Card PAN ID.<br>Optional if CardId is given, else mandatory.<br>Note: PANID is ignored if CardId is given. | Double getPANID() | setPANID(Double pANID) |
| `CardId` | `Integer` | Optional | Card Id of the card.<br>Optional if PAN is passed, else Mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `ReissueSetting` | `boolean` | Required | Reissue setting of the card.<br>Values:<br>True – Card will be Reissued when nearing its expiry date<br>False – Card will not be Reissued<br>Mandatory | boolean getReissueSetting() | setReissueSetting(boolean reissueSetting) |

## Example (as JSON)

```json
{
  "AccountNumber": "AccountNumber4",
  "AccountId": 178,
  "PAN": "PAN6",
  "PANID": 75.4,
  "CardId": 84,
  "ReissueSetting": false
}
```


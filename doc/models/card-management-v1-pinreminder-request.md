
# Card Management V1 Pinreminder Request

## Structure

`CardManagementV1PinreminderRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br /><br>Optional if AccountNumber is passed, else Mandatory.<br /><br>This input is a search criterion, if given. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br /><br>Optional if AccountId is passed, else Mandatory.<br /><br>This input is a search criterion, if given. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer. <br /><br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. <br /><br>It is optional for other countries if ColCoID is provided. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer<br /><br>Optional if ColCoCode is passed else Mandatory. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment Customer of the selected payer.<br /><br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number (Ex: GB000000123) of the selected payer.<br /><br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PINReminderCardDetails` | [`List<PINReminderCardDetails>`](../../doc/models/pin-reminder-card-details.md) | Optional | List of PINReminderCardDetails entity. The fields of this entity are described below. | List<PINReminderCardDetails> getPINReminderCardDetails() | setPINReminderCardDetails(List<PINReminderCardDetails> pINReminderCardDetails) |

## Example (as JSON)

```json
{
  "AccountId": 212,
  "AccountNumber": "AccountNumber2",
  "ColCoCode": 118,
  "ColCoId": 104,
  "PayerId": 152
}
```


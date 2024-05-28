
# Delivery Address Update Request

## Structure

`DeliveryAddressUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number (Ex: GB000000123) of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Optional if AccountNumber is passed, else mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed, else mandatory.<br>This input is a search criterion, if given. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `DeliveryAddressUpdates` | [`List<DeliveryAddressUpdate>`](../../doc/models/delivery-address-update.md) | Optional | - | List<DeliveryAddressUpdate> getDeliveryAddressUpdates() | setDeliveryAddressUpdates(List<DeliveryAddressUpdate> deliveryAddressUpdates) |

## Example (as JSON)

```json
{
  "ColCoId": 5,
  "ColCoCode": 5,
  "PayerId": 123456,
  "PayerNumber": "GB000000123",
  "AccountId": 12356,
  "AccountNumber": "GB000000124"
}
```


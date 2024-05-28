
# Update Bundle Request

## Structure

`UpdateBundleRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Either PayerId or PayerNumber or both must be passed.<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Either AccountId or AccountNumber or both must be passed.<br>Example: 123456 | Integer getAccountId() | setAccountId(Integer accountId) |
| `BundleId` | `String` | Required | Identifier of the bundle in Gateway.<br>Mandatory | String getBundleId() | setBundleId(String bundleId) |
| `RequestAction` | `String` | Required | The value indicates the action to be performed with the request.<br>Mandatory<br>Allowed values:<br>•	Add<br>•	Update<br>•	Remove | String getRequestAction() | setRequestAction(String requestAction) |
| `Cards` | `List<String>` | Optional | List of Card PANs to be added in the bundle.<br>Mandatory for Add / Remove request action. Ignored for Update action.<br>Example: 7002051006629890645<br>When PAN matches with multiple cards, the restriction will be applied on the latest issued card | List<String> getCards() | setCards(List<String> cards) |
| `UsageRestrictionAction` | `String` | Optional | The value indicates what actions to be performed with respect to usage restrictions on the list of cards being added or removed.<br>Mandatory for Add / Remove request action. Ignored for Update action.<br>Allowed values:<br>•	Update<br>•	None | String getUsageRestrictionAction() | setUsageRestrictionAction(String usageRestrictionAction) |
| `Restrictions` | [`BundleRestriction`](../../doc/models/bundle-restriction.md) | Optional | - | BundleRestriction getRestrictions() | setRestrictions(BundleRestriction restrictions) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Either PayerId or PayerNumber or both must be passed.<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Either AccountId or AccountNumber or both must be passed.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "ColCoId": 26,
  "PayerId": 74,
  "AccountId": 134,
  "BundleId": "BundleId4",
  "RequestAction": "RequestAction4",
  "Cards": [
    "Cards5",
    "Cards6"
  ],
  "UsageRestrictionAction": "UsageRestrictionAction6"
}
```

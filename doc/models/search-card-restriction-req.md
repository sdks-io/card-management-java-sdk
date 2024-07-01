
# Search Card Restriction Req

## Structure

`SearchCardRestrictionReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `Accounts` | [`Accounts`](../../doc/models/accounts.md) | Optional | - | Accounts getAccounts() | setAccounts(Accounts accounts) |
| `BundleId` | `String` | Optional | Identifier of the Card bundle<br>Optional if cards list is given, else mandatory.<br>This input is a search criterion, if given. | String getBundleId() | setBundleId(String bundleId) |
| `Cards` | [`SearchCardRestriction`](../../doc/models/search-card-restriction.md) | Optional | - | SearchCardRestriction getCards() | setCards(SearchCardRestriction cards) |
| `IncludeLocationRestrictions` | `Boolean` | Optional | True/False<br>Whether to include location restriction of the cards in the response.<br>Optional<br>Default ‘false’ | Boolean getIncludeLocationRestrictions() | setIncludeLocationRestrictions(Boolean includeLocationRestrictions) |
| `IncludeBundleDetails` | `Boolean` | Optional | Default value is False,<br>When the value is True, API will return bundle Id associated with cards in the response, if available.<br>Note: Use ‘Null’ or ‘False’ for optimum performance. A delay in response is expected when set to ‘True’. | Boolean getIncludeBundleDetails() | setIncludeBundleDetails(Boolean includeBundleDetails) |
| `IncludeInheritedLimits` | `Boolean` | Optional | Default value is True,<br>When True: service will return the inherited values for the usage limits (from card-program or account as available) when it is not overridden on the card. | Boolean getIncludeInheritedLimits() | setIncludeInheritedLimits(Boolean includeInheritedLimits) |

## Example (as JSON)

```json
{
  "ColCoId": 90,
  "ColCoCode": 104,
  "PayerId": 138,
  "PayerNumber": "PayerNumber0",
  "Accounts": {
    "AccountId": 28,
    "AccountNumber": "AccountNumber0"
  }
}
```


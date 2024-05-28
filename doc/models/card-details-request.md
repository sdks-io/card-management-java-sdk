
# Card Details Request

## Structure

`CardDetailsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | Collecting Company Id  of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1-Philippines<br>5-UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86-Philippines<br>5-UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCountryCode` | `String` | Optional | ISO Country code of collecting company | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `ClientReferenceId` | `String` | Optional | Customer reference number of the card.<br>Optional | String getClientReferenceId() | setClientReferenceId(String clientReferenceId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment of the selected payer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional if AccountId is passed, else mandatory. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br>Optional if AccountNumber is passed, else mandatory. | Integer getAccountId() | setAccountId(Integer accountId) |
| `PAN` | `String` | Optional | PAN of the card.<br>Optional if CardId is passed, else Mandatory. | String getPAN() | setPAN(String pAN) |
| `CardId` | `Integer` | Optional | Card Id of the card.<br>Optional if PAN is passed, else Mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `TokenTypeID` | `Integer` | Optional | Token Type ID for the Card<br>Optional | Integer getTokenTypeID() | setTokenTypeID(Integer tokenTypeID) |
| `TokenTypeName` | `String` | Optional | Token Type name for the Card<br>Optional | String getTokenTypeName() | setTokenTypeName(String tokenTypeName) |
| `CreationDate` | `String` | Optional | Card Creation Date time<br>Optional<br>Format: yyyyMMdd | String getCreationDate() | setCreationDate(String creationDate) |
| `EffectiveDate` | `String` | Optional | Effective date for the Card<br>Optional<br>Format: yyyyMMdd | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `IncludeBundleDetails` | `Boolean` | Optional | When the value is True, API will return bundle Id associated with card in the response, if available.<br>Note: Use ‘Null’ or ‘False’ for optimum performance. A delay in response is expected when set to ‘True’. | Boolean getIncludeBundleDetails() | setIncludeBundleDetails(Boolean includeBundleDetails) |
| `IncludeIntermediateStatus` | `Boolean` | Optional | A flag which indicates if the response can contain intermediate statuses | Boolean getIncludeIntermediateStatus() | setIncludeIntermediateStatus(Boolean includeIntermediateStatus) |
| `IncludeScheduledCardBlocks` | `Boolean` | Optional | A flag which indicates if the response can contain scheduled card blocks details | Boolean getIncludeScheduledCardBlocks() | setIncludeScheduledCardBlocks(Boolean includeScheduledCardBlocks) |

## Example (as JSON)

```json
{
  "ColCoCode": 154,
  "ColCoId": 140,
  "ColCoCountryCode": "ColCoCountryCode6",
  "ClientReferenceId": "ClientReferenceId2",
  "PayerNumber": "PayerNumber8"
}
```


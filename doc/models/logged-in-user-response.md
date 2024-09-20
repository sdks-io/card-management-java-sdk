
# Logged in User Response

## Structure

`LoggedInUserResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserName` | `String` | Optional | Logged in User Identifier | String getUserName() | setUserName(String userName) |
| `DisplayName` | `String` | Optional | Name of the logged in user. | String getDisplayName() | setDisplayName(String displayName) |
| `IdMSSOID` | `String` | Optional | Single Sign On/Unique Identifier of the User in Identity Management system | String getIdMSSOID() | setIdMSSOID(String idMSSOID) |
| `PreferredLanguage` | `String` | Optional | ISO culture code/ Language chosen by the logged in user | String getPreferredLanguage() | setPreferredLanguage(String preferredLanguage) |
| `IsSuperAdmin` | `Boolean` | Optional | Whether the user is a super administrator<br>**Default**: `false` | Boolean getIsSuperAdmin() | setIsSuperAdmin(Boolean isSuperAdmin) |
| `DateFormat` | `String` | Optional | Preferred Date format for the logged in user | String getDateFormat() | setDateFormat(String dateFormat) |
| `TimeFormat` | `String` | Optional | Preferred Time format for the logged in user | String getTimeFormat() | setTimeFormat(String timeFormat) |
| `WeekBegins` | `Integer` | Optional | Preferred Day to Begin the Week. The value will be between 1 to 7 or null. | Integer getWeekBegins() | setWeekBegins(Integer weekBegins) |
| `DisplayWeek` | `Boolean` | Optional | Preferred Display Week on Fuel Prices configuration for the logged in User.<br>**Default**: `true` | Boolean getDisplayWeek() | setDisplayWeek(Boolean displayWeek) |
| `CSVSeparator` | `String` | Optional | Preferred CSV Separator for the logged in user. | String getCSVSeparator() | setCSVSeparator(String cSVSeparator) |
| `DecimalSeparator` | `String` | Optional | Preferred Decimal separator configured for the logged in user<br>Note: - Colco default value (configured at Microservices) is returned when the user is not provided or does not exist. | String getDecimalSeparator() | setDecimalSeparator(String decimalSeparator) |
| `ReportFormat` | `String` | Optional | Preferred report format configured for the logged in user | String getReportFormat() | setReportFormat(String reportFormat) |
| `HasAPIAccess` | `Boolean` | Optional | True/False<br>True, if user has access to the requested API. This is validated based on the role Vs API access matrix and client Vs API access matrix.<br>**Default**: `true` | Boolean getHasAPIAccess() | setHasAPIAccess(Boolean hasAPIAccess) |
| `Roles` | [`List<Role>`](../../doc/models/role.md) | Optional | List of roles the user have access to | List<Role> getRoles() | setRoles(List<Role> roles) |
| `Payers` | [`List<PayerAccess>`](../../doc/models/payer-access.md) | Optional | List of payers which the user has access to.<br>•    It will return 250 payers only and it is configurable. If the user has more than that, the remaining will be ignored.<br>•    The payer which is marked as default will be the first item in the output.<br><br>Note: This list will be empty for users mapped with roles which has either IsShellAdmin or IsServiceAccount set to true as their access level is controlled at ColCo level only. | List<PayerAccess> getPayers() | setPayers(List<PayerAccess> payers) |
| `Accounts` | [`List<AccountAccess>`](../../doc/models/account-access.md) | Optional | List of accounts which the user has access to.<br>Note: This list will be empty for users mapped with roles which has either IsCustomerAdmin, IsShellAdmin or IsServiceAccount set to true as their access level is controller at either ColCo or payer level only. | List<AccountAccess> getAccounts() | setAccounts(List<AccountAccess> accounts) |
| `CollectingCompanies` | [`List<ColCoAccess>`](../../doc/models/col-co-access.md) | Optional | List of collecting companies to which the user has access to<br>Note: This list will be empty for users mapped with roles which has either IsCustomerAdmin or IsCustomerUser set to true as their access level is controller at Payer or Account level. | List<ColCoAccess> getCollectingCompanies() | setCollectingCompanies(List<ColCoAccess> collectingCompanies) |
| `EIDAccessDetails` | [`List<EIDAccess>`](../../doc/models/eid-access.md) | Optional | List of Electronic Invoice Data configured for the user.<br>Note: This list will be empty if the value of EIDDetails is set to false or empty in the request. | List<EIDAccess> getEIDAccessDetails() | setEIDAccessDetails(List<EIDAccess> eIDAccessDetails) |
| `UserClassificationBySystem` | `String` | Optional | User classification by system. | String getUserClassificationBySystem() | setUserClassificationBySystem(String userClassificationBySystem) |
| `UserClassificationByShell` | `String` | Optional | User classification by Shell. | String getUserClassificationByShell() | setUserClassificationByShell(String userClassificationByShell) |
| `PayerCount` | `Integer` | Optional | Count of payers accessible to the user at the time when user was created or last updated.<br>Note:<br>Count may vary based on customer operations hence it may not be an up to date value. | Integer getPayerCount() | setPayerCount(Integer payerCount) |
| `AccountCount` | `Integer` | Optional | Count of accounts at the time when the user was created or last updated.<br>Note:<br>Count may vary based on customer operations hence it may not be an up to date value. | Integer getAccountCount() | setAccountCount(Integer accountCount) |
| `CardCount` | `Integer` | Optional | Count of cards at the time when the user was created or last updated.<br>Note:<br>Count may vary based on customer operations hence it may not be an up to date value. | Integer getCardCount() | setCardCount(Integer cardCount) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | Request Id of the API call | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "UserName": "D09PZ29h2eaBWi5Da8gcHsTRO10w8Qh9",
  "DisplayName": "3rdParty test",
  "IdMSSOID": "D09PZ29h2eaBWi5Da8gcHsTRO10w8Qh9",
  "PreferredLanguage": "en-GB",
  "IsSuperAdmin": false,
  "DateFormat": "dd/MM/yy",
  "TimeFormat": "hh:mm tt",
  "WeekBegins": 1,
  "DisplayWeek": true,
  "CSVSeparator": ";",
  "DecimalSeparator": "1,234,567.00",
  "ReportFormat": "csv",
  "HasAPIAccess": true,
  "UserClassificationBySystem": "S",
  "UserClassificationByShell": "S",
  "PayerCount": 1,
  "AccountCount": 1,
  "CardCount": 15,
  "RequestId": "f20979a8-872f-4653-cf12-89b52f1dc7cb"
}
```



# Card Group Response Card Groups Items

## Structure

`CardGroupResponseCardGroupsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id for the associated card group | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account number for the associated card group | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account short name for the associated card group | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `ActiveCards` | `Integer` | Optional | Total number of active cards for the given search criteria | Integer getActiveCards() | setActiveCards(Integer activeCards) |
| `BlockedCards` | `Integer` | Optional | Total number of cards for the given search criteria that are permanently blocked | Integer getBlockedCards() | setBlockedCards(Integer blockedCards) |
| `CancelledCards` | `Integer` | Optional | Total number of cards for the given search criteria that are cancelled | Integer getCancelledCards() | setCancelledCards(Integer cancelledCards) |
| `CardDeliveryPoint` | `Boolean` | Optional | card delivery point enabled or not | Boolean getCardDeliveryPoint() | setCardDeliveryPoint(Boolean cardDeliveryPoint) |
| `CardGroupId` | `Integer` | Optional | Id of the card group matching the search criteria. | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Name of the card group matching the search criteria. | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `CardTypeCode` | `String` | Optional | Card Type Code | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeId` | `Integer` | Optional | Card Type Id | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `ExpiredCards` | `Integer` | Optional | Total number of expired cards for the given search criteria | Integer getExpiredCards() | setExpiredCards(Integer expiredCards) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card.<br>Format: yyyyMMdd<br>Note: Clients to convert this to appropriate DateTime type. | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `PrintOnCard` | `Boolean` | Optional | PrintOnCard true/false | Boolean getPrintOnCard() | setPrintOnCard(Boolean printOnCard) |
| `RenewalPendingCards` | `Integer` | Optional | Total number of Renewal Pending Cards for the given search criteria | Integer getRenewalPendingCards() | setRenewalPendingCards(Integer renewalPendingCards) |
| `ReplacedCards` | `Integer` | Optional | - | Integer getReplacedCards() | setReplacedCards(Integer replacedCards) |
| `Status` | `String` | Optional | Status of the card group. | String getStatus() | setStatus(String status) |
| `TemporaryBlockByCustomer` | `Integer` | Optional | Total number of cards for the given search criteria that are temporarily blocked by customer | Integer getTemporaryBlockByCustomer() | setTemporaryBlockByCustomer(Integer temporaryBlockByCustomer) |
| `TemporaryBlockByShell` | `Integer` | Optional | Total number of cards for the given search criteria that are temporarily blocked by Shell | Integer getTemporaryBlockByShell() | setTemporaryBlockByShell(Integer temporaryBlockByShell) |
| `TerminatedDate` | `String` | Optional | Terminated Date.<br>Format: yyyyMMdd<br>Note: Clients to convert this to appropriate Date Time type. | String getTerminatedDate() | setTerminatedDate(String terminatedDate) |
| `TotalCards` | `Integer` | Optional | Total number of cards for the given search criteria | Integer getTotalCards() | setTotalCards(Integer totalCards) |

## Example (as JSON)

```json
{
  "AccountId": 1229,
  "AccountNumber": "CZ00000929",
  "AccountShortName": "Dominica South1",
  "ActiveCards": 0,
  "BlockedCards": 1,
  "CancelledCards": 0,
  "CardGroupId": 1234,
  "CardGroupName": "1234T",
  "CardTypeCode": "0123",
  "CardTypeId": 123,
  "CardTypeName": "test",
  "ExpiredCards": 0,
  "ExpiryDate": "20231231",
  "RenewalPendingCards": 5,
  "ReplacedCards": 0,
  "Status": "TERMINATED",
  "TemporaryBlockByCustomer": 0,
  "TemporaryBlockByShell": 0,
  "TerminatedDate": "20210712",
  "TotalCards": 10
}
```


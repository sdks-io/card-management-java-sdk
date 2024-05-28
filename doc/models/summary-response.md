
# Summary Response

Encapsulates the details of a Summary response.

## Structure

`SummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ActiveCards` | `Integer` | Optional | Total number of active cards for the given search criteria | Integer getActiveCards() | setActiveCards(Integer activeCards) |
| `BlockedCards` | `Integer` | Optional | Total number of cards for the given search criteria that are permanently blocked (Blocked) | Integer getBlockedCards() | setBlockedCards(Integer blockedCards) |
| `CancelledCards` | `Integer` | Optional | Total number of cards for the given search criteria that are cancelled (at cancelled status) blocked by customer | Integer getCancelledCards() | setCancelledCards(Integer cancelledCards) |
| `ExpiredCards` | `Integer` | Optional | Total number of expired cards for the given search criteria | Integer getExpiredCards() | setExpiredCards(Integer expiredCards) |
| `ExpiringCards` | `Integer` | Optional | Cards that are active and expiring in X days, X should be configurable | Integer getExpiringCards() | setExpiringCards(Integer expiringCards) |
| `FraudCards` | `Integer` | Optional | Totalnumber of Cards in Fraud status for the given search criteria. | Integer getFraudCards() | setFraudCards(Integer fraudCards) |
| `NewCards` | `Integer` | Optional | Total number of cards in New status for the given search criteria. | Integer getNewCards() | setNewCards(Integer newCards) |
| `RenewalPendingCards` | `Integer` | Optional | Total number of Renewal Pending cards for the given search criteria | Integer getRenewalPendingCards() | setRenewalPendingCards(Integer renewalPendingCards) |
| `ReplacedCards` | `Integer` | Optional | Cards with status Replaced | Integer getReplacedCards() | setReplacedCards(Integer replacedCards) |
| `TemporaryBlockByCustomer` | `Integer` | Optional | Total number of cards for the given search criteria that are temporarily blocked by customer | Integer getTemporaryBlockByCustomer() | setTemporaryBlockByCustomer(Integer temporaryBlockByCustomer) |
| `TemporaryBlockByShell` | `Integer` | Optional | Total number of cards for the given search criteria that are temporarily blocked by Shell | Integer getTemporaryBlockByShell() | setTemporaryBlockByShell(Integer temporaryBlockByShell) |
| `TotalCards` | `Integer` | Optional | Total number of cards for the given search criteria | Integer getTotalCards() | setTotalCards(Integer totalCards) |

## Example (as JSON)

```json
{
  "ActiveCards": 142,
  "BlockedCards": 238,
  "CancelledCards": 240,
  "ExpiredCards": 238,
  "ExpiringCards": 4
}
```


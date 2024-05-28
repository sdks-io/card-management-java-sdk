
# Restriction Search Card Request

## Structure

`RestrictionSearchCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`RestrictionSearchCardRequestFilters`](../../doc/models/restriction-search-card-request-filters.md) | Optional | - | RestrictionSearchCardRequestFilters getFilters() | setFilters(RestrictionSearchCardRequestFilters filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "ColCoId": 0,
    "PayerNumber": "PayerNumber0",
    "PayerId": 48,
    "Accounts": {
      "AccountId": 28,
      "AccountNumber": "AccountNumber0"
    }
  }
}
```


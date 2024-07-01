
# Network Restriction

## Structure

`NetworkRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Country` | `String` | Optional | ISO 3166-1 Numeric-3 code of the country where the network restriction is applied.<br>Example: 826 for United Kingdom. | String getCountry() | setCountry(String country) |
| `Networks` | `List<String>` | Optional | A list of Gateway network codes, typically 7 or 10 digits.<br>Example: 0002003250 | List<String> getNetworks() | setNetworks(List<String> networks) |
| `Exclusive` | `Boolean` | Optional | Flag indicates whether the profile is inclusive or exclusive.<br>Example: False - (inclusive), i.e. the “Networks” property lists the networks in which the transaction will be allowed.<br>True - (exclusive), i.e. the “Networks” property lists the networks in which the transactions will be declined. | Boolean getExclusive() | setExclusive(Boolean exclusive) |

## Example (as JSON)

```json
{
  "Country": "Country8",
  "Networks": [
    "Networks5"
  ],
  "Exclusive": false
}
```


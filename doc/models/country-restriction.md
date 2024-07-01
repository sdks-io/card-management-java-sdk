
# Country Restriction

## Structure

`CountryRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Countries` | `List<String>` | Optional | A list of ISO 3166-1 Numeric-3 country codes.<br>Example: 826 for United Kingdom. | List<String> getCountries() | setCountries(List<String> countries) |
| `Exclusive` | `Boolean` | Optional | Flag indicates whether the profile is inclusive or exclusive.<br>Example: False - (inclusive), i.e. the “Countries” property lists the countries where the transactions will be allowed.<br>True - (exclusive), i.e. the “Countries” property lists the countries where the transactions will be declined. | Boolean getExclusive() | setExclusive(Boolean exclusive) |

## Example (as JSON)

```json
{
  "Countries": [
    "Countries9",
    "Countries0",
    "Countries1"
  ],
  "Exclusive": false
}
```


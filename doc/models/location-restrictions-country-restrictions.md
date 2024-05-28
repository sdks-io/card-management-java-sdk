
# Location Restrictions Country Restrictions

An entity that encapsulate the country restrictions.
Optional.

## Structure

`LocationRestrictionsCountryRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Exclusive` | `boolean` | Required | Boolean	Flag indicates whether the profile is inclusive or exclusive.<br>Mandatory<br>Example: False - (inclusive), i.e. the “Countries” property lists the countries where the transactions will be allowed.<br>True - (exclusive), i.e. the “Countries” property lists the countries where the transactions will be declined. | boolean getExclusive() | setExclusive(boolean exclusive) |
| `Countries` | `List<String>` | Required | ISO 3166-1 Numeric-3 code of the country where the network restriction is applied.<br>Example: 826 for United Kingdom.<br>Mandatory | List<String> getCountries() | setCountries(List<String> countries) |

## Example (as JSON)

```json
{
  "Exclusive": false,
  "Countries": [
    "Countries3",
    "Countries4"
  ]
}
```


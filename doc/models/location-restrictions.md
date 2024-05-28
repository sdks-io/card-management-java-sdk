
# Location Restrictions

Location restrictions to be applied on the bundle which either allows or restricts using the cards, which are under the bundle, in the specified locations.
Mandatory if respective action is set as “Add”.
Details of location restrictions are given below.

## Structure

`LocationRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryRestrictions` | [`LocationRestrictionsCountryRestrictions`](../../doc/models/location-restrictions-country-restrictions.md) | Optional | An entity that encapsulate the country restrictions.<br>Optional. | LocationRestrictionsCountryRestrictions getCountryRestrictions() | setCountryRestrictions(LocationRestrictionsCountryRestrictions countryRestrictions) |
| `NetworkRestrictions` | [`List<LocationRestrictionsNetworkRestrictionsItems>`](../../doc/models/location-restrictions-network-restrictions-items.md) | Optional | A list of NetworkRestriction entity. Each item in the list encapsulates a network restriction in a given country.<br>Optional.<br>The details of the entity are described below: | List<LocationRestrictionsNetworkRestrictionsItems> getNetworkRestrictions() | setNetworkRestrictions(List<LocationRestrictionsNetworkRestrictionsItems> networkRestrictions) |
| `ShellSiteRestrictions` | [`List<LocationRestrictionsShellSiteRestrictionsItems>`](../../doc/models/location-restrictions-shell-site-restrictions-items.md) | Optional | A list of ShellSiteRestriction entity. Each item in the list encapsulates a site restriction of Shell network in a given country.<br>Optional.<br>The details of the entity are described below. | List<LocationRestrictionsShellSiteRestrictionsItems> getShellSiteRestrictions() | setShellSiteRestrictions(List<LocationRestrictionsShellSiteRestrictionsItems> shellSiteRestrictions) |
| `PartnerSiteRestrictions` | [`List<LocationRestrictionsPartnerSiteRestrictionsItems>`](../../doc/models/location-restrictions-partner-site-restrictions-items.md) | Optional | A list of PartnerSiteRestriction entity. Each item in the list encapsulates a site restriction of a given partner network.<br>Optional.<br>The details of the entity are described below. | List<LocationRestrictionsPartnerSiteRestrictionsItems> getPartnerSiteRestrictions() | setPartnerSiteRestrictions(List<LocationRestrictionsPartnerSiteRestrictionsItems> partnerSiteRestrictions) |

## Example (as JSON)

```json
{
  "CountryRestrictions": {
    "Exclusive": false,
    "Countries": [
      "Countries7"
    ]
  },
  "NetworkRestrictions": [
    {
      "Country": "Country6",
      "Exclusive": false,
      "Networks": [
        "Networks3",
        "Networks4",
        "Networks5"
      ]
    },
    {
      "Country": "Country6",
      "Exclusive": false,
      "Networks": [
        "Networks3",
        "Networks4",
        "Networks5"
      ]
    }
  ],
  "ShellSiteRestrictions": [
    {
      "Country": "Country4",
      "Sites": [
        "Sites3",
        "Sites4"
      ],
      "SiteGroups": [
        "SiteGroups9",
        "SiteGroups8",
        "SiteGroups7"
      ],
      "Exclusive": false
    },
    {
      "Country": "Country4",
      "Sites": [
        "Sites3",
        "Sites4"
      ],
      "SiteGroups": [
        "SiteGroups9",
        "SiteGroups8",
        "SiteGroups7"
      ],
      "Exclusive": false
    }
  ],
  "PartnerSiteRestrictions": [
    {
      "NetworkCode": "NetworkCode2",
      "Sites": [
        "Sites3"
      ],
      "SiteGroups": [
        "SiteGroups1",
        "SiteGroups2"
      ],
      "Exclusive": false
    }
  ]
}
```

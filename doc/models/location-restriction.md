
# Location Restriction

## Structure

`LocationRestriction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryRestrictions` | [`CountryRestriction`](../../doc/models/country-restriction.md) | Optional | - | CountryRestriction getCountryRestrictions() | setCountryRestrictions(CountryRestriction countryRestrictions) |
| `NetworkRestrictions` | [`List<NetworkRestriction>`](../../doc/models/network-restriction.md) | Optional | - | List<NetworkRestriction> getNetworkRestrictions() | setNetworkRestrictions(List<NetworkRestriction> networkRestrictions) |
| `ShellSiteRestrictions` | [`List<ShellSiteRestriction>`](../../doc/models/shell-site-restriction.md) | Optional | - | List<ShellSiteRestriction> getShellSiteRestrictions() | setShellSiteRestrictions(List<ShellSiteRestriction> shellSiteRestrictions) |
| `PartnerSiteRestrictions` | [`List<PartnerSiteRestriction>`](../../doc/models/partner-site-restriction.md) | Optional | - | List<PartnerSiteRestriction> getPartnerSiteRestrictions() | setPartnerSiteRestrictions(List<PartnerSiteRestriction> partnerSiteRestrictions) |

## Example (as JSON)

```json
{
  "CountryRestrictions": {
    "Countries": [
      "Countries7"
    ],
    "Exclusive": false
  },
  "NetworkRestrictions": [
    {
      "Country": "Country6",
      "Networks": [
        "Networks3",
        "Networks4",
        "Networks5"
      ],
      "Exclusive": false
    },
    {
      "Country": "Country6",
      "Networks": [
        "Networks3",
        "Networks4",
        "Networks5"
      ],
      "Exclusive": false
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



# Bundled Restrictions List

## Structure

`BundledRestrictionsList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UsageRestrictions` | `Object` | Optional | - | Object getUsageRestrictions() | setUsageRestrictions(Object usageRestrictions) |
| `DayTimeRestrictions` | [`DayTimeRestrictions`](../../doc/models/day-time-restrictions.md) | Optional | - | DayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(DayTimeRestrictions dayTimeRestrictions) |
| `ProductRestrictions` | [`BundledDetailsProductList`](../../doc/models/bundled-details-product-list.md) | Optional | - | BundledDetailsProductList getProductRestrictions() | setProductRestrictions(BundledDetailsProductList productRestrictions) |
| `LocationRestrictions` | [`LocationRestriction`](../../doc/models/location-restriction.md) | Optional | - | LocationRestriction getLocationRestrictions() | setLocationRestrictions(LocationRestriction locationRestrictions) |

## Example (as JSON)

```json
{
  "UsageRestrictions": {
    "key1": "val1",
    "key2": "val2"
  },
  "DayTimeRestrictions": {
    "Monday": false,
    "Tuesday": false,
    "Wednesday": false,
    "Thursday": false,
    "Friday": false
  },
  "ProductRestrictions": {
    "PurchaseCategoryId": 120,
    "PurchaseCategoryCode": "PurchaseCategoryCode4",
    "Products": [
      "Products4"
    ],
    "ProductGroups": [
      "ProductGroups3",
      "ProductGroups4"
    ],
    "FuelSetId": "FuelSetId0"
  },
  "LocationRestrictions": {
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
}
```


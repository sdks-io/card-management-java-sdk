
# Restriction Search Card Response Data Items

## Structure

`RestrictionSearchCardResponseDataItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BundleId` | `Integer` | Optional | Bundle Id associated with card | Integer getBundleId() | setBundleId(Integer bundleId) |
| `Restrictions` | [`SearchCardResponseRestrictions`](../../doc/models/search-card-response-restrictions.md) | Optional | - | SearchCardResponseRestrictions getRestrictions() | setRestrictions(SearchCardResponseRestrictions restrictions) |
| `RestrictionCurrencyCode` | `String` | Optional | ISO currency code of the country. | String getRestrictionCurrencyCode() | setRestrictionCurrencyCode(String restrictionCurrencyCode) |
| `RestrictionCurrencySymbol` | `String` | Optional | Currency symbol of the country. | String getRestrictionCurrencySymbol() | setRestrictionCurrencySymbol(String restrictionCurrencySymbol) |
| `AccountId` | `Integer` | Optional | Account ID | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | AccountShortName | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `CardId` | `Integer` | Optional | Unique Card | Integer getCardId() | setCardId(Integer cardId) |
| `CardTypeCode` | `String` | Optional | ISO code of the card i.e. first 7 digits of the PAN | String getCardTypeCode() | setCardTypeCode(String cardTypeCode) |
| `CardTypeId` | `Integer` | Optional | Card Type ID<br>Example Id & Description:<br>1 - Philippines CRT 7077861<br>2- Philippines Fleet 7002861<br>5-SHELL FLEET- HONG KONG 7002821<br>6-SHELL NHF- HONG KONG 7002821<br>7-SHELL CRT- HONG KONG 7077821 | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name<br>Example Id & Description:<br>1 - Philippines CRT 7077861<br>2- Philippines Fleet 7002861<br>5-SHELL FLEET- HONG KONG 7002821<br>6-SHELL NHF- HONG KONG 7002821<br>7-SHELL CRT- HONG KONG 7077821 | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `ColCoCurrencyCode` | `String` | Optional | ISO currency code of the country | String getColCoCurrencyCode() | setColCoCurrencyCode(String colCoCurrencyCode) |
| `ColCoCurrencySymbol` | `String` | Optional | Currency symbol of the country | String getColCoCurrencySymbol() | setColCoCurrencySymbol(String colCoCurrencySymbol) |
| `CurrencyCode` | `String` | Optional | ISO currency code of the Customer Currency | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Currency symbol of the Customer Currency Code | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `DriverName` | `String` | Optional | Driver name | String getDriverName() | setDriverName(String driverName) |
| `ExpiryDate` | `String` | Optional | Expiry date of the card<br>Format: yyyyMMdd | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `IsCRT` | `Boolean` | Optional | True if it is a CRT type card, else false | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True if it is a Fleet type card, else false | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsInternational` | `Boolean` | Optional | True if it is an international card, else false | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsNational` | `Boolean` | Optional | True if it is a national card, else false | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True if it is allowed at all partner sites, else false | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `IsShellSitesOnly` | `Boolean` | Optional | True if it is only allowed at Shell sites, else false | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `IssueDate` | `String` | Optional | Issue date<br>Format: yyyyMMdd | String getIssueDate() | setIssueDate(String issueDate) |
| `IssueNumber` | `Integer` | Optional | Issue Number | Integer getIssueNumber() | setIssueNumber(Integer issueNumber) |
| `IsSuperseded` | `Boolean` | Optional | True if a new card is issued with the same PAN, else false | Boolean getIsSuperseded() | setIsSuperseded(Boolean isSuperseded) |
| `IsVirtualCard` | `Boolean` | Optional | True if it is a virtual card, else false | Boolean getIsVirtualCard() | setIsVirtualCard(Boolean isVirtualCard) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `PurchaseCategoryCode` | `String` | Optional | Purchase category code<br>Example:<br>0 - All Fuels (without VP) and Lubricants<br>1 - FuelSave only<br>2 - FuelSave and Lubricants<br>3 - No Restrictions<br>4 - VP and FuelSave<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and FuelSave and Lubricants | String getPurchaseCategoryCode() | setPurchaseCategoryCode(String purchaseCategoryCode) |
| `PurchaseCategoryId` | `Integer` | Optional | Purchase category Id | Integer getPurchaseCategoryId() | setPurchaseCategoryId(Integer purchaseCategoryId) |
| `PurchaseCategoryName` | `String` | Optional | Purchase category name<br>Example:<br>0 - All Fuels (without VP) and Lubricants<br>1 - FuelSave only<br>2 - FuelSave and Lubricants<br>3 - No Restrictions<br>4 - VP and FuelSave<br>5 - Diesel ONLY<br>6 - Diesel and Lubricants<br>7 - VP and Lubricants<br>8 - VP and FuelSave and Lubricants | String getPurchaseCategoryName() | setPurchaseCategoryName(String purchaseCategoryName) |
| `StatusDescription` | `String` | Optional | Status Description (Active, Temporarily Blocked, etc.,) | String getStatusDescription() | setStatusDescription(String statusDescription) |
| `StatusId` | `Integer` | Optional | Card Status id | Integer getStatusId() | setStatusId(Integer statusId) |
| `VRN` | `String` | Optional | Vehicle registration number | String getVRN() | setVRN(String vRN) |
| `MediumTypeID` | `Integer` | Optional | Id of the medium type identifier.<br><br>Example: 1,2,4<br><br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>4 - Fuel Card and Key fob Card<br>5 - Key fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 – Smartpay | Integer getMediumTypeID() | setMediumTypeID(Integer mediumTypeID) |
| `MediumType` | `String` | Optional | Name of the medium type identifier.<br><br>Example: Fuel Card, Fuel Card with EV, Key fob  <br>Full list below:<br>1 - Fuel Card<br>2 - Fuel Card with EV<br>4 - Fuel Card and Key fob Card<br>5 - Key fob<br>6 - Virtual Card<br>7 - NPII Token<br>8 - Smartpay | String getMediumType() | setMediumType(String mediumType) |

## Example (as JSON)

```json
{
  "BundleId": 58,
  "Restrictions": {
    "DayTimeRestrictions": {
      "Friday": false,
      "Monday": false,
      "Saturday": false,
      "Sunday": false,
      "Thursday": false
    },
    "LocationRestrictions": {
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
    },
    "ProductRestrictions": {
      "Products": [
        {
          "GlobalProductCode": "GlobalProductCode6",
          "Description": "Description8"
        }
      ],
      "ProductGroups": [
        {
          "ReferenceId": 82,
          "ProductGroupId": "ProductGroupId6",
          "Name": "Name0",
          "IsDefault": false,
          "IsFuelType": false
        },
        {
          "ReferenceId": 82,
          "ProductGroupId": "ProductGroupId6",
          "Name": "Name0",
          "IsDefault": false,
          "IsFuelType": false
        }
      ]
    },
    "UsageRestrictions": {
      "DailySpend": 7.72,
      "WeeklySpend": 10.22,
      "MonthlySpend": 48.66,
      "PerTransactionSpend": 17.28,
      "DailyVolume": 122
    }
  },
  "RestrictionCurrencyCode": "RestrictionCurrencyCode4",
  "RestrictionCurrencySymbol": "RestrictionCurrencySymbol4",
  "AccountId": 172
}
```


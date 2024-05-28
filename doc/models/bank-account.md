
# Bank Account

## Structure

`BankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `BankName` | `String` | Optional | Bank Name | String getBankName() | setBankName(String bankName) |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `DateEffective` | `String` | Optional | Bank Account effective date for the payer | String getDateEffective() | setDateEffective(String dateEffective) |
| `DateTerminated` | `String` | Optional | Bank Account terminated date. Default is null | String getDateTerminated() | setDateTerminated(String dateTerminated) |
| `IBAN` | `String` | Optional | Bank Account IBAN for Payer | String getIBAN() | setIBAN(String iBAN) |
| `CurrencyCode` | `String` | Optional | Bank Account currency ISO code. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Bank Account currency Symbol. | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `CountryISOCode` | `String` | Optional | Bank Account Country ISO Code | String getCountryISOCode() | setCountryISOCode(String countryISOCode) |
| `Country` | `String` | Optional | Bank Account Country Name<br>1-Austria<br>2-Belgium<br>3-Bulgaria<br>4-Croatia<br>5-Czech Republic | String getCountry() | setCountry(String country) |
| `SortCode` | `String` | Optional | Payer bank Sort Code | String getSortCode() | setSortCode(String sortCode) |
| `SwiftCode` | `String` | Optional | Payer Bank Swift Code | String getSwiftCode() | setSwiftCode(String swiftCode) |
| `BankType` | `String` | Optional | Bank Type Id and Description | String getBankType() | setBankType(String bankType) |

## Example (as JSON)

```json
{
  "AccountNumber": "45346346443",
  "BankName": "swiss",
  "AccountName": "ARIM SERVIS",
  "DateEffective": "20200808",
  "IBAN": "CZ6508000000192000145399",
  "CurrencyCode": "EUR",
  "CurrencySymbol": "€",
  "CountryISOCode": "DE",
  "Country": "Germany",
  "SortCode": "0100",
  "SwiftCode": "KOMBCZPPXXX",
  "BankType": "1-Test",
  "DateTerminated": "DateTerminated0"
}
```


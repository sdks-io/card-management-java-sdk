
# Finance Currency 2

## Structure

`FinanceCurrency2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyCode` | `String` | Optional | Currency ISO Code used for the Finance Widget. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Currency Symbol | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `InvoiceExchangeRate` | `Double` | Optional | Factor to be used for converting the amounts in invoice currency to finance widget currency. (If finance currency is same as invoice currency, then the value of this field will be “1” so that the value does not change) | Double getInvoiceExchangeRate() | setInvoiceExchangeRate(Double invoiceExchangeRate) |
| `CreditLimitExchangeRate` | `Double` | Optional | Factor to be used for converting the amounts in credit limit currency to finance widget currency. (If finance currency is same as credit limit currency, then the value of this field will be “1” so that the value does not change) | Double getCreditLimitExchangeRate() | setCreditLimitExchangeRate(Double creditLimitExchangeRate) |

## Example (as JSON)

```json
{
  "CurrencyCode": "EUR",
  "CurrencySymbol": "€",
  "Invoice_ExchangeRate": 1.0,
  "CreditLimit_ExchangeRate": 1.0
}
```


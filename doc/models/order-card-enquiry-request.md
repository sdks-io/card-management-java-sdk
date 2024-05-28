
# Order Card Enquiry Request

## Structure

`OrderCardEnquiryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`OrderCardEnquiryReq`](../../doc/models/order-card-enquiry-req.md) | Optional | This class holds Order Card Enquiry list based on which the Order Card Enquiry need to be filtered. | OrderCardEnquiryReq getFilters() | setFilters(OrderCardEnquiryReq filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "AccountId": 108,
    "AccountNumber": "AccountNumber2",
    "ColCoCode": 14,
    "ColCoId": 0,
    "ColCoCountryCode": "ColCoCountryCode8"
  }
}
```


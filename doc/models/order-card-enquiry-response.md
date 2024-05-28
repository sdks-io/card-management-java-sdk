
# Order Card Enquiry Response

## Structure

`OrderCardEnquiryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Data` | [`List<OrderCardEnquiry>`](../../doc/models/order-card-enquiry.md) | Optional | - | List<OrderCardEnquiry> getData() | setData(List<OrderCardEnquiry> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId8",
  "Status": "Status4",
  "Data": [
    {
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "BCOReference": 10,
      "BCORowNumber": 192,
      "CardGroupId": 108
    }
  ]
}
```


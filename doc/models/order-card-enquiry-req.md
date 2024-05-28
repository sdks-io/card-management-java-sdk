
# Order Card Enquiry Req

This class holds Order Card Enquiry list based on which the Order Card Enquiry need to be filtered.

## Structure

`OrderCardEnquiryReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account ID of the customer.<br/> Optional if AccountNumber is passed, else mandatory. <br/> This input is a search criterion, if given. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br/> Optional if AccountId is passed, else mandatory.<br/> This input is a search criterion, if given. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer. <br /><br>Optional – when ‘ReferenceNumber’ is provided.<br /> | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id (in ) of the selected payer. <br /><br>Optional – when ‘ReferenceNumber’ is provided. Else, either ‘ColCoId’ or ‘ColCoCode’ is mandatory.<br /> | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCountryCode` | `String` | Optional | ISO 3166 Alpha-2 Country Code for the customer and card owning country. | String getColCoCountryCode() | setColCoCountryCode(String colCoCountryCode) |
| `PayerId` | `Integer` | Optional | Payer Id (i.e. Customer Id of the Payment Customer) of the selected payer.<br /><br>Optional – when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br /><br>Optional – when ‘ReferenceNumber’ is provided. Else, either ‘PayerId’ or ‘PayerNumber’ is mandatory. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `ReferenceNumber` | `Integer` | Optional | Reference number of the Card Order/ Bulk Card Order/ Order Card Request.<br /><br>Mandatory when ColCo and Payer fields are not provided. Else, optional. | Integer getReferenceNumber() | setReferenceNumber(Integer referenceNumber) |
| `ReferenceType` | [`OrderCardEnquiryReqReferenceTypeEnum`](../../doc/models/order-card-enquiry-req-reference-type-enum.md) | Optional | Type of the reference number provided.<br /><br>Mandatory if ReferenceNumber is provided. Else optional.<br /><br>Allowed Values:<br /><br>1=Main Reference(Main Order Reference Number returned in the output of Card/OrderCard service. <br /><br>2=Order Card Reference (Reference number for each individual card in the order submitted via Card/OrderCard service. <br /><br>3=Bulk Order Card Reference (Reference number returned in the response of bulkcardinterface /UploadOrderCardTemplate. ) | OrderCardEnquiryReqReferenceTypeEnum getReferenceType() | setReferenceType(OrderCardEnquiryReqReferenceTypeEnum referenceType) |
| `FromDate` | `String` | Optional | Card Orders from Date/Time.<br /><br>Optional.<br /><br>Value should be with in last 7 days<br /><br>This field is ignored if ReferenceNumber is provided <br /><br>This field is optional when not provided and ReferenceNumber is null or empty then the value should be set to D-7(Where D is current date)<br /><br>Format: yyyyMMdd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Card Order to Date/Time<br /><br>Optional<br /><br>Value should be with in last 7 days<br /><br>This field is ignored if ReferenceNumber is provided <br /><br>This field is optional when not provided and ReferenceNumber is null or empty then the value should be set to current date<br /><br>Format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `OrderRequestId` | `String` | Optional | Client provided Unique Id of the original Order Card request, the status of which is enquired by this API | String getOrderRequestId() | setOrderRequestId(String orderRequestId) |

## Example (as JSON)

```json
{
  "ColCoCountryCode": "PH",
  "OrderRequestId": "ed557f02-c7d7-4c01-b3e5-11bf",
  "AccountId": 66,
  "AccountNumber": "AccountNumber8",
  "ColCoCode": 228,
  "ColCoId": 214
}
```


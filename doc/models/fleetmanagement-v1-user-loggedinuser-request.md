
# Fleetmanagement V1 User Loggedinuser Request

## Structure

`FleetmanagementV1UserLoggedinuserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IncludePayerGroup` | `Boolean` | Optional | True/False. The output will include the payer group information only when true is passed.<br>**Default**: `false` | Boolean getIncludePayerGroup() | setIncludePayerGroup(Boolean includePayerGroup) |
| `IncludeEIDDetails` | `Boolean` | Optional | True/False. The output will include the EID (Electronic Invoice data) information only when true is passed..<br>**Default**: `false` | Boolean getIncludeEIDDetails() | setIncludeEIDDetails(Boolean includeEIDDetails) |
| `RequestedAPIName` | `String` | Optional | Name of the API on which user access needs to be validated<br>Optional. | String getRequestedAPIName() | setRequestedAPIName(String requestedAPIName) |
| `PayerId` | `Integer` | Optional | Payer id of the customer.</br><br>Optional.</br><br>This input is a search criterion.</br><br>Note: If PayerId or PayerNumber is provided in the input, the given payer will be available in the output if the user has access to the given payer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | PayerNumber of the customer.</br><br>Optional</br><br>This input is a search criterion.</br><br>Note: If Payerid or PayerNumber is provided in the input, the given payer will be available in the output if the user has access to the given payer. | String getPayerNumber() | setPayerNumber(String payerNumber) |

## Example (as JSON)

```json
{
  "IncludePayerGroup": false,
  "IncludeEIDDetails": false,
  "RequestedAPIName": "Name of the API",
  "PayerId": 123456,
  "PayerNumber": "GB00123456"
}
```


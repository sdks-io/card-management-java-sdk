
# Update M Pay Reg Status Request M Pay Requests Items

## Structure

`UpdateMPayRegStatusRequestMPayRequestsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GlobalRequestID` | `String` | Optional | List of MPay Request to be updated for Fleet Manager approval status.<br>Mandatory<br>Maximum number of requests that can be submitted are 50 | String getGlobalRequestID() | setGlobalRequestID(String globalRequestID) |
| `Status` | `String` | Optional | Status of mobile payment registration request<br>Mandatory.<br>Allowed values –<br>•    Approved<br>•   Rejected | String getStatus() | setStatus(String status) |
| `ApproverUserID` | `String` | Optional | Approver’s User ID<br>ApproverUserID is mandatory when Status is Approved else optional | String getApproverUserID() | setApproverUserID(String approverUserID) |
| `ApproverUserDisplayName` | `String` | Optional | Approver’s display name<br>Mandatory when Status is Approved else optional. | String getApproverUserDisplayName() | setApproverUserDisplayName(String approverUserDisplayName) |
| `Reason` | `String` | Optional | Reason for Fleet Manager approval/rejection.<br>Optional | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "GlobalRequestID": "GlobalRequestID4",
  "Status": "Status4",
  "ApproverUserID": "ApproverUserID0",
  "ApproverUserDisplayName": "ApproverUserDisplayName0",
  "Reason": "Reason8"
}
```


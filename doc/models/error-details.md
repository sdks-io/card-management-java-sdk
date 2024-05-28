
# Error Details

## Structure

`ErrorDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code representing the error encountered | String getCode() | setCode(String code) |
| `Title` | `String` | Optional | Error type description | String getTitle() | setTitle(String title) |
| `Detail` | `String` | Optional | Detailed inforamtion about the error | String getDetail() | setDetail(String detail) |
| `AdditionalInfo` | `Object` | Optional | Applicable when more details related to error to be returned | Object getAdditionalInfo() | setAdditionalInfo(Object additionalInfo) |

## Example (as JSON)

```json
{
  "Code": "Code2",
  "Title": "Title8",
  "Detail": "Detail4",
  "AdditionalInfo": {
    "key1": "val1",
    "key2": "val2"
  }
}
```



# ChargebackTransitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  | 
**chargebackToken** | **String** |  | 
**reason** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Representment or prearbitration amount; this is for transitioning to Representment or Prearbitration only |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
REPRESENTMENT | &quot;REPRESENTMENT&quot;
PREARBITRATION | &quot;PREARBITRATION&quot;
ARBITRATION | &quot;ARBITRATION&quot;
CASE_WON | &quot;CASE_WON&quot;
CASE_LOST | &quot;CASE_LOST&quot;
WRITTEN_OFF_ISSUER | &quot;WRITTEN_OFF_ISSUER&quot;
WRITTEN_OFF_PROGRAM | &quot;WRITTEN_OFF_PROGRAM&quot;




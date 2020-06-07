
# ChargebackTransitionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**previousState** | [**PreviousStateEnum**](#PreviousStateEnum) |  | 
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**chargebackToken** | **String** |  | 
**reason** | **String** |  |  [optional]
**transactionToken** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INITIATED | &quot;INITIATED&quot;
REPRESENTMENT | &quot;REPRESENTMENT&quot;
PREARBITRATION | &quot;PREARBITRATION&quot;
ARBITRATION | &quot;ARBITRATION&quot;
CASE_WON | &quot;CASE_WON&quot;
CASE_LOST | &quot;CASE_LOST&quot;
NETWORK_REJECTED | &quot;NETWORK_REJECTED&quot;
WITHDRAWN | &quot;WITHDRAWN&quot;
WRITTEN_OFF_ISSUER | &quot;WRITTEN_OFF_ISSUER&quot;
WRITTEN_OFF_PROGRAM | &quot;WRITTEN_OFF_PROGRAM&quot;


<a name="PreviousStateEnum"></a>
## Enum: PreviousStateEnum
Name | Value
---- | -----
INITIATED | &quot;INITIATED&quot;
REPRESENTMENT | &quot;REPRESENTMENT&quot;
PREARBITRATION | &quot;PREARBITRATION&quot;
ARBITRATION | &quot;ARBITRATION&quot;
CASE_WON | &quot;CASE_WON&quot;
CASE_LOST | &quot;CASE_LOST&quot;
NETWORK_REJECTED | &quot;NETWORK_REJECTED&quot;
WITHDRAWN | &quot;WITHDRAWN&quot;


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
GATEWAY | &quot;GATEWAY&quot;
GATEWAY_AUTOMATED | &quot;GATEWAY_AUTOMATED&quot;
ISSUER | &quot;ISSUER&quot;
ISSUER_AUTOMATED | &quot;ISSUER_AUTOMATED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INITIATED | &quot;initiated&quot;
REPRESENTMENT | &quot;representment&quot;
PREARBITRATION | &quot;prearbitration&quot;
ARBITRATION | &quot;arbitration&quot;
CASE_WON | &quot;case.won&quot;
CASE_LOST | &quot;case.lost&quot;
NETWORK_REJECTED | &quot;network.rejected&quot;
WRITTEN_OFF_ISSUER | &quot;written.off.issuer&quot;
WRITTEN_OFF_PROGRAM | &quot;written.off.program&quot;




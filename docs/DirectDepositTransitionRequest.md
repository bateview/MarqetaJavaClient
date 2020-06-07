
# DirectDepositTransitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**reason** | **String** |  | 
**idempotentHash** | **String** |  |  [optional]
**directDepositToken** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  |  [optional]


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
API | &quot;API&quot;
SYSTEM | &quot;SYSTEM&quot;
PROD_SUPPORT | &quot;PROD_SUPPORT&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPLIED | &quot;APPLIED&quot;
REVERSED | &quot;REVERSED&quot;
REJECTED | &quot;REJECTED&quot;


<a name="ReasonCodeEnum"></a>
## Enum: ReasonCodeEnum
Name | Value
---- | -----
R01 | &quot;R01&quot;
R02 | &quot;R02&quot;
R03 | &quot;R03&quot;
R04 | &quot;R04&quot;
R06 | &quot;R06&quot;
R08 | &quot;R08&quot;
R09 | &quot;R09&quot;
R10 | &quot;R10&quot;
R11 | &quot;R11&quot;
R14 | &quot;R14&quot;
R15 | &quot;R15&quot;
R16 | &quot;R16&quot;
R17 | &quot;R17&quot;
R18 | &quot;R18&quot;
R23 | &quot;R23&quot;
R24 | &quot;R24&quot;
R29 | &quot;R29&quot;




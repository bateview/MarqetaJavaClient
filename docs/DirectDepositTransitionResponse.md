
# DirectDepositTransitionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional]
**token** | **String** |  |  [optional]
**reason** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**directDepositToken** | **String** |  |  [optional]
**transactionToken** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**directDepositAccountToken** | **String** |  |  [optional]


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
API | &quot;API&quot;
IVR | &quot;IVR&quot;
FRAUD | &quot;FRAUD&quot;
ADMIN | &quot;ADMIN&quot;
SYSTEM | &quot;SYSTEM&quot;
NETWORK | &quot;NETWORK&quot;
PROD_SUPPORT | &quot;PROD_SUPPORT&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPLIED | &quot;APPLIED&quot;
REVERSED | &quot;REVERSED&quot;
REJECTED | &quot;REJECTED&quot;




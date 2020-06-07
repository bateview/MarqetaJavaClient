
# DirectDepositAccountTransitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountToken** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**reason** | **String** |  |  [optional]
**token** | **String** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
TERMINATED | &quot;TERMINATED&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;
UNACTIVATED | &quot;UNACTIVATED&quot;


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




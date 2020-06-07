
# BankTransferTransitionRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**bankTransferToken** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**reason** | **String** |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**batchNumber** | **String** |  |  [optional]
**programReserveToken** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
PROCESSING | &quot;PROCESSING&quot;
SUBMITTED | &quot;SUBMITTED&quot;
RETURNED | &quot;RETURNED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELED | &quot;CANCELED&quot;


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
API | &quot;API&quot;
SYSTEM | &quot;SYSTEM&quot;




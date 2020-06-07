
# UserTransitionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  | 
**reason** | **String** |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**userToken** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNVERIFIED | &quot;UNVERIFIED&quot;
LIMITED | &quot;LIMITED&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
CLOSED | &quot;CLOSED&quot;


<a name="ReasonCodeEnum"></a>
## Enum: ReasonCodeEnum
Name | Value
---- | -----
_00 | &quot;00&quot;
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_09 | &quot;09&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_12 | &quot;12&quot;
_13 | &quot;13&quot;
_14 | &quot;14&quot;
_15 | &quot;15&quot;
_16 | &quot;16&quot;
_17 | &quot;17&quot;
_18 | &quot;18&quot;
_19 | &quot;19&quot;
_20 | &quot;20&quot;
_21 | &quot;21&quot;


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
API | &quot;API&quot;
IVR | &quot;IVR&quot;
FRAUD | &quot;FRAUD&quot;
ADMIN | &quot;ADMIN&quot;
SYSTEM | &quot;SYSTEM&quot;




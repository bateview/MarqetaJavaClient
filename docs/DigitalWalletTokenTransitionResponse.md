
# DigitalWalletTokenTransitionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**digitalWalletToken** | [**DigitalWalletTokenHash**](DigitalWalletTokenHash.md) |  | 
**cardSwap** | [**CardSwapHash**](CardSwapHash.md) |  |  [optional]
**type** | **String** |  | 
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  | 
**reason** | **String** |  |  [optional]
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
TOKEN_SERVICE_PROVIDER | &quot;TOKEN_SERVICE_PROVIDER&quot;
DIGITAL_WALLET | &quot;DIGITAL_WALLET&quot;
API | &quot;API&quot;
IVR | &quot;IVR&quot;
FRAUD | &quot;FRAUD&quot;
ADMIN | &quot;ADMIN&quot;
SYSTEM | &quot;SYSTEM&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
REQUESTED | &quot;REQUESTED&quot;
REQUEST_DECLINED | &quot;REQUEST_DECLINED&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
TERMINATED | &quot;TERMINATED&quot;


<a name="FulfillmentStatusEnum"></a>
## Enum: FulfillmentStatusEnum
Name | Value
---- | -----
DECISION_RED | &quot;DECISION_RED&quot;
DECISION_YELLOW | &quot;DECISION_YELLOW&quot;
DECISION_GREEN | &quot;DECISION_GREEN&quot;
REJECTED | &quot;REJECTED&quot;
PROVISIONED | &quot;PROVISIONED&quot;


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




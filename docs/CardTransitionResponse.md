
# CardTransitionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**cardToken** | **String** |  | 
**userToken** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**reason** | **String** |  |  [optional]
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  | 
**validations** | [**ValidationsResponse**](ValidationsResponse.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**cardProductToken** | **String** |  | 
**lastFour** | [**LastFourEnum**](#LastFourEnum) |  | 
**pan** | **String** |  | 
**expiration** | **String** |  | 
**expirationTime** | **String** |  | 
**barcode** | **String** |  | 
**pinIsSet** | **Boolean** |  | 
**fulfillment** | [**Fulfillment**](Fulfillment.md) |  |  [optional]
**bulkIssuanceToken** | **String** |  |  [optional]
**reissuePanFromCardToken** | **String** |  |  [optional]
**user** | [**CardholderMetadata**](CardholderMetadata.md) |  |  [optional]
**card** | [**CardMetadata**](CardMetadata.md) |  |  [optional]
**expedite** | **Boolean** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
TERMINATED | &quot;TERMINATED&quot;


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


<a name="FulfillmentStatusEnum"></a>
## Enum: FulfillmentStatusEnum
Name | Value
---- | -----
ISSUED | &quot;ISSUED&quot;
ORDERED | &quot;ORDERED&quot;
REJECTED | &quot;REJECTED&quot;
SHIPPED | &quot;SHIPPED&quot;
DELIVERED | &quot;DELIVERED&quot;
DIGITALLY_PRESENTED | &quot;DIGITALLY_PRESENTED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FULFILLMENT_ISSUED | &quot;fulfillment.issued&quot;
STATE_ACTIVATED | &quot;state.activated&quot;
STATE_SUSPENDED | &quot;state.suspended&quot;
STATE_REINSTATED | &quot;state.reinstated&quot;
STATE_TERMINATED | &quot;state.terminated&quot;
FULFILLMENT_ORDERED | &quot;fulfillment.ordered&quot;
FULFILLMENT_REJECTED | &quot;fulfillment.rejected&quot;
FULFILLMENT_SHIPPED | &quot;fulfillment.shipped&quot;
FULFILLMENT_DELIVERED | &quot;fulfillment.delivered&quot;
FULFILLMENT_DIGITALLY_PRESENTED | &quot;fulfillment.digitally_presented&quot;


<a name="LastFourEnum"></a>
## Enum: LastFourEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;




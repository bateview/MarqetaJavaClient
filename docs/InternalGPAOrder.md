
# InternalGPAOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**token** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**currency** | **String** |  |  [optional]
**fundingSource** | [**InternalFundingSource**](InternalFundingSource.md) |  |  [optional]
**originalOrderId** | **String** |  |  [optional]
**orderType** | **String** |  |  [optional]
**orderState** | [**OrderStateEnum**](#OrderStateEnum) |  |  [optional]
**responseCode** | **String** |  |  [optional]
**responseMemo** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="OrderStateEnum"></a>
## Enum: OrderStateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
REVERSED | &quot;REVERSED&quot;
CLEARED | &quot;CLEARED&quot;
COMPLETION | &quot;COMPLETION&quot;
DECLINED | &quot;DECLINED&quot;
ERROR | &quot;ERROR&quot;




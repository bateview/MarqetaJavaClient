
# ProgramReserveTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**token** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**tags** | **String** |  |  [optional]
**transactionToken** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;
PENDING_CREDIT | &quot;PENDING_CREDIT&quot;
PENDING_DEBIT | &quot;PENDING_DEBIT&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETE | &quot;COMPLETE&quot;




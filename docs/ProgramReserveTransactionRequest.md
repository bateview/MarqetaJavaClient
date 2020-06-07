
# ProgramReserveTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idempotentHash** | **String** |  |  [optional]
**token** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**currencyCode** | **String** |  | 
**memo** | **String** |  |  [optional]
**tags** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;
PENDING_CREDIT | &quot;PENDING_CREDIT&quot;
PENDING_DEBIT | &quot;PENDING_DEBIT&quot;




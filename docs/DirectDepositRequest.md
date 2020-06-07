
# DirectDepositRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**accountNumber** | **String** |  | 
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**standardEntryClassCode** | **String** |  |  [optional]
**companyName** | **String** |  |  [optional]
**companyDiscretionaryData** | **String** |  |  [optional]
**companyIdentification** | **String** |  |  [optional]
**companyEntryDescription** | **String** |  |  [optional]
**individualIdentificationNumber** | **String** |  |  [optional]
**individualName** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;




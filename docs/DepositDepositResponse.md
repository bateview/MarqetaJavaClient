
# DepositDepositResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**stateReason** | **String** |  |  [optional]
**stateReasonCode** | **String** |  |  [optional]
**directDepositAccountToken** | **String** |  |  [optional]
**userToken** | **String** |  |  [optional]
**businessToken** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
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


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPLIED | &quot;APPLIED&quot;
REVERSED | &quot;REVERSED&quot;
REJECTED | &quot;REJECTED&quot;




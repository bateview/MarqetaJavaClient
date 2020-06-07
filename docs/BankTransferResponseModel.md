
# BankTransferResponseModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**fees** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**memo** | **String** |  |  [optional]
**fundingSourceToken** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**currencyCode** | **String** | default &#x3D; USD |  [optional]
**transferSpeed** | [**TransferSpeedEnum**](#TransferSpeedEnum) | default &#x3D; STANDARD |  [optional]
**standardEntryClassCode** | [**StandardEntryClassCodeEnum**](#StandardEntryClassCodeEnum) |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**transitions** | [**List&lt;BankTransferTransitionResponseModel&gt;**](BankTransferTransitionResponseModel.md) |  |  [optional]
**batchNumber** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSH | &quot;PUSH&quot;
PULL | &quot;PULL&quot;


<a name="TransferSpeedEnum"></a>
## Enum: TransferSpeedEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
SAME_DAY | &quot;SAME_DAY&quot;


<a name="StandardEntryClassCodeEnum"></a>
## Enum: StandardEntryClassCodeEnum
Name | Value
---- | -----
WEB | &quot;WEB&quot;
PPD | &quot;PPD&quot;
CCD | &quot;CCD&quot;


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




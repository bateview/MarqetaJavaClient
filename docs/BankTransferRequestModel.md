
# BankTransferRequestModel

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




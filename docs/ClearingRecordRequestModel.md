
# ClearingRecordRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkFees** | [**List&lt;NetworkFeeModel&gt;**](NetworkFeeModel.md) |  |  [optional]
**webhook** | [**Webhook**](Webhook.md) |  |  [optional]
**mid** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**sourceAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**reconciliationAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**replacementAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cardholderBillingAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cashback** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cardholderBillingConversionRate** | **Double** |  |  [optional]
**cardholderBillingCurrency** | **String** |  |  [optional]
**cardToken** | **String** |  | 
**acquirerReferenceId** | **String** |  |  [optional]
**rrn** | **String** |  |  [optional]
**stan** | **String** |  |  [optional]
**processingCode** | **String** |  |  [optional]
**acquirerFee** | [**MoneyModel**](MoneyModel.md) |  |  [optional]
**issuerFee** | [**MoneyModel**](MoneyModel.md) |  |  [optional]
**functionCode** | **String** |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**approvalCode** | **String** |  |  [optional]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**localTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**networkReferenceId** | **String** |  |  [optional]
**findOriginalWindowDays** | **Integer** |  |  [optional]
**batchNumber** | **String** |  |  [optional]
**batchFileName** | **String** |  |  [optional]
**sequenceNumber** | **String** |  |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  |  [optional]
**subNetwork** | [**SubNetworkEnum**](#SubNetworkEnum) | Defaults to VISANET if network is VISA |  [optional]
**cardAcceptor** | [**CardAcceptorModel**](CardAcceptorModel.md) |  |  [optional]
**currencyCode** | **String** |  | 
**originalDataElements** | [**OriginalDataElements**](OriginalDataElements.md) |  |  [optional]
**precedingRelatedTransactionToken** | **String** |  |  [optional]
**sendExpirationDate** | **Boolean** |  |  [optional]
**simulateBatchForClearingRecordHash** | **Boolean** |  |  [optional]
**crossBorderIndicator** | [**CrossBorderIndicatorEnum**](#CrossBorderIndicatorEnum) |  |  [optional]
**tokenPan** | **String** |  |  [optional]
**mti** | [**MtiEnum**](#MtiEnum) |  |  [optional]


<a name="NetworkEnum"></a>
## Enum: NetworkEnum
Name | Value
---- | -----
DISCOVER | &quot;DISCOVER&quot;
MASTERCARD | &quot;MASTERCARD&quot;
PULSE | &quot;PULSE&quot;
VISA | &quot;VISA&quot;


<a name="SubNetworkEnum"></a>
## Enum: SubNetworkEnum
Name | Value
---- | -----
VISANET | &quot;VISANET&quot;
VISANETDEBIT | &quot;VISANETDEBIT&quot;
VISAINTERLINK | &quot;VISAINTERLINK&quot;
VISAPLUS | &quot;VISAPLUS&quot;


<a name="CrossBorderIndicatorEnum"></a>
## Enum: CrossBorderIndicatorEnum
Name | Value
---- | -----
SINGLE_CURRENCY | &quot;SINGLE_CURRENCY&quot;
MULTI_CURRENCY | &quot;MULTI_CURRENCY&quot;
REBATE | &quot;REBATE&quot;
UNKNOWN | &quot;UNKNOWN&quot;


<a name="MtiEnum"></a>
## Enum: MtiEnum
Name | Value
---- | -----
_0220 | &quot;0220&quot;
_0420 | &quot;0420&quot;




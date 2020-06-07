
# AdvAuthRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mti** | [**MtiEnum**](#MtiEnum) | Default is 0100 |  [optional]
**network** | [**NetworkEnum**](#NetworkEnum) |  | 
**subNetwork** | [**SubNetworkEnum**](#SubNetworkEnum) | Defaults to VISANET if network is VISA |  [optional]
**isRouterSimulator** | **Boolean** |  |  [optional]
**networkReferenceId** | **String** |  |  [optional]
**localTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-dd, yyyy-MM-ddThh:mm:ssZ |  [optional]
**stan** | **String** |  |  [optional]
**rrn** | **String** |  |  [optional]
**processingCode** | **String** |  |  [optional]
**functionCode** | **String** |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**acquirerReferenceId** | **String** |  |  [optional]
**forwardingInstitutionId** | **String** |  |  [optional]
**localTransactionAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**localCurrencyCode** | **String** |  |  [optional]
**settlementAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cardholderBillingAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cardholderBillingConversionRate** | **Double** |  |  [optional]
**cardholderBillingCurrency** | **String** |  |  [optional]
**settlementCurrencyCode** | **String** |  |  [optional]
**approvalCode** | **String** |  |  [optional]
**networkResponse** | **String** |  |  [optional]
**stanPaddingLength** | **Integer** |  |  [optional]
**acquirer** | [**Acquirer**](Acquirer.md) |  |  [optional]
**cardToken** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cashBackAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**mid** | **String** |  |  [optional]
**pin** | **String** |  |  [optional]
**posPanEntryMode** | [**PosPanEntryModeEnum**](#PosPanEntryModeEnum) | Default is MAG_STRIPE |  [optional]
**acquirerFeeAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**stipReasonCode** | **String** |  |  [optional]
**isRecurring** | **Boolean** | Default is false |  [optional]
**networkFees** | [**List&lt;NetworkFeeModel&gt;**](NetworkFeeModel.md) |  |  [optional]
**cardAcceptor** | [**AdvancedAuthCardAcceptorModel**](AdvancedAuthCardAcceptorModel.md) |  |  [optional]
**transactionOptions** | [**TransactionOptions**](TransactionOptions.md) |  |  [optional]
**originalDataElements** | [**OriginalDataElements**](OriginalDataElements.md) |  |  [optional]
**replacementAmount** | [**ReplacementAmount**](ReplacementAmount.md) |  |  [optional]
**webhook** | [**Webhook**](Webhook.md) |  |  [optional]
**digitalWalletToken** | [**DigitalWalletToken**](DigitalWalletToken.md) |  |  [optional]
**digitalWalletTokenDeviceInfo** | [**DigitalWalletTokenDevice**](DigitalWalletTokenDevice.md) |  |  [optional]
**digitalWalletTokenWalletProviderInfo** | [**DigitalWalletTokenWalletProvider**](DigitalWalletTokenWalletProvider.md) |  |  [optional]
**rawIsoFields** | **Map&lt;String, String&gt;** |  |  [optional]
**cavvResultCode** | [**CavvResultCodeEnum**](#CavvResultCodeEnum) |  |  [optional]
**issuerReceivedTime** | **String** |  |  [optional]
**cardOptions** | [**CardOptions**](CardOptions.md) |  | 
**poi** | [**AdvancedAuthPoi**](AdvancedAuthPoi.md) |  |  [optional]
**isStipApproval** | **Boolean** |  |  [optional]


<a name="MtiEnum"></a>
## Enum: MtiEnum
Name | Value
---- | -----
_0100 | &quot;0100&quot;
_0120 | &quot;0120&quot;
_0190 | &quot;0190&quot;
_0200 | &quot;0200&quot;
_0220 | &quot;0220&quot;
_0400 | &quot;0400&quot;
_0420 | &quot;0420&quot;
_0620 | &quot;0620&quot;


<a name="NetworkEnum"></a>
## Enum: NetworkEnum
Name | Value
---- | -----
MASTERCARD | &quot;MASTERCARD&quot;
DISCOVER | &quot;DISCOVER&quot;
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
MAESTRO | &quot;MAESTRO&quot;


<a name="PosPanEntryModeEnum"></a>
## Enum: PosPanEntryModeEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
MAG_STRIPE | &quot;MAG_STRIPE&quot;
MAG_STRIPE_CONTACTLESS | &quot;MAG_STRIPE_CONTACTLESS&quot;
CHIP | &quot;CHIP&quot;
CHIP_CONTACTLESS | &quot;CHIP_CONTACTLESS&quot;
BAR_CODE | &quot;BAR_CODE&quot;
OCR | &quot;OCR&quot;
MICR | &quot;MICR&quot;
OTHER | &quot;OTHER&quot;


<a name="CavvResultCodeEnum"></a>
## Enum: CavvResultCodeEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;
_6 | &quot;6&quot;
_7 | &quot;7&quot;
_8 | &quot;8&quot;
_9 | &quot;9&quot;
A | &quot;A&quot;
B | &quot;B&quot;
C | &quot;C&quot;
D | &quot;D&quot;




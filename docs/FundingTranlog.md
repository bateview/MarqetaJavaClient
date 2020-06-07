
# FundingTranlog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnedBalances** | **String** |  |  [optional]
**tags** | **String** |  |  [optional]
**transactionType** | **String** |  | 
**token** | **String** |  | 
**refTransaction** | [**InternalAuthorizationTransaction**](InternalAuthorizationTransaction.md) |  |  [optional]
**node** | **String** |  | 
**network** | **String** |  | 
**subNetwork** | **String** |  | 
**mid** | **String** |  |  [optional]
**tid** | **String** |  |  [optional]
**stan** | **String** |  |  [optional]
**caName** | **String** |  |  [optional]
**caStreet** | **String** |  |  [optional]
**caZip** | **String** |  |  [optional]
**caCity** | **String** |  |  [optional]
**caRegion** | **String** |  |  [optional]
**caCountry** | **String** |  |  [optional]
**functionCode** | **String** |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**responseCode** | **String** |  |  [optional]
**approvalNumber** | **String** |  |  [optional]
**displayMessage** | **String** |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transmissionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**localTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**captureDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**itc** | **String** |  |  [optional]
**irc** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**additionalAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**acquirerFee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**issuerFee** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**rc** | **String** |  |  [optional]
**extrc** | **String** |  |  [optional]
**duration** | **Integer** |  |  [optional]
**cardholder** | [**InternalUser**](InternalUser.md) |  |  [optional]
**actingCardholder** | [**InternalUser**](InternalUser.md) |  |  [optional]
**card** | [**InternalCard**](InternalCard.md) |  |  [optional]
**account** | [**InternalAccount**](InternalAccount.md) |  |  [optional]
**account2** | [**InternalAccount**](InternalAccount.md) |  |  [optional]
**mcc** | **String** |  |  [optional]
**networkReferenceId** | **String** |  |  [optional]
**acquirerReferenceId** | **String** |  |  [optional]
**retrievalReferenceNumber** | **String** |  |  [optional]
**forwardingInstId** | **String** |  |  [optional]
**networkMid** | **String** |  |  [optional]
**requestAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) |  |  [optional]
**remoteHost** | **String** |  |  [optional]
**responseAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**incomingNetworkRequestITC** | **String** |  |  [optional]
**digitalWalletToken** | [**InternalDigitalWallet**](InternalDigitalWallet.md) |  |  [optional]
**tranlogAttributes** | **Map&lt;String, String&gt;** |  |  [optional]
**payload** | [**TransactionModel**](TransactionModel.md) |  |  [optional]
**layer** | **Integer** |  |  [optional]
**transactionName** | **String** |  |  [optional]
**originator** | **String** |  |  [optional]
**acquirer** | **String** |  |  [optional]
**gpaorder** | [**InternalGPAOrder**](InternalGPAOrder.md) |  | 
**gatewayLog** | [**InternalGatewayLog**](InternalGatewayLog.md) |  | 


<a name="TransactionStateEnum"></a>
## Enum: TransactionStateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CLEARED | &quot;CLEARED&quot;
COMPLETION | &quot;COMPLETION&quot;
DECLINED | &quot;DECLINED&quot;
ERROR | &quot;ERROR&quot;
ALL | &quot;ALL&quot;





# TransactionModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**identifier** | **String** |  |  [optional]
**token** | **String** |  | 
**userToken** | **String** |  |  [optional]
**businessToken** | **String** |  |  [optional]
**actingUserToken** | **String** |  | 
**cardToken** | **String** |  |  [optional]
**originalCredit** | [**OriginalCredit**](OriginalCredit.md) |  |  [optional]
**precedingRelatedTransactionToken** | **String** |  |  [optional]
**precedingTransaction** | [**PrecedingTransaction**](PrecedingTransaction.md) |  |  [optional]
**amountToBeReleased** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**gpa** | [**CardholderBalance**](CardholderBalance.md) |  |  [optional]
**gpaOrder** | [**GpaResponse**](GpaResponse.md) |  |  [optional]
**duration** | **Integer** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**userTransactionTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**requestAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cashBackAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**currencyConversion** | [**CurrencyConversion**](CurrencyConversion.md) |  |  [optional]
**issuerInterchangeAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**approvalCode** | **String** |  |  [optional]
**response** | [**Response**](Response.md) |  |  [optional]
**incrementalAuthorizationTransactionTokens** | **List&lt;String&gt;** |  |  [optional]
**merchant** | [**MerchantResponseModel**](MerchantResponseModel.md) |  |  [optional]
**store** | [**StoreResponseModel**](StoreResponseModel.md) |  |  [optional]
**gpaOrderUnload** | [**GpaReturns**](GpaReturns.md) |  |  [optional]
**programTransfer** | [**ProgramTransferResponse**](ProgramTransferResponse.md) |  |  [optional]
**feeTransfer** | [**FeeTransferResponse**](FeeTransferResponse.md) |  |  [optional]
**peerTransfer** | [**PeerTransferResponse**](PeerTransferResponse.md) |  |  [optional]
**msaOrders** | [**List&lt;MsaOrderResponse&gt;**](MsaOrderResponse.md) |  |  [optional]
**msaOrderUnload** | [**MsaReturns**](MsaReturns.md) |  |  [optional]
**offerOrders** | [**List&lt;OfferOrderResponse&gt;**](OfferOrderResponse.md) |  |  [optional]
**autoReload** | [**AutoReloadModel**](AutoReloadModel.md) |  |  [optional]
**directDeposit** | [**DepositDepositResponse**](DepositDepositResponse.md) |  |  [optional]
**polarity** | [**PolarityEnum**](#PolarityEnum) |  |  [optional]
**realTimeFeeGroup** | [**RealTimeFeeGroup**](RealTimeFeeGroup.md) |  |  [optional]
**fee** | [**Fee**](Fee.md) |  |  [optional]
**chargeback** | [**ChargebackResponse**](ChargebackResponse.md) |  |  [optional]
**dispute** | [**DisputeModel**](DisputeModel.md) |  |  [optional]
**network** | **String** |  |  [optional]
**subnetwork** | **String** |  |  [optional]
**acquirerFeeAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**acquirer** | [**Acquirer**](Acquirer.md) |  |  [optional]
**fees** | [**List&lt;NetworkFeeModel&gt;**](NetworkFeeModel.md) |  |  [optional]
**digitalWalletToken** | [**DigitalWalletToken**](DigitalWalletToken.md) |  |  [optional]
**user** | [**CardholderMetadata**](CardholderMetadata.md) |  |  [optional]
**card** | [**CardResponse**](CardResponse.md) |  |  [optional]
**business** | [**BusinessMetadata**](BusinessMetadata.md) |  |  [optional]
**addressVerification** | [**AddressVerificationModel**](AddressVerificationModel.md) |  |  [optional]
**cardSecurityCodeVerification** | [**CardSecurityCodeVerification**](CardSecurityCodeVerification.md) |  |  [optional]
**fraud** | [**Fraud**](Fraud.md) |  |  [optional]
**standinApprovedBy** | **String** |  |  [optional]
**standinBy** | **String** |  |  [optional]
**standinReason** | **String** |  |  [optional]
**cardholderAuthenticationData** | [**CardholderAuthenticationData**](CardholderAuthenticationData.md) |  |  [optional]
**issuerReceivedTime** | **String** |  |  [optional]
**issuerPaymentNode** | **String** |  |  [optional]
**networkReferenceId** | **String** |  |  [optional]
**clearingRecordSequenceNumber** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GPA_CREDIT | &quot;gpa.credit&quot;
GPA_CREDIT_PENDING | &quot;gpa.credit.pending&quot;
GPA_CREDIT_PENDING_REVERSAL | &quot;gpa.credit.pending.reversal&quot;
GPA_CREDIT_REVERSAL | &quot;gpa.credit.reversal&quot;
GPA_CREDIT_NETWORKLOAD | &quot;gpa.credit.networkload&quot;
GPA_CREDIT_NETWORKLOAD_REVERSAL | &quot;gpa.credit.networkload.reversal&quot;
GPA_DEBIT_NETWORKLOAD | &quot;gpa.debit.networkload&quot;
GPA_DEBIT | &quot;gpa.debit&quot;
GPA_GRANT | &quot;gpa.grant&quot;
GPA_CREDIT_ISSUEROPERATOR | &quot;gpa.credit.issueroperator&quot;
GPA_DEBIT_ISSUEROPERATOR | &quot;gpa.debit.issueroperator&quot;
GPA_CREDIT_CHARGEBACK | &quot;gpa.credit.chargeback&quot;
GPA_CREDIT_CHARGEBACK_REVERSAL | &quot;gpa.credit.chargeback.reversal&quot;
GPA_CREDIT_BILLPAYMENT | &quot;gpa.credit.billpayment&quot;
GPA_CREDIT_AUTHORIZATION_BILLPAYMENT | &quot;gpa.credit.authorization.billpayment&quot;
GPA_CREDIT_AUTHORIZATION_BILLPAYMENT_REVERSAL | &quot;gpa.credit.authorization.billpayment.reversal&quot;
MSA_CREDIT_PENDING | &quot;msa.credit.pending&quot;
MSA_CREDIT_PENDING_REVERSAL | &quot;msa.credit.pending.reversal&quot;
MSA_CREDIT_REVERSAL | &quot;msa.credit.reversal&quot;
MSA_CREDIT | &quot;msa.credit&quot;
MSA_DEBIT | &quot;msa.debit&quot;
MSA_CREDIT_CHARGEBACK | &quot;msa.credit.chargeback&quot;
MSA_CREDIT_CHARGEBACK_REVERSAL | &quot;msa.credit.chargeback.reversal&quot;
AUTHORIZATION | &quot;authorization&quot;
AUTHORIZATION_ADVICE | &quot;authorization.advice&quot;
AUTHORIZATION_REVERSAL | &quot;authorization.reversal&quot;
AUTHORIZATION_CLEARING | &quot;authorization.clearing&quot;
AUTHORIZATION_REVERSAL_ISSUEREXPIRATION | &quot;authorization.reversal.issuerexpiration&quot;
AUTHORIZATION_CLEARING_CHARGEBACK | &quot;authorization.clearing.chargeback&quot;
AUTHORIZATION_CLEARING_CHARGEBACK_REVERSAL | &quot;authorization.clearing.chargeback.reversal&quot;
REFUND | &quot;refund&quot;
PINDEBIT_ATM_WITHDRAWAL | &quot;pindebit.atm.withdrawal&quot;
PINDEBIT_BALANCEINQUIRY | &quot;pindebit.balanceinquiry&quot;
PINDEBIT_CASHBACK | &quot;pindebit.cashback&quot;
PINDEBIT | &quot;pindebit&quot;
PROGRAMRESERVE_CREDIT | &quot;programreserve.credit&quot;
PROGRAMRESERVE_DEBIT | &quot;programreserve.debit&quot;
BILLPAYMENT | &quot;billpayment&quot;
BILLPAYMENT_CLEARING | &quot;billpayment.clearing&quot;
BILLPAYMENT_REVERSAL | &quot;billpayment.reversal&quot;
FEE_CHARGE_PENDING | &quot;fee.charge.pending&quot;
FEE_CHARGE | &quot;fee.charge&quot;
FEE_CHARGE_PENDING_REFUND | &quot;fee.charge.pending.refund&quot;
FUNDS_EXPIRE | &quot;funds.expire&quot;
REWARD_EARN | &quot;reward.earn&quot;
TRANSFER_PEER | &quot;transfer.peer&quot;
TRANSFER_FEE | &quot;transfer.fee&quot;
ACCOUNT_CREDIT | &quot;account.credit&quot;
ACCOUNT_DEBIT | &quot;account.debit&quot;
UNKNOWN | &quot;unknown&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
CLEARED | &quot;CLEARED&quot;
COMPLETION | &quot;COMPLETION&quot;
DECLINED | &quot;DECLINED&quot;
ERROR | &quot;ERROR&quot;
ALL | &quot;ALL&quot;


<a name="PolarityEnum"></a>
## Enum: PolarityEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;
PENDING_CREDIT | &quot;PENDING_CREDIT&quot;
PENDING_DEBIT | &quot;PENDING_DEBIT&quot;




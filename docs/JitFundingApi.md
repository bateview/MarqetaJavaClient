
# JitFundingApi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**method** | [**MethodEnum**](#MethodEnum) |  | 
**userToken** | **String** |  | 
**actingUserToken** | **String** |  |  [optional]
**businessToken** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**memo** | **String** |  |  [optional]
**tags** | **String** |  |  [optional]
**originalJitFundingToken** | **String** |  |  [optional]
**incrementalAuthorizationJitFundingTokens** | **List&lt;String&gt;** |  |  [optional]
**addressVerification** | [**JitAddressVerification**](JitAddressVerification.md) |  |  [optional]
**balances** | [**Map&lt;String, CardholderBalance&gt;**](CardholderBalance.md) |  |  [optional]


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
AUTHORIZATION | &quot;pgfs.authorization&quot;
BALANCEINQUIRY | &quot;pgfs.balanceinquiry&quot;
AUTHORIZATION_INCREMENTAL | &quot;pgfs.authorization.incremental&quot;
AUTHORIZATION_CAPTURE | &quot;pgfs.authorization.capture&quot;
AUTHORIZATION_REVERSAL | &quot;pgfs.authorization.reversal&quot;
AUTH_PLUS_CAPTURE | &quot;pgfs.auth_plus_capture&quot;
REFUND | &quot;pgfs.refund&quot;
FORCE_CAPTURE | &quot;pgfs.force_capture&quot;
AUTHORIZATION_CAPTURE_CHARGEBACK | &quot;pgfs.authorization.capture.chargeback&quot;
AUTHORIZATION_CAPTURE_CHARGEBACK_REVERSAL | &quot;pgfs.authorization.capture.chargeback.reversal&quot;
PINDEBIT_CHARGEBACK | &quot;pgfs.pindebit.chargeback&quot;
PINDEBIT_CHARGEBACK_REVERSAL | &quot;pgfs.pindebit.chargeback.reversal&quot;
DISPUTE_CREDIT | &quot;pgfs.dispute.credit&quot;
DISPUTE_DEBIT | &quot;pgfs.dispute.debit&quot;
DIRECTDEPOSIT_CREDIT | &quot;pgfs.directdeposit.credit&quot;
DIRECTDEPOSIT_DEBIT | &quot;pgfs.directdeposit.debit&quot;
DIRECTDEPOSIT_CREDIT_REVERSAL | &quot;pgfs.directdeposit.credit.reversal&quot;
DIRECTDEPOSIT_DEBIT_REVERSAL | &quot;pgfs.directdeposit.debit.reversal&quot;
ADJUSTMENT_CREDIT | &quot;pgfs.adjustment.credit&quot;
ADJUSTMENT_DEBIT | &quot;pgfs.adjustment.debit&quot;
AUTH_PLUS_CAPTURE_STANDIN | &quot;pgfs.auth_plus_capture.standin&quot;
AUTHORIZATION_STANDIN | &quot;pgfs.authorization.standin&quot;
NETWORK_LOAD | &quot;pgfs.network.load&quot;
ORIGINAL_CREDIT_AUTHORIZATION | &quot;pgfs.original.credit.authorization&quot;
ORIGINAL_CREDIT_AUTH_PLUS_CAPTURE | &quot;pgfs.original.credit.auth_plus_capture&quot;
REFUND_AUTHORIZATION | &quot;pgfs.refund.authorization&quot;
REFUND_AUTHORIZATION_REVERSALPGFS_BILLPAYMENT | &quot;pgfs.refund.authorization.reversalpgfs.billpayment&quot;
BILLPAYMENT_CAPTURE | &quot;pgfs.billpayment.capture&quot;
BILLPAYMENT_REVERSAL | &quot;pgfs.billpayment.reversal&quot;




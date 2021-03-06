
# ChargebackRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reasonDescription** | [**ReasonDescriptionEnum**](#ReasonDescriptionEnum) | Either &#39;reason_description&#39; or &#39;reason_code&#39; is required |  [optional]
**reasonCode** | **String** | Either &#39;reason_code&#39; or &#39;reason_description&#39; is required |  [optional]
**token** | **String** |  |  [optional]
**transactionToken** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**memo** | **String** |  |  [optional]
**creditUser** | **Boolean** |  |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 


<a name="ReasonDescriptionEnum"></a>
## Enum: ReasonDescriptionEnum
Name | Value
---- | -----
SERVICE_NOT_PROVIDED_MERCHANDISE_NOT_RECEIVED | &quot;SERVICE_NOT_PROVIDED_MERCHANDISE_NOT_RECEIVED&quot;
CANCELLED_RECURRING_TRANSACTION | &quot;CANCELLED_RECURRING_TRANSACTION&quot;
NOT_AS_DESCRIBED_OR_DEFECTIVE_MERCHANDISE | &quot;NOT_AS_DESCRIBED_OR_DEFECTIVE_MERCHANDISE&quot;
FRAUD_MULTIPLE_TRANSACTIONS | &quot;FRAUD_MULTIPLE_TRANSACTIONS&quot;
FRAUD_TRANSACTION | &quot;FRAUD_TRANSACTION&quot;
NO_AUTHORIZATION | &quot;NO_AUTHORIZATION&quot;
LATE_PRESENTMENT | &quot;LATE_PRESENTMENT&quot;
TRANSACTION_NOT_RECOGNIZED | &quot;TRANSACTION_NOT_RECOGNIZED&quot;
INCORRECT_CURRENCY | &quot;INCORRECT_CURRENCY&quot;
INCORRECT_TRANSACTION_CODE | &quot;INCORRECT_TRANSACTION_CODE&quot;
INCORRECT_CURRENCY_OR_TRANSACTION_CODE | &quot;INCORRECT_CURRENCY_OR_TRANSACTION_CODE&quot;
INCORRECT_TRANSACTION_AMOUNT | &quot;INCORRECT_TRANSACTION_AMOUNT&quot;
INCORRECT_ACCOUNT_NUMBER | &quot;INCORRECT_ACCOUNT_NUMBER&quot;
INCORRECT_TRANSACTION_AMOUNT_OR_ACCOUNT_NUMBER | &quot;INCORRECT_TRANSACTION_AMOUNT_OR_ACCOUNT_NUMBER&quot;
NOT_AUTHORIZED_CARD_PRESENT | &quot;NOT_AUTHORIZED_CARD_PRESENT&quot;
NOT_AUTHORIZED_CARD_ABSENT | &quot;NOT_AUTHORIZED_CARD_ABSENT&quot;
CREDIT_NOT_PROCESSED | &quot;CREDIT_NOT_PROCESSED&quot;
NON_RECEIPT_OF_CASH_OR_LOAD_TRANSACTION_VALUE_AT_ATM | &quot;NON_RECEIPT_OF_CASH_OR_LOAD_TRANSACTION_VALUE_AT_ATM&quot;


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
GATEWAY | &quot;GATEWAY&quot;
GATEWAY_AUTOMATED | &quot;GATEWAY_AUTOMATED&quot;
ISSUER | &quot;ISSUER&quot;
ISSUER_AUTOMATED | &quot;ISSUER_AUTOMATED&quot;




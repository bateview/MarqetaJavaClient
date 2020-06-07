
# ChargebackResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
**transactionToken** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**reasonDescription** | [**ReasonDescriptionEnum**](#ReasonDescriptionEnum) |  |  [optional]
**reasonCode** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  | 
**channel** | [**ChannelEnum**](#ChannelEnum) |  | 
**network** | [**NetworkEnum**](#NetworkEnum) |  | 
**networkCaseId** | **String** |  |  [optional]
**creditUser** | **Boolean** |  | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 


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
INCORRECT_CURRENCY_OR_TRANSACTION_CODE | &quot;INCORRECT_CURRENCY_OR_TRANSACTION_CODE&quot;
INCORRECT_TRANSACTION_AMOUNT_OR_ACCOUNT_NUMBER | &quot;INCORRECT_TRANSACTION_AMOUNT_OR_ACCOUNT_NUMBER&quot;
NOT_AUTHORIZED_CARD_PRESENT | &quot;NOT_AUTHORIZED_CARD_PRESENT&quot;
NOT_AUTHORIZED_CARD_ABSENT | &quot;NOT_AUTHORIZED_CARD_ABSENT&quot;
CREDIT_NOT_PROCESSED | &quot;CREDIT_NOT_PROCESSED&quot;
NON_RECEIPT_OF_CASH_OR_LOAD_TRANSACTION_VALUE_AT_ATM | &quot;NON_RECEIPT_OF_CASH_OR_LOAD_TRANSACTION_VALUE_AT_ATM&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
INITIATED | &quot;INITIATED&quot;
REPRESENTMENT | &quot;REPRESENTMENT&quot;
PREARBITRATION | &quot;PREARBITRATION&quot;
ARBITRATION | &quot;ARBITRATION&quot;
CASE_WON | &quot;CASE_WON&quot;
CASE_LOST | &quot;CASE_LOST&quot;
NETWORK_REJECTED | &quot;NETWORK_REJECTED&quot;
WITHDRAWN | &quot;WITHDRAWN&quot;


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
GATEWAY | &quot;GATEWAY&quot;
GATEWAY_AUTOMATED | &quot;GATEWAY_AUTOMATED&quot;
ISSUER | &quot;ISSUER&quot;
ISSUER_AUTOMATED | &quot;ISSUER_AUTOMATED&quot;


<a name="NetworkEnum"></a>
## Enum: NetworkEnum
Name | Value
---- | -----
MARQETA | &quot;MARQETA&quot;
DISCOVER | &quot;DISCOVER&quot;
MASTERCARD | &quot;MASTERCARD&quot;
PULSE | &quot;PULSE&quot;
VISA | &quot;VISA&quot;




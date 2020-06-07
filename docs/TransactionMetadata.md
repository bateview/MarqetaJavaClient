
# TransactionMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionCategory** | [**TransactionCategoryEnum**](#TransactionCategoryEnum) |  |  [optional]
**paymentChannel** | [**PaymentChannelEnum**](#PaymentChannelEnum) |  |  [optional]
**crossBorderTransaction** | **Boolean** |  |  [optional]
**authorizationLifeCycle** | **Integer** |  |  [optional]
**isLodgingAutoRental** | **Boolean** |  |  [optional]
**lodgingAutoRentalStartDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transit** | [**Transit**](Transit.md) |  |  [optional]
**airline** | [**Airline**](Airline.md) |  |  [optional]


<a name="TransactionCategoryEnum"></a>
## Enum: TransactionCategoryEnum
Name | Value
---- | -----
RETAIL_SALE | &quot;RETAIL_SALE&quot;
BILL_PAY | &quot;BILL_PAY&quot;
HOTEL | &quot;HOTEL&quot;
HEALTH_CARE | &quot;HEALTH_CARE&quot;
RESTAURANT | &quot;RESTAURANT&quot;
AUTO_RENTAL | &quot;AUTO_RENTAL&quot;
AIRLINE | &quot;AIRLINE&quot;
PAYMENT | &quot;PAYMENT&quot;
HOSPITALIZATION_COLLEGE | &quot;HOSPITALIZATION_COLLEGE&quot;
PHONE_MAIL_ECOMMERCE | &quot;PHONE_MAIL_ECOMMERCE&quot;
ATM | &quot;ATM&quot;
TRANSIT | &quot;TRANSIT&quot;


<a name="PaymentChannelEnum"></a>
## Enum: PaymentChannelEnum
Name | Value
---- | -----
OTHER | &quot;OTHER&quot;
ATM | &quot;ATM&quot;
ECOMMERCE | &quot;ECOMMERCE&quot;
MAIL | &quot;MAIL&quot;
PHONE | &quot;PHONE&quot;




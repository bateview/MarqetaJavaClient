
# OrignalcreditRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**cardToken** | **String** |  | 
**mid** | **String** |  | 
**screeningScore** | **String** |  |  [optional]
**cardAcceptor** | [**CardAcceptorModel**](CardAcceptorModel.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 
**senderData** | [**OriginalCreditSenderData**](OriginalCreditSenderData.md) |  |  [optional]
**webhook** | [**Webhook**](Webhook.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCOUNT_TO_ACCOUNT | &quot;account_to_account&quot;
PERSON_TO_PERSON | &quot;person_to_person&quot;
PREPAID | &quot;prepaid&quot;
WALLET_TRANSFER | &quot;wallet_transfer&quot;
MONEY_TRANSFER_BY_BANK | &quot;money_transfer_by_bank&quot;
BUSINESS_TO_BUSINESS | &quot;business_to_business&quot;
DISBURSEMENT | &quot;disbursement&quot;
GOVERNMENT_DISBURSEMENT | &quot;government_disbursement&quot;
GAMBLING_PAYOUT | &quot;gambling_payout&quot;
LOYALTY | &quot;loyalty&quot;
MERCHANT_DISBURSEMENT | &quot;merchant_disbursement&quot;
ONLINE_GAMBLING_PAYOUT | &quot;online_gambling_payout&quot;
PENSION_DISBURSEMENT | &quot;pension_disbursement&quot;
PREPAID_LOADS | &quot;prepaid_loads&quot;
CARD_BILL_PAYMENT | &quot;card_bill_payment&quot;
BILL_PAYMENT | &quot;bill_payment&quot;
CASH_CLAIM | &quot;cash_claim&quot;
CASH_IN | &quot;cash_in&quot;
CASH_OUT | &quot;cash_out&quot;
MOBILE_AIR_TIME_PAYMENT | &quot;mobile_air_time_payment&quot;
MONEY_TRANSFER_BY_MERCHANT | &quot;money_transfer_by_merchant&quot;
FACE_TO_FACE_MERCHANT_PAYMENT | &quot;face_to_face_merchant_payment&quot;
GOVERNMENT_PAYMENT | &quot;government_payment&quot;
PAYMENTS_GOODS_SERVICES | &quot;payments_goods_services&quot;




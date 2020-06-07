
# BalanceInquiryRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkFees** | [**List&lt;NetworkFeeModel&gt;**](NetworkFeeModel.md) |  |  [optional]
**webhook** | [**Webhook**](Webhook.md) |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**cardToken** | **String** |  | 
**pin** | **String** |  |  [optional]
**mid** | **String** |  | 
**cardAcceptor** | [**CardAcceptorModel**](CardAcceptorModel.md) |  | 


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CHECKING | &quot;checking&quot;
SAVINGS | &quot;savings&quot;
CREDIT | &quot;credit&quot;




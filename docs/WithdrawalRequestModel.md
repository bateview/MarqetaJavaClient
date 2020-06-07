
# WithdrawalRequestModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional]
**cardToken** | **String** |  | 
**pin** | **String** |  |  [optional]
**mid** | **String** |  | 
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**cardAcceptor** | [**CardAcceptorModel**](CardAcceptorModel.md) |  |  [optional]
**webhook** | [**Webhook**](Webhook.md) |  |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CHECKING | &quot;checking&quot;
SAVINGS | &quot;savings&quot;
CREDIT | &quot;credit&quot;





# VelocityControlRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**association** | [**SpendControlAssociation**](SpendControlAssociation.md) |  |  [optional]
**merchantScope** | [**MerchantScope**](MerchantScope.md) |  |  [optional]
**usageLimit** | **Integer** |  |  [optional]
**approvalsOnly** | **Boolean** |  |  [optional]
**includePurchases** | **Boolean** |  |  [optional]
**includeWithdrawals** | **Boolean** |  |  [optional]
**includeTransfers** | **Boolean** |  |  [optional]
**includeCashback** | **Boolean** |  |  [optional]
**includeCredits** | **Boolean** |  |  [optional]
**currencyCode** | **String** |  | 
**amountLimit** | [**BigDecimal**](BigDecimal.md) |  | 
**velocityWindow** | [**VelocityWindowEnum**](#VelocityWindowEnum) |  | 
**active** | **Boolean** |  |  [optional]


<a name="VelocityWindowEnum"></a>
## Enum: VelocityWindowEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
LIFETIME | &quot;LIFETIME&quot;
TRANSACTION | &quot;TRANSACTION&quot;




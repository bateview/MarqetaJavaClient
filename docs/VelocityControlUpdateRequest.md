
# VelocityControlUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  | 
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
**currencyCode** | **String** |  |  [optional]
**amountLimit** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**velocityWindow** | [**VelocityWindowEnum**](#VelocityWindowEnum) |  |  [optional]
**active** | **Boolean** |  |  [optional]


<a name="VelocityWindowEnum"></a>
## Enum: VelocityWindowEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
QUARTER | &quot;QUARTER&quot;
YEAR | &quot;YEAR&quot;
LIFETIME | &quot;LIFETIME&quot;
TRANSACTION | &quot;TRANSACTION&quot;




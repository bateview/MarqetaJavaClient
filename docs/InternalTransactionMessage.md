
# InternalTransactionMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processingStartTimeMillis** | **Long** |  |  [optional]
**authorizationTranlog** | [**InternalAuthorizationTransaction**](InternalAuthorizationTransaction.md) |  | 
**fundingTranlog** | [**FundingTranlog**](FundingTranlog.md) |  |  [optional]
**velocityCaches** | [**List&lt;VelocityCache&gt;**](VelocityCache.md) |  |  [optional]
**context** | **Map&lt;String, Object&gt;** |  |  [optional]
**creditDebitIndicator** | [**CreditDebitIndicatorEnum**](#CreditDebitIndicatorEnum) |  |  [optional]


<a name="CreditDebitIndicatorEnum"></a>
## Enum: CreditDebitIndicatorEnum
Name | Value
---- | -----
CREDIT | &quot;CREDIT&quot;
DEBIT | &quot;DEBIT&quot;
NONE | &quot;NONE&quot;




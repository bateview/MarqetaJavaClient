
# InternalFindOriginalRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorizationTranlog** | [**InternalAuthorizationTransaction**](InternalAuthorizationTransaction.md) |  | 
**overrideDays** | **Integer** |  |  [optional]
**context** | **Map&lt;String, Object&gt;** |  |  [optional]
**_configuration** | **Map&lt;String, String&gt;** |  |  [optional]
**finders** | [**List&lt;FindersEnum&gt;**](#List&lt;FindersEnum&gt;) |  |  [optional]
**originalTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**originalStan** | **String** |  |  [optional]


<a name="List<FindersEnum>"></a>
## Enum: List&lt;FindersEnum&gt;
Name | Value
---- | -----
AMOUNT_LOCAL_TXN_DATE | &quot;AMOUNT_LOCAL_TXN_DATE&quot;
APPROVAL_CODE_RRN | &quot;APPROVAL_CODE_RRN&quot;
APPROVAL_CODE_STAN | &quot;APPROVAL_CODE_STAN&quot;
APPROVAL_CODE_STAN_LOCAL_TXN_DATE | &quot;APPROVAL_CODE_STAN_LOCAL_TXN_DATE&quot;
CHARGEBACK_NREF_ | &quot;CHARGEBACK_NREF_&quot;
EXPIRABLE_AUTH_DIGEST | &quot;EXPIRABLE_AUTH_DIGEST&quot;
LOCAL_TXN_DATE_MID_AMOUNT | &quot;LOCAL_TXN_DATE_MID_AMOUNT&quot;
LOCAL_TXN_DATE_MID_AMOUNT_TIP | &quot;LOCAL_TXN_DATE_MID_AMOUNT_TIP&quot;
MOD_LOCAL_TXN_DATE_MID_AMOUNT_TIP | &quot;MOD_LOCAL_TXN_DATE_MID_AMOUNT_TIP&quot;
MOST_RECENT_CHARGEBACK_TXN | &quot;MOST_RECENT_CHARGEBACK_TXN&quot;
NRID_EXCEPT_PULSE | &quot;NRID_EXCEPT_PULSE&quot;
NRID | &quot;NRID&quot;
NULL_RESULT | &quot;NULL_RESULT&quot;
PULSE_STAN_RRN | &quot;PULSE_STAN_RRN&quot;
RRN_EXCEPT_PULSE | &quot;RRN_EXCEPT_PULSE&quot;
RRN | &quot;RRN&quot;
TXN_TOKEN | &quot;TXN_TOKEN&quot;





# NetworkFeeModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**creditDebit** | [**CreditDebitEnum**](#CreditDebitEnum) | C &#x3D; credit; D &#x3D; debit |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ISSUER_FEE | &quot;ISSUER_FEE&quot;
SWITCH_FEE | &quot;SWITCH_FEE&quot;
PINDEBIT_ASSOC_FEE | &quot;PINDEBIT_ASSOC_FEE&quot;
ACQUIRER_FEE | &quot;ACQUIRER_FEE&quot;
INTERCHANGE_FEE | &quot;INTERCHANGE_FEE&quot;
CUR_CONV_CARDHOLDER_FEE | &quot;CUR_CONV_CARDHOLDER_FEE&quot;
CUR_CONV_ISSUER_FEE | &quot;CUR_CONV_ISSUER_FEE&quot;
CROSS_BORDER_ISSUER_FEE | &quot;CROSS_BORDER_ISSUER_FEE&quot;


<a name="CreditDebitEnum"></a>
## Enum: CreditDebitEnum
Name | Value
---- | -----
C | &quot;C&quot;
D | &quot;D&quot;




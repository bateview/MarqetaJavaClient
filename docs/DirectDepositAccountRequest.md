
# DirectDepositAccountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userToken** | **String** | Required if &#39;business_token&#39; is null |  [optional]
**businessToken** | **String** | Required if &#39;user_token&#39; is null |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**allowImmediateCredit** | **Boolean** |  |  [optional]
**token** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DEPOSIT_ACCOUNT | &quot;DEPOSIT_ACCOUNT&quot;
CHECKING | &quot;CHECKING&quot;
SAVINGS | &quot;SAVINGS&quot;




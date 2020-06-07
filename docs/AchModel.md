
# AchModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**accountNumber** | **String** |  | 
**routingNumber** | **String** |  | 
**nameOnAccount** | **String** |  | 
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**bankName** | **String** |  |  [optional]
**verificationOverride** | **Boolean** |  |  [optional]
**verificationNotes** | **String** |  |  [optional]
**userToken** | **String** | Required if &#39;business_token&#39; is null |  [optional]
**businessToken** | **String** | Required if &#39;user_token&#39; is null |  [optional]
**isDefaultAccount** | **Boolean** |  |  [optional]


<a name="AccountTypeEnum"></a>
## Enum: AccountTypeEnum
Name | Value
---- | -----
CHECKING | &quot;checking&quot;
SAVINGS | &quot;savings&quot;
CORPORATE | &quot;corporate&quot;
LOAN | &quot;loan&quot;




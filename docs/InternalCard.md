
# InternalCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hash** | **String** |  |  [optional]
**kid** | **String** |  |  [optional]
**secureData** | **String** |  |  [optional]
**serviceCode** | **String** |  |  [optional]
**id** | **Long** |  | 
**token** | **String** |  | 
**user** | [**InternalUser**](InternalUser.md) |  | 
**cardProduct** | [**InternalCardProduct**](InternalCardProduct.md) |  | 
**lastFour** | **String** |  | 
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**cardPinBlock** | **String** |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
TERMINATED | &quot;TERMINATED&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;
UNACTIVATED | &quot;UNACTIVATED&quot;




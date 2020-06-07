# VelocityControlsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVelocitycontrols**](VelocityControlsApi.md#getVelocitycontrols) | **GET** /velocitycontrols | Queries velocity controls
[**getVelocitycontrolsToken**](VelocityControlsApi.md#getVelocitycontrolsToken) | **GET** /velocitycontrols/{token} | Returns a specific velocity control
[**getVelocitycontrolsUserUsertokenAvailable**](VelocityControlsApi.md#getVelocitycontrolsUserUsertokenAvailable) | **GET** /velocitycontrols/user/{user_token}/available | Queries a user&#39;s velocity control balances
[**postVelocitycontrols**](VelocityControlsApi.md#postVelocitycontrols) | **POST** /velocitycontrols | Creates a velocity control
[**putVelocitycontrolsToken**](VelocityControlsApi.md#putVelocitycontrolsToken) | **PUT** /velocitycontrols/{token} | Updates a specific velocity control


<a name="getVelocitycontrols"></a>
# **getVelocitycontrols**
> VelocityControlListResponse getVelocitycontrols(cardProduct, user, count, startIndex, fields, sortBy)

Queries velocity controls



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VelocityControlsApi;


VelocityControlsApi apiInstance = new VelocityControlsApi();
String cardProduct = "cardProduct_example"; // String | Card product token. Use \"null\" to get velocity controls that are not associated with any card product.
String user = "user_example"; // String | User token. Use \"null\" to get velocity controls that are not associated with any user.
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    VelocityControlListResponse result = apiInstance.getVelocitycontrols(cardProduct, user, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VelocityControlsApi#getVelocitycontrols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProduct** | **String**| Card product token. Use \&quot;null\&quot; to get velocity controls that are not associated with any card product. | [optional]
 **user** | **String**| User token. Use \&quot;null\&quot; to get velocity controls that are not associated with any user. | [optional]
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**VelocityControlListResponse**](VelocityControlListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVelocitycontrolsToken"></a>
# **getVelocitycontrolsToken**
> VelocityControlResponse getVelocitycontrolsToken(token, fields)

Returns a specific velocity control



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VelocityControlsApi;


VelocityControlsApi apiInstance = new VelocityControlsApi();
String token = "token_example"; // String | Velocity control token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    VelocityControlResponse result = apiInstance.getVelocitycontrolsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VelocityControlsApi#getVelocitycontrolsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Velocity control token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**VelocityControlResponse**](VelocityControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVelocitycontrolsUserUsertokenAvailable"></a>
# **getVelocitycontrolsUserUsertokenAvailable**
> VelocityControlBalanceResponse getVelocitycontrolsUserUsertokenAvailable(userToken, count, startIndex, fields, sortBy, forceDto)

Queries a user&#39;s velocity control balances



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VelocityControlsApi;


VelocityControlsApi apiInstance = new VelocityControlsApi();
String userToken = "userToken_example"; // String | User token
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
String forceDto = "forceDto_example"; // String | 
try {
    VelocityControlBalanceResponse result = apiInstance.getVelocitycontrolsUserUsertokenAvailable(userToken, count, startIndex, fields, sortBy, forceDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VelocityControlsApi#getVelocitycontrolsUserUsertokenAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]
 **forceDto** | **String**|  | [optional]

### Return type

[**VelocityControlBalanceResponse**](VelocityControlBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postVelocitycontrols"></a>
# **postVelocitycontrols**
> VelocityControlResponse postVelocitycontrols(body)

Creates a velocity control



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VelocityControlsApi;


VelocityControlsApi apiInstance = new VelocityControlsApi();
VelocityControlRequest body = new VelocityControlRequest(); // VelocityControlRequest | Velocity control object
try {
    VelocityControlResponse result = apiInstance.postVelocitycontrols(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VelocityControlsApi#postVelocitycontrols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VelocityControlRequest**](VelocityControlRequest.md)| Velocity control object |

### Return type

[**VelocityControlResponse**](VelocityControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putVelocitycontrolsToken"></a>
# **putVelocitycontrolsToken**
> VelocityControlResponse putVelocitycontrolsToken(token, body)

Updates a specific velocity control



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VelocityControlsApi;


VelocityControlsApi apiInstance = new VelocityControlsApi();
String token = "token_example"; // String | Velocity control token
VelocityControlUpdateRequest body = new VelocityControlUpdateRequest(); // VelocityControlUpdateRequest | Velocity control object
try {
    VelocityControlResponse result = apiInstance.putVelocitycontrolsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VelocityControlsApi#putVelocitycontrolsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Velocity control token |
 **body** | [**VelocityControlUpdateRequest**](VelocityControlUpdateRequest.md)| Velocity control object |

### Return type

[**VelocityControlResponse**](VelocityControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


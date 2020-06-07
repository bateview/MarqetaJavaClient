# AuthControlsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthcontrols**](AuthControlsApi.md#getAuthcontrols) | **GET** /authcontrols | Lists all global auth control exceptions for the program
[**getAuthcontrolsExemptmids**](AuthControlsApi.md#getAuthcontrolsExemptmids) | **GET** /authcontrols/exemptmids | Lists all auth control exempted MIDs for the program
[**getAuthcontrolsExemptmidsToken**](AuthControlsApi.md#getAuthcontrolsExemptmidsToken) | **GET** /authcontrols/exemptmids/{token} | Returns a specific auth control exemptmids
[**getAuthcontrolsToken**](AuthControlsApi.md#getAuthcontrolsToken) | **GET** /authcontrols/{token} | Returns a specific auth control exception
[**postAuthcontrols**](AuthControlsApi.md#postAuthcontrols) | **POST** /authcontrols | Creates an auth control exception
[**postAuthcontrolsExemptmids**](AuthControlsApi.md#postAuthcontrolsExemptmids) | **POST** /authcontrols/exemptmids | Creates an auth control for exempting MIDs
[**putAuthcontrolsExemptmidsToken**](AuthControlsApi.md#putAuthcontrolsExemptmidsToken) | **PUT** /authcontrols/exemptmids/{token} | Updates the status an auth control exemptmids
[**putAuthcontrolsToken**](AuthControlsApi.md#putAuthcontrolsToken) | **PUT** /authcontrols/{token} | Updates an auth control exception


<a name="getAuthcontrols"></a>
# **getAuthcontrols**
> AuthControlListResponse getAuthcontrols(cardProduct, user, count, startIndex, fields, sortBy)

Lists all global auth control exceptions for the program



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String cardProduct = "cardProduct_example"; // String | Card product token. Use \"null\" to get auth controls that are not associated with any card product.
String user = "user_example"; // String | User token. Use \"null\" to get auth controls that are not associated with any user.
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    AuthControlListResponse result = apiInstance.getAuthcontrols(cardProduct, user, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#getAuthcontrols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProduct** | **String**| Card product token. Use \&quot;null\&quot; to get auth controls that are not associated with any card product. | [optional]
 **user** | **String**| User token. Use \&quot;null\&quot; to get auth controls that are not associated with any user. | [optional]
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**AuthControlListResponse**](AuthControlListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthcontrolsExemptmids"></a>
# **getAuthcontrolsExemptmids**
> AuthControlExemptMidsListResponse getAuthcontrolsExemptmids(cardProduct, user, count, startIndex, fields, sortBy)

Lists all auth control exempted MIDs for the program



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String cardProduct = "cardProduct_example"; // String | Card product token. Use \"null\" to get auth controls that are not associated with any card product.
String user = "user_example"; // String | User token. Use \"null\" to get auth controls that are not associated with any user.
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    AuthControlExemptMidsListResponse result = apiInstance.getAuthcontrolsExemptmids(cardProduct, user, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#getAuthcontrolsExemptmids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProduct** | **String**| Card product token. Use \&quot;null\&quot; to get auth controls that are not associated with any card product. | [optional]
 **user** | **String**| User token. Use \&quot;null\&quot; to get auth controls that are not associated with any user. | [optional]
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**AuthControlExemptMidsListResponse**](AuthControlExemptMidsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthcontrolsExemptmidsToken"></a>
# **getAuthcontrolsExemptmidsToken**
> AuthControlExemptMidsResponse getAuthcontrolsExemptmidsToken(token)

Returns a specific auth control exemptmids



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String token = "token_example"; // String | Auth control token
try {
    AuthControlExemptMidsResponse result = apiInstance.getAuthcontrolsExemptmidsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#getAuthcontrolsExemptmidsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Auth control token |

### Return type

[**AuthControlExemptMidsResponse**](AuthControlExemptMidsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthcontrolsToken"></a>
# **getAuthcontrolsToken**
> AuthControlResponse getAuthcontrolsToken(token, fields)

Returns a specific auth control exception



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String token = "token_example"; // String | Auth control token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    AuthControlResponse result = apiInstance.getAuthcontrolsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#getAuthcontrolsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Auth control token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**AuthControlResponse**](AuthControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAuthcontrols"></a>
# **postAuthcontrols**
> AuthControlResponse postAuthcontrols(body)

Creates an auth control exception



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
AuthControlRequest body = new AuthControlRequest(); // AuthControlRequest | Auth control object
try {
    AuthControlResponse result = apiInstance.postAuthcontrols(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#postAuthcontrols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthControlRequest**](AuthControlRequest.md)| Auth control object |

### Return type

[**AuthControlResponse**](AuthControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAuthcontrolsExemptmids"></a>
# **postAuthcontrolsExemptmids**
> AuthControlExemptMidsResponse postAuthcontrolsExemptmids(body)

Creates an auth control for exempting MIDs



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
AuthControlExemptMidsRequest body = new AuthControlExemptMidsRequest(); // AuthControlExemptMidsRequest | Auth control exempt MID object
try {
    AuthControlExemptMidsResponse result = apiInstance.postAuthcontrolsExemptmids(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#postAuthcontrolsExemptmids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthControlExemptMidsRequest**](AuthControlExemptMidsRequest.md)| Auth control exempt MID object |

### Return type

[**AuthControlExemptMidsResponse**](AuthControlExemptMidsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAuthcontrolsExemptmidsToken"></a>
# **putAuthcontrolsExemptmidsToken**
> putAuthcontrolsExemptmidsToken(token, body)

Updates the status an auth control exemptmids



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String token = "token_example"; // String | Auth control token
AuthControlExemptMidsUpdateRequest body = new AuthControlExemptMidsUpdateRequest(); // AuthControlExemptMidsUpdateRequest | 
try {
    apiInstance.putAuthcontrolsExemptmidsToken(token, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#putAuthcontrolsExemptmidsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Auth control token |
 **body** | [**AuthControlExemptMidsUpdateRequest**](AuthControlExemptMidsUpdateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAuthcontrolsToken"></a>
# **putAuthcontrolsToken**
> AuthControlResponse putAuthcontrolsToken(token, body)

Updates an auth control exception



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthControlsApi;


AuthControlsApi apiInstance = new AuthControlsApi();
String token = "token_example"; // String | Auth control token
AuthControlUpdateRequest body = new AuthControlUpdateRequest(); // AuthControlUpdateRequest | Auth control object
try {
    AuthControlResponse result = apiInstance.putAuthcontrolsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthControlsApi#putAuthcontrolsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Auth control token |
 **body** | [**AuthControlUpdateRequest**](AuthControlUpdateRequest.md)| Auth control object |

### Return type

[**AuthControlResponse**](AuthControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


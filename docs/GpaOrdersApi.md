# GpaOrdersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGpaordersToken**](GpaOrdersApi.md#getGpaordersToken) | **GET** /gpaorders/{token} | Returns a GPA order
[**getGpaordersUnloads**](GpaOrdersApi.md#getGpaordersUnloads) | **GET** /gpaorders/unloads | Lists all GPA returns
[**getGpaordersUnloadsUnloadtoken**](GpaOrdersApi.md#getGpaordersUnloadsUnloadtoken) | **GET** /gpaorders/unloads/{unload_token} | Returns a specific GPA return
[**postGpaorders**](GpaOrdersApi.md#postGpaorders) | **POST** /gpaorders | Funds a user&#39;s GPA account
[**postGpaordersUnloads**](GpaOrdersApi.md#postGpaordersUnloads) | **POST** /gpaorders/unloads | Returns a GPA order


<a name="getGpaordersToken"></a>
# **getGpaordersToken**
> GpaResponse getGpaordersToken(token)

Returns a GPA order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GpaOrdersApi;


GpaOrdersApi apiInstance = new GpaOrdersApi();
String token = "token_example"; // String | 
try {
    GpaResponse result = apiInstance.getGpaordersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GpaOrdersApi#getGpaordersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**GpaResponse**](GpaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGpaordersUnloads"></a>
# **getGpaordersUnloads**
> GPAUnloadListResponse getGpaordersUnloads(count, startIndex, fields, sortBy, userToken, businessToken, originalOrderToken)

Lists all GPA returns



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GpaOrdersApi;


GpaOrdersApi apiInstance = new GpaOrdersApi();
Integer count = 5; // Integer | Number of GPA unloads to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String originalOrderToken = "originalOrderToken_example"; // String | Original order token
try {
    GPAUnloadListResponse result = apiInstance.getGpaordersUnloads(count, startIndex, fields, sortBy, userToken, businessToken, originalOrderToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GpaOrdersApi#getGpaordersUnloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of GPA unloads to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **originalOrderToken** | **String**| Original order token | [optional]

### Return type

[**GPAUnloadListResponse**](GPAUnloadListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGpaordersUnloadsUnloadtoken"></a>
# **getGpaordersUnloadsUnloadtoken**
> GpaReturns getGpaordersUnloadsUnloadtoken(unloadToken)

Returns a specific GPA return



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GpaOrdersApi;


GpaOrdersApi apiInstance = new GpaOrdersApi();
String unloadToken = "unloadToken_example"; // String | Unload token
try {
    GpaReturns result = apiInstance.getGpaordersUnloadsUnloadtoken(unloadToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GpaOrdersApi#getGpaordersUnloadsUnloadtoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unloadToken** | **String**| Unload token |

### Return type

[**GpaReturns**](GpaReturns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postGpaorders"></a>
# **postGpaorders**
> GpaResponse postGpaorders(body)

Funds a user&#39;s GPA account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GpaOrdersApi;


GpaOrdersApi apiInstance = new GpaOrdersApi();
GpaRequest body = new GpaRequest(); // GpaRequest | 
try {
    GpaResponse result = apiInstance.postGpaorders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GpaOrdersApi#postGpaorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GpaRequest**](GpaRequest.md)|  | [optional]

### Return type

[**GpaResponse**](GpaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGpaordersUnloads"></a>
# **postGpaordersUnloads**
> GpaReturns postGpaordersUnloads(body)

Returns a GPA order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GpaOrdersApi;


GpaOrdersApi apiInstance = new GpaOrdersApi();
UnloadRequestModel body = new UnloadRequestModel(); // UnloadRequestModel | 
try {
    GpaReturns result = apiInstance.postGpaordersUnloads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GpaOrdersApi#postGpaordersUnloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UnloadRequestModel**](UnloadRequestModel.md)|  | [optional]

### Return type

[**GpaReturns**](GpaReturns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


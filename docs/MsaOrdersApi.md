# MsaOrdersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMsaordersToken**](MsaOrdersApi.md#getMsaordersToken) | **GET** /msaorders/{token} | Returns an MSA order 
[**getMsaordersUnloads**](MsaOrdersApi.md#getMsaordersUnloads) | **GET** /msaorders/unloads | Lists all MSA unloads
[**getMsaordersUnloadsUnloadtoken**](MsaOrdersApi.md#getMsaordersUnloadsUnloadtoken) | **GET** /msaorders/unloads/{unload_token} | Returns a specific MSA unload
[**postMsaorders**](MsaOrdersApi.md#postMsaorders) | **POST** /msaorders | Creates a merchant-specific account order
[**postMsaordersUnloads**](MsaOrdersApi.md#postMsaordersUnloads) | **POST** /msaorders/unloads | Returns an MSA order
[**putMsaordersToken**](MsaOrdersApi.md#putMsaordersToken) | **PUT** /msaorders/{token} | Updates a specific merchant-specific account order


<a name="getMsaordersToken"></a>
# **getMsaordersToken**
> MsaOrderResponse getMsaordersToken(token)

Returns an MSA order 



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
String token = "token_example"; // String | Order token
try {
    MsaOrderResponse result = apiInstance.getMsaordersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#getMsaordersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Order token |

### Return type

[**MsaOrderResponse**](MsaOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMsaordersUnloads"></a>
# **getMsaordersUnloads**
> MSAUnloadListResponse getMsaordersUnloads(count, startIndex, sortBy, userToken, businessToken, originalOrderToken)

Lists all MSA unloads



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
Integer count = 5; // Integer | Number of MSA unloads to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-lastModifiedTime"; // String | Sort order
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String originalOrderToken = "originalOrderToken_example"; // String | Original order token
try {
    MSAUnloadListResponse result = apiInstance.getMsaordersUnloads(count, startIndex, sortBy, userToken, businessToken, originalOrderToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#getMsaordersUnloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of MSA unloads to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **originalOrderToken** | **String**| Original order token | [optional]

### Return type

[**MSAUnloadListResponse**](MSAUnloadListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMsaordersUnloadsUnloadtoken"></a>
# **getMsaordersUnloadsUnloadtoken**
> MsaReturns getMsaordersUnloadsUnloadtoken(unloadToken)

Returns a specific MSA unload



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
String unloadToken = "unloadToken_example"; // String | Unload token
try {
    MsaReturns result = apiInstance.getMsaordersUnloadsUnloadtoken(unloadToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#getMsaordersUnloadsUnloadtoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unloadToken** | **String**| Unload token |

### Return type

[**MsaReturns**](MsaReturns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMsaorders"></a>
# **postMsaorders**
> MsaOrderResponse postMsaorders(body)

Creates a merchant-specific account order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
MsaOrderRequest body = new MsaOrderRequest(); // MsaOrderRequest | 
try {
    MsaOrderResponse result = apiInstance.postMsaorders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#postMsaorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MsaOrderRequest**](MsaOrderRequest.md)|  | [optional]

### Return type

[**MsaOrderResponse**](MsaOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMsaordersUnloads"></a>
# **postMsaordersUnloads**
> MsaReturns postMsaordersUnloads(body)

Returns an MSA order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
MsaUnloadRequestModel body = new MsaUnloadRequestModel(); // MsaUnloadRequestModel | 
try {
    MsaReturns result = apiInstance.postMsaordersUnloads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#postMsaordersUnloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MsaUnloadRequestModel**](MsaUnloadRequestModel.md)|  | [optional]

### Return type

[**MsaReturns**](MsaReturns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMsaordersToken"></a>
# **putMsaordersToken**
> MsaOrderResponse putMsaordersToken(token, body)

Updates a specific merchant-specific account order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MsaOrdersApi;


MsaOrdersApi apiInstance = new MsaOrdersApi();
String token = "token_example"; // String | Order token
MsaOrderUpdateRequest body = new MsaOrderUpdateRequest(); // MsaOrderUpdateRequest | 
try {
    MsaOrderResponse result = apiInstance.putMsaordersToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MsaOrdersApi#putMsaordersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Order token |
 **body** | [**MsaOrderUpdateRequest**](MsaOrderUpdateRequest.md)|  | [optional]

### Return type

[**MsaOrderResponse**](MsaOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


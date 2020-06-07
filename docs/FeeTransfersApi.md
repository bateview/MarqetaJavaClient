# FeeTransfersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeetransfersToken**](FeeTransfersApi.md#getFeetransfersToken) | **GET** /feetransfers/{token} | Returns a fee transfer
[**postFeetransfers**](FeeTransfersApi.md#postFeetransfers) | **POST** /feetransfers | Creates a fee transfer


<a name="getFeetransfersToken"></a>
# **getFeetransfersToken**
> FeeTransferResponse getFeetransfersToken(token)

Returns a fee transfer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeeTransfersApi;


FeeTransfersApi apiInstance = new FeeTransfersApi();
String token = "token_example"; // String | 
try {
    FeeTransferResponse result = apiInstance.getFeetransfersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeeTransfersApi#getFeetransfersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**FeeTransferResponse**](FeeTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postFeetransfers"></a>
# **postFeetransfers**
> FeeTransferResponse postFeetransfers(body)

Creates a fee transfer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeeTransfersApi;


FeeTransfersApi apiInstance = new FeeTransfersApi();
FeeTransferRequest body = new FeeTransferRequest(); // FeeTransferRequest | 
try {
    FeeTransferResponse result = apiInstance.postFeetransfers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeeTransfersApi#postFeetransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FeeTransferRequest**](FeeTransferRequest.md)|  | [optional]

### Return type

[**FeeTransferResponse**](FeeTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


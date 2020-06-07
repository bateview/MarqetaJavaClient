# PingApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPing**](PingApi.md#getPing) | **GET** /ping | Returns a heartbeat to the consumer
[**postPing**](PingApi.md#postPing) | **POST** /ping | Echo test for sending payload to server


<a name="getPing"></a>
# **getPing**
> PingResponse getPing()

Returns a heartbeat to the consumer

Tests if the Marqeta server is available and responsive.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PingApi;


PingApi apiInstance = new PingApi();
try {
    PingResponse result = apiInstance.getPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PingApi#getPing");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postPing"></a>
# **postPing**
> EchoPingResponse postPing(body)

Echo test for sending payload to server



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PingApi;


PingApi apiInstance = new PingApi();
EchoPingRequest body = new EchoPingRequest(); // EchoPingRequest | 
try {
    EchoPingResponse result = apiInstance.postPing(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PingApi#postPing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EchoPingRequest**](EchoPingRequest.md)|  | [optional]

### Return type

[**EchoPingResponse**](EchoPingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


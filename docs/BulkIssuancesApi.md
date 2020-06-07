# BulkIssuancesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkissuances**](BulkIssuancesApi.md#getBulkissuances) | **GET** /bulkissuances | Lists all bulk issuance requests
[**getBulkissuancesToken**](BulkIssuancesApi.md#getBulkissuancesToken) | **GET** /bulkissuances/{token} | Returns a bulk issuance request
[**postBulkissuances**](BulkIssuancesApi.md#postBulkissuances) | **POST** /bulkissuances | Creates a bulk issuance request for cards


<a name="getBulkissuances"></a>
# **getBulkissuances**
> BulkCardOrderListResponse getBulkissuances(count, startIndex, sortBy)

Lists all bulk issuance requests



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BulkIssuancesApi;


BulkIssuancesApi apiInstance = new BulkIssuancesApi();
Integer count = 5; // Integer | Number of requests to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    BulkCardOrderListResponse result = apiInstance.getBulkissuances(count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkIssuancesApi#getBulkissuances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of requests to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**BulkCardOrderListResponse**](BulkCardOrderListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkissuancesToken"></a>
# **getBulkissuancesToken**
> BulkIssuanceResponse getBulkissuancesToken(token)

Returns a bulk issuance request



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BulkIssuancesApi;


BulkIssuancesApi apiInstance = new BulkIssuancesApi();
String token = "token_example"; // String | Bulk issuance token
try {
    BulkIssuanceResponse result = apiInstance.getBulkissuancesToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkIssuancesApi#getBulkissuancesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Bulk issuance token |

### Return type

[**BulkIssuanceResponse**](BulkIssuanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBulkissuances"></a>
# **postBulkissuances**
> BulkIssuanceResponse postBulkissuances(body)

Creates a bulk issuance request for cards



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BulkIssuancesApi;


BulkIssuancesApi apiInstance = new BulkIssuancesApi();
BulkIssuanceRequest body = new BulkIssuanceRequest(); // BulkIssuanceRequest | 
try {
    BulkIssuanceResponse result = apiInstance.postBulkissuances(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkIssuancesApi#postBulkissuances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkIssuanceRequest**](BulkIssuanceRequest.md)|  | [optional]

### Return type

[**BulkIssuanceResponse**](BulkIssuanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# FeesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFees**](FeesApi.md#getFees) | **GET** /fees | Lists all fees
[**getFeesToken**](FeesApi.md#getFeesToken) | **GET** /fees/{token} | Returns a specific fee
[**postFees**](FeesApi.md#postFees) | **POST** /fees | Creates a fee
[**putFeesToken**](FeesApi.md#putFeesToken) | **PUT** /fees/{token} | Updates a specific fee


<a name="getFees"></a>
# **getFees**
> Fee getFees(count, startIndex, fields, sortBy)

Lists all fees



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeesApi;


FeesApi apiInstance = new FeesApi();
Integer count = 5; // Integer | Number of fees to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    Fee result = apiInstance.getFees(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeesApi#getFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of fees to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**Fee**](Fee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeesToken"></a>
# **getFeesToken**
> Fee getFeesToken(token)

Returns a specific fee



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeesApi;


FeesApi apiInstance = new FeesApi();
String token = "token_example"; // String | Fee token
try {
    Fee result = apiInstance.getFeesToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeesApi#getFeesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Fee token |

### Return type

[**Fee**](Fee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postFees"></a>
# **postFees**
> Fee postFees(body)

Creates a fee



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeesApi;


FeesApi apiInstance = new FeesApi();
FeeRequest body = new FeeRequest(); // FeeRequest | 
try {
    Fee result = apiInstance.postFees(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeesApi#postFees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FeeRequest**](FeeRequest.md)|  | [optional]

### Return type

[**Fee**](Fee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFeesToken"></a>
# **putFeesToken**
> Fee putFeesToken(token, body)

Updates a specific fee



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FeesApi;


FeesApi apiInstance = new FeesApi();
String token = "token_example"; // String | Fee token
FeeUpdateRequest body = new FeeUpdateRequest(); // FeeUpdateRequest | 
try {
    Fee result = apiInstance.putFeesToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeesApi#putFeesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Fee token |
 **body** | [**FeeUpdateRequest**](FeeUpdateRequest.md)|  | [optional]

### Return type

[**Fee**](Fee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# BusinessTransitionsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinesstransitionsBusinessBusinesstoken**](BusinessTransitionsApi.md#getBusinesstransitionsBusinessBusinesstoken) | **GET** /businesstransitions/business/{business_token} | Returns transitions for a given business
[**getBusinesstransitionsToken**](BusinessTransitionsApi.md#getBusinesstransitionsToken) | **GET** /businesstransitions/{token} | Returns a business transition
[**postBusinesstransitions**](BusinessTransitionsApi.md#postBusinesstransitions) | **POST** /businesstransitions | Creates a business transition


<a name="getBusinesstransitionsBusinessBusinesstoken"></a>
# **getBusinesstransitionsBusinessBusinesstoken**
> BusinessTransitionListResponse getBusinesstransitionsBusinessBusinesstoken(businessToken, count, startIndex, fields, sortBy)

Returns transitions for a given business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessTransitionsApi;


BusinessTransitionsApi apiInstance = new BusinessTransitionsApi();
String businessToken = "businessToken_example"; // String | Business token
Integer count = 5; // Integer | Number of business transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-id"; // String | Sort order
try {
    BusinessTransitionListResponse result = apiInstance.getBusinesstransitionsBusinessBusinesstoken(businessToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransitionsApi#getBusinesstransitionsBusinessBusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessToken** | **String**| Business token |
 **count** | **Integer**| Number of business transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -id]

### Return type

[**BusinessTransitionListResponse**](BusinessTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBusinesstransitionsToken"></a>
# **getBusinesstransitionsToken**
> BusinessTransitionResponse getBusinesstransitionsToken(token, fields)

Returns a business transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessTransitionsApi;


BusinessTransitionsApi apiInstance = new BusinessTransitionsApi();
String token = "token_example"; // String | Transition token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    BusinessTransitionResponse result = apiInstance.getBusinesstransitionsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransitionsApi#getBusinesstransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Transition token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**BusinessTransitionResponse**](BusinessTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBusinesstransitions"></a>
# **postBusinesstransitions**
> BusinessTransitionResponse postBusinesstransitions(body)

Creates a business transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessTransitionsApi;


BusinessTransitionsApi apiInstance = new BusinessTransitionsApi();
BusinessTransitionRequest body = new BusinessTransitionRequest(); // BusinessTransitionRequest | 
try {
    BusinessTransitionResponse result = apiInstance.postBusinesstransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessTransitionsApi#postBusinesstransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessTransitionRequest**](BusinessTransitionRequest.md)|  | [optional]

### Return type

[**BusinessTransitionResponse**](BusinessTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


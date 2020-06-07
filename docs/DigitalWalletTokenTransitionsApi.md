# DigitalWalletTokenTransitionsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDigitalwallettokentransitionsDigitalwallettokenToken**](DigitalWalletTokenTransitionsApi.md#getDigitalwallettokentransitionsDigitalwallettokenToken) | **GET** /digitalwallettokentransitions/digitalwallettoken/{token} | Lists all digital wallet token transitions
[**getDigitalwallettokentransitionsToken**](DigitalWalletTokenTransitionsApi.md#getDigitalwallettokentransitionsToken) | **GET** /digitalwallettokentransitions/{token} | Returns a digital wallet transition object
[**postDigitalwallettokentransitions**](DigitalWalletTokenTransitionsApi.md#postDigitalwallettokentransitions) | **POST** /digitalwallettokentransitions | Creates a digital wallet token transition


<a name="getDigitalwallettokentransitionsDigitalwallettokenToken"></a>
# **getDigitalwallettokentransitionsDigitalwallettokenToken**
> DigitalWalletTokenTransitionListResponse getDigitalwallettokentransitionsDigitalwallettokenToken(token, count, startIndex, fields, sortBy)

Lists all digital wallet token transitions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokenTransitionsApi;


DigitalWalletTokenTransitionsApi apiInstance = new DigitalWalletTokenTransitionsApi();
String token = "token_example"; // String | Digital wallet token
Integer count = 5; // Integer | Number of digital wallet transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-id"; // String | Sort order
try {
    DigitalWalletTokenTransitionListResponse result = apiInstance.getDigitalwallettokentransitionsDigitalwallettokenToken(token, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokenTransitionsApi#getDigitalwallettokentransitionsDigitalwallettokenToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Digital wallet token |
 **count** | **Integer**| Number of digital wallet transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -id]

### Return type

[**DigitalWalletTokenTransitionListResponse**](DigitalWalletTokenTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalwallettokentransitionsToken"></a>
# **getDigitalwallettokentransitionsToken**
> DigitalWalletTokenTransitionResponse getDigitalwallettokentransitionsToken(token, fields)

Returns a digital wallet transition object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokenTransitionsApi;


DigitalWalletTokenTransitionsApi apiInstance = new DigitalWalletTokenTransitionsApi();
String token = "token_example"; // String | Digital wallet transition token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    DigitalWalletTokenTransitionResponse result = apiInstance.getDigitalwallettokentransitionsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokenTransitionsApi#getDigitalwallettokentransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Digital wallet transition token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**DigitalWalletTokenTransitionResponse**](DigitalWalletTokenTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDigitalwallettokentransitions"></a>
# **postDigitalwallettokentransitions**
> DigitalWalletTokenTransitionResponse postDigitalwallettokentransitions(body)

Creates a digital wallet token transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokenTransitionsApi;


DigitalWalletTokenTransitionsApi apiInstance = new DigitalWalletTokenTransitionsApi();
DigitalWalletTokenTransitionRequest body = new DigitalWalletTokenTransitionRequest(); // DigitalWalletTokenTransitionRequest | 
try {
    DigitalWalletTokenTransitionResponse result = apiInstance.postDigitalwallettokentransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokenTransitionsApi#postDigitalwallettokentransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DigitalWalletTokenTransitionRequest**](DigitalWalletTokenTransitionRequest.md)|  | [optional]

### Return type

[**DigitalWalletTokenTransitionResponse**](DigitalWalletTokenTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


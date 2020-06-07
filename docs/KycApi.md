# KycApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getKycBusinessBusinesstoken**](KycApi.md#getKycBusinessBusinesstoken) | **GET** /kyc/business/{business_token} | Lists all KYC results for a business
[**getKycToken**](KycApi.md#getKycToken) | **GET** /kyc/{token} | Returns a specific KYC result
[**getKycUserUsertoken**](KycApi.md#getKycUserUsertoken) | **GET** /kyc/user/{user_token} | Lists all KYC results for a user
[**postKyc**](KycApi.md#postKyc) | **POST** /kyc | Performs a KYC
[**putKycToken**](KycApi.md#putKycToken) | **PUT** /kyc/{token} | Accepts KYC answers for questions from initial request


<a name="getKycBusinessBusinesstoken"></a>
# **getKycBusinessBusinesstoken**
> KYCListResponse getKycBusinessBusinesstoken(businessToken, count, startIndex, fields, sortBy)

Lists all KYC results for a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KycApi;


KycApi apiInstance = new KycApi();
String businessToken = "businessToken_example"; // String | Business token
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    KYCListResponse result = apiInstance.getKycBusinessBusinesstoken(businessToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#getKycBusinessBusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessToken** | **String**| Business token |
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**KYCListResponse**](KYCListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKycToken"></a>
# **getKycToken**
> KycResponse getKycToken(token)

Returns a specific KYC result



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KycApi;


KycApi apiInstance = new KycApi();
String token = "token_example"; // String | KYC token
try {
    KycResponse result = apiInstance.getKycToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#getKycToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| KYC token |

### Return type

[**KycResponse**](KycResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKycUserUsertoken"></a>
# **getKycUserUsertoken**
> KYCListResponse getKycUserUsertoken(userToken, count, startIndex, fields, sortBy)

Lists all KYC results for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KycApi;


KycApi apiInstance = new KycApi();
String userToken = "userToken_example"; // String | User token
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    KYCListResponse result = apiInstance.getKycUserUsertoken(userToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#getKycUserUsertoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**KYCListResponse**](KYCListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postKyc"></a>
# **postKyc**
> KycResponse postKyc(body)

Performs a KYC



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KycApi;


KycApi apiInstance = new KycApi();
KycRequest body = new KycRequest(); // KycRequest | 
try {
    KycResponse result = apiInstance.postKyc(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#postKyc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KycRequest**](KycRequest.md)|  | [optional]

### Return type

[**KycResponse**](KycResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putKycToken"></a>
# **putKycToken**
> KycResponse putKycToken(token, body)

Accepts KYC answers for questions from initial request



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.KycApi;


KycApi apiInstance = new KycApi();
String token = "token_example"; // String | KYC token
KYCSubmitAnswersRequestModel body = new KYCSubmitAnswersRequestModel(); // KYCSubmitAnswersRequestModel | 
try {
    KycResponse result = apiInstance.putKycToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KycApi#putKycToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| KYC token |
 **body** | [**KYCSubmitAnswersRequestModel**](KYCSubmitAnswersRequestModel.md)|  | [optional]

### Return type

[**KycResponse**](KycResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


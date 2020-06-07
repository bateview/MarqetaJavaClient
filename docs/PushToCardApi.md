# PushToCardApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPushtocardsDisburse**](PushToCardApi.md#getPushtocardsDisburse) | **GET** /pushtocards/disburse | Lists all push-to-card disbursements
[**getPushtocardsDisburseToken**](PushToCardApi.md#getPushtocardsDisburseToken) | **GET** /pushtocards/disburse/{token} | Returns a specific push-to-card disbursement
[**getPushtocardsPaymentcard**](PushToCardApi.md#getPushtocardsPaymentcard) | **GET** /pushtocards/paymentcard | Returns all push-to-card payment card details
[**getPushtocardsPaymentcardToken**](PushToCardApi.md#getPushtocardsPaymentcardToken) | **GET** /pushtocards/paymentcard/{token} | Returns a specific paymentcard object
[**postPushtocardsDisburse**](PushToCardApi.md#postPushtocardsDisburse) | **POST** /pushtocards/disburse | Initiates a push-to-card money disbursement
[**postPushtocardsPaymentcard**](PushToCardApi.md#postPushtocardsPaymentcard) | **POST** /pushtocards/paymentcard | Adds an external card to which funds will be pushed


<a name="getPushtocardsDisburse"></a>
# **getPushtocardsDisburse**
> PushToCardDisburseListResponse getPushtocardsDisburse(count, fields, startIndex, sortBy)

Lists all push-to-card disbursements



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
Integer count = 10; // Integer | Number of push-to-card disbursements to retrieve
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    PushToCardDisburseListResponse result = apiInstance.getPushtocardsDisburse(count, fields, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#getPushtocardsDisburse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of push-to-card disbursements to retrieve | [optional] [default to 10]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**PushToCardDisburseListResponse**](PushToCardDisburseListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPushtocardsDisburseToken"></a>
# **getPushtocardsDisburseToken**
> PushToCardDisbursementResponse getPushtocardsDisburseToken(token, fields)

Returns a specific push-to-card disbursement



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
String token = "token_example"; // String | Push-to-card disbursement token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    PushToCardDisbursementResponse result = apiInstance.getPushtocardsDisburseToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#getPushtocardsDisburseToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Push-to-card disbursement token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**PushToCardDisbursementResponse**](PushToCardDisbursementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPushtocardsPaymentcard"></a>
# **getPushtocardsPaymentcard**
> PushToCardListResponse getPushtocardsPaymentcard(userToken, count, fields, startIndex, sortBy)

Returns all push-to-card payment card details



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
String userToken = "userToken_example"; // String | User token
Integer count = 10; // Integer | Number of push-to-card payment cards to retrieve
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    PushToCardListResponse result = apiInstance.getPushtocardsPaymentcard(userToken, count, fields, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#getPushtocardsPaymentcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **count** | **Integer**| Number of push-to-card payment cards to retrieve | [optional] [default to 10]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**PushToCardListResponse**](PushToCardListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPushtocardsPaymentcardToken"></a>
# **getPushtocardsPaymentcardToken**
> PushToCardResponse getPushtocardsPaymentcardToken(token, fields)

Returns a specific paymentcard object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
String token = "token_example"; // String | Push-to-card token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    PushToCardResponse result = apiInstance.getPushtocardsPaymentcardToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#getPushtocardsPaymentcardToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Push-to-card token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**PushToCardResponse**](PushToCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPushtocardsDisburse"></a>
# **postPushtocardsDisburse**
> PushToCardDisbursementResponse postPushtocardsDisburse(body)

Initiates a push-to-card money disbursement



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
PushToCardDisburseRequest body = new PushToCardDisburseRequest(); // PushToCardDisburseRequest | 
try {
    PushToCardDisbursementResponse result = apiInstance.postPushtocardsDisburse(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#postPushtocardsDisburse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushToCardDisburseRequest**](PushToCardDisburseRequest.md)|  | [optional]

### Return type

[**PushToCardDisbursementResponse**](PushToCardDisbursementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPushtocardsPaymentcard"></a>
# **postPushtocardsPaymentcard**
> PushToCardResponse postPushtocardsPaymentcard(body)

Adds an external card to which funds will be pushed



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PushToCardApi;


PushToCardApi apiInstance = new PushToCardApi();
PushToCardRequest body = new PushToCardRequest(); // PushToCardRequest | 
try {
    PushToCardResponse result = apiInstance.postPushtocardsPaymentcard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushToCardApi#postPushtocardsPaymentcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushToCardRequest**](PushToCardRequest.md)|  | [optional]

### Return type

[**PushToCardResponse**](PushToCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


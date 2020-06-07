# PeerTransfersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeertransfersToken**](PeerTransfersApi.md#getPeertransfersToken) | **GET** /peertransfers/{token} | Returns details of a previous transfer
[**getPeertransfersUserUserorbusinesstoken**](PeerTransfersApi.md#getPeertransfersUserUserorbusinesstoken) | **GET** /peertransfers/user/{user_or_business_token} | Returns all peer transfers for a user
[**getPeertransfersUserUserorbusinesstokenRecipient**](PeerTransfersApi.md#getPeertransfersUserUserorbusinesstokenRecipient) | **GET** /peertransfers/user/{user_or_business_token}/recipient | Returns received peer transfers for a user
[**getPeertransfersUserUserorbusinesstokenSender**](PeerTransfersApi.md#getPeertransfersUserUserorbusinesstokenSender) | **GET** /peertransfers/user/{user_or_business_token}/sender | Returns sent peer transfers for a user
[**postPeertransfers**](PeerTransfersApi.md#postPeertransfers) | **POST** /peertransfers | Performs a peer transfer from one user to another


<a name="getPeertransfersToken"></a>
# **getPeertransfersToken**
> PeerTransferResponse getPeertransfersToken(token)

Returns details of a previous transfer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeerTransfersApi;


PeerTransfersApi apiInstance = new PeerTransfersApi();
String token = "token_example"; // String | 
try {
    PeerTransferResponse result = apiInstance.getPeertransfersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeerTransfersApi#getPeertransfersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**PeerTransferResponse**](PeerTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeertransfersUserUserorbusinesstoken"></a>
# **getPeertransfersUserUserorbusinesstoken**
> PeerTransferResponse getPeertransfersUserUserorbusinesstoken(userOrBusinessToken, count, startIndex, fields)

Returns all peer transfers for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeerTransfersApi;


PeerTransfersApi apiInstance = new PeerTransfersApi();
String userOrBusinessToken = "userOrBusinessToken_example"; // String | User or business token
Integer count = 25; // Integer | Number of transfers to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    PeerTransferResponse result = apiInstance.getPeertransfersUserUserorbusinesstoken(userOrBusinessToken, count, startIndex, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeerTransfersApi#getPeertransfersUserUserorbusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOrBusinessToken** | **String**| User or business token |
 **count** | **Integer**| Number of transfers to retrieve | [optional] [default to 25]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**PeerTransferResponse**](PeerTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeertransfersUserUserorbusinesstokenRecipient"></a>
# **getPeertransfersUserUserorbusinesstokenRecipient**
> PeerTransferResponse getPeertransfersUserUserorbusinesstokenRecipient(userOrBusinessToken, count, startIndex, fields)

Returns received peer transfers for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeerTransfersApi;


PeerTransfersApi apiInstance = new PeerTransfersApi();
String userOrBusinessToken = "userOrBusinessToken_example"; // String | User or business token
Integer count = 25; // Integer | Number of transfers to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    PeerTransferResponse result = apiInstance.getPeertransfersUserUserorbusinesstokenRecipient(userOrBusinessToken, count, startIndex, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeerTransfersApi#getPeertransfersUserUserorbusinesstokenRecipient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOrBusinessToken** | **String**| User or business token |
 **count** | **Integer**| Number of transfers to retrieve | [optional] [default to 25]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**PeerTransferResponse**](PeerTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPeertransfersUserUserorbusinesstokenSender"></a>
# **getPeertransfersUserUserorbusinesstokenSender**
> PeerTransferResponse getPeertransfersUserUserorbusinesstokenSender(userOrBusinessToken, count, startIndex, fields)

Returns sent peer transfers for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeerTransfersApi;


PeerTransfersApi apiInstance = new PeerTransfersApi();
String userOrBusinessToken = "userOrBusinessToken_example"; // String | User or business token
Integer count = 25; // Integer | Number of transfers to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    PeerTransferResponse result = apiInstance.getPeertransfersUserUserorbusinesstokenSender(userOrBusinessToken, count, startIndex, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeerTransfersApi#getPeertransfersUserUserorbusinesstokenSender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOrBusinessToken** | **String**| User or business token |
 **count** | **Integer**| Number of transfers to retrieve | [optional] [default to 25]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**PeerTransferResponse**](PeerTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postPeertransfers"></a>
# **postPeertransfers**
> PeerTransferResponse postPeertransfers(body)

Performs a peer transfer from one user to another



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PeerTransfersApi;


PeerTransfersApi apiInstance = new PeerTransfersApi();
PeerTransferRequest body = new PeerTransferRequest(); // PeerTransferRequest | 
try {
    PeerTransferResponse result = apiInstance.postPeertransfers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PeerTransfersApi#postPeertransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PeerTransferRequest**](PeerTransferRequest.md)|  | [optional]

### Return type

[**PeerTransferResponse**](PeerTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ProgramTransfersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProgramtransfers**](ProgramTransfersApi.md#getProgramtransfers) | **GET** /programtransfers | Lists all program transfers
[**getProgramtransfersToken**](ProgramTransfersApi.md#getProgramtransfersToken) | **GET** /programtransfers/{token} | Returns a specific program transfer
[**getProgramtransfersTypes**](ProgramTransfersApi.md#getProgramtransfersTypes) | **GET** /programtransfers/types | Lists all program transfer types
[**getProgramtransfersTypesTypetoken**](ProgramTransfersApi.md#getProgramtransfersTypesTypetoken) | **GET** /programtransfers/types/{type_token} | Returns a specific program transfer type
[**postProgramtransfers**](ProgramTransfersApi.md#postProgramtransfers) | **POST** /programtransfers | Transfers to a program funding source
[**postProgramtransfersTypes**](ProgramTransfersApi.md#postProgramtransfersTypes) | **POST** /programtransfers/types | Creates a program transfer type
[**putProgramtransfersTypesTypetoken**](ProgramTransfersApi.md#putProgramtransfersTypesTypetoken) | **PUT** /programtransfers/types/{type_token} | Updates a specific program transfer type


<a name="getProgramtransfers"></a>
# **getProgramtransfers**
> ProgramTransferListResponse getProgramtransfers(count, startIndex, fields, sortBy, userToken, businessToken, typeToken)

Lists all program transfers



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
Integer count = 5; // Integer | Number of program transfers to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String typeToken = "typeToken_example"; // String | Program type token
try {
    ProgramTransferListResponse result = apiInstance.getProgramtransfers(count, startIndex, fields, sortBy, userToken, businessToken, typeToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#getProgramtransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of program transfers to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **typeToken** | **String**| Program type token | [optional]

### Return type

[**ProgramTransferListResponse**](ProgramTransferListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProgramtransfersToken"></a>
# **getProgramtransfersToken**
> ProgramTransferResponse getProgramtransfersToken(token)

Returns a specific program transfer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
String token = "token_example"; // String | Program transfer token
try {
    ProgramTransferResponse result = apiInstance.getProgramtransfersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#getProgramtransfersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Program transfer token |

### Return type

[**ProgramTransferResponse**](ProgramTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProgramtransfersTypes"></a>
# **getProgramtransfersTypes**
> ProgramTransferTypeListResponse getProgramtransfersTypes(count, startIndex, fields, sortBy)

Lists all program transfer types



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
Integer count = 5; // Integer | Number of program transfer types to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    ProgramTransferTypeListResponse result = apiInstance.getProgramtransfersTypes(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#getProgramtransfersTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of program transfer types to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**ProgramTransferTypeListResponse**](ProgramTransferTypeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProgramtransfersTypesTypetoken"></a>
# **getProgramtransfersTypesTypetoken**
> ProgramTransferTypeReponse getProgramtransfersTypesTypetoken(typeToken)

Returns a specific program transfer type



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
String typeToken = "typeToken_example"; // String | Type token
try {
    ProgramTransferTypeReponse result = apiInstance.getProgramtransfersTypesTypetoken(typeToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#getProgramtransfersTypesTypetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeToken** | **String**| Type token |

### Return type

[**ProgramTransferTypeReponse**](ProgramTransferTypeReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postProgramtransfers"></a>
# **postProgramtransfers**
> ProgramTransferResponse postProgramtransfers(body)

Transfers to a program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
ProgramTransfer body = new ProgramTransfer(); // ProgramTransfer | 
try {
    ProgramTransferResponse result = apiInstance.postProgramtransfers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#postProgramtransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProgramTransfer**](ProgramTransfer.md)|  | [optional]

### Return type

[**ProgramTransferResponse**](ProgramTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProgramtransfersTypes"></a>
# **postProgramtransfersTypes**
> ProgramTransferTypeReponse postProgramtransfersTypes(body)

Creates a program transfer type



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
ProgramTransferTypeRequest body = new ProgramTransferTypeRequest(); // ProgramTransferTypeRequest | 
try {
    ProgramTransferTypeReponse result = apiInstance.postProgramtransfersTypes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#postProgramtransfersTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProgramTransferTypeRequest**](ProgramTransferTypeRequest.md)|  | [optional]

### Return type

[**ProgramTransferTypeReponse**](ProgramTransferTypeReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putProgramtransfersTypesTypetoken"></a>
# **putProgramtransfersTypesTypetoken**
> ProgramTransferTypeReponse putProgramtransfersTypesTypetoken(typeToken, body)

Updates a specific program transfer type



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramTransfersApi;


ProgramTransfersApi apiInstance = new ProgramTransfersApi();
String typeToken = "typeToken_example"; // String | Type token
ProgramTransferTypeRequest body = new ProgramTransferTypeRequest(); // ProgramTransferTypeRequest | 
try {
    ProgramTransferTypeReponse result = apiInstance.putProgramtransfersTypesTypetoken(typeToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramTransfersApi#putProgramtransfersTypesTypetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeToken** | **String**| Type token |
 **body** | [**ProgramTransferTypeRequest**](ProgramTransferTypeRequest.md)|  | [optional]

### Return type

[**ProgramTransferTypeReponse**](ProgramTransferTypeReponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


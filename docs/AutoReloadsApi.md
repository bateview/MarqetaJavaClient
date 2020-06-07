# AutoReloadsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutoreloads**](AutoReloadsApi.md#getAutoreloads) | **GET** /autoreloads | Lists all auto reloads for the program
[**getAutoreloadsToken**](AutoReloadsApi.md#getAutoreloadsToken) | **GET** /autoreloads/{token} | Returns a specific auto reload object
[**postAutoreloads**](AutoReloadsApi.md#postAutoreloads) | **POST** /autoreloads | Creates an auto reload object
[**putAutoreloadsToken**](AutoReloadsApi.md#putAutoreloadsToken) | **PUT** /autoreloads/{token} | Updates a specific auto reload object


<a name="getAutoreloads"></a>
# **getAutoreloads**
> AutoReloadListResponse getAutoreloads(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy)

Lists all auto reloads for the program



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutoReloadsApi;


AutoReloadsApi apiInstance = new AutoReloadsApi();
String cardProduct = "cardProduct_example"; // String | Card product token
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
Integer count = 10; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    AutoReloadListResponse result = apiInstance.getAutoreloads(cardProduct, userToken, businessToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoReloadsApi#getAutoreloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardProduct** | **String**| Card product token | [optional]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 10]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**AutoReloadListResponse**](AutoReloadListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoreloadsToken"></a>
# **getAutoreloadsToken**
> AutoReloadResponseModel getAutoreloadsToken(token, fields)

Returns a specific auto reload object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutoReloadsApi;


AutoReloadsApi apiInstance = new AutoReloadsApi();
String token = "token_example"; // String | Auto reload token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    AutoReloadResponseModel result = apiInstance.getAutoreloadsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoReloadsApi#getAutoreloadsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Auto reload token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**AutoReloadResponseModel**](AutoReloadResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAutoreloads"></a>
# **postAutoreloads**
> AutoReloadResponseModel postAutoreloads(body)

Creates an auto reload object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutoReloadsApi;


AutoReloadsApi apiInstance = new AutoReloadsApi();
AutoReloadModel body = new AutoReloadModel(); // AutoReloadModel | Auto reload object
try {
    AutoReloadResponseModel result = apiInstance.postAutoreloads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoReloadsApi#postAutoreloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoReloadModel**](AutoReloadModel.md)| Auto reload object |

### Return type

[**AutoReloadResponseModel**](AutoReloadResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAutoreloadsToken"></a>
# **putAutoreloadsToken**
> AutoReloadResponseModel putAutoreloadsToken(body, token)

Updates a specific auto reload object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutoReloadsApi;


AutoReloadsApi apiInstance = new AutoReloadsApi();
AutoReloadUpdateModel body = new AutoReloadUpdateModel(); // AutoReloadUpdateModel | Auto reload object
String token = "token_example"; // String | 
try {
    AutoReloadResponseModel result = apiInstance.putAutoreloadsToken(body, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoReloadsApi#putAutoreloadsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AutoReloadUpdateModel**](AutoReloadUpdateModel.md)| Auto reload object |
 **token** | **String**|  |

### Return type

[**AutoReloadResponseModel**](AutoReloadResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# StoresApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStores**](StoresApi.md#getStores) | **GET** /stores | Lists all stores
[**getStoresMidMid**](StoresApi.md#getStoresMidMid) | **GET** /stores/mid/{mid} | Returns a store specified by its MID
[**getStoresToken**](StoresApi.md#getStoresToken) | **GET** /stores/{token} | Returns a specific store
[**postStores**](StoresApi.md#postStores) | **POST** /stores | Creates a store
[**putStoresToken**](StoresApi.md#putStoresToken) | **PUT** /stores/{token} | Updates a store


<a name="getStores"></a>
# **getStores**
> StoreListResponse getStores(count, startIndex, fields, sortBy)

Lists all stores



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoresApi;


StoresApi apiInstance = new StoresApi();
Integer count = 5; // Integer | Number of stores to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..)
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    StoreListResponse result = apiInstance.getStores(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of stores to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..) | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**StoreListResponse**](StoreListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoresMidMid"></a>
# **getStoresMidMid**
> StoreResponseModel getStoresMidMid(mid, fields)

Returns a store specified by its MID



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoresApi;


StoresApi apiInstance = new StoresApi();
String mid = "mid_example"; // String | Store MID
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    StoreResponseModel result = apiInstance.getStoresMidMid(mid, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoresMidMid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mid** | **String**| Store MID |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**StoreResponseModel**](StoreResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoresToken"></a>
# **getStoresToken**
> StoreResponseModel getStoresToken(token, fields)

Returns a specific store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoresApi;


StoresApi apiInstance = new StoresApi();
String token = "token_example"; // String | Store token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leaveblank to return all fields.
try {
    StoreResponseModel result = apiInstance.getStoresToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoresToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Store token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leaveblank to return all fields. | [optional]

### Return type

[**StoreResponseModel**](StoreResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postStores"></a>
# **postStores**
> StoreResponseModel postStores(body)

Creates a store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoresApi;


StoresApi apiInstance = new StoresApi();
StoreModel body = new StoreModel(); // StoreModel | 
try {
    StoreResponseModel result = apiInstance.postStores(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#postStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StoreModel**](StoreModel.md)|  | [optional]

### Return type

[**StoreResponseModel**](StoreResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putStoresToken"></a>
# **putStoresToken**
> StoreResponseModel putStoresToken(token, body)

Updates a store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StoresApi;


StoresApi apiInstance = new StoresApi();
String token = "token_example"; // String | Store token
StoreUpdateModel body = new StoreUpdateModel(); // StoreUpdateModel | 
try {
    StoreResponseModel result = apiInstance.putStoresToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#putStoresToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Store token |
 **body** | [**StoreUpdateModel**](StoreUpdateModel.md)|  | [optional]

### Return type

[**StoreResponseModel**](StoreResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


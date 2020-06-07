# MerchantsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchants**](MerchantsApi.md#getMerchants) | **GET** /merchants | Lists all merchants
[**getMerchantsToken**](MerchantsApi.md#getMerchantsToken) | **GET** /merchants/{token} | Returns a specific merchant
[**getMerchantsTokenStores**](MerchantsApi.md#getMerchantsTokenStores) | **GET** /merchants/{token}/stores | Lists the stores associated with a specific merchant
[**postMerchants**](MerchantsApi.md#postMerchants) | **POST** /merchants | Creates a merchant
[**putMerchantsToken**](MerchantsApi.md#putMerchantsToken) | **PUT** /merchants/{token} | Updates a specific merchant


<a name="getMerchants"></a>
# **getMerchants**
> MerchantListResponse getMerchants(count, startIndex, fields, sortBy)

Lists all merchants



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantsApi;


MerchantsApi apiInstance = new MerchantsApi();
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    MerchantListResponse result = apiInstance.getMerchants(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#getMerchants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**MerchantListResponse**](MerchantListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantsToken"></a>
# **getMerchantsToken**
> MerchantResponseModel getMerchantsToken(token, fields)

Returns a specific merchant



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantsApi;


MerchantsApi apiInstance = new MerchantsApi();
String token = "token_example"; // String | Merchant token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    MerchantResponseModel result = apiInstance.getMerchantsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#getMerchantsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Merchant token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**MerchantResponseModel**](MerchantResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMerchantsTokenStores"></a>
# **getMerchantsTokenStores**
> StoreListResponse getMerchantsTokenStores(token, count, startIndex, fields, sortBy)

Lists the stores associated with a specific merchant



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantsApi;


MerchantsApi apiInstance = new MerchantsApi();
String token = "token_example"; // String | Merchant token
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    StoreListResponse result = apiInstance.getMerchantsTokenStores(token, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#getMerchantsTokenStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Merchant token |
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**StoreListResponse**](StoreListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMerchants"></a>
# **postMerchants**
> MerchantResponseModel postMerchants(body)

Creates a merchant



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantsApi;


MerchantsApi apiInstance = new MerchantsApi();
MerchantModel body = new MerchantModel(); // MerchantModel | 
try {
    MerchantResponseModel result = apiInstance.postMerchants(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#postMerchants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MerchantModel**](MerchantModel.md)|  | [optional]

### Return type

[**MerchantResponseModel**](MerchantResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMerchantsToken"></a>
# **putMerchantsToken**
> MerchantResponseModel putMerchantsToken(token, body)

Updates a specific merchant



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantsApi;


MerchantsApi apiInstance = new MerchantsApi();
String token = "token_example"; // String | Merchant token
MerchantUpdateModel body = new MerchantUpdateModel(); // MerchantUpdateModel | 
try {
    MerchantResponseModel result = apiInstance.putMerchantsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantsApi#putMerchantsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Merchant token |
 **body** | [**MerchantUpdateModel**](MerchantUpdateModel.md)|  | [optional]

### Return type

[**MerchantResponseModel**](MerchantResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


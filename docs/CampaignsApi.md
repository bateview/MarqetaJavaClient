# CampaignsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /campaigns | Lists all campaigns
[**getCampaignsToken**](CampaignsApi.md#getCampaignsToken) | **GET** /campaigns/{token} | Returns a specific campaign
[**getCampaignsTokenStores**](CampaignsApi.md#getCampaignsTokenStores) | **GET** /campaigns/{token}/stores | Lists all stores associated with a campaign
[**postCampaigns**](CampaignsApi.md#postCampaigns) | **POST** /campaigns | Creates a campaign
[**putCampaignsToken**](CampaignsApi.md#putCampaignsToken) | **PUT** /campaigns/{token} | Updates a specific campaign


<a name="getCampaigns"></a>
# **getCampaigns**
> CampaignListResponse getCampaigns(count, startIndex, fields, sortBy)

Lists all campaigns



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
Integer count = 5; // Integer | Number of items to retrieve. Recommended max is 10.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data. Used in conjunction with count.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime.
try {
    CampaignListResponse result = apiInstance.getCampaigns(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve. Recommended max is 10. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. Used in conjunction with count. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. | [optional] [default to -lastModifiedTime]

### Return type

[**CampaignListResponse**](CampaignListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsToken"></a>
# **getCampaignsToken**
> CampaignResponseModel getCampaignsToken(token, fields)

Returns a specific campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String token = "token_example"; // String | Campaign token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CampaignResponseModel result = apiInstance.getCampaignsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Campaign token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CampaignResponseModel**](CampaignResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsTokenStores"></a>
# **getCampaignsTokenStores**
> StoreListResponse getCampaignsTokenStores(token, count, startIndex, fields, sortBy)

Lists all stores associated with a campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String token = "token_example"; // String | Campaign token
Integer count = 5; // Integer | Number of items to retrieve. Recommended max is 10.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data. Used in conjunction with count.
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime.
try {
    StoreListResponse result = apiInstance.getCampaignsTokenStores(token, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignsTokenStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Campaign token |
 **count** | **Integer**| Number of items to retrieve. Recommended max is 10. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. Used in conjunction with count. | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Field on which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or CreatedTime. | [optional] [default to -lastModifiedTime]

### Return type

[**StoreListResponse**](StoreListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCampaigns"></a>
# **postCampaigns**
> CampaignResponseModel postCampaigns(body)

Creates a campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
CampaignModel body = new CampaignModel(); // CampaignModel | 
try {
    CampaignResponseModel result = apiInstance.postCampaigns(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#postCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignModel**](CampaignModel.md)|  | [optional]

### Return type

[**CampaignResponseModel**](CampaignResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCampaignsToken"></a>
# **putCampaignsToken**
> CampaignResponseModel putCampaignsToken(token, body)

Updates a specific campaign



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String token = "token_example"; // String | Campaign token
CampaignUpdateModel body = new CampaignUpdateModel(); // CampaignUpdateModel | 
try {
    CampaignResponseModel result = apiInstance.putCampaignsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#putCampaignsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Campaign token |
 **body** | [**CampaignUpdateModel**](CampaignUpdateModel.md)|  | [optional]

### Return type

[**CampaignResponseModel**](CampaignResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# RealTimeFeeGroupsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealtimefeegroups**](RealTimeFeeGroupsApi.md#getRealtimefeegroups) | **GET** /realtimefeegroups | Lists all real-time fee groups
[**getRealtimefeegroupsToken**](RealTimeFeeGroupsApi.md#getRealtimefeegroupsToken) | **GET** /realtimefeegroups/{token} | Returns a specific real-time fee group
[**postRealtimefeegroups**](RealTimeFeeGroupsApi.md#postRealtimefeegroups) | **POST** /realtimefeegroups | Creates a real-time fee group
[**putRealtimefeegroupsToken**](RealTimeFeeGroupsApi.md#putRealtimefeegroupsToken) | **PUT** /realtimefeegroups/{token} | Updates a specific real-time fee group


<a name="getRealtimefeegroups"></a>
# **getRealtimefeegroups**
> RealTimeFeeGroup getRealtimefeegroups(count, startIndex, fields, sortBy)

Lists all real-time fee groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RealTimeFeeGroupsApi;


RealTimeFeeGroupsApi apiInstance = new RealTimeFeeGroupsApi();
Integer count = 5; // Integer | Number of real-time fee groups to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    RealTimeFeeGroup result = apiInstance.getRealtimefeegroups(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealTimeFeeGroupsApi#getRealtimefeegroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of real-time fee groups to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**RealTimeFeeGroup**](RealTimeFeeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRealtimefeegroupsToken"></a>
# **getRealtimefeegroupsToken**
> RealTimeFeeGroup getRealtimefeegroupsToken(token)

Returns a specific real-time fee group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RealTimeFeeGroupsApi;


RealTimeFeeGroupsApi apiInstance = new RealTimeFeeGroupsApi();
String token = "token_example"; // String | Real-time fee group token
try {
    RealTimeFeeGroup result = apiInstance.getRealtimefeegroupsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealTimeFeeGroupsApi#getRealtimefeegroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Real-time fee group token |

### Return type

[**RealTimeFeeGroup**](RealTimeFeeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postRealtimefeegroups"></a>
# **postRealtimefeegroups**
> RealTimeFeeGroup postRealtimefeegroups(body)

Creates a real-time fee group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RealTimeFeeGroupsApi;


RealTimeFeeGroupsApi apiInstance = new RealTimeFeeGroupsApi();
RealTimeFeeGroupCreateRequest body = new RealTimeFeeGroupCreateRequest(); // RealTimeFeeGroupCreateRequest | 
try {
    RealTimeFeeGroup result = apiInstance.postRealtimefeegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealTimeFeeGroupsApi#postRealtimefeegroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RealTimeFeeGroupCreateRequest**](RealTimeFeeGroupCreateRequest.md)|  | [optional]

### Return type

[**RealTimeFeeGroup**](RealTimeFeeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRealtimefeegroupsToken"></a>
# **putRealtimefeegroupsToken**
> RealTimeFeeGroup putRealtimefeegroupsToken(token, body)

Updates a specific real-time fee group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RealTimeFeeGroupsApi;


RealTimeFeeGroupsApi apiInstance = new RealTimeFeeGroupsApi();
String token = "token_example"; // String | Real-time fee group token
RealTimeFeeGroupRequest body = new RealTimeFeeGroupRequest(); // RealTimeFeeGroupRequest | 
try {
    RealTimeFeeGroup result = apiInstance.putRealtimefeegroupsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealTimeFeeGroupsApi#putRealtimefeegroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Real-time fee group token |
 **body** | [**RealTimeFeeGroupRequest**](RealTimeFeeGroupRequest.md)|  | [optional]

### Return type

[**RealTimeFeeGroup**](RealTimeFeeGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


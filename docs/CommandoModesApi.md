# CommandoModesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommandomodes**](CommandoModesApi.md#getCommandomodes) | **GET** /commandomodes | Lists all commando mode control sets
[**getCommandomodesCommandomodetokenTransitions**](CommandoModesApi.md#getCommandomodesCommandomodetokenTransitions) | **GET** /commandomodes/{commandomode_token}/transitions | Lists all commando mode transitions related to a commando mode control set
[**getCommandomodesToken**](CommandoModesApi.md#getCommandomodesToken) | **GET** /commandomodes/{token} | Returns a specific commando mode control set
[**getCommandomodesTransitionsToken**](CommandoModesApi.md#getCommandomodesTransitionsToken) | **GET** /commandomodes/transitions/{token} | Returns a specific commando mode transition


<a name="getCommandomodes"></a>
# **getCommandomodes**
> CommandoModeListResponse getCommandomodes(count, startIndex, sortBy)

Lists all commando mode control sets



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandoModesApi;


CommandoModesApi apiInstance = new CommandoModesApi();
Integer count = 5; // Integer | Number of commando modes to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    CommandoModeListResponse result = apiInstance.getCommandomodes(count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandoModesApi#getCommandomodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of commando modes to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**CommandoModeListResponse**](CommandoModeListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommandomodesCommandomodetokenTransitions"></a>
# **getCommandomodesCommandomodetokenTransitions**
> CommandoModeTransitionListResponse getCommandomodesCommandomodetokenTransitions(commandomodeToken, count, startIndex, sortBy)

Lists all commando mode transitions related to a commando mode control set



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandoModesApi;


CommandoModesApi apiInstance = new CommandoModesApi();
String commandomodeToken = "commandomodeToken_example"; // String | Commando mode token
Integer count = 5; // Integer | Number of transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    CommandoModeTransitionListResponse result = apiInstance.getCommandomodesCommandomodetokenTransitions(commandomodeToken, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandoModesApi#getCommandomodesCommandomodetokenTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commandomodeToken** | **String**| Commando mode token |
 **count** | **Integer**| Number of transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**CommandoModeTransitionListResponse**](CommandoModeTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommandomodesToken"></a>
# **getCommandomodesToken**
> CommandoModeResponse getCommandomodesToken(token)

Returns a specific commando mode control set



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandoModesApi;


CommandoModesApi apiInstance = new CommandoModesApi();
String token = "token_example"; // String | 
try {
    CommandoModeResponse result = apiInstance.getCommandomodesToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandoModesApi#getCommandomodesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**CommandoModeResponse**](CommandoModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCommandomodesTransitionsToken"></a>
# **getCommandomodesTransitionsToken**
> CommandoModeTransitionResponse getCommandomodesTransitionsToken(token)

Returns a specific commando mode transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CommandoModesApi;


CommandoModesApi apiInstance = new CommandoModesApi();
String token = "token_example"; // String | Commando mode transition token
try {
    CommandoModeTransitionResponse result = apiInstance.getCommandomodesTransitionsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommandoModesApi#getCommandomodesTransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Commando mode transition token |

### Return type

[**CommandoModeTransitionResponse**](CommandoModeTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


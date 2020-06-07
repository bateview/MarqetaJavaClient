# AccountHolderGroupsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountholdergroups**](AccountHolderGroupsApi.md#getAccountholdergroups) | **GET** /accountholdergroups | Lists account holder groups
[**getAccountholdergroupsToken**](AccountHolderGroupsApi.md#getAccountholdergroupsToken) | **GET** /accountholdergroups/{token} | Returns a specific account holder group object
[**postAccountholdergroups**](AccountHolderGroupsApi.md#postAccountholdergroups) | **POST** /accountholdergroups | Creates an account holder group object
[**putAccountholdergroupsToken**](AccountHolderGroupsApi.md#putAccountholdergroupsToken) | **PUT** /accountholdergroups/{token} | Updates an account holder group object


<a name="getAccountholdergroups"></a>
# **getAccountholdergroups**
> AccountHolderGroupListResponse getAccountholdergroups(count, startIndex, sortBy)

Lists account holder groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountHolderGroupsApi;


AccountHolderGroupsApi apiInstance = new AccountHolderGroupsApi();
Integer count = 10; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    AccountHolderGroupListResponse result = apiInstance.getAccountholdergroups(count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountHolderGroupsApi#getAccountholdergroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 10]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**AccountHolderGroupListResponse**](AccountHolderGroupListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountholdergroupsToken"></a>
# **getAccountholdergroupsToken**
> AccountHolderGroupResponse getAccountholdergroupsToken(token)

Returns a specific account holder group object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountHolderGroupsApi;


AccountHolderGroupsApi apiInstance = new AccountHolderGroupsApi();
String token = "token_example"; // String | Account holder group token
try {
    AccountHolderGroupResponse result = apiInstance.getAccountholdergroupsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountHolderGroupsApi#getAccountholdergroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Account holder group token |

### Return type

[**AccountHolderGroupResponse**](AccountHolderGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountholdergroups"></a>
# **postAccountholdergroups**
> AccountHolderGroupResponse postAccountholdergroups(body)

Creates an account holder group object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountHolderGroupsApi;


AccountHolderGroupsApi apiInstance = new AccountHolderGroupsApi();
AccountHolderGroupRequest body = new AccountHolderGroupRequest(); // AccountHolderGroupRequest | Account holder group object
try {
    AccountHolderGroupResponse result = apiInstance.postAccountholdergroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountHolderGroupsApi#postAccountholdergroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountHolderGroupRequest**](AccountHolderGroupRequest.md)| Account holder group object |

### Return type

[**AccountHolderGroupResponse**](AccountHolderGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAccountholdergroupsToken"></a>
# **putAccountholdergroupsToken**
> AccountHolderGroupResponse putAccountholdergroupsToken(body, token)

Updates an account holder group object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountHolderGroupsApi;


AccountHolderGroupsApi apiInstance = new AccountHolderGroupsApi();
AccountHolderGroupUpdateRequest body = new AccountHolderGroupUpdateRequest(); // AccountHolderGroupUpdateRequest | Account holder group update object
String token = "token_example"; // String | 
try {
    AccountHolderGroupResponse result = apiInstance.putAccountholdergroupsToken(body, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountHolderGroupsApi#putAccountholdergroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountHolderGroupUpdateRequest**](AccountHolderGroupUpdateRequest.md)| Account holder group update object |
 **token** | **String**|  |

### Return type

[**AccountHolderGroupResponse**](AccountHolderGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


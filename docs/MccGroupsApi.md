# MccGroupsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMccgroups**](MccGroupsApi.md#getMccgroups) | **GET** /mccgroups | Lists all MCC groups
[**getMccgroupsToken**](MccGroupsApi.md#getMccgroupsToken) | **GET** /mccgroups/{token} | Returns a specific MCC group
[**postMccgroups**](MccGroupsApi.md#postMccgroups) | **POST** /mccgroups | Creates an MCC group
[**putMccgroupsToken**](MccGroupsApi.md#putMccgroupsToken) | **PUT** /mccgroups/{token} | Updates an MCC group


<a name="getMccgroups"></a>
# **getMccgroups**
> MCCGroupListResponse getMccgroups(mcc, count, startIndex, sortBy)

Lists all MCC groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MccGroupsApi;


MccGroupsApi apiInstance = new MccGroupsApi();
String mcc = "mcc_example"; // String | MCC
Integer count = 10; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String sortBy = "-lastModifiedTime"; // String | Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime.
try {
    MCCGroupListResponse result = apiInstance.getMccgroups(mcc, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccGroupsApi#getMccgroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mcc** | **String**| MCC | [optional]
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 10]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **sortBy** | **String**| Field by which to sort the returned items. Use any field in the model, or system fields lastModifiedTime or createdTime. | [optional] [default to -lastModifiedTime]

### Return type

[**MCCGroupListResponse**](MCCGroupListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMccgroupsToken"></a>
# **getMccgroupsToken**
> MccGroupModel getMccgroupsToken(token)

Returns a specific MCC group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MccGroupsApi;


MccGroupsApi apiInstance = new MccGroupsApi();
String token = "token_example"; // String | MCC group token
try {
    MccGroupModel result = apiInstance.getMccgroupsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccGroupsApi#getMccgroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| MCC group token |

### Return type

[**MccGroupModel**](MccGroupModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMccgroups"></a>
# **postMccgroups**
> MccGroupModel postMccgroups(body)

Creates an MCC group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MccGroupsApi;


MccGroupsApi apiInstance = new MccGroupsApi();
MccGroupModel body = new MccGroupModel(); // MccGroupModel | MCC group
try {
    MccGroupModel result = apiInstance.postMccgroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccGroupsApi#postMccgroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MccGroupModel**](MccGroupModel.md)| MCC group |

### Return type

[**MccGroupModel**](MccGroupModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putMccgroupsToken"></a>
# **putMccgroupsToken**
> MccGroupUpdateModel putMccgroupsToken(body, token)

Updates an MCC group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MccGroupsApi;


MccGroupsApi apiInstance = new MccGroupsApi();
MccGroupUpdateModel body = new MccGroupUpdateModel(); // MccGroupUpdateModel | MCC group
String token = "token_example"; // String | 
try {
    MccGroupUpdateModel result = apiInstance.putMccgroupsToken(body, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MccGroupsApi#putMccgroupsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MccGroupUpdateModel**](MccGroupUpdateModel.md)| MCC group |
 **token** | **String**|  |

### Return type

[**MccGroupUpdateModel**](MccGroupUpdateModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


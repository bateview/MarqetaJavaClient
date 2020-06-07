# UserTransitionsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsertransitionsToken**](UserTransitionsApi.md#getUsertransitionsToken) | **GET** /usertransitions/{token} | Returns a user transition
[**getUsertransitionsUserUsertoken**](UserTransitionsApi.md#getUsertransitionsUserUsertoken) | **GET** /usertransitions/user/{user_token} | Returns transitions for a specific user
[**postUsertransitions**](UserTransitionsApi.md#postUsertransitions) | **POST** /usertransitions | Creates a user transition


<a name="getUsertransitionsToken"></a>
# **getUsertransitionsToken**
> UserTransitionResponse getUsertransitionsToken(token, fields)

Returns a user transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserTransitionsApi;


UserTransitionsApi apiInstance = new UserTransitionsApi();
String token = "token_example"; // String | Transition token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    UserTransitionResponse result = apiInstance.getUsertransitionsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTransitionsApi#getUsertransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Transition token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**UserTransitionResponse**](UserTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsertransitionsUserUsertoken"></a>
# **getUsertransitionsUserUsertoken**
> UserTransitionListResponse getUsertransitionsUserUsertoken(userToken, count, startIndex, fields, sortBy)

Returns transitions for a specific user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserTransitionsApi;


UserTransitionsApi apiInstance = new UserTransitionsApi();
String userToken = "userToken_example"; // String | User token
Integer count = 5; // Integer | Number of user transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-id"; // String | Sort order
try {
    UserTransitionListResponse result = apiInstance.getUsertransitionsUserUsertoken(userToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTransitionsApi#getUsertransitionsUserUsertoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **count** | **Integer**| Number of user transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -id]

### Return type

[**UserTransitionListResponse**](UserTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsertransitions"></a>
# **postUsertransitions**
> UserTransitionResponse postUsertransitions(body)

Creates a user transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserTransitionsApi;


UserTransitionsApi apiInstance = new UserTransitionsApi();
UserTransitionRequest body = new UserTransitionRequest(); // UserTransitionRequest | 
try {
    UserTransitionResponse result = apiInstance.postUsertransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserTransitionsApi#postUsertransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTransitionRequest**](UserTransitionRequest.md)|  | [optional]

### Return type

[**UserTransitionResponse**](UserTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


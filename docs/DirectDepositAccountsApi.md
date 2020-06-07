# DirectDepositAccountsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](DirectDepositAccountsApi.md#createAccount) | **POST** /depositaccounts | Creates new direct deposit account for cardholder.
[**createTransition**](DirectDepositAccountsApi.md#createTransition) | **POST** /depositaccounts/transitions | Creates new transition for a direct deposit account.
[**getDirectDepositAccount**](DirectDepositAccountsApi.md#getDirectDepositAccount) | **GET** /depositaccounts/{token} | Get direct deposit account.
[**getDirectDepositAccountTransition**](DirectDepositAccountsApi.md#getDirectDepositAccountTransition) | **GET** /depositaccounts/transitions/{token} | Get direct deposit account transition.
[**getTransitionList**](DirectDepositAccountsApi.md#getTransitionList) | **GET** /depositaccounts/{user_token}/transitions | Get direct deposit account transition list for card holder.
[**getUserDirectDepositAccounts**](DirectDepositAccountsApi.md#getUserDirectDepositAccounts) | **GET** /depositaccounts/user/{token} | List all specific direct deposit accounts.
[**getUserForDirectDepositAccount**](DirectDepositAccountsApi.md#getUserForDirectDepositAccount) | **GET** /depositaccounts/account/{account_number}/user | Get User for Plain Text Account Number
[**update**](DirectDepositAccountsApi.md#update) | **PUT** /depositaccounts/{token} | Update direct deposit account.


<a name="createAccount"></a>
# **createAccount**
> DirectDepositAccountResponse createAccount(body)

Creates new direct deposit account for cardholder.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
DirectDepositAccountRequest body = new DirectDepositAccountRequest(); // DirectDepositAccountRequest | Create direct deposit account for cardholder
try {
    DirectDepositAccountResponse result = apiInstance.createAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectDepositAccountRequest**](DirectDepositAccountRequest.md)| Create direct deposit account for cardholder |

### Return type

[**DirectDepositAccountResponse**](DirectDepositAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransition"></a>
# **createTransition**
> DirectDepositAccountTransitionResponse createTransition(body)

Creates new transition for a direct deposit account.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
DirectDepositAccountTransitionRequest body = new DirectDepositAccountTransitionRequest(); // DirectDepositAccountTransitionRequest | Create transition for direct deposit account
try {
    DirectDepositAccountTransitionResponse result = apiInstance.createTransition(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#createTransition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectDepositAccountTransitionRequest**](DirectDepositAccountTransitionRequest.md)| Create transition for direct deposit account |

### Return type

[**DirectDepositAccountTransitionResponse**](DirectDepositAccountTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectDepositAccount"></a>
# **getDirectDepositAccount**
> DirectDepositAccountResponse getDirectDepositAccount(token)

Get direct deposit account.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
String token = "token_example"; // String | Get specific direct deposit account
try {
    DirectDepositAccountResponse result = apiInstance.getDirectDepositAccount(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#getDirectDepositAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Get specific direct deposit account |

### Return type

[**DirectDepositAccountResponse**](DirectDepositAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectDepositAccountTransition"></a>
# **getDirectDepositAccountTransition**
> DirectDepositAccountTransitionResponse getDirectDepositAccountTransition(token)

Get direct deposit account transition.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
String token = "token_example"; // String | Get specific direct deposit account transition
try {
    DirectDepositAccountTransitionResponse result = apiInstance.getDirectDepositAccountTransition(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#getDirectDepositAccountTransition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Get specific direct deposit account transition |

### Return type

[**DirectDepositAccountTransitionResponse**](DirectDepositAccountTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransitionList"></a>
# **getTransitionList**
> DirectDepositAccountTransitionResponse getTransitionList(userToken, count, startIndex, sortBy)

Get direct deposit account transition list for card holder.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
String userToken = "userToken_example"; // String | Get direct deposit account transition list for user
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    DirectDepositAccountTransitionResponse result = apiInstance.getTransitionList(userToken, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#getTransitionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| Get direct deposit account transition list for user |
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**DirectDepositAccountTransitionResponse**](DirectDepositAccountTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserDirectDepositAccounts"></a>
# **getUserDirectDepositAccounts**
> DirectDepositAccountListResponse getUserDirectDepositAccounts(token, count, startIndex, sortBy, state)

List all specific direct deposit accounts.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
String token = "token_example"; // String | Get specific direct deposit account
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-lastModifiedTime"; // String | Sort order
String state = "state_example"; // String | Direct deposit account status
try {
    DirectDepositAccountListResponse result = apiInstance.getUserDirectDepositAccounts(token, count, startIndex, sortBy, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#getUserDirectDepositAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Get specific direct deposit account |
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]
 **state** | **String**| Direct deposit account status | [optional] [enum: ACTIVE, SUSPENDED, TERMINATED, UNSUPPORTED, UNACTIVATED]

### Return type

[**DirectDepositAccountListResponse**](DirectDepositAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserForDirectDepositAccount"></a>
# **getUserForDirectDepositAccount**
> DirectDepositAccountResponse getUserForDirectDepositAccount(accountNumber)

Get User for Plain Text Account Number



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
String accountNumber = "accountNumber_example"; // String | Get user associated with direct deposit account number
try {
    DirectDepositAccountResponse result = apiInstance.getUserForDirectDepositAccount(accountNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#getUserForDirectDepositAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **String**| Get user associated with direct deposit account number |

### Return type

[**DirectDepositAccountResponse**](DirectDepositAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> DirectDepositAccountResponse update(body, token)

Update direct deposit account.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositAccountsApi;


DirectDepositAccountsApi apiInstance = new DirectDepositAccountsApi();
DepositAccountUpdateRequest body = new DepositAccountUpdateRequest(); // DepositAccountUpdateRequest | Update direct deposit account
String token = "token_example"; // String | 
try {
    DirectDepositAccountResponse result = apiInstance.update(body, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositAccountsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepositAccountUpdateRequest**](DepositAccountUpdateRequest.md)| Update direct deposit account |
 **token** | **String**|  |

### Return type

[**DirectDepositAccountResponse**](DirectDepositAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


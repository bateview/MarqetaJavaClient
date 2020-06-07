# DirectDepositsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDirectdeposits**](DirectDepositsApi.md#getDirectdeposits) | **GET** /directdeposits | Lists all direct deposits
[**getDirectdepositsAccountsUserorbusinesstoken**](DirectDepositsApi.md#getDirectdepositsAccountsUserorbusinesstoken) | **GET** /directdeposits/accounts/{user_or_business_token} | Returns an account and routing number which can be used for direct deposit
[**getDirectdepositsToken**](DirectDepositsApi.md#getDirectdepositsToken) | **GET** /directdeposits/{token} | Returns a direct deposit entry
[**getDirectdepositsTransitions**](DirectDepositsApi.md#getDirectdepositsTransitions) | **GET** /directdeposits/transitions | Returns a list of direct deposit transitions
[**getDirectdepositsTransitionsToken**](DirectDepositsApi.md#getDirectdepositsTransitionsToken) | **GET** /directdeposits/transitions/{token} | Returns a direct deposit transition
[**postDirectdepositsTransitions**](DirectDepositsApi.md#postDirectdepositsTransitions) | **POST** /directdeposits/transitions | Creates a direct deposit transition
[**putDirectdepositsAccountsUserorbusinesstoken**](DirectDepositsApi.md#putDirectdepositsAccountsUserorbusinesstoken) | **PUT** /directdeposits/accounts/{user_or_business_token} | Updates a specific direct deposit account


<a name="getDirectdeposits"></a>
# **getDirectdeposits**
> DirectDepositListResponse getDirectdeposits(count, startIndex, reversedAfterGracePeriod, userToken, businessToken, directDepositState, startSettlementDate, endSettlementDate, sortBy)

Lists all direct deposits



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
Integer count = 5; // Integer | Number of direct deposits to retrieve
Integer startIndex = 0; // Integer | Start index
Boolean reversedAfterGracePeriod = true; // Boolean | Reversed after grace period
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String directDepositState = "directDepositState_example"; // String | Direct deposit state
String startSettlementDate = "startSettlementDate_example"; // String | Start settlement date
String endSettlementDate = "endSettlementDate_example"; // String | End settlement date
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    DirectDepositListResponse result = apiInstance.getDirectdeposits(count, startIndex, reversedAfterGracePeriod, userToken, businessToken, directDepositState, startSettlementDate, endSettlementDate, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#getDirectdeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of direct deposits to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **reversedAfterGracePeriod** | **Boolean**| Reversed after grace period | [optional]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **directDepositState** | **String**| Direct deposit state | [optional] [enum: PENDING, APPLIED, REVERSED, REJECTED]
 **startSettlementDate** | **String**| Start settlement date | [optional]
 **endSettlementDate** | **String**| End settlement date | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**DirectDepositListResponse**](DirectDepositListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectdepositsAccountsUserorbusinesstoken"></a>
# **getDirectdepositsAccountsUserorbusinesstoken**
> DepositAccount getDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken)

Returns an account and routing number which can be used for direct deposit



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
String userOrBusinessToken = "userOrBusinessToken_example"; // String | 
try {
    DepositAccount result = apiInstance.getDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#getDirectdepositsAccountsUserorbusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOrBusinessToken** | **String**|  |

### Return type

[**DepositAccount**](DepositAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectdepositsToken"></a>
# **getDirectdepositsToken**
> DepositDepositResponse getDirectdepositsToken(token)

Returns a direct deposit entry



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
String token = "token_example"; // String | 
try {
    DepositDepositResponse result = apiInstance.getDirectdepositsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#getDirectdepositsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**DepositDepositResponse**](DepositDepositResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectdepositsTransitions"></a>
# **getDirectdepositsTransitions**
> DirectDepositTransitionListResponse getDirectdepositsTransitions(count, userToken, businessToken, directDepositToken, startIndex, sortBy, states)

Returns a list of direct deposit transitions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
Integer count = 5; // Integer | Number of direct deposit transitions to retrieve
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String directDepositToken = "directDepositToken_example"; // String | Direct deposit token
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
String states = "states_example"; // String | Comma-delimited list of direct deposit states to display e.g. PENDING | REVERSED | APPLIED | REJECTED 
try {
    DirectDepositTransitionListResponse result = apiInstance.getDirectdepositsTransitions(count, userToken, businessToken, directDepositToken, startIndex, sortBy, states);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#getDirectdepositsTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of direct deposit transitions to retrieve | [optional] [default to 5]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **directDepositToken** | **String**| Direct deposit token | [optional]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]
 **states** | **String**| Comma-delimited list of direct deposit states to display e.g. PENDING | REVERSED | APPLIED | REJECTED  | [optional]

### Return type

[**DirectDepositTransitionListResponse**](DirectDepositTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDirectdepositsTransitionsToken"></a>
# **getDirectdepositsTransitionsToken**
> DirectDepositTransitionResponse getDirectdepositsTransitionsToken(token)

Returns a direct deposit transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
String token = "token_example"; // String | 
try {
    DirectDepositTransitionResponse result = apiInstance.getDirectdepositsTransitionsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#getDirectdepositsTransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**DirectDepositTransitionResponse**](DirectDepositTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDirectdepositsTransitions"></a>
# **postDirectdepositsTransitions**
> DirectDepositTransitionResponse postDirectdepositsTransitions(body)

Creates a direct deposit transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
DirectDepositTransitionRequest body = new DirectDepositTransitionRequest(); // DirectDepositTransitionRequest | 
try {
    DirectDepositTransitionResponse result = apiInstance.postDirectdepositsTransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#postDirectdepositsTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectDepositTransitionRequest**](DirectDepositTransitionRequest.md)|  | [optional]

### Return type

[**DirectDepositTransitionResponse**](DirectDepositTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putDirectdepositsAccountsUserorbusinesstoken"></a>
# **putDirectdepositsAccountsUserorbusinesstoken**
> DepositAccount putDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken, body)

Updates a specific direct deposit account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectDepositsApi;


DirectDepositsApi apiInstance = new DirectDepositsApi();
String userOrBusinessToken = "userOrBusinessToken_example"; // String | User or business token
DepositAccountUpdateRequest body = new DepositAccountUpdateRequest(); // DepositAccountUpdateRequest | Deposit account update request
try {
    DepositAccount result = apiInstance.putDirectdepositsAccountsUserorbusinesstoken(userOrBusinessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDepositsApi#putDirectdepositsAccountsUserorbusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userOrBusinessToken** | **String**| User or business token |
 **body** | [**DepositAccountUpdateRequest**](DepositAccountUpdateRequest.md)| Deposit account update request |

### Return type

[**DepositAccount**](DepositAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


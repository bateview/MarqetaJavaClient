# ChargebacksApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChargebacks**](ChargebacksApi.md#getChargebacks) | **GET** /chargebacks | List all chargebacks
[**getChargebacksChargebacktokenTransitions**](ChargebacksApi.md#getChargebacksChargebacktokenTransitions) | **GET** /chargebacks/{chargeback_token}/transitions | Lists all chargeback transitions that are related to a chargeback
[**getChargebacksToken**](ChargebacksApi.md#getChargebacksToken) | **GET** /chargebacks/{token} | Returns a specific chargeback
[**getChargebacksTransitionsToken**](ChargebacksApi.md#getChargebacksTransitionsToken) | **GET** /chargebacks/transitions/{token} | Returns a specific chargeback transition
[**postChargebackAllocationAcknowledgment**](ChargebacksApi.md#postChargebackAllocationAcknowledgment) | **POST** /chargebacks/allocationacknowledgement | Creates a chargeback allocation acknowledgement
[**postChargebacks**](ChargebacksApi.md#postChargebacks) | **POST** /chargebacks | Creates a chargeback
[**postChargebacksTransitions**](ChargebacksApi.md#postChargebacksTransitions) | **POST** /chargebacks/transitions | Creates a chargeback transition
[**putChargebacksToken**](ChargebacksApi.md#putChargebacksToken) | **PUT** /chargebacks/{token} | Updates chargeback data
[**putChargebacksTokenGrantprovisionalcredit**](ChargebacksApi.md#putChargebacksTokenGrantprovisionalcredit) | **PUT** /chargebacks/{token}/grantprovisionalcredit | Grants provisional credit
[**putChargebacksTokenReverseprovisionalcredit**](ChargebacksApi.md#putChargebacksTokenReverseprovisionalcredit) | **PUT** /chargebacks/{token}/reverseprovisionalcredit | Reverses provisional credit


<a name="getChargebacks"></a>
# **getChargebacks**
> ChargebackListResponse getChargebacks(count, startIndex, networkReferenceId, transactionToken, amount, states, sortBy, networkCaseId)

List all chargebacks



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
Integer count = 5; // Integer | Number of chargebacks to retrieve
Integer startIndex = 0; // Integer | Start index
String networkReferenceId = "networkReferenceId_example"; // String | Network reference ID
String transactionToken = "transactionToken_example"; // String | Transaction token
String amount = "amount_example"; // String | Amount
String states = "states_example"; // String | Comma-delimited list of chargeback states to display e.g. INITIATED | REPRESENTMENT | PREARBITRATION | ARBITRATION | CASE_WON | CASE_LOST | NETWORK_REJECTED | WITHDRAWN | WRITTEN_OFF_ISSUER | WRITTEN_OFF_PROGRAM
String sortBy = "-lastModifiedTime"; // String | Sort order
String networkCaseId = "networkCaseId_example"; // String | 
try {
    ChargebackListResponse result = apiInstance.getChargebacks(count, startIndex, networkReferenceId, transactionToken, amount, states, sortBy, networkCaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#getChargebacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of chargebacks to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **networkReferenceId** | **String**| Network reference ID | [optional]
 **transactionToken** | **String**| Transaction token | [optional]
 **amount** | **String**| Amount | [optional]
 **states** | **String**| Comma-delimited list of chargeback states to display e.g. INITIATED | REPRESENTMENT | PREARBITRATION | ARBITRATION | CASE_WON | CASE_LOST | NETWORK_REJECTED | WITHDRAWN | WRITTEN_OFF_ISSUER | WRITTEN_OFF_PROGRAM | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]
 **networkCaseId** | **String**|  | [optional]

### Return type

[**ChargebackListResponse**](ChargebackListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChargebacksChargebacktokenTransitions"></a>
# **getChargebacksChargebacktokenTransitions**
> ChargebackTransitionListResponse getChargebacksChargebacktokenTransitions(chargebackToken, count, startIndex, sortBy)

Lists all chargeback transitions that are related to a chargeback



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String chargebackToken = "chargebackToken_example"; // String | Chargeback token
Integer count = 5; // Integer | Number of transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    ChargebackTransitionListResponse result = apiInstance.getChargebacksChargebacktokenTransitions(chargebackToken, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#getChargebacksChargebacktokenTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargebackToken** | **String**| Chargeback token |
 **count** | **Integer**| Number of transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**ChargebackTransitionListResponse**](ChargebackTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChargebacksToken"></a>
# **getChargebacksToken**
> ChargebackResponse getChargebacksToken(token)

Returns a specific chargeback



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String token = "token_example"; // String | 
try {
    ChargebackResponse result = apiInstance.getChargebacksToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#getChargebacksToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChargebacksTransitionsToken"></a>
# **getChargebacksTransitionsToken**
> ChargebackTransitionResponse getChargebacksTransitionsToken(token)

Returns a specific chargeback transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String token = "token_example"; // String | Chargeback transition token
try {
    ChargebackTransitionResponse result = apiInstance.getChargebacksTransitionsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#getChargebacksTransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Chargeback transition token |

### Return type

[**ChargebackTransitionResponse**](ChargebackTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChargebackAllocationAcknowledgment"></a>
# **postChargebackAllocationAcknowledgment**
> ChargebackResponse postChargebackAllocationAcknowledgment(body)

Creates a chargeback allocation acknowledgement



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
ChargebackRequest body = new ChargebackRequest(); // ChargebackRequest | 
try {
    ChargebackResponse result = apiInstance.postChargebackAllocationAcknowledgment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#postChargebackAllocationAcknowledgment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChargebackRequest**](ChargebackRequest.md)|  | [optional]

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChargebacks"></a>
# **postChargebacks**
> ChargebackResponse postChargebacks(body)

Creates a chargeback



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
ChargebackRequest body = new ChargebackRequest(); // ChargebackRequest | 
try {
    ChargebackResponse result = apiInstance.postChargebacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#postChargebacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChargebackRequest**](ChargebackRequest.md)|  | [optional]

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postChargebacksTransitions"></a>
# **postChargebacksTransitions**
> ChargebackTransitionResponse postChargebacksTransitions(body)

Creates a chargeback transition



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
ChargebackTransitionRequest body = new ChargebackTransitionRequest(); // ChargebackTransitionRequest | 
try {
    ChargebackTransitionResponse result = apiInstance.postChargebacksTransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#postChargebacksTransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChargebackTransitionRequest**](ChargebackTransitionRequest.md)|  | [optional]

### Return type

[**ChargebackTransitionResponse**](ChargebackTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putChargebacksToken"></a>
# **putChargebacksToken**
> ChargebackResponse putChargebacksToken(token, body)

Updates chargeback data



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String token = "token_example"; // String | 
ChargebackUpdateRequest body = new ChargebackUpdateRequest(); // ChargebackUpdateRequest | 
try {
    ChargebackResponse result = apiInstance.putChargebacksToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#putChargebacksToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **body** | [**ChargebackUpdateRequest**](ChargebackUpdateRequest.md)|  | [optional]

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putChargebacksTokenGrantprovisionalcredit"></a>
# **putChargebacksTokenGrantprovisionalcredit**
> ChargebackResponse putChargebacksTokenGrantprovisionalcredit(token)

Grants provisional credit



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String token = "token_example"; // String | 
try {
    ChargebackResponse result = apiInstance.putChargebacksTokenGrantprovisionalcredit(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#putChargebacksTokenGrantprovisionalcredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putChargebacksTokenReverseprovisionalcredit"></a>
# **putChargebacksTokenReverseprovisionalcredit**
> ChargebackResponse putChargebacksTokenReverseprovisionalcredit(token)

Reverses provisional credit



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChargebacksApi;


ChargebacksApi apiInstance = new ChargebacksApi();
String token = "token_example"; // String | 
try {
    ChargebackResponse result = apiInstance.putChargebacksTokenReverseprovisionalcredit(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebacksApi#putChargebacksTokenReverseprovisionalcredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**ChargebackResponse**](ChargebackResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


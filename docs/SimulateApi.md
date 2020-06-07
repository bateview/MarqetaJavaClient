# SimulateApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postSimulateAuthorization**](SimulateApi.md#postSimulateAuthorization) | **POST** /simulate/authorization | Simulates an authorization
[**postSimulateAuthorizationAdvice**](SimulateApi.md#postSimulateAuthorizationAdvice) | **POST** /simulate/authorization/advice | Simulates an authorization advice transaction
[**postSimulateClearing**](SimulateApi.md#postSimulateClearing) | **POST** /simulate/clearing | Simulates a clearing/settlement transaction
[**postSimulateDirectdeposits**](SimulateApi.md#postSimulateDirectdeposits) | **POST** /simulate/directdeposits | Simulates the creation of direct deposit
[**postSimulateFinancial**](SimulateApi.md#postSimulateFinancial) | **POST** /simulate/financial | Simulates a financial request (PIN debit) transaction with optional cash back
[**postSimulateFinancialAdvice**](SimulateApi.md#postSimulateFinancialAdvice) | **POST** /simulate/financial/advice | Simulates a financial advice transaction
[**postSimulateFinancialBalanceinquiry**](SimulateApi.md#postSimulateFinancialBalanceinquiry) | **POST** /simulate/financial/balanceinquiry | Simulates a balance inquiry
[**postSimulateFinancialOriginalcredit**](SimulateApi.md#postSimulateFinancialOriginalcredit) | **POST** /simulate/financial/originalcredit | Simulates an orignal credit transaction
[**postSimulateFinancialWithdrawal**](SimulateApi.md#postSimulateFinancialWithdrawal) | **POST** /simulate/financial/withdrawal | Simulates an ATM withdrawal transaction
[**postSimulateReversal**](SimulateApi.md#postSimulateReversal) | **POST** /simulate/reversal | Simulates a reversal transaction


<a name="postSimulateAuthorization"></a>
# **postSimulateAuthorization**
> SimulationResponseModel postSimulateAuthorization(body)

Simulates an authorization



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
AuthRequestModel body = new AuthRequestModel(); // AuthRequestModel | 
try {
    SimulationResponseModel result = apiInstance.postSimulateAuthorization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateAuthorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthRequestModel**](AuthRequestModel.md)|  | [optional]

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateAuthorizationAdvice"></a>
# **postSimulateAuthorizationAdvice**
> SimulationResponseModel postSimulateAuthorizationAdvice(body)

Simulates an authorization advice transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
AuthorizationAdviceModel body = new AuthorizationAdviceModel(); // AuthorizationAdviceModel | 
try {
    SimulationResponseModel result = apiInstance.postSimulateAuthorizationAdvice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateAuthorizationAdvice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthorizationAdviceModel**](AuthorizationAdviceModel.md)|  | [optional]

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateClearing"></a>
# **postSimulateClearing**
> SimulationResponseModel postSimulateClearing(body)

Simulates a clearing/settlement transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
ClearingModel body = new ClearingModel(); // ClearingModel | 
try {
    SimulationResponseModel result = apiInstance.postSimulateClearing(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateClearing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearingModel**](ClearingModel.md)|  | [optional]

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateDirectdeposits"></a>
# **postSimulateDirectdeposits**
> DepositDepositResponse postSimulateDirectdeposits(body)

Simulates the creation of direct deposit



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
DirectDepositRequest body = new DirectDepositRequest(); // DirectDepositRequest | Direct deposit simulate request model
try {
    DepositDepositResponse result = apiInstance.postSimulateDirectdeposits(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateDirectdeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectDepositRequest**](DirectDepositRequest.md)| Direct deposit simulate request model |

### Return type

[**DepositDepositResponse**](DepositDepositResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateFinancial"></a>
# **postSimulateFinancial**
> SimulationResponseModel postSimulateFinancial(body)

Simulates a financial request (PIN debit) transaction with optional cash back



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
FinancialRequestModel body = new FinancialRequestModel(); // FinancialRequestModel | Financial request model
try {
    SimulationResponseModel result = apiInstance.postSimulateFinancial(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateFinancial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FinancialRequestModel**](FinancialRequestModel.md)| Financial request model |

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateFinancialAdvice"></a>
# **postSimulateFinancialAdvice**
> SimulationResponseModel postSimulateFinancialAdvice(body)

Simulates a financial advice transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
AuthorizationAdviceModel body = new AuthorizationAdviceModel(); // AuthorizationAdviceModel | Financial advice request model
try {
    SimulationResponseModel result = apiInstance.postSimulateFinancialAdvice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateFinancialAdvice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthorizationAdviceModel**](AuthorizationAdviceModel.md)| Financial advice request model |

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateFinancialBalanceinquiry"></a>
# **postSimulateFinancialBalanceinquiry**
> SimulationResponseModel postSimulateFinancialBalanceinquiry(body)

Simulates a balance inquiry



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
BalanceInquiryRequestModel body = new BalanceInquiryRequestModel(); // BalanceInquiryRequestModel | Balance inquiry request model
try {
    SimulationResponseModel result = apiInstance.postSimulateFinancialBalanceinquiry(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateFinancialBalanceinquiry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BalanceInquiryRequestModel**](BalanceInquiryRequestModel.md)| Balance inquiry request model |

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateFinancialOriginalcredit"></a>
# **postSimulateFinancialOriginalcredit**
> SimulationResponseModel postSimulateFinancialOriginalcredit(body)

Simulates an orignal credit transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
OrignalcreditRequestModel body = new OrignalcreditRequestModel(); // OrignalcreditRequestModel | Orignal Credit request model
try {
    SimulationResponseModel result = apiInstance.postSimulateFinancialOriginalcredit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateFinancialOriginalcredit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrignalcreditRequestModel**](OrignalcreditRequestModel.md)| Orignal Credit request model |

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateFinancialWithdrawal"></a>
# **postSimulateFinancialWithdrawal**
> SimulationResponseModel postSimulateFinancialWithdrawal(body)

Simulates an ATM withdrawal transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
WithdrawalRequestModel body = new WithdrawalRequestModel(); // WithdrawalRequestModel | ATM withdrawal request model
try {
    SimulationResponseModel result = apiInstance.postSimulateFinancialWithdrawal(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateFinancialWithdrawal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawalRequestModel**](WithdrawalRequestModel.md)| ATM withdrawal request model |

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSimulateReversal"></a>
# **postSimulateReversal**
> SimulationResponseModel postSimulateReversal(body)

Simulates a reversal transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SimulateApi;


SimulateApi apiInstance = new SimulateApi();
ReversalModel body = new ReversalModel(); // ReversalModel | 
try {
    SimulationResponseModel result = apiInstance.postSimulateReversal(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulateApi#postSimulateReversal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReversalModel**](ReversalModel.md)|  | [optional]

### Return type

[**SimulationResponseModel**](SimulationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


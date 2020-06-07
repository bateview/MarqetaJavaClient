# ProgramReserveApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deposit**](ProgramReserveApi.md#deposit) | **POST** /programreserve/deposits | 
[**getProgramReserveDeposits**](ProgramReserveApi.md#getProgramReserveDeposits) | **GET** /programreserve/deposits | 
[**getProgramreserveBalances**](ProgramReserveApi.md#getProgramreserveBalances) | **GET** /programreserve/balances | Returns the latest balance in the program reserve account
[**getProgramreserveTransactions**](ProgramReserveApi.md#getProgramreserveTransactions) | **GET** /programreserve/transactions | Returns a list of program reserve transactions (credits and debits)
[**postProgramreserveTransactions**](ProgramReserveApi.md#postProgramreserveTransactions) | **POST** /programreserve/transactions | Credits or debits the program reserve account


<a name="deposit"></a>
# **deposit**
> deposit(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramReserveApi;


ProgramReserveApi apiInstance = new ProgramReserveApi();
ProgramReserveDepositRequest body = new ProgramReserveDepositRequest(); // ProgramReserveDepositRequest | 
try {
    apiInstance.deposit(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramReserveApi#deposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProgramReserveDepositRequest**](ProgramReserveDepositRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProgramReserveDeposits"></a>
# **getProgramReserveDeposits**
> getProgramReserveDeposits(count, startIndex, sortBy)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramReserveApi;


ProgramReserveApi apiInstance = new ProgramReserveApi();
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    apiInstance.getProgramReserveDeposits(count, startIndex, sortBy);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramReserveApi#getProgramReserveDeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProgramreserveBalances"></a>
# **getProgramreserveBalances**
> ProgramReserveAccountBalance getProgramreserveBalances()

Returns the latest balance in the program reserve account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramReserveApi;


ProgramReserveApi apiInstance = new ProgramReserveApi();
try {
    ProgramReserveAccountBalance result = apiInstance.getProgramreserveBalances();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramReserveApi#getProgramreserveBalances");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProgramReserveAccountBalance**](ProgramReserveAccountBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProgramreserveTransactions"></a>
# **getProgramreserveTransactions**
> ProgramReserveTransactionResponse getProgramreserveTransactions(count, startIndex, sortBy, body)

Returns a list of program reserve transactions (credits and debits)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramReserveApi;


ProgramReserveApi apiInstance = new ProgramReserveApi();
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
String body = "body_example"; // String | Type
try {
    ProgramReserveTransactionResponse result = apiInstance.getProgramreserveTransactions(count, startIndex, sortBy, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramReserveApi#getProgramreserveTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]
 **body** | **String**| Type | [optional]

### Return type

[**ProgramReserveTransactionResponse**](ProgramReserveTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postProgramreserveTransactions"></a>
# **postProgramreserveTransactions**
> ProgramReserveTransactionResponse postProgramreserveTransactions(body)

Credits or debits the program reserve account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProgramReserveApi;


ProgramReserveApi apiInstance = new ProgramReserveApi();
ProgramReserveTransactionRequest body = new ProgramReserveTransactionRequest(); // ProgramReserveTransactionRequest | 
try {
    ProgramReserveTransactionResponse result = apiInstance.postProgramreserveTransactions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramReserveApi#postProgramreserveTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProgramReserveTransactionRequest**](ProgramReserveTransactionRequest.md)|  | [optional]

### Return type

[**ProgramReserveTransactionResponse**](ProgramReserveTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


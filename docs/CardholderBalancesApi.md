# CardholderBalancesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalancesToken**](CardholderBalancesApi.md#getBalancesToken) | **GET** /balances/{token} | Returns account balances for a cardholder
[**getBalancesTokenMsas**](CardholderBalancesApi.md#getBalancesTokenMsas) | **GET** /balances/{token}/msas | Returns a merchant-specific account balance


<a name="getBalancesToken"></a>
# **getBalancesToken**
> CardholderBalances getBalancesToken(token)

Returns account balances for a cardholder



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardholderBalancesApi;


CardholderBalancesApi apiInstance = new CardholderBalancesApi();
String token = "token_example"; // String | User or Business token
try {
    CardholderBalances result = apiInstance.getBalancesToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardholderBalancesApi#getBalancesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User or Business token |

### Return type

[**CardholderBalances**](CardholderBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalancesTokenMsas"></a>
# **getBalancesTokenMsas**
> CardholderMsaBalance getBalancesTokenMsas(token, count, startIndex, sortBy)

Returns a merchant-specific account balance



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardholderBalancesApi;


CardholderBalancesApi apiInstance = new CardholderBalancesApi();
String token = "token_example"; // String | User or Business token
Integer count = 5; // Integer | Number of restrictions to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "sortBy_example"; // String | Sort order
try {
    CardholderMsaBalance result = apiInstance.getBalancesTokenMsas(token, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardholderBalancesApi#getBalancesTokenMsas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User or Business token |
 **count** | **Integer**| Number of restrictions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [enum: name]

### Return type

[**CardholderMsaBalance**](CardholderMsaBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


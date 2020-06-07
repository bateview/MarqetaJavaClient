# OfferOrdersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOfferordersToken**](OfferOrdersApi.md#getOfferordersToken) | **GET** /offerorders/{token} | Returns a purchase order for a specific offer
[**postOfferorders**](OfferOrdersApi.md#postOfferorders) | **POST** /offerorders | Creates an offer order


<a name="getOfferordersToken"></a>
# **getOfferordersToken**
> OfferOrderResponse getOfferordersToken(token)

Returns a purchase order for a specific offer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OfferOrdersApi;


OfferOrdersApi apiInstance = new OfferOrdersApi();
String token = "token_example"; // String | Order token
try {
    OfferOrderResponse result = apiInstance.getOfferordersToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferOrdersApi#getOfferordersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Order token |

### Return type

[**OfferOrderResponse**](OfferOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postOfferorders"></a>
# **postOfferorders**
> OfferOrderResponse postOfferorders(body)

Creates an offer order



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OfferOrdersApi;


OfferOrdersApi apiInstance = new OfferOrdersApi();
OfferOrderRequest body = new OfferOrderRequest(); // OfferOrderRequest | 
try {
    OfferOrderResponse result = apiInstance.postOfferorders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferOrdersApi#postOfferorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OfferOrderRequest**](OfferOrderRequest.md)|  | [optional]

### Return type

[**OfferOrderResponse**](OfferOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


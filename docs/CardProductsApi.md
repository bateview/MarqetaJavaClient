# CardProductsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardproducts**](CardProductsApi.md#getCardproducts) | **GET** /cardproducts | Lists all card products
[**getCardproductsToken**](CardProductsApi.md#getCardproductsToken) | **GET** /cardproducts/{token} | Returns a specific card product
[**postCardproducts**](CardProductsApi.md#postCardproducts) | **POST** /cardproducts | Creates a card product
[**putCardproductsToken**](CardProductsApi.md#putCardproductsToken) | **PUT** /cardproducts/{token} | Updates a specific card product


<a name="getCardproducts"></a>
# **getCardproducts**
> CardProductListResponse getCardproducts(count, startIndex)

Lists all card products



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardProductsApi;


CardProductsApi apiInstance = new CardProductsApi();
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
try {
    CardProductListResponse result = apiInstance.getCardproducts(count, startIndex);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardProductsApi#getCardproducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]

### Return type

[**CardProductListResponse**](CardProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardproductsToken"></a>
# **getCardproductsToken**
> CardProductResponse getCardproductsToken(token)

Returns a specific card product



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardProductsApi;


CardProductsApi apiInstance = new CardProductsApi();
String token = "token_example"; // String | Card product token
try {
    CardProductResponse result = apiInstance.getCardproductsToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardProductsApi#getCardproductsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card product token |

### Return type

[**CardProductResponse**](CardProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCardproducts"></a>
# **postCardproducts**
> CardProductResponse postCardproducts(body)

Creates a card product



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardProductsApi;


CardProductsApi apiInstance = new CardProductsApi();
CardProductRequest body = new CardProductRequest(); // CardProductRequest | Card product object
try {
    CardProductResponse result = apiInstance.postCardproducts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardProductsApi#postCardproducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardProductRequest**](CardProductRequest.md)| Card product object |

### Return type

[**CardProductResponse**](CardProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCardproductsToken"></a>
# **putCardproductsToken**
> CardProductResponse putCardproductsToken(token, body)

Updates a specific card product



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardProductsApi;


CardProductsApi apiInstance = new CardProductsApi();
String token = "token_example"; // String | Card product token
CardProductUpdateModel body = new CardProductUpdateModel(); // CardProductUpdateModel | Card product object
try {
    CardProductResponse result = apiInstance.putCardproductsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardProductsApi#putCardproductsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card product token |
 **body** | [**CardProductUpdateModel**](CardProductUpdateModel.md)| Card product object |

### Return type

[**CardProductResponse**](CardProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


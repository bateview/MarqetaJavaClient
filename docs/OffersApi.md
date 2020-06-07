# OffersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOffers**](OffersApi.md#getOffers) | **GET** /offers | Lists all offers
[**getOffersToken**](OffersApi.md#getOffersToken) | **GET** /offers/{token} | Returns a specific offer
[**postOffers**](OffersApi.md#postOffers) | **POST** /offers | Creates an offer
[**putOffersToken**](OffersApi.md#putOffersToken) | **PUT** /offers/{token} | Updates an offer


<a name="getOffers"></a>
# **getOffers**
> OfferListResponse getOffers(count, startIndex, fields, sortBy)

Lists all offers



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance = new OffersApi();
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    OfferListResponse result = apiInstance.getOffers(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#getOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**OfferListResponse**](OfferListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOffersToken"></a>
# **getOffersToken**
> OfferResponseModel getOffersToken(token, fields)

Returns a specific offer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance = new OffersApi();
String token = "token_example"; // String | Offer token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    OfferResponseModel result = apiInstance.getOffersToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#getOffersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Offer token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**OfferResponseModel**](OfferResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOffers"></a>
# **postOffers**
> OfferResponseModel postOffers(body)

Creates an offer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance = new OffersApi();
OfferModel body = new OfferModel(); // OfferModel | 
try {
    OfferResponseModel result = apiInstance.postOffers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#postOffers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OfferModel**](OfferModel.md)|  | [optional]

### Return type

[**OfferResponseModel**](OfferResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putOffersToken"></a>
# **putOffersToken**
> OfferResponseModel putOffersToken(token, body)

Updates an offer



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OffersApi;


OffersApi apiInstance = new OffersApi();
String token = "token_example"; // String | Offer token
OfferUpdateModel body = new OfferUpdateModel(); // OfferUpdateModel | 
try {
    OfferResponseModel result = apiInstance.putOffersToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OffersApi#putOffersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Offer token |
 **body** | [**OfferUpdateModel**](OfferUpdateModel.md)|  | [optional]

### Return type

[**OfferResponseModel**](OfferResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


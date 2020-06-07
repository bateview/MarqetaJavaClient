# CardTransitionsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardtransitionsCardToken**](CardTransitionsApi.md#getCardtransitionsCardToken) | **GET** /cardtransitions/card/{token} | Lists all card transitions
[**getCardtransitionsToken**](CardTransitionsApi.md#getCardtransitionsToken) | **GET** /cardtransitions/{token} | Returns a card transition object
[**postCardtransitions**](CardTransitionsApi.md#postCardtransitions) | **POST** /cardtransitions | Creates a card transition object


<a name="getCardtransitionsCardToken"></a>
# **getCardtransitionsCardToken**
> CardTransitionListResponse getCardtransitionsCardToken(token, count, startIndex, fields, sortBy)

Lists all card transitions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardTransitionsApi;


CardTransitionsApi apiInstance = new CardTransitionsApi();
String token = "token_example"; // String | Card token
Integer count = 5; // Integer | Number of card transitions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    CardTransitionListResponse result = apiInstance.getCardtransitionsCardToken(token, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardTransitionsApi#getCardtransitionsCardToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card token |
 **count** | **Integer**| Number of card transitions to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**CardTransitionListResponse**](CardTransitionListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardtransitionsToken"></a>
# **getCardtransitionsToken**
> CardTransitionResponse getCardtransitionsToken(token, fields)

Returns a card transition object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardTransitionsApi;


CardTransitionsApi apiInstance = new CardTransitionsApi();
String token = "token_example"; // String | Card transition token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CardTransitionResponse result = apiInstance.getCardtransitionsToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardTransitionsApi#getCardtransitionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card transition token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CardTransitionResponse**](CardTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCardtransitions"></a>
# **postCardtransitions**
> CardTransitionResponse postCardtransitions(body)

Creates a card transition object



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardTransitionsApi;


CardTransitionsApi apiInstance = new CardTransitionsApi();
CardTransitionRequest body = new CardTransitionRequest(); // CardTransitionRequest | 
try {
    CardTransitionResponse result = apiInstance.postCardtransitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardTransitionsApi#postCardtransitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardTransitionRequest**](CardTransitionRequest.md)|  | [optional]

### Return type

[**CardTransitionResponse**](CardTransitionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


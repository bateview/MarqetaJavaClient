# CardsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCards**](CardsApi.md#getCards) | **GET** /cards | Lists cards by the last 4 digits
[**getCardsBarcodeBarcode**](CardsApi.md#getCardsBarcodeBarcode) | **GET** /cards/barcode/{barcode} | Returns a card&#39;s metadata
[**getCardsMerchantMerchanttoken**](CardsApi.md#getCardsMerchantMerchanttoken) | **GET** /cards/merchant/{merchant_token} | Returns a merchant onboarding card
[**getCardsMerchantMerchanttokenShowpan**](CardsApi.md#getCardsMerchantMerchanttokenShowpan) | **GET** /cards/merchant/{merchant_token}/showpan | Returns a specific card - PAN visible
[**getCardsToken**](CardsApi.md#getCardsToken) | **GET** /cards/{token} | Returns a specific card
[**getCardsTokenShowpan**](CardsApi.md#getCardsTokenShowpan) | **GET** /cards/{token}/showpan | Returns a specific card - PAN visible
[**getCardsUserToken**](CardsApi.md#getCardsUserToken) | **GET** /cards/user/{token} | Lists all cards for a specific user
[**postCards**](CardsApi.md#postCards) | **POST** /cards | Creates a card
[**postCardsGetbypan**](CardsApi.md#postCardsGetbypan) | **POST** /cards/getbypan | Returns user and card tokens for the specified PAN
[**postCardsMerchantMerchanttoken**](CardsApi.md#postCardsMerchantMerchanttoken) | **POST** /cards/merchant/{merchant_token} | Creates a merchant onboarding card
[**putCardsToken**](CardsApi.md#putCardsToken) | **PUT** /cards/{token} | Updates a specific card


<a name="getCards"></a>
# **getCards**
> CardListResponse getCards(lastFour, count, startIndex, fields, sortBy)

Lists cards by the last 4 digits



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String lastFour = "lastFour_example"; // String | Last four digits of card number
Integer count = 5; // Integer | Number of cards to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    CardListResponse result = apiInstance.getCards(lastFour, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastFour** | **String**| Last four digits of card number |
 **count** | **Integer**| Number of cards to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**CardListResponse**](CardListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsBarcodeBarcode"></a>
# **getCardsBarcodeBarcode**
> CardResponse getCardsBarcodeBarcode(barcode, fields)

Returns a card&#39;s metadata



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String barcode = "barcode_example"; // String | Barcode
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CardResponse result = apiInstance.getCardsBarcodeBarcode(barcode, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsBarcodeBarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **barcode** | **String**| Barcode |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsMerchantMerchanttoken"></a>
# **getCardsMerchantMerchanttoken**
> CardResponse getCardsMerchantMerchanttoken(merchantToken, fields)

Returns a merchant onboarding card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String merchantToken = "merchantToken_example"; // String | Merchant token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CardResponse result = apiInstance.getCardsMerchantMerchanttoken(merchantToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsMerchantMerchanttoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantToken** | **String**| Merchant token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsMerchantMerchanttokenShowpan"></a>
# **getCardsMerchantMerchanttokenShowpan**
> CardResponse getCardsMerchantMerchanttokenShowpan(merchantToken, fields, showCvvNumber)

Returns a specific card - PAN visible



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String merchantToken = "merchantToken_example"; // String | Merchant token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
Boolean showCvvNumber = true; // Boolean | 
try {
    CardResponse result = apiInstance.getCardsMerchantMerchanttokenShowpan(merchantToken, fields, showCvvNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsMerchantMerchanttokenShowpan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantToken** | **String**| Merchant token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **showCvvNumber** | **Boolean**|  | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsToken"></a>
# **getCardsToken**
> CardResponse getCardsToken(token, fields, expand)

Returns a specific card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String token = "token_example"; // String | Card token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String expand = "expand_example"; // String | Object to expand
try {
    CardResponse result = apiInstance.getCardsToken(token, fields, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **expand** | **String**| Object to expand | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsTokenShowpan"></a>
# **getCardsTokenShowpan**
> CardResponse getCardsTokenShowpan(token, fields, showCvvNumber)

Returns a specific card - PAN visible



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String token = "token_example"; // String | Card token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
Boolean showCvvNumber = true; // Boolean | 
try {
    CardResponse result = apiInstance.getCardsTokenShowpan(token, fields, showCvvNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsTokenShowpan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **showCvvNumber** | **Boolean**|  | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCardsUserToken"></a>
# **getCardsUserToken**
> CardResponse getCardsUserToken(token, count, startIndex, fields, sortBy)

Lists all cards for a specific user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String token = "token_example"; // String | User token
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    CardResponse result = apiInstance.getCardsUserToken(token, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#getCardsUserToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCards"></a>
# **postCards**
> CardResponse postCards(body, showCvvNumber, showPan)

Creates a card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
CardRequest body = new CardRequest(); // CardRequest | 
Boolean showCvvNumber = false; // Boolean | Show CVV
Boolean showPan = false; // Boolean | Show PAN
try {
    CardResponse result = apiInstance.postCards(body, showCvvNumber, showPan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#postCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardRequest**](CardRequest.md)|  | [optional]
 **showCvvNumber** | **Boolean**| Show CVV | [optional] [default to false]
 **showPan** | **Boolean**| Show PAN | [optional] [default to false]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCardsGetbypan"></a>
# **postCardsGetbypan**
> PanResponse postCardsGetbypan(body)

Returns user and card tokens for the specified PAN



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
PanRequest body = new PanRequest(); // PanRequest | 
try {
    PanResponse result = apiInstance.postCardsGetbypan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#postCardsGetbypan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PanRequest**](PanRequest.md)|  | [optional]

### Return type

[**PanResponse**](PanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCardsMerchantMerchanttoken"></a>
# **postCardsMerchantMerchanttoken**
> CardResponse postCardsMerchantMerchanttoken(merchantToken, body)

Creates a merchant onboarding card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String merchantToken = "merchantToken_example"; // String | Merchant token
MerchantCardRequest body = new MerchantCardRequest(); // MerchantCardRequest | 
try {
    CardResponse result = apiInstance.postCardsMerchantMerchanttoken(merchantToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#postCardsMerchantMerchanttoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantToken** | **String**| Merchant token |
 **body** | [**MerchantCardRequest**](MerchantCardRequest.md)|  | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCardsToken"></a>
# **putCardsToken**
> CardResponse putCardsToken(token, body)

Updates a specific card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CardsApi;


CardsApi apiInstance = new CardsApi();
String token = "token_example"; // String | Card token
CardUpdateRequest body = new CardUpdateRequest(); // CardUpdateRequest | 
try {
    CardResponse result = apiInstance.putCardsToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardsApi#putCardsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Card token |
 **body** | [**CardUpdateRequest**](CardUpdateRequest.md)|  | [optional]

### Return type

[**CardResponse**](CardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


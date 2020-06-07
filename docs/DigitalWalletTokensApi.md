# DigitalWalletTokensApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDigitalwallettokens**](DigitalWalletTokensApi.md#getDigitalwallettokens) | **GET** /digitalwallettokens | Returns digital wallet tokens
[**getDigitalwallettokensCardCardtoken**](DigitalWalletTokensApi.md#getDigitalwallettokensCardCardtoken) | **GET** /digitalwallettokens/card/{card_token} | Returns a list of digital wallet tokens for the specified card
[**getDigitalwallettokensToken**](DigitalWalletTokensApi.md#getDigitalwallettokensToken) | **GET** /digitalwallettokens/{token} | Returns a specific digital wallet token
[**getDigitalwallettokensTokenShowtokenpan**](DigitalWalletTokensApi.md#getDigitalwallettokensTokenShowtokenpan) | **GET** /digitalwallettokens/{token}/showtokenpan | Returns a specific digital wallet token PAN visible


<a name="getDigitalwallettokens"></a>
# **getDigitalwallettokens**
> DigitalWalletTokenListResponse getDigitalwallettokens(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed)

Returns digital wallet tokens



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokensApi;


DigitalWalletTokensApi apiInstance = new DigitalWalletTokensApi();
Integer count = 10; // Integer | Number of digital wallet tokens to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
String startDate = "startDate_example"; // String | Start date (yyyy-MM-dd)
String endDate = "endDate_example"; // String | End date (yyyy-MM-dd)
String panReferenceId = "panReferenceId_example"; // String | PAN reference ID
String tokenReferenceId = "tokenReferenceId_example"; // String | Token reference ID
String correlationId = "correlationId_example"; // String | Correlation ID
String tokenType = "tokenType_example"; // String | Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT
String tokenRequestorName = "tokenRequestorName_example"; // String | Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN
String state = "state_example"; // String | Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE
String embed = "embed_example"; // String | Embed
try {
    DigitalWalletTokenListResponse result = apiInstance.getDigitalwallettokens(count, startIndex, fields, sortBy, startDate, endDate, panReferenceId, tokenReferenceId, correlationId, tokenType, tokenRequestorName, state, embed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokensApi#getDigitalwallettokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of digital wallet tokens to retrieve | [optional] [default to 10]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]
 **startDate** | **String**| Start date (yyyy-MM-dd) | [optional]
 **endDate** | **String**| End date (yyyy-MM-dd) | [optional]
 **panReferenceId** | **String**| PAN reference ID | [optional]
 **tokenReferenceId** | **String**| Token reference ID | [optional]
 **correlationId** | **String**| Correlation ID | [optional]
 **tokenType** | **String**| Comma-delimited list of digital wallet token types to display e.g. DEVICE_SECURE_ELEMENT | MERCHANT_CARD_ON_FILE | DEVICE_CLOUD_BASED | ECOMMERCE_DIGITAL_WALLET | PSEUDO_ACCOUNT | [optional]
 **tokenRequestorName** | **String**| Comma-delimited list of digital wallet token wallet providers to display e.g. APPLE_PAY | ANDROID_PAY| SAMSUNG_PAY | MICROSOFT_PAY | VISA_CHECKOUT | FACEBOOK | NETFLIX | UNKNOWN | [optional]
 **state** | **String**| Comma-delimited list of digital wallet token states to display e.g. REQUESTED | REQUEST_DECLINED | TERMINATED | SUSPENDED | ACTIVE | [optional]
 **embed** | **String**| Embed | [optional] [enum: user]

### Return type

[**DigitalWalletTokenListResponse**](DigitalWalletTokenListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalwallettokensCardCardtoken"></a>
# **getDigitalwallettokensCardCardtoken**
> DigitalWalletTokenListResponse getDigitalwallettokensCardCardtoken(cardToken, count, startIndex, sortBy)

Returns a list of digital wallet tokens for the specified card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokensApi;


DigitalWalletTokensApi apiInstance = new DigitalWalletTokensApi();
String cardToken = "cardToken_example"; // String | Card token
Integer count = 5; // Integer | Number of items to retrieve
Integer startIndex = 0; // Integer | Start index
String sortBy = "-createdTime"; // String | Sort order
try {
    DigitalWalletTokenListResponse result = apiInstance.getDigitalwallettokensCardCardtoken(cardToken, count, startIndex, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokensApi#getDigitalwallettokensCardCardtoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardToken** | **String**| Card token |
 **count** | **Integer**| Number of items to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**DigitalWalletTokenListResponse**](DigitalWalletTokenListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalwallettokensToken"></a>
# **getDigitalwallettokensToken**
> DigitalWalletToken getDigitalwallettokensToken(token)

Returns a specific digital wallet token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokensApi;


DigitalWalletTokensApi apiInstance = new DigitalWalletTokensApi();
String token = "token_example"; // String | Digital wallet token
try {
    DigitalWalletToken result = apiInstance.getDigitalwallettokensToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokensApi#getDigitalwallettokensToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Digital wallet token |

### Return type

[**DigitalWalletToken**](DigitalWalletToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalwallettokensTokenShowtokenpan"></a>
# **getDigitalwallettokensTokenShowtokenpan**
> DigitalWalletToken getDigitalwallettokensTokenShowtokenpan(token)

Returns a specific digital wallet token PAN visible



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletTokensApi;


DigitalWalletTokensApi apiInstance = new DigitalWalletTokensApi();
String token = "token_example"; // String | Digital wallet token
try {
    DigitalWalletToken result = apiInstance.getDigitalwallettokensTokenShowtokenpan(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletTokensApi#getDigitalwallettokensTokenShowtokenpan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Digital wallet token |

### Return type

[**DigitalWalletToken**](DigitalWalletToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# WebhooksApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Returns a list of webhook configurations
[**getWebhooksToken**](WebhooksApi.md#getWebhooksToken) | **GET** /webhooks/{token} | Returns a webhook configuration
[**postWebhooks**](WebhooksApi.md#postWebhooks) | **POST** /webhooks | Creates a webhook configuration
[**postWebhooksTokenEventtypeEventtoken**](WebhooksApi.md#postWebhooksTokenEventtypeEventtoken) | **POST** /webhooks/{token}/{event_type}/{event_token} | Replays an event to a webhook
[**postWebhooksTokenPing**](WebhooksApi.md#postWebhooksTokenPing) | **POST** /webhooks/{token}/ping | Pings a webhook
[**putWebhooksToken**](WebhooksApi.md#putWebhooksToken) | **PUT** /webhooks/customheaders/{token} | Updates a specific webhook configuration
[**putWebhooksToken_0**](WebhooksApi.md#putWebhooksToken_0) | **PUT** /webhooks/{token} | Updates a specific webhook configuration


<a name="getWebhooks"></a>
# **getWebhooks**
> WebhookResponseModel getWebhooks(active, count, startIndex, fields, sortBy)

Returns a list of webhook configurations



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
Boolean active = false; // Boolean | Return only active webhook configurations
Integer count = 5; // Integer | Number of reward programs to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-createdTime"; // String | Sort order
try {
    WebhookResponseModel result = apiInstance.getWebhooks(active, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| Return only active webhook configurations | [optional] [default to false]
 **count** | **Integer**| Number of reward programs to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -createdTime]

### Return type

[**WebhookResponseModel**](WebhookResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooksToken"></a>
# **getWebhooksToken**
> WebhookResponseModel getWebhooksToken(token)

Returns a webhook configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String token = "token_example"; // String | Webhook token
try {
    WebhookResponseModel result = apiInstance.getWebhooksToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooksToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Webhook token |

### Return type

[**WebhookResponseModel**](WebhookResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postWebhooks"></a>
# **postWebhooks**
> WebhookResponseModel postWebhooks(body)

Creates a webhook configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
WebhookRequestModel body = new WebhookRequestModel(); // WebhookRequestModel | 
try {
    WebhookResponseModel result = apiInstance.postWebhooks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#postWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookRequestModel**](WebhookRequestModel.md)|  | [optional]

### Return type

[**WebhookResponseModel**](WebhookResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWebhooksTokenEventtypeEventtoken"></a>
# **postWebhooksTokenEventtypeEventtoken**
> postWebhooksTokenEventtypeEventtoken(token, eventType, eventToken)

Replays an event to a webhook



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String token = "token_example"; // String | Webhook token
String eventType = "eventType_example"; // String | Event type
String eventToken = "eventToken_example"; // String | Event token
try {
    apiInstance.postWebhooksTokenEventtypeEventtoken(token, eventType, eventToken);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#postWebhooksTokenEventtypeEventtoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Webhook token |
 **eventType** | **String**| Event type | [enum: chargebacktransition, digitalwallettokentransition, cardtransition, usertransition, businesstransition, transaction]
 **eventToken** | **String**| Event token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postWebhooksTokenPing"></a>
# **postWebhooksTokenPing**
> WebhookPingModel postWebhooksTokenPing(token)

Pings a webhook

Endpoints must respond with a 200 status code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String token = "token_example"; // String | Ping a webhook
try {
    WebhookPingModel result = apiInstance.postWebhooksTokenPing(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#postWebhooksTokenPing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Ping a webhook |

### Return type

[**WebhookPingModel**](WebhookPingModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putWebhooksToken"></a>
# **putWebhooksToken**
> WebhookResponseModel putWebhooksToken(token, body)

Updates a specific webhook configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String token = "token_example"; // String | Webhook token
WebhookUpdateCustomHeaderRequest body = new WebhookUpdateCustomHeaderRequest(); // WebhookUpdateCustomHeaderRequest | 
try {
    WebhookResponseModel result = apiInstance.putWebhooksToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#putWebhooksToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Webhook token |
 **body** | [**WebhookUpdateCustomHeaderRequest**](WebhookUpdateCustomHeaderRequest.md)|  | [optional]

### Return type

[**WebhookResponseModel**](WebhookResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWebhooksToken_0"></a>
# **putWebhooksToken_0**
> WebhookResponseModel putWebhooksToken_0(token, body)

Updates a specific webhook configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WebhooksApi;


WebhooksApi apiInstance = new WebhooksApi();
String token = "token_example"; // String | Webhook token
WebhookBaseModel body = new WebhookBaseModel(); // WebhookBaseModel | 
try {
    WebhookResponseModel result = apiInstance.putWebhooksToken_0(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#putWebhooksToken_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Webhook token |
 **body** | [**WebhookBaseModel**](WebhookBaseModel.md)|  | [optional]

### Return type

[**WebhookResponseModel**](WebhookResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


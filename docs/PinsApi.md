# PinsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPinsControltoken**](PinsApi.md#postPinsControltoken) | **POST** /pins/controltoken | Creates a new control token for a PIN
[**putPins**](PinsApi.md#putPins) | **PUT** /pins | Updates the PIN control token


<a name="postPinsControltoken"></a>
# **postPinsControltoken**
> ControlTokenResponse postPinsControltoken(body)

Creates a new control token for a PIN

Creates a new control token for a PIN for the specified card for PIN debit or ATM transactions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PinsApi;


PinsApi apiInstance = new PinsApi();
ControlTokenRequest body = new ControlTokenRequest(); // ControlTokenRequest | 
try {
    ControlTokenResponse result = apiInstance.postPinsControltoken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#postPinsControltoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControlTokenRequest**](ControlTokenRequest.md)|  | [optional]

### Return type

[**ControlTokenResponse**](ControlTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPins"></a>
# **putPins**
> putPins(body)

Updates the PIN control token

Updates a PIN identified by its control token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PinsApi;


PinsApi apiInstance = new PinsApi();
PinRequest body = new PinRequest(); // PinRequest | 
try {
    apiInstance.putPins(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PinsApi#putPins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PinRequest**](PinRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# DigitalWalletProvisionRequestsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postDigitalwalletprovisionrequestsAndroidpay**](DigitalWalletProvisionRequestsApi.md#postDigitalwalletprovisionrequestsAndroidpay) | **POST** /digitalwalletprovisionrequests/androidpay | Validates and creates Android-specific provisioning request data
[**postDigitalwalletprovisionrequestsApplepay**](DigitalWalletProvisionRequestsApi.md#postDigitalwalletprovisionrequestsApplepay) | **POST** /digitalwalletprovisionrequests/applepay | Validates Apple certificates and creates Apple-specific provisioning request data


<a name="postDigitalwalletprovisionrequestsAndroidpay"></a>
# **postDigitalwalletprovisionrequestsAndroidpay**
> DigitalWalletAndroidPayProvisionResponse postDigitalwalletprovisionrequestsAndroidpay(body)

Validates and creates Android-specific provisioning request data



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletProvisionRequestsApi;


DigitalWalletProvisionRequestsApi apiInstance = new DigitalWalletProvisionRequestsApi();
DigitalWalletAndroidPayProvisionRequest body = new DigitalWalletAndroidPayProvisionRequest(); // DigitalWalletAndroidPayProvisionRequest | 
try {
    DigitalWalletAndroidPayProvisionResponse result = apiInstance.postDigitalwalletprovisionrequestsAndroidpay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletProvisionRequestsApi#postDigitalwalletprovisionrequestsAndroidpay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DigitalWalletAndroidPayProvisionRequest**](DigitalWalletAndroidPayProvisionRequest.md)|  | [optional]

### Return type

[**DigitalWalletAndroidPayProvisionResponse**](DigitalWalletAndroidPayProvisionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDigitalwalletprovisionrequestsApplepay"></a>
# **postDigitalwalletprovisionrequestsApplepay**
> DigitalWalletApplePayProvisionResponse postDigitalwalletprovisionrequestsApplepay(body)

Validates Apple certificates and creates Apple-specific provisioning request data



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DigitalWalletProvisionRequestsApi;


DigitalWalletProvisionRequestsApi apiInstance = new DigitalWalletProvisionRequestsApi();
DigitalWalletApplePayProvisionRequest body = new DigitalWalletApplePayProvisionRequest(); // DigitalWalletApplePayProvisionRequest | 
try {
    DigitalWalletApplePayProvisionResponse result = apiInstance.postDigitalwalletprovisionrequestsApplepay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DigitalWalletProvisionRequestsApi#postDigitalwalletprovisionrequestsApplepay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DigitalWalletApplePayProvisionRequest**](DigitalWalletApplePayProvisionRequest.md)|  | [optional]

### Return type

[**DigitalWalletApplePayProvisionResponse**](DigitalWalletApplePayProvisionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


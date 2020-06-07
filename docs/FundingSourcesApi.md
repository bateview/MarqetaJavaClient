# FundingSourcesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllACHFundingSources**](FundingSourcesApi.md#getAllACHFundingSources) | **GET** /fundingsources/program/ach | Returns a list of Program ACH funding sources
[**getFundingsourcesAchFundingsourcetoken**](FundingSourcesApi.md#getFundingsourcesAchFundingsourcetoken) | **GET** /fundingsources/ach/{funding_source_token} | Returns a user ACH account
[**getFundingsourcesAchFundingsourcetokenVerificationamounts**](FundingSourcesApi.md#getFundingsourcesAchFundingsourcetokenVerificationamounts) | **GET** /fundingsources/ach/{funding_source_token}/verificationamounts | Returns the dollar amounts used to verify the ACH account
[**getFundingsourcesAddressesBusinessBusinesstoken**](FundingSourcesApi.md#getFundingsourcesAddressesBusinessBusinesstoken) | **GET** /fundingsources/addresses/business/{business_token} | Lists all addresses for a business
[**getFundingsourcesAddressesFundingsourceaddresstoken**](FundingSourcesApi.md#getFundingsourcesAddressesFundingsourceaddresstoken) | **GET** /fundingsources/addresses/{funding_source_address_token} | Returns a user address for a funding source
[**getFundingsourcesAddressesUserUsertoken**](FundingSourcesApi.md#getFundingsourcesAddressesUserUsertoken) | **GET** /fundingsources/addresses/user/{user_token} | Lists all addresses for a user
[**getFundingsourcesBusinessBusinesstoken**](FundingSourcesApi.md#getFundingsourcesBusinessBusinesstoken) | **GET** /fundingsources/business/{business_token} | Lists all funding sources for a business
[**getFundingsourcesPaymentcardFundingsourcetoken**](FundingSourcesApi.md#getFundingsourcesPaymentcardFundingsourcetoken) | **GET** /fundingsources/paymentcard/{funding_source_token} | Returns a specific payment card
[**getFundingsourcesProgramToken**](FundingSourcesApi.md#getFundingsourcesProgramToken) | **GET** /fundingsources/program/{token} | Returns a specific program funding source
[**getFundingsourcesProgramgatewayToken**](FundingSourcesApi.md#getFundingsourcesProgramgatewayToken) | **GET** /fundingsources/programgateway/{token} | Returns a gateway program funding source
[**getFundingsourcesUserUsertoken**](FundingSourcesApi.md#getFundingsourcesUserUsertoken) | **GET** /fundingsources/user/{user_token} | Lists all funding sources for a user
[**postFundingsourcesAch**](FundingSourcesApi.md#postFundingsourcesAch) | **POST** /fundingsources/ach | Registers an ACH funding source
[**postFundingsourcesAddresses**](FundingSourcesApi.md#postFundingsourcesAddresses) | **POST** /fundingsources/addresses | Creates an account holder address for a funding source
[**postFundingsourcesPaymentcard**](FundingSourcesApi.md#postFundingsourcesPaymentcard) | **POST** /fundingsources/paymentcard | Registers a payment card funding source
[**postFundingsourcesProgram**](FundingSourcesApi.md#postFundingsourcesProgram) | **POST** /fundingsources/program | Creates a program funding source
[**postFundingsourcesProgramAch**](FundingSourcesApi.md#postFundingsourcesProgramAch) | **POST** /fundingsources/program/ach | Registers an ACH funding source for a program
[**postFundingsourcesProgramgateway**](FundingSourcesApi.md#postFundingsourcesProgramgateway) | **POST** /fundingsources/programgateway | Creates a gateway program funding source
[**putFundingsourcesAchFundingsourcetoken**](FundingSourcesApi.md#putFundingsourcesAchFundingsourcetoken) | **PUT** /fundingsources/ach/{funding_source_token} | Verifies a bank account as a funding source
[**putFundingsourcesAddressesFundingsourceaddresstoken**](FundingSourcesApi.md#putFundingsourcesAddressesFundingsourceaddresstoken) | **PUT** /fundingsources/addresses/{funding_source_address_token} | Updates the account holder address for a funding source
[**putFundingsourcesFundingsourcetoken**](FundingSourcesApi.md#putFundingsourcesFundingsourcetoken) | **PUT** /fundingsources/paymentcard/{funding_source_token} | Updates a specific payment card 
[**putFundingsourcesFundingsourcetokenDefault**](FundingSourcesApi.md#putFundingsourcesFundingsourcetokenDefault) | **PUT** /fundingsources/{funding_source_token}/default | Configures a default funding source
[**putFundingsourcesProgramToken**](FundingSourcesApi.md#putFundingsourcesProgramToken) | **PUT** /fundingsources/program/{token} | Updates a specific program funding source
[**putFundingsourcesProgramgatewayCustomHeaderToken**](FundingSourcesApi.md#putFundingsourcesProgramgatewayCustomHeaderToken) | **PUT** /fundingsources/programgateway/customheaders/{token} | Updates a specific gateway program funding source Custom headers
[**putFundingsourcesProgramgatewayToken**](FundingSourcesApi.md#putFundingsourcesProgramgatewayToken) | **PUT** /fundingsources/programgateway/{token} | Updates a specific gateway program funding source


<a name="getAllACHFundingSources"></a>
# **getAllACHFundingSources**
> BaseAchResponseModel getAllACHFundingSources(count, startIndex, fields, sortBy)

Returns a list of Program ACH funding sources



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
Integer count = 5; // Integer | Number of items to retrieve. Count can be between 1 - 10 items.
Integer startIndex = 0; // Integer | Indicates from what row to start returning data.
String fields = "fields_example"; // String | Comma delimited list of fields to return (e.g. field_1,field_2,..)
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    BaseAchResponseModel result = apiInstance.getAllACHFundingSources(count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getAllACHFundingSources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of items to retrieve. Count can be between 1 - 10 items. | [optional] [default to 5]
 **startIndex** | **Integer**| Indicates from what row to start returning data. | [optional] [default to 0]
 **fields** | **String**| Comma delimited list of fields to return (e.g. field_1,field_2,..) | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**BaseAchResponseModel**](BaseAchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesAchFundingsourcetoken"></a>
# **getFundingsourcesAchFundingsourcetoken**
> AchResponseModel getFundingsourcesAchFundingsourcetoken(fundingSourceToken)

Returns a user ACH account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding account token
try {
    AchResponseModel result = apiInstance.getFundingsourcesAchFundingsourcetoken(fundingSourceToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesAchFundingsourcetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding account token |

### Return type

[**AchResponseModel**](AchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesAchFundingsourcetokenVerificationamounts"></a>
# **getFundingsourcesAchFundingsourcetokenVerificationamounts**
> AchVerificationModel getFundingsourcesAchFundingsourcetokenVerificationamounts(fundingSourceToken)

Returns the dollar amounts used to verify the ACH account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding account token
try {
    AchVerificationModel result = apiInstance.getFundingsourcesAchFundingsourcetokenVerificationamounts(fundingSourceToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesAchFundingsourcetokenVerificationamounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding account token |

### Return type

[**AchVerificationModel**](AchVerificationModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesAddressesBusinessBusinesstoken"></a>
# **getFundingsourcesAddressesBusinessBusinesstoken**
> CardholderAddressListResponse getFundingsourcesAddressesBusinessBusinesstoken(businessToken, fields)

Lists all addresses for a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String businessToken = "businessToken_example"; // String | Business token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CardholderAddressListResponse result = apiInstance.getFundingsourcesAddressesBusinessBusinesstoken(businessToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesAddressesBusinessBusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessToken** | **String**| Business token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CardholderAddressListResponse**](CardholderAddressListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesAddressesFundingsourceaddresstoken"></a>
# **getFundingsourcesAddressesFundingsourceaddresstoken**
> CardholderAddressResponse getFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken)

Returns a user address for a funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceAddressToken = "fundingSourceAddressToken_example"; // String | Funding source address token
try {
    CardholderAddressResponse result = apiInstance.getFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesAddressesFundingsourceaddresstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceAddressToken** | **String**| Funding source address token |

### Return type

[**CardholderAddressResponse**](CardholderAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesAddressesUserUsertoken"></a>
# **getFundingsourcesAddressesUserUsertoken**
> CardholderAddressListResponse getFundingsourcesAddressesUserUsertoken(userToken, fields)

Lists all addresses for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String userToken = "userToken_example"; // String | User token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    CardholderAddressListResponse result = apiInstance.getFundingsourcesAddressesUserUsertoken(userToken, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesAddressesUserUsertoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**CardholderAddressListResponse**](CardholderAddressListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesBusinessBusinesstoken"></a>
# **getFundingsourcesBusinessBusinesstoken**
> FundingAccountListResponse getFundingsourcesBusinessBusinesstoken(businessToken, type, fields)

Lists all funding sources for a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String businessToken = "businessToken_example"; // String | Business token
String type = "type_example"; // String | Type, such as a payment card or ACH
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    FundingAccountListResponse result = apiInstance.getFundingsourcesBusinessBusinesstoken(businessToken, type, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesBusinessBusinesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessToken** | **String**| Business token |
 **type** | **String**| Type, such as a payment card or ACH | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**FundingAccountListResponse**](FundingAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesPaymentcardFundingsourcetoken"></a>
# **getFundingsourcesPaymentcardFundingsourcetoken**
> PaymentCardResponseModel getFundingsourcesPaymentcardFundingsourcetoken(fundingSourceToken)

Returns a specific payment card



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding token
try {
    PaymentCardResponseModel result = apiInstance.getFundingsourcesPaymentcardFundingsourcetoken(fundingSourceToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesPaymentcardFundingsourcetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding token |

### Return type

[**PaymentCardResponseModel**](PaymentCardResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesProgramToken"></a>
# **getFundingsourcesProgramToken**
> ProgramFundingSourceResponse getFundingsourcesProgramToken(token)

Returns a specific program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String token = "token_example"; // String | Program funding source token
try {
    ProgramFundingSourceResponse result = apiInstance.getFundingsourcesProgramToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesProgramToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Program funding source token |

### Return type

[**ProgramFundingSourceResponse**](ProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesProgramgatewayToken"></a>
# **getFundingsourcesProgramgatewayToken**
> GatewayProgramFundingSourceResponse getFundingsourcesProgramgatewayToken(token)

Returns a gateway program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String token = "token_example"; // String | Gateway program funding source token
try {
    GatewayProgramFundingSourceResponse result = apiInstance.getFundingsourcesProgramgatewayToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesProgramgatewayToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Gateway program funding source token |

### Return type

[**GatewayProgramFundingSourceResponse**](GatewayProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFundingsourcesUserUsertoken"></a>
# **getFundingsourcesUserUsertoken**
> FundingAccountListResponse getFundingsourcesUserUsertoken(userToken, type, fields)

Lists all funding sources for a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String userToken = "userToken_example"; // String | User token
String type = "type_example"; // String | Type, such as a payment card or ACH
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    FundingAccountListResponse result = apiInstance.getFundingsourcesUserUsertoken(userToken, type, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#getFundingsourcesUserUsertoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userToken** | **String**| User token |
 **type** | **String**| Type, such as a payment card or ACH | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**FundingAccountListResponse**](FundingAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesAch"></a>
# **postFundingsourcesAch**
> AchResponseModel postFundingsourcesAch(body)

Registers an ACH funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
AchModel body = new AchModel(); // AchModel | 
try {
    AchResponseModel result = apiInstance.postFundingsourcesAch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesAch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AchModel**](AchModel.md)|  | [optional]

### Return type

[**AchResponseModel**](AchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesAddresses"></a>
# **postFundingsourcesAddresses**
> CardholderAddressResponse postFundingsourcesAddresses(body)

Creates an account holder address for a funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
CardHolderAddressModel body = new CardHolderAddressModel(); // CardHolderAddressModel | 
try {
    CardholderAddressResponse result = apiInstance.postFundingsourcesAddresses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardHolderAddressModel**](CardHolderAddressModel.md)|  | [optional]

### Return type

[**CardholderAddressResponse**](CardholderAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesPaymentcard"></a>
# **postFundingsourcesPaymentcard**
> PaymentCardResponseModel postFundingsourcesPaymentcard(body)

Registers a payment card funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
TokenRequest body = new TokenRequest(); // TokenRequest | 
try {
    PaymentCardResponseModel result = apiInstance.postFundingsourcesPaymentcard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesPaymentcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenRequest**](TokenRequest.md)|  | [optional]

### Return type

[**PaymentCardResponseModel**](PaymentCardResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesProgram"></a>
# **postFundingsourcesProgram**
> ProgramFundingSourceResponse postFundingsourcesProgram(body)

Creates a program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
ProgramFundingSourceRequest body = new ProgramFundingSourceRequest(); // ProgramFundingSourceRequest | 
try {
    ProgramFundingSourceResponse result = apiInstance.postFundingsourcesProgram(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesProgram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProgramFundingSourceRequest**](ProgramFundingSourceRequest.md)|  | [optional]

### Return type

[**ProgramFundingSourceResponse**](ProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesProgramAch"></a>
# **postFundingsourcesProgramAch**
> BaseAchResponseModel postFundingsourcesProgramAch(body)

Registers an ACH funding source for a program



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
BaseAchRequestModel body = new BaseAchRequestModel(); // BaseAchRequestModel | 
try {
    BaseAchResponseModel result = apiInstance.postFundingsourcesProgramAch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesProgramAch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BaseAchRequestModel**](BaseAchRequestModel.md)|  | [optional]

### Return type

[**BaseAchResponseModel**](BaseAchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFundingsourcesProgramgateway"></a>
# **postFundingsourcesProgramgateway**
> GatewayProgramFundingSourceResponse postFundingsourcesProgramgateway(body)

Creates a gateway program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
GatewayProgramFundingSourceRequest body = new GatewayProgramFundingSourceRequest(); // GatewayProgramFundingSourceRequest | 
try {
    GatewayProgramFundingSourceResponse result = apiInstance.postFundingsourcesProgramgateway(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#postFundingsourcesProgramgateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayProgramFundingSourceRequest**](GatewayProgramFundingSourceRequest.md)|  | [optional]

### Return type

[**GatewayProgramFundingSourceResponse**](GatewayProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesAchFundingsourcetoken"></a>
# **putFundingsourcesAchFundingsourcetoken**
> AchResponseModel putFundingsourcesAchFundingsourcetoken(fundingSourceToken, body)

Verifies a bank account as a funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | 
AchVerificationModel body = new AchVerificationModel(); // AchVerificationModel | 
try {
    AchResponseModel result = apiInstance.putFundingsourcesAchFundingsourcetoken(fundingSourceToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesAchFundingsourcetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**|  |
 **body** | [**AchVerificationModel**](AchVerificationModel.md)|  | [optional]

### Return type

[**AchResponseModel**](AchResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesAddressesFundingsourceaddresstoken"></a>
# **putFundingsourcesAddressesFundingsourceaddresstoken**
> CardholderAddressResponse putFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken, body)

Updates the account holder address for a funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceAddressToken = "fundingSourceAddressToken_example"; // String | Funding source address token
CardHolderAddressUpdateModel body = new CardHolderAddressUpdateModel(); // CardHolderAddressUpdateModel | 
try {
    CardholderAddressResponse result = apiInstance.putFundingsourcesAddressesFundingsourceaddresstoken(fundingSourceAddressToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesAddressesFundingsourceaddresstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceAddressToken** | **String**| Funding source address token |
 **body** | [**CardHolderAddressUpdateModel**](CardHolderAddressUpdateModel.md)|  | [optional]

### Return type

[**CardholderAddressResponse**](CardholderAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesFundingsourcetoken"></a>
# **putFundingsourcesFundingsourcetoken**
> PaymentCardResponseModel putFundingsourcesFundingsourcetoken(fundingSourceToken, body)

Updates a specific payment card 



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding account token
TokenUpdateRequest body = new TokenUpdateRequest(); // TokenUpdateRequest | Payment card
try {
    PaymentCardResponseModel result = apiInstance.putFundingsourcesFundingsourcetoken(fundingSourceToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesFundingsourcetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding account token |
 **body** | [**TokenUpdateRequest**](TokenUpdateRequest.md)| Payment card |

### Return type

[**PaymentCardResponseModel**](PaymentCardResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesFundingsourcetokenDefault"></a>
# **putFundingsourcesFundingsourcetokenDefault**
> PaymentCardResponseModel putFundingsourcesFundingsourcetokenDefault(fundingSourceToken)

Configures a default funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding account
try {
    PaymentCardResponseModel result = apiInstance.putFundingsourcesFundingsourcetokenDefault(fundingSourceToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesFundingsourcetokenDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding account |

### Return type

[**PaymentCardResponseModel**](PaymentCardResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/json
 - **Accept**: application/json

<a name="putFundingsourcesProgramToken"></a>
# **putFundingsourcesProgramToken**
> ProgramFundingSourceResponse putFundingsourcesProgramToken(token, body)

Updates a specific program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String token = "token_example"; // String | Program funding source token
ProgramFundingSourceUpdateRequest body = new ProgramFundingSourceUpdateRequest(); // ProgramFundingSourceUpdateRequest | 
try {
    ProgramFundingSourceResponse result = apiInstance.putFundingsourcesProgramToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesProgramToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Program funding source token |
 **body** | [**ProgramFundingSourceUpdateRequest**](ProgramFundingSourceUpdateRequest.md)|  | [optional]

### Return type

[**ProgramFundingSourceResponse**](ProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesProgramgatewayCustomHeaderToken"></a>
# **putFundingsourcesProgramgatewayCustomHeaderToken**
> GatewayProgramFundingSourceResponse putFundingsourcesProgramgatewayCustomHeaderToken(token, body)

Updates a specific gateway program funding source Custom headers



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String token = "token_example"; // String | Gateway program funding source token
GatewayProgramCustomHeaderUpdateRequest body = new GatewayProgramCustomHeaderUpdateRequest(); // GatewayProgramCustomHeaderUpdateRequest | 
try {
    GatewayProgramFundingSourceResponse result = apiInstance.putFundingsourcesProgramgatewayCustomHeaderToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesProgramgatewayCustomHeaderToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Gateway program funding source token |
 **body** | [**GatewayProgramCustomHeaderUpdateRequest**](GatewayProgramCustomHeaderUpdateRequest.md)|  | [optional]

### Return type

[**GatewayProgramFundingSourceResponse**](GatewayProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFundingsourcesProgramgatewayToken"></a>
# **putFundingsourcesProgramgatewayToken**
> GatewayProgramFundingSourceResponse putFundingsourcesProgramgatewayToken(token, body)

Updates a specific gateway program funding source



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FundingSourcesApi;


FundingSourcesApi apiInstance = new FundingSourcesApi();
String token = "token_example"; // String | Gateway program funding source token
GatewayProgramFundingSourceUpdateRequest body = new GatewayProgramFundingSourceUpdateRequest(); // GatewayProgramFundingSourceUpdateRequest | 
try {
    GatewayProgramFundingSourceResponse result = apiInstance.putFundingsourcesProgramgatewayToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundingSourcesApi#putFundingsourcesProgramgatewayToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Gateway program funding source token |
 **body** | [**GatewayProgramFundingSourceUpdateRequest**](GatewayProgramFundingSourceUpdateRequest.md)|  | [optional]

### Return type

[**GatewayProgramFundingSourceResponse**](GatewayProgramFundingSourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


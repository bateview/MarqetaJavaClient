# TransactionsApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | Returns transactions
[**getTransactionsFundingsourceFundingsourcetoken**](TransactionsApi.md#getTransactionsFundingsourceFundingsourcetoken) | **GET** /transactions/fundingsource/{funding_source_token} | Returns transactions for a specific funding account
[**getTransactionsToken**](TransactionsApi.md#getTransactionsToken) | **GET** /transactions/{token} | Returns a transaction
[**getTransactionsTokenRelated**](TransactionsApi.md#getTransactionsTokenRelated) | **GET** /transactions/{token}/related | Returns related transactions


<a name="getTransactions"></a>
# **getTransactions**
> TransactionModel getTransactions(count, startIndex, fields, sortBy, startDate, endDate, type, userToken, businessToken, actingUserToken, cardToken, merchantToken, campaignToken, state, version, verbose)

Returns transactions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
Integer count = 10; // Integer | Number of transactions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-user_transaction_time"; // String | Sort order
String startDate = "startDate_example"; // String | Start date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS)
String endDate = "endDate_example"; // String | End date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS)
String type = "type_example"; // String | Comma-delimited list of transaction types to include
String userToken = "userToken_example"; // String | User token
String businessToken = "businessToken_example"; // String | Business token
String actingUserToken = "actingUserToken_example"; // String | Acting user token
String cardToken = "cardToken_example"; // String | Card token
String merchantToken = "merchantToken_example"; // String | Merchant token
String campaignToken = "campaignToken_example"; // String | Campaign token
String state = "PENDING,COMPLETION"; // String | Comma-delimited list of transaction states to display e.g. PENDING | CLEARED | COMPLETION | DECLINED | ERROR | ALL
String version = "version_example"; // String | 
Boolean verbose = true; // Boolean | 
try {
    TransactionModel result = apiInstance.getTransactions(count, startIndex, fields, sortBy, startDate, endDate, type, userToken, businessToken, actingUserToken, cardToken, merchantToken, campaignToken, state, version, verbose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of transactions to retrieve | [optional] [default to 10]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -user_transaction_time] [enum: -created_time, created_time, -user_transaction_time, user_transaction_time]
 **startDate** | **String**| Start date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS) | [optional]
 **endDate** | **String**| End date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS) | [optional]
 **type** | **String**| Comma-delimited list of transaction types to include | [optional]
 **userToken** | **String**| User token | [optional]
 **businessToken** | **String**| Business token | [optional]
 **actingUserToken** | **String**| Acting user token | [optional]
 **cardToken** | **String**| Card token | [optional]
 **merchantToken** | **String**| Merchant token | [optional]
 **campaignToken** | **String**| Campaign token | [optional]
 **state** | **String**| Comma-delimited list of transaction states to display e.g. PENDING | CLEARED | COMPLETION | DECLINED | ERROR | ALL | [optional] [default to PENDING,COMPLETION]
 **version** | **String**|  | [optional]
 **verbose** | **Boolean**|  | [optional]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsFundingsourceFundingsourcetoken"></a>
# **getTransactionsFundingsourceFundingsourcetoken**
> TransactionModel getTransactionsFundingsourceFundingsourcetoken(fundingSourceToken, count, startIndex, fields, sortBy, startDate, endDate, type, polarity, version, verbose)

Returns transactions for a specific funding account



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String fundingSourceToken = "fundingSourceToken_example"; // String | Funding account token
Integer count = 10; // Integer | Number of transactions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-user_transaction_time"; // String | Sort order
String startDate = "startDate_example"; // String | Start date (yyyy-MM-dd)
String endDate = "endDate_example"; // String | End date (yyyy-MM-dd)
String type = "type_example"; // String | Comma-delimited list of transaction types to include
String polarity = "polarity_example"; // String | Type of transactions to retrieve: CREDIT or DEBIT
String version = "version_example"; // String | 
Boolean verbose = true; // Boolean | 
try {
    TransactionModel result = apiInstance.getTransactionsFundingsourceFundingsourcetoken(fundingSourceToken, count, startIndex, fields, sortBy, startDate, endDate, type, polarity, version, verbose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsFundingsourceFundingsourcetoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundingSourceToken** | **String**| Funding account token |
 **count** | **Integer**| Number of transactions to retrieve | [optional] [default to 10]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -user_transaction_time] [enum: -created_time, created_time, -user_transaction_time, user_transaction_time]
 **startDate** | **String**| Start date (yyyy-MM-dd) | [optional]
 **endDate** | **String**| End date (yyyy-MM-dd) | [optional]
 **type** | **String**| Comma-delimited list of transaction types to include | [optional]
 **polarity** | **String**| Type of transactions to retrieve: CREDIT or DEBIT | [optional] [enum: CREDIT, DEBIT, PENDING_CREDIT, PENDING_DEBIT]
 **version** | **String**|  | [optional]
 **verbose** | **Boolean**|  | [optional]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsToken"></a>
# **getTransactionsToken**
> TransactionModel getTransactionsToken(token, fields, version, verbose)

Returns a transaction



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String token = "token_example"; // String | Transaction token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String version = "version_example"; // String | 
Boolean verbose = true; // Boolean | 
try {
    TransactionModel result = apiInstance.getTransactionsToken(token, fields, version, verbose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Transaction token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **version** | **String**|  | [optional]
 **verbose** | **Boolean**|  | [optional]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsTokenRelated"></a>
# **getTransactionsTokenRelated**
> TransactionModel getTransactionsTokenRelated(token, count, startIndex, fields, sortBy, startDate, endDate, type, state, version, verbose)

Returns related transactions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionsApi;


TransactionsApi apiInstance = new TransactionsApi();
String token = "token_example"; // String | Transaction token
Integer count = 10; // Integer | Number of transactions to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-user_transaction_time"; // String | Sort order
String startDate = "startDate_example"; // String | Start date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS)
String endDate = "endDate_example"; // String | End date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS)
String type = "type_example"; // String | Comma-delimited list of transaction types to include
String state = "ALL"; // String | Comma-delimited list of transaction states to display e.g. PENDING | CLEARED | COMPLETION | ALL
String version = "version_example"; // String | 
Boolean verbose = true; // Boolean | 
try {
    TransactionModel result = apiInstance.getTransactionsTokenRelated(token, count, startIndex, fields, sortBy, startDate, endDate, type, state, version, verbose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsTokenRelated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Transaction token |
 **count** | **Integer**| Number of transactions to retrieve | [optional] [default to 10]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -user_transaction_time] [enum: -created_time, created_time, -user_transaction_time, user_transaction_time]
 **startDate** | **String**| Start date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS) | [optional]
 **endDate** | **String**| End date (yyyy-MM-dd | yyyy-MM-ddTHH:mm:ss.SS) | [optional]
 **type** | **String**| Comma-delimited list of transaction types to include | [optional]
 **state** | **String**| Comma-delimited list of transaction states to display e.g. PENDING | CLEARED | COMPLETION | ALL | [optional] [default to ALL]
 **version** | **String**|  | [optional]
 **verbose** | **Boolean**|  | [optional]

### Return type

[**TransactionModel**](TransactionModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


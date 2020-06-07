# AcceptedCountriesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAcceptedcountries**](AcceptedCountriesApi.md#getAcceptedcountries) | **GET** /acceptedcountries | Lists all accepted countries
[**getAcceptedcountriesToken**](AcceptedCountriesApi.md#getAcceptedcountriesToken) | **GET** /acceptedcountries/{token} | Returns a specific accepted country


<a name="getAcceptedcountries"></a>
# **getAcceptedcountries**
> AcceptedCountriesListResponse getAcceptedcountries(count, startIndex, name, whitelist, searchType, fields, sortBy)

Lists all accepted countries



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AcceptedCountriesApi;


AcceptedCountriesApi apiInstance = new AcceptedCountriesApi();
Integer count = 5; // Integer | Number of accepted countries to retrieve
Integer startIndex = 0; // Integer | Start index
String name = "name_example"; // String | Name
Boolean whitelist = true; // Boolean | Whitelist
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    AcceptedCountriesListResponse result = apiInstance.getAcceptedcountries(count, startIndex, name, whitelist, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcceptedCountriesApi#getAcceptedcountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of accepted countries to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **name** | **String**| Name | [optional]
 **whitelist** | **Boolean**| Whitelist | [optional]
 **searchType** | **String**| Search type | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**AcceptedCountriesListResponse**](AcceptedCountriesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAcceptedcountriesToken"></a>
# **getAcceptedcountriesToken**
> AcceptedCountriesModel getAcceptedcountriesToken(token, fields)

Returns a specific accepted country



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AcceptedCountriesApi;


AcceptedCountriesApi apiInstance = new AcceptedCountriesApi();
String token = "token_example"; // String | Accepted country token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    AcceptedCountriesModel result = apiInstance.getAcceptedcountriesToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcceptedCountriesApi#getAcceptedcountriesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Accepted country token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**AcceptedCountriesModel**](AcceptedCountriesModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


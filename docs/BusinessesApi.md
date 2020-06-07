# BusinessesApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinesses**](BusinessesApi.md#getBusinesses) | **GET** /businesses | Lists all businesses
[**getBusinessesParenttokenChildren**](BusinessesApi.md#getBusinessesParenttokenChildren) | **GET** /businesses/{parent_token}/children | Lists all children of a parent business
[**getBusinessesToken**](BusinessesApi.md#getBusinessesToken) | **GET** /businesses/{token} | Returns a specific business
[**getBusinessesTokenNotes**](BusinessesApi.md#getBusinessesTokenNotes) | **GET** /businesses/{token}/notes | Lists business notes
[**getBusinessesTokenSsn**](BusinessesApi.md#getBusinessesTokenSsn) | **GET** /businesses/{token}/ssn | Returns a specific business proprietor&#39;s SSN
[**postBusinesses**](BusinessesApi.md#postBusinesses) | **POST** /businesses | Creates a business
[**postBusinessesLookup**](BusinessesApi.md#postBusinessesLookup) | **POST** /businesses/lookup | Returns a specific business
[**postBusinessesTokenNotes**](BusinessesApi.md#postBusinessesTokenNotes) | **POST** /businesses/{token}/notes | Creates a note for a business
[**putBusinessesToken**](BusinessesApi.md#putBusinessesToken) | **PUT** /businesses/{token} | Updates a specific business
[**putBusinessesTokenNotesNotestoken**](BusinessesApi.md#putBusinessesTokenNotesNotestoken) | **PUT** /businesses/{token}/notes/{notes_token} | Updates a specific note for a business


<a name="getBusinesses"></a>
# **getBusinesses**
> BusinessCardHolderListResponse getBusinesses(count, startIndex, businessNameDba, businessNameLegal, searchType, fields, sortBy)

Lists all businesses



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String businessNameDba = "businessNameDba_example"; // String | Business name DBA
String businessNameLegal = "businessNameLegal_example"; // String | Business name legal
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    BusinessCardHolderListResponse result = apiInstance.getBusinesses(count, startIndex, businessNameDba, businessNameLegal, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#getBusinesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **businessNameDba** | **String**| Business name DBA | [optional]
 **businessNameLegal** | **String**| Business name legal | [optional]
 **searchType** | **String**| Search type | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**BusinessCardHolderListResponse**](BusinessCardHolderListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBusinessesParenttokenChildren"></a>
# **getBusinessesParenttokenChildren**
> UserCardHolderListResponse getBusinessesParenttokenChildren(parentToken, count, startIndex, fields, sortBy)

Lists all children of a parent business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String parentToken = "parentToken_example"; // String | Token of parent business
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    UserCardHolderListResponse result = apiInstance.getBusinessesParenttokenChildren(parentToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#getBusinessesParenttokenChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentToken** | **String**| Token of parent business |
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**UserCardHolderListResponse**](UserCardHolderListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBusinessesToken"></a>
# **getBusinessesToken**
> BusinessCardHolderResponse getBusinessesToken(token, fields)

Returns a specific business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    BusinessCardHolderResponse result = apiInstance.getBusinessesToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#getBusinessesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**BusinessCardHolderResponse**](BusinessCardHolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBusinessesTokenNotes"></a>
# **getBusinessesTokenNotes**
> CardHolderNoteListResponse getBusinessesTokenNotes(token, startIndex, count, createdBy, createdByUserRole, includePrivate, searchType, fields, sortBy)

Lists business notes



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
Integer startIndex = 0; // Integer | Start index
Integer count = 5; // Integer | Number of notes to retrieve
String createdBy = "createdBy_example"; // String | Created by
String createdByUserRole = "createdByUserRole_example"; // String | Comma-delimited list of created by user roles
Boolean includePrivate = true; // Boolean | Include private notes and private fields in note response
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    CardHolderNoteListResponse result = apiInstance.getBusinessesTokenNotes(token, startIndex, count, createdBy, createdByUserRole, includePrivate, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#getBusinessesTokenNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **count** | **Integer**| Number of notes to retrieve | [optional] [default to 5]
 **createdBy** | **String**| Created by | [optional]
 **createdByUserRole** | **String**| Comma-delimited list of created by user roles | [optional]
 **includePrivate** | **Boolean**| Include private notes and private fields in note response | [optional]
 **searchType** | **String**| Search type | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**CardHolderNoteListResponse**](CardHolderNoteListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBusinessesTokenSsn"></a>
# **getBusinessesTokenSsn**
> SsnResponseModel getBusinessesTokenSsn(token, fullSsn)

Returns a specific business proprietor&#39;s SSN



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
Boolean fullSsn = true; // Boolean | 
try {
    SsnResponseModel result = apiInstance.getBusinessesTokenSsn(token, fullSsn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#getBusinessesTokenSsn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **fullSsn** | **Boolean**|  | [optional]

### Return type

[**SsnResponseModel**](SsnResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBusinesses"></a>
# **postBusinesses**
> BusinessCardHolderResponse postBusinesses(body)

Creates a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
BusinessCardholder body = new BusinessCardholder(); // BusinessCardholder | 
try {
    BusinessCardHolderResponse result = apiInstance.postBusinesses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#postBusinesses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BusinessCardholder**](BusinessCardholder.md)|  | [optional]

### Return type

[**BusinessCardHolderResponse**](BusinessCardHolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBusinessesLookup"></a>
# **postBusinessesLookup**
> BusinessCardholder postBusinessesLookup(body)

Returns a specific business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
DDARequest body = new DDARequest(); // DDARequest | 
try {
    BusinessCardholder result = apiInstance.postBusinessesLookup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#postBusinessesLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DDARequest**](DDARequest.md)|  | [optional]

### Return type

[**BusinessCardholder**](BusinessCardholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postBusinessesTokenNotes"></a>
# **postBusinessesTokenNotes**
> CardholderNoteResponseModel postBusinessesTokenNotes(token, body)

Creates a note for a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
CardholderNoteRequestModel body = new CardholderNoteRequestModel(); // CardholderNoteRequestModel | 
try {
    CardholderNoteResponseModel result = apiInstance.postBusinessesTokenNotes(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#postBusinessesTokenNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **body** | [**CardholderNoteRequestModel**](CardholderNoteRequestModel.md)|  | [optional]

### Return type

[**CardholderNoteResponseModel**](CardholderNoteResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putBusinessesToken"></a>
# **putBusinessesToken**
> BusinessCardholder putBusinessesToken(token, body)

Updates a specific business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
BusinessCardHolderUpdate body = new BusinessCardHolderUpdate(); // BusinessCardHolderUpdate | Business object
try {
    BusinessCardholder result = apiInstance.putBusinessesToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#putBusinessesToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **body** | [**BusinessCardHolderUpdate**](BusinessCardHolderUpdate.md)| Business object |

### Return type

[**BusinessCardholder**](BusinessCardholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putBusinessesTokenNotesNotestoken"></a>
# **putBusinessesTokenNotesNotestoken**
> CardholderNoteResponseModel putBusinessesTokenNotesNotestoken(token, notesToken, body)

Updates a specific note for a business



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BusinessesApi;


BusinessesApi apiInstance = new BusinessesApi();
String token = "token_example"; // String | Business token
String notesToken = "notesToken_example"; // String | Notes token
CardholderNoteUpdateRequestModel body = new CardholderNoteUpdateRequestModel(); // CardholderNoteUpdateRequestModel | 
try {
    CardholderNoteResponseModel result = apiInstance.putBusinessesTokenNotesNotestoken(token, notesToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BusinessesApi#putBusinessesTokenNotesNotestoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Business token |
 **notesToken** | **String**| Notes token |
 **body** | [**CardholderNoteUpdateRequestModel**](CardholderNoteUpdateRequestModel.md)|  | [optional]

### Return type

[**CardholderNoteResponseModel**](CardholderNoteResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


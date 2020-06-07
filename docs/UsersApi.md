# UsersApi

All URIs are relative to *https://localhost/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Lists all users
[**getUsersAuthClientaccesstokenToken**](UsersApi.md#getUsersAuthClientaccesstokenToken) | **GET** /users/auth/clientaccesstoken/{token} | Returns a client access token
[**getUsersParenttokenChildren**](UsersApi.md#getUsersParenttokenChildren) | **GET** /users/{parent_token}/children | Lists all children of a parent user
[**getUsersPhonenumberPhonenumber**](UsersApi.md#getUsersPhonenumberPhonenumber) | **GET** /users/phonenumber/{phone_number} | Lists all users who match a phone number
[**getUsersToken**](UsersApi.md#getUsersToken) | **GET** /users/{token} | Returns a specific user
[**getUsersTokenNotes**](UsersApi.md#getUsersTokenNotes) | **GET** /users/{token}/notes | Lists cardholder notes
[**getUsersTokenSsn**](UsersApi.md#getUsersTokenSsn) | **GET** /users/{token}/ssn | Returns a specific user&#39;s SSN
[**postUsers**](UsersApi.md#postUsers) | **POST** /users | Creates a user
[**postUsersAuthChangepassword**](UsersApi.md#postUsersAuthChangepassword) | **POST** /users/auth/changepassword | Updates a user password
[**postUsersAuthClientaccesstoken**](UsersApi.md#postUsersAuthClientaccesstoken) | **POST** /users/auth/clientaccesstoken | Creates a client access token
[**postUsersAuthLogin**](UsersApi.md#postUsersAuthLogin) | **POST** /users/auth/login | Logs in a user
[**postUsersAuthLogout**](UsersApi.md#postUsersAuthLogout) | **POST** /users/auth/logout | Logs out a user
[**postUsersAuthOnetime**](UsersApi.md#postUsersAuthOnetime) | **POST** /users/auth/onetime | Creates a one-time token
[**postUsersAuthResetpassword**](UsersApi.md#postUsersAuthResetpassword) | **POST** /users/auth/resetpassword | Generates a reset password email
[**postUsersAuthResetpasswordToken**](UsersApi.md#postUsersAuthResetpasswordToken) | **POST** /users/auth/resetpassword/{token} | Resets a user password
[**postUsersAuthVerifyemail**](UsersApi.md#postUsersAuthVerifyemail) | **POST** /users/auth/verifyemail | Generates an email verification request
[**postUsersAuthVerifyemailToken**](UsersApi.md#postUsersAuthVerifyemailToken) | **POST** /users/auth/verifyemail/{token} | Verifies the email token
[**postUsersLookup**](UsersApi.md#postUsersLookup) | **POST** /users/lookup | Lists all users
[**postUsersTokenNotes**](UsersApi.md#postUsersTokenNotes) | **POST** /users/{token}/notes | Creates a note for the cardholder
[**putUsersToken**](UsersApi.md#putUsersToken) | **PUT** /users/{token} | Updates a specific user
[**putUsersTokenNotesNotestoken**](UsersApi.md#putUsersTokenNotesNotestoken) | **PUT** /users/{token}/notes/{notes_token} | Updates a specific note for a cardholder


<a name="getUsers"></a>
# **getUsers**
> UserCardHolderListResponse getUsers(count, startIndex, searchType, fields, sortBy)

Lists all users



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    UserCardHolderListResponse result = apiInstance.getUsers(count, startIndex, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **searchType** | **String**| Search type | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**UserCardHolderListResponse**](UserCardHolderListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersAuthClientaccesstokenToken"></a>
# **getUsersAuthClientaccesstokenToken**
> ClientAccessTokenResponse getUsersAuthClientaccesstokenToken(token, applicationToken)

Returns a client access token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | Client access token
String applicationToken = "applicationToken_example"; // String | 
try {
    ClientAccessTokenResponse result = apiInstance.getUsersAuthClientaccesstokenToken(token, applicationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersAuthClientaccesstokenToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Client access token |
 **applicationToken** | **String**|  | [optional]

### Return type

[**ClientAccessTokenResponse**](ClientAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersParenttokenChildren"></a>
# **getUsersParenttokenChildren**
> UserCardHolderListResponse getUsersParenttokenChildren(parentToken, count, startIndex, fields, sortBy)

Lists all children of a parent user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String parentToken = "parentToken_example"; // String | Token of parent cardholder
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    UserCardHolderListResponse result = apiInstance.getUsersParenttokenChildren(parentToken, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersParenttokenChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentToken** | **String**| Token of parent cardholder |
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

<a name="getUsersPhonenumberPhonenumber"></a>
# **getUsersPhonenumberPhonenumber**
> UserCardHolderListResponse getUsersPhonenumberPhonenumber(phoneNumber, count, startIndex, fields, sortBy)

Lists all users who match a phone number



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String phoneNumber = "phoneNumber_example"; // String | Phone number
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    UserCardHolderListResponse result = apiInstance.getUsersPhonenumberPhonenumber(phoneNumber, count, startIndex, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersPhonenumberPhonenumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Phone number |
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

<a name="getUsersToken"></a>
# **getUsersToken**
> UserCardHolderResponse getUsersToken(token, fields)

Returns a specific user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
try {
    UserCardHolderResponse result = apiInstance.getUsersToken(token, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]

### Return type

[**UserCardHolderResponse**](UserCardHolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersTokenNotes"></a>
# **getUsersTokenNotes**
> CardHolderNoteListResponse getUsersTokenNotes(token, startIndex, count, createdBy, createdByUserRole, includePrivate, searchType, fields, sortBy)

Lists cardholder notes



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
Integer startIndex = 0; // Integer | Start index
Integer count = 5; // Integer | Number of notes to retrieve
String createdBy = "createdBy_example"; // String | Created by
String createdByUserRole = "createdByUserRole_example"; // String | Comma-delimited list of created by user roles
Boolean includePrivate = true; // Boolean | Include private notes and private fields in note response
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    CardHolderNoteListResponse result = apiInstance.getUsersTokenNotes(token, startIndex, count, createdBy, createdByUserRole, includePrivate, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersTokenNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
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

<a name="getUsersTokenSsn"></a>
# **getUsersTokenSsn**
> SsnResponseModel getUsersTokenSsn(token, fullSsn)

Returns a specific user&#39;s SSN



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
Boolean fullSsn = true; // Boolean | 
try {
    SsnResponseModel result = apiInstance.getUsersTokenSsn(token, fullSsn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersTokenSsn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **fullSsn** | **Boolean**|  | [optional]

### Return type

[**SsnResponseModel**](SsnResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsers"></a>
# **postUsers**
> UserCardHolderResponse postUsers(body)

Creates a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
CardHolderModel body = new CardHolderModel(); // CardHolderModel | 
try {
    UserCardHolderResponse result = apiInstance.postUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CardHolderModel**](CardHolderModel.md)|  | [optional]

### Return type

[**UserCardHolderResponse**](UserCardHolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthChangepassword"></a>
# **postUsersAuthChangepassword**
> postUsersAuthChangepassword(body)

Updates a user password



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
PasswordUpdateModel body = new PasswordUpdateModel(); // PasswordUpdateModel | Password update object
try {
    apiInstance.postUsersAuthChangepassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthChangepassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordUpdateModel**](PasswordUpdateModel.md)| Password update object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthClientaccesstoken"></a>
# **postUsersAuthClientaccesstoken**
> ClientAccessTokenResponse postUsersAuthClientaccesstoken(body)

Creates a client access token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
ClientAccessTokenRequest body = new ClientAccessTokenRequest(); // ClientAccessTokenRequest | 
try {
    ClientAccessTokenResponse result = apiInstance.postUsersAuthClientaccesstoken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthClientaccesstoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientAccessTokenRequest**](ClientAccessTokenRequest.md)|  | [optional]

### Return type

[**ClientAccessTokenResponse**](ClientAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthLogin"></a>
# **postUsersAuthLogin**
> LoginResponseModel postUsersAuthLogin(body)

Logs in a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
LoginRequestModel body = new LoginRequestModel(); // LoginRequestModel | User login object
try {
    LoginResponseModel result = apiInstance.postUsersAuthLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginRequestModel**](LoginRequestModel.md)| User login object | [optional]

### Return type

[**LoginResponseModel**](LoginResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthLogout"></a>
# **postUsersAuthLogout**
> postUsersAuthLogout()

Logs out a user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    apiInstance.postUsersAuthLogout();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthOnetime"></a>
# **postUsersAuthOnetime**
> AccessTokenResponse postUsersAuthOnetime(body)

Creates a one-time token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
OneTimeRequestModel body = new OneTimeRequestModel(); // OneTimeRequestModel | One-time object
try {
    AccessTokenResponse result = apiInstance.postUsersAuthOnetime(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthOnetime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OneTimeRequestModel**](OneTimeRequestModel.md)| One-time object | [optional]

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthResetpassword"></a>
# **postUsersAuthResetpassword**
> postUsersAuthResetpassword(body)

Generates a reset password email



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
ResetUserPasswordEmailModel body = new ResetUserPasswordEmailModel(); // ResetUserPasswordEmailModel | 
try {
    apiInstance.postUsersAuthResetpassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthResetpassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetUserPasswordEmailModel**](ResetUserPasswordEmailModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthResetpasswordToken"></a>
# **postUsersAuthResetpasswordToken**
> postUsersAuthResetpasswordToken(token, body)

Resets a user password



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | Reset password verification token
ResetUserPasswordModel body = new ResetUserPasswordModel(); // ResetUserPasswordModel | 
try {
    apiInstance.postUsersAuthResetpasswordToken(token, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthResetpasswordToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Reset password verification token |
 **body** | [**ResetUserPasswordModel**](ResetUserPasswordModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthVerifyemail"></a>
# **postUsersAuthVerifyemail**
> postUsersAuthVerifyemail()

Generates an email verification request



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
try {
    apiInstance.postUsersAuthVerifyemail();
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthVerifyemail");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersAuthVerifyemailToken"></a>
# **postUsersAuthVerifyemailToken**
> postUsersAuthVerifyemailToken(token)

Verifies the email token



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | Email verification token
try {
    apiInstance.postUsersAuthVerifyemailToken(token);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersAuthVerifyemailToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Email verification token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersLookup"></a>
# **postUsersLookup**
> UserCardHolderListResponse postUsersLookup(body, count, startIndex, searchType, fields, sortBy)

Lists all users



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
UserCardHolderSearchModel body = new UserCardHolderSearchModel(); // UserCardHolderSearchModel | 
Integer count = 5; // Integer | Number of users to retrieve
Integer startIndex = 0; // Integer | Start index
String searchType = "searchType_example"; // String | Search type
String fields = "fields_example"; // String | Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields.
String sortBy = "-lastModifiedTime"; // String | Sort order
try {
    UserCardHolderListResponse result = apiInstance.postUsersLookup(body, count, startIndex, searchType, fields, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserCardHolderSearchModel**](UserCardHolderSearchModel.md)|  | [optional]
 **count** | **Integer**| Number of users to retrieve | [optional] [default to 5]
 **startIndex** | **Integer**| Start index | [optional] [default to 0]
 **searchType** | **String**| Search type | [optional]
 **fields** | **String**| Comma-delimited list of fields to return (e.g. field_1,field_2,..). Leave blank to return all fields. | [optional]
 **sortBy** | **String**| Sort order | [optional] [default to -lastModifiedTime]

### Return type

[**UserCardHolderListResponse**](UserCardHolderListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUsersTokenNotes"></a>
# **postUsersTokenNotes**
> CardholderNoteResponseModel postUsersTokenNotes(token, body)

Creates a note for the cardholder



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
CardholderNoteRequestModel body = new CardholderNoteRequestModel(); // CardholderNoteRequestModel | 
try {
    CardholderNoteResponseModel result = apiInstance.postUsersTokenNotes(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersTokenNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **body** | [**CardholderNoteRequestModel**](CardholderNoteRequestModel.md)|  | [optional]

### Return type

[**CardholderNoteResponseModel**](CardholderNoteResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUsersToken"></a>
# **putUsersToken**
> CardHolderModel putUsersToken(token, body)

Updates a specific user



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
UserCardHolderUpdateModel body = new UserCardHolderUpdateModel(); // UserCardHolderUpdateModel | User object
try {
    CardHolderModel result = apiInstance.putUsersToken(token, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUsersToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **body** | [**UserCardHolderUpdateModel**](UserCardHolderUpdateModel.md)| User object |

### Return type

[**CardHolderModel**](CardHolderModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUsersTokenNotesNotestoken"></a>
# **putUsersTokenNotesNotestoken**
> CardholderNoteResponseModel putUsersTokenNotesNotestoken(token, notesToken, body)

Updates a specific note for a cardholder



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String token = "token_example"; // String | User token
String notesToken = "notesToken_example"; // String | Notes token
CardholderNoteUpdateRequestModel body = new CardholderNoteUpdateRequestModel(); // CardholderNoteUpdateRequestModel | 
try {
    CardholderNoteResponseModel result = apiInstance.putUsersTokenNotesNotestoken(token, notesToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUsersTokenNotesNotestoken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| User token |
 **notesToken** | **String**| Notes token |
 **body** | [**CardholderNoteUpdateRequestModel**](CardholderNoteUpdateRequestModel.md)|  | [optional]

### Return type

[**CardholderNoteResponseModel**](CardholderNoteResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


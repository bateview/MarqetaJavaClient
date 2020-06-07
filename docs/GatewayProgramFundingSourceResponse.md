
# GatewayProgramFundingSourceResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | 250 char max. Empty string (disabled). Must be HTTPS. | 
**version** | **String** |  | 
**name** | **String** |  | 
**active** | **Boolean** |  |  [optional]
**token** | **String** |  | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**account** | **String** |  | 
**basicAuthUsername** | **String** | 50 char max. Required if URL is present | 
**basicAuthPassword** | **String** | 50 char max. Required if URL is present. Minimum 20 chars with upper and lowercase letters, numbers, and symbols | 
**timeoutMillis** | **Long** | Total timeout in milliseconds for gateway processing | 
**customHeader** | **Map&lt;String, String&gt;** | Custom headers to be passed along with request | 
**useMtls** | **Boolean** | Use MTLS for funding request | 




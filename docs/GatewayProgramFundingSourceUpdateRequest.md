
# GatewayProgramFundingSourceUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**url** | **String** | Empty string (disabled); must be HTTPS | 
**active** | **Boolean** |  |  [optional]
**basicAuthUsername** | **String** | Required if URL is present | 
**basicAuthPassword** | **String** | Required if URL is present; must contain upper and lowercase letters, numbers, and symbols | 
**timeoutMillis** | **Long** | Total timeout in milliseconds for gateway processing |  [optional]
**customHeader** | **Map&lt;String, String&gt;** | Custom headers |  [optional]
**useMtls** | **Boolean** | Use MTLS for funding request |  [optional]




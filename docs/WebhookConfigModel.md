
# WebhookConfigModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Must be HTTPS | 
**secret** | **String** | Must contain upper and lowercase letters, numbers, and symbols |  [optional]
**basicAuthUsername** | **String** |  | 
**basicAuthPassword** | **String** | Required if URL is present; must contain upper and lowercase letters, numbers, and symbols | 
**customHeader** | **Map&lt;String, String&gt;** | Custom headers to be passed along with request |  [optional]
**useMtls** | **Boolean** | Use MTLS for webhook |  [optional]





# PaymentCardResponseModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**type** | **String** |  | 
**token** | **String** |  | 
**accountSuffix** | **String** |  | 
**accountType** | **String** |  | 
**active** | **Boolean** |  | 
**isDefaultAccount** | **Boolean** |  | 
**expDate** | **String** |  | 
**userToken** | **String** | Required if &#39;business_token&#39; is not present |  [optional]
**businessToken** | **String** | Required if &#39;user_token&#39; is not present |  [optional]





# AutoReloadResponseModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**fundingSourceToken** | **String** | Required when order scope is GPA |  [optional]
**fundingSourceAddressToken** | **String** |  |  [optional]
**association** | [**AutoReloadAssociation**](AutoReloadAssociation.md) |  |  [optional]
**orderScope** | [**OrderScope**](OrderScope.md) | either GPA or MSA is required | 
**currencyCode** | **String** |  | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 




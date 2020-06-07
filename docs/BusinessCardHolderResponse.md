
# BusinessCardHolderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**active** | **Boolean** | default &#x3D; true |  [optional]
**notes** | **String** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**password** | **String** | Strong password required |  [optional]
**phone** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**accountHolderGroupToken** | **String** |  |  [optional]
**authentication** | [**Authentication**](Authentication.md) |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**businessNameLegal** | **String** |  |  [optional]
**businessNameDba** | **String** |  |  [optional]
**officeLocation** | [**AddressResponseModel**](AddressResponseModel.md) |  |  [optional]
**inCurrentLocationSince** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**website** | **String** |  |  [optional]
**dateEstablished** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**generalBusinessDescription** | **String** |  |  [optional]
**history** | **String** |  |  [optional]
**businessType** | **String** |  |  [optional]
**internationalOfficeLocations** | **String** |  |  [optional]
**taxpayerId** | **String** |  |  [optional]
**dunsNumber** | **String** |  |  [optional]
**primaryContact** | [**PrimaryContactInfoModel**](PrimaryContactInfoModel.md) |  |  [optional]
**incorporation** | [**BusinessIncorporationResponse**](BusinessIncorporationResponse.md) |  |  [optional]
**proprietorOrOfficer** | [**BusinessProprietorResponse**](BusinessProprietorResponse.md) |  |  [optional]
**identifications** | [**List&lt;IdentificationResponseModel&gt;**](IdentificationResponseModel.md) |  |  [optional]
**attesterName** | **String** |  |  [optional]
**attestationConsent** | **Boolean** |  |  [optional]
**attesterTitle** | **String** |  |  [optional]
**attestationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**beneficialOwner1** | [**BeneficialOwnerResponse**](BeneficialOwnerResponse.md) |  |  [optional]
**beneficialOwner2** | [**BeneficialOwnerResponse**](BeneficialOwnerResponse.md) |  |  [optional]
**beneficialOwner3** | [**BeneficialOwnerResponse**](BeneficialOwnerResponse.md) |  |  [optional]
**beneficialOwner4** | [**BeneficialOwnerResponse**](BeneficialOwnerResponse.md) |  |  [optional]
**depositAccount** | [**DepositAccount**](DepositAccount.md) |  | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNVERIFIED | &quot;UNVERIFIED&quot;
LIMITED | &quot;LIMITED&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
CLOSED | &quot;CLOSED&quot;




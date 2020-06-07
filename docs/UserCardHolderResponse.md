
# UserCardHolderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication** | [**Authentication**](Authentication.md) |  |  [optional]
**token** | **String** |  |  [optional]
**active** | **Boolean** | Default is true |  [optional]
**honorific** | **String** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**firstName** | **String** |  |  [optional]
**middleName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**address1** | **String** |  |  [optional]
**address2** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**state** | **String** |  |  [optional]
**zip** | **String** |  |  [optional]
**postalCode** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**phone** | **String** |  |  [optional]
**parentToken** | **String** |  |  [optional]
**usesParentAccount** | **Boolean** | Default is false |  [optional]
**ssn** | **String** |  |  [optional]
**corporateCardHolder** | **Boolean** |  |  [optional]
**passportNumber** | **String** |  |  [optional]
**idCardNumber** | **String** |  |  [optional]
**nationality** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**businessToken** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**accountHolderGroupToken** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**identifications** | [**List&lt;IdentificationResponseModel&gt;**](IdentificationResponseModel.md) |  |  [optional]
**depositAccount** | [**DepositAccount**](DepositAccount.md) |  |  [optional]
**birthDate** | **String** |  |  [optional]
**passportExpirationDate** | **String** |  |  [optional]
**idCardExpirationDate** | **String** |  |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
F | &quot;F&quot;
M | &quot;M&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNVERIFIED | &quot;UNVERIFIED&quot;
LIMITED | &quot;LIMITED&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
CLOSED | &quot;CLOSED&quot;




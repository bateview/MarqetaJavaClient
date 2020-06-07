
# FileProcessingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**token** | **String** |  | 
**fileProcessType** | [**FileProcessTypeEnum**](#FileProcessTypeEnum) |  | 
**sourceFile** | **String** |  | 
**archiveFile** | **String** |  |  [optional]
**fileProcessStatus** | [**FileProcessStatusEnum**](#FileProcessStatusEnum) |  | 


<a name="FileProcessTypeEnum"></a>
## Enum: FileProcessTypeEnum
Name | Value
---- | -----
MASTERCARD_CLEARING | &quot;MASTERCARD_CLEARING&quot;
VISA_CLEARING | &quot;VISA_CLEARING&quot;
PULSE_CLEARING | &quot;PULSE_CLEARING&quot;
DISCOVER_CLEARING | &quot;DISCOVER_CLEARING&quot;


<a name="FileProcessStatusEnum"></a>
## Enum: FileProcessStatusEnum
Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
STARTED | &quot;STARTED&quot;
COMPLETED | &quot;COMPLETED&quot;
ERROR | &quot;ERROR&quot;
TERMINATED | &quot;TERMINATED&quot;




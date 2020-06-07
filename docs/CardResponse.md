
# CardResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**lastModifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**token** | **String** | 36 char max | 
**userToken** | **String** | 36 char max | 
**cardProductToken** | **String** | 36 char max | 
**lastFour** | [**LastFourEnum**](#LastFourEnum) |  | 
**pan** | **String** |  | 
**expiration** | **String** |  | 
**expirationTime** | [**OffsetDateTime**](OffsetDateTime.md) | yyyy-MM-ddTHH:mm:ssZ | 
**cvvNumber** | **String** |  |  [optional]
**chipCvvNumber** | **String** |  |  [optional]
**barcode** | **String** |  | 
**pinIsSet** | **Boolean** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**stateReason** | **String** |  | 
**fulfillmentStatus** | [**FulfillmentStatusEnum**](#FulfillmentStatusEnum) |  | 
**reissuePanFromCardToken** | **String** |  |  [optional]
**fulfillment** | [**CardFulfillmentResponse**](CardFulfillmentResponse.md) |  |  [optional]
**bulkIssuanceToken** | **String** |  |  [optional]
**translatePinFromCardToken** | **String** |  |  [optional]
**activationActions** | [**ActivationActions**](ActivationActions.md) |  |  [optional]
**instrumentType** | [**InstrumentTypeEnum**](#InstrumentTypeEnum) |  |  [optional]
**expedite** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]


<a name="LastFourEnum"></a>
## Enum: LastFourEnum
Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
TERMINATED | &quot;TERMINATED&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;
UNACTIVATED | &quot;UNACTIVATED&quot;


<a name="FulfillmentStatusEnum"></a>
## Enum: FulfillmentStatusEnum
Name | Value
---- | -----
ISSUED | &quot;ISSUED&quot;
ORDERED | &quot;ORDERED&quot;
REORDERED | &quot;REORDERED&quot;
REJECTED | &quot;REJECTED&quot;
SHIPPED | &quot;SHIPPED&quot;
DELIVERED | &quot;DELIVERED&quot;
DIGITALLY_PRESENTED | &quot;DIGITALLY_PRESENTED&quot;


<a name="InstrumentTypeEnum"></a>
## Enum: InstrumentTypeEnum
Name | Value
---- | -----
PHYSICAL_MSR | &quot;PHYSICAL_MSR&quot;
PHYSICAL_ICC | &quot;PHYSICAL_ICC&quot;
PHYSICAL_CONTACTLESS | &quot;PHYSICAL_CONTACTLESS&quot;
PHYSICAL_COMBO | &quot;PHYSICAL_COMBO&quot;
VIRTUAL_PAN | &quot;VIRTUAL_PAN&quot;




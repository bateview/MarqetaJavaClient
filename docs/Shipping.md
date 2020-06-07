
# Shipping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | [**MethodEnum**](#MethodEnum) |  |  [optional]
**returnAddress** | [**FulfillmentAddressRequest**](FulfillmentAddressRequest.md) |  |  [optional]
**recipientAddress** | [**FulfillmentAddressRequest**](FulfillmentAddressRequest.md) |  |  [optional]
**careOfLine** | **String** | 255 char max |  [optional]


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
FEDEX_EXPEDITED | &quot;FEDEX_EXPEDITED&quot;
FEDEX_REGULAR | &quot;FEDEX_REGULAR&quot;
UPS_EXPEDITED | &quot;UPS_EXPEDITED&quot;
UPS_REGULAR | &quot;UPS_REGULAR&quot;
USPS_EXPEDITED | &quot;USPS_EXPEDITED&quot;
USPS_REGULAR | &quot;USPS_REGULAR&quot;




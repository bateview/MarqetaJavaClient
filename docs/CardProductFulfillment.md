
# CardProductFulfillment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipping** | [**Shipping**](Shipping.md) |  |  [optional]
**cardPersonalization** | [**CardPersonalization**](CardPersonalization.md) |  | 
**paymentInstrument** | [**PaymentInstrumentEnum**](#PaymentInstrumentEnum) |  |  [optional]
**packageId** | **String** |  |  [optional]
**allZeroCardSecurityCode** | **Boolean** |  |  [optional]
**binPrefix** | **String** |  |  [optional]
**bulkShip** | **Boolean** |  |  [optional]
**panLength** | **String** |  |  [optional]
**fulfillmentProvider** | [**FulfillmentProviderEnum**](#FulfillmentProviderEnum) |  |  [optional]
**allowCardCreation** | **Boolean** |  |  [optional]
**uppercaseNameLines** | **Boolean** |  |  [optional]
**enableOfflinePin** | **Boolean** |  |  [optional]


<a name="PaymentInstrumentEnum"></a>
## Enum: PaymentInstrumentEnum
Name | Value
---- | -----
PHYSICAL_MSR | &quot;PHYSICAL_MSR&quot;
PHYSICAL_ICC | &quot;PHYSICAL_ICC&quot;
PHYSICAL_CONTACTLESS | &quot;PHYSICAL_CONTACTLESS&quot;
PHYSICAL_COMBO | &quot;PHYSICAL_COMBO&quot;
VIRTUAL_PAN | &quot;VIRTUAL_PAN&quot;


<a name="FulfillmentProviderEnum"></a>
## Enum: FulfillmentProviderEnum
Name | Value
---- | -----
PERFECTPLASTIC | &quot;PERFECTPLASTIC&quot;
ARROWEYE | &quot;ARROWEYE&quot;
IDEMIA | &quot;IDEMIA&quot;
IDEMIA_UK | &quot;IDEMIA_UK&quot;
IDEMIA_FR | &quot;IDEMIA_FR&quot;
IDEMIA_CZ | &quot;IDEMIA_CZ&quot;
IDEMIA_APAC | &quot;IDEMIA_APAC&quot;
IDEMIA_PL | &quot;IDEMIA_PL&quot;
GEMALTO | &quot;GEMALTO&quot;
NITECREST | &quot;NITECREST&quot;
OBERTHUR | &quot;OBERTHUR&quot;




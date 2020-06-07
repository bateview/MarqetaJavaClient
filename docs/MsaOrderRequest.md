
# MsaOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**campaignToken** | **String** |  | 
**userToken** | **String** | Required if &#39;business_token&#39; is null |  [optional]
**businessToken** | **String** | Required if &#39;user_token&#39; is null |  [optional]
**currencyCode** | **String** |  | 
**purchaseAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**rewardAmount** | [**BigDecimal**](BigDecimal.md) | default is 0.00 |  [optional]
**rewardTriggerAmount** | [**BigDecimal**](BigDecimal.md) | default is 0.01 |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**fundingSourceToken** | **String** |  | 
**fundingSourceAddressToken** | **String** |  |  [optional]




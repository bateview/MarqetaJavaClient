
# PeerTransferRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  | 
**tags** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**senderUserToken** | **String** | Required if &#39;send_business_token&#39; is null |  [optional]
**recipientUserToken** | **String** | Required if &#39;recipient_business_token&#39; is null |  [optional]
**senderBusinessToken** | **String** | Required if &#39;send_user_token&#39; is null |  [optional]
**recipientBusinessToken** | **String** | Required if &#39;recipient_business_token&#39; is null |  [optional]
**currencyCode** | **String** |  | 




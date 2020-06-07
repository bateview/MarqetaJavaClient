
# DigitalWalletTokenWalletProvider

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**walletProviderCardholderWalletAccountId** | **String** |  |  [optional]
**walletProviderRiskAssessment** | [**WalletProviderRiskAssessmentEnum**](#WalletProviderRiskAssessmentEnum) |  |  [optional]
**walletProviderRiskAssessmentVersion** | **String** |  |  [optional]
**walletProviderDeviceScore** | **String** |  |  [optional]
**walletProviderAccountScore** | **String** |  |  [optional]
**walletProviderPanSource** | [**WalletProviderPanSourceEnum**](#WalletProviderPanSourceEnum) |  |  [optional]
**walletProviderReasonCode** | **String** |  |  [optional]
**recommendationReasons** | **List&lt;String&gt;** |  |  [optional]
**cardholderWalletAccountEmail** | **String** |  |  [optional]


<a name="WalletProviderRiskAssessmentEnum"></a>
## Enum: WalletProviderRiskAssessmentEnum
Name | Value
---- | -----
GREEN | &quot;DECISION_GREEN&quot;
YELLOW | &quot;DECISION_YELLOW&quot;
RED | &quot;DECISION_RED&quot;


<a name="WalletProviderPanSourceEnum"></a>
## Enum: WalletProviderPanSourceEnum
Name | Value
---- | -----
ON_FILE | &quot;ON_FILE&quot;
KEY_ENTERED | &quot;KEY_ENTERED&quot;
MOBILE_BANKING_APP | &quot;MOBILE_BANKING_APP&quot;




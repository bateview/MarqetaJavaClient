
# Pos

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**panEntryMode** | [**PanEntryModeEnum**](#PanEntryModeEnum) |  |  [optional]
**pinEntryMode** | [**PinEntryModeEnum**](#PinEntryModeEnum) |  |  [optional]
**terminalId** | **String** |  |  [optional]
**terminalAttendance** | [**TerminalAttendanceEnum**](#TerminalAttendanceEnum) |  |  [optional]
**terminalLocation** | [**TerminalLocationEnum**](#TerminalLocationEnum) |  |  [optional]
**cardHolderPresence** | **Boolean** |  |  [optional]
**cardholderAuthenticationMethod** | [**CardholderAuthenticationMethodEnum**](#CardholderAuthenticationMethodEnum) |  |  [optional]
**cardPresence** | **Boolean** |  |  [optional]
**terminalType** | [**TerminalTypeEnum**](#TerminalTypeEnum) |  |  [optional]
**cardDataInputCapability** | [**CardDataInputCapabilityEnum**](#CardDataInputCapabilityEnum) |  |  [optional]
**countryCode** | **String** |  |  [optional]
**zip** | **String** |  |  [optional]
**partialApprovalCapable** | **Boolean** |  |  [optional]
**purchaseAmountOnly** | **Boolean** |  |  [optional]
**isRecurring** | **Boolean** |  |  [optional]


<a name="PanEntryModeEnum"></a>
## Enum: PanEntryModeEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
MAG_STRIPE | &quot;MAG_STRIPE&quot;
MAG_STRIPE_CONTACTLESS | &quot;MAG_STRIPE_CONTACTLESS&quot;
BAR_CODE | &quot;BAR_CODE&quot;
OCR | &quot;OCR&quot;
MICR | &quot;MICR&quot;
CHIP | &quot;CHIP&quot;
CHIP_CONTACTLESS | &quot;CHIP_CONTACTLESS&quot;
CHIP_FALLBACK | &quot;CHIP_FALLBACK&quot;
OTHER | &quot;OTHER&quot;


<a name="PinEntryModeEnum"></a>
## Enum: PinEntryModeEnum
Name | Value
---- | -----
TRUE | &quot;TRUE&quot;
FALSE | &quot;FALSE&quot;
DEFECTIVE | &quot;DEFECTIVE&quot;


<a name="TerminalAttendanceEnum"></a>
## Enum: TerminalAttendanceEnum
Name | Value
---- | -----
UNSPECIFIED | &quot;UNSPECIFIED&quot;
ATTENDED | &quot;ATTENDED&quot;
UNATTENDED | &quot;UNATTENDED&quot;
NO_TERMINAL | &quot;NO_TERMINAL&quot;


<a name="TerminalLocationEnum"></a>
## Enum: TerminalLocationEnum
Name | Value
---- | -----
ON_PREMISE | &quot;ON_PREMISE&quot;
OFF_PREMISE_MERCHANT | &quot;OFF_PREMISE_MERCHANT&quot;
OFF_PREMISE_CARDHOLDER | &quot;OFF_PREMISE_CARDHOLDER&quot;
NO_TERMINAL | &quot;NO_TERMINAL&quot;


<a name="CardholderAuthenticationMethodEnum"></a>
## Enum: CardholderAuthenticationMethodEnum
Name | Value
---- | -----
UNSPECIFIED | &quot;UNSPECIFIED&quot;
NON_AUTHENTICATED | &quot;NON_AUTHENTICATED&quot;
SIGNATURE | &quot;SIGNATURE&quot;
PIN | &quot;PIN&quot;
ID_VERIFIED | &quot;ID_VERIFIED&quot;


<a name="TerminalTypeEnum"></a>
## Enum: TerminalTypeEnum
Name | Value
---- | -----
AUTO_DISPENSER_WITH_PIN | &quot;AUTO_DISPENSER_WITH_PIN&quot;
SELF_SERVICE | &quot;SELF_SERVICE&quot;
LIMITED_AMOUNT | &quot;LIMITED_AMOUNT&quot;
IN_FLIGHT | &quot;IN_FLIGHT&quot;
ECOMMERCE | &quot;ECOMMERCE&quot;
TRANSPONDER | &quot;TRANSPONDER&quot;


<a name="CardDataInputCapabilityEnum"></a>
## Enum: CardDataInputCapabilityEnum
Name | Value
---- | -----
NO_TERMINAL | &quot;NO_TERMINAL&quot;
MAG_STRIPE | &quot;MAG_STRIPE&quot;
MAG_STRIPE_CONTACTLESS | &quot;MAG_STRIPE_CONTACTLESS&quot;
MAG_STRIPE_KEY_ENTRY | &quot;MAG_STRIPE_KEY_ENTRY&quot;
CHIP | &quot;CHIP&quot;
CHIP_CONTACTLESS | &quot;CHIP_CONTACTLESS&quot;
CHIP_MAG_STRIPE | &quot;CHIP_MAG_STRIPE&quot;
CHIP_MAG_STRIPE_KEY_ENTRY | &quot;CHIP_MAG_STRIPE_KEY_ENTRY&quot;
KEY_ENTRY | &quot;KEY_ENTRY&quot;
OCR | &quot;OCR&quot;
MICR | &quot;MICR&quot;




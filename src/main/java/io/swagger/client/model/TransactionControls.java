/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AvsControls;
import java.io.IOException;

/**
 * TransactionControls
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class TransactionControls {
  @SerializedName("accepted_countries_token")
  private String acceptedCountriesToken = null;

  @SerializedName("always_require_pin")
  private Boolean alwaysRequirePin = false;

  @SerializedName("always_require_icc")
  private Boolean alwaysRequireIcc = false;

  @SerializedName("allow_gpa_auth")
  private Boolean allowGpaAuth = false;

  @SerializedName("require_card_not_present_card_security_code")
  private Boolean requireCardNotPresentCardSecurityCode = false;

  @SerializedName("allow_mcc_group_authorization_controls")
  private Boolean allowMccGroupAuthorizationControls = false;

  @SerializedName("allow_first_pin_set_via_financial_transaction")
  private Boolean allowFirstPinSetViaFinancialTransaction = false;

  @SerializedName("ignore_card_suspended_state")
  private Boolean ignoreCardSuspendedState = false;

  @SerializedName("allow_chip_fallback")
  private Boolean allowChipFallback = false;

  @SerializedName("allow_network_load")
  private Boolean allowNetworkLoad = false;

  @SerializedName("allow_network_load_card_activation")
  private Boolean allowNetworkLoadCardActivation = false;

  @SerializedName("allow_quasi_cash")
  private Boolean allowQuasiCash = false;

  @SerializedName("enable_partial_auth_approval")
  private Boolean enablePartialAuthApproval = false;

  @SerializedName("address_verification")
  private AvsControls addressVerification = null;

  public TransactionControls acceptedCountriesToken(String acceptedCountriesToken) {
    this.acceptedCountriesToken = acceptedCountriesToken;
    return this;
  }

   /**
   * 50 char max (default &#x3D; accept_us_only)
   * @return acceptedCountriesToken
  **/
  @ApiModelProperty(value = "50 char max (default = accept_us_only)")
  public String getAcceptedCountriesToken() {
    return acceptedCountriesToken;
  }

  public void setAcceptedCountriesToken(String acceptedCountriesToken) {
    this.acceptedCountriesToken = acceptedCountriesToken;
  }

  public TransactionControls alwaysRequirePin(Boolean alwaysRequirePin) {
    this.alwaysRequirePin = alwaysRequirePin;
    return this;
  }

   /**
   * Get alwaysRequirePin
   * @return alwaysRequirePin
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlwaysRequirePin() {
    return alwaysRequirePin;
  }

  public void setAlwaysRequirePin(Boolean alwaysRequirePin) {
    this.alwaysRequirePin = alwaysRequirePin;
  }

  public TransactionControls alwaysRequireIcc(Boolean alwaysRequireIcc) {
    this.alwaysRequireIcc = alwaysRequireIcc;
    return this;
  }

   /**
   * Get alwaysRequireIcc
   * @return alwaysRequireIcc
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlwaysRequireIcc() {
    return alwaysRequireIcc;
  }

  public void setAlwaysRequireIcc(Boolean alwaysRequireIcc) {
    this.alwaysRequireIcc = alwaysRequireIcc;
  }

  public TransactionControls allowGpaAuth(Boolean allowGpaAuth) {
    this.allowGpaAuth = allowGpaAuth;
    return this;
  }

   /**
   * Get allowGpaAuth
   * @return allowGpaAuth
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowGpaAuth() {
    return allowGpaAuth;
  }

  public void setAllowGpaAuth(Boolean allowGpaAuth) {
    this.allowGpaAuth = allowGpaAuth;
  }

  public TransactionControls requireCardNotPresentCardSecurityCode(Boolean requireCardNotPresentCardSecurityCode) {
    this.requireCardNotPresentCardSecurityCode = requireCardNotPresentCardSecurityCode;
    return this;
  }

   /**
   * Get requireCardNotPresentCardSecurityCode
   * @return requireCardNotPresentCardSecurityCode
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireCardNotPresentCardSecurityCode() {
    return requireCardNotPresentCardSecurityCode;
  }

  public void setRequireCardNotPresentCardSecurityCode(Boolean requireCardNotPresentCardSecurityCode) {
    this.requireCardNotPresentCardSecurityCode = requireCardNotPresentCardSecurityCode;
  }

  public TransactionControls allowMccGroupAuthorizationControls(Boolean allowMccGroupAuthorizationControls) {
    this.allowMccGroupAuthorizationControls = allowMccGroupAuthorizationControls;
    return this;
  }

   /**
   * Get allowMccGroupAuthorizationControls
   * @return allowMccGroupAuthorizationControls
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowMccGroupAuthorizationControls() {
    return allowMccGroupAuthorizationControls;
  }

  public void setAllowMccGroupAuthorizationControls(Boolean allowMccGroupAuthorizationControls) {
    this.allowMccGroupAuthorizationControls = allowMccGroupAuthorizationControls;
  }

  public TransactionControls allowFirstPinSetViaFinancialTransaction(Boolean allowFirstPinSetViaFinancialTransaction) {
    this.allowFirstPinSetViaFinancialTransaction = allowFirstPinSetViaFinancialTransaction;
    return this;
  }

   /**
   * Get allowFirstPinSetViaFinancialTransaction
   * @return allowFirstPinSetViaFinancialTransaction
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowFirstPinSetViaFinancialTransaction() {
    return allowFirstPinSetViaFinancialTransaction;
  }

  public void setAllowFirstPinSetViaFinancialTransaction(Boolean allowFirstPinSetViaFinancialTransaction) {
    this.allowFirstPinSetViaFinancialTransaction = allowFirstPinSetViaFinancialTransaction;
  }

  public TransactionControls ignoreCardSuspendedState(Boolean ignoreCardSuspendedState) {
    this.ignoreCardSuspendedState = ignoreCardSuspendedState;
    return this;
  }

   /**
   * Get ignoreCardSuspendedState
   * @return ignoreCardSuspendedState
  **/
  @ApiModelProperty(value = "")
  public Boolean isIgnoreCardSuspendedState() {
    return ignoreCardSuspendedState;
  }

  public void setIgnoreCardSuspendedState(Boolean ignoreCardSuspendedState) {
    this.ignoreCardSuspendedState = ignoreCardSuspendedState;
  }

  public TransactionControls allowChipFallback(Boolean allowChipFallback) {
    this.allowChipFallback = allowChipFallback;
    return this;
  }

   /**
   * Get allowChipFallback
   * @return allowChipFallback
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowChipFallback() {
    return allowChipFallback;
  }

  public void setAllowChipFallback(Boolean allowChipFallback) {
    this.allowChipFallback = allowChipFallback;
  }

  public TransactionControls allowNetworkLoad(Boolean allowNetworkLoad) {
    this.allowNetworkLoad = allowNetworkLoad;
    return this;
  }

   /**
   * Get allowNetworkLoad
   * @return allowNetworkLoad
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowNetworkLoad() {
    return allowNetworkLoad;
  }

  public void setAllowNetworkLoad(Boolean allowNetworkLoad) {
    this.allowNetworkLoad = allowNetworkLoad;
  }

  public TransactionControls allowNetworkLoadCardActivation(Boolean allowNetworkLoadCardActivation) {
    this.allowNetworkLoadCardActivation = allowNetworkLoadCardActivation;
    return this;
  }

   /**
   * Get allowNetworkLoadCardActivation
   * @return allowNetworkLoadCardActivation
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowNetworkLoadCardActivation() {
    return allowNetworkLoadCardActivation;
  }

  public void setAllowNetworkLoadCardActivation(Boolean allowNetworkLoadCardActivation) {
    this.allowNetworkLoadCardActivation = allowNetworkLoadCardActivation;
  }

  public TransactionControls allowQuasiCash(Boolean allowQuasiCash) {
    this.allowQuasiCash = allowQuasiCash;
    return this;
  }

   /**
   * Get allowQuasiCash
   * @return allowQuasiCash
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowQuasiCash() {
    return allowQuasiCash;
  }

  public void setAllowQuasiCash(Boolean allowQuasiCash) {
    this.allowQuasiCash = allowQuasiCash;
  }

  public TransactionControls enablePartialAuthApproval(Boolean enablePartialAuthApproval) {
    this.enablePartialAuthApproval = enablePartialAuthApproval;
    return this;
  }

   /**
   * Get enablePartialAuthApproval
   * @return enablePartialAuthApproval
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnablePartialAuthApproval() {
    return enablePartialAuthApproval;
  }

  public void setEnablePartialAuthApproval(Boolean enablePartialAuthApproval) {
    this.enablePartialAuthApproval = enablePartialAuthApproval;
  }

  public TransactionControls addressVerification(AvsControls addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

   /**
   * Get addressVerification
   * @return addressVerification
  **/
  @ApiModelProperty(value = "")
  public AvsControls getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(AvsControls addressVerification) {
    this.addressVerification = addressVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionControls transactionControls = (TransactionControls) o;
    return Objects.equals(this.acceptedCountriesToken, transactionControls.acceptedCountriesToken) &&
        Objects.equals(this.alwaysRequirePin, transactionControls.alwaysRequirePin) &&
        Objects.equals(this.alwaysRequireIcc, transactionControls.alwaysRequireIcc) &&
        Objects.equals(this.allowGpaAuth, transactionControls.allowGpaAuth) &&
        Objects.equals(this.requireCardNotPresentCardSecurityCode, transactionControls.requireCardNotPresentCardSecurityCode) &&
        Objects.equals(this.allowMccGroupAuthorizationControls, transactionControls.allowMccGroupAuthorizationControls) &&
        Objects.equals(this.allowFirstPinSetViaFinancialTransaction, transactionControls.allowFirstPinSetViaFinancialTransaction) &&
        Objects.equals(this.ignoreCardSuspendedState, transactionControls.ignoreCardSuspendedState) &&
        Objects.equals(this.allowChipFallback, transactionControls.allowChipFallback) &&
        Objects.equals(this.allowNetworkLoad, transactionControls.allowNetworkLoad) &&
        Objects.equals(this.allowNetworkLoadCardActivation, transactionControls.allowNetworkLoadCardActivation) &&
        Objects.equals(this.allowQuasiCash, transactionControls.allowQuasiCash) &&
        Objects.equals(this.enablePartialAuthApproval, transactionControls.enablePartialAuthApproval) &&
        Objects.equals(this.addressVerification, transactionControls.addressVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedCountriesToken, alwaysRequirePin, alwaysRequireIcc, allowGpaAuth, requireCardNotPresentCardSecurityCode, allowMccGroupAuthorizationControls, allowFirstPinSetViaFinancialTransaction, ignoreCardSuspendedState, allowChipFallback, allowNetworkLoad, allowNetworkLoadCardActivation, allowQuasiCash, enablePartialAuthApproval, addressVerification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionControls {\n");
    
    sb.append("    acceptedCountriesToken: ").append(toIndentedString(acceptedCountriesToken)).append("\n");
    sb.append("    alwaysRequirePin: ").append(toIndentedString(alwaysRequirePin)).append("\n");
    sb.append("    alwaysRequireIcc: ").append(toIndentedString(alwaysRequireIcc)).append("\n");
    sb.append("    allowGpaAuth: ").append(toIndentedString(allowGpaAuth)).append("\n");
    sb.append("    requireCardNotPresentCardSecurityCode: ").append(toIndentedString(requireCardNotPresentCardSecurityCode)).append("\n");
    sb.append("    allowMccGroupAuthorizationControls: ").append(toIndentedString(allowMccGroupAuthorizationControls)).append("\n");
    sb.append("    allowFirstPinSetViaFinancialTransaction: ").append(toIndentedString(allowFirstPinSetViaFinancialTransaction)).append("\n");
    sb.append("    ignoreCardSuspendedState: ").append(toIndentedString(ignoreCardSuspendedState)).append("\n");
    sb.append("    allowChipFallback: ").append(toIndentedString(allowChipFallback)).append("\n");
    sb.append("    allowNetworkLoad: ").append(toIndentedString(allowNetworkLoad)).append("\n");
    sb.append("    allowNetworkLoadCardActivation: ").append(toIndentedString(allowNetworkLoadCardActivation)).append("\n");
    sb.append("    allowQuasiCash: ").append(toIndentedString(allowQuasiCash)).append("\n");
    sb.append("    enablePartialAuthApproval: ").append(toIndentedString(enablePartialAuthApproval)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


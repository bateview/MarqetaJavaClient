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
import io.swagger.client.model.AddressVerification;
import io.swagger.client.model.Device;
import io.swagger.client.model.TokenServiceProvider;
import io.swagger.client.model.UserCardHolderResponse;
import io.swagger.client.model.WalletProviderProfile;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * DigitalWalletToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class DigitalWalletToken {
  @SerializedName("token")
  private String token = null;

  @SerializedName("card_token")
  private String cardToken = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("state_reason")
  private String stateReason = null;

  @SerializedName("fulfillment_status")
  private String fulfillmentStatus = null;

  @SerializedName("issuer_eligibility_decision")
  private String issuerEligibilityDecision = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("token_service_provider")
  private TokenServiceProvider tokenServiceProvider = null;

  @SerializedName("device")
  private Device device = null;

  @SerializedName("wallet_provider_profile")
  private WalletProviderProfile walletProviderProfile = null;

  @SerializedName("address_verification")
  private AddressVerification addressVerification = null;

  @SerializedName("user")
  private UserCardHolderResponse user = null;

  public DigitalWalletToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public DigitalWalletToken cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @ApiModelProperty(value = "")
  public String getCardToken() {
    return cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  public DigitalWalletToken state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DigitalWalletToken stateReason(String stateReason) {
    this.stateReason = stateReason;
    return this;
  }

   /**
   * Get stateReason
   * @return stateReason
  **/
  @ApiModelProperty(value = "")
  public String getStateReason() {
    return stateReason;
  }

  public void setStateReason(String stateReason) {
    this.stateReason = stateReason;
  }

  public DigitalWalletToken fulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
    return this;
  }

   /**
   * Get fulfillmentStatus
   * @return fulfillmentStatus
  **/
  @ApiModelProperty(value = "")
  public String getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(String fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
  }

  public DigitalWalletToken issuerEligibilityDecision(String issuerEligibilityDecision) {
    this.issuerEligibilityDecision = issuerEligibilityDecision;
    return this;
  }

   /**
   * Get issuerEligibilityDecision
   * @return issuerEligibilityDecision
  **/
  @ApiModelProperty(value = "")
  public String getIssuerEligibilityDecision() {
    return issuerEligibilityDecision;
  }

  public void setIssuerEligibilityDecision(String issuerEligibilityDecision) {
    this.issuerEligibilityDecision = issuerEligibilityDecision;
  }

  public DigitalWalletToken createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public DigitalWalletToken lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Get lastModifiedTime
   * @return lastModifiedTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public DigitalWalletToken tokenServiceProvider(TokenServiceProvider tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
    return this;
  }

   /**
   * Get tokenServiceProvider
   * @return tokenServiceProvider
  **/
  @ApiModelProperty(value = "")
  public TokenServiceProvider getTokenServiceProvider() {
    return tokenServiceProvider;
  }

  public void setTokenServiceProvider(TokenServiceProvider tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
  }

  public DigitalWalletToken device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public DigitalWalletToken walletProviderProfile(WalletProviderProfile walletProviderProfile) {
    this.walletProviderProfile = walletProviderProfile;
    return this;
  }

   /**
   * Get walletProviderProfile
   * @return walletProviderProfile
  **/
  @ApiModelProperty(value = "")
  public WalletProviderProfile getWalletProviderProfile() {
    return walletProviderProfile;
  }

  public void setWalletProviderProfile(WalletProviderProfile walletProviderProfile) {
    this.walletProviderProfile = walletProviderProfile;
  }

  public DigitalWalletToken addressVerification(AddressVerification addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

   /**
   * Get addressVerification
   * @return addressVerification
  **/
  @ApiModelProperty(value = "")
  public AddressVerification getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(AddressVerification addressVerification) {
    this.addressVerification = addressVerification;
  }

  public DigitalWalletToken user(UserCardHolderResponse user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public UserCardHolderResponse getUser() {
    return user;
  }

  public void setUser(UserCardHolderResponse user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletToken digitalWalletToken = (DigitalWalletToken) o;
    return Objects.equals(this.token, digitalWalletToken.token) &&
        Objects.equals(this.cardToken, digitalWalletToken.cardToken) &&
        Objects.equals(this.state, digitalWalletToken.state) &&
        Objects.equals(this.stateReason, digitalWalletToken.stateReason) &&
        Objects.equals(this.fulfillmentStatus, digitalWalletToken.fulfillmentStatus) &&
        Objects.equals(this.issuerEligibilityDecision, digitalWalletToken.issuerEligibilityDecision) &&
        Objects.equals(this.createdTime, digitalWalletToken.createdTime) &&
        Objects.equals(this.lastModifiedTime, digitalWalletToken.lastModifiedTime) &&
        Objects.equals(this.tokenServiceProvider, digitalWalletToken.tokenServiceProvider) &&
        Objects.equals(this.device, digitalWalletToken.device) &&
        Objects.equals(this.walletProviderProfile, digitalWalletToken.walletProviderProfile) &&
        Objects.equals(this.addressVerification, digitalWalletToken.addressVerification) &&
        Objects.equals(this.user, digitalWalletToken.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cardToken, state, stateReason, fulfillmentStatus, issuerEligibilityDecision, createdTime, lastModifiedTime, tokenServiceProvider, device, walletProviderProfile, addressVerification, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
    sb.append("    fulfillmentStatus: ").append(toIndentedString(fulfillmentStatus)).append("\n");
    sb.append("    issuerEligibilityDecision: ").append(toIndentedString(issuerEligibilityDecision)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    tokenServiceProvider: ").append(toIndentedString(tokenServiceProvider)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    walletProviderProfile: ").append(toIndentedString(walletProviderProfile)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

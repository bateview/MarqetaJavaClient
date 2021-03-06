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
import io.swagger.client.model.AndroidPushTokenRequestAddress;
import java.io.IOException;

/**
 * PushTokenizeRequestData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PushTokenizeRequestData {
  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("last_digits")
  private String lastDigits = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("token_service_provider")
  private String tokenServiceProvider = null;

  @SerializedName("opaque_payment_card")
  private String opaquePaymentCard = null;

  @SerializedName("user_address")
  private AndroidPushTokenRequestAddress userAddress = null;

  public PushTokenizeRequestData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PushTokenizeRequestData lastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
    return this;
  }

   /**
   * Get lastDigits
   * @return lastDigits
  **/
  @ApiModelProperty(value = "")
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  public PushTokenizeRequestData network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public PushTokenizeRequestData tokenServiceProvider(String tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
    return this;
  }

   /**
   * Get tokenServiceProvider
   * @return tokenServiceProvider
  **/
  @ApiModelProperty(value = "")
  public String getTokenServiceProvider() {
    return tokenServiceProvider;
  }

  public void setTokenServiceProvider(String tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
  }

  public PushTokenizeRequestData opaquePaymentCard(String opaquePaymentCard) {
    this.opaquePaymentCard = opaquePaymentCard;
    return this;
  }

   /**
   * Get opaquePaymentCard
   * @return opaquePaymentCard
  **/
  @ApiModelProperty(value = "")
  public String getOpaquePaymentCard() {
    return opaquePaymentCard;
  }

  public void setOpaquePaymentCard(String opaquePaymentCard) {
    this.opaquePaymentCard = opaquePaymentCard;
  }

  public PushTokenizeRequestData userAddress(AndroidPushTokenRequestAddress userAddress) {
    this.userAddress = userAddress;
    return this;
  }

   /**
   * Get userAddress
   * @return userAddress
  **/
  @ApiModelProperty(value = "")
  public AndroidPushTokenRequestAddress getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(AndroidPushTokenRequestAddress userAddress) {
    this.userAddress = userAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushTokenizeRequestData pushTokenizeRequestData = (PushTokenizeRequestData) o;
    return Objects.equals(this.displayName, pushTokenizeRequestData.displayName) &&
        Objects.equals(this.lastDigits, pushTokenizeRequestData.lastDigits) &&
        Objects.equals(this.network, pushTokenizeRequestData.network) &&
        Objects.equals(this.tokenServiceProvider, pushTokenizeRequestData.tokenServiceProvider) &&
        Objects.equals(this.opaquePaymentCard, pushTokenizeRequestData.opaquePaymentCard) &&
        Objects.equals(this.userAddress, pushTokenizeRequestData.userAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, lastDigits, network, tokenServiceProvider, opaquePaymentCard, userAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushTokenizeRequestData {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    lastDigits: ").append(toIndentedString(lastDigits)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    tokenServiceProvider: ").append(toIndentedString(tokenServiceProvider)).append("\n");
    sb.append("    opaquePaymentCard: ").append(toIndentedString(opaquePaymentCard)).append("\n");
    sb.append("    userAddress: ").append(toIndentedString(userAddress)).append("\n");
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


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
import io.swagger.client.model.ExpirationOffset;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MerchantCardRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class MerchantCardRequest {
  @SerializedName("card_product_token")
  private String cardProductToken = null;

  @SerializedName("expedite")
  private Boolean expedite = false;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("expiration_offset")
  private ExpirationOffset expirationOffset = null;

  public MerchantCardRequest cardProductToken(String cardProductToken) {
    this.cardProductToken = cardProductToken;
    return this;
  }

   /**
   * Get cardProductToken
   * @return cardProductToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCardProductToken() {
    return cardProductToken;
  }

  public void setCardProductToken(String cardProductToken) {
    this.cardProductToken = cardProductToken;
  }

  public MerchantCardRequest expedite(Boolean expedite) {
    this.expedite = expedite;
    return this;
  }

   /**
   * Get expedite
   * @return expedite
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpedite() {
    return expedite;
  }

  public void setExpedite(Boolean expedite) {
    this.expedite = expedite;
  }

  public MerchantCardRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public MerchantCardRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public MerchantCardRequest expirationOffset(ExpirationOffset expirationOffset) {
    this.expirationOffset = expirationOffset;
    return this;
  }

   /**
   * Get expirationOffset
   * @return expirationOffset
  **/
  @ApiModelProperty(value = "")
  public ExpirationOffset getExpirationOffset() {
    return expirationOffset;
  }

  public void setExpirationOffset(ExpirationOffset expirationOffset) {
    this.expirationOffset = expirationOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCardRequest merchantCardRequest = (MerchantCardRequest) o;
    return Objects.equals(this.cardProductToken, merchantCardRequest.cardProductToken) &&
        Objects.equals(this.expedite, merchantCardRequest.expedite) &&
        Objects.equals(this.metadata, merchantCardRequest.metadata) &&
        Objects.equals(this.expirationOffset, merchantCardRequest.expirationOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardProductToken, expedite, metadata, expirationOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCardRequest {\n");
    
    sb.append("    cardProductToken: ").append(toIndentedString(cardProductToken)).append("\n");
    sb.append("    expedite: ").append(toIndentedString(expedite)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    expirationOffset: ").append(toIndentedString(expirationOffset)).append("\n");
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


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
import java.io.IOException;

/**
 * OtherPoi
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class OtherPoi {
  @SerializedName("allow")
  private Boolean allow = true;

  @SerializedName("card_presence_required")
  private Boolean cardPresenceRequired = false;

  @SerializedName("cardholder_presence_required")
  private Boolean cardholderPresenceRequired = false;

  public OtherPoi allow(Boolean allow) {
    this.allow = allow;
    return this;
  }

   /**
   * Get allow
   * @return allow
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllow() {
    return allow;
  }

  public void setAllow(Boolean allow) {
    this.allow = allow;
  }

  public OtherPoi cardPresenceRequired(Boolean cardPresenceRequired) {
    this.cardPresenceRequired = cardPresenceRequired;
    return this;
  }

   /**
   * Default &#x3D; false
   * @return cardPresenceRequired
  **/
  @ApiModelProperty(value = "Default = false")
  public Boolean isCardPresenceRequired() {
    return cardPresenceRequired;
  }

  public void setCardPresenceRequired(Boolean cardPresenceRequired) {
    this.cardPresenceRequired = cardPresenceRequired;
  }

  public OtherPoi cardholderPresenceRequired(Boolean cardholderPresenceRequired) {
    this.cardholderPresenceRequired = cardholderPresenceRequired;
    return this;
  }

   /**
   * Default &#x3D; false
   * @return cardholderPresenceRequired
  **/
  @ApiModelProperty(value = "Default = false")
  public Boolean isCardholderPresenceRequired() {
    return cardholderPresenceRequired;
  }

  public void setCardholderPresenceRequired(Boolean cardholderPresenceRequired) {
    this.cardholderPresenceRequired = cardholderPresenceRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherPoi otherPoi = (OtherPoi) o;
    return Objects.equals(this.allow, otherPoi.allow) &&
        Objects.equals(this.cardPresenceRequired, otherPoi.cardPresenceRequired) &&
        Objects.equals(this.cardholderPresenceRequired, otherPoi.cardholderPresenceRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, cardPresenceRequired, cardholderPresenceRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherPoi {\n");
    
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    cardPresenceRequired: ").append(toIndentedString(cardPresenceRequired)).append("\n");
    sb.append("    cardholderPresenceRequired: ").append(toIndentedString(cardholderPresenceRequired)).append("\n");
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


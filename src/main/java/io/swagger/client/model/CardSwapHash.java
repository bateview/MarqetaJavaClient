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
 * CardSwapHash
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class CardSwapHash {
  @SerializedName("previous_card_token")
  private String previousCardToken = null;

  @SerializedName("new_card_token")
  private String newCardToken = null;

  public CardSwapHash previousCardToken(String previousCardToken) {
    this.previousCardToken = previousCardToken;
    return this;
  }

   /**
   * Get previousCardToken
   * @return previousCardToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPreviousCardToken() {
    return previousCardToken;
  }

  public void setPreviousCardToken(String previousCardToken) {
    this.previousCardToken = previousCardToken;
  }

  public CardSwapHash newCardToken(String newCardToken) {
    this.newCardToken = newCardToken;
    return this;
  }

   /**
   * Get newCardToken
   * @return newCardToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewCardToken() {
    return newCardToken;
  }

  public void setNewCardToken(String newCardToken) {
    this.newCardToken = newCardToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardSwapHash cardSwapHash = (CardSwapHash) o;
    return Objects.equals(this.previousCardToken, cardSwapHash.previousCardToken) &&
        Objects.equals(this.newCardToken, cardSwapHash.newCardToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousCardToken, newCardToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardSwapHash {\n");
    
    sb.append("    previousCardToken: ").append(toIndentedString(previousCardToken)).append("\n");
    sb.append("    newCardToken: ").append(toIndentedString(newCardToken)).append("\n");
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

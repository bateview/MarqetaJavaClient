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
 * AdvancedAuthOtherPoi
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class AdvancedAuthOtherPoi {
  @SerializedName("card_presence")
  private Boolean cardPresence = false;

  @SerializedName("cardholder_presence")
  private Boolean cardholderPresence = false;

  @SerializedName("partial_approval_capable")
  private Boolean partialApprovalCapable = false;

  public AdvancedAuthOtherPoi cardPresence(Boolean cardPresence) {
    this.cardPresence = cardPresence;
    return this;
  }

   /**
   * Get cardPresence
   * @return cardPresence
  **/
  @ApiModelProperty(value = "")
  public Boolean isCardPresence() {
    return cardPresence;
  }

  public void setCardPresence(Boolean cardPresence) {
    this.cardPresence = cardPresence;
  }

  public AdvancedAuthOtherPoi cardholderPresence(Boolean cardholderPresence) {
    this.cardholderPresence = cardholderPresence;
    return this;
  }

   /**
   * Get cardholderPresence
   * @return cardholderPresence
  **/
  @ApiModelProperty(value = "")
  public Boolean isCardholderPresence() {
    return cardholderPresence;
  }

  public void setCardholderPresence(Boolean cardholderPresence) {
    this.cardholderPresence = cardholderPresence;
  }

  public AdvancedAuthOtherPoi partialApprovalCapable(Boolean partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
    return this;
  }

   /**
   * Get partialApprovalCapable
   * @return partialApprovalCapable
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartialApprovalCapable() {
    return partialApprovalCapable;
  }

  public void setPartialApprovalCapable(Boolean partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuthOtherPoi advancedAuthOtherPoi = (AdvancedAuthOtherPoi) o;
    return Objects.equals(this.cardPresence, advancedAuthOtherPoi.cardPresence) &&
        Objects.equals(this.cardholderPresence, advancedAuthOtherPoi.cardholderPresence) &&
        Objects.equals(this.partialApprovalCapable, advancedAuthOtherPoi.partialApprovalCapable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardPresence, cardholderPresence, partialApprovalCapable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuthOtherPoi {\n");
    
    sb.append("    cardPresence: ").append(toIndentedString(cardPresence)).append("\n");
    sb.append("    cardholderPresence: ").append(toIndentedString(cardholderPresence)).append("\n");
    sb.append("    partialApprovalCapable: ").append(toIndentedString(partialApprovalCapable)).append("\n");
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


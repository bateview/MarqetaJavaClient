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
 * TerminalModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class TerminalModel {
  @SerializedName("tid")
  private String tid = null;

  @SerializedName("partial_approval_capable")
  private String partialApprovalCapable = null;

  @SerializedName("cardholder_presence")
  private String cardholderPresence = null;

  @SerializedName("card_presence")
  private String cardPresence = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("processing_type")
  private String processingType = null;

  @SerializedName("pin_present")
  private String pinPresent = null;

  public TerminalModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Get tid
   * @return tid
  **/
  @ApiModelProperty(value = "")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public TerminalModel partialApprovalCapable(String partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
    return this;
  }

   /**
   * Get partialApprovalCapable
   * @return partialApprovalCapable
  **/
  @ApiModelProperty(value = "")
  public String getPartialApprovalCapable() {
    return partialApprovalCapable;
  }

  public void setPartialApprovalCapable(String partialApprovalCapable) {
    this.partialApprovalCapable = partialApprovalCapable;
  }

  public TerminalModel cardholderPresence(String cardholderPresence) {
    this.cardholderPresence = cardholderPresence;
    return this;
  }

   /**
   * Get cardholderPresence
   * @return cardholderPresence
  **/
  @ApiModelProperty(value = "")
  public String getCardholderPresence() {
    return cardholderPresence;
  }

  public void setCardholderPresence(String cardholderPresence) {
    this.cardholderPresence = cardholderPresence;
  }

  public TerminalModel cardPresence(String cardPresence) {
    this.cardPresence = cardPresence;
    return this;
  }

   /**
   * Get cardPresence
   * @return cardPresence
  **/
  @ApiModelProperty(value = "")
  public String getCardPresence() {
    return cardPresence;
  }

  public void setCardPresence(String cardPresence) {
    this.cardPresence = cardPresence;
  }

  public TerminalModel channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public TerminalModel processingType(String processingType) {
    this.processingType = processingType;
    return this;
  }

   /**
   * Get processingType
   * @return processingType
  **/
  @ApiModelProperty(value = "")
  public String getProcessingType() {
    return processingType;
  }

  public void setProcessingType(String processingType) {
    this.processingType = processingType;
  }

  public TerminalModel pinPresent(String pinPresent) {
    this.pinPresent = pinPresent;
    return this;
  }

   /**
   * Get pinPresent
   * @return pinPresent
  **/
  @ApiModelProperty(value = "")
  public String getPinPresent() {
    return pinPresent;
  }

  public void setPinPresent(String pinPresent) {
    this.pinPresent = pinPresent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalModel terminalModel = (TerminalModel) o;
    return Objects.equals(this.tid, terminalModel.tid) &&
        Objects.equals(this.partialApprovalCapable, terminalModel.partialApprovalCapable) &&
        Objects.equals(this.cardholderPresence, terminalModel.cardholderPresence) &&
        Objects.equals(this.cardPresence, terminalModel.cardPresence) &&
        Objects.equals(this.channel, terminalModel.channel) &&
        Objects.equals(this.processingType, terminalModel.processingType) &&
        Objects.equals(this.pinPresent, terminalModel.pinPresent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, partialApprovalCapable, cardholderPresence, cardPresence, channel, processingType, pinPresent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalModel {\n");
    
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    partialApprovalCapable: ").append(toIndentedString(partialApprovalCapable)).append("\n");
    sb.append("    cardholderPresence: ").append(toIndentedString(cardholderPresence)).append("\n");
    sb.append("    cardPresence: ").append(toIndentedString(cardPresence)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    pinPresent: ").append(toIndentedString(pinPresent)).append("\n");
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

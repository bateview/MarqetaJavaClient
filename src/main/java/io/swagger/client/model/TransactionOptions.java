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
 * TransactionOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class TransactionOptions {
  @SerializedName("additional_data")
  private String additionalData = null;

  @SerializedName("database_transaction_timeout")
  private Integer databaseTransactionTimeout = null;

  @SerializedName("transaction_timeout_threshold_seconds")
  private Long transactionTimeoutThresholdSeconds = null;

  @SerializedName("pre_auth_time_limit")
  private String preAuthTimeLimit = null;

  @SerializedName("send_expiration_date")
  private Boolean sendExpirationDate = false;

  @SerializedName("send_track_data")
  private Boolean sendTrackData = false;

  @SerializedName("card_expiration_date_yymm")
  private String cardExpirationDateYymm = null;

  @SerializedName("encryption_key_id")
  private String encryptionKeyId = null;

  @SerializedName("transaction_token")
  private String transactionToken = null;

  @SerializedName("is_async")
  private Boolean isAsync = false;

  public TransactionOptions additionalData(String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }

  public TransactionOptions databaseTransactionTimeout(Integer databaseTransactionTimeout) {
    this.databaseTransactionTimeout = databaseTransactionTimeout;
    return this;
  }

   /**
   * Get databaseTransactionTimeout
   * @return databaseTransactionTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getDatabaseTransactionTimeout() {
    return databaseTransactionTimeout;
  }

  public void setDatabaseTransactionTimeout(Integer databaseTransactionTimeout) {
    this.databaseTransactionTimeout = databaseTransactionTimeout;
  }

  public TransactionOptions transactionTimeoutThresholdSeconds(Long transactionTimeoutThresholdSeconds) {
    this.transactionTimeoutThresholdSeconds = transactionTimeoutThresholdSeconds;
    return this;
  }

   /**
   * Get transactionTimeoutThresholdSeconds
   * @return transactionTimeoutThresholdSeconds
  **/
  @ApiModelProperty(value = "")
  public Long getTransactionTimeoutThresholdSeconds() {
    return transactionTimeoutThresholdSeconds;
  }

  public void setTransactionTimeoutThresholdSeconds(Long transactionTimeoutThresholdSeconds) {
    this.transactionTimeoutThresholdSeconds = transactionTimeoutThresholdSeconds;
  }

  public TransactionOptions preAuthTimeLimit(String preAuthTimeLimit) {
    this.preAuthTimeLimit = preAuthTimeLimit;
    return this;
  }

   /**
   * Get preAuthTimeLimit
   * @return preAuthTimeLimit
  **/
  @ApiModelProperty(value = "")
  public String getPreAuthTimeLimit() {
    return preAuthTimeLimit;
  }

  public void setPreAuthTimeLimit(String preAuthTimeLimit) {
    this.preAuthTimeLimit = preAuthTimeLimit;
  }

  public TransactionOptions sendExpirationDate(Boolean sendExpirationDate) {
    this.sendExpirationDate = sendExpirationDate;
    return this;
  }

   /**
   * Get sendExpirationDate
   * @return sendExpirationDate
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendExpirationDate() {
    return sendExpirationDate;
  }

  public void setSendExpirationDate(Boolean sendExpirationDate) {
    this.sendExpirationDate = sendExpirationDate;
  }

  public TransactionOptions sendTrackData(Boolean sendTrackData) {
    this.sendTrackData = sendTrackData;
    return this;
  }

   /**
   * Get sendTrackData
   * @return sendTrackData
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendTrackData() {
    return sendTrackData;
  }

  public void setSendTrackData(Boolean sendTrackData) {
    this.sendTrackData = sendTrackData;
  }

  public TransactionOptions cardExpirationDateYymm(String cardExpirationDateYymm) {
    this.cardExpirationDateYymm = cardExpirationDateYymm;
    return this;
  }

   /**
   * Get cardExpirationDateYymm
   * @return cardExpirationDateYymm
  **/
  @ApiModelProperty(value = "")
  public String getCardExpirationDateYymm() {
    return cardExpirationDateYymm;
  }

  public void setCardExpirationDateYymm(String cardExpirationDateYymm) {
    this.cardExpirationDateYymm = cardExpirationDateYymm;
  }

  public TransactionOptions encryptionKeyId(String encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
    return this;
  }

   /**
   * Get encryptionKeyId
   * @return encryptionKeyId
  **/
  @ApiModelProperty(value = "")
  public String getEncryptionKeyId() {
    return encryptionKeyId;
  }

  public void setEncryptionKeyId(String encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }

  public TransactionOptions transactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
    return this;
  }

   /**
   * Get transactionToken
   * @return transactionToken
  **/
  @ApiModelProperty(value = "")
  public String getTransactionToken() {
    return transactionToken;
  }

  public void setTransactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
  }

  public TransactionOptions isAsync(Boolean isAsync) {
    this.isAsync = isAsync;
    return this;
  }

   /**
   * Get isAsync
   * @return isAsync
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAsync() {
    return isAsync;
  }

  public void setIsAsync(Boolean isAsync) {
    this.isAsync = isAsync;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionOptions transactionOptions = (TransactionOptions) o;
    return Objects.equals(this.additionalData, transactionOptions.additionalData) &&
        Objects.equals(this.databaseTransactionTimeout, transactionOptions.databaseTransactionTimeout) &&
        Objects.equals(this.transactionTimeoutThresholdSeconds, transactionOptions.transactionTimeoutThresholdSeconds) &&
        Objects.equals(this.preAuthTimeLimit, transactionOptions.preAuthTimeLimit) &&
        Objects.equals(this.sendExpirationDate, transactionOptions.sendExpirationDate) &&
        Objects.equals(this.sendTrackData, transactionOptions.sendTrackData) &&
        Objects.equals(this.cardExpirationDateYymm, transactionOptions.cardExpirationDateYymm) &&
        Objects.equals(this.encryptionKeyId, transactionOptions.encryptionKeyId) &&
        Objects.equals(this.transactionToken, transactionOptions.transactionToken) &&
        Objects.equals(this.isAsync, transactionOptions.isAsync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, databaseTransactionTimeout, transactionTimeoutThresholdSeconds, preAuthTimeLimit, sendExpirationDate, sendTrackData, cardExpirationDateYymm, encryptionKeyId, transactionToken, isAsync);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionOptions {\n");
    
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    databaseTransactionTimeout: ").append(toIndentedString(databaseTransactionTimeout)).append("\n");
    sb.append("    transactionTimeoutThresholdSeconds: ").append(toIndentedString(transactionTimeoutThresholdSeconds)).append("\n");
    sb.append("    preAuthTimeLimit: ").append(toIndentedString(preAuthTimeLimit)).append("\n");
    sb.append("    sendExpirationDate: ").append(toIndentedString(sendExpirationDate)).append("\n");
    sb.append("    sendTrackData: ").append(toIndentedString(sendTrackData)).append("\n");
    sb.append("    cardExpirationDateYymm: ").append(toIndentedString(cardExpirationDateYymm)).append("\n");
    sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
    sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
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


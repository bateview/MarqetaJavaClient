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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * PushToCardDisbursementResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class PushToCardDisbursementResponse {
  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("payment_instrument_token")
  private String paymentInstrumentToken = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("memo")
  private String memo = null;

  public PushToCardDisbursementResponse createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public PushToCardDisbursementResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * yyyy-MM-ddTHH:mm:ssZ
   * @return lastModifiedTime
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddTHH:mm:ssZ")
  public OffsetDateTime getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public PushToCardDisbursementResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PushToCardDisbursementResponse token(String token) {
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

  public PushToCardDisbursementResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PushToCardDisbursementResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PushToCardDisbursementResponse paymentInstrumentToken(String paymentInstrumentToken) {
    this.paymentInstrumentToken = paymentInstrumentToken;
    return this;
  }

   /**
   * Get paymentInstrumentToken
   * @return paymentInstrumentToken
  **/
  @ApiModelProperty(value = "")
  public String getPaymentInstrumentToken() {
    return paymentInstrumentToken;
  }

  public void setPaymentInstrumentToken(String paymentInstrumentToken) {
    this.paymentInstrumentToken = paymentInstrumentToken;
  }

  public PushToCardDisbursementResponse tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public PushToCardDisbursementResponse memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushToCardDisbursementResponse pushToCardDisbursementResponse = (PushToCardDisbursementResponse) o;
    return Objects.equals(this.createdTime, pushToCardDisbursementResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, pushToCardDisbursementResponse.lastModifiedTime) &&
        Objects.equals(this.status, pushToCardDisbursementResponse.status) &&
        Objects.equals(this.token, pushToCardDisbursementResponse.token) &&
        Objects.equals(this.currencyCode, pushToCardDisbursementResponse.currencyCode) &&
        Objects.equals(this.amount, pushToCardDisbursementResponse.amount) &&
        Objects.equals(this.paymentInstrumentToken, pushToCardDisbursementResponse.paymentInstrumentToken) &&
        Objects.equals(this.tags, pushToCardDisbursementResponse.tags) &&
        Objects.equals(this.memo, pushToCardDisbursementResponse.memo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, lastModifiedTime, status, token, currencyCode, amount, paymentInstrumentToken, tags, memo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushToCardDisbursementResponse {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentInstrumentToken: ").append(toIndentedString(paymentInstrumentToken)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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


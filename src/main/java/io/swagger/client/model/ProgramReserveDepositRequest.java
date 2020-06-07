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

/**
 * ProgramReserveDepositRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramReserveDepositRequest {
  @SerializedName("idempotentHash")
  private String idempotentHash = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("tags")
  private String tags = null;

  public ProgramReserveDepositRequest idempotentHash(String idempotentHash) {
    this.idempotentHash = idempotentHash;
    return this;
  }

   /**
   * Get idempotentHash
   * @return idempotentHash
  **/
  @ApiModelProperty(value = "")
  public String getIdempotentHash() {
    return idempotentHash;
  }

  public void setIdempotentHash(String idempotentHash) {
    this.idempotentHash = idempotentHash;
  }

  public ProgramReserveDepositRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ProgramReserveDepositRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ProgramReserveDepositRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ProgramReserveDepositRequest memo(String memo) {
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

  public ProgramReserveDepositRequest tags(String tags) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramReserveDepositRequest programReserveDepositRequest = (ProgramReserveDepositRequest) o;
    return Objects.equals(this.idempotentHash, programReserveDepositRequest.idempotentHash) &&
        Objects.equals(this.token, programReserveDepositRequest.token) &&
        Objects.equals(this.amount, programReserveDepositRequest.amount) &&
        Objects.equals(this.currencyCode, programReserveDepositRequest.currencyCode) &&
        Objects.equals(this.memo, programReserveDepositRequest.memo) &&
        Objects.equals(this.tags, programReserveDepositRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotentHash, token, amount, currencyCode, memo, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramReserveDepositRequest {\n");
    
    sb.append("    idempotentHash: ").append(toIndentedString(idempotentHash)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


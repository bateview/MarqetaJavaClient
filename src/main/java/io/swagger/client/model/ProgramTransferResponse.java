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
import io.swagger.client.model.FeeDetail;
import io.swagger.client.model.JitFundingApi;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ProgramTransferResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class ProgramTransferResponse {
  @SerializedName("fees")
  private List<FeeDetail> fees = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("type_token")
  private String typeToken = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  @SerializedName("transaction_token")
  private String transactionToken = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("jit_funding")
  private JitFundingApi jitFunding = null;

  public ProgramTransferResponse fees(List<FeeDetail> fees) {
    this.fees = fees;
    return this;
  }

  public ProgramTransferResponse addFeesItem(FeeDetail feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<FeeDetail>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public List<FeeDetail> getFees() {
    return fees;
  }

  public void setFees(List<FeeDetail> fees) {
    this.fees = fees;
  }

  public ProgramTransferResponse token(String token) {
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

  public ProgramTransferResponse typeToken(String typeToken) {
    this.typeToken = typeToken;
    return this;
  }

   /**
   * Get typeToken
   * @return typeToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTypeToken() {
    return typeToken;
  }

  public void setTypeToken(String typeToken) {
    this.typeToken = typeToken;
  }

  public ProgramTransferResponse userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @ApiModelProperty(value = "")
  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public ProgramTransferResponse businessToken(String businessToken) {
    this.businessToken = businessToken;
    return this;
  }

   /**
   * Get businessToken
   * @return businessToken
  **/
  @ApiModelProperty(value = "")
  public String getBusinessToken() {
    return businessToken;
  }

  public void setBusinessToken(String businessToken) {
    this.businessToken = businessToken;
  }

  public ProgramTransferResponse transactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
    return this;
  }

   /**
   * Get transactionToken
   * @return transactionToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactionToken() {
    return transactionToken;
  }

  public void setTransactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
  }

  public ProgramTransferResponse currencyCode(String currencyCode) {
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

  public ProgramTransferResponse amount(BigDecimal amount) {
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

  public ProgramTransferResponse memo(String memo) {
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

  public ProgramTransferResponse tags(String tags) {
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

  public ProgramTransferResponse createdTime(OffsetDateTime createdTime) {
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

  public ProgramTransferResponse jitFunding(JitFundingApi jitFunding) {
    this.jitFunding = jitFunding;
    return this;
  }

   /**
   * Get jitFunding
   * @return jitFunding
  **/
  @ApiModelProperty(value = "")
  public JitFundingApi getJitFunding() {
    return jitFunding;
  }

  public void setJitFunding(JitFundingApi jitFunding) {
    this.jitFunding = jitFunding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramTransferResponse programTransferResponse = (ProgramTransferResponse) o;
    return Objects.equals(this.fees, programTransferResponse.fees) &&
        Objects.equals(this.token, programTransferResponse.token) &&
        Objects.equals(this.typeToken, programTransferResponse.typeToken) &&
        Objects.equals(this.userToken, programTransferResponse.userToken) &&
        Objects.equals(this.businessToken, programTransferResponse.businessToken) &&
        Objects.equals(this.transactionToken, programTransferResponse.transactionToken) &&
        Objects.equals(this.currencyCode, programTransferResponse.currencyCode) &&
        Objects.equals(this.amount, programTransferResponse.amount) &&
        Objects.equals(this.memo, programTransferResponse.memo) &&
        Objects.equals(this.tags, programTransferResponse.tags) &&
        Objects.equals(this.createdTime, programTransferResponse.createdTime) &&
        Objects.equals(this.jitFunding, programTransferResponse.jitFunding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees, token, typeToken, userToken, businessToken, transactionToken, currencyCode, amount, memo, tags, createdTime, jitFunding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramTransferResponse {\n");
    
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    typeToken: ").append(toIndentedString(typeToken)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    jitFunding: ").append(toIndentedString(jitFunding)).append("\n");
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

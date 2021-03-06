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
import io.swagger.client.model.Funding;
import io.swagger.client.model.MsaAggregatedBalances;
import io.swagger.client.model.MsaBalances;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * MsaOrderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-07T21:08:00.979Z")
public class MsaOrderResponse {
  @SerializedName("token")
  private String token = null;

  @SerializedName("user_token")
  private String userToken = null;

  @SerializedName("business_token")
  private String businessToken = null;

  @SerializedName("order_balances")
  private MsaBalances orderBalances = null;

  @SerializedName("purchase_amount")
  private BigDecimal purchaseAmount = null;

  @SerializedName("last_transaction_date")
  private OffsetDateTime lastTransactionDate = null;

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  @SerializedName("end_date")
  private OffsetDateTime endDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("reward_amount")
  private BigDecimal rewardAmount = null;

  @SerializedName("reward_trigger_amount")
  private BigDecimal rewardTriggerAmount = null;

  @SerializedName("unloaded_amount")
  private BigDecimal unloadedAmount = null;

  @SerializedName("campaign_token")
  private String campaignToken = null;

  @SerializedName("funding")
  private Funding funding = null;

  @SerializedName("created_time")
  private OffsetDateTime createdTime = null;

  @SerializedName("last_modified_time")
  private OffsetDateTime lastModifiedTime = null;

  @SerializedName("aggregated_balances")
  private MsaAggregatedBalances aggregatedBalances = null;

  @SerializedName("transaction_token")
  private String transactionToken = null;

  public MsaOrderResponse token(String token) {
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

  public MsaOrderResponse userToken(String userToken) {
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

  public MsaOrderResponse businessToken(String businessToken) {
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

  public MsaOrderResponse orderBalances(MsaBalances orderBalances) {
    this.orderBalances = orderBalances;
    return this;
  }

   /**
   * Get orderBalances
   * @return orderBalances
  **/
  @ApiModelProperty(required = true, value = "")
  public MsaBalances getOrderBalances() {
    return orderBalances;
  }

  public void setOrderBalances(MsaBalances orderBalances) {
    this.orderBalances = orderBalances;
  }

  public MsaOrderResponse purchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * Get purchaseAmount
   * @return purchaseAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public MsaOrderResponse lastTransactionDate(OffsetDateTime lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

   /**
   * yyyy-MM-ddThh:mm:ssZ
   * @return lastTransactionDate
  **/
  @ApiModelProperty(required = true, value = "yyyy-MM-ddThh:mm:ssZ")
  public OffsetDateTime getLastTransactionDate() {
    return lastTransactionDate;
  }

  public void setLastTransactionDate(OffsetDateTime lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
  }

  public MsaOrderResponse startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * yyyy-MM-ddThh:mm:ssZ
   * @return startDate
  **/
  @ApiModelProperty(value = "yyyy-MM-ddThh:mm:ssZ")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public MsaOrderResponse endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * yyyy-MM-ddThh:mm:ssZ
   * @return endDate
  **/
  @ApiModelProperty(value = "yyyy-MM-ddThh:mm:ssZ")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public MsaOrderResponse currencyCode(String currencyCode) {
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

  public MsaOrderResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public MsaOrderResponse rewardAmount(BigDecimal rewardAmount) {
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * Get rewardAmount
   * @return rewardAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRewardAmount() {
    return rewardAmount;
  }

  public void setRewardAmount(BigDecimal rewardAmount) {
    this.rewardAmount = rewardAmount;
  }

  public MsaOrderResponse rewardTriggerAmount(BigDecimal rewardTriggerAmount) {
    this.rewardTriggerAmount = rewardTriggerAmount;
    return this;
  }

   /**
   * Get rewardTriggerAmount
   * @return rewardTriggerAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRewardTriggerAmount() {
    return rewardTriggerAmount;
  }

  public void setRewardTriggerAmount(BigDecimal rewardTriggerAmount) {
    this.rewardTriggerAmount = rewardTriggerAmount;
  }

  public MsaOrderResponse unloadedAmount(BigDecimal unloadedAmount) {
    this.unloadedAmount = unloadedAmount;
    return this;
  }

   /**
   * Get unloadedAmount
   * @return unloadedAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnloadedAmount() {
    return unloadedAmount;
  }

  public void setUnloadedAmount(BigDecimal unloadedAmount) {
    this.unloadedAmount = unloadedAmount;
  }

  public MsaOrderResponse campaignToken(String campaignToken) {
    this.campaignToken = campaignToken;
    return this;
  }

   /**
   * Get campaignToken
   * @return campaignToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCampaignToken() {
    return campaignToken;
  }

  public void setCampaignToken(String campaignToken) {
    this.campaignToken = campaignToken;
  }

  public MsaOrderResponse funding(Funding funding) {
    this.funding = funding;
    return this;
  }

   /**
   * Get funding
   * @return funding
  **/
  @ApiModelProperty(required = true, value = "")
  public Funding getFunding() {
    return funding;
  }

  public void setFunding(Funding funding) {
    this.funding = funding;
  }

  public MsaOrderResponse createdTime(OffsetDateTime createdTime) {
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

  public MsaOrderResponse lastModifiedTime(OffsetDateTime lastModifiedTime) {
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

  public MsaOrderResponse aggregatedBalances(MsaAggregatedBalances aggregatedBalances) {
    this.aggregatedBalances = aggregatedBalances;
    return this;
  }

   /**
   * Get aggregatedBalances
   * @return aggregatedBalances
  **/
  @ApiModelProperty(required = true, value = "")
  public MsaAggregatedBalances getAggregatedBalances() {
    return aggregatedBalances;
  }

  public void setAggregatedBalances(MsaAggregatedBalances aggregatedBalances) {
    this.aggregatedBalances = aggregatedBalances;
  }

  public MsaOrderResponse transactionToken(String transactionToken) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsaOrderResponse msaOrderResponse = (MsaOrderResponse) o;
    return Objects.equals(this.token, msaOrderResponse.token) &&
        Objects.equals(this.userToken, msaOrderResponse.userToken) &&
        Objects.equals(this.businessToken, msaOrderResponse.businessToken) &&
        Objects.equals(this.orderBalances, msaOrderResponse.orderBalances) &&
        Objects.equals(this.purchaseAmount, msaOrderResponse.purchaseAmount) &&
        Objects.equals(this.lastTransactionDate, msaOrderResponse.lastTransactionDate) &&
        Objects.equals(this.startDate, msaOrderResponse.startDate) &&
        Objects.equals(this.endDate, msaOrderResponse.endDate) &&
        Objects.equals(this.currencyCode, msaOrderResponse.currencyCode) &&
        Objects.equals(this.active, msaOrderResponse.active) &&
        Objects.equals(this.rewardAmount, msaOrderResponse.rewardAmount) &&
        Objects.equals(this.rewardTriggerAmount, msaOrderResponse.rewardTriggerAmount) &&
        Objects.equals(this.unloadedAmount, msaOrderResponse.unloadedAmount) &&
        Objects.equals(this.campaignToken, msaOrderResponse.campaignToken) &&
        Objects.equals(this.funding, msaOrderResponse.funding) &&
        Objects.equals(this.createdTime, msaOrderResponse.createdTime) &&
        Objects.equals(this.lastModifiedTime, msaOrderResponse.lastModifiedTime) &&
        Objects.equals(this.aggregatedBalances, msaOrderResponse.aggregatedBalances) &&
        Objects.equals(this.transactionToken, msaOrderResponse.transactionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, userToken, businessToken, orderBalances, purchaseAmount, lastTransactionDate, startDate, endDate, currencyCode, active, rewardAmount, rewardTriggerAmount, unloadedAmount, campaignToken, funding, createdTime, lastModifiedTime, aggregatedBalances, transactionToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsaOrderResponse {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    businessToken: ").append(toIndentedString(businessToken)).append("\n");
    sb.append("    orderBalances: ").append(toIndentedString(orderBalances)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardTriggerAmount: ").append(toIndentedString(rewardTriggerAmount)).append("\n");
    sb.append("    unloadedAmount: ").append(toIndentedString(unloadedAmount)).append("\n");
    sb.append("    campaignToken: ").append(toIndentedString(campaignToken)).append("\n");
    sb.append("    funding: ").append(toIndentedString(funding)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    aggregatedBalances: ").append(toIndentedString(aggregatedBalances)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
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

